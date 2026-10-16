package com.waze.z.a.g;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final float f46089a;

    /* renamed from: b, reason: collision with root package name */
    private final float f46090b;

    /* renamed from: c, reason: collision with root package name */
    private final float f46091c;

    /* renamed from: d, reason: collision with root package name */
    private final float f46092d;

    /* renamed from: e, reason: collision with root package name */
    private final float f46093e;

    /* renamed from: f, reason: collision with root package name */
    private final float f46094f;

    /* renamed from: g, reason: collision with root package name */
    private final float f46095g;

    /* renamed from: h, reason: collision with root package name */
    private final float f46096h;

    /* renamed from: i, reason: collision with root package name */
    private final float f46097i;

    /* renamed from: j, reason: collision with root package name */
    private final float f46098j;

    /* renamed from: k, reason: collision with root package name */
    private final float f46099k;

    public t(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f46089a = f2;
        this.f46090b = f3;
        this.f46091c = f4;
        this.f46092d = f5;
        this.f46093e = f6;
        this.f46094f = f7;
        this.f46095g = f8;
        this.f46096h = f9;
        this.f46097i = f10;
        this.f46098j = f11;
        this.f46099k = f12;
    }

    public final float a() {
        return this.f46094f;
    }

    public final float b() {
        return this.f46092d;
    }

    public final float c() {
        return this.f46093e;
    }

    public final float d() {
        return this.f46093e - this.f46094f;
    }

    public final float e() {
        return this.f46091c - this.f46092d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f46089a, tVar.f46089a) == 0 && Float.compare(this.f46090b, tVar.f46090b) == 0 && Float.compare(this.f46091c, tVar.f46091c) == 0 && Float.compare(this.f46092d, tVar.f46092d) == 0 && Float.compare(this.f46093e, tVar.f46093e) == 0 && Float.compare(this.f46094f, tVar.f46094f) == 0 && Float.compare(this.f46095g, tVar.f46095g) == 0 && Float.compare(this.f46096h, tVar.f46096h) == 0 && Float.compare(this.f46097i, tVar.f46097i) == 0 && Float.compare(this.f46098j, tVar.f46098j) == 0 && Float.compare(this.f46099k, tVar.f46099k) == 0;
    }

    public final float f() {
        return this.f46091c;
    }

    public final float g() {
        return this.f46091c - (this.f46099k + this.f46098j);
    }

    public final float h() {
        return this.f46095g;
    }

    public final int hashCode() {
        return (((((((((((((((((((Float.floatToIntBits(this.f46089a) * 31) + Float.floatToIntBits(this.f46090b)) * 31) + Float.floatToIntBits(this.f46091c)) * 31) + Float.floatToIntBits(this.f46092d)) * 31) + Float.floatToIntBits(this.f46093e)) * 31) + Float.floatToIntBits(this.f46094f)) * 31) + Float.floatToIntBits(this.f46095g)) * 31) + Float.floatToIntBits(this.f46096h)) * 31) + Float.floatToIntBits(this.f46097i)) * 31) + Float.floatToIntBits(this.f46098j)) * 31) + Float.floatToIntBits(this.f46099k);
    }

    public final float i() {
        return this.f46097i;
    }

    public final float j() {
        return this.f46099k;
    }

    public final float k() {
        return this.f46096h;
    }

    public final float l() {
        return this.f46098j;
    }

    public final float m() {
        return this.f46090b;
    }

    public final float n() {
        return this.f46089a;
    }

    public final String toString() {
        return "WazeTooltipDimensionsWithDensity(shadowSize=" + this.f46089a + ", radiusSize=" + this.f46090b + ", arrowWidth=" + this.f46091c + ", arrowCurveWidth=" + this.f46092d + ", arrowHeight=" + this.f46093e + ", arrowCurveHeight=" + this.f46094f + ", edgeArrowPadding=" + this.f46095g + ", edgeArrowStraightHeight=" + this.f46096h + ", edgeArrowSlantedHeight=" + this.f46097i + ", edgeArrowStraightWidth=" + this.f46098j + ", edgeArrowSlantedWidth=" + this.f46099k + ")";
    }
}
