package defpackage;

/* loaded from: classes.dex */
public final class clz {
    public dlg a;
    public dlr b;
    public cju c;
    public long d = 0;

    public clz(dlg dlgVar, dlr dlrVar, cju cjuVar) {
        this.a = dlgVar;
        this.b = dlrVar;
        this.c = cjuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clz)) {
            return false;
        }
        clz clzVar = (clz) obj;
        return affa.f(this.a, clzVar.a) && this.b == clzVar.b && affa.f(this.c, clzVar.c) && this.d == clzVar.d;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        long j = this.d;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + cjd.c(this.d) + ")";
    }
}
