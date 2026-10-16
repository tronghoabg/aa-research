package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m extends bf {

    /* renamed from: a, reason: collision with root package name */
    private final float f28357a;

    public m(float f2) {
        super(null);
        this.f28357a = f2;
    }

    public final float a() {
        return this.f28357a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f28357a, ((m) obj).f28357a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f28357a);
    }

    public final String toString() {
        return "ZoomToRate(rate=" + this.f28357a + ")";
    }
}
