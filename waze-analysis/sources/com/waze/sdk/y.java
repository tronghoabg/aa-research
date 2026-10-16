package com.waze.sdk;

import android.os.Handler;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f35435a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f35436b;

    /* renamed from: c, reason: collision with root package name */
    private long f35437c;

    /* synthetic */ y(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.f35435a = aeVar;
        this.f35436b = new Handler();
        this.f35437c = -1L;
    }

    final void a() {
        this.f35436b.removeCallbacksAndMessages(null);
    }

    final void b() {
        ae aeVar = this.f35435a;
        aeVar.aw();
        this.f35437c = System.currentTimeMillis();
        a();
        if (!aeVar.K || aeVar.L <= 0) {
            return;
        }
        this.f35436b.postDelayed(this, 50L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ae aeVar = this.f35435a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        aeVar.M = (int) (aeVar.M + (jCurrentTimeMillis - this.f35437c));
        aeVar.aw();
        this.f35437c = jCurrentTimeMillis;
        this.f35436b.postDelayed(this, 50L);
    }
}
