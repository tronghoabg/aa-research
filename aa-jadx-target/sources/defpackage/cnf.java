package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cnf {
    public defpackage.cld a;
    public long b;
    public defpackage.dlz c;
    public float d;
    public defpackage.cnh e;

    public cnf(defpackage.cld cldVar, long j, defpackage.dlz dlzVar, float f, defpackage.cnh cnhVar) {
        this.a = cldVar;
        this.b = j;
        this.c = dlzVar;
        this.d = f;
        this.e = cnhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cnf)) {
            return false;
        }
        defpackage.cnf cnfVar = (defpackage.cnf) obj;
        return defpackage.afga.f(this.a, cnfVar.a) && this.b == cnfVar.b && this.c == cnfVar.c && java.lang.Float.compare(this.d, cnfVar.d) == 0 && defpackage.afga.f(this.e, cnfVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int iHashCode2 = ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.d);
        defpackage.cnh cnhVar = this.e;
        return (iHashCode2 * 31) + (cnhVar == null ? 0 : cnhVar.hashCode());
    }

    public final java.lang.String toString() {
        return "ShadowKey(shape=" + this.a + ", size=" + defpackage.cjl.c(this.b) + ", layoutDirection=" + this.c + ", density=" + this.d + ", shadow=" + this.e + ")";
    }
}
