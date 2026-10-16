package com.google.android.gms.o;

import java.util.concurrent.ExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af<T> implements ae<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5742a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f5743b;

    /* renamed from: c, reason: collision with root package name */
    private final aa f5744c;

    /* renamed from: d, reason: collision with root package name */
    private int f5745d;

    /* renamed from: e, reason: collision with root package name */
    private int f5746e;

    /* renamed from: f, reason: collision with root package name */
    private int f5747f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f5748g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5749h;

    public af(int i2, aa aaVar) {
        this.f5743b = i2;
        this.f5744c = aaVar;
    }

    private final void a() {
        int i2 = this.f5745d + this.f5746e + this.f5747f;
        int i3 = this.f5743b;
        if (i2 == i3) {
            if (this.f5748g == null) {
                boolean z = this.f5749h;
                aa aaVar = this.f5744c;
                if (z) {
                    aaVar.v();
                    return;
                } else {
                    aaVar.t(null);
                    return;
                }
            }
            this.f5744c.s(new ExecutionException(this.f5746e + " out of " + i3 + " underlying tasks failed", this.f5748g));
        }
    }

    @Override // com.google.android.gms.o.h
    public final void d() {
        synchronized (this.f5742a) {
            this.f5747f++;
            this.f5749h = true;
            a();
        }
    }

    @Override // com.google.android.gms.o.m
    public final void onFailure(Exception exc) {
        synchronized (this.f5742a) {
            this.f5746e++;
            this.f5748g = exc;
            a();
        }
    }

    @Override // com.google.android.gms.o.o
    public final void onSuccess(T t) {
        synchronized (this.f5742a) {
            this.f5745d++;
            a();
        }
    }
}
