package defpackage;

/* loaded from: classes.dex */
public final class cab extends cax {
    public static final cab a = new cab();

    private cab() {
        super(1, 2);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        Object objInvoke = ((afdr) cbaVar.c(0)).invoke();
        bzb bzbVar = (bzb) cbaVar.c(1);
        int iA = cbaVar.a(0);
        bzjVar.P(bzjVar.a(bzbVar), objInvoke);
        bujVar.j(iA, objInvoke);
        bujVar.d(objInvoke);
    }

    @Override // defpackage.cax
    protected final bzb b(cba cbaVar) {
        return (bzb) cbaVar.c(1);
    }
}
