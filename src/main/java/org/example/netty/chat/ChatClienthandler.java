package org.example.netty.chat;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class ChatClienthandler extends ChannelHandlerAdapter {
	
       

	@Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		ctx.fireChannelRead(msg);
        System.out.println((String)msg);
    }

}
