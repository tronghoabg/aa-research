package com.apm.insight.j;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Handler f20415a;

    /* renamed from: b, reason: collision with root package name */
    private final long f20416b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final long f20417c;

    public a(Handler handler, long j8) {
        this.f20415a = handler;
        this.f20417c = j8;
    }

    public final void a() {
        this.f20415a.post(this);
    }

    public final long b() {
        return this.f20417c;
    }

    public final void a(long j8) {
        if (j8 > 0) {
            this.f20415a.postDelayed(this, j8);
        } else {
            this.f20415a.post(this);
        }
    }
}
