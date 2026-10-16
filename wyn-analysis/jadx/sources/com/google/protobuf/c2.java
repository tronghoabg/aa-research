package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f27655a;

    public c2(Unsafe unsafe) {
        this.f27655a = unsafe;
    }

    public final int a(Class cls) {
        return this.f27655a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f27655a.arrayIndexScale(cls);
    }

    public abstract void c(long j8, byte[] bArr, long j10, long j11);

    public abstract void d(byte[] bArr, long j8, long j10, long j11);

    public abstract boolean e(long j8, Object obj);

    public abstract byte f(long j8);

    public abstract double g(long j8, Object obj);

    public abstract float h(long j8, Object obj);

    public final int i(long j8, Object obj) {
        return this.f27655a.getInt(obj, j8);
    }

    public final long j(long j8, Object obj) {
        return this.f27655a.getLong(obj, j8);
    }

    public final Object k(long j8, Object obj) {
        return this.f27655a.getObject(obj, j8);
    }

    public final long l(java.lang.reflect.Field field) {
        return this.f27655a.objectFieldOffset(field);
    }

    public abstract void m(Object obj, long j8, boolean z2);

    public abstract void n(byte b5, long j8);

    public abstract void o(Object obj, long j8, byte b5);

    public abstract void p(Object obj, long j8, double d3);

    public abstract void q(Object obj, long j8, float f10);

    public final void r(long j8, Object obj, int i5) {
        this.f27655a.putInt(obj, j8, i5);
    }

    public final void s(Object obj, long j8, long j10) {
        this.f27655a.putLong(obj, j8, j10);
    }

    public final void t(Object obj, long j8, Object obj2) {
        this.f27655a.putObject(obj, j8, obj2);
    }

    public abstract boolean u();
}
