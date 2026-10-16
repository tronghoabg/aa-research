package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import cb.AbstractC1593a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes3.dex */
public final class W extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f26497a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x5, Looper looper) {
        super(looper);
        this.f26497a = x5;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i5 = message.what;
        if (i5 != 0) {
            if (i5 != 1) {
                AbstractC1593a.q(i5, "TransformationResultHandler received unknown message type: ", "TransformedResultImpl");
                return;
            } else {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
        }
        com.google.android.gms.common.api.r rVar = (com.google.android.gms.common.api.r) message.obj;
        synchronized (this.f26497a.f26499b) {
            try {
                X x5 = this.f26497a.f26498a;
                AbstractC1732v.i(x5);
                if (rVar == null) {
                    x5.c(new Status(13, "Transform returned null", null, null));
                } else {
                    x5.b(rVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
