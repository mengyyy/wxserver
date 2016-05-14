package cn.saymagic.weixin.server.handler;

import java.io.IOException;
import java.util.Date;

import cn.saymagic.weixin.server.bean.MsgRequest;
import cn.saymagic.weixin.server.util.TulingUtil;



public class TextHandler extends BaseHandler {

	@Override
	public String doHandleMsg(MsgRequest msgRequest) {
			return getResponseStringByContent("TextHandler.java ——IOException ",msgRequest);
	}

}
