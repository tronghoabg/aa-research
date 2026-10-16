package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lii {
    public final defpackage.afak a;
    private final defpackage.tgf b;

    public lii(defpackage.afak afakVar, defpackage.tgf tgfVar) {
        this.a = afakVar;
        this.b = tgfVar;
    }

    public final void a(java.lang.String str) {
        defpackage.lhn lhnVar = (defpackage.lhn) this.a.a();
        if (str != null) {
            ((defpackage.yqj) defpackage.lin.a.l().ai(3937)).M("Starting [%s] %s", str, lhnVar);
        } else {
            ((defpackage.yqj) defpackage.lin.a.l().ai((char) 3936)).y("Starting %s", lhnVar);
        }
        defpackage.tgf tgfVar = this.b;
        defpackage.tgg tggVar = defpackage.tgg.a;
        tggVar.b(tgfVar);
        lhnVar.eQ();
        tggVar.d(tgfVar, 1);
    }

    public final void b() {
        defpackage.lin.q((defpackage.lhn) this.a.a());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lii) {
            defpackage.lii liiVar = (defpackage.lii) obj;
            if (this.a.equals(liiVar.a) && this.b.equals(liiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.tgf tgfVar = this.b;
        return "LifetimeComponentInfo{serviceProvider=" + this.a.toString() + ", startLatencyEvent=" + tgfVar.toString() + "}";
    }

    protected lii() {
        throw null;
    }
}
