package com.ict.erp.ws;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ict.erp.controller.HomeController;

@ServerEndpoint(value="/wstest")
public class WebSocket {

	private static final Logger logger = LoggerFactory.getLogger(WebSocket.class);
	private final static List<Session> SS_LIST = 
			Collections.synchronizedList(new ArrayList<Session>());
	private final static List<String> STR_LIST = 
			Collections.synchronizedList(new ArrayList<String>());
	private final static String ROCK = "1"; //바위
	private final static String SIZER = "2"; //가위
	private final static String PAPER = "3"; // 보
	@OnOpen
	public void onOpen(Session ss) throws IOException {
		SS_LIST.add(ss);
		logger.info("OPEN WebSocket Sessio ID : {}",ss.getId());
	}
	@OnClose
	public void onClose(Session ss) {
		SS_LIST.remove(ss);
		logger.info("CLOSE WebSocket Sessio ID : {}",ss.getId());
	}
	@OnError
	public void onError(Throwable e) {
		
	}
	@OnMessage
	public void onMessage(String msg, Session ss) throws IOException {
		synchronized (SS_LIST) {
			STR_LIST.add(msg);
			if(STR_LIST.size()==SS_LIST.size()) {
				if(STR_LIST.get(0).equals(STR_LIST.get(1))) {
					msg = STR_LIST.get(0) + " vs " + STR_LIST.get(1) + "비김";
				}else {
					if(STR_LIST.get(0).equals("1")) {
						
					}
				}
				for(Session s:SS_LIST) {
					if(s!=ss) {
						s.getBasicRemote().sendText(msg);
					}
				}
			}
		}
	}
}
