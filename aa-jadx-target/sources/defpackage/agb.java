package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class agb implements defpackage.aej {
    private final defpackage.aej a;
    private final long b;

    public agb(defpackage.aej aejVar, long j) {
        this.a = aejVar;
        this.b = j;
    }

    @Override // defpackage.aej
    /* JADX INFO: renamed from: a */
    public final defpackage.agu c(defpackage.bil bilVar) {
        return new defpackage.agc(this.a.c(bilVar), this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.agb)) {
            return false;
        }
        defpackage.agb agbVar = (defpackage.agb) obj;
        return agbVar.b == this.b && defpackage.afga.f(agbVar.a, this.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }
}
