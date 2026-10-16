package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class q extends com.waze.native_managers.j {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.aa aaVar = (com.google.android.gms.common.api.aa) pair.second;
            try {
                throw null;
            } catch (RuntimeException e2) {
                BasePendingResult.i(aaVar);
                throw e2;
            }
        }
        if (i2 == 2) {
            ((BasePendingResult) message.obj).g(Status.f4689d);
            return;
        }
        Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
    }
}
