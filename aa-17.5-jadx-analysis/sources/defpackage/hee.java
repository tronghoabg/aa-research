package defpackage;

/* loaded from: classes2.dex */
public final class hee {
    public final float a;
    public final ckv b;

    public hee(float f, ckv ckvVar) {
        this.a = f;
        this.b = ckvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hee)) {
            return false;
        }
        hee heeVar = (hee) obj;
        return dlj.c(this.a, heeVar.a) && affa.f(this.b, heeVar.b);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        ckv ckvVar = this.b;
        return iFloatToIntBits + (ckvVar == null ? 0 : ckvVar.hashCode());
    }

    public final String toString() {
        return "RowTrailingImageStyle(size=" + dlj.b(this.a) + ", clip=" + this.b + ")";
    }
}
