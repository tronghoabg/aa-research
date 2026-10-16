package defpackage;

import com.google.android.gms.car.control.CarAction;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nkx {
    public static final yph a = yph.c("GH.RelativeTempControl");

    public static final float a(float f, nli nliVar) {
        return f * (nliVar == nli.a ? 1.0f : -1.0f);
    }

    public static final nko b(bym bymVar) {
        return (nko) bymVar.a();
    }

    public static final void c(Integer num, afha afhaVar, CarAction carAction, nko nkoVar, boolean z, afeg afegVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        afdr afdrVar;
        bvv bvvVar;
        int i3;
        boolean z2;
        Object lxuVar;
        Integer num2 = num;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-1968277292);
        if (i4 == 0) {
            i2 = (true != buxVarC.C(num2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afhaVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(carAction) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.A(nkoVar == null ? -1 : nkoVar.ordinal()) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.D(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((i & 262144) == 0 ? buxVarC.C(afegVar) : buxVarC.E(afegVar)) ? 65536 : 131072;
        }
        int i5 = i2;
        if (buxVarC.I((74899 & i5) != 74898, i5 & 1)) {
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = bvq.a(afcp.a, buxVarC);
                bvvVar2.ad(objS);
            }
            boolean z3 = (i5 & 14) == 4;
            aitx aitxVar = (aitx) objS;
            boolean zE = buxVarC.E(afhaVar) | z3;
            Object objS2 = bvvVar2.S();
            if (zE || objS2 == obj) {
                objS2 = new dxa(num2, afhaVar, (afck) null, 18);
                bvvVar2.ad(objS2);
            }
            bvq.f(num2, afhaVar, (afeg) objS2, buxVarC);
            boolean z4 = num2 != null && num2.intValue() > ((Number) woy.bC(afhaVar)).intValue();
            boolean z5 = num2 != null && num2.intValue() < ((Number) woy.bA(afhaVar)).intValue();
            if (carAction == null) {
                buxVarC.v(-2054603752);
                bvvVar2.Y(false);
                afdrVar = null;
            } else {
                buxVarC.v(-2054573961);
                boolean zE2 = buxVarC.E(carAction);
                Object objS3 = bvvVar2.S();
                if (zE2 || objS3 == obj) {
                    objS3 = new njb(carAction, 7);
                    bvvVar2.ad(objS3);
                }
                bvvVar2.Y(false);
                afdrVar = (afdr) objS3;
            }
            int i6 = i5 & 458752;
            boolean zE3 = (i6 == 131072 || ((i5 & 262144) != 0 && buxVarC.E(afegVar))) | buxVarC.E(aitxVar);
            Object objS4 = bvvVar2.S();
            if ((zE3 || z3) || objS4 == obj) {
                bvvVar = bvvVar2;
                i3 = i6;
                z2 = false;
                lxu lxuVar2 = new lxu((Object) aitxVar, (Object) afegVar, (Object) num2, 13, (byte[]) null);
                bvvVar.ad(lxuVar2);
                objS4 = lxuVar2;
            } else {
                i3 = i6;
                bvvVar = bvvVar2;
                z2 = false;
            }
            afdr afdrVar2 = (afdr) objS4;
            boolean zE4 = buxVarC.E(aitxVar);
            boolean z6 = (i3 == 131072 || ((i5 & 262144) != 0 && buxVarC.E(afegVar))) ? true : z2;
            Object objS5 = bvvVar.S();
            if (((zE4 | z6) || z3) || objS5 == obj) {
                num2 = num;
                lxuVar = new lxu((Object) aitxVar, (Object) afegVar, (Object) num2, 14, (byte[]) null);
                bvvVar.ad(lxuVar);
            } else {
                lxuVar = objS5;
                num2 = num;
            }
            buxVar2 = buxVarC;
            lws.q(afdrVar2, (afdr) lxuVar, z5, z4, afdrVar, null, z, null, null, null, null, null, bxc.i(-2132292850, true, new nrb(num2, nkoVar, afhaVar, 1), buxVarC), buxVar2, (i5 << 6) & 3670016, 384, 4000);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new boa(num2, afhaVar, carAction, nkoVar, z, afegVar, i, 6);
        }
    }

    public static final void d(kjk kjkVar, boolean z, bux buxVar, int i, int i2) {
        int i3;
        boolean z2;
        bxf bxfVarJ;
        nkm nkmVar;
        kjkVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-546462543);
        if (i4 == 0) {
            i3 = i | (true != buxVarC.E(kjkVar) ? 2 : 4);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            int i6 = 9;
            int i7 = i3 << 9;
            boolean z4 = z3 & z;
            kjz kjzVar = kjkVar.a;
            boolean zC = buxVarC.C(kjzVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            byte[] bArr = null;
            if (zC || objS == buw.a) {
                npc npcVarA = npc.a.a();
                kll kllVar = kjzVar.a.b;
                objS = (npe) npcVarA.a(new npb("mtcTemperatureControl", kllVar), new nlh(npcVarA, kllVar, i6, bArr));
                bvvVar.ad(objS);
            }
            npe npeVar = (npe) objS;
            boolean zC2 = buxVarC.C(kjkVar);
            Object objS2 = bvvVar.S();
            if (zC2 || objS2 == buw.a) {
                objS2 = lvl.Q(kjkVar);
                bvvVar.ad(objS2);
            }
            int i8 = i7 & 57344;
            bym bymVarE = bxc.e((eqj) objS2, buxVarC);
            if (npeVar == null) {
                buxVarC.v(-1739202514);
                ((ype) a.h()).y("RelativeTemperatureControl: No mtcTemperatureProperty found for %s", kjzVar.a.b);
                afha afhaVar = new afha(0, 0);
                nko nkoVarB = b(bymVarE);
                Object objS3 = bvvVar.S();
                if (objS3 == buw.a) {
                    objS3 = new dww((afck) null, 5, (boolean[]) null);
                    bvvVar.ad(objS3);
                }
                c(null, afhaVar, null, nkoVarB, z4, (afeg) objS3, buxVarC, i8 | 390);
                bvvVar.Y(false);
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    nkmVar = new nkm(kjkVar, z4, i, i2, 4);
                    bxfVarJ.c = nkmVar;
                }
                return;
            }
            buxVarC.v(-1738861359);
            bvvVar.Y(false);
            bym bymVarF = bxc.f(npeVar.c, kke.a, buxVarC);
            nko nkoVarB2 = b(bymVarE);
            boolean zE = buxVarC.E(kjkVar) | buxVarC.C(bymVarE);
            Object objS4 = bvvVar.S();
            if (zE || objS4 == buw.a) {
                objS4 = new dxa(kjkVar, bymVarE, (afck) null, 19);
                bvvVar.ad(objS4);
            }
            bvq.g(nkoVarB2, (afeg) objS4, buxVarC);
            Integer num = (Integer) kkg.b(roc.ao(bymVarF));
            afha afhaVar2 = npeVar.a;
            CarAction carAction = kjkVar.b;
            nko nkoVarB3 = b(bymVarE);
            boolean zE2 = buxVarC.E(npeVar);
            Object objS5 = bvvVar.S();
            if (zE2 || objS5 == buw.a) {
                objS5 = new nkw(npeVar, null, 0);
                bvvVar.ad(objS5);
            }
            c(num, afhaVar2, carAction, nkoVarB3, z4, (afeg) objS5, buxVarC, i8);
            z2 = z4;
        } else {
            buxVarC.s();
            z2 = z;
        }
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            nkmVar = new nkm(kjkVar, z2, i, i2, 3);
            bxfVarJ.c = nkmVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.nli r24, final int r25, final defpackage.afha r26, final long r27, final long r29, final boolean r31, defpackage.bux r32, final int r33) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkx.e(nli, int, afha, long, long, boolean, bux, int):void");
    }

    public static final void f(final nli nliVar, final int i, final afha afhaVar, final long j, final long j2, nko nkoVar, boolean z, bux buxVar, final int i2) {
        int i3;
        final nko nkoVar2;
        final boolean z2;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(706651491);
        if (i4 == 0) {
            i3 = (true != buxVarC.A(nliVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.E(afhaVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.B(j) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.B(j2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != buxVarC.A(nkoVar.ordinal()) ? 65536 : 131072;
        }
        int i5 = i3 | 1572864;
        if (buxVarC.I((599187 & i5) != 599186, i5 & 1)) {
            cfn cfnVar = cfl.h;
            cfv cfvVar = cfy.e;
            cfy cfyVarH = asl.H(cfvVar, 6.0f);
            ctp ctpVarB = atk.b(cfnVar, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarH);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarB, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            int i6 = i5 & 14;
            e(nliVar, i, afhaVar, j, j2, true, buxVarC, (i5 & 65534) | ((i5 >> 3) & 458752));
            ctp ctpVarA = atp.a(atd.e, cfl.k, buxVarC, 54);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfvVar);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            buxVarC = buxVarC;
            g(nliVar, j, true, null, buxVarC, ((i5 >> 6) & 112) | i6 | ((i5 >> 12) & 896));
            asl.A(awd.d(cfvVar, 4.0f), buxVarC);
            nkoVar2 = nkoVar;
            lvl.R(nkoVar2, buxVarC, (i5 >> 15) & 14);
            bvvVar.Y(true);
            bvvVar.Y(true);
            z2 = true;
        } else {
            nkoVar2 = nkoVar;
            buxVarC.s();
            z2 = z;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nkt
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    nli nliVar2 = nliVar;
                    int i7 = i;
                    afha afhaVar2 = afhaVar;
                    int i8 = i2 | 1;
                    int i9 = 306783378 & i8;
                    int i10 = 613566756 & i8;
                    nkx.f(nliVar2, i7, afhaVar2, j, j2, nkoVar2, z2, buxVar2, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10));
                    return afak.a;
                }
            };
        }
    }

    public static final void g(final nli nliVar, final long j, final boolean z, cfy cfyVar, bux buxVar, final int i) {
        int i2;
        final cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(620100913);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != buxVarC.A(nliVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.B(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        int i5 = i2 | 3072;
        if (buxVarC.I((i5 & 1171) != 1170, i5 & 1)) {
            cfyVar2 = cfy.e;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new nle(i4);
                bvvVar.ad(objS);
            }
            ca.V(nliVar, null, (afec) objS, null, "Icon Animation", null, bxc.i(-1698976274, true, new afei() { // from class: nkr
                @Override // defpackage.afei
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i6;
                    float f;
                    nli nliVar2 = (nli) obj2;
                    bux buxVar2 = (bux) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    yph yphVar = nkx.a;
                    ((abg) obj).getClass();
                    nliVar2.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= true != buxVar2.A(nliVar2.ordinal()) ? 16 : 32;
                    }
                    if (buxVar2.I((iIntValue & 145) != 144, iIntValue & 1)) {
                        int iOrdinal = nliVar2.ordinal();
                        if (iOrdinal == 0) {
                            i6 = R.drawable.gs_heat_fill1rond100_vd_theme_24;
                        } else if (iOrdinal == 1) {
                            i6 = R.drawable.gs_ac_unit_fill1rond100_vd_theme_24;
                        } else {
                            if (iOrdinal != 2) {
                                throw new aezs();
                            }
                            i6 = R.drawable.gs_thermometer_rond100_vd_theme_24;
                        }
                        boolean z2 = z;
                        cmw cmwVarB = dao.b(i6, buxVar2, 0);
                        if (z2) {
                            f = 24.0f;
                        } else {
                            ksy ksyVar = nly.a;
                            f = 32.0f;
                        }
                        boc.a(cmwVarB, null, awd.i(cfyVar2, f), j, buxVar2, 56, 0);
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, (i5 & 14) | 1597824, 42);
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nks
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    int i6 = i | 1;
                    int i7 = 306783378 & i6;
                    int i8 = 613566756 & i6;
                    nkx.g(nliVar, j, z, cfyVar2, buxVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
                    return afak.a;
                }
            };
        }
    }

    public static final void h(final nli nliVar, final int i, final afha afhaVar, final long j, final long j2, bux buxVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-1307440086);
        if (i4 == 0) {
            i3 = (true != buxVarC.A(nliVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.E(afhaVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.B(j) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.B(j2) ? 8192 : 16384;
        }
        int i5 = i3 | 196608;
        if (buxVarC.I((74899 & i5) != 74898, i5 & 1)) {
            cfn cfnVar = cfl.e;
            cfy cfyVarH = asl.H(cfy.e, 6.0f);
            ctp ctpVarB = atk.b(cfnVar, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarH);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            e(nliVar, i, afhaVar, j, j2, false, buxVarC, i5 & 524286);
            buxVarC = buxVarC;
            g(nliVar, j, false, null, buxVarC, (i5 & 14) | ((i5 >> 6) & 112) | ((i5 >> 9) & 896));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nkq
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    nli nliVar2 = nliVar;
                    int i6 = i2;
                    int i7 = i6 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    nkx.h(nliVar2, i, afhaVar, j, j2, buxVar2, (i9 >> 1) | i8 | (i7 & (-920350135)) | ((i8 + i8) & i9));
                    return afak.a;
                }
            };
        }
    }
}
