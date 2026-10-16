package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bl {

    /* renamed from: a, reason: collision with root package name */
    private final float f28611a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28612b;

    public bl(float f2, boolean z) {
        this.f28611a = f2;
        this.f28612b = z;
    }

    public final float a() {
        return this.f28611a;
    }

    public final boolean b() {
        return this.f28612b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl)) {
            return false;
        }
        bl blVar = (bl) obj;
        return Float.compare(this.f28611a, blVar.f28611a) == 0 && this.f28612b == blVar.f28612b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f28611a) * 31) + a.a.a(this.f28612b);
    }

    public final String toString() {
        return "DirectedOrientaiton(orientation=" + this.f28611a + ", clockwise=" + this.f28612b + ")";
    }
}
