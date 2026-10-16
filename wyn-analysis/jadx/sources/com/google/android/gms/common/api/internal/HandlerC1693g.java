package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzcjh;
import com.google.android.gms.internal.base.zau;
import ka.AbstractC3256n;

/* renamed from: com.google.android.gms.common.api.internal.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC1693g extends zau {
    public final void a(com.google.android.gms.common.api.u uVar, com.google.android.gms.common.api.t tVar) {
        int i5 = BasePendingResult.zad;
        AbstractC1732v.i(uVar);
        sendMessage(obtainMessage(1, new Pair(uVar, tVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i5 = message.what;
        if (i5 != 1) {
            if (i5 != 2) {
                Log.wtf("BasePendingResult", AbstractC3256n.g(i5, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f26427h);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        com.google.android.gms.common.api.u uVar = (com.google.android.gms.common.api.u) pair.first;
        com.google.android.gms.common.api.t tVar = (com.google.android.gms.common.api.t) pair.second;
        try {
            X x5 = (X) uVar;
            synchronized (x5.f26499b) {
                if (!tVar.getStatus().V()) {
                    x5.c(tVar.getStatus());
                    if (tVar instanceof zzcjh) {
                        try {
                            ((zzcjh) tVar).release();
                        } catch (RuntimeException e7) {
                            Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(tVar)), e7);
                        }
                    }
                }
            }
        } catch (RuntimeException e10) {
            BasePendingResult.zal(tVar);
            throw e10;
        }
    }
}
