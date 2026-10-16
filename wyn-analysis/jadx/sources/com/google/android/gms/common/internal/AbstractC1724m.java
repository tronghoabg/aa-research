package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1724m {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f26673a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static X f26674b;

    /* renamed from: c, reason: collision with root package name */
    public static HandlerThread f26675c;

    public static X a(Context context) {
        synchronized (f26673a) {
            try {
                if (f26674b == null) {
                    f26674b = new X(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f26674b;
    }

    public static HandlerThread b() {
        synchronized (f26673a) {
            try {
                HandlerThread handlerThread = f26675c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f26675c = handlerThread2;
                handlerThread2.start();
                return f26675c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract d7.b c(U u10, ServiceConnection serviceConnection, String str, Executor executor);

    public abstract void d(U u10, ServiceConnection serviceConnection);
}
