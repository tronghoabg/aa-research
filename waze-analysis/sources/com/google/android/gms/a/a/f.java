package com.google.android.gms.a.a;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.az;
import com.google.android.gms.common.internal.b.k;
import com.google.android.gms.common.internal.bi;
import com.google.android.gms.common.internal.bj;
import com.google.android.gms.common.internal.bk;
import com.google.android.gms.o.m;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f4390a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f4391b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f4392c = new AtomicLong(-1);

    /* renamed from: d, reason: collision with root package name */
    private final k f4393d;

    private f(Context context) {
        bj bjVarB = bk.b();
        bjVarB.b();
        this.f4393d = new k(context, bjVarB.a());
    }

    public static f a(Context context) {
        if (f4390a == null) {
            synchronized (f4391b) {
                if (f4390a == null) {
                    f4390a = new f(context);
                }
            }
        }
        return f4390a;
    }

    public static /* synthetic */ void b(f fVar, long j2, Exception exc) {
        com.google.android.gms.common.d dVarB;
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof i) && (dVarB = ((i) exc).b().b()) != null && dVarB.a() == 24) {
            fVar.f4392c.set(j2);
        }
    }

    public final synchronized void c(int i2, long j2, long j3, int i3) {
        AtomicLong atomicLong = this.f4392c;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        this.f4393d.a(new bi(0, Arrays.asList(new az(35401, i2, 0, j2, j3, null, null, 0, i3)))).o(new m() { // from class: com.google.android.gms.a.a.e
            @Override // com.google.android.gms.o.m
            public final void onFailure(Exception exc) {
                f.b(this.f4388a, jElapsedRealtime, exc);
            }
        });
    }
}
