package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gfy implements defpackage.gfg {
    private final defpackage.dfb a;

    public gfy(defpackage.dfb dfbVar) {
        this.a = dfbVar;
    }

    @Override // defpackage.gfg
    public final java.lang.CharSequence a() {
        defpackage.dfb dfbVar = this.a;
        return dfbVar != null ? dfbVar : "";
    }

    @Override // defpackage.gfg
    public final boolean b() {
        defpackage.dfb dfbVar = this.a;
        return (dfbVar == null || dfbVar.a() == 0) ? false : true;
    }

    @Override // defpackage.gfg
    public final defpackage.gff c(defpackage.dgd dgdVar, defpackage.dlr dlrVar, defpackage.ckd ckdVar, boolean z, defpackage.bve bveVar, int i) {
        dgdVar.getClass();
        bveVar.v(-32224263);
        defpackage.gff gffVar = new defpackage.gff(this.a);
        bveVar.o();
        return gffVar;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.a);
    }
}
