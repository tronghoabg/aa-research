package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hjg {
    public static final defpackage.hjg a = new defpackage.hjg(24.0f, 32.0f, 36.0f, 42.0f);
    public static final defpackage.hjg b = new defpackage.hjg(30.0f, 40.0f, 45.0f, 52.0f);
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    private hjg(float f, float f2, float f3, float f4) {
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hjg)) {
            return false;
        }
        defpackage.hjg hjgVar = (defpackage.hjg) obj;
        return defpackage.dlr.c(this.c, hjgVar.c) && defpackage.dlr.c(this.d, hjgVar.d) && defpackage.dlr.c(this.e, hjgVar.e) && defpackage.dlr.c(this.f, hjgVar.f);
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.c) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f);
    }

    public final java.lang.String toString() {
        float f = this.f;
        float f2 = this.e;
        float f3 = this.d;
        return "TemplateMinIconSize(xSmall=" + defpackage.dlr.b(this.c) + ", small=" + defpackage.dlr.b(f3) + ", medium=" + defpackage.dlr.b(f2) + ", large=" + defpackage.dlr.b(f) + ")";
    }
}
