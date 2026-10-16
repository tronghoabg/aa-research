package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class baf extends defpackage.cge implements defpackage.czc {
    public defpackage.afer a;
    public defpackage.bad b;
    public defpackage.apn c;
    public boolean d;
    private defpackage.ddx e;
    private final defpackage.affc f = new defpackage.aun(this, 17);
    private defpackage.affc g;

    public baf(defpackage.afer aferVar, defpackage.bad badVar, defpackage.apn apnVar, boolean z) {
        this.a = aferVar;
        this.b = badVar;
        this.c = apnVar;
        this.d = z;
        b();
    }

    public final void b() {
        this.e = new defpackage.ddx(new defpackage.aln(this, 18), new defpackage.aln(this, 19));
        this.g = this.d ? new defpackage.aun(this, 18) : null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) throws afbj {
        dekVar.a(defpackage.def.n, java.lang.Boolean.TRUE);
        dekVar.a(defpackage.def.Q, this.f);
        defpackage.apn apnVar = this.c;
        defpackage.apn apnVar2 = defpackage.apn.a;
        defpackage.ddx ddxVar = this.e;
        if (apnVar == apnVar2) {
            if (ddxVar == null) {
                defpackage.afga.d("scrollAxisRange");
                ddxVar = null;
            }
            dekVar.a(defpackage.def.x, ddxVar);
        } else {
            if (ddxVar == null) {
                defpackage.afga.d("scrollAxisRange");
                ddxVar = null;
            }
            dekVar.a(defpackage.def.w, ddxVar);
        }
        defpackage.affc affcVar = this.g;
        if (affcVar != null) {
            dekVar.a(defpackage.ddy.f, new defpackage.ddn(null, affcVar));
        }
        dekVar.a(defpackage.ddy.C, new defpackage.ddn(null, new defpackage.deh(new defpackage.aln(this, 20), 0)));
        dekVar.a(defpackage.def.f, this.b.e());
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }
}
