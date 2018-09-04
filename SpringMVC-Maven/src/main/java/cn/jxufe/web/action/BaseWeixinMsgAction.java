package cn.jxufe.web.action;

import cn.jxufe.web.pojo.BaseWeixinPlatformRequest;
import cn.jxufe.web.pojo.BaseWeixinPlatformResponse;

public abstract class BaseWeixinMsgAction {
	/**
	 * 业务逻辑
	 * @param requestPojo
	 * @return
	 */
	public abstract BaseWeixinPlatformResponse execute(BaseWeixinPlatformRequest requestPojo);
}
