package com.waze;

import android.telephony.TelephonyCallback;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class s extends TelephonyCallback implements TelephonyCallback.CallStateListener {
    public final void onCallStateChanged(int i2) {
        com.waze.shared_infra.i.h.h("EndCallListener: onCallStateChanged: " + i2);
        if (i2 == 2 && com.waze.system.c.b()) {
            t.h();
        }
    }
}
