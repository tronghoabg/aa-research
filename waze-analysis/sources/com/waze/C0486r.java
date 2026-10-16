package com.waze;

import android.telephony.PhoneStateListener;

/* compiled from: WazeSource */
/* renamed from: com.waze.r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0486r extends PhoneStateListener {
    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i2, String str) {
        com.waze.shared_infra.i.h.h("EndCallListener: onCallStateChanged: " + i2);
        if (i2 == 2 && com.waze.system.c.b()) {
            t.h();
        }
    }
}
