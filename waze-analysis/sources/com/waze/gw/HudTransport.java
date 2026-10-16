package com.waze.gw;

import java.io.IOException;

/* loaded from: classes10.dex */
interface HudTransport {
    void connect() throws Exception;

    void disconnect();

    boolean isConnected();

    void sendFrame(byte[] bArr) throws IOException;

    void setListener(HudTransportListener hudTransportListener);

    String transportName();
}
