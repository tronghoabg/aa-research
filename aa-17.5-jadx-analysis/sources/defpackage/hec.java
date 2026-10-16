package defpackage;

/* loaded from: classes2.dex */
public final class hec {
    public final float a;
    public final ckv b;
    private final boolean c;

    public hec(float f, ckv ckvVar, boolean z) {
        this.a = f;
        this.b = ckvVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hec)) {
            return false;
        }
        hec hecVar = (hec) obj;
        return dlj.c(this.a, hecVar.a) && affa.f(this.b, hecVar.b) && this.c == hecVar.c;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        ckv ckvVar = this.b;
        return ((iFloatToIntBits + (ckvVar == null ? 0 : ckvVar.hashCode())) * 31) + a.f(this.c);
    }

    public final String toString() {
        return "RowLeadingImageStyle(size=" + dlj.b(this.a) + ", clip=" + this.b + ", isTintable=" + this.c + ")";
    }
}
