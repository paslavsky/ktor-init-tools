/*
 * Copyright 2018 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.ktor.start.features.both

import io.ktor.start.*
import io.ktor.start.project.*

object RawSocketsTlsFeature : ServerFeature(ApplicationKt, RawSocketsFeature) {
    override val group = "Sockets"

    override val repos = Repos.ktor
    override val id = "ktor-network-tls"
    override val title = "Raw Secure SSL/TLS Sockets"
    override val description =
        "Adds Raw Socket support for listening and connecting to tcp and udp sockets with secure sockets"
    override val documentation = "https://ktor.io/servers/raw-sockets.html#secure"
}