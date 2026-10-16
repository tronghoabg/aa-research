package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class imn {
    public int a;
    private final boolean b;

    public imn(com.google.android.gms.car.CarInfo carInfo) {
        int i = carInfo.e;
        this.b = i >= 6;
        this.a = i >= 6 ? 2 : 3;
    }

    private final void f(defpackage.abor aborVar, j$.util.OptionalInt optionalInt) {
        if (this.b) {
            defpackage.acxt acxtVar = defpackage.acxt.a;
            boolean zT = acxtVar.fF().t();
            aborVar.t();
            defpackage.xll xllVar = (defpackage.xll) aborVar.b;
            defpackage.xll xllVar2 = defpackage.xll.a;
            xllVar.b |= 256;
            xllVar.k = zT;
            long jP = (optionalInt.isPresent() && optionalInt.getAsInt() == 5) ? defpackage.acxt.p() : acxtVar.fF().n();
            defpackage.aboh abohVarD = defpackage.abrv.d(jP / 1000, (int) ((jP % 1000) * 1000000));
            aborVar.t();
            defpackage.xll xllVar3 = (defpackage.xll) aborVar.b;
            abohVarD.getClass();
            xllVar3.l = abohVarD;
            xllVar3.b |= 512;
        }
    }

    public final defpackage.xll a(int i) {
        defpackage.abor aborVarN = defpackage.xll.a.n();
        defpackage.aboh abohVarC = defpackage.abrv.c(i == 3 ? defpackage.acxt.b() : defpackage.acxt.c());
        aborVarN.t();
        defpackage.xll xllVar = (defpackage.xll) aborVarN.b;
        abohVarC.getClass();
        xllVar.c = abohVarC;
        xllVar.b |= 1;
        boolean zW = defpackage.acxt.w();
        aborVarN.t();
        defpackage.xll xllVar2 = (defpackage.xll) aborVarN.b;
        xllVar2.b |= 2;
        xllVar2.d = zW;
        defpackage.aboh abohVarC2 = defpackage.abrv.c(defpackage.acxt.j());
        aborVarN.t();
        defpackage.xll xllVar3 = (defpackage.xll) aborVarN.b;
        abohVarC2.getClass();
        xllVar3.e = abohVarC2;
        xllVar3.b |= 4;
        defpackage.aboh abohVarC3 = defpackage.abrv.c(defpackage.acxt.q());
        aborVarN.t();
        defpackage.xll xllVar4 = (defpackage.xll) aborVarN.b;
        abohVarC3.getClass();
        xllVar4.f = abohVarC3;
        xllVar4.b |= 8;
        defpackage.aboh abohVarC4 = defpackage.abrv.c(defpackage.acxt.h());
        aborVarN.t();
        defpackage.xll xllVar5 = (defpackage.xll) aborVarN.b;
        abohVarC4.getClass();
        xllVar5.g = abohVarC4;
        xllVar5.b |= 16;
        defpackage.aboh abohVarC5 = defpackage.abrv.c(defpackage.acxt.m());
        aborVarN.t();
        defpackage.xll xllVar6 = (defpackage.xll) aborVarN.b;
        abohVarC5.getClass();
        xllVar6.h = abohVarC5;
        xllVar6.b |= 32;
        int iF = (int) defpackage.acxt.f();
        aborVarN.t();
        defpackage.xll xllVar7 = (defpackage.xll) aborVarN.b;
        xllVar7.b |= 64;
        xllVar7.i = iF;
        aborVarN.t();
        defpackage.xll xllVar8 = (defpackage.xll) aborVarN.b;
        xllVar8.b |= 256;
        xllVar8.k = false;
        f(aborVarN, j$.util.OptionalInt.of(i));
        if (defpackage.acxt.s() != 0) {
            defpackage.aboh abohVarC6 = defpackage.abrv.c(defpackage.acxt.s());
            aborVarN.t();
            defpackage.xll xllVar9 = (defpackage.xll) aborVarN.b;
            abohVarC6.getClass();
            xllVar9.j = abohVarC6;
            xllVar9.b |= 128;
        }
        if (!this.b) {
            aborVarN.t();
            defpackage.xll xllVar10 = (defpackage.xll) aborVarN.b;
            xllVar10.b |= 2;
            xllVar10.d = false;
        }
        return (defpackage.xll) aborVarN.q();
    }

    public final synchronized defpackage.xll b(int i, java.lang.Boolean bool) {
        defpackage.xll xllVarA = (this.b && this.a == 2) ? a(i) : c(i);
        if (bool == null) {
            return xllVarA;
        }
        defpackage.abor aborVarK = xllVarA.K();
        boolean zBooleanValue = bool.booleanValue();
        aborVarK.t();
        defpackage.xll xllVar = (defpackage.xll) aborVarK.b;
        xllVar.b = 2 | xllVar.b;
        xllVar.d = zBooleanValue;
        return (defpackage.xll) aborVarK.q();
    }

    public final defpackage.xll c(int i) {
        defpackage.abor aborVarN = defpackage.xll.a.n();
        defpackage.aboh abohVarC = defpackage.abrv.c(i == 3 ? defpackage.acxt.d() : defpackage.acxt.e());
        aborVarN.t();
        defpackage.xll xllVar = (defpackage.xll) aborVarN.b;
        abohVarC.getClass();
        xllVar.c = abohVarC;
        xllVar.b |= 1;
        boolean zX = defpackage.acxt.x();
        aborVarN.t();
        defpackage.xll xllVar2 = (defpackage.xll) aborVarN.b;
        xllVar2.b |= 2;
        xllVar2.d = zX;
        defpackage.aboh abohVarC2 = defpackage.abrv.c(defpackage.acxt.k());
        aborVarN.t();
        defpackage.xll xllVar3 = (defpackage.xll) aborVarN.b;
        abohVarC2.getClass();
        xllVar3.e = abohVarC2;
        xllVar3.b |= 4;
        defpackage.aboh abohVarC3 = defpackage.abrv.c(defpackage.acxt.r());
        aborVarN.t();
        defpackage.xll xllVar4 = (defpackage.xll) aborVarN.b;
        abohVarC3.getClass();
        xllVar4.f = abohVarC3;
        xllVar4.b |= 8;
        defpackage.aboh abohVarC4 = defpackage.abrv.c(defpackage.acxt.i());
        aborVarN.t();
        defpackage.xll xllVar5 = (defpackage.xll) aborVarN.b;
        abohVarC4.getClass();
        xllVar5.g = abohVarC4;
        xllVar5.b |= 16;
        defpackage.aboh abohVarC5 = defpackage.abrv.c(defpackage.acxt.n());
        aborVarN.t();
        defpackage.xll xllVar6 = (defpackage.xll) aborVarN.b;
        abohVarC5.getClass();
        xllVar6.h = abohVarC5;
        xllVar6.b |= 32;
        int iG = (int) defpackage.acxt.g();
        aborVarN.t();
        defpackage.xll xllVar7 = (defpackage.xll) aborVarN.b;
        xllVar7.b |= 64;
        xllVar7.i = iG;
        aborVarN.t();
        defpackage.xll xllVar8 = (defpackage.xll) aborVarN.b;
        xllVar8.b |= 256;
        xllVar8.k = false;
        f(aborVarN, j$.util.OptionalInt.of(i));
        if (defpackage.acxt.t() != 0) {
            defpackage.aboh abohVarC6 = defpackage.abrv.c(defpackage.acxt.t());
            aborVarN.t();
            defpackage.xll xllVar9 = (defpackage.xll) aborVarN.b;
            abohVarC6.getClass();
            xllVar9.j = abohVarC6;
            xllVar9.b |= 128;
        }
        if (!this.b) {
            aborVarN.t();
            defpackage.xll xllVar10 = (defpackage.xll) aborVarN.b;
            xllVar10.b |= 2;
            xllVar10.d = false;
        }
        return (defpackage.xll) aborVarN.q();
    }

    public final synchronized defpackage.xll d() {
        if (this.b && this.a == 2) {
            defpackage.abor aborVarN = defpackage.xll.a.n();
            defpackage.aczs aczsVar = defpackage.aczs.a;
            boolean zE = aczsVar.fF().e();
            aborVarN.t();
            defpackage.xll xllVar = (defpackage.xll) aborVarN.b;
            xllVar.b |= 1024;
            xllVar.m = zE;
            long jC = aczsVar.fF().c();
            defpackage.aboh abohVarD = defpackage.abrv.d(jC / 1000, (int) ((jC % 1000) * 1000000));
            aborVarN.t();
            defpackage.xll xllVar2 = (defpackage.xll) aborVarN.b;
            abohVarD.getClass();
            xllVar2.n = abohVarD;
            xllVar2.b |= 2048;
            long jA = aczsVar.fF().a();
            defpackage.aboh abohVarD2 = defpackage.abrv.d(jA / 1000, (int) ((jA % 1000) * 1000000));
            aborVarN.t();
            defpackage.xll xllVar3 = (defpackage.xll) aborVarN.b;
            abohVarD2.getClass();
            xllVar3.o = abohVarD2;
            xllVar3.b |= 4096;
            f(aborVarN, j$.util.OptionalInt.empty());
            return (defpackage.xll) aborVarN.q();
        }
        defpackage.abor aborVarN2 = defpackage.xll.a.n();
        boolean zH = defpackage.aczs.h();
        aborVarN2.t();
        defpackage.xll xllVar4 = (defpackage.xll) aborVarN2.b;
        xllVar4.b |= 1024;
        xllVar4.m = zH;
        long jE = defpackage.aczs.e();
        defpackage.aboh abohVarD3 = defpackage.abrv.d(jE / 1000, (int) ((jE % 1000) * 1000000));
        aborVarN2.t();
        defpackage.xll xllVar5 = (defpackage.xll) aborVarN2.b;
        abohVarD3.getClass();
        xllVar5.n = abohVarD3;
        xllVar5.b |= 2048;
        long jC2 = defpackage.aczs.c();
        defpackage.aboh abohVarD4 = defpackage.abrv.d(jC2 / 1000, (int) ((jC2 % 1000) * 1000000));
        aborVarN2.t();
        defpackage.xll xllVar6 = (defpackage.xll) aborVarN2.b;
        abohVarD4.getClass();
        xllVar6.o = abohVarD4;
        xllVar6.b |= 4096;
        f(aborVarN2, j$.util.OptionalInt.empty());
        return (defpackage.xll) aborVarN2.q();
    }

    public final synchronized void e(int i) {
        this.a = i;
    }
}
