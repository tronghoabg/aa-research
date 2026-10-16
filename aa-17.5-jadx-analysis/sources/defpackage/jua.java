package defpackage;

/* loaded from: classes2.dex */
public final class jua {
    public static final /* synthetic */ int a = 0;

    static {
        yph.c("CarApp.H.Tem");
    }

    public static final void a(final fyd fydVar, final cfy cfyVar, bux buxVar, int i) {
        int i2;
        jtw jtwVar;
        ktf ktfVarE;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1252222038);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fydVar) : buxVarC.E(fydVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            final fwf fwfVar = (fwf) buxVarC.f(fwg.a);
            gfk gfkVar = fydVar.b;
            final cmw cmwVarA = gfkVar.a(jtk.e(fwfVar), buxVarC, 64);
            gfa gfaVar = fydVar.a;
            final gez gezVarV = fwl.v(null, null, null, false, gfaVar, buxVarC, 0, 31);
            final deu deuVar = gezVarV.a;
            afdr afdrVar = fydVar.c;
            int i4 = 3;
            jtw jtwVar2 = new jtw(afdrVar, i4);
            afdr jtwVar3 = fydVar.g;
            if (jtwVar3 == null) {
                jtwVar3 = new jtw(afdrVar, i4);
            }
            final afdr afdrVar2 = jtwVar3;
            if (fydVar.i == 1) {
                buxVarC.v(1139776902);
                aezr aezrVar = ktf.a;
                jtwVar = jtwVar2;
                ktfVarE = kgq.f(0L, 0L, 0L, 0L, buxVarC, 255);
                buxVar2 = buxVarC;
                ((bvv) buxVar2).Y(false);
            } else {
                jtwVar = jtwVar2;
                buxVarC.v(1139834128);
                aezr aezrVar2 = ktf.a;
                ktfVarE = kgq.e(czz.at(buxVarC).E, 0L, 0L, 0L, 0L, 0L, 0L, buxVarC, 254);
                buxVar2 = buxVarC;
                ((bvv) buxVar2).Y(false);
            }
            final jtw jtwVar4 = jtwVar;
            bux buxVar3 = buxVar2;
            jtk.d(gfaVar, gfkVar, ktfVarE, fydVar.d, fydVar.h, false, bxc.i(359905974, true, new afeh() { // from class: jtz
                @Override // defpackage.afeh
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    kzt kztVar = (kzt) obj;
                    bux buxVar4 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i5 = jua.a;
                    kztVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != ((iIntValue & 8) == 0 ? buxVar4.C(kztVar) : buxVar4.E(kztVar)) ? 2 : 4;
                    }
                    if (buxVar4.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        cmw cmwVar = cmwVarA;
                        cfy cfyVar2 = cfyVar;
                        afdr afdrVar3 = afdrVar2;
                        afdr afdrVar4 = jtwVar4;
                        fwf fwfVar2 = fwfVar;
                        fyd fydVar2 = fydVar;
                        deu deuVar2 = deuVar;
                        if (deuVar2 != null && deuVar2.a() != 0) {
                            gez gezVar = gezVarV;
                            buxVar4.v(1720548949);
                            long j = fydVar2.e;
                            long j2 = fydVar2.f;
                            ksy ksyVarF = jtk.f(fwfVar2);
                            Object obj4 = kztVar.a;
                            ksy ksyVar = ksy.a;
                            jyw.i(deuVar2, j, afdrVar4, afdrVar3, cfyVar2, j2, ksyVarF, cmwVar, null, null, (ktf) obj4, gezVar.b, buxVar4, 16777216, 0);
                            buxVar4.o();
                            return afak.a;
                        }
                        buxVar4.v(1721001580);
                        buxVar4.o();
                        if (cmwVar != null) {
                            buxVar4.v(1721043709);
                            long j3 = fydVar2.e;
                            long j4 = fydVar2.f;
                            ksy ksyVarF2 = jtk.f(fwfVar2);
                            Object obj5 = kztVar.a;
                            ksy ksyVar2 = ksy.a;
                            jyw.f(cmwVar, j3, afdrVar4, afdrVar3, cfyVar2, j4, ksyVarF2, null, null, (ktf) obj5, buxVar4, 8, 384);
                            buxVar4.o();
                        } else {
                            buxVar4.v(1721371596);
                            buxVar4.o();
                        }
                    } else {
                        buxVar4.s();
                    }
                    return afak.a;
                }
            }, buxVar2), buxVar3, 1572928, 32);
            buxVarC = buxVar3;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(fydVar, cfyVar, i, 7);
        }
    }
}
