package com.waze.map.isolated;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final float f29245a;

    /* renamed from: b, reason: collision with root package name */
    private final float f29246b;

    public r(float f2, float f3) {
        this.f29245a = f2;
        this.f29246b = f3;
    }

    public final float a() {
        return this.f29245a;
    }

    public final float b() {
        return this.f29246b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f29245a, rVar.f29245a) == 0 && Float.compare(this.f29246b, rVar.f29246b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f29245a) * 31) + Float.floatToIntBits(this.f29246b);
    }

    public final String toString() {
        return "ScreenCoordinates(x=" + this.f29245a + ", y=" + this.f29246b + ")";
    }
}
