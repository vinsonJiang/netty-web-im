package io.vinson.im.server.codec;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.DefaultByteBufHolder;

/**
 * 自定义协议类型
 * @author: jiangweixin
 * @date: 2019/5/9
 */
public abstract class MessageData extends DefaultByteBufHolder {
    public MessageData(ByteBuf data) {
        super(data);
    }
}
