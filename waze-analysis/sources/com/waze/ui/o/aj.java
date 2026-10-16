package com.waze.ui.o;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private final int f43131a;

    /* renamed from: b, reason: collision with root package name */
    private final int f43132b;

    /* renamed from: c, reason: collision with root package name */
    private final int f43133c;

    /* renamed from: d, reason: collision with root package name */
    private final float f43134d;

    public aj(int i2, int i3, int i4, float f2) {
        this.f43131a = i2;
        this.f43132b = i3;
        this.f43133c = i4;
        this.f43134d = f2;
    }

    public final float a() {
        return this.f43134d;
    }

    public final int b() {
        return this.f43131a;
    }

    public final int c() {
        return this.f43132b;
    }

    public final int d() {
        return this.f43133c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return this.f43131a == ajVar.f43131a && this.f43132b == ajVar.f43132b && this.f43133c == ajVar.f43133c && Float.compare(this.f43134d, ajVar.f43134d) == 0;
    }

    public final int hashCode() {
        return (((((this.f43131a * 31) + this.f43132b) * 31) + this.f43133c) * 31) + Float.floatToIntBits(this.f43134d);
    }

    public final String toString() {
        return "PageIndicatorData(currentPage=" + this.f43131a + ", pageCount=" + this.f43132b + ", targetPage=" + this.f43133c + ", pageOffset=" + this.f43134d + ")";
    }
}
