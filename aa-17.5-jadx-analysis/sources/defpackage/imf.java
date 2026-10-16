package defpackage;

import com.google.android.gms.car.CarInfo;
import j$.util.OptionalInt;

/* loaded from: classes.dex */
public final class imf {
    public int a;
    private final boolean b;

    public imf(CarInfo carInfo) {
        int i = carInfo.e;
        this.b = i >= 6;
        this.a = i >= 6 ? 2 : 3;
    }

    private final void f(abnp abnpVar, OptionalInt optionalInt) {
        if (this.b) {
            acwr acwrVar = acwr.a;
            boolean zT = acwrVar.gu().t();
            abnpVar.t();
            xkk xkkVar = (xkk) abnpVar.b;
            xkk xkkVar2 = xkk.a;
            xkkVar.b |= 256;
            xkkVar.k = zT;
            long jP = (optionalInt.isPresent() && optionalInt.getAsInt() == 5) ? acwr.p() : acwrVar.gu().n();
            abnf abnfVarD = abqs.d(jP / 1000, (int) ((jP % 1000) * 1000000));
            abnpVar.t();
            xkk xkkVar3 = (xkk) abnpVar.b;
            abnfVarD.getClass();
            xkkVar3.l = abnfVarD;
            xkkVar3.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        }
    }

    public final xkk a(int i) {
        abnp abnpVarN = xkk.a.n();
        abnf abnfVarC = abqs.c(i == 3 ? acwr.b() : acwr.c());
        abnpVarN.t();
        xkk xkkVar = (xkk) abnpVarN.b;
        abnfVarC.getClass();
        xkkVar.c = abnfVarC;
        xkkVar.b |= 1;
        boolean zW = acwr.w();
        abnpVarN.t();
        xkk xkkVar2 = (xkk) abnpVarN.b;
        xkkVar2.b |= 2;
        xkkVar2.d = zW;
        abnf abnfVarC2 = abqs.c(acwr.j());
        abnpVarN.t();
        xkk xkkVar3 = (xkk) abnpVarN.b;
        abnfVarC2.getClass();
        xkkVar3.e = abnfVarC2;
        xkkVar3.b |= 4;
        abnf abnfVarC3 = abqs.c(acwr.q());
        abnpVarN.t();
        xkk xkkVar4 = (xkk) abnpVarN.b;
        abnfVarC3.getClass();
        xkkVar4.f = abnfVarC3;
        xkkVar4.b |= 8;
        abnf abnfVarC4 = abqs.c(acwr.h());
        abnpVarN.t();
        xkk xkkVar5 = (xkk) abnpVarN.b;
        abnfVarC4.getClass();
        xkkVar5.g = abnfVarC4;
        xkkVar5.b |= 16;
        abnf abnfVarC5 = abqs.c(acwr.m());
        abnpVarN.t();
        xkk xkkVar6 = (xkk) abnpVarN.b;
        abnfVarC5.getClass();
        xkkVar6.h = abnfVarC5;
        xkkVar6.b |= 32;
        int iF = (int) acwr.f();
        abnpVarN.t();
        xkk xkkVar7 = (xkk) abnpVarN.b;
        xkkVar7.b |= 64;
        xkkVar7.i = iF;
        abnpVarN.t();
        xkk xkkVar8 = (xkk) abnpVarN.b;
        xkkVar8.b |= 256;
        xkkVar8.k = false;
        f(abnpVarN, OptionalInt.of(i));
        if (acwr.s() != 0) {
            abnf abnfVarC6 = abqs.c(acwr.s());
            abnpVarN.t();
            xkk xkkVar9 = (xkk) abnpVarN.b;
            abnfVarC6.getClass();
            xkkVar9.j = abnfVarC6;
            xkkVar9.b |= 128;
        }
        if (!this.b) {
            abnpVarN.t();
            xkk xkkVar10 = (xkk) abnpVarN.b;
            xkkVar10.b |= 2;
            xkkVar10.d = false;
        }
        return (xkk) abnpVarN.q();
    }

    public final synchronized xkk b(int i, Boolean bool) {
        xkk xkkVarA = (this.b && this.a == 2) ? a(i) : c(i);
        if (bool == null) {
            return xkkVarA;
        }
        abnp abnpVarK = xkkVarA.K();
        boolean zBooleanValue = bool.booleanValue();
        abnpVarK.t();
        xkk xkkVar = (xkk) abnpVarK.b;
        xkkVar.b = 2 | xkkVar.b;
        xkkVar.d = zBooleanValue;
        return (xkk) abnpVarK.q();
    }

    public final xkk c(int i) {
        abnp abnpVarN = xkk.a.n();
        abnf abnfVarC = abqs.c(i == 3 ? acwr.d() : acwr.e());
        abnpVarN.t();
        xkk xkkVar = (xkk) abnpVarN.b;
        abnfVarC.getClass();
        xkkVar.c = abnfVarC;
        xkkVar.b |= 1;
        boolean zX = acwr.x();
        abnpVarN.t();
        xkk xkkVar2 = (xkk) abnpVarN.b;
        xkkVar2.b |= 2;
        xkkVar2.d = zX;
        abnf abnfVarC2 = abqs.c(acwr.k());
        abnpVarN.t();
        xkk xkkVar3 = (xkk) abnpVarN.b;
        abnfVarC2.getClass();
        xkkVar3.e = abnfVarC2;
        xkkVar3.b |= 4;
        abnf abnfVarC3 = abqs.c(acwr.r());
        abnpVarN.t();
        xkk xkkVar4 = (xkk) abnpVarN.b;
        abnfVarC3.getClass();
        xkkVar4.f = abnfVarC3;
        xkkVar4.b |= 8;
        abnf abnfVarC4 = abqs.c(acwr.i());
        abnpVarN.t();
        xkk xkkVar5 = (xkk) abnpVarN.b;
        abnfVarC4.getClass();
        xkkVar5.g = abnfVarC4;
        xkkVar5.b |= 16;
        abnf abnfVarC5 = abqs.c(acwr.n());
        abnpVarN.t();
        xkk xkkVar6 = (xkk) abnpVarN.b;
        abnfVarC5.getClass();
        xkkVar6.h = abnfVarC5;
        xkkVar6.b |= 32;
        int iG = (int) acwr.g();
        abnpVarN.t();
        xkk xkkVar7 = (xkk) abnpVarN.b;
        xkkVar7.b |= 64;
        xkkVar7.i = iG;
        abnpVarN.t();
        xkk xkkVar8 = (xkk) abnpVarN.b;
        xkkVar8.b |= 256;
        xkkVar8.k = false;
        f(abnpVarN, OptionalInt.of(i));
        if (acwr.t() != 0) {
            abnf abnfVarC6 = abqs.c(acwr.t());
            abnpVarN.t();
            xkk xkkVar9 = (xkk) abnpVarN.b;
            abnfVarC6.getClass();
            xkkVar9.j = abnfVarC6;
            xkkVar9.b |= 128;
        }
        if (!this.b) {
            abnpVarN.t();
            xkk xkkVar10 = (xkk) abnpVarN.b;
            xkkVar10.b |= 2;
            xkkVar10.d = false;
        }
        return (xkk) abnpVarN.q();
    }

    public final synchronized xkk d() {
        if (this.b && this.a == 2) {
            abnp abnpVarN = xkk.a.n();
            acyq acyqVar = acyq.a;
            boolean zE = acyqVar.gu().e();
            abnpVarN.t();
            xkk xkkVar = (xkk) abnpVarN.b;
            xkkVar.b |= 1024;
            xkkVar.m = zE;
            long jC = acyqVar.gu().c();
            abnf abnfVarD = abqs.d(jC / 1000, (int) ((jC % 1000) * 1000000));
            abnpVarN.t();
            xkk xkkVar2 = (xkk) abnpVarN.b;
            abnfVarD.getClass();
            xkkVar2.n = abnfVarD;
            xkkVar2.b |= 2048;
            long jA = acyqVar.gu().a();
            abnf abnfVarD2 = abqs.d(jA / 1000, (int) ((jA % 1000) * 1000000));
            abnpVarN.t();
            xkk xkkVar3 = (xkk) abnpVarN.b;
            abnfVarD2.getClass();
            xkkVar3.o = abnfVarD2;
            xkkVar3.b |= 4096;
            f(abnpVarN, OptionalInt.empty());
            return (xkk) abnpVarN.q();
        }
        abnp abnpVarN2 = xkk.a.n();
        boolean zH = acyq.h();
        abnpVarN2.t();
        xkk xkkVar4 = (xkk) abnpVarN2.b;
        xkkVar4.b |= 1024;
        xkkVar4.m = zH;
        long jE = acyq.e();
        abnf abnfVarD3 = abqs.d(jE / 1000, (int) ((jE % 1000) * 1000000));
        abnpVarN2.t();
        xkk xkkVar5 = (xkk) abnpVarN2.b;
        abnfVarD3.getClass();
        xkkVar5.n = abnfVarD3;
        xkkVar5.b |= 2048;
        long jC2 = acyq.c();
        abnf abnfVarD4 = abqs.d(jC2 / 1000, (int) ((jC2 % 1000) * 1000000));
        abnpVarN2.t();
        xkk xkkVar6 = (xkk) abnpVarN2.b;
        abnfVarD4.getClass();
        xkkVar6.o = abnfVarD4;
        xkkVar6.b |= 4096;
        f(abnpVarN2, OptionalInt.empty());
        return (xkk) abnpVarN2.q();
    }

    public final synchronized void e(int i) {
        this.a = i;
    }
}
