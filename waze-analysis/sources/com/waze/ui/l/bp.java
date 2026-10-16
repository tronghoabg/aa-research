package com.waze.ui.l;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f42589a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42590b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42591c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42592d;

    /* renamed from: e, reason: collision with root package name */
    private final float f42593e;

    /* renamed from: f, reason: collision with root package name */
    private final float f42594f;

    /* renamed from: g, reason: collision with root package name */
    private final bo f42595g;

    public /* synthetic */ bp(boolean z, boolean z2, boolean z3, boolean z4, float f2, float f3, bo boVar) {
        h.g.b.x.f(boVar, TypedValues.CycleType.S_WAVE_PHASE);
        this.f42589a = z;
        this.f42590b = z2;
        this.f42591c = z3;
        this.f42592d = z4;
        this.f42593e = f2;
        this.f42594f = f3;
        this.f42595g = boVar;
    }

    public final float a() {
        return this.f42594f;
    }

    public final float b() {
        return this.f42593e;
    }

    public final bo c() {
        return this.f42595g;
    }

    public final boolean d() {
        return this.f42592d;
    }

    public final boolean e() {
        return this.f42589a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp)) {
            return false;
        }
        bp bpVar = (bp) obj;
        return this.f42589a == bpVar.f42589a && this.f42590b == bpVar.f42590b && this.f42591c == bpVar.f42591c && this.f42592d == bpVar.f42592d && Dp.m11169equalsimpl0(this.f42593e, bpVar.f42593e) && Dp.m11169equalsimpl0(this.f42594f, bpVar.f42594f) && this.f42595g == bpVar.f42595g;
    }

    public final boolean f() {
        return this.f42591c;
    }

    public final boolean g() {
        return this.f42590b;
    }

    public final int hashCode() {
        int iA = a.a.a(this.f42589a);
        float f2 = this.f42593e;
        boolean z = this.f42592d;
        return (((((((((((iA * 31) + a.a.a(this.f42590b)) * 31) + a.a.a(this.f42591c)) * 31) + a.a.a(z)) * 31) + Dp.m11170hashCodeimpl(f2)) * 31) + Dp.m11170hashCodeimpl(this.f42594f)) * 31) + this.f42595g.hashCode();
    }

    public final String toString() {
        float f2 = this.f42594f;
        return "TransitionState(lastIdleLargeHeight=" + this.f42589a + ", targetAnimatingLargeHeight=" + this.f42590b + ", targetAnimatingFullWidth=" + this.f42591c + ", lastIdleFullWidth=" + this.f42592d + ", targetAnimatingHeight=" + Dp.m11175toStringimpl(this.f42593e) + ", lastIdleHeight=" + Dp.m11175toStringimpl(f2) + ", phase=" + this.f42595g + ")";
    }
}
