package io.vinson.im.server.socket;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.vinson.im.server.codec.MessageData;

/**
 * @author: jiangweixin
 * @date: 2019/5/9
 */
public class MessageSocketHandler extends SimpleChannelInboundHandler<MessageData> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessageData msg) throws Exception {

    }
}
