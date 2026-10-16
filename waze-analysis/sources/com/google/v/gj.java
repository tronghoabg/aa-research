package com.google.v;

import sun.misc.Unsafe;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
abstract class gj {

    /* renamed from: a, reason: collision with root package name */
    final Unsafe f13003a;

    gj(Unsafe unsafe) {
        this.f13003a = unsafe;
    }

    public abstract double a(Object obj, long j2);

    public abstract float b(Object obj, long j2);

    public abstract void c(Object obj, long j2, boolean z);

    public abstract void d(Object obj, long j2, double d2);

    public abstract void e(Object obj, long j2, float f2);

    public abstract boolean f(Object obj, long j2);

    public final int g(Object obj, long j2) {
        return this.f13003a.getInt(obj, j2);
    }

    public final long h(Object obj, long j2) {
        return this.f13003a.getLong(obj, j2);
    }

    public final void i(Object obj, long j2, int i2) {
        this.f13003a.putInt(obj, j2, i2);
    }

    public final void j(Object obj, long j2, long j3) {
        this.f13003a.putLong(obj, j2, j3);
    }
}
