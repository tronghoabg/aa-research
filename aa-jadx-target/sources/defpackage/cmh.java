package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cmh {
    public defpackage.dlo a;
    public defpackage.dlz b;
    public defpackage.ckc c;
    public long d = 0;

    public cmh(defpackage.dlo dloVar, defpackage.dlz dlzVar, defpackage.ckc ckcVar) {
        this.a = dloVar;
        this.b = dlzVar;
        this.c = ckcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cmh)) {
            return false;
        }
        defpackage.cmh cmhVar = (defpackage.cmh) obj;
        return defpackage.afga.f(this.a, cmhVar.a) && this.b == cmhVar.b && defpackage.afga.f(this.c, cmhVar.c) && this.d == cmhVar.d;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        long j = this.d;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + defpackage.cjl.c(this.d) + ")";
    }
}
