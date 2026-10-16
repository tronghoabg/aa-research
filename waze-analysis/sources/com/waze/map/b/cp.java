package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cp extends com.waze.destination_cell.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final float f28157a;

    public /* synthetic */ cp(byte[] bArr) {
        super(null);
        this.f28157a = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp)) {
            return false;
        }
        float f2 = ((cp) obj).f28157a;
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "FitToContent(boundsFactor=1.0)";
    }

    public cp() {
        this(null);
    }
}
