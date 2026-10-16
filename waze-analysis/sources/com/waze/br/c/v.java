package com.waze.br.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    private final float f17414a;

    /* renamed from: b, reason: collision with root package name */
    private final float f17415b;

    public /* synthetic */ v(byte[] bArr) {
        this.f17414a = 0.01f;
        this.f17415b = 0.4f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        float f2 = vVar.f17414a;
        if (Float.compare(0.01f, 0.01f) != 0) {
            return false;
        }
        float f3 = vVar.f17415b;
        return Float.compare(0.4f, 0.4f) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(0.01f) * 31) + Float.floatToIntBits(0.4f);
    }

    public final String toString() {
        return "Random(min=0.01, max=0.4)";
    }

    public v() {
        this(null);
    }
}
