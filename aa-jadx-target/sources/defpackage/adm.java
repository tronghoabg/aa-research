package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adm {
    public final defpackage.aeb a;
    public long b;

    public adm(defpackage.aeb aebVar, long j) {
        this.a = aebVar;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.adm)) {
            return false;
        }
        defpackage.adm admVar = (defpackage.adm) obj;
        return defpackage.afga.f(this.a, admVar.a) && this.b == admVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + defpackage.a.f(this.b);
    }

    public final java.lang.String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + defpackage.dly.c(this.b) + ")";
    }
}
