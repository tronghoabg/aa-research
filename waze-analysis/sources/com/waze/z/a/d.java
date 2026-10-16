package com.waze.z.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final float f45887a;

    /* renamed from: b, reason: collision with root package name */
    private final float f45888b;

    public d(float f2, float f3) {
        this.f45887a = f2;
        this.f45888b = f3;
    }

    public final float a() {
        return this.f45887a;
    }

    public final float b() {
        return this.f45888b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f45887a, dVar.f45887a) == 0 && Float.compare(this.f45888b, dVar.f45888b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f45887a) * 31) + Float.floatToIntBits(this.f45888b);
    }

    public final String toString() {
        return "DoubleHorizontal(firstWeight=" + this.f45887a + ", secondWeight=" + this.f45888b + ")";
    }

    public d() {
        this(null);
    }

    public /* synthetic */ d(byte[] bArr) {
        this(1.0f, 1.0f);
    }
}
