package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    static HandlerThread f4972a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f4973b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4974c = false;

    /* renamed from: l, reason: collision with root package name */
    private static aj f4975l;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f4976d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f4977e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Handler f4978f;

    /* renamed from: g, reason: collision with root package name */
    private final al f4979g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.common.c.a f4980h;

    /* renamed from: i, reason: collision with root package name */
    private final long f4981i;

    /* renamed from: j, reason: collision with root package name */
    private final long f4982j;

    /* renamed from: k, reason: collision with root package name */
    private volatile Executor f4983k;

    aj(Context context, Looper looper) {
        this.f4976d = new HashMap();
        al alVar = new al(this);
        this.f4979g = alVar;
        this.f4977e = context.getApplicationContext();
        this.f4978f = new com.waze.native_managers.j(looper, alVar);
        this.f4980h = com.google.android.gms.common.c.a.a();
        this.f4981i = 5000L;
        this.f4982j = 300000L;
        this.f4983k = null;
    }

    public static HandlerThread a() {
        synchronized (f4973b) {
            HandlerThread handlerThread = f4972a;
            if (handlerThread != null && handlerThread.isAlive()) {
                return f4972a;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f4972a = handlerThread2;
            handlerThread2.start();
            return f4972a;
        }
    }

    public static aj b(Context context) {
        aj ajVar;
        synchronized (f4973b) {
            ajVar = f4975l;
            if (ajVar == null) {
                if (!f4974c) {
                    f4974c = ah.a(context.getPackageName());
                }
                ajVar = new aj(context.getApplicationContext(), f4974c ? a().getLooper() : context.getMainLooper());
                f4975l = ajVar;
            }
        }
        return ajVar;
    }

    protected final com.google.android.gms.common.d c(ai aiVar, ServiceConnection serviceConnection, String str, Executor executor) {
        HashMap map = this.f4976d;
        synchronized (map) {
            ak akVar = (ak) map.get(aiVar);
            com.google.android.gms.common.d dVarD = null;
            if (executor == null) {
                executor = null;
            }
            if (akVar == null) {
                akVar = new ak(this, aiVar);
                akVar.h(serviceConnection, serviceConnection);
                dVarD = ak.d(akVar, str, executor);
                map.put(aiVar, akVar);
            } else {
                this.f4978f.removeMessages(0, aiVar);
                if (akVar.e(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + aiVar.toString());
                }
                akVar.h(serviceConnection, serviceConnection);
                int iA = akVar.a();
                if (iA == 1) {
                    serviceConnection.onServiceConnected(akVar.b(), akVar.c());
                } else if (iA == 2) {
                    dVarD = ak.d(akVar, str, executor);
                }
            }
            if (akVar.g()) {
                return com.google.android.gms.common.d.f4926a;
            }
            if (dVarD == null) {
                dVarD = new com.google.android.gms.common.d(-1);
            }
            return dVarD;
        }
    }

    protected final void i(ai aiVar, ServiceConnection serviceConnection) {
        HashMap map = this.f4976d;
        synchronized (map) {
            ak akVar = (ak) map.get(aiVar);
            if (akVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + aiVar.toString());
            }
            if (!akVar.e(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + aiVar.toString());
            }
            akVar.i(serviceConnection);
            if (akVar.f()) {
                this.f4978f.sendMessageDelayed(this.f4978f.obtainMessage(0, aiVar), this.f4981i);
            }
        }
    }

    public aj() {
        throw null;
    }
}
