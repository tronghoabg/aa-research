package defpackage;

import j$.time.Duration;

/* loaded from: classes.dex */
public final class lto {
    public static final Duration a = wub.ak(500);
    public static final Duration b = wub.ak(100);
    public static final Duration c = wub.ak(500);
    public static final Duration d = wub.an(2);
    public static final Duration e = wub.an(0);

    public static final lth a(yzz yzzVar, eqj eqjVar, ltq ltqVar) {
        return f(yzzVar, eqjVar, tby.B(eqjVar, new lti(3)), ltqVar);
    }

    public static final lth b(yzz yzzVar, eqj eqjVar, eqj eqjVar2, ltq ltqVar) {
        return new ltn(eqjVar, eqjVar2, new ltd(yzzVar, 2), ltqVar, yzzVar);
    }

    public static final lth c(yzz yzzVar, eqj eqjVar, ltq ltqVar) {
        return f(yzzVar, eqy.b(eqjVar, new lti(0)), tby.B(eqjVar, new lti(2)), ltqVar);
    }

    public static final ltq d() {
        if (lmi.a.a().d()) {
            return new ltj();
        }
        return null;
    }

    public static /* synthetic */ lth e(yzz yzzVar, eqj eqjVar, eqj eqjVar2, ltq ltqVar, int i) {
        eqj eqjVarA;
        if ((i & 2) != 0) {
            if (lmi.a.a().e()) {
                eqm eqmVar = lrw.a.a().c;
                lta ltaVar = new lta(6);
                afco afcoVar = tby.a;
                eqj eqjVarB = eqy.b(eqmVar, new njq(ltaVar, 15));
                eqj eqjVarA2 = ((lgx) mki.a.i(lgx.class)).a(mpz.d);
                eqjVarA2.getClass();
                eqjVarA = tby.b(eqjVarB, eqjVarA2);
            } else {
                eqjVarA = ((lgx) mki.a.i(lgx.class)).a(mpz.d);
            }
            eqjVarA.getClass();
            eqjVar = tby.t(eqjVarA);
        }
        eqj eqjVar3 = eqjVar;
        if ((i & 4) != 0) {
            int i2 = 7;
            if (lmi.a.a().e()) {
                eqj eqjVarC = tby.C(lrw.a.a().c, new lta(5));
                eqj eqjVarA3 = ((lgx) mki.a.i(lgx.class)).a(mpz.d);
                eqjVarA3.getClass();
                eqjVar2 = tby.b(eqjVarC, tby.C(eqjVarA3, new lta(i2)));
            } else {
                eqj eqjVarA4 = ((lgx) mki.a.i(lgx.class)).a(mpz.d);
                eqjVarA4.getClass();
                eqjVar2 = tby.C(eqjVarA4, new lta(i2));
            }
        }
        eqj eqjVar4 = eqjVar2;
        if ((i & 8) != 0) {
            ltqVar = d();
        }
        eqjVar3.getClass();
        eqjVar4.getClass();
        return new ltn(eqjVar3, eqjVar4, new ltd(yzzVar, 2), ltqVar, yzzVar);
    }

    public static /* synthetic */ lth f(yzz yzzVar, eqj eqjVar, eqj eqjVar2, ltq ltqVar) {
        return new ltn(eqjVar, eqjVar2, new ltd(yzzVar, 2), ltqVar, yzzVar);
    }
}
