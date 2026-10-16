package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xsa {
    public final float a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;

    public /* synthetic */ xsa(byte[] bArr) {
        this(64.0f, 32.0f, -13367269, 1.0f, 1.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xsa)) {
            return false;
        }
        defpackage.xsa xsaVar = (defpackage.xsa) obj;
        return java.lang.Float.compare(this.a, xsaVar.a) == 0 && java.lang.Float.compare(this.b, xsaVar.b) == 0 && this.c == xsaVar.c && java.lang.Float.compare(this.d, xsaVar.d) == 0 && java.lang.Float.compare(this.e, xsaVar.e) == 0;
    }

    public final int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e);
    }

    public final java.lang.String toString() {
        return "PanelConfig(topBlurRadius=" + this.a + ", bottomBlurRadius=" + this.b + ", color=" + this.c + ", alpha=" + this.d + ", hdrBoost=" + this.e + ")";
    }

    public xsa(float f, float f2, int i, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = f3;
        this.e = f4;
    }

    public xsa() {
        this(null);
    }
}
