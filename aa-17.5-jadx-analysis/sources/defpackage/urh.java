package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class urh implements tsc, tsb {
    public final trt a;
    public uqt b;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, tnr] */
    public urh(abcs abcsVar, Ctry ctry, urv urvVar, rjr rjrVar) {
        abfi abfiVar;
        int i;
        aekf aekfVar;
        abnr abnrVar = (abnr) abbd.a.n();
        abnp abnpVarN = abct.a.n();
        abnpVarN.Z(abcsVar);
        abnrVar.t();
        abbd abbdVar = (abbd) abnrVar.b;
        abct abctVar = (abct) abnpVarN.q();
        abctVar.getClass();
        abbdVar.g = abctVar;
        abbdVar.b |= 64;
        abfi abfiVar2 = ctry.a;
        abnrVar.t();
        abbd abbdVar2 = (abbd) abnrVar.b;
        abbdVar2.c = abfiVar2.f;
        abbdVar2.b |= 1;
        int i2 = ctry.b;
        abnrVar.t();
        abbd abbdVar3 = (abbd) abnrVar.b;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        abbdVar3.d = i3;
        abbdVar3.b |= 2;
        abbd abbdVar4 = (abbd) abnrVar.q();
        trr trrVar = new trr();
        trrVar.a(abfi.WORLD_ENCODING_LAT_LNG_DOUBLE);
        trrVar.b(3);
        aekg aekgVar = aekj.a;
        aekgVar.getClass();
        trrVar.b = aekgVar;
        trrVar.c = (byte) 3;
        trrVar.a(ctry.a);
        trrVar.b(ctry.b);
        if (trrVar.c != 3 || (abfiVar = trrVar.a) == null || (i = trrVar.d) == 0 || (aekfVar = trrVar.b) == null) {
            throw new IllegalStateException();
        }
        uqt uqtVar = new uqt(abbdVar4, rjrVar.b, (xxh) rjrVar.a, urvVar, new trt(((AtomicLong) ((gms) rjrVar.c).a).getAndIncrement()), new trs(abfiVar, i, aekfVar));
        this.b = uqtVar;
        this.a = uqtVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.tsb
    public final synchronized void a(tsa tsaVar) {
        tqx tqxVar;
        uqt uqtVar = this.b;
        if (uqtVar != null) {
            twi twiVarH = uqtVar.h();
            if (twiVarH != null) {
                abnp abnpVarN = tqx.a.n();
                toi toiVar = tsaVar.a;
                if (toiVar != null) {
                    abnp abnpVarN2 = aaih.a.n();
                    abnpVarN2.t();
                    aaih aaihVar = (aaih) abnpVarN2.b;
                    aaihVar.b |= 2;
                    aaihVar.d = toiVar.a;
                    abnpVarN2.t();
                    aaih aaihVar2 = (aaih) abnpVarN2.b;
                    aaihVar2.b |= 1;
                    aaihVar2.c = toiVar.b;
                    abnpVarN.t();
                    tqx tqxVar2 = (tqx) abnpVarN.b;
                    aaih aaihVar3 = (aaih) abnpVarN2.q();
                    aaihVar3.getClass();
                    tqxVar2.c = aaihVar3;
                    tqxVar2.b |= 1;
                }
                Float f = tsaVar.b;
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    abnpVarN.t();
                    tqx tqxVar3 = (tqx) abnpVarN.b;
                    tqxVar3.b |= 4;
                    tqxVar3.e = fFloatValue;
                }
                Float f2 = tsaVar.c;
                if (f2 != null) {
                    abnp abnpVarN3 = tqw.a.n();
                    float fFloatValue2 = f2.floatValue();
                    abnpVarN3.t();
                    tqw tqwVar = (tqw) abnpVarN3.b;
                    tqwVar.b |= 1;
                    tqwVar.c = fFloatValue2;
                    abnpVarN3.t();
                    tqw tqwVar2 = (tqw) abnpVarN3.b;
                    tqwVar2.d = 1;
                    tqwVar2.b |= 2;
                    abnpVarN.t();
                    tqx tqxVar4 = (tqx) abnpVarN.b;
                    tqw tqwVar3 = (tqw) abnpVarN3.q();
                    tqwVar3.getClass();
                    tqxVar4.f = tqwVar3;
                    tqxVar4.b |= 8;
                }
                Float f3 = tsaVar.d;
                if (f3 != null) {
                    abnp abnpVarN4 = tqw.a.n();
                    float fFloatValue3 = f3.floatValue();
                    abnpVarN4.t();
                    tqw tqwVar4 = (tqw) abnpVarN4.b;
                    tqwVar4.b |= 1;
                    tqwVar4.c = fFloatValue3;
                    abnpVarN4.t();
                    tqw tqwVar5 = (tqw) abnpVarN4.b;
                    tqwVar5.d = 2;
                    tqwVar5.b = 2 | tqwVar5.b;
                    abnpVarN.t();
                    tqx tqxVar5 = (tqx) abnpVarN.b;
                    tqw tqwVar6 = (tqw) abnpVarN4.q();
                    tqwVar6.getClass();
                    tqxVar5.f = tqwVar6;
                    tqxVar5.b |= 8;
                }
                Integer num = tsaVar.e;
                if (num != null) {
                    int iIntValue = num.intValue();
                    abnpVarN.t();
                    tqx tqxVar6 = (tqx) abnpVarN.b;
                    tqxVar6.b |= 16;
                    tqxVar6.g = iIntValue;
                }
                Integer num2 = tsaVar.f;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    abnpVarN.t();
                    tqx tqxVar7 = (tqx) abnpVarN.b;
                    tqxVar7.b |= 32;
                    tqxVar7.h = iIntValue2;
                }
                tqx tqxVar8 = (tqx) abnpVarN.q();
                synchronized (twiVarH) {
                    abnp abnpVarK = twiVarH.g.K();
                    abnpVarK.w(tqxVar8);
                    tqxVar = (tqx) abnpVarK.q();
                    twiVarH.g = tqxVar;
                    twiVarH.f = true;
                }
                qsb qsbVar = twiVarH.h;
                abcs abcsVarC = twiVarH.j();
                if (abcsVarC != abcs.a) {
                    qsbVar.d.put(abcsVarC, tqxVar);
                }
                twiVarH.c.g();
                return;
            }
            kzp kzpVar = new kzp(tsaVar, 14);
            dzg kzpVar2 = (tsaVar.b == null && tsaVar.e == null && tsaVar.f == null) ? null : new kzp(tsaVar, 15);
            abct abctVar = uqtVar.g.g;
            if (abctVar == null) {
                abctVar = abct.a;
            }
            if (abctVar.b.size() == 1) {
                abbd abbdVar = uqtVar.g;
                abfi abfiVarB = abfi.b(abbdVar.c);
                if (abfiVarB == null) {
                    abfiVarB = abfi.WORLD_ENCODING_UNKNOWN;
                }
                if (abfiVarB != abfi.WORLD_ENCODING_LAT_LNG_E7) {
                    ((ynz) uqt.a.a(uys.a).ai((char) 9609)).u("Point label position update not supported for non-LatLngE7 vertex encoding.");
                    return;
                }
                abct abctVar2 = abbdVar.g;
                if (abctVar2 == null) {
                    abctVar2 = abct.a;
                }
                abcs abcsVar = (abcs) abctVar2.b.get(0);
                abnr abnrVar = (abnr) abcsVar.K();
                abag abagVar = abcsVar.e;
                if (abagVar == null) {
                    abagVar = abag.a;
                }
                abnp abnpVarK2 = abagVar.K();
                kzpVar.a(abnpVarK2);
                abag abagVar2 = (abag) abnpVarK2.q();
                abnrVar.t();
                abcs abcsVar2 = (abcs) abnrVar.b;
                abagVar2.getClass();
                abcsVar2.e = abagVar2;
                abcsVar2.b |= 8;
                if (kzpVar2 != null) {
                    abnh abnhVar = abhx.g;
                    abcsVar.j(abnhVar);
                    Object objJ = abcsVar.w.j(abnhVar.d);
                    abnp abnpVarK3 = ((abij) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).K();
                    kzpVar2.a(abnpVarK3);
                    abnrVar.bc(abnhVar, (abij) abnpVarK3.q());
                }
                abnr abnrVar2 = (abnr) uqtVar.g.K();
                abnp abnpVarN5 = abct.a.n();
                abnpVarN5.Z((abcs) abnrVar.q());
                abct abctVar3 = (abct) abnpVarN5.q();
                abnrVar2.t();
                abbd abbdVar2 = (abbd) abnrVar2.b;
                abctVar3.getClass();
                abbdVar2.g = abctVar3;
                abbdVar2.b |= 64;
                uqtVar.g = (abbd) abnrVar2.q();
                uqtVar.i(uqtVar.g, uqtVar.h);
            }
        }
    }

    @Override // defpackage.tsc
    public final synchronized void b() {
        uqt uqtVar = this.b;
        if (uqtVar != null) {
            uqtVar.c();
        }
    }

    @Override // defpackage.tsc
    public final synchronized void c() {
        uqt uqtVar = this.b;
        if (uqtVar != null) {
            uqtVar.d();
            this.b = null;
        }
    }

    @Override // defpackage.tsc
    public final synchronized void d() {
        uqt uqtVar = this.b;
        if (uqtVar != null) {
            uqtVar.f();
        }
    }
}
