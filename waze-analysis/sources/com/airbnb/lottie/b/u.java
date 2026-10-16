package com.airbnb.lottie.b;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final float f2077a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2078b;

    public u(byte[] bArr) {
        this.f2077a = 0.0f;
        this.f2078b = 1.0f;
    }

    public static void a(com.airbnb.lottie.h hVar) {
        h.g.b.x.f(hVar, "composition");
    }

    public static void b(com.airbnb.lottie.h hVar) {
        h.g.b.x.f(hVar, "composition");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        float f2 = uVar.f2077a;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f3 = uVar.f2078b;
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "Progress(min=0.0, max=1.0)";
    }

    private u() {
        throw null;
    }
}
