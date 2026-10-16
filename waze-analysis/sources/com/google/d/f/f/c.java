package com.google.d.f.f;

import java.io.Closeable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f7844a = new b();

    /* renamed from: b, reason: collision with root package name */
    private int f7845b = 0;

    public static int a() {
        return d().f7845b;
    }

    public static c c() {
        c cVarD = d();
        int i2 = cVarD.f7845b + 1;
        cVarD.f7845b = i2;
        if (i2 != 0) {
            return cVarD;
        }
        throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
    }

    private static c d() {
        return (c) f7844a.get();
    }

    public final int b() {
        return this.f7845b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i2 = this.f7845b;
        if (i2 <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.f7845b = i2 - 1;
    }
}
