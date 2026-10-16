package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fk {

    /* renamed from: a, reason: collision with root package name */
    private final float f28350a;

    /* renamed from: b, reason: collision with root package name */
    private final float f28351b;

    public fk(float f2, float f3) {
        this.f28350a = f2;
        this.f28351b = f3;
    }

    public final float a() {
        return this.f28351b;
    }

    public final float b() {
        return this.f28350a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk)) {
            return false;
        }
        fk fkVar = (fk) obj;
        return Float.compare(this.f28350a, fkVar.f28350a) == 0 && Float.compare(this.f28351b, fkVar.f28351b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f28350a) * 31) + Float.floatToIntBits(this.f28351b);
    }

    public final String toString() {
        return "ZoomLevelDisplayRange(minZoomLevel=" + this.f28350a + ", maxZoomLevel=" + this.f28351b + ")";
    }

    public fk() {
        this(null);
    }

    public /* synthetic */ fk(byte[] bArr) {
        this(0.0f, 1.0f);
    }
}
