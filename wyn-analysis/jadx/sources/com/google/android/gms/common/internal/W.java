package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class W implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f26629a;

    public /* synthetic */ W(X x5) {
        Objects.requireNonNull(x5);
        this.f26629a = x5;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i5 = message.what;
        if (i5 == 0) {
            X x5 = this.f26629a;
            synchronized (x5.f26630d) {
                try {
                    U u10 = (U) message.obj;
                    V v2 = (V) x5.f26630d.get(u10);
                    if (v2 != null && v2.f26622a.isEmpty()) {
                        if (v2.f26624c) {
                            U u11 = v2.f26626e;
                            X x10 = v2.f26628g;
                            x10.f26632f.removeMessages(1, u11);
                            x10.f26633g.c(x10.f26631e, v2);
                            v2.f26624c = false;
                            v2.f26623b = 2;
                        }
                        x5.f26630d.remove(u10);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i5 != 1) {
            return false;
        }
        X x11 = this.f26629a;
        synchronized (x11.f26630d) {
            try {
                U u12 = (U) message.obj;
                V v10 = (V) x11.f26630d.get(u12);
                if (v10 != null && v10.f26623b == 3) {
                    String strValueOf = String.valueOf(u12);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentName = v10.f26627f;
                    if (componentName == null) {
                        componentName = u12.f26620c;
                    }
                    if (componentName == null) {
                        String str = u12.f26619b;
                        AbstractC1732v.i(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    v10.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
