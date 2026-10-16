package defpackage;

/* loaded from: classes.dex */
public final class cmx {
    public ckv a;
    public long b;
    public dlr c;
    public float d;
    public cmz e;

    public cmx(ckv ckvVar, long j, dlr dlrVar, float f, cmz cmzVar) {
        this.a = ckvVar;
        this.b = j;
        this.c = dlrVar;
        this.d = f;
        this.e = cmzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmx)) {
            return false;
        }
        cmx cmxVar = (cmx) obj;
        return affa.f(this.a, cmxVar.a) && this.b == cmxVar.b && this.c == cmxVar.c && Float.compare(this.d, cmxVar.d) == 0 && affa.f(this.e, cmxVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int iHashCode2 = ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode()) * 31) + Float.floatToIntBits(this.d);
        cmz cmzVar = this.e;
        return (iHashCode2 * 31) + (cmzVar == null ? 0 : cmzVar.hashCode());
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.a + ", size=" + cjd.c(this.b) + ", layoutDirection=" + this.c + ", density=" + this.d + ", shadow=" + this.e + ")";
    }
}
