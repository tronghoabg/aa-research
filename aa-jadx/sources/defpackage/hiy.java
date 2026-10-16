package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hiy {
    public static final defpackage.hiy a = new defpackage.hiy(4.0f, 8.0f, 12.0f, 16.0f, 32.0f);
    public static final defpackage.hiy b = new defpackage.hiy(6.0f, 12.0f, 16.0f, 20.0f, 40.0f);
    public static final defpackage.hiy c = new defpackage.hiy(8.0f, 12.0f, 20.0f, 24.0f, 48.0f);
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    private hiy(float f, float f2, float f3, float f4, float f5) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hiy)) {
            return false;
        }
        defpackage.hiy hiyVar = (defpackage.hiy) obj;
        return defpackage.dlr.c(this.d, hiyVar.d) && defpackage.dlr.c(this.e, hiyVar.e) && defpackage.dlr.c(this.f, hiyVar.f) && defpackage.dlr.c(this.g, hiyVar.g) && defpackage.dlr.c(this.h, hiyVar.h);
    }

    public final int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.d) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h);
    }

    public final java.lang.String toString() {
        float f = this.h;
        float f2 = this.g;
        float f3 = this.f;
        float f4 = this.e;
        return "AdaptivePaddingSet(P0=" + defpackage.dlr.b(this.d) + ", P1=" + defpackage.dlr.b(f4) + ", P2=" + defpackage.dlr.b(f3) + ", P3=" + defpackage.dlr.b(f2) + ", P4=" + defpackage.dlr.b(f) + ")";
    }
}
