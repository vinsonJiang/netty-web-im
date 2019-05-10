package io.vinson.im.server.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * @author: jiangweixin
 * @date: 2019/5/10
 */
public class DefaultMessageDataDecoder extends ByteToMessageDecoder implements MessageDataDecoder {

    public static final int MAX_MSG_LENGTH = 1024;

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
        int length = msg.readableBytes();
        if(length == MAX_MSG_LENGTH || length < 4) {
            return;
        }
        int cmd = msg.readInt();
        int dataLength = length - 4;
        byte[] data = null;
        if(dataLength > 0) {
            data = new byte[dataLength];
            msg.readBytes(data);
        }

        MessageData messageData = new DefaultMessageData(cmd, data);
        out.add(messageData);
    }
}
