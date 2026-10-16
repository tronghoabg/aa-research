package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ltu {
    public static final j$.time.Duration a = defpackage.ysr.cB(500);
    public static final j$.time.Duration b = defpackage.ysr.cB(100);
    public static final j$.time.Duration c = defpackage.ysr.cB(500);
    public static final j$.time.Duration d = defpackage.ysr.cE(2);
    public static final j$.time.Duration e = defpackage.ysr.cE(0);

    public static final defpackage.ltn a(defpackage.zbe zbeVar, defpackage.eqp eqpVar, defpackage.ltw ltwVar) {
        return f(zbeVar, eqpVar, defpackage.tcu.B(eqpVar, new defpackage.ltk(7)), ltwVar);
    }

    public static final defpackage.ltn b(defpackage.zbe zbeVar, defpackage.eqp eqpVar, defpackage.eqp eqpVar2, defpackage.ltw ltwVar) {
        return new defpackage.ltt(eqpVar, eqpVar2, new defpackage.lto(zbeVar, 0), ltwVar, zbeVar);
    }

    public static final defpackage.ltn c(defpackage.zbe zbeVar, defpackage.eqp eqpVar, defpackage.ltw ltwVar) {
        return f(zbeVar, defpackage.ebo.f(eqpVar, new defpackage.ltk(5)), defpackage.tcu.B(eqpVar, new defpackage.ltk(6)), ltwVar);
    }

    public static final defpackage.ltw d() {
        if (defpackage.lmp.a.a().d()) {
            return new defpackage.ltp();
        }
        return null;
    }

    public static /* synthetic */ defpackage.ltn e(defpackage.zbe zbeVar, defpackage.eqp eqpVar, defpackage.eqp eqpVar2, defpackage.ltw ltwVar, int i) {
        defpackage.eqp eqpVarA;
        int i2 = 8;
        if ((i & 2) != 0) {
            if (defpackage.lmp.a.a().e()) {
                defpackage.eqs eqsVar = defpackage.lsd.a.a().c;
                defpackage.lsa lsaVar = new defpackage.lsa(i2);
                defpackage.afdo afdoVar = defpackage.tcu.a;
                defpackage.eqp eqpVarF = defpackage.ebo.f(eqsVar, new defpackage.nnp(lsaVar, 14));
                defpackage.eqp eqpVarA2 = ((defpackage.lhe) defpackage.mkp.a.i(defpackage.lhe.class)).a(defpackage.mqg.MEDIA);
                eqpVarA2.getClass();
                eqpVarA = defpackage.tcu.b(eqpVarF, eqpVarA2);
            } else {
                eqpVarA = ((defpackage.lhe) defpackage.mkp.a.i(defpackage.lhe.class)).a(defpackage.mqg.MEDIA);
            }
            eqpVarA.getClass();
            eqpVar = defpackage.tcu.t(eqpVarA);
        }
        defpackage.eqp eqpVar3 = eqpVar;
        if ((i & 4) != 0) {
            int i3 = 9;
            if (defpackage.lmp.a.a().e()) {
                defpackage.eqp eqpVarC = defpackage.tcu.C(defpackage.lsd.a.a().c, new defpackage.lsa(7));
                defpackage.eqp eqpVarA3 = ((defpackage.lhe) defpackage.mkp.a.i(defpackage.lhe.class)).a(defpackage.mqg.MEDIA);
                eqpVarA3.getClass();
                eqpVar2 = defpackage.tcu.b(eqpVarC, defpackage.tcu.C(eqpVarA3, new defpackage.lsa(i3)));
            } else {
                defpackage.eqp eqpVarA4 = ((defpackage.lhe) defpackage.mkp.a.i(defpackage.lhe.class)).a(defpackage.mqg.MEDIA);
                eqpVarA4.getClass();
                eqpVar2 = defpackage.tcu.C(eqpVarA4, new defpackage.lsa(i3));
            }
        }
        defpackage.eqp eqpVar4 = eqpVar2;
        if ((i & 8) != 0) {
            ltwVar = d();
        }
        eqpVar3.getClass();
        eqpVar4.getClass();
        return new defpackage.ltt(eqpVar3, eqpVar4, new defpackage.lto(zbeVar, 0), ltwVar, zbeVar);
    }

    public static /* synthetic */ defpackage.ltn f(defpackage.zbe zbeVar, defpackage.eqp eqpVar, defpackage.eqp eqpVar2, defpackage.ltw ltwVar) {
        return new defpackage.ltt(eqpVar, eqpVar2, new defpackage.lto(zbeVar, 0), ltwVar, zbeVar);
    }
}
