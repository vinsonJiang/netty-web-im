package io.vinson.im.server.codec;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * @author: jiangweixin
 * @date: 2019/5/9
 */
public class DefaultMessageData extends MessageData {

    private final int cmd;

    private final byte[] buf;

    public DefaultMessageData(int cmd, byte[] buf, ByteBuf content) {
        super(content);
        this.cmd = cmd;
        this.buf = buf;
    }

    public DefaultMessageData(int cmd, byte[] buf) {
        this(cmd, buf, Unpooled.buffer(0));
    }
}
