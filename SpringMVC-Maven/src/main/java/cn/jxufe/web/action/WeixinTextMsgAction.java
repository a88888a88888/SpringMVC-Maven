package cn.jxufe.web.action;

import cn.jxufe.web.pojo.BaseWeixinPlatformRequest;
import cn.jxufe.web.pojo.BaseWeixinPlatformResponse;
import cn.jxufe.web.pojo.WeixinTextMsgRequest;
import cn.jxufe.web.pojo.WeixinTextMsgResponse;

/**
 * 文本消息处理Action
 * @author zhaopeidong
 *
 */
public class WeixinTextMsgAction extends BaseWeixinMsgAction{

	@Override
	public BaseWeixinPlatformResponse execute(BaseWeixinPlatformRequest requestPojo) {
		String content = ((WeixinTextMsgRequest) requestPojo).getContext();
		return new WeixinTextMsgResponse("I got : " + content, (WeixinTextMsgRequest) requestPojo);
	}
}
