package io.vinson.im.core.netty.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: jiangweixin
 * @date: 2019/4/18
 */
public abstract class AbstractChannelInboundHandler extends ChannelInboundHandlerAdapter {
    private static Logger logger = LoggerFactory.getLogger(AbstractChannelInboundHandler.class);

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        boolean release = true;

        channelRead0(ctx, msg);
    }

    protected abstract void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception;
}
