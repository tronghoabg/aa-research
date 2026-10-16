package defpackage;

/* loaded from: classes2.dex */
public final class hiy {
    public static final hiy a = new hiy(24.0f, 32.0f, 36.0f, 42.0f);
    public static final hiy b = new hiy(30.0f, 40.0f, 45.0f, 52.0f);
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    private hiy(float f, float f2, float f3, float f4) {
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiy)) {
            return false;
        }
        hiy hiyVar = (hiy) obj;
        return dlj.c(this.c, hiyVar.c) && dlj.c(this.d, hiyVar.d) && dlj.c(this.e, hiyVar.e) && dlj.c(this.f, hiyVar.f);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final String toString() {
        float f = this.f;
        float f2 = this.e;
        float f3 = this.d;
        return "TemplateMinIconSize(xSmall=" + dlj.b(this.c) + ", small=" + dlj.b(f3) + ", medium=" + dlj.b(f2) + ", large=" + dlj.b(f) + ")";
    }
}
