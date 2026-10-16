package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hjh {
    public static final defpackage.hjh a = new defpackage.hjh(64.0f, 84.0f, 156.0f, 194.0f);
    public static final defpackage.hjh b = new defpackage.hjh(80.0f, 105.0f, 195.0f, 242.0f);
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    private hjh(float f, float f2, float f3, float f4) {
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hjh)) {
            return false;
        }
        defpackage.hjh hjhVar = (defpackage.hjh) obj;
        return defpackage.dlr.c(this.c, hjhVar.c) && defpackage.dlr.c(this.d, hjhVar.d) && defpackage.dlr.c(this.e, hjhVar.e) && defpackage.dlr.c(this.f, hjhVar.f);
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.c) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f);
    }

    public final java.lang.String toString() {
        float f = this.f;
        float f2 = this.e;
        float f3 = this.d;
        return "TemplateMinImageSize(small=" + defpackage.dlr.b(this.c) + ", medium=" + defpackage.dlr.b(f3) + ", large=" + defpackage.dlr.b(f2) + ", extraLarge=" + defpackage.dlr.b(f) + ")";
    }
}
