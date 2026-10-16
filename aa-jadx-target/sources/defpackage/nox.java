package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class nox implements defpackage.eqt {
    final /* synthetic */ defpackage.noz a;
    private defpackage.ksh b;

    public nox(defpackage.noz nozVar) {
        this.a = nozVar;
    }

    @Override // defpackage.eqt
    public final /* bridge */ /* synthetic */ void ea(java.lang.Object obj) {
        android.content.Context contextRequireContext;
        android.content.Context contextA;
        defpackage.ksh kshVar = (defpackage.ksh) obj;
        defpackage.ksh kshVar2 = this.b;
        if (kshVar2 == null) {
            this.b = kshVar;
            return;
        }
        if (kshVar2 == kshVar) {
            return;
        }
        this.b = kshVar;
        defpackage.noz nozVar = this.a;
        android.support.v4.app.Fragment fragmentA = nozVar.a();
        if (fragmentA == null || fragmentA.getContext() == null || contextRequireContext == (contextA = defpackage.ksi.d().a((contextRequireContext = fragmentA.requireContext())))) {
            return;
        }
        if (!nozVar.d) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.nou.a.h()).ai((char) 5317)).u("Attempted to recreate Fragment when not ready. Context changes will be applied when creating View.");
            return;
        }
        rcs rcsVarA = rcs.a(nozVar.c);
        nozVar.i(contextA);
        nozVar.j.ad();
        if (rcsVarA != null) {
            rcsVarA.b(nozVar.c);
        }
    }
}
