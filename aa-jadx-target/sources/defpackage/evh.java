package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.evu(a = "navigation")
public class evh extends defpackage.evv<defpackage.evg> {
    private final defpackage.evw b;

    public evh(defpackage.evw evwVar) {
        evwVar.getClass();
        this.b = evwVar;
    }

    @Override // defpackage.evv
    public final /* synthetic */ defpackage.evf a() {
        return new defpackage.evg(this);
    }

    @Override // defpackage.evv
    public final void d(java.util.List list, defpackage.evk evkVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.euw euwVar = (defpackage.euw) it.next();
            defpackage.evf evfVar = euwVar.a;
            evfVar.getClass();
            defpackage.evg evgVar = (defpackage.evg) evfVar;
            defpackage.afgv afgvVar = new defpackage.afgv();
            afgvVar.a = euwVar.a();
            int iJ = evgVar.j();
            if (iJ == 0) {
                throw new java.lang.IllegalStateException("no start destination defined via app:startDestination for ".concat(evgVar.n()));
            }
            defpackage.evf evfVar2 = (defpackage.evf) defpackage.abc.a(evgVar.k(), iJ);
            if (evfVar2 == null) {
                defpackage.adnh adnhVar = evgVar.a;
                if (adnhVar.d == null) {
                    adnhVar.d = java.lang.String.valueOf(adnhVar.b);
                }
                java.lang.Object obj = adnhVar.d;
                obj.getClass();
                throw new java.lang.IllegalArgumentException(defpackage.a.bp((java.lang.String) obj, "navigation destination ", " is not a direct child of this NavGraph"));
            }
            defpackage.evv evvVarA = this.b.a(evfVar2.c);
            java.util.List listSingletonList = java.util.Collections.singletonList(f().a(evfVar2, evfVar2.d((android.os.Bundle) afgvVar.a)));
            listSingletonList.getClass();
            evvVarA.d(listSingletonList, evkVar);
        }
    }
}
