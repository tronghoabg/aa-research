package defpackage;

/* loaded from: classes2.dex */
public final class hiz {
    public static final hiz a = new hiz(64.0f, 84.0f, 156.0f, 194.0f);
    public static final hiz b = new hiz(80.0f, 105.0f, 195.0f, 242.0f);
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    private hiz(float f, float f2, float f3, float f4) {
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiz)) {
            return false;
        }
        hiz hizVar = (hiz) obj;
        return dlj.c(this.c, hizVar.c) && dlj.c(this.d, hizVar.d) && dlj.c(this.e, hizVar.e) && dlj.c(this.f, hizVar.f);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final String toString() {
        float f = this.f;
        float f2 = this.e;
        float f3 = this.d;
        return "TemplateMinImageSize(small=" + dlj.b(this.c) + ", medium=" + dlj.b(f3) + ", large=" + dlj.b(f2) + ", extraLarge=" + dlj.b(f) + ")";
    }
}
