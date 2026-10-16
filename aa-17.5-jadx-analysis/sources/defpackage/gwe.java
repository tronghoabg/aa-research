package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class gwe implements afei {
    private final /* synthetic */ int a;

    public /* synthetic */ gwe(int i) {
        this.a = i;
    }

    @Override // defpackage.afei
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        final int i8 = 1;
        switch (this.a) {
            case 0:
                gri griVar = (gri) obj;
                cfy cfyVar = (cfy) obj2;
                bux buxVar = (bux) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                griVar.getClass();
                cfyVar.getClass();
                if ((iIntValue & 6) == 0) {
                    i = (true != ((iIntValue & 8) == 0 ? buxVar.C(griVar) : buxVar.E(griVar)) ? 2 : 4) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= true == buxVar.C(cfyVar) ? 32 : 16;
                }
                if (buxVar.I((i & 147) != 146, i & 1)) {
                    gro.d(griVar, cfyVar, buxVar, i & 126);
                } else {
                    buxVar.s();
                }
                return afak.a;
            case 1:
                czz.B((col) obj, (Map) obj2, (bux) obj3, ((Integer) obj4).intValue() & 126);
                return afak.a;
            case 2:
                gpl gplVar = (gpl) obj;
                cfy cfyVar2 = (cfy) obj2;
                bux buxVar2 = (bux) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                gplVar.getClass();
                cfyVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i2 = (true != ((iIntValue2 & 8) == 0 ? buxVar2.C(gplVar) : buxVar2.E(gplVar)) ? 2 : 4) | iIntValue2;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= true == buxVar2.C(cfyVar2) ? 32 : 16;
                }
                if (buxVar2.I((i2 & 147) != 146, i2 & 1)) {
                    gka.c(gplVar, cfyVar2, buxVar2, (i2 & 14) | 8 | (i2 & 112));
                } else {
                    buxVar2.s();
                }
                return afak.a;
            case 3:
                gqc gqcVar = (gqc) obj;
                cfy cfyVar3 = (cfy) obj2;
                bux buxVar3 = (bux) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                gqcVar.getClass();
                cfyVar3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i3 = (true != ((iIntValue3 & 8) == 0 ? buxVar3.C(gqcVar) : buxVar3.E(gqcVar)) ? 2 : 4) | iIntValue3;
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i3 |= true == buxVar3.C(cfyVar3) ? 32 : 16;
                }
                if (buxVar3.I((i3 & 147) != 146, i3 & 1)) {
                    gpm.c(gqcVar, cfyVar3, buxVar3, i3 & 126);
                } else {
                    buxVar3.s();
                }
                return afak.a;
            case 4:
                gtw gtwVar = (gtw) obj;
                bux buxVar4 = (bux) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                gtwVar.getClass();
                ((cfy) obj2).getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= true != ((iIntValue4 & 8) == 0 ? buxVar4.C(gtwVar) : buxVar4.E(gtwVar)) ? 2 : 4;
                }
                if (buxVar4.I((iIntValue4 & 131) != 130, iIntValue4 & 1)) {
                    gmt.d(gtwVar, null, buxVar4, (iIntValue4 & 14) | gtw.a);
                } else {
                    buxVar4.s();
                }
                return afak.a;
            case 5:
                hcl hclVar = (hcl) obj;
                cfy cfyVar4 = (cfy) obj2;
                bux buxVar5 = (bux) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                hclVar.getClass();
                cfyVar4.getClass();
                if ((iIntValue5 & 6) == 0) {
                    i4 = (true != ((iIntValue5 & 8) == 0 ? buxVar5.C(hclVar) : buxVar5.E(hclVar)) ? 2 : 4) | iIntValue5;
                } else {
                    i4 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i4 |= true == buxVar5.C(cfyVar4) ? 32 : 16;
                }
                if (buxVar5.I((i4 & 147) != 146, i4 & 1)) {
                    hbx.b(hclVar, cfyVar4, null, null, buxVar5, (i4 & 14) | 8 | (i4 & 112), 12);
                } else {
                    buxVar5.s();
                }
                return afak.a;
            case 6:
                hcq hcqVar = (hcq) obj;
                cfy cfyVar5 = (cfy) obj2;
                bux buxVar6 = (bux) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                hcqVar.getClass();
                cfyVar5.getClass();
                if ((iIntValue6 & 6) == 0) {
                    i5 = iIntValue6 | (true != ((iIntValue6 & 8) == 0 ? buxVar6.C(hcqVar) : buxVar6.E(hcqVar)) ? 2 : 4);
                } else {
                    i5 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i5 |= true == buxVar6.C(cfyVar5) ? 32 : 16;
                }
                if (buxVar6.I((i5 & 147) != 146, i5 & 1)) {
                    throw null;
                }
                buxVar6.s();
                return afak.a;
            case 7:
                tiw tiwVar = (tiw) obj;
                bux buxVar7 = (bux) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                tiwVar.getClass();
                obj2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    i6 = (true != ((iIntValue7 & 8) == 0 ? buxVar7.C(tiwVar) : buxVar7.E(tiwVar)) ? 2 : 4) | iIntValue7;
                } else {
                    i6 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i6 |= true == ((iIntValue7 & 64) == 0 ? buxVar7.C(obj2) : buxVar7.E(obj2)) ? 32 : 16;
                }
                if (buxVar7.I((i6 & 147) != 146, i6 & 1)) {
                    std.f(tiwVar, obj2 instanceof Object[] ? woy.dy((Object[]) obj2, ", ", null, null, null, 62) : obj2.toString(), null, false, null, buxVar7, i6 & 14, 62);
                } else {
                    buxVar7.s();
                }
                return afak.a;
            case 8:
                oqb oqbVar = (oqb) obj;
                cfy cfyVar6 = (cfy) obj2;
                bux buxVar8 = (bux) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                oqbVar.getClass();
                cfyVar6.getClass();
                if ((iIntValue8 & 6) == 0) {
                    i7 = iIntValue8 | (true == ((iIntValue8 & 8) == 0 ? buxVar8.C(oqbVar) : buxVar8.E(oqbVar)) ? 4 : 2);
                } else {
                    i7 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i7 |= true == buxVar8.C(cfyVar6) ? 32 : 16;
                }
                if (buxVar8.I((i7 & 147) != 146, i7 & 1)) {
                    opg.a(oqbVar, opr.a.a(), cfyVar6, null, buxVar8, (i7 & 14) | 72 | ((i7 << 3) & 896), 8);
                } else {
                    buxVar8.s();
                }
                return afak.a;
            default:
                ((Integer) obj).intValue();
                bux buxVar9 = (bux) obj3;
                ((Integer) obj4).intValue();
                obj2.getClass();
                final long jH = cjv.h(kfn.i(buxVar9).R(), 0.15f);
                cct cctVarI = bxc.i(821495276, true, new mxt(jH, i8), buxVar9);
                cct cctVarI2 = bxc.i(-99587966, true, new afeg() { // from class: mww
                    @Override // defpackage.afeg
                    public final Object invoke(Object obj5, Object obj6) {
                        if (i8 != 0) {
                            bux buxVar10 = (bux) obj5;
                            int iIntValue9 = ((Integer) obj6).intValue();
                            if (buxVar10.I((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                                cmv cmvVar = new cmv(jH);
                                cfv cfvVar = cfy.e;
                                float f = nai.a;
                                ca.bb(cmvVar, null, cjn.g(awd.r(awd.d(cfvVar, 20.0f)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, nai.c, true, 0, 1042431), null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar10, 440, 120);
                            } else {
                                buxVar10.s();
                            }
                            return afak.a;
                        }
                        bux buxVar11 = (bux) obj5;
                        int iIntValue10 = ((Integer) obj6).intValue();
                        int i9 = iIntValue10 & 3;
                        if (buxVar11.I(i9 != 2, iIntValue10 & 1)) {
                            cmv cmvVar2 = new cmv(jH);
                            cfv cfvVar2 = cfy.e;
                            float f2 = nai.a;
                            ca.bb(cmvVar2, null, cjn.g(asl.J(awd.r(awd.d(cfvVar2, 20.0f)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, nai.a, BitmapDescriptorFactory.HUE_RED), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, nai.c, true, 0, 1042431), null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar11, 440, 120);
                        } else {
                            buxVar11.s();
                        }
                        return afak.a;
                    }
                }, buxVar9);
                final int i9 = z ? 1 : 0;
                mjv.h(cctVarI, cctVarI2, null, bxc.i(-1552974656, true, new afeg() { // from class: mww
                    @Override // defpackage.afeg
                    public final Object invoke(Object obj5, Object obj6) {
                        if (i9 != 0) {
                            bux buxVar10 = (bux) obj5;
                            int iIntValue9 = ((Integer) obj6).intValue();
                            if (buxVar10.I((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                                cmv cmvVar = new cmv(jH);
                                cfv cfvVar = cfy.e;
                                float f = nai.a;
                                ca.bb(cmvVar, null, cjn.g(awd.r(awd.d(cfvVar, 20.0f)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, nai.c, true, 0, 1042431), null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar10, 440, 120);
                            } else {
                                buxVar10.s();
                            }
                            return afak.a;
                        }
                        bux buxVar11 = (bux) obj5;
                        int iIntValue10 = ((Integer) obj6).intValue();
                        int i92 = iIntValue10 & 3;
                        if (buxVar11.I(i92 != 2, iIntValue10 & 1)) {
                            cmv cmvVar2 = new cmv(jH);
                            cfv cfvVar2 = cfy.e;
                            float f2 = nai.a;
                            ca.bb(cmvVar2, null, cjn.g(asl.J(awd.r(awd.d(cfvVar2, 20.0f)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, nai.a, BitmapDescriptorFactory.HUE_RED), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, nai.c, true, 0, 1042431), null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar11, 440, 120);
                        } else {
                            buxVar11.s();
                        }
                        return afak.a;
                    }
                }, buxVar9), null, buxVar9, 3126, 20);
                return afak.a;
        }
    }
}
