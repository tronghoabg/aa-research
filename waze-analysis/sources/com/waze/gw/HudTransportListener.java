package com.waze.gw;

/* compiled from: HudTransport.java */
/* loaded from: classes10.dex */
interface HudTransportListener {
    void onTransportBytes(byte[] bArr, int i2);

    void onTransportConnected();

    void onTransportDisconnected(String str);

    void onTransportError(String str, Throwable th);
}
