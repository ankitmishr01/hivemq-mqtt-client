/*
 * Copyright 2018 The HiveMQ MQTT Client Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hivemq.client.internal.mqtt.netty;

import dagger.Module;
import dagger.Provides;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.jetbrains.annotations.NotNull;

import javax.inject.Singleton;

/**
 * @author Silvio Giebl
 */
@Module
public abstract class NettyModule {

    @Provides
    @Singleton
    static @NotNull NettyEventLoopProvider provideNettyEventLoopProvider() {
        if (Epoll.isAvailable()) {
            return new NettyEventLoopProvider(EpollEventLoopGroup::new, EpollSocketChannel::new);
        } else {
            return new NettyEventLoopProvider(NioEventLoopGroup::new, NioSocketChannel::new);
        }
    }
}
