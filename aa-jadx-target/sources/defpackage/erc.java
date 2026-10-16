package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class erc implements defpackage.eqe {
    final /* synthetic */ defpackage.epw a;
    final /* synthetic */ defpackage.afgv b;
    final /* synthetic */ aiuw c;
    final /* synthetic */ defpackage.epw d;
    final /* synthetic */ aiuf e;
    final /* synthetic */ defpackage.affg f;
    final /* synthetic */ ajey g;

    public erc(defpackage.epw epwVar, defpackage.afgv afgvVar, aiuw aiuwVar, defpackage.epw epwVar2, aiuf aiufVar, ajey ajeyVar, defpackage.affg affgVar) {
        this.a = epwVar;
        this.b = afgvVar;
        this.c = aiuwVar;
        this.d = epwVar2;
        this.e = aiufVar;
        this.g = ajeyVar;
        this.f = affgVar;
    }

    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        if (epwVar == this.a) {
            this.b.a = ahoc.d(this.c, (defpackage.afdo) null, 0, new defpackage.erb(this.g, this.f, null), 3);
            return;
        }
        if (epwVar == this.d) {
            defpackage.afgv afgvVar = this.b;
            aiwg aiwgVar = (aiwg) afgvVar.a;
            if (aiwgVar != null) {
                aiwgVar.s((java.util.concurrent.CancellationException) null);
            }
            afgvVar.a = null;
        }
        if (epwVar == defpackage.epw.ON_DESTROY) {
            this.e.w(defpackage.afbk.a);
        }
    }
}
