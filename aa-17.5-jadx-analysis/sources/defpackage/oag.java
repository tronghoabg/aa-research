package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;

/* loaded from: classes.dex */
public final class oag {
    public static final oag a = new oag();

    public static final nym a(bwq bwqVar) {
        return (nym) bwqVar.a();
    }

    public static final void h(long j, bym bymVar, bym bymVar2, bym bymVar3, boolean z, Integer num, byd bydVar, cfy cfyVar, bux buxVar, int i) {
        if (i != 0) {
            cfyVar = cfy.e;
        }
        cfy cfyVarH = dlj.a(((dlj) bymVar.a()).a, BitmapDescriptorFactory.HUE_RED) > 0 ? asl.H(afp.D(cfy.e, ((dlj) bymVar.a()).a, j, bcr.a), ((dlj) bymVar.a()).a) : cfy.e;
        cfn cfnVar = cfl.e;
        float f = ((dlj) bymVar2.a()).a;
        float f2 = ((dlj) bymVar.a()).a;
        float f3 = f + f2 + f2 + BitmapDescriptorFactory.HUE_RED + BitmapDescriptorFactory.HUE_RED;
        float f4 = ((dlj) bymVar3.a()).a;
        float f5 = ((dlj) bymVar.a()).a;
        cfy cfyVarE = afp.E(awd.k(cfyVar, f3, f4 + f5 + f5 + BitmapDescriptorFactory.HUE_RED + BitmapDescriptorFactory.HUE_RED).a(cfyVarH), kfn.i(buxVar).A(), bcr.a);
        ctp ctpVarB = atk.b(cfnVar, false);
        int iG = a.g(buxVar.b());
        ccx ccxVarN = buxVar.N();
        cfy cfyVarJ = bzi.j(buxVar, cfyVarE);
        afdr afdrVar = cwb.a;
        buxVar.M();
        buxVar.w();
        if (buxVar.G()) {
            buxVar.j(afdrVar);
        } else {
            buxVar.y();
        }
        byq.c(buxVar, ctpVarB, cwb.e);
        byq.c(buxVar, ccxVarN, cwb.d);
        byq.c(buxVar, Integer.valueOf(iG), cwb.f);
        byq.b(buxVar, cwb.g);
        byq.c(buxVar, cfyVarJ, cwb.c);
        ca.M(!z, null, acl.B(null, 3), acl.C(null, 3), null, bxc.i(46833923, true, new nnw(num, bydVar, 4), buxVar), buxVar, 200064, 18);
        buxVar.n();
    }

    public static final ksy j(boolean z) {
        if (z) {
            return ksy.b;
        }
        ksc kscVar = nlw.a;
        return nlw.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r27, defpackage.cfy r28, boolean r29, boolean r30, defpackage.ksy r31, defpackage.kts r32, defpackage.asf r33, defpackage.bux r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oag.b(boolean, cfy, boolean, boolean, ksy, kts, asf, bux, int, int):void");
    }

    public final void c(cfy cfyVar, nep nepVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bux buxVar, int i, int i2) {
        cfy cfyVar2;
        int i3;
        boolean z6;
        cfy cfyVar3;
        boolean z7;
        boolean z8;
        cfy cfyVar4;
        final boolean z9 = z2;
        boolean z10 = z4;
        int i4 = i2 & 1;
        bux buxVarC = buxVar.c(862294756);
        if (i4 != 0) {
            i3 = i | 6;
            cfyVar2 = cfyVar;
        } else if ((i & 6) == 0) {
            cfyVar2 = cfyVar;
            i3 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.E(nepVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.D(z9) ? 1024 : 2048;
        }
        int i5 = i2 & 16;
        boolean z11 = i5 == 0;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= true != buxVarC.D(z3) ? 8192 : 16384;
        }
        int i6 = i2 & 32;
        boolean z12 = i6 == 0;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= true != buxVarC.D(z10) ? 65536 : 131072;
        }
        int i7 = i2 & 64;
        boolean z13 = i7 == 0;
        if (i7 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= true != buxVarC.D(z5) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i3) != 599186, i3 & 1)) {
            int i8 = i3 << 3;
            if (i4 != 0) {
                cfyVar2 = cfy.e;
            }
            boolean z14 = z11 & z3;
            z10 = z12 & z10;
            boolean z15 = z13 & z5;
            if (z10) {
                buxVarC.v(423974486);
                cfv cfvVar = cfy.e;
                ksc kscVar = nlw.a;
                cfy cfyVarD = awd.d(cfvVar, 13.0f);
                if (z15) {
                    cfyVarD = cfyVarD.a(new avl(BitmapDescriptorFactory.HUE_RED, 2.0f, BitmapDescriptorFactory.HUE_RED, 2.0f));
                }
                int i9 = (i8 & 7168) | (57344 & i3) | ((i3 << 6) & 458752);
                cfy cfyVar5 = cfyVar2;
                z8 = z14;
                cfyVar4 = cfyVar5;
                ebf.H(awd.v(cfyVarD, false, 3), nepVar.a, nepVar.a(), z, z8, z2, null, buxVarC, i9);
                z9 = z2;
                ((bvv) buxVarC).Y(false);
            } else {
                cfy cfyVar6 = cfyVar2;
                z8 = z14;
                cfyVar4 = cfyVar6;
                buxVarC.v(424404208);
                final long jS = kfn.i(buxVarC).s();
                boolean zB = ((i3 & 7168) == 2048) | buxVarC.B(jS);
                bvv bvvVar = (bvv) buxVarC;
                Object objS = bvvVar.S();
                if (zB || objS == buw.a) {
                    objS = new afec() { // from class: nzs
                        @Override // defpackage.afec
                        public final Object invoke(Object obj) {
                            Context context = (Context) obj;
                            context.getClass();
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(new nyn(context, z9, Integer.valueOf(cjn.h(jS))));
                            return imageView;
                        }
                    };
                    bvvVar.ad(objS);
                }
                afec afecVar = (afec) objS;
                boolean zE = buxVarC.E(nepVar) | ((i3 & 896) == 256);
                Object objS2 = bvvVar.S();
                if (zE || objS2 == buw.a) {
                    objS2 = new glh(nepVar, z, 8);
                    bvvVar.ad(objS2);
                }
                jur.f(afecVar, cfyVar4, (afec) objS2, buxVarC, i8 & 112);
                bvvVar.Y(false);
            }
            z7 = z8;
            z6 = z15;
            cfyVar3 = cfyVar4;
        } else {
            buxVarC.s();
            cfy cfyVar7 = cfyVar2;
            z6 = z5;
            cfyVar3 = cfyVar7;
            z7 = z3;
        }
        boolean z16 = z10;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nzt(this, cfyVar3, nepVar, z, z9, z7, z16, z6, i, i2, 0);
        }
    }

    public final void d(final cfy cfyVar, final dfw dfwVar, final boolean z, boolean z2, boolean z3, boolean z4, bux buxVar, final int i, final int i2) {
        int i3;
        bux buxVar2;
        final boolean z5;
        long jR;
        dfw dfwVarV;
        boolean z6 = z2;
        boolean z7 = z3;
        cfyVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(2042545033);
        if (i4 == 0) {
            i3 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(dfwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.D(z) ? 128 : 256;
        }
        int i5 = i2 & 8;
        boolean z8 = i5 == 0;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != buxVarC.D(z6) ? 1024 : 2048;
        }
        int i6 = i2 & 16;
        boolean z9 = i6 == 0;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= true != buxVarC.D(z7) ? 8192 : 16384;
        }
        int i7 = i2 & 32;
        boolean z10 = i7 == 0;
        if (i7 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= true != buxVarC.D(z4) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i3) != 74898, i3 & 1)) {
            z6 &= z8;
            z7 &= z9;
            boolean z11 = z4 & z10;
            if (oal.a.contains("release") && z) {
                buxVarC.v(-1637204118);
                jR = kfn.i(buxVarC).C();
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-1637151294);
                jR = kfn.i(buxVarC).R();
                ((bvv) buxVarC).Y(false);
            }
            long j = jR;
            if (z7) {
                Duration duration = nyy.a;
                dhs dhsVar = nyy.c;
                die dieVar = die.k;
                long jFloatToRawIntBits = Float.floatToRawIntBits(32.0f);
                dlu[] dluVarArr = dlt.a;
                dfwVarV = dfw.v(dfwVar, 0L, 0L, dieVar, new dhx(0), dhsVar, null, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L) | 4294967296L, null, 0, 0, (jFloatToRawIntBits & 4294967295L) | 4294967296L, null, null, 16645971);
            } else {
                Duration duration2 = nyy.a;
                dhs dhsVar2 = nyy.b;
                die dieVar2 = die.k;
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(32.0f);
                dlu[] dluVarArr2 = dlt.a;
                dfwVarV = dfw.v(dfwVar, 0L, 0L, dieVar2, new dhx(0), dhsVar2, null, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L) | 4294967296L, null, 0, 0, (jFloatToRawIntBits2 & 4294967295L) | 4294967296L, null, null, 16645971);
            }
            buxVar2 = buxVarC;
            nsh.e(cfyVar, dfwVarV, j, true != z6 ? "h:mm a" : "h:mm", true != z6 ? "H:mm" : "HH:mm", z11, buxVar2, (i3 & 14) | ((i3 << 3) & 3670016));
            z5 = z11;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            z5 = z4;
        }
        final boolean z12 = z6;
        final boolean z13 = z7;
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: oaa
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar3 = (bux) obj;
                    ((Integer) obj2).intValue();
                    oag oagVar = this.a;
                    cfy cfyVar2 = cfyVar;
                    dfw dfwVar2 = dfwVar;
                    int i8 = i | 1;
                    int i9 = 306783378 & i8;
                    int i10 = 613566756 & i8;
                    oagVar.d(cfyVar2, dfwVar2, z, z12, z13, z5, buxVar3, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10), i2);
                    return afak.a;
                }
            };
        }
    }

    public final void e(cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        cfyVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-981852712);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            cfy cfyVarBf = ca.bf(awd.u(cfyVar, null, 3), false, null);
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarBf);
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
            cfyVar2 = cfyVar;
            vja.j(dao.b(R.drawable.ic_gearhead_etc_rail_icon, buxVarC, 0), cfyVar2, kfn.i(buxVarC).s(), buxVarC, ((i2 << 6) & 896) | 56, 0);
            bvvVar.Y(true);
        } else {
            cfyVar2 = cfyVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nzv(this, cfyVar2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.cfy r39, final int r40, boolean r41, java.lang.Integer r42, boolean r43, float r44, long r45, defpackage.bux r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oag.f(cfy, int, boolean, java.lang.Integer, boolean, float, long, bux, int, int):void");
    }

    public final void g(cfy cfyVar, final boolean z, final int i, boolean z2, boolean z3, final boolean z4, final boolean z5, final boolean z6, bux buxVar, final int i2, final int i3) {
        cfy cfyVar2;
        int i4;
        bux buxVar2;
        final boolean z7;
        final cfy cfyVar3;
        int i5;
        cfy cfyVar4;
        final boolean z8 = z3;
        int i6 = i3 & 1;
        bux buxVarC = buxVar.c(-1001021332);
        if (i6 != 0) {
            i4 = i2 | 6;
            cfyVar2 = cfyVar;
        } else if ((i2 & 6) == 0) {
            cfyVar2 = cfyVar;
            i4 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i2;
        } else {
            cfyVar2 = cfyVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != buxVarC.A(i) ? 128 : 256;
        }
        int i7 = i3 & 8;
        boolean z9 = i7 == 0;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= true != buxVarC.D(z2) ? 1024 : 2048;
        }
        int i8 = i3 & 16;
        boolean z10 = i8 == 0;
        if (i8 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= true != buxVarC.D(z8) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != buxVarC.D(z4) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != buxVarC.D(z5) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != buxVarC.D(z6) ? 4194304 : 8388608;
        }
        if (buxVarC.I((4793491 & i4) != 4793490, i4 & 1)) {
            if (i6 != 0) {
                int i9 = i4;
                cfyVar4 = cfy.e;
                i5 = i9;
            } else {
                i5 = i4;
                cfyVar4 = cfyVar2;
            }
            final boolean z11 = z2 & z9;
            z8 = z10 & z8;
            oad oadVar = z6 ? oad.d : z ? oad.a : z5 ? oad.c : i > 0 ? oad.b : oad.d;
            cfn cfnVar = cfl.e;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new nna(11);
                bvvVar.ad(objS);
            }
            buxVar2 = buxVarC;
            ca.V(oadVar, cfyVar4, (afec) objS, cfnVar, "NotificationContent", null, bxc.i(1899598601, true, new afei() { // from class: nzq
                @Override // defpackage.afei
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    oad oadVar2 = (oad) obj2;
                    bux buxVar3 = (bux) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((abg) obj).getClass();
                    oadVar2.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= true != buxVar3.A(oadVar2.ordinal()) ? 16 : 32;
                    }
                    boolean z12 = false;
                    if (buxVar3.I((iIntValue & 145) != 144, iIntValue & 1)) {
                        int i10 = i;
                        int iOrdinal = oadVar2.ordinal();
                        if (iOrdinal == 0) {
                            boolean z13 = z4;
                            buxVar3.v(452914741);
                            oag oagVar = oag.a;
                            ksc kscVar = nlw.a;
                            oagVar.m(24.0f, z13, 0L, buxVar3, 24576, 8);
                            buxVar3.o();
                        } else if (iOrdinal == 1) {
                            boolean z14 = z11;
                            buxVar3.v(453055915);
                            oag oagVar2 = oag.a;
                            if (z14 && z8) {
                                z12 = true;
                            }
                            oagVar2.f(null, i10, z12, null, false, BitmapDescriptorFactory.HUE_RED, 0L, buxVar3, 12582912, 121);
                            buxVar3.o();
                        } else if (iOrdinal == 2) {
                            buxVar3.v(453213519);
                            oag.a.f(null, i10, false, Integer.valueOf(R.drawable.gs_spark_vd_theme_24), false, BitmapDescriptorFactory.HUE_RED, 0L, buxVar3, 12583296, 113);
                            buxVar3.o();
                        } else {
                            if (iOrdinal != 3) {
                                buxVar3.v(153155925);
                                buxVar3.o();
                                throw new aezs();
                            }
                            buxVar3.v(453420630);
                            buxVar3.o();
                        }
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVar2, ((i5 << 3) & 112) | 1600896, 32);
            z7 = z11;
            cfyVar3 = cfyVar4;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            z7 = z2;
            cfyVar3 = cfyVar2;
        }
        final boolean z12 = z8;
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nzr
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    oag oagVar = this.a;
                    cfy cfyVar5 = cfyVar3;
                    boolean z13 = z;
                    int i10 = i;
                    boolean z14 = z7;
                    int i11 = i2;
                    int i12 = i11 | 1;
                    int i13 = 306783378 & i12;
                    int i14 = i13 + i13;
                    int i15 = 613566756 & i12;
                    oagVar.g(cfyVar5, z13, i10, z14, z12, z4, z5, z6, (bux) obj, i13 | (i15 >> 1) | (i12 & (-920350135)) | (i14 & i15), i3);
                    return afak.a;
                }
            };
        }
    }

    public final void i(boolean z, boolean z2, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 384;
        bux buxVarC = buxVar.c(-589012396);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 128 : 256) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 129) != 128, i2 & 1)) {
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
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
            vja.j(dao.b(R.drawable.gs_notifications_fill1_vd_theme_24, buxVarC, 0), awd.c(cfy.e, 1.0f), 0L, buxVarC, 440, 8);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqt(this, z, z2, cfyVar, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:377:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    /* JADX WARN: Type inference failed for: r5v19, types: [aew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [aew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [aew, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(final boolean r39, defpackage.cfy r40, boolean r41, boolean r42, defpackage.ksy r43, defpackage.kts r44, defpackage.asf r45, int r46, boolean r47, int r48, defpackage.bux r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 2080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oag.k(boolean, cfy, boolean, boolean, ksy, kts, asf, int, boolean, int, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(final float r23, final defpackage.cfn r24, float r25, final java.lang.Integer r26, final defpackage.ntq r27, final boolean r28, final boolean r29, final boolean r30, boolean r31, defpackage.bux r32, final int r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oag.l(float, cfn, float, java.lang.Integer, ntq, boolean, boolean, boolean, boolean, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(final float r17, boolean r18, long r19, defpackage.bux r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oag.m(float, boolean, long, bux, int, int):void");
    }

    public final void n(cfy cfyVar, int i, oae oaeVar, bux buxVar, int i2) {
        cfy cfyVar2;
        bxf bxfVarJ;
        afeg dmiVar;
        bux buxVarC = buxVar.c(1384272938);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.A(oaeVar.ordinal()) ? 128 : 256;
        }
        int i4 = i3 | 3072;
        if (buxVarC.I((i4 & 1171) != 1170, i4 & 1)) {
            cfv cfvVar = cfy.e;
            if (i == 0) {
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    dmiVar = new kmg(this, cfvVar, oaeVar, i2, 13, (char[]) null);
                    bxfVarJ.c = dmiVar;
                }
                return;
            }
            oaf oafVar = i != 1 ? i != 2 ? i != 3 ? oaf.a : oaf.c : oaf.b : oaf.a;
            bcm bcmVar = bcr.a;
            bcp bcpVar = new bcp(50.0f);
            bcm bcmVar2 = new bcm(bcpVar, bcpVar, bcpVar, bcpVar);
            cfy cfyVarU = awd.u(cfvVar, null, 3);
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
            long j = bvvVar.u;
            long j2 = j ^ (j >>> 32);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarU);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            cmw cmwVarB = dao.b(oafVar.d, buxVarC, 0);
            afdr afdrVar2 = oafVar.e;
            cfy cfyVarM = awd.m(cfvVar, oaeVar.c);
            float f = oaeVar.d;
            cfy cfyVarA = kvc.a(awd.d(cfyVarM, f), bcmVar2, 0L, 0L, null, null, null, true, false, buxVarC, 12582912, 190);
            ksy ksyVar = new ksy(f, 28.0f, null, null, null, 508);
            aezr aezrVar = ktf.a;
            krr krrVar = krr.q;
            kso ksoVar = ksp.a;
            long jB = ksp.b(kfn.i(buxVarC), krrVar);
            krr krrVar2 = krr.s;
            khc.i(cmwVarB, afdrVar2, cfyVarA, ksyVar, false, false, bcmVar2, null, kgq.g(jB, ksp.b(kfn.i(buxVarC), krrVar2), ksp.b(kfn.i(buxVarC), krrVar2), 0L, buxVarC, 248), null, null, null, buxVarC, 8, 0, 3760);
            buxVarC = buxVarC;
            bvvVar.Y(true);
            cfyVar2 = cfvVar;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            dmiVar = new dmi(this, cfyVar2, i, oaeVar, i2, 7);
            bxfVarJ.c = dmiVar;
        }
    }
}
