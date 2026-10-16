package com.google.firebase.perf.metrics;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    final int f10521a;

    /* renamed from: b, reason: collision with root package name */
    final int f10522b;

    /* renamed from: c, reason: collision with root package name */
    final int f10523c;

    public e(int i2, int i3, int i4) {
        this.f10521a = i2;
        this.f10522b = i3;
        this.f10523c = i4;
    }

    public final int a() {
        return this.f10523c;
    }

    public final int b() {
        return this.f10522b;
    }

    public final int c() {
        return this.f10521a;
    }

    public final e d(e eVar) {
        return new e(this.f10521a - eVar.f10521a, this.f10522b - eVar.f10522b, this.f10523c - eVar.f10523c);
    }
}
