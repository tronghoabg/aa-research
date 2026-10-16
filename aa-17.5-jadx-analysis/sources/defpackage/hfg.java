package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class hfg implements afeh {
    private final /* synthetic */ int a;

    public /* synthetic */ hfg(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 6;
        boolean z = false;
        switch (this.a) {
            case 0:
                return hdq.d((abu) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 1:
                return hdq.d((abu) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 2:
                ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                ((Float) obj3).floatValue();
                return afak.a;
            case 3:
                bux buxVar = (bux) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((sm) obj).getClass();
                if (!buxVar.I((iIntValue & 17) != 16, iIntValue & 1)) {
                    buxVar.s();
                }
                return afak.a;
            case 4:
                bux buxVar2 = (bux) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((cfy) obj).getClass();
                if (buxVar2.I((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    atk.c(awd.c(cfy.e, 1.0f).a(new aix(-67518466441084928L, ckq.a)), buxVar2, 6);
                } else {
                    buxVar2.s();
                }
                return afak.a;
            case 5:
                cfy cfyVar = (cfy) obj;
                bux buxVar3 = (bux) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                cfyVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= true == buxVar3.C(cfyVar) ? 4 : 2;
                }
                if (buxVar3.I((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    cfy cfyVarU = awd.u(cfyVar, null, 3);
                    ctp ctpVarA = atp.a(atd.e, cfl.k, buxVar3, 54);
                    int iG = a.g(buxVar3.b());
                    ccx ccxVarN = buxVar3.N();
                    cfy cfyVarJ = bzi.j(buxVar3, cfyVarU);
                    afdr afdrVar = cwb.a;
                    buxVar3.M();
                    buxVar3.w();
                    if (buxVar3.G()) {
                        buxVar3.j(afdrVar);
                    } else {
                        buxVar3.y();
                    }
                    byq.c(buxVar3, ctpVarA, cwb.e);
                    byq.c(buxVar3, ccxVarN, cwb.d);
                    byq.c(buxVar3, Integer.valueOf(iG), cwb.f);
                    byq.b(buxVar3, cwb.g);
                    byq.c(buxVar3, cfyVarJ, cwb.c);
                    buxVar3.v(-1300981433);
                    buxVar3.o();
                    buxVar3.v(-1300924641);
                    buxVar3.o();
                    buxVar3.n();
                } else {
                    buxVar3.s();
                }
                return afak.a;
            case 6:
                fvb fvbVar = (fvb) obj;
                int iIntValue4 = ((Integer) obj3).intValue();
                fvbVar.getClass();
                jti.b(null, fvbVar, (bux) obj2, (iIntValue4 << 3) & 112);
                return afak.a;
            case 7:
                bux buxVar4 = (bux) obj2;
                ((Integer) obj3).intValue();
                int i2 = kkz.a;
                ((tio) obj).getClass();
                buxVar4.v(-2063219263);
                aezr aezrVar = thw.a;
                tiw tiwVarV = std.v("Car Control List", std.w(), buxVar4, 4);
                buxVar4.o();
                return tiwVarV;
            case 8:
                bux buxVar5 = (bux) obj2;
                ((Integer) obj3).intValue();
                int i3 = kkz.a;
                ((tio) obj).getClass();
                buxVar5.v(555120916);
                tiw tiwVarV2 = std.v("Hvac Demo", null, buxVar5, 6);
                buxVar5.o();
                return tiwVarV2;
            case 9:
                bux buxVar6 = (bux) obj2;
                ((Integer) obj3).intValue();
                int i4 = kkz.a;
                ((tio) obj).getClass();
                buxVar6.v(95642128);
                tiw tiwVarV3 = std.v("Car Controls unavailable", null, buxVar6, 6);
                buxVar6.o();
                return tiwVarV3;
            case 10:
                tjq tjqVar = (tjq) obj;
                bux buxVar7 = (bux) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                tjqVar.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= true == ((iIntValue5 & 8) == 0 ? buxVar7.C(tjqVar) : buxVar7.E(tjqVar)) ? 4 : 2;
                }
                if (buxVar7.I((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                    kkz.i(tjqVar, buxVar7, iIntValue5 & 14);
                } else {
                    buxVar7.s();
                }
                return afak.a;
            case 11:
                tiw tiwVar = (tiw) obj;
                bux buxVar8 = (bux) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                tiwVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= true == ((iIntValue6 & 8) == 0 ? buxVar8.C(tiwVar) : buxVar8.E(tiwVar)) ? 4 : 2;
                }
                if (buxVar8.I((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    int i5 = iIntValue6 & 14;
                    std.f(tiwVar, a.bR(acrz.k(), "Hero flag: "), null, false, null, buxVar8, i5, 62);
                    std.f(tiwVar, "CarControls flag: " + acrz.e(), null, false, null, buxVar8, i5, 62);
                    try {
                        mki.a.g();
                        ols.l(kio.b().e());
                        z = true;
                    } catch (Throwable unused) {
                    }
                    std.f(tiwVar, a.bR(z, "CarControlService available: "), null, false, null, buxVar8, i5, 62);
                } else {
                    buxVar8.s();
                }
                return afak.a;
            case 12:
                return aclh.q((tiw) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 13:
                return aclh.q((tiw) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 14:
                return aclh.q((tiw) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 15:
                return aclh.q((tiw) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 16:
                cfy cfyVar2 = (cfy) obj;
                bux buxVar9 = (bux) obj2;
                ((Integer) obj3).intValue();
                cfyVar2.getClass();
                buxVar9.v(-1129881008);
                Object objG = buxVar9.g();
                Object obj4 = buw.a;
                if (objG == obj4) {
                    int i6 = kml.a;
                    kml.a = i6 + 1;
                    objG = Integer.valueOf(i6);
                    buxVar9.x(objG);
                }
                int iIntValue7 = ((Number) objG).intValue();
                Object objG2 = buxVar9.g();
                if (objG2 == obj4) {
                    objG2 = new cia(iIntValue7, i);
                    buxVar9.x(objG2);
                }
                cfy cfyVarL = bxc.l(cfyVar2, (afec) objG2);
                Object objG3 = buxVar9.g();
                if (objG3 == obj4) {
                    objG3 = new kmk(iIntValue7, z ? 1 : 0);
                    buxVar9.x(objG3);
                }
                cfy cfyVarA = kml.a(cfyVarL, (afdr) objG3);
                buxVar9.o();
                return cfyVarA;
            case 17:
                bux buxVar10 = (bux) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((avy) obj).getClass();
                if (buxVar10.I((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    afao afaoVar = new afao((afar) kuw.f);
                    while (afaoVar.hasNext()) {
                        vy.a(awd.n(cfy.e, Float.NaN, 160.0f), null, null, null, null, bxc.i(1394972291, true, new kkw((kuw) afaoVar.next(), 11), buxVar10), buxVar10, 196614, 30);
                    }
                } else {
                    buxVar10.s();
                }
                return afak.a;
            case 18:
                return fww.N((lxw) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 19:
                return fww.M((mcd) obj, (bux) obj2, ((Integer) obj3).intValue());
            default:
                return fww.N((lxw) obj, (bux) obj2, ((Integer) obj3).intValue());
        }
    }
}
