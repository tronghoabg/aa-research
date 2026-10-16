package defpackage;

/* loaded from: classes.dex */
public final class cam extends cax {
    public static final cam a = new cam();

    private cam() {
        super(0, 0);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        if (bzjVar.m != 0) {
            buz.b("Cannot reset when inserting");
        }
        bzjVar.G();
        bzjVar.o = 0;
        bzjVar.p = bzjVar.e() - bzjVar.g;
        bzjVar.h = 0;
        bzjVar.i = 0;
        bzjVar.n = 0;
    }
}
