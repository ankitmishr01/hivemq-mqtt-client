package org.mqttbee.mqtt5.codec.encoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.mqttbee.annotations.NotNull;
import org.mqttbee.mqtt5.message.publish.Mqtt5PublishInternal;

import javax.inject.Singleton;

/**
 * @author Silvio Giebl
 */
@Singleton
public class Mqtt5PublishEncoder implements Mqtt5MessageEncoder<Mqtt5PublishInternal> {

    public void encode(
            @NotNull final Mqtt5PublishInternal publish, @NotNull final Channel channel, @NotNull final ByteBuf out) {

    }

}