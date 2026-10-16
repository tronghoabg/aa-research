package com.airbnb.lottie;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2514a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f2515b;

    public y(Object obj) {
        this.f2514a = obj;
        this.f2515b = null;
    }

    public final Object a() {
        return this.f2514a;
    }

    public final Throwable b() {
        return this.f2515b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        Object obj2 = this.f2514a;
        if (obj2 != null && obj2.equals(yVar.f2514a)) {
            return true;
        }
        Throwable th = this.f2515b;
        if (th == null || yVar.f2515b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2514a, this.f2515b});
    }

    public y(Throwable th) {
        this.f2515b = th;
        this.f2514a = null;
    }
}
