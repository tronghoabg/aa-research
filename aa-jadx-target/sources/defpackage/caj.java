package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class caj extends defpackage.cbd {
    public static final defpackage.caj a = new defpackage.caj();

    private caj() {
        super(0, 3);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        defpackage.cbf cbfVar;
        defpackage.bzm bzmVar = (defpackage.bzm) cbgVar.c(1);
        defpackage.bzh bzhVar = (defpackage.bzh) cbgVar.c(0);
        defpackage.bzs bzsVar = (defpackage.bzs) cbgVar.c(2);
        defpackage.bzp bzpVarF = bzmVar.f();
        if (cbeVar != null) {
            try {
                cbfVar = new defpackage.cbf(cbeVar, bzpVar);
            } catch (java.lang.Throwable th) {
                bzpVarF.w(false);
                throw th;
            }
        } else {
            cbfVar = null;
        }
        if (!bzsVar.b.c()) {
            defpackage.bvg.b("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        bzsVar.a.e(buqVar, bzpVarF, cdgVar, cbfVar);
        bzpVarF.w(true);
        bzpVar.v();
        bzpVar.W(bzmVar, bzmVar.d(bzhVar));
        bzpVar.x();
    }
}
