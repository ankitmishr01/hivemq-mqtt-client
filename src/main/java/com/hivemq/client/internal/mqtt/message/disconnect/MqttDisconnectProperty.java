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

package com.hivemq.client.internal.mqtt.message.disconnect;

import com.hivemq.client.internal.mqtt.message.MqttProperty;

/**
 * All possible MQTT DISCONNECT properties and its byte code according to the MQTT 5 specification.
 *
 * @author Silvio Giebl
 */
public interface MqttDisconnectProperty {

    int SESSION_EXPIRY_INTERVAL = MqttProperty.SESSION_EXPIRY_INTERVAL;
    int SERVER_REFERENCE = MqttProperty.SERVER_REFERENCE;
    int REASON_STRING = MqttProperty.REASON_STRING;
    int USER_PROPERTY = MqttProperty.USER_PROPERTY;

}
