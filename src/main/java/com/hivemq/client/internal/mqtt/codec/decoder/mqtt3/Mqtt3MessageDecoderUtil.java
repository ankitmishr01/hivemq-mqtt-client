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

package com.hivemq.client.internal.mqtt.codec.decoder.mqtt3;

import com.hivemq.client.internal.mqtt.codec.decoder.MqttDecoderException;
import org.jetbrains.annotations.NotNull;

/**
 * Util for decoders for MQTT 3 messages.
 *
 * @author Silvio Giebl
 */
class Mqtt3MessageDecoderUtil {

    private Mqtt3MessageDecoderUtil() {}

    static @NotNull MqttDecoderException wrongReturnCode() {
        return new MqttDecoderException("wrong return code");
    }
}
