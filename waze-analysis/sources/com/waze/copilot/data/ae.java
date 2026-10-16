package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final float f22947a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f22948b;

    public ae(float f2, Float f3) {
        this.f22947a = f2;
        this.f22948b = f3;
    }

    public final float a() {
        return this.f22947a;
    }

    public final Float b() {
        return this.f22948b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return Float.compare(this.f22947a, aeVar.f22947a) == 0 && h.g.b.x.n(this.f22948b, aeVar.f22948b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f22947a) * 31) + this.f22948b.hashCode();
    }

    public final String toString() {
        return "MapCar3DLighting(ambientIntensity=" + this.f22947a + ", diffuseIntensity=" + this.f22948b + ")";
    }
}
