package com.waze.gw;

/* loaded from: classes10.dex */
interface HudProtocolSession {
    void accept(byte[] bArr, int i2);

    boolean isReady();

    void prepare();

    String protocolName();

    void startHandshake();

    void stop();

    void tick(long j2, HudCanonicalState hudCanonicalState);
}
