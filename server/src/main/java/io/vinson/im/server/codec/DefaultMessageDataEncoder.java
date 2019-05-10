package io.vinson.im.server.codec;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * @author: jiangweixin
 * @date: 2019/5/10
 */
public class DefaultMessageDataEncoder extends MessageToMessageEncoder<MessageData> implements MessageDataEncoder {
    @Override
    protected void encode(ChannelHandlerContext ctx, MessageData msg, List<Object> out) throws Exception {
        out.add(msg);
    }
}
