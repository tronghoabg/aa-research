package defpackage;

/* loaded from: classes.dex */
public final class cad extends cax {
    public static final cad a = new cad();

    private cad() {
        super(0, 3);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        caz cazVar;
        bzg bzgVar = (bzg) cbaVar.c(1);
        bzb bzbVar = (bzb) cbaVar.c(0);
        bzm bzmVar = (bzm) cbaVar.c(2);
        bzj bzjVarF = bzgVar.f();
        if (cayVar != null) {
            try {
                cazVar = new caz(cayVar, bzjVar);
            } catch (Throwable th) {
                bzjVarF.w(false);
                throw th;
            }
        } else {
            cazVar = null;
        }
        if (!bzmVar.b.c()) {
            buz.b("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        bzmVar.a.e(bujVar, bzjVarF, cdaVar, cazVar);
        bzjVarF.w(true);
        bzjVar.v();
        bzjVar.W(bzgVar, bzgVar.d(bzbVar));
        bzjVar.x();
    }
}
