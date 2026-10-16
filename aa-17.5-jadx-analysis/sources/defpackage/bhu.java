package defpackage;

/* loaded from: classes.dex */
public final class bhu extends cwe implements cys, chu, cio {
    public afdr a;
    public boolean b;
    private final crm c;

    public bhu(afdr afdrVar) {
        this.a = afdrVar;
        bas basVar = new bas(this, 4);
        cql cqlVar = crh.a;
        crm crmVar = new crm(null, null, basVar);
        W(crmVar);
        this.c = crmVar;
    }

    @Override // defpackage.cys
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.cys
    public final long eq() {
        return cwj.a(bzi.t(this));
    }

    @Override // defpackage.chu
    public final void eu(cis cisVar) {
        this.b = cisVar.b();
    }

    @Override // defpackage.cys
    public final void o() {
        this.c.o();
    }

    @Override // defpackage.cfx
    /* renamed from: p */
    public final /* synthetic */ void t() {
        o();
    }

    @Override // defpackage.cys
    public final void s(cql cqlVar, cqm cqmVar, long j) {
        this.c.s(cqlVar, cqmVar, j);
    }

    @Override // defpackage.cys
    public final /* synthetic */ void t() {
        o();
    }

    @Override // defpackage.cys
    public final /* synthetic */ void E() {
    }
}
