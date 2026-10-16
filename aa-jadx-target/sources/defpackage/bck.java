package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bck extends defpackage.cyc<defpackage.bcm> {
    private final boolean a;
    private final defpackage.ask b;
    private final defpackage.akr c;
    private final boolean d;
    private final defpackage.ddw f;
    private final defpackage.afer g;

    public bck(boolean z, defpackage.ask askVar, defpackage.akr akrVar, boolean z2, defpackage.ddw ddwVar, defpackage.afer aferVar) {
        this.a = z;
        this.b = askVar;
        this.c = akrVar;
        this.d = z2;
        this.f = ddwVar;
        this.g = aferVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bcm(this.a, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.bcm bcmVar = (defpackage.bcm) cgeVar;
        boolean z = bcmVar.i;
        boolean z2 = this.a;
        if (z != z2) {
            bcmVar.i = z2;
            defpackage.cjv.r(bcmVar).J();
        }
        defpackage.afer aferVar = this.g;
        defpackage.ddw ddwVar = this.f;
        boolean z3 = this.d;
        bcmVar.w(this.b, this.c, false, z3, null, ddwVar, aferVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.bck bckVar = (defpackage.bck) obj;
        return this.a == bckVar.a && defpackage.afga.f(this.b, bckVar.b) && defpackage.afga.f(this.c, bckVar.c) && this.d == bckVar.d && defpackage.afga.f(this.f, bckVar.f) && this.g == bckVar.g;
    }

    public final int hashCode() {
        defpackage.ask askVar = this.b;
        int iHashCode = ((true != this.a ? 1237 : 1231) * 31) + (askVar != null ? askVar.hashCode() : 0);
        defpackage.akr akrVar = this.c;
        int iHashCode2 = ((((((iHashCode * 31) + (akrVar != null ? akrVar.hashCode() : 0)) * 31) + 1237) * 31) + (true != this.d ? 1237 : 1231)) * 31;
        defpackage.ddw ddwVar = this.f;
        return ((iHashCode2 + (ddwVar != null ? ddwVar.a : 0)) * 31) + this.g.hashCode();
    }
}
