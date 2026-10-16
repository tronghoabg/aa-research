package defpackage;

/* loaded from: classes2.dex */
public final class hiq {
    public static final hiq a = new hiq(4.0f, 8.0f, 12.0f, 16.0f, 32.0f);
    public static final hiq b = new hiq(6.0f, 12.0f, 16.0f, 20.0f, 40.0f);
    public static final hiq c = new hiq(8.0f, 12.0f, 20.0f, 24.0f, 48.0f);
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    private hiq(float f, float f2, float f3, float f4, float f5) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiq)) {
            return false;
        }
        hiq hiqVar = (hiq) obj;
        return dlj.c(this.d, hiqVar.d) && dlj.c(this.e, hiqVar.e) && dlj.c(this.f, hiqVar.f) && dlj.c(this.g, hiqVar.g) && dlj.c(this.h, hiqVar.h);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.d) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h);
    }

    public final String toString() {
        float f = this.h;
        float f2 = this.g;
        float f3 = this.f;
        float f4 = this.e;
        return "AdaptivePaddingSet(P0=" + dlj.b(this.d) + ", P1=" + dlj.b(f4) + ", P2=" + dlj.b(f3) + ", P3=" + dlj.b(f2) + ", P4=" + dlj.b(f) + ")";
    }
}
