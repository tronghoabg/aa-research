package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jzl {
    public static final void a(hfg hfgVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cgf cgfVar2;
        defpackage.bve bveVar2;
        long j;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1105364696);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(hfgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        int i4 = i2;
        if (bveVarC.I((i4 & 19) != 18, i4 & 1)) {
            glb glbVar = (glb) bveVarC.f(gft.a);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(glbVar.c()), defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            gcw gcwVar = hfgVar.d;
            defpackage.bwx bwxVar = (defpackage.bwx) objS;
            boolean zB = gcwVar != null ? gcwVar.a.b() : false;
            if (zB) {
                bveVarC.v(-405049523);
                j = defpackage.bxi.n(bveVarC).w;
                bwcVar.Y(false);
            } else {
                bveVarC.v(-404998590);
                j = defpackage.bxi.n(bveVarC).s;
                bwcVar.Y(false);
            }
            cgfVar2 = cgfVar;
            bveVar2 = bveVarC;
            hdw.b(cgfVar2, hfgVar.a, hfgVar.c, defpackage.dai.as(-651729712, true, new jzk(hfgVar, glbVar, defpackage.bxi.n(bveVarC).a, j, zB, bwxVar), bveVarC), bveVar2, ((i4 >> 3) & 14) | 3648);
        } else {
            cgfVar2 = cgfVar;
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jtw(hfgVar, cgfVar2, i, 20);
        }
    }

    public static final void b(com.google.android.apps.auto.sdk.ui.AutoTunedRecyclerView autoTunedRecyclerView, android.content.Context context) {
        autoTunedRecyclerView.getClass();
        context.getClass();
        int i = oxu.a;
        autoTunedRecyclerView.setPadding(context.getResources().getDimensionPixelSize(2131168736), 0, context.getResources().getDimensionPixelSize(2131168736), 0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) autoTunedRecyclerView.getLayoutParams();
        layoutParams.getClass();
        layoutParams.leftMargin = context.getResources().getDimensionPixelSize(2131168734);
        layoutParams.rightMargin = context.getResources().getDimensionPixelSize(2131168734);
        autoTunedRecyclerView.setLayoutParams(layoutParams);
    }

    public static final void c(com.google.android.apps.auto.sdk.ui.AutoTunedRecyclerView autoTunedRecyclerView, android.content.Context context, boolean z, boolean z2) {
        autoTunedRecyclerView.getClass();
        context.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = autoTunedRecyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(0);
        layoutParams2.setMarginEnd(n(context, 2131168588));
        autoTunedRecyclerView.setLayoutParams(layoutParams2);
        if (z) {
            defpackage.lem.a.a();
            autoTunedRecyclerView.setPadding(0, autoTunedRecyclerView.getPaddingTop(), n(context, 2131168589), autoTunedRecyclerView.getPaddingBottom());
        } else {
            autoTunedRecyclerView.setPadding(n(context, 2131168737), autoTunedRecyclerView.getPaddingTop(), n(context, 2131168742), autoTunedRecyclerView.getPaddingBottom());
        }
        if (z2) {
            defpackage.lem.a.a();
            autoTunedRecyclerView.setPadding(autoTunedRecyclerView.getPaddingLeft(), autoTunedRecyclerView.getPaddingTop(), n(context, 2131168591), autoTunedRecyclerView.getPaddingBottom());
        }
    }

    public static /* synthetic */ void d(kvu kvuVar, java.lang.Object obj, defpackage.affh affhVar, defpackage.affh affhVar2, int i) {
        if ((i & 4) != 0) {
            affhVar = new defpackage.kvb(5);
        }
        if (1 == (i & 1)) {
            obj = null;
        }
        affhVar.getClass();
        kvuVar.a.b(obj, new defpackage.ccz(1580965385, true, new fux(affhVar, affhVar2, 17, (byte[]) null)));
    }

    public static final void e(defpackage.cgf cgfVar, defpackage.axx axxVar, float f, defpackage.avv avvVar, defpackage.ath athVar, defpackage.cft cftVar, defpackage.aor aorVar, boolean z, defpackage.aiz aizVar, defpackage.affc affcVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.axx axxVar2;
        defpackage.ath athVar2;
        defpackage.cft cftVar2;
        boolean z2;
        defpackage.aiz aizVar2;
        defpackage.affc affcVar2;
        int i4;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(676079881);
        if (i5 == 0) {
            i3 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            axxVar2 = axxVar;
            i3 |= true != bveVarC.C(axxVar2) ? 16 : 32;
        } else {
            axxVar2 = axxVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.z(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.C(avvVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != bveVarC.D(false) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            athVar2 = athVar;
            i3 |= true != bveVarC.C(athVar2) ? 65536 : 131072;
        } else {
            athVar2 = athVar;
        }
        if ((1572864 & i) == 0) {
            cftVar2 = cftVar;
            i3 |= true != bveVarC.C(cftVar2) ? 524288 : 1048576;
        } else {
            cftVar2 = cftVar;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != bveVarC.C(aorVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            z2 = z;
            i3 |= true != bveVarC.D(z2) ? 33554432 : 67108864;
        } else {
            z2 = z;
        }
        if ((805306368 & i) == 0) {
            aizVar2 = aizVar;
            i3 |= true != bveVarC.C(aizVar2) ? 268435456 : 536870912;
        } else {
            aizVar2 = aizVar;
        }
        if ((i2 & 6) == 0) {
            affcVar2 = affcVar;
            i4 = i2 | (true != bveVarC.E(affcVar2) ? 2 : 4);
        } else {
            affcVar2 = affcVar;
            i4 = i2;
        }
        if (bveVarC.I(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            defpackage.dlo dloVar = (defpackage.dlo) bveVarC.f(defpackage.dbl.d);
            boolean zC = ((((i3 & 7168) ^ 3072) > 2048 && bveVarC.C(avvVar)) || (i3 & 3072) == 2048) | bveVarC.C(dloVar);
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                defpackage.avx avxVar = (defpackage.avx) avvVar;
                kvo kvoVar = new kvo(dloVar.dI(avxVar.a), dloVar.dI(avxVar.b));
                bwcVar.ad(kvoVar);
                objS = kvoVar;
            }
            defpackage.cft cftVar3 = cftVar2;
            defpackage.affc affcVar3 = affcVar2;
            defpackage.dai.aA(defpackage.anf.b.b((kvo) objS), defpackage.dai.as(-1519215159, true, new defpackage.ggb(cgfVar, axxVar2, avvVar, athVar2, cftVar3, aorVar, z2, aizVar2, affcVar3, 2), bveVarC), bveVarC, 56);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kvq(cgfVar, axxVar, f, avvVar, athVar, cftVar, aorVar, z, aizVar, affcVar, i, i2, 0);
        }
    }

    public static final void f(defpackage.cgf cgfVar, defpackage.axx axxVar, float f, defpackage.avv avvVar, defpackage.ath athVar, defpackage.cft cftVar, defpackage.aor aorVar, boolean z, defpackage.aiz aizVar, boolean z2, defpackage.affh affhVar, defpackage.affh affhVar2, defpackage.affc affcVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        int i4;
        defpackage.affc affcVar2;
        defpackage.cft cftVar2;
        defpackage.aor aorVar2;
        boolean z3;
        defpackage.aiz aizVar2;
        defpackage.affh affhVar3;
        defpackage.cft cftVar3;
        float f2;
        java.lang.Object arsVar;
        defpackage.aor aorVar3;
        defpackage.aiz aizVarA;
        defpackage.affh affhVar4;
        boolean z4;
        affcVar.getClass();
        defpackage.bve bveVarC = bveVar.c(-432474955);
        if ((i & 6) == 0) {
            i3 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(axxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.z(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.C(avvVar) ? 1024 : 2048;
        }
        int i5 = i3 | 24576;
        if ((196608 & i) == 0) {
            i5 |= true != bveVarC.C(athVar) ? 65536 : 131072;
        }
        int i6 = i5 | 1572864;
        if ((12582912 & i) == 0) {
            i6 = i5 | 5767168;
        }
        int i7 = i6 | 100663296;
        if ((805306368 & i) == 0) {
            i7 = i6 | 369098752;
        }
        if ((i2 & 6) == 0) {
            i4 = (true != bveVarC.D(z2) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != ((i2 & 64) == 0 ? bveVarC.C(affhVar) : bveVarC.E(affhVar)) ? 16 : 32;
        }
        int i8 = i4 | 384;
        if ((i2 & 3072) == 0) {
            affcVar2 = affcVar;
            i8 |= true != bveVarC.E(affcVar2) ? 1024 : 2048;
        } else {
            affcVar2 = affcVar;
        }
        if (bveVarC.I(((306783379 & i7) == 306783378 && (i8 & 1171) == 1170) ? false : true, i7 & 1)) {
            int i9 = i7 & (-1908408321);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                int i10 = i7 >> 3;
                cftVar3 = defpackage.cfs.j;
                axxVar.getClass();
                java.lang.Object objS = bwcVar.S();
                java.lang.Object obj = defpackage.bvd.a;
                if (objS == obj) {
                    objS = new kvr();
                    bwcVar.ad(objS);
                }
                int i11 = (i10 & 14) | 48;
                kvr kvrVar = (kvr) objS;
                boolean z5 = (((i11 & 14) ^ 6) > 4 && bveVarC.C(axxVar)) || (i11 & 6) == 4;
                java.lang.Object objS2 = bwcVar.S();
                if (z5 || objS2 == obj) {
                    objS2 = new defpackage.arm(axxVar, kvrVar);
                    bwcVar.ad(objS2);
                }
                defpackage.arw arwVar = (defpackage.arw) objS2;
                defpackage.dlo dloVar = (defpackage.dlo) bveVarC.f(defpackage.dbl.d);
                defpackage.kwv kwvVarA = defpackage.ads.a(bveVarC);
                boolean zC = bveVarC.C(dloVar) | bveVarC.C(arwVar) | bveVarC.C(kwvVarA);
                java.lang.Object objS3 = bwcVar.S();
                if (zC || objS3 == obj) {
                    f2 = 1.0f;
                    arsVar = new defpackage.ars(arwVar, kwvVarA, new defpackage.aga(1.0f, 400.0f, null));
                    bwcVar.ad(arsVar);
                } else {
                    arsVar = objS3;
                    f2 = 1.0f;
                }
                aorVar3 = (defpackage.ars) arsVar;
                aizVarA = defpackage.alc.a(bveVarC);
                affhVar4 = kvm.a;
                z4 = true;
            } else {
                bveVarC.s();
                cftVar3 = cftVar;
                aorVar3 = aorVar;
                z4 = z;
                aizVarA = aizVar;
                affhVar4 = affhVar2;
                f2 = 1.0f;
            }
            bveVarC.l();
            int i12 = i8;
            defpackage.cft cftVar4 = cftVar3;
            e(defpackage.jya.i(cgfVar, axxVar), axxVar, f, avvVar, athVar, cftVar4, aorVar3, z4, aizVarA, affcVar2, bveVarC, 239075312 & i7, (i8 >> 9) & 14);
            defpackage.aiz aizVar3 = aizVarA;
            bveVarC = bveVarC;
            boolean z6 = z4;
            int i13 = i12 << 6;
            defpackage.affh affhVar5 = affhVar4;
            defpackage.jya.h(axxVar, defpackage.asq.I(defpackage.awj.m(defpackage.awj.b(defpackage.cgf.e, f2), f), 0.0f, defpackage.gjr.P3.k), z2, affhVar, affhVar5, bveVarC, ((i9 >> 3) & 14) | (i13 & 896) | (i13 & 7168) | (i13 & 57344), 0);
            affhVar3 = affhVar5;
            aorVar2 = aorVar3;
            z3 = z6;
            aizVar2 = aizVar3;
            cftVar2 = cftVar3;
        } else {
            bveVarC.s();
            cftVar2 = cftVar;
            aorVar2 = aorVar;
            z3 = z;
            aizVar2 = aizVar;
            affhVar3 = affhVar2;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kvp(cgfVar, axxVar, f, avvVar, athVar, cftVar2, aorVar2, z3, aizVar2, z2, affhVar, affhVar3, affcVar, i, i2);
        }
    }

    public static final void g(defpackage.lby lbyVar, defpackage.zbd zbdVar) {
        defpackage.omf.u().f(defpackage.rrw.h(defpackage.yzd.GEARHEAD, lbyVar.c(), zbdVar));
    }

    public static final j$.time.Duration h(j$.time.Instant instant, defpackage.abqv abqvVar) {
        j$.time.Duration durationBetween = j$.time.Duration.between(defpackage.acmh.z(abqvVar), instant);
        durationBetween.getClass();
        return durationBetween;
    }

    public static final defpackage.lby i(defpackage.zbe zbeVar) {
        return (defpackage.lby) defpackage.lby.c.get(zbeVar);
    }

    public static final defpackage.lby j(int i) {
        defpackage.zbe zbeVarB = defpackage.zbe.b(i);
        if (zbeVarB == null) {
            return null;
        }
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.lby.a;
        return i(zbeVarB);
    }

    public static final void k() {
        defpackage.lby.a.clear();
        defpackage.lby.b.clear();
    }

    public static final void l(defpackage.lby lbyVar, defpackage.zbe zbeVar, defpackage.ygw ygwVar) {
        lbyVar.getClass();
        zbeVar.getClass();
        ygwVar.getClass();
        defpackage.lby.a.put(lbyVar, zbeVar);
        defpackage.lby.b.put(lbyVar, ygwVar);
    }

    public static defpackage.lbx m() {
        return (defpackage.lbx) defpackage.mkp.a.i(defpackage.lbx.class);
    }

    private static final int n(android.content.Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }
}
