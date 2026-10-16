package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.util.HashMap;
import java.util.concurrent.Executor;
import m7.C3493a;

/* loaded from: classes3.dex */
public final class X extends AbstractC1724m {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f26630d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Context f26631e;

    /* renamed from: f, reason: collision with root package name */
    public volatile zzg f26632f;

    /* renamed from: g, reason: collision with root package name */
    public final C3493a f26633g;

    /* renamed from: h, reason: collision with root package name */
    public final long f26634h;

    /* renamed from: i, reason: collision with root package name */
    public final long f26635i;

    public X(Context context, Looper looper) {
        W w2 = new W(this);
        this.f26631e = context.getApplicationContext();
        this.f26632f = new zzg(looper, w2);
        this.f26633g = C3493a.b();
        this.f26634h = 5000L;
        this.f26635i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1724m
    public final d7.b c(U u10, ServiceConnection serviceConnection, String str, Executor executor) {
        d7.b bVarA;
        HashMap map = this.f26630d;
        synchronized (map) {
            try {
                V v2 = (V) map.get(u10);
                if (executor == null) {
                    executor = null;
                }
                if (v2 == null) {
                    v2 = new V(this, u10);
                    v2.f26622a.put(serviceConnection, serviceConnection);
                    bVarA = v2.a(str, executor);
                    map.put(u10, v2);
                } else {
                    this.f26632f.removeMessages(0, u10);
                    if (v2.f26622a.containsKey(serviceConnection)) {
                        String string = u10.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    v2.f26622a.put(serviceConnection, serviceConnection);
                    int i5 = v2.f26623b;
                    if (i5 == 1) {
                        serviceConnection.onServiceConnected(v2.f26627f, v2.f26625d);
                    } else if (i5 == 2) {
                        bVarA = v2.a(str, executor);
                    }
                    bVarA = null;
                }
                if (v2.f26624c) {
                    return d7.b.f34113f;
                }
                if (bVarA == null) {
                    bVarA = new d7.b(-1, null, null);
                }
                return bVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1724m
    public final void d(U u10, ServiceConnection serviceConnection) {
        AbstractC1732v.j(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f26630d;
        synchronized (map) {
            try {
                V v2 = (V) map.get(u10);
                if (v2 == null) {
                    String string = u10.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!v2.f26622a.containsKey(serviceConnection)) {
                    String string2 = u10.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                v2.f26622a.remove(serviceConnection);
                if (v2.f26622a.isEmpty()) {
                    this.f26632f.sendMessageDelayed(this.f26632f.obtainMessage(0, u10), this.f26634h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
