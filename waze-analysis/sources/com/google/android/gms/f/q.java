package com.google.android.gms.f;

import android.os.Bundle;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class q {

    /* renamed from: a, reason: collision with root package name */
    final int f5246a;

    /* renamed from: b, reason: collision with root package name */
    final com.google.android.gms.o.w f5247b = new com.google.android.gms.o.w();

    /* renamed from: c, reason: collision with root package name */
    final int f5248c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f5249d;

    q(int i2, int i3, Bundle bundle) {
        this.f5246a = i2;
        this.f5248c = i3;
        this.f5249d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(r rVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + rVar.toString());
        }
        this.f5247b.b(rVar);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f5247b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f5248c + " id=" + this.f5246a + " oneWay=" + b() + "}";
    }
}
