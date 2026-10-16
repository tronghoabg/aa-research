package com.waze.shared_infra.h;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.g.b.x;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final c f37873a = new c(-1, -1);

    /* renamed from: b, reason: collision with root package name */
    public static final c f37874b = new c(0, 0);

    /* renamed from: c, reason: collision with root package name */
    private final int f37875c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37876d;

    /* renamed from: e, reason: collision with root package name */
    private final double f37877e;

    /* renamed from: f, reason: collision with root package name */
    private final double f37878f;

    public c(int i2, int i3) {
        this.f37875c = i2;
        this.f37876d = i3;
        this.f37877e = i2 / 1000000.0d;
        this.f37878f = i3 / 1000000.0d;
    }

    public final double a() {
        return this.f37877e;
    }

    public final double b() {
        return this.f37878f;
    }

    public final int c() {
        return this.f37875c;
    }

    public final int d() {
        return this.f37876d;
    }

    public final c e(c cVar) {
        x.f(cVar, TypedValues.CycleType.S_WAVE_OFFSET);
        return new c(this.f37875c - cVar.f37875c, this.f37876d - cVar.f37876d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f37875c == cVar.f37875c && this.f37876d == cVar.f37876d;
    }

    public final c f(c cVar) {
        x.f(cVar, TypedValues.CycleType.S_WAVE_OFFSET);
        return new c(this.f37875c + cVar.f37875c, this.f37876d + cVar.f37876d);
    }

    public final boolean g() {
        return x.n(this, f37874b) || !h();
    }

    public final boolean h() {
        return !x.n(this, f37873a);
    }

    public final int hashCode() {
        return (this.f37875c * 31) + this.f37876d;
    }

    public final String toString() {
        return this.f37877e + "," + this.f37878f;
    }

    public c(double d2, double d3) {
        this(b.e(d2), b.e(d3));
    }
}
