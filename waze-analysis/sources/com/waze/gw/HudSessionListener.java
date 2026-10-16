package com.waze.gw;

/* loaded from: classes10.dex */
interface HudSessionListener {
    void onSessionConnected(String str, int i2);

    void onSessionDisconnected(String str);

    void onSessionError(String str, String str2);

    void onSessionPeerActivity(String str, long j2);

    void onSessionWantsDisconnect();
}
