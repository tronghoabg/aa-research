package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bzr extends cax {
    public static final bzr a = new bzr();

    private bzr() {
        super(0, 4);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        bwl bwlVar = (bwl) cbaVar.c(2);
        bwl bwlVar2 = (bwl) cbaVar.c(3);
        bvb bvbVar = (bvb) cbaVar.c(1);
        kgx kgxVarW = (kgx) cbaVar.c(0);
        if (kgxVarW == null && (kgxVarW = bvbVar.w(bwlVar)) == null) {
            buz.a("Could not resolve state for movable content");
            throw new aezp();
        }
        Object obj = kgxVarW.a;
        if (bzjVar.m > 0 || bzjVar.i(bzjVar.o + 1) != 1) {
            buz.b("Check failed");
        }
        int i = bzjVar.o;
        int i2 = bzjVar.h;
        int i3 = bzjVar.i;
        bzjVar.u(1);
        bzjVar.J();
        bzjVar.v();
        bzj bzjVarF = ((bzg) obj).f();
        try {
            List listG = bzi.g(bzjVarF, 2, bzjVar, false, true, true);
            bzjVarF.w(true);
            bzjVar.x();
            bzjVar.V();
            bzjVar.o = i;
            bzjVar.h = i2;
            bzjVar.i = i3;
            bxc.c(bzjVar, listG, bwlVar2.f);
        } catch (Throwable th) {
            bzjVarF.w(false);
            throw th;
        }
    }
}
