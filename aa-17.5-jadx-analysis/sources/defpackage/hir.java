package defpackage;

/* loaded from: classes2.dex */
public final class hir {
    public static final hir a = new hir();
    public final float b = 4.0f;
    public final float c = 8.0f;
    public final float d = 12.0f;
    public final float e = 16.0f;
    public final float f = 24.0f;
    public final float g = 32.0f;
    public final float h = 48.0f;
    private final float i = 64.0f;
    private final float j = 72.0f;
    private final float k = 96.0f;

    private hir() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hir)) {
            return false;
        }
        hir hirVar = (hir) obj;
        float f = hirVar.b;
        if (!dlj.c(4.0f, 4.0f)) {
            return false;
        }
        float f2 = hirVar.c;
        if (!dlj.c(8.0f, 8.0f)) {
            return false;
        }
        float f3 = hirVar.d;
        if (!dlj.c(12.0f, 12.0f)) {
            return false;
        }
        float f4 = hirVar.e;
        if (!dlj.c(16.0f, 16.0f)) {
            return false;
        }
        float f5 = hirVar.f;
        if (!dlj.c(24.0f, 24.0f)) {
            return false;
        }
        float f6 = hirVar.g;
        if (!dlj.c(32.0f, 32.0f)) {
            return false;
        }
        float f7 = hirVar.h;
        if (!dlj.c(48.0f, 48.0f)) {
            return false;
        }
        float f8 = hirVar.i;
        if (!dlj.c(64.0f, 64.0f)) {
            return false;
        }
        float f9 = hirVar.j;
        if (!dlj.c(72.0f, 72.0f)) {
            return false;
        }
        float f10 = hirVar.k;
        return dlj.c(96.0f, 96.0f);
    }

    public final int hashCode() {
        return (((((((((((((((((Float.floatToIntBits(4.0f) * 31) + Float.floatToIntBits(8.0f)) * 31) + Float.floatToIntBits(12.0f)) * 31) + Float.floatToIntBits(16.0f)) * 31) + Float.floatToIntBits(24.0f)) * 31) + Float.floatToIntBits(32.0f)) * 31) + Float.floatToIntBits(48.0f)) * 31) + Float.floatToIntBits(64.0f)) * 31) + Float.floatToIntBits(72.0f)) * 31) + Float.floatToIntBits(96.0f);
    }

    public final String toString() {
        return "StaticPaddingSet(P0=" + dlj.b(4.0f) + ", P1=" + dlj.b(8.0f) + ", P2=" + dlj.b(12.0f) + ", P3=" + dlj.b(16.0f) + ", P4=" + dlj.b(24.0f) + ", P5=" + dlj.b(32.0f) + ", P6=" + dlj.b(48.0f) + ", P7=" + dlj.b(64.0f) + ", P8=" + dlj.b(72.0f) + ", P9=" + dlj.b(96.0f) + ")";
    }
}
