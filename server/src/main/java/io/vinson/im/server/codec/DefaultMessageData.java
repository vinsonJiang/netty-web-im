package io.vinson.im.server.codec;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * @author: jiangweixin
 * @date: 2019/5/9
 */
public class DefaultMessageData extends MessageData {
    public DefaultMessageData() {
        super(Unpooled.buffer(0));
    }
}
