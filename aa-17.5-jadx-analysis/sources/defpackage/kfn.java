package defpackage;

import android.content.Context;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class kfn {
    public kfn() {
    }

    public static ers g(eru eruVar, erq erqVar, esc escVar) {
        erqVar.getClass();
        escVar.getClass();
        return new ers(eruVar.getViewModelStore(), erqVar, escVar);
    }

    public static /* synthetic */ ers h(eru eruVar, esc escVar, int i) {
        erq defaultViewModelProviderFactory = (i & 2) != 0 ? eruVar instanceof epo ? ((epo) eruVar).getDefaultViewModelProviderFactory() : new err() : null;
        if ((i & 4) != 0) {
            escVar = eruVar instanceof epo ? ((epo) eruVar).getDefaultViewModelCreationExtras() : esa.a;
        }
        return g(eruVar, defaultViewModelProviderFactory, escVar);
    }

    public static kso i(bux buxVar) {
        Object objF = buxVar.f(ksp.b);
        if (true == affa.f((kso) objF, ksp.a)) {
            objF = null;
        }
        kso ksoVarH = (kso) objF;
        if (ksoVarH == null) {
            buxVar.v(-193654824);
            ksoVarH = ksp.h(buxVar);
        } else {
            buxVar.v(-193657056);
        }
        buxVar.o();
        return ksoVarH;
    }

    public static cfy j(cfy cfyVar, ksc kscVar, ckv ckvVar) {
        cfyVar.getClass();
        int iOrdinal = kscVar.ordinal();
        ksb ksbVar = new ksb(0.3f, (Float.floatToRawIntBits(((dlj) r10.a).a) & 4294967295L) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32), ((dlj) (iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? new aezu(new dlj(BitmapDescriptorFactory.HUE_RED), new dlj(BitmapDescriptorFactory.HUE_RED)) : new aezu(new dlj(3.0f), new dlj(4.0f)) : new aezu(new dlj(2.0f), new dlj(3.0f)) : new aezu(new dlj(1.0f), new dlj(3.0f))).b).a, BitmapDescriptorFactory.HUE_RED);
        int iOrdinal2 = kscVar.ordinal();
        ksb ksbVar2 = new ksb(0.15f, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(((dlj) r5.a).a) & 4294967295L), ((dlj) (iOrdinal2 != 3 ? iOrdinal2 != 4 ? iOrdinal2 != 5 ? new aezu(new dlj(BitmapDescriptorFactory.HUE_RED), new dlj(BitmapDescriptorFactory.HUE_RED)) : new aezu(new dlj(4.0f), new dlj(6.0f)) : new aezu(new dlj(4.0f), new dlj(8.0f)) : new aezu(new dlj(3.0f), new dlj(8.0f))).b).a, kscVar == ksc.f ? 1.0f : 0.0f);
        return cfyVar.a(new chm(ckvVar, new cmz(ksbVar.c, ksbVar.d, ksbVar.b, ksbVar.a))).a(new chm(ckvVar, new cmz(ksbVar2.c, ksbVar2.d, ksbVar2.b, ksbVar2.a)));
    }

    public static cfy k(cfy cfyVar, ckv ckvVar, bux buxVar, int i) {
        cfyVar.getClass();
        if (i != 0) {
            ckvVar = czz.ar(13, buxVar);
        }
        return j(cfyVar, ksc.d, ckvVar);
    }

    public static cfy l(cfy cfyVar, boolean z) {
        cfyVar.getClass();
        return z ? bxc.n(cfyVar, -1.0f, 1.0f) : cfyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(final defpackage.njw r21, final boolean r22, boolean r23, defpackage.cfy r24, boolean r25, final boolean r26, defpackage.bux r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfn.m(njw, boolean, boolean, cfy, boolean, boolean, bux, int, int):void");
    }

    public static void n(cfy cfyVar, njw njwVar, boolean z, boolean z2, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-522016425);
        boolean z3 = true;
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.D(z2) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            cmw cmwVarB = dao.b(z ? R.drawable.gs_arrow_back_2_fill1rond100_vd_theme_24 : R.drawable.gs_arrow_back_vd_theme_24, buxVarC, 0);
            ksy ksyVar = nly.a;
            int i4 = i2 & 112;
            ksy ksyVar2 = nly.a;
            if (i4 != 32 && ((i2 & 64) == 0 || !buxVarC.E(njwVar))) {
                z3 = false;
            }
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            int i5 = 3;
            if (z3 || objS == buw.a) {
                objS = new njb(njwVar, i5);
                bvvVar.ad(objS);
            }
            khc.l(cmwVarB, (afdr) objS, cfyVar, ksyVar2, z2, null, null, null, null, buxVarC, ((i2 << 6) & 896) | 8 | ((i2 << 3) & 57344), 0, 4064);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqt(cfyVar, njwVar, z, z2, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o(cfy cfyVar, njw njwVar, boolean z, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        bym bymVar;
        aezu aezuVar;
        int i3;
        boolean z2;
        bym bymVar2;
        boolean z3;
        Object bvsVar;
        bvv bvvVar;
        cfy cfyVarA;
        boolean z4;
        ksy ksyVarA;
        boolean z5;
        ksy ksyVar;
        boolean z6 = z;
        njwVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(1729865428);
        if (i4 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z6) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bym bymVarF = bxc.f(njwVar.e(), 0, buxVarC);
            bym bymVarF2 = bxc.f(njwVar.c(), kxa.a, buxVarC);
            boolean z7 = ((Number) bymVarF.a()).intValue() != 3;
            bym bymVarF3 = bxc.f(njwVar.d, true, buxVarC);
            bxc.f(njwVar.i(), false, buxVarC);
            Context context = (Context) buxVarC.f(daa.b);
            if (z6) {
                aezuVar = new aezu(Integer.valueOf(R.drawable.cielo_gemini_spark), true);
                bymVar = bymVarF;
            } else if (njwVar.q()) {
                bymVar = bymVarF;
                int iL = (int) acmd.a.gu().l();
                aezuVar = iL != 1 ? iL != 2 ? iL != 3 ? new aezu(Integer.valueOf(R.drawable.gs_mic_fill1_vd_theme_24), true) : new aezu(2131233031, false) : new aezu(Integer.valueOf(R.drawable.cielo_gemini_spark), true) : new aezu(Integer.valueOf(R.drawable.gemini_branded_mic), false);
            } else {
                bymVar = bymVarF;
                aezuVar = new aezu(Integer.valueOf(R.drawable.gs_mic_fill1_vd_theme_24), true);
            }
            int iIntValue = ((Number) aezuVar.a).intValue();
            boolean zBooleanValue = ((Boolean) aezuVar.b).booleanValue();
            ktf ktfVarO = kgq.o(z6, buxVarC, 0);
            if (!zBooleanValue) {
                float[] fArr = clj.a;
                clv clvVar = clj.u;
                ktfVarO = ktf.a(ktfVarO, cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clvVar), cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clvVar), 249);
            }
            ktf ktfVar = ktfVarO;
            acmd acmdVar = acmd.a;
            if (((int) acmdVar.gu().l()) == 2 || ((int) acmdVar.gu().l()) == 3) {
                i3 = 0;
                z2 = true;
            } else {
                i3 = 0;
                z2 = false;
            }
            cmw cmwVarB = dao.b(iIntValue, buxVarC, i3);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && buxVarC.E(njwVar))) {
                bymVar2 = bymVar;
                z3 = true;
            } else {
                bymVar2 = bymVar;
                z3 = false;
            }
            boolean zC = z3 | buxVarC.C(bymVar2) | buxVarC.C(bymVarF2) | buxVarC.E(context);
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            if (zC || objS == buw.a) {
                bvvVar = bvvVar2;
                bvsVar = new bvs(njwVar, context, bymVar2, bymVarF2, 2);
                bvvVar.ad(bvsVar);
            } else {
                bvsVar = objS;
                bvvVar = bvvVar2;
            }
            afdr afdrVar = (afdr) bvsVar;
            if (z6) {
                float f = gjk.a.k;
                cfyVarA = cfyVar.a(new avl(f, f, f, f));
            } else {
                cfyVarA = cfyVar;
            }
            boolean zD = buxVarC.D(z7) | buxVarC.C(bymVarF3);
            Object objS2 = bvvVar.S();
            if (zD || objS2 == buw.a) {
                z4 = false;
                objS2 = new nis(z7, bymVarF3, null == true ? 1 : 0);
                bvvVar.ad(objS2);
            } else {
                z4 = false;
            }
            cfy cfyVarA2 = bxc.k(cfyVarA, (afec) objS2).a(new dca("assistant"));
            if (z6) {
                z5 = z7;
                ksyVar = ksy.g;
                z6 = true;
            } else {
                if (njwVar.q() && z2) {
                    ksc kscVar = nlw.a;
                    ksyVarA = ksy.a(nlw.d, BitmapDescriptorFactory.HUE_RED, 24.0f, new dlj(24.0f), BitmapDescriptorFactory.HUE_RED, 505);
                } else {
                    ksc kscVar2 = nlw.a;
                    ksyVarA = nlw.d;
                }
                z5 = z7;
                ksyVar = ksyVarA;
                z6 = z4;
            }
            buxVar2 = buxVarC;
            khc.l(cmwVarB, afdrVar, cfyVarA2, ksyVar, (z5 && ((Boolean) bymVarF3.a()).booleanValue()) ? true : z4, null, ktfVar, null, null, buxVar2, 8, 0, 3808);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        boolean z8 = z6;
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jvi(cfyVar, njwVar, z8, i, 3);
        }
    }

    public static void p(final cfy cfyVar, njw njwVar, boolean z, final boolean z2, final boolean z3, bux buxVar, final int i) {
        int i2;
        nip nipVar;
        nio nioVar;
        git gitVarA;
        int iA;
        cfy cfyVarA;
        ksy ksyVar;
        boolean z4;
        kts ktsVarP;
        final njw njwVar2 = njwVar;
        final boolean z5 = z;
        njwVar2.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1726625260);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(njwVar2) : buxVarC.E(njwVar2)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z5) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.D(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.D(z3) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            eqj eqjVarB = njwVar2.b();
            bym bymVarF = bxc.f(eqjVarB, eqjVarB.e(), buxVarC);
            eqj eqjVar = njwVar2.j.e;
            bym bymVarF2 = bxc.f(eqjVar, eqjVar.e(), buxVarC);
            bym bymVarF3 = bxc.f(njwVar2.a(), false, buxVarC);
            bym bymVarF4 = bxc.f(njwVar2.e(), 0, buxVarC);
            bym bymVarF5 = bxc.f(njwVar2.e, false, buxVarC);
            if (((Boolean) bymVarF5.a()).booleanValue()) {
                nipVar = nip.b;
            } else {
                nipVar = (nip) bymVarF.a();
                if (nipVar == null) {
                    bxf bxfVarJ = buxVarC.J();
                    if (bxfVarJ != null) {
                        bxfVarJ.c = new afeg() { // from class: nin
                            @Override // defpackage.afeg
                            public final Object invoke(Object obj, Object obj2) {
                                bux buxVar2 = (bux) obj;
                                ((Integer) obj2).intValue();
                                cfy cfyVar2 = cfyVar;
                                int i4 = i | 1;
                                int i5 = 306783378 & i4;
                                int i6 = 613566756 & i4;
                                kfn.p(cfyVar2, njwVar2, z5, z2, z3, buxVar2, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                                return afak.a;
                            }
                        };
                        return;
                    }
                    return;
                }
            }
            if (((Boolean) bymVarF5.a()).booleanValue()) {
                nioVar = nio.b;
            } else {
                nioVar = (nio) bymVarF2.a();
                if (nioVar == null) {
                    bxf bxfVarJ2 = buxVarC.J();
                    if (bxfVarJ2 != null) {
                        bxfVarJ2.c = new mvf(cfyVar, njwVar, z, z2, z3, i, 2);
                        return;
                    }
                    return;
                }
            }
            njwVar2 = njwVar;
            nio nioVar2 = nioVar;
            int i4 = 18;
            if (z) {
                buxVarC.v(-1363761723);
                boolean zA = buxVarC.A(((Number) bymVarF4.a()).intValue()) | buxVarC.A(nioVar2.ordinal());
                bvv bvvVar = (bvv) buxVarC;
                Object objS = bvvVar.S();
                if (zA || objS == buw.a) {
                    objS = new nmm(new lxu(nioVar2, njwVar2, bymVarF4, 7), new mts(njwVar2, bymVarF4, i4), null, null);
                    bvvVar.ad(objS);
                }
                gitVarA = ((nmm) objS).a(nipVar, Integer.valueOf(((Number) bymVarF4.a()).intValue()), buxVarC, 0);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1363112583);
                boolean zA2 = buxVarC.A(((Number) bymVarF4.a()).intValue()) | buxVarC.A(nipVar.ordinal());
                bvv bvvVar2 = (bvv) buxVarC;
                Object objS2 = bvvVar2.S();
                if (zA2 || objS2 == buw.a) {
                    objS2 = new nmm(new lxu(nipVar, njwVar2, bymVarF4, 8), new mts(njwVar2, bymVarF4, 19), null, null);
                    bvvVar2.ad(objS2);
                }
                gitVarA = ((nmm) objS2).a(nipVar, Integer.valueOf(((Number) bymVarF4.a()).intValue()), buxVarC, 0);
                bvvVar2.Y(false);
            }
            if (!z) {
                yph yphVar = nsr.a;
                iA = nipVar.a(((nsr) mki.a.i(nsr.class)).b());
            } else if (z2) {
                iA = R.drawable.gs_circle_wght500fill1rond100_vd_theme_24;
            } else {
                yph yphVar2 = nsr.a;
                nso nsoVarB = ((nsr) mki.a.i(nsr.class)).b();
                if (nsoVarB.E()) {
                    iA = nioVar2.e;
                } else {
                    boolean zJ = nsoVarB.J();
                    mmc.c();
                    iA = zJ != mmc.h() ? nioVar2.d : nioVar2.c;
                }
            }
            cmw cmwVarB = dao.b(iA, buxVarC, 0);
            boolean zBooleanValue = ((Boolean) bymVarF3.a()).booleanValue();
            if (z) {
                float f = gjk.a.k;
                cfyVarA = cfyVar.a(new avl(f, f, f, f));
            } else {
                cfyVarA = cfyVar;
            }
            if (z) {
                ksyVar = ksy.g;
                z4 = true;
            } else {
                ksc kscVar = nlw.a;
                ksyVar = nlw.d;
                z4 = false;
            }
            ksy ksyVar2 = ksyVar;
            asf asfVar = gitVarA.e;
            if (z2) {
                buxVarC.v(-1361587600);
                aezr aezrVar = kts.a;
                kts ktsVarK = jyw.k(0L, 0L, 0L, 0L, buxVarC, 32767);
                ((bvv) buxVarC).Y(false);
                ktsVarP = ktsVarK;
            } else {
                buxVarC.v(-1361520454);
                ktsVarP = kgq.p(z, buxVarC, 0);
                ((bvv) buxVarC).Y(false);
            }
            krr krrVar = krr.a;
            kso ksoVar = ksp.a;
            int i5 = i2;
            kts ktsVar = new kts(ktsVarP.d, ktsVarP.e, ktsVarP.f, ktsVarP.g, ktsVarP.h, ktsVarP.i, ktsVarP.j, ktsVarP.k, ksp.b(i(buxVarC), krrVar), ksp.b(i(buxVarC), krr.b), ktsVarP.n, ktsVarP.o, ktsVarP.p, ktsVarP.q, ktsVarP.r);
            bvv bvvVar3 = (bvv) buxVarC;
            Object objS3 = bvvVar3.S();
            if (objS3 == buw.a) {
                objS3 = new ndo(18);
                bvvVar3.ad(objS3);
            }
            jzg.e(cmwVarB, zBooleanValue, (afec) objS3, cfyVarA, ksyVar2, z3, null, ktsVar, null, asfVar, buxVarC, ((i5 << 3) & 458752) | 392, 0, 1344);
            buxVarC = buxVarC;
            z5 = z4;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ3 = buxVarC.J();
        if (bxfVarJ3 != null) {
            bxfVarJ3.c = new mvf(cfyVar, njwVar2, z5, z2, z3, i, 3);
        }
    }

    public static boolean q(qrn qrnVar) {
        return ((Boolean) kgq.c(new kja(qrnVar, 7), "GH.EtcStatusUtils", yzz.ETC_STATUS, yzy.pq, true, "Could not get toll card status", new Object[0])).booleanValue();
    }

    public kfn(byte[] bArr) {
    }

    public void b() {
    }

    public void fz() {
    }

    public void a(qrn qrnVar) {
    }

    public void c(qrn qrnVar) {
    }

    public void d(rbu rbuVar) {
    }
}
