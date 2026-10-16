package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mcl {
    public static final void A(android.app.PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (android.app.PendingIntent.CanceledException unused) {
                int i = nyr.s;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void B(nvh nvhVar, boolean z, boolean z2, defpackage.afer aferVar, boolean z3, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        boolean z4;
        boolean z5;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar2;
        java.lang.CharSequence string;
        char c;
        java.lang.String string2;
        aferVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1332329806);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(nvhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z4 = z;
            i2 |= true != bveVarC.D(z4) ? 16 : 32;
        } else {
            z4 = z;
        }
        if ((i & 384) == 0) {
            z5 = z2;
            i2 |= true != bveVarC.D(z5) ? 128 : 256;
        } else {
            z5 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.D(z3) ? 8192 : 16384;
        }
        int i4 = i2 | 196608;
        if (bveVarC.I((74899 & i4) != 74898, i4 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            android.content.Context context = (android.content.Context) bveVarC.f(defpackage.daj.b);
            java.lang.CharSequence charSequence = nvhVar.m;
            boolean z6 = nvhVar.j;
            java.lang.String string3 = charSequence.toString();
            if (z6) {
                string = nvhVar.n;
                if (android.text.TextUtils.isEmpty(string)) {
                    z6 = z6;
                    c = 0;
                    long j = nvhVar.i;
                    defpackage.ooa.b();
                    string = defpackage.ooa.a(context, j);
                } else {
                    z6 = z6;
                    c = 0;
                    java.lang.CharSequence charSequence2 = nvhVar.o;
                    if (!android.text.TextUtils.isEmpty(charSequence2)) {
                        string = context.getString(2132085006, charSequence2, string);
                    }
                }
            } else {
                string = nvhVar.n;
                if (android.text.TextUtils.isEmpty(string)) {
                    string = null;
                }
                c = 0;
            }
            java.lang.String string4 = string != null ? string.toString() : null;
            long j2 = nvhVar.i;
            defpackage.ooa.b();
            defpackage.ojm.a();
            long epochMilli = j$.time.Instant.now().toEpochMilli() - j2;
            if (epochMilli < 60000) {
                string2 = context.getString(2132084652);
            } else if (epochMilli >= 86400000) {
                android.content.res.Resources resources = context.getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[c] = java.lang.Integer.valueOf((int) (epochMilli / 86400000));
                string2 = resources.getString(2132083912, objArr);
            } else if (epochMilli >= 3600000) {
                android.content.res.Resources resources2 = context.getResources();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                objArr2[c] = java.lang.Integer.valueOf((int) (epochMilli / 3600000));
                string2 = resources2.getString(2132084226, objArr2);
            } else {
                android.content.res.Resources resources3 = context.getResources();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                objArr3[c] = java.lang.Integer.valueOf((int) (epochMilli / 60000));
                string2 = resources3.getString(2132084444, objArr3);
            }
            string2.getClass();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            objArr4[c] = string2;
            java.lang.String strF = defpackage.vm.f(2132084643, objArr4, bveVarC);
            com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = nvhVar.d;
            com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2 = nvhVar.b;
            java.lang.String str = string4;
            defpackage.nve nveVar = nvhVar.x;
            nveVar.getClass();
            boolean zE = bveVarC.E(nvhVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zE || objS == defpackage.bvd.a) {
                objS = new nwn(nvhVar, 10);
                bwcVar.ad(objS);
            }
            defpackage.afer aferVar2 = (defpackage.afer) objS;
            boolean z7 = (nveVar == defpackage.nve.h && z6) ? 1 : c;
            int i5 = nvhVar.E;
            boolean z8 = nvhVar.C;
            nvb[] nvbVarArr = new nvb[3];
            nvbVarArr[c] = nvhVar.p;
            nvbVarArr[1] = nvhVar.q;
            nvbVarArr[2] = nvhVar.r;
            bveVar2 = bveVarC;
            z(string3, str, strF, ghIcon, ghIcon2, nveVar, aferVar2, aferVar, z7, i5, z8, defpackage.afga.ac(nvbVarArr), z4, z5, z3, cgcVar, bveVar2, (i4 << 12) & 29360128, ((i4 << 3) & 8064) | (i4 & 57344) | (i4 & 458752));
            cgfVar2 = cgcVar;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar2 = cgfVar;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nyw(nvhVar, z, z2, aferVar, z3, cgfVar2, i);
        }
    }

    public static void C(defpackage.nxh nxhVar, defpackage.zbd zbdVar) {
        int i = nxhVar.m == null ? 0 : 1;
        int i2 = nxhVar.n == null ? 0 : 1;
        int i3 = nxhVar.o == null ? 0 : 1;
        int i4 = nxhVar.p != null ? 1 : 0;
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.SYSTEM_UI_NOTIFICATION, zbdVar);
        defpackage.nxg nxgVar = nxhVar.h;
        java.lang.String str = nxgVar.b;
        rrvVarH.p(new android.content.ComponentName(str, ""));
        defpackage.abor aborVarE = rrvVarH.E();
        aborVarE.t();
        defpackage.zaf zafVar = (defpackage.zaf) aborVarE.b;
        defpackage.zaf zafVar2 = defpackage.zaf.a;
        zafVar.b |= 4;
        zafVar.e = i + i2 + i3 + i4;
        aborVarE.t();
        defpackage.zaf zafVar3 = (defpackage.zaf) aborVarE.b;
        str.getClass();
        zafVar3.b |= 1;
        zafVar3.c = str;
        int iA = nxgVar.c.a();
        aborVarE.t();
        defpackage.zaf zafVar4 = (defpackage.zaf) aborVarE.b;
        zafVar4.d = iA - 1;
        zafVar4.b |= 2;
        long j = nxgVar.d;
        aborVarE.t();
        defpackage.zaf zafVar5 = (defpackage.zaf) aborVarE.b;
        zafVar5.b |= 8;
        zafVar5.f = j;
        boolean z = nxgVar.e;
        aborVarE.t();
        defpackage.zaf zafVar6 = (defpackage.zaf) aborVarE.b;
        zafVar6.b |= 16;
        zafVar6.g = z;
        defpackage.omf.u().f(rrvVarH);
    }

    public static final boolean D(defpackage.nxj nxjVar) {
        return nxjVar == null || nxjVar.d == 1;
    }

    public static final defpackage.zbd E(int i, int i2) {
        int i3 = i - 1;
        if (i3 == 1) {
            if (i2 != 0) {
                return i2 != 1 ? defpackage.zbd.oF : defpackage.zbd.od;
            }
            return defpackage.zbd.oc;
        }
        if (i3 == 3) {
            if (i2 != 0) {
                return i2 != 1 ? defpackage.zbd.oL : defpackage.zbd.oK;
            }
            return defpackage.zbd.oJ;
        }
        if (i2 == 0) {
            return defpackage.zbd.nY;
        }
        if (i2 == 1) {
            return defpackage.zbd.od;
        }
        throw new java.lang.IllegalArgumentException("Position must be 0 or 1");
    }

    public static final void F(defpackage.nxj nxjVar, defpackage.afer aferVar, java.lang.Runnable runnable, defpackage.ktl ktlVar, defpackage.cgf cgfVar, boolean z, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-36368359);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(nxjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(runnable) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(ktlVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.D(z) ? 65536 : 131072;
        }
        if (bveVarC.I((74899 & i2) != 74898, i2 & 1)) {
            defpackage.ccz cczVarAs = defpackage.dai.as(398622970, true, new nws(nxjVar, aferVar, runnable, ktlVar, z), bveVarC);
            if (nxjVar.d == 6) {
                bveVarC.v(-1117312460);
                defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                int iF = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh = bwcVar.ah();
                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
                defpackage.afer aferVar2 = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                defpackage.ats atsVar = defpackage.ats.a;
                defpackage.cgc cgcVar = defpackage.cgf.e;
                defpackage.atp.c(defpackage.lyd.z(atsVar.b(cgcVar), bveVarC), bveVarC, 0);
                cczVarAs.invoke(defpackage.awj.r(cgcVar), bveVarC, 54);
                bwcVar.Y(true);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-1117162327);
                cczVarAs.invoke(cgfVar, bveVarC, java.lang.Integer.valueOf(((i2 >> 12) & 14) | 48));
                ((defpackage.bwc) bveVarC).Y(false);
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bof(nxjVar, aferVar, runnable, ktlVar, cgfVar, z, i, 10);
        }
    }

    public static final void G(defpackage.nxh nxhVar, defpackage.affc affcVar, defpackage.cit citVar, defpackage.cit citVar2, defpackage.cit citVar3, defpackage.cit citVar4, defpackage.cit citVar5, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.affc affcVar2;
        defpackage.cit citVar6;
        defpackage.bve bveVar2;
        boolean z;
        defpackage.ksw kswVarF;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(252740077);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(nxhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            affcVar2 = affcVar;
            i2 |= true != bveVarC.E(affcVar2) ? 16 : 32;
        } else {
            affcVar2 = affcVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(citVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            citVar6 = citVar2;
            i2 |= true != bveVarC.C(citVar6) ? 1024 : 2048;
        } else {
            citVar6 = citVar2;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.C(citVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.C(citVar4) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != bveVarC.C(citVar5) ? 524288 : 1048576;
        }
        if (bveVarC.I((599187 & i2) != 599186, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            java.util.List listBU = defpackage.afga.bU(new defpackage.nxj[]{nxhVar.n, nxhVar.o, nxhVar.p});
            boolean z2 = nxhVar.u == 3;
            java.lang.Integer num = nxhVar.q;
            defpackage.ckd ckdVar = num != null ? new defpackage.ckd(defpackage.cjv.j(num.intValue())) : null;
            if (ckdVar == null) {
                bveVarC.v(-1929898888);
                kswVarF = defpackage.kfp.i(bveVarC);
                z = false;
            } else {
                z = false;
                bveVarC.v(-1929898338);
                kswVarF = defpackage.ksx.f(bveVarC);
            }
            bwcVar.Y(z);
            bveVar2 = bveVarC;
            defpackage.ksz.a(kswVarF, null, false, null, defpackage.dai.as(1562396485, true, new nwp(listBU, nxhVar, affcVar2, ckdVar, citVar, citVar6, citVar3, citVar4, citVar5, z2), bveVarC), bveVar2, 24576, 14);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new hfz(nxhVar, affcVar, citVar, citVar2, citVar3, citVar4, citVar5, i, 4);
        }
    }

    public static final void H(android.app.PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (android.app.PendingIntent.CanceledException unused) {
                float f = nwl.a;
            }
        }
    }

    public static final defpackage.ktl I(int i, boolean z, defpackage.bve bveVar, int i2) {
        defpackage.ktl ktlVarJ;
        defpackage.ktl ktlVarJ2;
        int i3 = i - 1;
        if (i3 == 1) {
            bveVar.v(150604314);
            defpackage.afar afarVar = defpackage.ktl.a;
            defpackage.ktl ktlVarE = defpackage.kgu.e(defpackage.kfp.i(bveVar).d(), 0L, 0L, 0L, 0L, 0L, 0L, bveVar, 254);
            bveVar.o();
            return ktlVarE;
        }
        if (i3 == 2) {
            bveVar.v(150606648);
            defpackage.afar afarVar2 = defpackage.ktl.a;
            defpackage.ktl ktlVarE2 = defpackage.kgu.e(defpackage.kfp.i(bveVar).C(), 0L, 0L, 0L, 0L, 0L, 0L, bveVar, 254);
            bveVar.o();
            return ktlVarE2;
        }
        if (i3 == 3) {
            bveVar.v(150608805);
            defpackage.afar afarVar3 = defpackage.ktl.a;
            defpackage.ktl ktlVarE3 = defpackage.kgu.e(defpackage.kfp.i(bveVar).t(), 0L, 0L, 0L, 0L, 0L, 0L, bveVar, 254);
            bveVar.o();
            return ktlVarE3;
        }
        if (i3 == 4) {
            bveVar.v(150611802);
            defpackage.afar afarVar4 = defpackage.ktl.a;
            defpackage.ktl ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar, 255);
            bveVar.o();
            return ktlVarF;
        }
        if (i3 == 5) {
            bveVar.v(150613882);
            if (defpackage.lyd.x()) {
                bveVar.v(374089088);
                defpackage.afar afarVar5 = defpackage.ktl.a;
                ktlVarJ = defpackage.kgu.e(defpackage.cjv.j(0), defpackage.kfp.i(bveVar).s(), 0L, 0L, 0L, 0L, 0L, bveVar, 252);
                bveVar.o();
            } else {
                bveVar.v(374246599);
                defpackage.afar afarVar6 = defpackage.ktl.a;
                ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVar, 255);
                bveVar.o();
            }
            bveVar.o();
            return ktlVarJ;
        }
        boolean z2 = ((i2 & 2) == 0) & z;
        bveVar.v(150622284);
        if (z2) {
            bveVar.v(374341862);
            defpackage.afar afarVar7 = defpackage.ktl.a;
            ktlVarJ2 = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar, 255);
            bveVar.o();
        } else {
            bveVar.v(374401351);
            defpackage.afar afarVar8 = defpackage.ktl.a;
            ktlVarJ2 = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVar, 255);
            bveVar.o();
        }
        bveVar.o();
        return ktlVarJ2;
    }

    public static final java.lang.Integer J(android.app.Notification notification) {
        notification.getClass();
        android.os.Bundle bundle = notification.extras;
        bundle.getClass();
        if (bundle.containsKey("android.callType")) {
            return java.lang.Integer.valueOf(bundle.getInt("android.callType"));
        }
        return null;
    }

    public static final void K(java.lang.String str) {
        ((defpackage.yqj) nwg.a.g()).y("%s", str);
    }

    public static final long a(android.service.notification.StatusBarNotification statusBarNotification) {
        return (statusBarNotification.getTag() + statusBarNotification.getId() + statusBarNotification.getPackageName() + statusBarNotification.getUser().toString()).hashCode();
    }

    public static void b() {
    }

    public static final defpackage.cit d(defpackage.bwx bwxVar) {
        return (defpackage.cit) bwxVar.a();
    }

    public static final void e(int i, defpackage.cgf cgfVar, mcm mcmVar, defpackage.bve bveVar, int i2, int i3) {
        int i4;
        int i5 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(-288159688);
        if (i5 == 0) {
            i4 = (true != bveVarC.A(i) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        int i7 = i4 | 384;
        if (bveVarC.I((i7 & 147) != 146, i7 & 1)) {
            if (i6 != 0) {
                cgfVar = defpackage.cgf.e;
            }
            mcmVar = mcm.b;
            bmq.a(defpackage.awj.k(cgfVar, i <= 9 ? mcmVar.d : mcmVar.e, mcmVar.c), defpackage.ksx.j(defpackage.kry.i, bveVarC), defpackage.ksx.j(defpackage.kry.j, bveVarC), defpackage.dai.as(474770917, true, new fux(i <= 9 ? java.lang.String.valueOf(i) : "9+", mcmVar, 18), bveVarC), bveVarC, 3072);
        } else {
            bveVarC.s();
        }
        defpackage.cgf cgfVar2 = cgfVar;
        mcm mcmVar2 = mcmVar;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new hbr(i, cgfVar2, mcmVar2, i2, i3, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:101:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:109:0x0224  */
    /* JADX WARN: Code duplicated, block: B:112:0x0258  */
    /* JADX WARN: Code duplicated, block: B:113:0x025c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0286  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:125:0x0312  */
    /* JADX WARN: Code duplicated, block: B:127:0x0327  */
    /* JADX WARN: Code duplicated, block: B:130:0x0335  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4 A[PHI: r0 r6 r7
  0x00e4: PHI (r0v20 int) = (r0v10 int), (r0v21 int) binds: [B:85:0x00f2, B:77:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r6v30 cgf) = (r6v8 cgf), (r6v31 cgf) binds: [B:85:0x00f2, B:77:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r7v11 int) = (r7v5 int), (r7v13 int) binds: [B:85:0x00f2, B:77:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0111  */
    /* JADX WARN: Code duplicated, block: B:91:0x014e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0156  */
    /* JADX WARN: Code duplicated, block: B:97:0x016a  */
    public static final void f(defpackage.affh affhVar, defpackage.affh affhVar2, defpackage.affg affgVar, defpackage.afer aferVar, defpackage.cgf cgfVar, int i, defpackage.cld cldVar, defpackage.bve bveVar, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        int i6;
        defpackage.cld cldVar2;
        boolean z;
        defpackage.affh affhVar3;
        int i7;
        defpackage.cgf cgfVar3;
        defpackage.cld cldVar3;
        defpackage.bxl bxlVarJ;
        int i8;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        int i9;
        defpackage.cld cldVarC;
        defpackage.cgf cgfVarB;
        defpackage.bwc bwcVar2;
        defpackage.atf atfVar;
        defpackage.afer aferVar2;
        int i10;
        defpackage.affg affgVar2;
        defpackage.affg affgVar3;
        defpackage.affg affgVar4;
        defpackage.affc affcVar;
        defpackage.affg affgVar5;
        boolean z2;
        int i11;
        defpackage.cgc cgcVar;
        boolean z3;
        int i12;
        defpackage.bwc bwcVar3;
        int i13;
        java.lang.Object objS;
        int i14;
        affhVar.getClass();
        int i15 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(2114010446);
        if (i15 == 0) {
            i4 = (true != bveVarC.E(affhVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != bveVarC.E(affhVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != bveVarC.E(affgVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 1024 : 2048;
        }
        int i16 = i3 & 16;
        if (i16 == 0) {
            if ((i2 & 24576) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 8192 : 16384;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    if (true != bveVarC.A(i)) {
                        i6 = 65536;
                    } else {
                        i6 = 131072;
                    }
                    i4 |= i6;
                }
                if ((1572864 & i2) == 0) {
                    i14 = 524288;
                    if ((i3 & 64) == 0) {
                        cldVar2 = cldVar;
                        if (bveVarC.C(cldVar2)) {
                            i14 = 1048576;
                        }
                    } else {
                        cldVar2 = cldVar;
                    }
                    i4 |= i14;
                } else {
                    cldVar2 = cldVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i4 & 1)) {
                    i8 = i3 & 64;
                    bwcVar = (defpackage.bwc) bveVarC;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i2 & 1) != 0 || bveVarC.F()) {
                        if (i16 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i5 != 0) {
                            i9 = 0;
                        } else {
                            i9 = i;
                        }
                        if (i8 != 0) {
                            i4 &= -3670017;
                            int i17 = mcx.a;
                            cldVarC = defpackage.bcw.c(24.0f, 0.0f, 0.0f, 24.0f);
                        }
                        bveVarC.l();
                        bveVarC.v(44523303);
                        cgfVarB = defpackage.awj.b(cgfVar4, 1.0f);
                        if (aferVar != null) {
                            atfVar = null;
                            defpackage.cgf cgfVarA = defpackage.kvi.a(cgfVarB, cldVarC, 0L, 0L, null, null, null, true, false, bveVarC, ((i4 >> 15) & 112) | 12582912, 190);
                            i13 = i4 & 7168;
                            objS = bwcVar.S();
                            if (i13 != 2048 || objS == defpackage.bvd.a) {
                                bveVarC = bveVarC;
                                bveVarC = bveVarC;
                                objS = new defpackage.lgy(aferVar, 18);
                                bwcVar2 = bwcVar;
                                bwcVar2.ad(objS);
                            } else {
                                bveVarC = bveVarC;
                                bwcVar2 = bwcVar;
                            }
                            cgfVarB = defpackage.afw.x(cgfVarA, true, null, null, (defpackage.afer) objS);
                        } else {
                            bwcVar2 = bwcVar;
                            atfVar = null;
                        }
                        bwcVar2.Y(false);
                        int i18 = mcx.a;
                        float f = mcw.a;
                        defpackage.cgf cgfVarH = defpackage.asq.H(cgfVarB, f);
                        defpackage.cty ctyVarA = defpackage.awb.a(new defpackage.ate(f, false, atfVar), defpackage.cfs.n, bveVarC, 54);
                        int iF = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh = bwcVar2.ah();
                        defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarH);
                        aferVar2 = defpackage.cwl.a;
                        bveVarC.w();
                        i10 = i4;
                        if (bwcVar2.t) {
                            bveVarC.j(aferVar2);
                        } else {
                            bveVarC.y();
                        }
                        affgVar2 = defpackage.cwl.e;
                        defpackage.byw.c(bveVarC, ctyVarA, affgVar2);
                        affgVar3 = defpackage.cwl.d;
                        defpackage.byw.c(bveVarC, cddVarAh, affgVar3);
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iF);
                        affgVar4 = defpackage.cwl.f;
                        defpackage.byw.c(bveVarC, numValueOf, affgVar4);
                        affcVar = defpackage.cwl.g;
                        defpackage.byw.b(bveVarC, affcVar);
                        affgVar5 = defpackage.cwl.c;
                        defpackage.byw.c(bveVarC, cgfVarN, affgVar5);
                        defpackage.awe aweVar = defpackage.awe.a;
                        if (affgVar != null) {
                            bveVarC.v(-10679747);
                            defpackage.cgf cgfVarI = defpackage.awj.i(defpackage.cgf.e, 64.0f);
                            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.e, false);
                            int iF2 = defpackage.a.f(bwcVar2.u);
                            defpackage.cdd cddVarAh2 = bwcVar2.ah();
                            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarI);
                            bveVarC.w();
                            if (bwcVar2.t) {
                                bveVarC.j(aferVar2);
                            } else {
                                bveVarC.y();
                            }
                            defpackage.byw.c(bveVarC, ctyVarB, affgVar2);
                            defpackage.byw.c(bveVarC, cddVarAh2, affgVar3);
                            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar4);
                            defpackage.byw.b(bveVarC, affcVar);
                            defpackage.byw.c(bveVarC, cgfVarN2, affgVar5);
                            affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i10 >> 6) & 14));
                            z2 = true;
                            bwcVar2.Y(true);
                            i11 = 0;
                            bwcVar2.Y(false);
                        } else {
                            z2 = true;
                            i11 = 0;
                            bveVarC.v(-10561544);
                            bwcVar2.Y(false);
                        }
                        cgcVar = defpackage.cgf.e;
                        defpackage.cgf cgfVarB2 = aweVar.b(cgcVar, 1.0f, z2);
                        defpackage.cty ctyVarA2 = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVarC, i11);
                        int iF3 = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh3 = bwcVar2.ah();
                        defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVarB2);
                        bveVarC.w();
                        if (bwcVar2.t) {
                            bveVarC.j(aferVar2);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarA2, affgVar2);
                        defpackage.byw.c(bveVarC, cddVarAh3, affgVar3);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF3), affgVar4);
                        defpackage.byw.b(bveVarC, affcVar);
                        defpackage.byw.c(bveVarC, cgfVarN3, affgVar5);
                        affhVar.invoke(new defpackage.lyd(), bveVarC, java.lang.Integer.valueOf((i10 << 3) & 112));
                        if (affhVar2 != null) {
                            bveVarC.v(-1662087044);
                            affhVar3 = affhVar2;
                            affhVar3.invoke(new defpackage.mcl(), bveVarC, java.lang.Integer.valueOf(i10 & 112));
                            bwcVar2.Y(false);
                        } else {
                            affhVar3 = affhVar2;
                            bveVarC.v(-1662038994);
                            bwcVar2.Y(false);
                        }
                        z3 = true;
                        bwcVar2.Y(true);
                        if (i9 > 1) {
                            int i19 = i10 >> 15;
                            bveVarC.v(-10373746);
                            defpackage.cgf cgfVarJ = defpackage.asq.J(cgcVar, 0.0f, 0.0f, defpackage.gjr.P2.k, 0.0f);
                            defpackage.cty ctyVarB2 = defpackage.atp.b(defpackage.cfs.a, false);
                            i12 = i9;
                            int iF4 = defpackage.a.f(bwcVar2.u);
                            defpackage.cdd cddVarAh4 = bwcVar2.ah();
                            defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVarJ);
                            bveVarC.w();
                            if (bwcVar2.t) {
                                bveVarC.j(aferVar2);
                            } else {
                                bveVarC.y();
                            }
                            defpackage.byw.c(bveVarC, ctyVarB2, affgVar2);
                            defpackage.byw.c(bveVarC, cddVarAh4, affgVar3);
                            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF4), affgVar4);
                            defpackage.byw.b(bveVarC, affcVar);
                            defpackage.byw.c(bveVarC, cgfVarN4, affgVar5);
                            bwcVar3 = bwcVar2;
                            e(i12, null, null, bveVarC, i19 & 14, 6);
                            z3 = true;
                            bwcVar3.Y(true);
                            bwcVar3.Y(false);
                        } else {
                            i12 = i9;
                            bwcVar3 = bwcVar2;
                            bveVarC.v(-10271880);
                            bwcVar3.Y(false);
                        }
                        bwcVar3.Y(z3);
                        cldVar3 = cldVarC;
                        i7 = i12;
                        cgfVar3 = cgfVar4;
                    } else {
                        bveVarC.s();
                        if (i8 != 0) {
                            i4 &= -3670017;
                        }
                        i9 = i;
                        cgfVar4 = cgfVar2;
                    }
                    cldVarC = cldVar2;
                    bveVarC.l();
                    bveVarC.v(44523303);
                    cgfVarB = defpackage.awj.b(cgfVar4, 1.0f);
                    if (aferVar != null) {
                        atfVar = null;
                        defpackage.cgf cgfVarA2 = defpackage.kvi.a(cgfVarB, cldVarC, 0L, 0L, null, null, null, true, false, bveVarC, ((i4 >> 15) & 112) | 12582912, 190);
                        i13 = i4 & 7168;
                        objS = bwcVar.S();
                        if (i13 != 2048) {
                            bveVarC = bveVarC;
                            bveVarC = bveVarC;
                            objS = new defpackage.lgy(aferVar, 18);
                            bwcVar2 = bwcVar;
                            bwcVar2.ad(objS);
                        } else {
                            bveVarC = bveVarC;
                            bveVarC = bveVarC;
                            objS = new defpackage.lgy(aferVar, 18);
                            bwcVar2 = bwcVar;
                            bwcVar2.ad(objS);
                        }
                        cgfVarB = defpackage.afw.x(cgfVarA2, true, null, null, (defpackage.afer) objS);
                    } else {
                        bwcVar2 = bwcVar;
                        atfVar = null;
                    }
                    bwcVar2.Y(false);
                    int i110 = mcx.a;
                    float f2 = mcw.a;
                    defpackage.cgf cgfVarH2 = defpackage.asq.H(cgfVarB, f2);
                    defpackage.cty ctyVarA3 = defpackage.awb.a(new defpackage.ate(f2, false, atfVar), defpackage.cfs.n, bveVarC, 54);
                    int iF5 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh5 = bwcVar2.ah();
                    defpackage.cgf cgfVarN5 = defpackage.bzo.n(bveVarC, cgfVarH2);
                    aferVar2 = defpackage.cwl.a;
                    bveVarC.w();
                    i10 = i4;
                    if (bwcVar2.t) {
                        bveVarC.j(aferVar2);
                    } else {
                        bveVarC.y();
                    }
                    affgVar2 = defpackage.cwl.e;
                    defpackage.byw.c(bveVarC, ctyVarA3, affgVar2);
                    affgVar3 = defpackage.cwl.d;
                    defpackage.byw.c(bveVarC, cddVarAh5, affgVar3);
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iF5);
                    affgVar4 = defpackage.cwl.f;
                    defpackage.byw.c(bveVarC, numValueOf2, affgVar4);
                    affcVar = defpackage.cwl.g;
                    defpackage.byw.b(bveVarC, affcVar);
                    affgVar5 = defpackage.cwl.c;
                    defpackage.byw.c(bveVarC, cgfVarN5, affgVar5);
                    defpackage.awe aweVar2 = defpackage.awe.a;
                    if (affgVar != null) {
                        bveVarC.v(-10679747);
                        defpackage.cgf cgfVarI2 = defpackage.awj.i(defpackage.cgf.e, 64.0f);
                        defpackage.cty ctyVarB3 = defpackage.atp.b(defpackage.cfs.e, false);
                        int iF6 = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh6 = bwcVar2.ah();
                        defpackage.cgf cgfVarN6 = defpackage.bzo.n(bveVarC, cgfVarI2);
                        bveVarC.w();
                        if (bwcVar2.t) {
                            bveVarC.j(aferVar2);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarB3, affgVar2);
                        defpackage.byw.c(bveVarC, cddVarAh6, affgVar3);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF6), affgVar4);
                        defpackage.byw.b(bveVarC, affcVar);
                        defpackage.byw.c(bveVarC, cgfVarN6, affgVar5);
                        affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i10 >> 6) & 14));
                        z2 = true;
                        bwcVar2.Y(true);
                        i11 = 0;
                        bwcVar2.Y(false);
                    } else {
                        z2 = true;
                        i11 = 0;
                        bveVarC.v(-10561544);
                        bwcVar2.Y(false);
                    }
                    cgcVar = defpackage.cgf.e;
                    defpackage.cgf cgfVarB3 = aweVar2.b(cgcVar, 1.0f, z2);
                    defpackage.cty ctyVarA4 = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVarC, i11);
                    int iF7 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh7 = bwcVar2.ah();
                    defpackage.cgf cgfVarN7 = defpackage.bzo.n(bveVarC, cgfVarB3);
                    bveVarC.w();
                    if (bwcVar2.t) {
                        bveVarC.j(aferVar2);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarA4, affgVar2);
                    defpackage.byw.c(bveVarC, cddVarAh7, affgVar3);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF7), affgVar4);
                    defpackage.byw.b(bveVarC, affcVar);
                    defpackage.byw.c(bveVarC, cgfVarN7, affgVar5);
                    affhVar.invoke(new defpackage.lyd(), bveVarC, java.lang.Integer.valueOf((i10 << 3) & 112));
                    if (affhVar2 != null) {
                        bveVarC.v(-1662087044);
                        affhVar3 = affhVar2;
                        affhVar3.invoke(new defpackage.mcl(), bveVarC, java.lang.Integer.valueOf(i10 & 112));
                        bwcVar2.Y(false);
                    } else {
                        affhVar3 = affhVar2;
                        bveVarC.v(-1662038994);
                        bwcVar2.Y(false);
                    }
                    z3 = true;
                    bwcVar2.Y(true);
                    if (i9 > 1) {
                        int i111 = i10 >> 15;
                        bveVarC.v(-10373746);
                        defpackage.cgf cgfVarJ2 = defpackage.asq.J(cgcVar, 0.0f, 0.0f, defpackage.gjr.P2.k, 0.0f);
                        defpackage.cty ctyVarB4 = defpackage.atp.b(defpackage.cfs.a, false);
                        i12 = i9;
                        int iF8 = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh8 = bwcVar2.ah();
                        defpackage.cgf cgfVarN8 = defpackage.bzo.n(bveVarC, cgfVarJ2);
                        bveVarC.w();
                        if (bwcVar2.t) {
                            bveVarC.j(aferVar2);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarB4, affgVar2);
                        defpackage.byw.c(bveVarC, cddVarAh8, affgVar3);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF8), affgVar4);
                        defpackage.byw.b(bveVarC, affcVar);
                        defpackage.byw.c(bveVarC, cgfVarN8, affgVar5);
                        bwcVar3 = bwcVar2;
                        e(i12, null, null, bveVarC, i111 & 14, 6);
                        z3 = true;
                        bwcVar3.Y(true);
                        bwcVar3.Y(false);
                    } else {
                        i12 = i9;
                        bwcVar3 = bwcVar2;
                        bveVarC.v(-10271880);
                        bwcVar3.Y(false);
                    }
                    bwcVar3.Y(z3);
                    cldVar3 = cldVarC;
                    i7 = i12;
                    cgfVar3 = cgfVar4;
                } else {
                    affhVar3 = affhVar2;
                    bveVarC.s();
                    i7 = i;
                    cgfVar3 = cgfVar2;
                    cldVar3 = cldVar2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new ope(affhVar, affhVar3, affgVar, aferVar, cgfVar3, i7, cldVar3, i2, i3, 1);
                }
            }
            i4 |= 196608;
            if ((1572864 & i2) == 0) {
                i14 = 524288;
                if ((i3 & 64) == 0) {
                    cldVar2 = cldVar;
                    if (bveVarC.C(cldVar2)) {
                        i14 = 1048576;
                    }
                } else {
                    cldVar2 = cldVar;
                }
                i4 |= i14;
            } else {
                cldVar2 = cldVar;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i4 & 1)) {
                i8 = i3 & 64;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i5 != 0) {
                        i9 = 0;
                    } else {
                        i9 = i;
                    }
                    if (i8 != 0) {
                        i4 &= -3670017;
                        int i112 = mcx.a;
                        cldVarC = defpackage.bcw.c(24.0f, 0.0f, 0.0f, 24.0f);
                    } else {
                        cldVarC = cldVar2;
                    }
                } else {
                    if (i16 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i5 != 0) {
                        i9 = 0;
                    } else {
                        i9 = i;
                    }
                    if (i8 != 0) {
                        i4 &= -3670017;
                        int i113 = mcx.a;
                        cldVarC = defpackage.bcw.c(24.0f, 0.0f, 0.0f, 24.0f);
                    } else {
                        cldVarC = cldVar2;
                    }
                }
                bveVarC.l();
                bveVarC.v(44523303);
                cgfVarB = defpackage.awj.b(cgfVar4, 1.0f);
                if (aferVar != null) {
                    atfVar = null;
                    defpackage.cgf cgfVarA3 = defpackage.kvi.a(cgfVarB, cldVarC, 0L, 0L, null, null, null, true, false, bveVarC, ((i4 >> 15) & 112) | 12582912, 190);
                    i13 = i4 & 7168;
                    objS = bwcVar.S();
                    if (i13 != 2048) {
                        bveVarC = bveVarC;
                        bveVarC = bveVarC;
                        objS = new defpackage.lgy(aferVar, 18);
                        bwcVar2 = bwcVar;
                        bwcVar2.ad(objS);
                    } else {
                        bveVarC = bveVarC;
                        bveVarC = bveVarC;
                        objS = new defpackage.lgy(aferVar, 18);
                        bwcVar2 = bwcVar;
                        bwcVar2.ad(objS);
                    }
                    cgfVarB = defpackage.afw.x(cgfVarA3, true, null, null, (defpackage.afer) objS);
                } else {
                    bwcVar2 = bwcVar;
                    atfVar = null;
                }
                bwcVar2.Y(false);
                int i114 = mcx.a;
                float f3 = mcw.a;
                defpackage.cgf cgfVarH3 = defpackage.asq.H(cgfVarB, f3);
                defpackage.cty ctyVarA5 = defpackage.awb.a(new defpackage.ate(f3, false, atfVar), defpackage.cfs.n, bveVarC, 54);
                int iF9 = defpackage.a.f(bwcVar2.u);
                defpackage.cdd cddVarAh9 = bwcVar2.ah();
                defpackage.cgf cgfVarN9 = defpackage.bzo.n(bveVarC, cgfVarH3);
                aferVar2 = defpackage.cwl.a;
                bveVarC.w();
                i10 = i4;
                if (bwcVar2.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                affgVar2 = defpackage.cwl.e;
                defpackage.byw.c(bveVarC, ctyVarA5, affgVar2);
                affgVar3 = defpackage.cwl.d;
                defpackage.byw.c(bveVarC, cddVarAh9, affgVar3);
                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(iF9);
                affgVar4 = defpackage.cwl.f;
                defpackage.byw.c(bveVarC, numValueOf3, affgVar4);
                affcVar = defpackage.cwl.g;
                defpackage.byw.b(bveVarC, affcVar);
                affgVar5 = defpackage.cwl.c;
                defpackage.byw.c(bveVarC, cgfVarN9, affgVar5);
                defpackage.awe aweVar3 = defpackage.awe.a;
                if (affgVar != null) {
                    bveVarC.v(-10679747);
                    defpackage.cgf cgfVarI3 = defpackage.awj.i(defpackage.cgf.e, 64.0f);
                    defpackage.cty ctyVarB5 = defpackage.atp.b(defpackage.cfs.e, false);
                    int iF10 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh10 = bwcVar2.ah();
                    defpackage.cgf cgfVarN10 = defpackage.bzo.n(bveVarC, cgfVarI3);
                    bveVarC.w();
                    if (bwcVar2.t) {
                        bveVarC.j(aferVar2);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarB5, affgVar2);
                    defpackage.byw.c(bveVarC, cddVarAh10, affgVar3);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF10), affgVar4);
                    defpackage.byw.b(bveVarC, affcVar);
                    defpackage.byw.c(bveVarC, cgfVarN10, affgVar5);
                    affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i10 >> 6) & 14));
                    z2 = true;
                    bwcVar2.Y(true);
                    i11 = 0;
                    bwcVar2.Y(false);
                } else {
                    z2 = true;
                    i11 = 0;
                    bveVarC.v(-10561544);
                    bwcVar2.Y(false);
                }
                cgcVar = defpackage.cgf.e;
                defpackage.cgf cgfVarB4 = aweVar3.b(cgcVar, 1.0f, z2);
                defpackage.cty ctyVarA6 = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVarC, i11);
                int iF11 = defpackage.a.f(bwcVar2.u);
                defpackage.cdd cddVarAh11 = bwcVar2.ah();
                defpackage.cgf cgfVarN11 = defpackage.bzo.n(bveVarC, cgfVarB4);
                bveVarC.w();
                if (bwcVar2.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA6, affgVar2);
                defpackage.byw.c(bveVarC, cddVarAh11, affgVar3);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF11), affgVar4);
                defpackage.byw.b(bveVarC, affcVar);
                defpackage.byw.c(bveVarC, cgfVarN11, affgVar5);
                affhVar.invoke(new defpackage.lyd(), bveVarC, java.lang.Integer.valueOf((i10 << 3) & 112));
                if (affhVar2 != null) {
                    bveVarC.v(-1662087044);
                    affhVar3 = affhVar2;
                    affhVar3.invoke(new defpackage.mcl(), bveVarC, java.lang.Integer.valueOf(i10 & 112));
                    bwcVar2.Y(false);
                } else {
                    affhVar3 = affhVar2;
                    bveVarC.v(-1662038994);
                    bwcVar2.Y(false);
                }
                z3 = true;
                bwcVar2.Y(true);
                if (i9 > 1) {
                    int i115 = i10 >> 15;
                    bveVarC.v(-10373746);
                    defpackage.cgf cgfVarJ3 = defpackage.asq.J(cgcVar, 0.0f, 0.0f, defpackage.gjr.P2.k, 0.0f);
                    defpackage.cty ctyVarB6 = defpackage.atp.b(defpackage.cfs.a, false);
                    i12 = i9;
                    int iF12 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh12 = bwcVar2.ah();
                    defpackage.cgf cgfVarN12 = defpackage.bzo.n(bveVarC, cgfVarJ3);
                    bveVarC.w();
                    if (bwcVar2.t) {
                        bveVarC.j(aferVar2);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarB6, affgVar2);
                    defpackage.byw.c(bveVarC, cddVarAh12, affgVar3);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF12), affgVar4);
                    defpackage.byw.b(bveVarC, affcVar);
                    defpackage.byw.c(bveVarC, cgfVarN12, affgVar5);
                    bwcVar3 = bwcVar2;
                    e(i12, null, null, bveVarC, i115 & 14, 6);
                    z3 = true;
                    bwcVar3.Y(true);
                    bwcVar3.Y(false);
                } else {
                    i12 = i9;
                    bwcVar3 = bwcVar2;
                    bveVarC.v(-10271880);
                    bwcVar3.Y(false);
                }
                bwcVar3.Y(z3);
                cldVar3 = cldVarC;
                i7 = i12;
                cgfVar3 = cgfVar4;
            } else {
                affhVar3 = affhVar2;
                bveVarC.s();
                i7 = i;
                cgfVar3 = cgfVar2;
                cldVar3 = cldVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new ope(affhVar, affhVar3, affgVar, aferVar, cgfVar3, i7, cldVar3, i2, i3, 1);
            }
        }
        i4 |= 24576;
        cgfVar2 = cgfVar;
        i5 = i3 & 32;
        if (i5 != 0) {
            if ((196608 & i2) == 0) {
                if (true != bveVarC.A(i)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i4 |= i6;
            }
            if ((1572864 & i2) == 0) {
                i14 = 524288;
                if ((i3 & 64) == 0) {
                    cldVar2 = cldVar;
                    if (bveVarC.C(cldVar2)) {
                        i14 = 1048576;
                    }
                } else {
                    cldVar2 = cldVar;
                }
                i4 |= i14;
            } else {
                cldVar2 = cldVar;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i4 & 1)) {
                i8 = i3 & 64;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i5 != 0) {
                        i9 = 0;
                    } else {
                        i9 = i;
                    }
                    if (i8 != 0) {
                        i4 &= -3670017;
                        int i116 = mcx.a;
                        cldVarC = defpackage.bcw.c(24.0f, 0.0f, 0.0f, 24.0f);
                    } else {
                        cldVarC = cldVar2;
                    }
                } else {
                    if (i16 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i5 != 0) {
                        i9 = 0;
                    } else {
                        i9 = i;
                    }
                    if (i8 != 0) {
                        i4 &= -3670017;
                        int i117 = mcx.a;
                        cldVarC = defpackage.bcw.c(24.0f, 0.0f, 0.0f, 24.0f);
                    } else {
                        cldVarC = cldVar2;
                    }
                }
                bveVarC.l();
                bveVarC.v(44523303);
                cgfVarB = defpackage.awj.b(cgfVar4, 1.0f);
                if (aferVar != null) {
                    atfVar = null;
                    defpackage.cgf cgfVarA4 = defpackage.kvi.a(cgfVarB, cldVarC, 0L, 0L, null, null, null, true, false, bveVarC, ((i4 >> 15) & 112) | 12582912, 190);
                    i13 = i4 & 7168;
                    objS = bwcVar.S();
                    if (i13 != 2048) {
                        bveVarC = bveVarC;
                        bveVarC = bveVarC;
                        objS = new defpackage.lgy(aferVar, 18);
                        bwcVar2 = bwcVar;
                        bwcVar2.ad(objS);
                    } else {
                        bveVarC = bveVarC;
                        bveVarC = bveVarC;
                        objS = new defpackage.lgy(aferVar, 18);
                        bwcVar2 = bwcVar;
                        bwcVar2.ad(objS);
                    }
                    cgfVarB = defpackage.afw.x(cgfVarA4, true, null, null, (defpackage.afer) objS);
                } else {
                    bwcVar2 = bwcVar;
                    atfVar = null;
                }
                bwcVar2.Y(false);
                int i118 = mcx.a;
                float f4 = mcw.a;
                defpackage.cgf cgfVarH4 = defpackage.asq.H(cgfVarB, f4);
                defpackage.cty ctyVarA7 = defpackage.awb.a(new defpackage.ate(f4, false, atfVar), defpackage.cfs.n, bveVarC, 54);
                int iF13 = defpackage.a.f(bwcVar2.u);
                defpackage.cdd cddVarAh13 = bwcVar2.ah();
                defpackage.cgf cgfVarN13 = defpackage.bzo.n(bveVarC, cgfVarH4);
                aferVar2 = defpackage.cwl.a;
                bveVarC.w();
                i10 = i4;
                if (bwcVar2.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                affgVar2 = defpackage.cwl.e;
                defpackage.byw.c(bveVarC, ctyVarA7, affgVar2);
                affgVar3 = defpackage.cwl.d;
                defpackage.byw.c(bveVarC, cddVarAh13, affgVar3);
                java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(iF13);
                affgVar4 = defpackage.cwl.f;
                defpackage.byw.c(bveVarC, numValueOf4, affgVar4);
                affcVar = defpackage.cwl.g;
                defpackage.byw.b(bveVarC, affcVar);
                affgVar5 = defpackage.cwl.c;
                defpackage.byw.c(bveVarC, cgfVarN13, affgVar5);
                defpackage.awe aweVar4 = defpackage.awe.a;
                if (affgVar != null) {
                    bveVarC.v(-10679747);
                    defpackage.cgf cgfVarI4 = defpackage.awj.i(defpackage.cgf.e, 64.0f);
                    defpackage.cty ctyVarB7 = defpackage.atp.b(defpackage.cfs.e, false);
                    int iF14 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh14 = bwcVar2.ah();
                    defpackage.cgf cgfVarN14 = defpackage.bzo.n(bveVarC, cgfVarI4);
                    bveVarC.w();
                    if (bwcVar2.t) {
                        bveVarC.j(aferVar2);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarB7, affgVar2);
                    defpackage.byw.c(bveVarC, cddVarAh14, affgVar3);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF14), affgVar4);
                    defpackage.byw.b(bveVarC, affcVar);
                    defpackage.byw.c(bveVarC, cgfVarN14, affgVar5);
                    affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i10 >> 6) & 14));
                    z2 = true;
                    bwcVar2.Y(true);
                    i11 = 0;
                    bwcVar2.Y(false);
                } else {
                    z2 = true;
                    i11 = 0;
                    bveVarC.v(-10561544);
                    bwcVar2.Y(false);
                }
                cgcVar = defpackage.cgf.e;
                defpackage.cgf cgfVarB5 = aweVar4.b(cgcVar, 1.0f, z2);
                defpackage.cty ctyVarA8 = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVarC, i11);
                int iF15 = defpackage.a.f(bwcVar2.u);
                defpackage.cdd cddVarAh15 = bwcVar2.ah();
                defpackage.cgf cgfVarN15 = defpackage.bzo.n(bveVarC, cgfVarB5);
                bveVarC.w();
                if (bwcVar2.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA8, affgVar2);
                defpackage.byw.c(bveVarC, cddVarAh15, affgVar3);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF15), affgVar4);
                defpackage.byw.b(bveVarC, affcVar);
                defpackage.byw.c(bveVarC, cgfVarN15, affgVar5);
                affhVar.invoke(new defpackage.lyd(), bveVarC, java.lang.Integer.valueOf((i10 << 3) & 112));
                if (affhVar2 != null) {
                    bveVarC.v(-1662087044);
                    affhVar3 = affhVar2;
                    affhVar3.invoke(new defpackage.mcl(), bveVarC, java.lang.Integer.valueOf(i10 & 112));
                    bwcVar2.Y(false);
                } else {
                    affhVar3 = affhVar2;
                    bveVarC.v(-1662038994);
                    bwcVar2.Y(false);
                }
                z3 = true;
                bwcVar2.Y(true);
                if (i9 > 1) {
                    int i119 = i10 >> 15;
                    bveVarC.v(-10373746);
                    defpackage.cgf cgfVarJ4 = defpackage.asq.J(cgcVar, 0.0f, 0.0f, defpackage.gjr.P2.k, 0.0f);
                    defpackage.cty ctyVarB8 = defpackage.atp.b(defpackage.cfs.a, false);
                    i12 = i9;
                    int iF16 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh16 = bwcVar2.ah();
                    defpackage.cgf cgfVarN16 = defpackage.bzo.n(bveVarC, cgfVarJ4);
                    bveVarC.w();
                    if (bwcVar2.t) {
                        bveVarC.j(aferVar2);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarB8, affgVar2);
                    defpackage.byw.c(bveVarC, cddVarAh16, affgVar3);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF16), affgVar4);
                    defpackage.byw.b(bveVarC, affcVar);
                    defpackage.byw.c(bveVarC, cgfVarN16, affgVar5);
                    bwcVar3 = bwcVar2;
                    e(i12, null, null, bveVarC, i119 & 14, 6);
                    z3 = true;
                    bwcVar3.Y(true);
                    bwcVar3.Y(false);
                } else {
                    i12 = i9;
                    bwcVar3 = bwcVar2;
                    bveVarC.v(-10271880);
                    bwcVar3.Y(false);
                }
                bwcVar3.Y(z3);
                cldVar3 = cldVarC;
                i7 = i12;
                cgfVar3 = cgfVar4;
            } else {
                affhVar3 = affhVar2;
                bveVarC.s();
                i7 = i;
                cgfVar3 = cgfVar2;
                cldVar3 = cldVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new ope(affhVar, affhVar3, affgVar, aferVar, cgfVar3, i7, cldVar3, i2, i3, 1);
            }
        }
        i4 |= 196608;
        if ((1572864 & i2) == 0) {
            i14 = 524288;
            if ((i3 & 64) == 0) {
                cldVar2 = cldVar;
                if (bveVarC.C(cldVar2)) {
                    i14 = 1048576;
                }
            } else {
                cldVar2 = cldVar;
            }
            i4 |= i14;
        } else {
            cldVar2 = cldVar;
        }
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i4 & 1)) {
            i8 = i3 & 64;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i2 & 1) != 0) {
                if (i16 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i5 != 0) {
                    i9 = 0;
                } else {
                    i9 = i;
                }
                if (i8 != 0) {
                    i4 &= -3670017;
                    int i1110 = mcx.a;
                    cldVarC = defpackage.bcw.c(24.0f, 0.0f, 0.0f, 24.0f);
                } else {
                    cldVarC = cldVar2;
                }
            } else {
                if (i16 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i5 != 0) {
                    i9 = 0;
                } else {
                    i9 = i;
                }
                if (i8 != 0) {
                    i4 &= -3670017;
                    int i1111 = mcx.a;
                    cldVarC = defpackage.bcw.c(24.0f, 0.0f, 0.0f, 24.0f);
                } else {
                    cldVarC = cldVar2;
                }
            }
            bveVarC.l();
            bveVarC.v(44523303);
            cgfVarB = defpackage.awj.b(cgfVar4, 1.0f);
            if (aferVar != null) {
                atfVar = null;
                defpackage.cgf cgfVarA5 = defpackage.kvi.a(cgfVarB, cldVarC, 0L, 0L, null, null, null, true, false, bveVarC, ((i4 >> 15) & 112) | 12582912, 190);
                i13 = i4 & 7168;
                objS = bwcVar.S();
                if (i13 != 2048) {
                    bveVarC = bveVarC;
                    bveVarC = bveVarC;
                    objS = new defpackage.lgy(aferVar, 18);
                    bwcVar2 = bwcVar;
                    bwcVar2.ad(objS);
                } else {
                    bveVarC = bveVarC;
                    bveVarC = bveVarC;
                    objS = new defpackage.lgy(aferVar, 18);
                    bwcVar2 = bwcVar;
                    bwcVar2.ad(objS);
                }
                cgfVarB = defpackage.afw.x(cgfVarA5, true, null, null, (defpackage.afer) objS);
            } else {
                bwcVar2 = bwcVar;
                atfVar = null;
            }
            bwcVar2.Y(false);
            int i1112 = mcx.a;
            float f5 = mcw.a;
            defpackage.cgf cgfVarH5 = defpackage.asq.H(cgfVarB, f5);
            defpackage.cty ctyVarA9 = defpackage.awb.a(new defpackage.ate(f5, false, atfVar), defpackage.cfs.n, bveVarC, 54);
            int iF17 = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh17 = bwcVar2.ah();
            defpackage.cgf cgfVarN17 = defpackage.bzo.n(bveVarC, cgfVarH5);
            aferVar2 = defpackage.cwl.a;
            bveVarC.w();
            i10 = i4;
            if (bwcVar2.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            affgVar2 = defpackage.cwl.e;
            defpackage.byw.c(bveVarC, ctyVarA9, affgVar2);
            affgVar3 = defpackage.cwl.d;
            defpackage.byw.c(bveVarC, cddVarAh17, affgVar3);
            java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(iF17);
            affgVar4 = defpackage.cwl.f;
            defpackage.byw.c(bveVarC, numValueOf5, affgVar4);
            affcVar = defpackage.cwl.g;
            defpackage.byw.b(bveVarC, affcVar);
            affgVar5 = defpackage.cwl.c;
            defpackage.byw.c(bveVarC, cgfVarN17, affgVar5);
            defpackage.awe aweVar5 = defpackage.awe.a;
            if (affgVar != null) {
                bveVarC.v(-10679747);
                defpackage.cgf cgfVarI5 = defpackage.awj.i(defpackage.cgf.e, 64.0f);
                defpackage.cty ctyVarB9 = defpackage.atp.b(defpackage.cfs.e, false);
                int iF18 = defpackage.a.f(bwcVar2.u);
                defpackage.cdd cddVarAh18 = bwcVar2.ah();
                defpackage.cgf cgfVarN18 = defpackage.bzo.n(bveVarC, cgfVarI5);
                bveVarC.w();
                if (bwcVar2.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB9, affgVar2);
                defpackage.byw.c(bveVarC, cddVarAh18, affgVar3);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF18), affgVar4);
                defpackage.byw.b(bveVarC, affcVar);
                defpackage.byw.c(bveVarC, cgfVarN18, affgVar5);
                affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i10 >> 6) & 14));
                z2 = true;
                bwcVar2.Y(true);
                i11 = 0;
                bwcVar2.Y(false);
            } else {
                z2 = true;
                i11 = 0;
                bveVarC.v(-10561544);
                bwcVar2.Y(false);
            }
            cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarB6 = aweVar5.b(cgcVar, 1.0f, z2);
            defpackage.cty ctyVarA10 = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVarC, i11);
            int iF19 = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh19 = bwcVar2.ah();
            defpackage.cgf cgfVarN19 = defpackage.bzo.n(bveVarC, cgfVarB6);
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA10, affgVar2);
            defpackage.byw.c(bveVarC, cddVarAh19, affgVar3);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF19), affgVar4);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN19, affgVar5);
            affhVar.invoke(new defpackage.lyd(), bveVarC, java.lang.Integer.valueOf((i10 << 3) & 112));
            if (affhVar2 != null) {
                bveVarC.v(-1662087044);
                affhVar3 = affhVar2;
                affhVar3.invoke(new defpackage.mcl(), bveVarC, java.lang.Integer.valueOf(i10 & 112));
                bwcVar2.Y(false);
            } else {
                affhVar3 = affhVar2;
                bveVarC.v(-1662038994);
                bwcVar2.Y(false);
            }
            z3 = true;
            bwcVar2.Y(true);
            if (i9 > 1) {
                int i1113 = i10 >> 15;
                bveVarC.v(-10373746);
                defpackage.cgf cgfVarJ5 = defpackage.asq.J(cgcVar, 0.0f, 0.0f, defpackage.gjr.P2.k, 0.0f);
                defpackage.cty ctyVarB10 = defpackage.atp.b(defpackage.cfs.a, false);
                i12 = i9;
                int iF110 = defpackage.a.f(bwcVar2.u);
                defpackage.cdd cddVarAh110 = bwcVar2.ah();
                defpackage.cgf cgfVarN110 = defpackage.bzo.n(bveVarC, cgfVarJ5);
                bveVarC.w();
                if (bwcVar2.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB10, affgVar2);
                defpackage.byw.c(bveVarC, cddVarAh110, affgVar3);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF110), affgVar4);
                defpackage.byw.b(bveVarC, affcVar);
                defpackage.byw.c(bveVarC, cgfVarN110, affgVar5);
                bwcVar3 = bwcVar2;
                e(i12, null, null, bveVarC, i1113 & 14, 6);
                z3 = true;
                bwcVar3.Y(true);
                bwcVar3.Y(false);
            } else {
                i12 = i9;
                bwcVar3 = bwcVar2;
                bveVarC.v(-10271880);
                bwcVar3.Y(false);
            }
            bwcVar3.Y(z3);
            cldVar3 = cldVarC;
            i7 = i12;
            cgfVar3 = cgfVar4;
        } else {
            affhVar3 = affhVar2;
            bveVarC.s();
            i7 = i;
            cgfVar3 = cgfVar2;
            cldVar3 = cldVar2;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new ope(affhVar, affhVar3, affgVar, aferVar, cgfVar3, i7, cldVar3, i2, i3, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0131  */
    /* JADX WARN: Code duplicated, block: B:108:0x0137  */
    /* JADX WARN: Code duplicated, block: B:109:0x013c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0140  */
    /* JADX WARN: Code duplicated, block: B:113:0x014b  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0153  */
    /* JADX WARN: Code duplicated, block: B:119:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x015e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0162  */
    /* JADX WARN: Code duplicated, block: B:124:0x016d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0170  */
    /* JADX WARN: Code duplicated, block: B:130:0x0180  */
    /* JADX WARN: Code duplicated, block: B:134:0x0189  */
    /* JADX WARN: Code duplicated, block: B:137:0x0192  */
    /* JADX WARN: Code duplicated, block: B:139:0x01af  */
    /* JADX WARN: Code duplicated, block: B:153:0x01df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:163:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:164:0x020a  */
    /* JADX WARN: Code duplicated, block: B:166:0x020e  */
    /* JADX WARN: Code duplicated, block: B:168:0x021a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0222  */
    /* JADX WARN: Code duplicated, block: B:172:0x022f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0233  */
    /* JADX WARN: Code duplicated, block: B:175:0x023d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0241  */
    /* JADX WARN: Code duplicated, block: B:179:0x0249  */
    /* JADX WARN: Code duplicated, block: B:181:0x0256  */
    /* JADX WARN: Code duplicated, block: B:183:0x025a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0264  */
    /* JADX WARN: Code duplicated, block: B:187:0x0278  */
    /* JADX WARN: Code duplicated, block: B:190:0x0298  */
    /* JADX WARN: Code duplicated, block: B:191:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:194:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:197:0x02d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:209:0x036b  */
    /* JADX WARN: Code duplicated, block: B:211:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:214:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0101  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x011c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    public static final void g(defpackage.affg affgVar, defpackage.afer aferVar, defpackage.cgf cgfVar, int i, boolean z, long j, defpackage.cld cldVar, defpackage.cit citVar, defpackage.afer aferVar2, defpackage.cit citVar2, defpackage.afer aferVar3, defpackage.affc affcVar, defpackage.bve bveVar, int i2, int i3, int i4) {
        int i5;
        defpackage.afer aferVar4;
        defpackage.cgf cgfVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        long jN;
        int i12;
        defpackage.cit citVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z3;
        boolean z4;
        defpackage.cld cldVar2;
        defpackage.cit citVar4;
        defpackage.affc affcVar2;
        defpackage.bve bveVar2;
        long j2;
        defpackage.cgf cgfVar3;
        defpackage.afer aferVar5;
        defpackage.afer aferVar6;
        defpackage.cit citVar5;
        defpackage.bxl bxlVarJ;
        int i20;
        int i21;
        int i22;
        int i23;
        defpackage.bwc bwcVar;
        int i24;
        defpackage.cgf cgfVar4;
        int i25;
        boolean z5;
        defpackage.cld cldVarB;
        defpackage.afer aferVar7;
        defpackage.afer aferVar8;
        defpackage.afer aferVar9;
        java.lang.Object objS;
        defpackage.affc affcVar3;
        java.lang.Object objS2;
        java.lang.Object objS3;
        java.lang.Object objS4;
        boolean z6;
        java.lang.Object obj;
        defpackage.bwx bwxVar;
        java.lang.Object objS5;
        defpackage.cgf cgfVarS;
        defpackage.led ledVar;
        defpackage.bna bnaVarE;
        boolean z7;
        int i26;
        int i27;
        int i28;
        affgVar.getClass();
        aferVar.getClass();
        int i29 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(299746620);
        if (i29 == 0) {
            i5 = (true != bveVarC.E(affgVar) ? 2 : 4) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            aferVar4 = aferVar;
            i5 |= true != bveVarC.E(aferVar4) ? 16 : 32;
        } else {
            aferVar4 = aferVar;
        }
        int i30 = i4 & 4;
        if (i30 == 0) {
            if ((i2 & 384) == 0) {
                cgfVar2 = cgfVar;
                i5 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    if (i == 0) {
                        i7 = -1;
                        i8 = 0;
                    } else {
                        i7 = i - 1;
                        i8 = i;
                    }
                    if (true != bveVarC.A(i7)) {
                        i9 = 1024;
                    } else {
                        i9 = 2048;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i10 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    if (true != bveVarC.D(z)) {
                        i11 = 8192;
                    } else {
                        i11 = 16384;
                    }
                    i5 |= i11;
                }
                if ((i2 & 196608) == 0) {
                    i28 = 65536;
                    jN = j;
                    if ((i4 & 32) == 0 && bveVarC.B(jN)) {
                        i28 = 131072;
                    }
                    i5 |= i28;
                } else {
                    jN = j;
                }
                if ((i2 & 1572864) == 0) {
                    i27 = 524288;
                    if ((i4 & 64) == 0) {
                        i12 = 196608;
                        if (bveVarC.C(cldVar)) {
                            i27 = 1048576;
                        }
                    } else {
                        i12 = 196608;
                    }
                    i5 |= i27;
                } else {
                    i12 = 196608;
                }
                if ((i2 & 12582912) == 0) {
                    i26 = 4194304;
                    if ((i4 & 128) == 0) {
                        citVar3 = citVar;
                        if (bveVarC.C(citVar3)) {
                            i26 = 8388608;
                        }
                    } else {
                        citVar3 = citVar;
                    }
                    i5 |= i26;
                } else {
                    citVar3 = citVar;
                }
                i13 = i4 & 256;
                if (i13 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (true != bveVarC.E(aferVar2)) {
                        i14 = 33554432;
                    } else {
                        i14 = 67108864;
                    }
                    i5 |= i14;
                }
                if ((805306368 & i2) != 0) {
                    i5 |= ((i4 & 512) == 0 || !bveVarC.C(citVar2)) ? 268435456 : 536870912;
                }
                i15 = i4 & 1024;
                if (i15 != 0) {
                    i16 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (true != bveVarC.E(aferVar3)) {
                        i17 = 2;
                    } else {
                        i17 = 4;
                    }
                    i16 = i3 | i17;
                } else {
                    i16 = i3;
                }
                i18 = i4 & 2048;
                if (i18 != 0) {
                    if ((i3 & 48) == 0) {
                        if (true != bveVarC.E(affcVar)) {
                            i19 = 16;
                        } else {
                            i19 = 32;
                        }
                        i16 |= i19;
                    }
                    if ((306783379 & i5) == 306783378 || (i16 & 19) != 18) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bveVarC.I(z3, i5 & 1)) {
                        i20 = i4 & 512;
                        i21 = i4 & 128;
                        i22 = i4 & 64;
                        i23 = i4 & 32;
                        bwcVar = (defpackage.bwc) bveVarC;
                        i24 = i8;
                        bwcVar.ab(-127, null, 0, null);
                        if ((i2 & 1) != 0 || bveVarC.F()) {
                            if (i30 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                            } else {
                                cgfVar4 = cgfVar2;
                            }
                            if (i6 != 0) {
                                i25 = 2;
                            } else {
                                i25 = i24;
                            }
                            z5 = z2 & z;
                            if (i23 != 0) {
                                i5 &= -458753;
                                jN = defpackage.kfp.i(bveVarC).N();
                            }
                            if (i22 != 0) {
                                int i31 = mcx.a;
                                i5 &= -3670017;
                                cldVarB = defpackage.bcw.b(24.0f);
                            } else {
                                cldVarB = cldVar;
                            }
                            if (i21 != 0) {
                                i5 &= -29360129;
                                citVar3 = new defpackage.cit();
                            }
                            if (i13 != 0) {
                                objS3 = bwcVar.S();
                                if (objS3 == defpackage.bvd.a) {
                                    objS3 = new defpackage.llt(10);
                                    bwcVar.ad(objS3);
                                }
                                aferVar7 = (defpackage.afer) objS3;
                            } else {
                                aferVar7 = aferVar2;
                            }
                            if (i20 != 0) {
                                citVar4 = new defpackage.cit();
                                i5 &= -1879048193;
                            } else {
                                citVar4 = citVar2;
                            }
                            if (i15 != 0) {
                                objS2 = bwcVar.S();
                                if (objS2 == defpackage.bvd.a) {
                                    objS2 = new defpackage.llt(11);
                                    bwcVar.ad(objS2);
                                }
                                aferVar8 = (defpackage.afer) objS2;
                            } else {
                                aferVar8 = aferVar3;
                            }
                            if (i18 != 0) {
                                objS = bwcVar.S();
                                defpackage.cgf cgfVar5 = cgfVar4;
                                if (objS == defpackage.bvd.a) {
                                    objS = new defpackage.ltk(20);
                                    bwcVar.ad(objS);
                                }
                                i24 = i25;
                                affcVar3 = (defpackage.affc) objS;
                                aferVar9 = aferVar8;
                                cgfVar2 = cgfVar5;
                            } else {
                                defpackage.cgf cgfVar6 = cgfVar4;
                                i24 = i25;
                                aferVar9 = aferVar8;
                                cgfVar2 = cgfVar6;
                            }
                            bveVarC.l();
                            mcy mcyVar = new mcy();
                            affcVar3.invoke(mcyVar);
                            defpackage.afer aferVar10 = aferVar9;
                            objS4 = bwcVar.S();
                            z6 = z5;
                            obj = defpackage.bvd.a;
                            if (objS4 == obj) {
                                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                                bwcVar.ad(parcelableSnapshotMutableState);
                                objS4 = parcelableSnapshotMutableState;
                            }
                            bwxVar = (defpackage.bwx) objS4;
                            bveVarC.v(293719978);
                            objS5 = bwcVar.S();
                            if (objS5 == obj) {
                                objS5 = new defpackage.lra(bwxVar, 18);
                                bwcVar.ad(objS5);
                            }
                            cgfVarS = defpackage.bzd.s(cgfVar2, (defpackage.affc) objS5);
                            ledVar = defpackage.lee.a;
                            if (ledVar.a().b() && !z6) {
                                cgfVarS.getClass();
                                cgfVarS = defpackage.kfp.j(cgfVarS, defpackage.ksk.L5, cldVarB);
                            }
                            int i32 = i5 >> 15;
                            bwcVar.Y(false);
                            defpackage.bmz bmzVarD = defpackage.vz.d(jN, 0L, bveVarC, 14);
                            if (!z6 || ledVar.a().b()) {
                                bveVarC.v(515655544);
                                bnaVarE = defpackage.vz.e(63);
                                bwcVar.Y(false);
                            } else {
                                bveVarC.v(515707686);
                                bveVarC.v(162574097);
                                if (ledVar.a().b()) {
                                    bveVarC.v(-1478087176);
                                    float f = defpackage.ksk.L5.g;
                                    bnaVarE = new defpackage.bna(f, f, f, f, defpackage.ksk.L0.g);
                                    z7 = false;
                                    bwcVar.Y(false);
                                } else {
                                    bveVarC.v(-1477724879);
                                    bwcVar.Y(false);
                                    float f2 = defpackage.ksk.L3.g;
                                    bnaVarE = new defpackage.bna(f2, f2, f2, f2, defpackage.ksk.L0.g);
                                    z7 = false;
                                }
                                bwcVar.Y(z7);
                                bwcVar.Y(z7);
                            }
                            defpackage.afer aferVar11 = aferVar7;
                            int i33 = i24;
                            i8 = i33;
                            defpackage.wf.a(cgfVarS, cldVarB, bmzVarD, bnaVarE, null, defpackage.dai.as(-322962806, true, new mcu(mcyVar, citVar3, aferVar11, i33, bwxVar, affgVar, citVar4, aferVar10, aferVar4), bveVarC), bveVarC, (i32 & 112) | i12, 16);
                            aferVar5 = aferVar11;
                            j2 = jN;
                            bveVar2 = bveVarC;
                            cgfVar3 = cgfVar2;
                            affcVar2 = affcVar3;
                            aferVar6 = aferVar10;
                            cldVar2 = cldVarB;
                            z4 = z6;
                        } else {
                            bveVarC.s();
                            if (i23 != 0) {
                                i5 &= -458753;
                            }
                            if (i22 != 0) {
                                i5 &= -3670017;
                            }
                            if (i21 != 0) {
                                i5 &= -29360129;
                            }
                            if (i20 != 0) {
                                i5 &= -1879048193;
                            }
                            z5 = z;
                            cldVarB = cldVar;
                            aferVar7 = aferVar2;
                            citVar4 = citVar2;
                            aferVar9 = aferVar3;
                        }
                        affcVar3 = affcVar;
                        bveVarC.l();
                        mcy mcyVar2 = new mcy();
                        affcVar3.invoke(mcyVar2);
                        defpackage.afer aferVar12 = aferVar9;
                        objS4 = bwcVar.S();
                        z6 = z5;
                        obj = defpackage.bvd.a;
                        if (objS4 == obj) {
                            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                            bwcVar.ad(parcelableSnapshotMutableState2);
                            objS4 = parcelableSnapshotMutableState2;
                        }
                        bwxVar = (defpackage.bwx) objS4;
                        bveVarC.v(293719978);
                        objS5 = bwcVar.S();
                        if (objS5 == obj) {
                            objS5 = new defpackage.lra(bwxVar, 18);
                            bwcVar.ad(objS5);
                        }
                        cgfVarS = defpackage.bzd.s(cgfVar2, (defpackage.affc) objS5);
                        ledVar = defpackage.lee.a;
                        if (ledVar.a().b()) {
                            cgfVarS.getClass();
                            cgfVarS = defpackage.kfp.j(cgfVarS, defpackage.ksk.L5, cldVarB);
                        }
                        int i34 = i5 >> 15;
                        bwcVar.Y(false);
                        defpackage.bmz bmzVarD2 = defpackage.vz.d(jN, 0L, bveVarC, 14);
                        if (z6) {
                            bveVarC.v(515655544);
                            bnaVarE = defpackage.vz.e(63);
                            bwcVar.Y(false);
                        } else {
                            bveVarC.v(515655544);
                            bnaVarE = defpackage.vz.e(63);
                            bwcVar.Y(false);
                        }
                        defpackage.afer aferVar13 = aferVar7;
                        int i35 = i24;
                        i8 = i35;
                        defpackage.wf.a(cgfVarS, cldVarB, bmzVarD2, bnaVarE, null, defpackage.dai.as(-322962806, true, new mcu(mcyVar2, citVar3, aferVar13, i35, bwxVar, affgVar, citVar4, aferVar12, aferVar4), bveVarC), bveVarC, (i34 & 112) | i12, 16);
                        aferVar5 = aferVar13;
                        j2 = jN;
                        bveVar2 = bveVarC;
                        cgfVar3 = cgfVar2;
                        affcVar2 = affcVar3;
                        aferVar6 = aferVar12;
                        cldVar2 = cldVarB;
                        z4 = z6;
                    } else {
                        bveVarC.s();
                        z4 = z;
                        cldVar2 = cldVar;
                        citVar4 = citVar2;
                        affcVar2 = affcVar;
                        bveVar2 = bveVarC;
                        j2 = jN;
                        cgfVar3 = cgfVar2;
                        aferVar5 = aferVar2;
                        aferVar6 = aferVar3;
                    }
                    citVar5 = citVar3;
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new mcv(affgVar, aferVar, cgfVar3, i8, z4, j2, cldVar2, citVar5, aferVar5, citVar4, aferVar6, affcVar2, i2, i3, i4);
                    }
                }
                i16 |= 48;
                if ((306783379 & i5) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (bveVarC.I(z3, i5 & 1)) {
                    i20 = i4 & 512;
                    i21 = i4 & 128;
                    i22 = i4 & 64;
                    i23 = i4 & 32;
                    bwcVar = (defpackage.bwc) bveVarC;
                    i24 = i8;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i2 & 1) != 0) {
                        if (i30 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i24;
                        }
                        z5 = z2 & z;
                        if (i23 != 0) {
                            i5 &= -458753;
                            jN = defpackage.kfp.i(bveVarC).N();
                        }
                        if (i22 != 0) {
                            int i36 = mcx.a;
                            i5 &= -3670017;
                            cldVarB = defpackage.bcw.b(24.0f);
                        } else {
                            cldVarB = cldVar;
                        }
                        if (i21 != 0) {
                            i5 &= -29360129;
                            citVar3 = new defpackage.cit();
                        }
                        if (i13 != 0) {
                            objS3 = bwcVar.S();
                            if (objS3 == defpackage.bvd.a) {
                                objS3 = new defpackage.llt(10);
                                bwcVar.ad(objS3);
                            }
                            aferVar7 = (defpackage.afer) objS3;
                        } else {
                            aferVar7 = aferVar2;
                        }
                        if (i20 != 0) {
                            citVar4 = new defpackage.cit();
                            i5 &= -1879048193;
                        } else {
                            citVar4 = citVar2;
                        }
                        if (i15 != 0) {
                            objS2 = bwcVar.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.llt(11);
                                bwcVar.ad(objS2);
                            }
                            aferVar8 = (defpackage.afer) objS2;
                        } else {
                            aferVar8 = aferVar3;
                        }
                        if (i18 != 0) {
                            objS = bwcVar.S();
                            defpackage.cgf cgfVar7 = cgfVar4;
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.ltk(20);
                                bwcVar.ad(objS);
                            }
                            i24 = i25;
                            affcVar3 = (defpackage.affc) objS;
                            aferVar9 = aferVar8;
                            cgfVar2 = cgfVar7;
                        } else {
                            defpackage.cgf cgfVar8 = cgfVar4;
                            i24 = i25;
                            aferVar9 = aferVar8;
                            cgfVar2 = cgfVar8;
                            affcVar3 = affcVar;
                        }
                    } else {
                        if (i30 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i24;
                        }
                        z5 = z2 & z;
                        if (i23 != 0) {
                            i5 &= -458753;
                            jN = defpackage.kfp.i(bveVarC).N();
                        }
                        if (i22 != 0) {
                            int i37 = mcx.a;
                            i5 &= -3670017;
                            cldVarB = defpackage.bcw.b(24.0f);
                        } else {
                            cldVarB = cldVar;
                        }
                        if (i21 != 0) {
                            i5 &= -29360129;
                            citVar3 = new defpackage.cit();
                        }
                        if (i13 != 0) {
                            objS3 = bwcVar.S();
                            if (objS3 == defpackage.bvd.a) {
                                objS3 = new defpackage.llt(10);
                                bwcVar.ad(objS3);
                            }
                            aferVar7 = (defpackage.afer) objS3;
                        } else {
                            aferVar7 = aferVar2;
                        }
                        if (i20 != 0) {
                            citVar4 = new defpackage.cit();
                            i5 &= -1879048193;
                        } else {
                            citVar4 = citVar2;
                        }
                        if (i15 != 0) {
                            objS2 = bwcVar.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.llt(11);
                                bwcVar.ad(objS2);
                            }
                            aferVar8 = (defpackage.afer) objS2;
                        } else {
                            aferVar8 = aferVar3;
                        }
                        if (i18 != 0) {
                            objS = bwcVar.S();
                            defpackage.cgf cgfVar9 = cgfVar4;
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.ltk(20);
                                bwcVar.ad(objS);
                            }
                            i24 = i25;
                            affcVar3 = (defpackage.affc) objS;
                            aferVar9 = aferVar8;
                            cgfVar2 = cgfVar9;
                        } else {
                            defpackage.cgf cgfVar10 = cgfVar4;
                            i24 = i25;
                            aferVar9 = aferVar8;
                            cgfVar2 = cgfVar10;
                            affcVar3 = affcVar;
                        }
                    }
                    bveVarC.l();
                    mcy mcyVar3 = new mcy();
                    affcVar3.invoke(mcyVar3);
                    defpackage.afer aferVar14 = aferVar9;
                    objS4 = bwcVar.S();
                    z6 = z5;
                    obj = defpackage.bvd.a;
                    if (objS4 == obj) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                        bwcVar.ad(parcelableSnapshotMutableState3);
                        objS4 = parcelableSnapshotMutableState3;
                    }
                    bwxVar = (defpackage.bwx) objS4;
                    bveVarC.v(293719978);
                    objS5 = bwcVar.S();
                    if (objS5 == obj) {
                        objS5 = new defpackage.lra(bwxVar, 18);
                        bwcVar.ad(objS5);
                    }
                    cgfVarS = defpackage.bzd.s(cgfVar2, (defpackage.affc) objS5);
                    ledVar = defpackage.lee.a;
                    if (ledVar.a().b()) {
                        cgfVarS.getClass();
                        cgfVarS = defpackage.kfp.j(cgfVarS, defpackage.ksk.L5, cldVarB);
                    }
                    int i38 = i5 >> 15;
                    bwcVar.Y(false);
                    defpackage.bmz bmzVarD3 = defpackage.vz.d(jN, 0L, bveVarC, 14);
                    if (z6) {
                        bveVarC.v(515655544);
                        bnaVarE = defpackage.vz.e(63);
                        bwcVar.Y(false);
                    } else {
                        bveVarC.v(515655544);
                        bnaVarE = defpackage.vz.e(63);
                        bwcVar.Y(false);
                    }
                    defpackage.afer aferVar15 = aferVar7;
                    int i39 = i24;
                    i8 = i39;
                    defpackage.wf.a(cgfVarS, cldVarB, bmzVarD3, bnaVarE, null, defpackage.dai.as(-322962806, true, new mcu(mcyVar3, citVar3, aferVar15, i39, bwxVar, affgVar, citVar4, aferVar14, aferVar4), bveVarC), bveVarC, (i38 & 112) | i12, 16);
                    aferVar5 = aferVar15;
                    j2 = jN;
                    bveVar2 = bveVarC;
                    cgfVar3 = cgfVar2;
                    affcVar2 = affcVar3;
                    aferVar6 = aferVar14;
                    cldVar2 = cldVarB;
                    z4 = z6;
                } else {
                    bveVarC.s();
                    z4 = z;
                    cldVar2 = cldVar;
                    citVar4 = citVar2;
                    affcVar2 = affcVar;
                    bveVar2 = bveVarC;
                    j2 = jN;
                    cgfVar3 = cgfVar2;
                    aferVar5 = aferVar2;
                    aferVar6 = aferVar3;
                }
                citVar5 = citVar3;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new mcv(affgVar, aferVar, cgfVar3, i8, z4, j2, cldVar2, citVar5, aferVar5, citVar4, aferVar6, affcVar2, i2, i3, i4);
                }
            }
            i5 |= 3072;
            i8 = i;
            i10 = i4 & 16;
            if (i10 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i10 != 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                if (true != bveVarC.D(z)) {
                    i11 = 8192;
                } else {
                    i11 = 16384;
                }
                i5 |= i11;
            }
            if ((i2 & 196608) == 0) {
                i28 = 65536;
                jN = j;
                if ((i4 & 32) == 0) {
                    i28 = 131072;
                }
                i5 |= i28;
            } else {
                jN = j;
            }
            if ((i2 & 1572864) == 0) {
                i27 = 524288;
                if ((i4 & 64) == 0) {
                    i12 = 196608;
                    if (bveVarC.C(cldVar)) {
                        i27 = 1048576;
                    }
                } else {
                    i12 = 196608;
                }
                i5 |= i27;
            } else {
                i12 = 196608;
            }
            if ((i2 & 12582912) == 0) {
                i26 = 4194304;
                if ((i4 & 128) == 0) {
                    citVar3 = citVar;
                    if (bveVarC.C(citVar3)) {
                        i26 = 8388608;
                    }
                } else {
                    citVar3 = citVar;
                }
                i5 |= i26;
            } else {
                citVar3 = citVar;
            }
            i13 = i4 & 256;
            if (i13 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (true != bveVarC.E(aferVar2)) {
                    i14 = 33554432;
                } else {
                    i14 = 67108864;
                }
                i5 |= i14;
            }
            if ((805306368 & i2) != 0) {
                i5 |= ((i4 & 512) == 0 || !bveVarC.C(citVar2)) ? 268435456 : 536870912;
            }
            i15 = i4 & 1024;
            if (i15 != 0) {
                i16 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (true != bveVarC.E(aferVar3)) {
                    i17 = 2;
                } else {
                    i17 = 4;
                }
                i16 = i3 | i17;
            } else {
                i16 = i3;
            }
            i18 = i4 & 2048;
            if (i18 != 0) {
                if ((i3 & 48) == 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i19 = 16;
                    } else {
                        i19 = 32;
                    }
                    i16 |= i19;
                }
                if ((306783379 & i5) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (bveVarC.I(z3, i5 & 1)) {
                    i20 = i4 & 512;
                    i21 = i4 & 128;
                    i22 = i4 & 64;
                    i23 = i4 & 32;
                    bwcVar = (defpackage.bwc) bveVarC;
                    i24 = i8;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i2 & 1) != 0) {
                        if (i30 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i24;
                        }
                        z5 = z2 & z;
                        if (i23 != 0) {
                            i5 &= -458753;
                            jN = defpackage.kfp.i(bveVarC).N();
                        }
                        if (i22 != 0) {
                            int i310 = mcx.a;
                            i5 &= -3670017;
                            cldVarB = defpackage.bcw.b(24.0f);
                        } else {
                            cldVarB = cldVar;
                        }
                        if (i21 != 0) {
                            i5 &= -29360129;
                            citVar3 = new defpackage.cit();
                        }
                        if (i13 != 0) {
                            objS3 = bwcVar.S();
                            if (objS3 == defpackage.bvd.a) {
                                objS3 = new defpackage.llt(10);
                                bwcVar.ad(objS3);
                            }
                            aferVar7 = (defpackage.afer) objS3;
                        } else {
                            aferVar7 = aferVar2;
                        }
                        if (i20 != 0) {
                            citVar4 = new defpackage.cit();
                            i5 &= -1879048193;
                        } else {
                            citVar4 = citVar2;
                        }
                        if (i15 != 0) {
                            objS2 = bwcVar.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.llt(11);
                                bwcVar.ad(objS2);
                            }
                            aferVar8 = (defpackage.afer) objS2;
                        } else {
                            aferVar8 = aferVar3;
                        }
                        if (i18 != 0) {
                            objS = bwcVar.S();
                            defpackage.cgf cgfVar11 = cgfVar4;
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.ltk(20);
                                bwcVar.ad(objS);
                            }
                            i24 = i25;
                            affcVar3 = (defpackage.affc) objS;
                            aferVar9 = aferVar8;
                            cgfVar2 = cgfVar11;
                        } else {
                            defpackage.cgf cgfVar12 = cgfVar4;
                            i24 = i25;
                            aferVar9 = aferVar8;
                            cgfVar2 = cgfVar12;
                            affcVar3 = affcVar;
                        }
                    } else {
                        if (i30 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i24;
                        }
                        z5 = z2 & z;
                        if (i23 != 0) {
                            i5 &= -458753;
                            jN = defpackage.kfp.i(bveVarC).N();
                        }
                        if (i22 != 0) {
                            int i311 = mcx.a;
                            i5 &= -3670017;
                            cldVarB = defpackage.bcw.b(24.0f);
                        } else {
                            cldVarB = cldVar;
                        }
                        if (i21 != 0) {
                            i5 &= -29360129;
                            citVar3 = new defpackage.cit();
                        }
                        if (i13 != 0) {
                            objS3 = bwcVar.S();
                            if (objS3 == defpackage.bvd.a) {
                                objS3 = new defpackage.llt(10);
                                bwcVar.ad(objS3);
                            }
                            aferVar7 = (defpackage.afer) objS3;
                        } else {
                            aferVar7 = aferVar2;
                        }
                        if (i20 != 0) {
                            citVar4 = new defpackage.cit();
                            i5 &= -1879048193;
                        } else {
                            citVar4 = citVar2;
                        }
                        if (i15 != 0) {
                            objS2 = bwcVar.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.llt(11);
                                bwcVar.ad(objS2);
                            }
                            aferVar8 = (defpackage.afer) objS2;
                        } else {
                            aferVar8 = aferVar3;
                        }
                        if (i18 != 0) {
                            objS = bwcVar.S();
                            defpackage.cgf cgfVar13 = cgfVar4;
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.ltk(20);
                                bwcVar.ad(objS);
                            }
                            i24 = i25;
                            affcVar3 = (defpackage.affc) objS;
                            aferVar9 = aferVar8;
                            cgfVar2 = cgfVar13;
                        } else {
                            defpackage.cgf cgfVar14 = cgfVar4;
                            i24 = i25;
                            aferVar9 = aferVar8;
                            cgfVar2 = cgfVar14;
                            affcVar3 = affcVar;
                        }
                    }
                    bveVarC.l();
                    mcy mcyVar4 = new mcy();
                    affcVar3.invoke(mcyVar4);
                    defpackage.afer aferVar16 = aferVar9;
                    objS4 = bwcVar.S();
                    z6 = z5;
                    obj = defpackage.bvd.a;
                    if (objS4 == obj) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                        bwcVar.ad(parcelableSnapshotMutableState4);
                        objS4 = parcelableSnapshotMutableState4;
                    }
                    bwxVar = (defpackage.bwx) objS4;
                    bveVarC.v(293719978);
                    objS5 = bwcVar.S();
                    if (objS5 == obj) {
                        objS5 = new defpackage.lra(bwxVar, 18);
                        bwcVar.ad(objS5);
                    }
                    cgfVarS = defpackage.bzd.s(cgfVar2, (defpackage.affc) objS5);
                    ledVar = defpackage.lee.a;
                    if (ledVar.a().b()) {
                        cgfVarS.getClass();
                        cgfVarS = defpackage.kfp.j(cgfVarS, defpackage.ksk.L5, cldVarB);
                    }
                    int i312 = i5 >> 15;
                    bwcVar.Y(false);
                    defpackage.bmz bmzVarD4 = defpackage.vz.d(jN, 0L, bveVarC, 14);
                    if (z6) {
                        bveVarC.v(515655544);
                        bnaVarE = defpackage.vz.e(63);
                        bwcVar.Y(false);
                    } else {
                        bveVarC.v(515655544);
                        bnaVarE = defpackage.vz.e(63);
                        bwcVar.Y(false);
                    }
                    defpackage.afer aferVar17 = aferVar7;
                    int i313 = i24;
                    i8 = i313;
                    defpackage.wf.a(cgfVarS, cldVarB, bmzVarD4, bnaVarE, null, defpackage.dai.as(-322962806, true, new mcu(mcyVar4, citVar3, aferVar17, i313, bwxVar, affgVar, citVar4, aferVar16, aferVar4), bveVarC), bveVarC, (i312 & 112) | i12, 16);
                    aferVar5 = aferVar17;
                    j2 = jN;
                    bveVar2 = bveVarC;
                    cgfVar3 = cgfVar2;
                    affcVar2 = affcVar3;
                    aferVar6 = aferVar16;
                    cldVar2 = cldVarB;
                    z4 = z6;
                } else {
                    bveVarC.s();
                    z4 = z;
                    cldVar2 = cldVar;
                    citVar4 = citVar2;
                    affcVar2 = affcVar;
                    bveVar2 = bveVarC;
                    j2 = jN;
                    cgfVar3 = cgfVar2;
                    aferVar5 = aferVar2;
                    aferVar6 = aferVar3;
                }
                citVar5 = citVar3;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new mcv(affgVar, aferVar, cgfVar3, i8, z4, j2, cldVar2, citVar5, aferVar5, citVar4, aferVar6, affcVar2, i2, i3, i4);
                }
            }
            i16 |= 48;
            if ((306783379 & i5) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (bveVarC.I(z3, i5 & 1)) {
                i20 = i4 & 512;
                i21 = i4 & 128;
                i22 = i4 & 64;
                i23 = i4 & 32;
                bwcVar = (defpackage.bwc) bveVarC;
                i24 = i8;
                bwcVar.ab(-127, null, 0, null);
                if ((i2 & 1) != 0) {
                    if (i30 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i24;
                    }
                    z5 = z2 & z;
                    if (i23 != 0) {
                        i5 &= -458753;
                        jN = defpackage.kfp.i(bveVarC).N();
                    }
                    if (i22 != 0) {
                        int i314 = mcx.a;
                        i5 &= -3670017;
                        cldVarB = defpackage.bcw.b(24.0f);
                    } else {
                        cldVarB = cldVar;
                    }
                    if (i21 != 0) {
                        i5 &= -29360129;
                        citVar3 = new defpackage.cit();
                    }
                    if (i13 != 0) {
                        objS3 = bwcVar.S();
                        if (objS3 == defpackage.bvd.a) {
                            objS3 = new defpackage.llt(10);
                            bwcVar.ad(objS3);
                        }
                        aferVar7 = (defpackage.afer) objS3;
                    } else {
                        aferVar7 = aferVar2;
                    }
                    if (i20 != 0) {
                        citVar4 = new defpackage.cit();
                        i5 &= -1879048193;
                    } else {
                        citVar4 = citVar2;
                    }
                    if (i15 != 0) {
                        objS2 = bwcVar.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.llt(11);
                            bwcVar.ad(objS2);
                        }
                        aferVar8 = (defpackage.afer) objS2;
                    } else {
                        aferVar8 = aferVar3;
                    }
                    if (i18 != 0) {
                        objS = bwcVar.S();
                        defpackage.cgf cgfVar15 = cgfVar4;
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.ltk(20);
                            bwcVar.ad(objS);
                        }
                        i24 = i25;
                        affcVar3 = (defpackage.affc) objS;
                        aferVar9 = aferVar8;
                        cgfVar2 = cgfVar15;
                    } else {
                        defpackage.cgf cgfVar16 = cgfVar4;
                        i24 = i25;
                        aferVar9 = aferVar8;
                        cgfVar2 = cgfVar16;
                        affcVar3 = affcVar;
                    }
                } else {
                    if (i30 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i24;
                    }
                    z5 = z2 & z;
                    if (i23 != 0) {
                        i5 &= -458753;
                        jN = defpackage.kfp.i(bveVarC).N();
                    }
                    if (i22 != 0) {
                        int i315 = mcx.a;
                        i5 &= -3670017;
                        cldVarB = defpackage.bcw.b(24.0f);
                    } else {
                        cldVarB = cldVar;
                    }
                    if (i21 != 0) {
                        i5 &= -29360129;
                        citVar3 = new defpackage.cit();
                    }
                    if (i13 != 0) {
                        objS3 = bwcVar.S();
                        if (objS3 == defpackage.bvd.a) {
                            objS3 = new defpackage.llt(10);
                            bwcVar.ad(objS3);
                        }
                        aferVar7 = (defpackage.afer) objS3;
                    } else {
                        aferVar7 = aferVar2;
                    }
                    if (i20 != 0) {
                        citVar4 = new defpackage.cit();
                        i5 &= -1879048193;
                    } else {
                        citVar4 = citVar2;
                    }
                    if (i15 != 0) {
                        objS2 = bwcVar.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.llt(11);
                            bwcVar.ad(objS2);
                        }
                        aferVar8 = (defpackage.afer) objS2;
                    } else {
                        aferVar8 = aferVar3;
                    }
                    if (i18 != 0) {
                        objS = bwcVar.S();
                        defpackage.cgf cgfVar17 = cgfVar4;
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.ltk(20);
                            bwcVar.ad(objS);
                        }
                        i24 = i25;
                        affcVar3 = (defpackage.affc) objS;
                        aferVar9 = aferVar8;
                        cgfVar2 = cgfVar17;
                    } else {
                        defpackage.cgf cgfVar18 = cgfVar4;
                        i24 = i25;
                        aferVar9 = aferVar8;
                        cgfVar2 = cgfVar18;
                        affcVar3 = affcVar;
                    }
                }
                bveVarC.l();
                mcy mcyVar5 = new mcy();
                affcVar3.invoke(mcyVar5);
                defpackage.afer aferVar18 = aferVar9;
                objS4 = bwcVar.S();
                z6 = z5;
                obj = defpackage.bvd.a;
                if (objS4 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState5 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                    bwcVar.ad(parcelableSnapshotMutableState5);
                    objS4 = parcelableSnapshotMutableState5;
                }
                bwxVar = (defpackage.bwx) objS4;
                bveVarC.v(293719978);
                objS5 = bwcVar.S();
                if (objS5 == obj) {
                    objS5 = new defpackage.lra(bwxVar, 18);
                    bwcVar.ad(objS5);
                }
                cgfVarS = defpackage.bzd.s(cgfVar2, (defpackage.affc) objS5);
                ledVar = defpackage.lee.a;
                if (ledVar.a().b()) {
                    cgfVarS.getClass();
                    cgfVarS = defpackage.kfp.j(cgfVarS, defpackage.ksk.L5, cldVarB);
                }
                int i316 = i5 >> 15;
                bwcVar.Y(false);
                defpackage.bmz bmzVarD5 = defpackage.vz.d(jN, 0L, bveVarC, 14);
                if (z6) {
                    bveVarC.v(515655544);
                    bnaVarE = defpackage.vz.e(63);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(515655544);
                    bnaVarE = defpackage.vz.e(63);
                    bwcVar.Y(false);
                }
                defpackage.afer aferVar19 = aferVar7;
                int i317 = i24;
                i8 = i317;
                defpackage.wf.a(cgfVarS, cldVarB, bmzVarD5, bnaVarE, null, defpackage.dai.as(-322962806, true, new mcu(mcyVar5, citVar3, aferVar19, i317, bwxVar, affgVar, citVar4, aferVar18, aferVar4), bveVarC), bveVarC, (i316 & 112) | i12, 16);
                aferVar5 = aferVar19;
                j2 = jN;
                bveVar2 = bveVarC;
                cgfVar3 = cgfVar2;
                affcVar2 = affcVar3;
                aferVar6 = aferVar18;
                cldVar2 = cldVarB;
                z4 = z6;
            } else {
                bveVarC.s();
                z4 = z;
                cldVar2 = cldVar;
                citVar4 = citVar2;
                affcVar2 = affcVar;
                bveVar2 = bveVarC;
                j2 = jN;
                cgfVar3 = cgfVar2;
                aferVar5 = aferVar2;
                aferVar6 = aferVar3;
            }
            citVar5 = citVar3;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mcv(affgVar, aferVar, cgfVar3, i8, z4, j2, cldVar2, citVar5, aferVar5, citVar4, aferVar6, affcVar2, i2, i3, i4);
            }
        }
        i5 |= 384;
        cgfVar2 = cgfVar;
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i2 & 3072) == 0) {
                if (i == 0) {
                    i7 = -1;
                    i8 = 0;
                } else {
                    i7 = i - 1;
                    i8 = i;
                }
                if (true != bveVarC.A(i7)) {
                    i9 = 1024;
                } else {
                    i9 = 2048;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i10 != 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                if (true != bveVarC.D(z)) {
                    i11 = 8192;
                } else {
                    i11 = 16384;
                }
                i5 |= i11;
            }
            if ((i2 & 196608) == 0) {
                i28 = 65536;
                jN = j;
                if ((i4 & 32) == 0) {
                    i28 = 131072;
                }
                i5 |= i28;
            } else {
                jN = j;
            }
            if ((i2 & 1572864) == 0) {
                i27 = 524288;
                if ((i4 & 64) == 0) {
                    i12 = 196608;
                    if (bveVarC.C(cldVar)) {
                        i27 = 1048576;
                    }
                } else {
                    i12 = 196608;
                }
                i5 |= i27;
            } else {
                i12 = 196608;
            }
            if ((i2 & 12582912) == 0) {
                i26 = 4194304;
                if ((i4 & 128) == 0) {
                    citVar3 = citVar;
                    if (bveVarC.C(citVar3)) {
                        i26 = 8388608;
                    }
                } else {
                    citVar3 = citVar;
                }
                i5 |= i26;
            } else {
                citVar3 = citVar;
            }
            i13 = i4 & 256;
            if (i13 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (true != bveVarC.E(aferVar2)) {
                    i14 = 33554432;
                } else {
                    i14 = 67108864;
                }
                i5 |= i14;
            }
            if ((805306368 & i2) != 0) {
                i5 |= ((i4 & 512) == 0 || !bveVarC.C(citVar2)) ? 268435456 : 536870912;
            }
            i15 = i4 & 1024;
            if (i15 != 0) {
                i16 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (true != bveVarC.E(aferVar3)) {
                    i17 = 2;
                } else {
                    i17 = 4;
                }
                i16 = i3 | i17;
            } else {
                i16 = i3;
            }
            i18 = i4 & 2048;
            if (i18 != 0) {
                if ((i3 & 48) == 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i19 = 16;
                    } else {
                        i19 = 32;
                    }
                    i16 |= i19;
                }
                if ((306783379 & i5) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (bveVarC.I(z3, i5 & 1)) {
                    i20 = i4 & 512;
                    i21 = i4 & 128;
                    i22 = i4 & 64;
                    i23 = i4 & 32;
                    bwcVar = (defpackage.bwc) bveVarC;
                    i24 = i8;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i2 & 1) != 0) {
                        if (i30 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i24;
                        }
                        z5 = z2 & z;
                        if (i23 != 0) {
                            i5 &= -458753;
                            jN = defpackage.kfp.i(bveVarC).N();
                        }
                        if (i22 != 0) {
                            int i318 = mcx.a;
                            i5 &= -3670017;
                            cldVarB = defpackage.bcw.b(24.0f);
                        } else {
                            cldVarB = cldVar;
                        }
                        if (i21 != 0) {
                            i5 &= -29360129;
                            citVar3 = new defpackage.cit();
                        }
                        if (i13 != 0) {
                            objS3 = bwcVar.S();
                            if (objS3 == defpackage.bvd.a) {
                                objS3 = new defpackage.llt(10);
                                bwcVar.ad(objS3);
                            }
                            aferVar7 = (defpackage.afer) objS3;
                        } else {
                            aferVar7 = aferVar2;
                        }
                        if (i20 != 0) {
                            citVar4 = new defpackage.cit();
                            i5 &= -1879048193;
                        } else {
                            citVar4 = citVar2;
                        }
                        if (i15 != 0) {
                            objS2 = bwcVar.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.llt(11);
                                bwcVar.ad(objS2);
                            }
                            aferVar8 = (defpackage.afer) objS2;
                        } else {
                            aferVar8 = aferVar3;
                        }
                        if (i18 != 0) {
                            objS = bwcVar.S();
                            defpackage.cgf cgfVar19 = cgfVar4;
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.ltk(20);
                                bwcVar.ad(objS);
                            }
                            i24 = i25;
                            affcVar3 = (defpackage.affc) objS;
                            aferVar9 = aferVar8;
                            cgfVar2 = cgfVar19;
                        } else {
                            defpackage.cgf cgfVar110 = cgfVar4;
                            i24 = i25;
                            aferVar9 = aferVar8;
                            cgfVar2 = cgfVar110;
                            affcVar3 = affcVar;
                        }
                    } else {
                        if (i30 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i24;
                        }
                        z5 = z2 & z;
                        if (i23 != 0) {
                            i5 &= -458753;
                            jN = defpackage.kfp.i(bveVarC).N();
                        }
                        if (i22 != 0) {
                            int i319 = mcx.a;
                            i5 &= -3670017;
                            cldVarB = defpackage.bcw.b(24.0f);
                        } else {
                            cldVarB = cldVar;
                        }
                        if (i21 != 0) {
                            i5 &= -29360129;
                            citVar3 = new defpackage.cit();
                        }
                        if (i13 != 0) {
                            objS3 = bwcVar.S();
                            if (objS3 == defpackage.bvd.a) {
                                objS3 = new defpackage.llt(10);
                                bwcVar.ad(objS3);
                            }
                            aferVar7 = (defpackage.afer) objS3;
                        } else {
                            aferVar7 = aferVar2;
                        }
                        if (i20 != 0) {
                            citVar4 = new defpackage.cit();
                            i5 &= -1879048193;
                        } else {
                            citVar4 = citVar2;
                        }
                        if (i15 != 0) {
                            objS2 = bwcVar.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.llt(11);
                                bwcVar.ad(objS2);
                            }
                            aferVar8 = (defpackage.afer) objS2;
                        } else {
                            aferVar8 = aferVar3;
                        }
                        if (i18 != 0) {
                            objS = bwcVar.S();
                            defpackage.cgf cgfVar111 = cgfVar4;
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.ltk(20);
                                bwcVar.ad(objS);
                            }
                            i24 = i25;
                            affcVar3 = (defpackage.affc) objS;
                            aferVar9 = aferVar8;
                            cgfVar2 = cgfVar111;
                        } else {
                            defpackage.cgf cgfVar112 = cgfVar4;
                            i24 = i25;
                            aferVar9 = aferVar8;
                            cgfVar2 = cgfVar112;
                            affcVar3 = affcVar;
                        }
                    }
                    bveVarC.l();
                    mcy mcyVar6 = new mcy();
                    affcVar3.invoke(mcyVar6);
                    defpackage.afer aferVar110 = aferVar9;
                    objS4 = bwcVar.S();
                    z6 = z5;
                    obj = defpackage.bvd.a;
                    if (objS4 == obj) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState6 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                        bwcVar.ad(parcelableSnapshotMutableState6);
                        objS4 = parcelableSnapshotMutableState6;
                    }
                    bwxVar = (defpackage.bwx) objS4;
                    bveVarC.v(293719978);
                    objS5 = bwcVar.S();
                    if (objS5 == obj) {
                        objS5 = new defpackage.lra(bwxVar, 18);
                        bwcVar.ad(objS5);
                    }
                    cgfVarS = defpackage.bzd.s(cgfVar2, (defpackage.affc) objS5);
                    ledVar = defpackage.lee.a;
                    if (ledVar.a().b()) {
                        cgfVarS.getClass();
                        cgfVarS = defpackage.kfp.j(cgfVarS, defpackage.ksk.L5, cldVarB);
                    }
                    int i3110 = i5 >> 15;
                    bwcVar.Y(false);
                    defpackage.bmz bmzVarD6 = defpackage.vz.d(jN, 0L, bveVarC, 14);
                    if (z6) {
                        bveVarC.v(515655544);
                        bnaVarE = defpackage.vz.e(63);
                        bwcVar.Y(false);
                    } else {
                        bveVarC.v(515655544);
                        bnaVarE = defpackage.vz.e(63);
                        bwcVar.Y(false);
                    }
                    defpackage.afer aferVar111 = aferVar7;
                    int i3111 = i24;
                    i8 = i3111;
                    defpackage.wf.a(cgfVarS, cldVarB, bmzVarD6, bnaVarE, null, defpackage.dai.as(-322962806, true, new mcu(mcyVar6, citVar3, aferVar111, i3111, bwxVar, affgVar, citVar4, aferVar110, aferVar4), bveVarC), bveVarC, (i3110 & 112) | i12, 16);
                    aferVar5 = aferVar111;
                    j2 = jN;
                    bveVar2 = bveVarC;
                    cgfVar3 = cgfVar2;
                    affcVar2 = affcVar3;
                    aferVar6 = aferVar110;
                    cldVar2 = cldVarB;
                    z4 = z6;
                } else {
                    bveVarC.s();
                    z4 = z;
                    cldVar2 = cldVar;
                    citVar4 = citVar2;
                    affcVar2 = affcVar;
                    bveVar2 = bveVarC;
                    j2 = jN;
                    cgfVar3 = cgfVar2;
                    aferVar5 = aferVar2;
                    aferVar6 = aferVar3;
                }
                citVar5 = citVar3;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new mcv(affgVar, aferVar, cgfVar3, i8, z4, j2, cldVar2, citVar5, aferVar5, citVar4, aferVar6, affcVar2, i2, i3, i4);
                }
            }
            i16 |= 48;
            if ((306783379 & i5) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (bveVarC.I(z3, i5 & 1)) {
                i20 = i4 & 512;
                i21 = i4 & 128;
                i22 = i4 & 64;
                i23 = i4 & 32;
                bwcVar = (defpackage.bwc) bveVarC;
                i24 = i8;
                bwcVar.ab(-127, null, 0, null);
                if ((i2 & 1) != 0) {
                    if (i30 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i24;
                    }
                    z5 = z2 & z;
                    if (i23 != 0) {
                        i5 &= -458753;
                        jN = defpackage.kfp.i(bveVarC).N();
                    }
                    if (i22 != 0) {
                        int i3112 = mcx.a;
                        i5 &= -3670017;
                        cldVarB = defpackage.bcw.b(24.0f);
                    } else {
                        cldVarB = cldVar;
                    }
                    if (i21 != 0) {
                        i5 &= -29360129;
                        citVar3 = new defpackage.cit();
                    }
                    if (i13 != 0) {
                        objS3 = bwcVar.S();
                        if (objS3 == defpackage.bvd.a) {
                            objS3 = new defpackage.llt(10);
                            bwcVar.ad(objS3);
                        }
                        aferVar7 = (defpackage.afer) objS3;
                    } else {
                        aferVar7 = aferVar2;
                    }
                    if (i20 != 0) {
                        citVar4 = new defpackage.cit();
                        i5 &= -1879048193;
                    } else {
                        citVar4 = citVar2;
                    }
                    if (i15 != 0) {
                        objS2 = bwcVar.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.llt(11);
                            bwcVar.ad(objS2);
                        }
                        aferVar8 = (defpackage.afer) objS2;
                    } else {
                        aferVar8 = aferVar3;
                    }
                    if (i18 != 0) {
                        objS = bwcVar.S();
                        defpackage.cgf cgfVar113 = cgfVar4;
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.ltk(20);
                            bwcVar.ad(objS);
                        }
                        i24 = i25;
                        affcVar3 = (defpackage.affc) objS;
                        aferVar9 = aferVar8;
                        cgfVar2 = cgfVar113;
                    } else {
                        defpackage.cgf cgfVar114 = cgfVar4;
                        i24 = i25;
                        aferVar9 = aferVar8;
                        cgfVar2 = cgfVar114;
                        affcVar3 = affcVar;
                    }
                } else {
                    if (i30 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i24;
                    }
                    z5 = z2 & z;
                    if (i23 != 0) {
                        i5 &= -458753;
                        jN = defpackage.kfp.i(bveVarC).N();
                    }
                    if (i22 != 0) {
                        int i3113 = mcx.a;
                        i5 &= -3670017;
                        cldVarB = defpackage.bcw.b(24.0f);
                    } else {
                        cldVarB = cldVar;
                    }
                    if (i21 != 0) {
                        i5 &= -29360129;
                        citVar3 = new defpackage.cit();
                    }
                    if (i13 != 0) {
                        objS3 = bwcVar.S();
                        if (objS3 == defpackage.bvd.a) {
                            objS3 = new defpackage.llt(10);
                            bwcVar.ad(objS3);
                        }
                        aferVar7 = (defpackage.afer) objS3;
                    } else {
                        aferVar7 = aferVar2;
                    }
                    if (i20 != 0) {
                        citVar4 = new defpackage.cit();
                        i5 &= -1879048193;
                    } else {
                        citVar4 = citVar2;
                    }
                    if (i15 != 0) {
                        objS2 = bwcVar.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.llt(11);
                            bwcVar.ad(objS2);
                        }
                        aferVar8 = (defpackage.afer) objS2;
                    } else {
                        aferVar8 = aferVar3;
                    }
                    if (i18 != 0) {
                        objS = bwcVar.S();
                        defpackage.cgf cgfVar115 = cgfVar4;
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.ltk(20);
                            bwcVar.ad(objS);
                        }
                        i24 = i25;
                        affcVar3 = (defpackage.affc) objS;
                        aferVar9 = aferVar8;
                        cgfVar2 = cgfVar115;
                    } else {
                        defpackage.cgf cgfVar116 = cgfVar4;
                        i24 = i25;
                        aferVar9 = aferVar8;
                        cgfVar2 = cgfVar116;
                        affcVar3 = affcVar;
                    }
                }
                bveVarC.l();
                mcy mcyVar7 = new mcy();
                affcVar3.invoke(mcyVar7);
                defpackage.afer aferVar112 = aferVar9;
                objS4 = bwcVar.S();
                z6 = z5;
                obj = defpackage.bvd.a;
                if (objS4 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState7 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                    bwcVar.ad(parcelableSnapshotMutableState7);
                    objS4 = parcelableSnapshotMutableState7;
                }
                bwxVar = (defpackage.bwx) objS4;
                bveVarC.v(293719978);
                objS5 = bwcVar.S();
                if (objS5 == obj) {
                    objS5 = new defpackage.lra(bwxVar, 18);
                    bwcVar.ad(objS5);
                }
                cgfVarS = defpackage.bzd.s(cgfVar2, (defpackage.affc) objS5);
                ledVar = defpackage.lee.a;
                if (ledVar.a().b()) {
                    cgfVarS.getClass();
                    cgfVarS = defpackage.kfp.j(cgfVarS, defpackage.ksk.L5, cldVarB);
                }
                int i3114 = i5 >> 15;
                bwcVar.Y(false);
                defpackage.bmz bmzVarD7 = defpackage.vz.d(jN, 0L, bveVarC, 14);
                if (z6) {
                    bveVarC.v(515655544);
                    bnaVarE = defpackage.vz.e(63);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(515655544);
                    bnaVarE = defpackage.vz.e(63);
                    bwcVar.Y(false);
                }
                defpackage.afer aferVar113 = aferVar7;
                int i3115 = i24;
                i8 = i3115;
                defpackage.wf.a(cgfVarS, cldVarB, bmzVarD7, bnaVarE, null, defpackage.dai.as(-322962806, true, new mcu(mcyVar7, citVar3, aferVar113, i3115, bwxVar, affgVar, citVar4, aferVar112, aferVar4), bveVarC), bveVarC, (i3114 & 112) | i12, 16);
                aferVar5 = aferVar113;
                j2 = jN;
                bveVar2 = bveVarC;
                cgfVar3 = cgfVar2;
                affcVar2 = affcVar3;
                aferVar6 = aferVar112;
                cldVar2 = cldVarB;
                z4 = z6;
            } else {
                bveVarC.s();
                z4 = z;
                cldVar2 = cldVar;
                citVar4 = citVar2;
                affcVar2 = affcVar;
                bveVar2 = bveVarC;
                j2 = jN;
                cgfVar3 = cgfVar2;
                aferVar5 = aferVar2;
                aferVar6 = aferVar3;
            }
            citVar5 = citVar3;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mcv(affgVar, aferVar, cgfVar3, i8, z4, j2, cldVar2, citVar5, aferVar5, citVar4, aferVar6, affcVar2, i2, i3, i4);
            }
        }
        i5 |= 3072;
        i8 = i;
        i10 = i4 & 16;
        if (i10 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i10 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (true != bveVarC.D(z)) {
                i11 = 8192;
            } else {
                i11 = 16384;
            }
            i5 |= i11;
        }
        if ((i2 & 196608) == 0) {
            i28 = 65536;
            jN = j;
            if ((i4 & 32) == 0) {
                i28 = 131072;
            }
            i5 |= i28;
        } else {
            jN = j;
        }
        if ((i2 & 1572864) == 0) {
            i27 = 524288;
            if ((i4 & 64) == 0) {
                i12 = 196608;
                if (bveVarC.C(cldVar)) {
                    i27 = 1048576;
                }
            } else {
                i12 = 196608;
            }
            i5 |= i27;
        } else {
            i12 = 196608;
        }
        if ((i2 & 12582912) == 0) {
            i26 = 4194304;
            if ((i4 & 128) == 0) {
                citVar3 = citVar;
                if (bveVarC.C(citVar3)) {
                    i26 = 8388608;
                }
            } else {
                citVar3 = citVar;
            }
            i5 |= i26;
        } else {
            citVar3 = citVar;
        }
        i13 = i4 & 256;
        if (i13 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (true != bveVarC.E(aferVar2)) {
                i14 = 33554432;
            } else {
                i14 = 67108864;
            }
            i5 |= i14;
        }
        if ((805306368 & i2) != 0) {
            i5 |= ((i4 & 512) == 0 || !bveVarC.C(citVar2)) ? 268435456 : 536870912;
        }
        i15 = i4 & 1024;
        if (i15 != 0) {
            i16 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (true != bveVarC.E(aferVar3)) {
                i17 = 2;
            } else {
                i17 = 4;
            }
            i16 = i3 | i17;
        } else {
            i16 = i3;
        }
        i18 = i4 & 2048;
        if (i18 != 0) {
            if ((i3 & 48) == 0) {
                if (true != bveVarC.E(affcVar)) {
                    i19 = 16;
                } else {
                    i19 = 32;
                }
                i16 |= i19;
            }
            if ((306783379 & i5) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (bveVarC.I(z3, i5 & 1)) {
                i20 = i4 & 512;
                i21 = i4 & 128;
                i22 = i4 & 64;
                i23 = i4 & 32;
                bwcVar = (defpackage.bwc) bveVarC;
                i24 = i8;
                bwcVar.ab(-127, null, 0, null);
                if ((i2 & 1) != 0) {
                    if (i30 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i24;
                    }
                    z5 = z2 & z;
                    if (i23 != 0) {
                        i5 &= -458753;
                        jN = defpackage.kfp.i(bveVarC).N();
                    }
                    if (i22 != 0) {
                        int i3116 = mcx.a;
                        i5 &= -3670017;
                        cldVarB = defpackage.bcw.b(24.0f);
                    } else {
                        cldVarB = cldVar;
                    }
                    if (i21 != 0) {
                        i5 &= -29360129;
                        citVar3 = new defpackage.cit();
                    }
                    if (i13 != 0) {
                        objS3 = bwcVar.S();
                        if (objS3 == defpackage.bvd.a) {
                            objS3 = new defpackage.llt(10);
                            bwcVar.ad(objS3);
                        }
                        aferVar7 = (defpackage.afer) objS3;
                    } else {
                        aferVar7 = aferVar2;
                    }
                    if (i20 != 0) {
                        citVar4 = new defpackage.cit();
                        i5 &= -1879048193;
                    } else {
                        citVar4 = citVar2;
                    }
                    if (i15 != 0) {
                        objS2 = bwcVar.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.llt(11);
                            bwcVar.ad(objS2);
                        }
                        aferVar8 = (defpackage.afer) objS2;
                    } else {
                        aferVar8 = aferVar3;
                    }
                    if (i18 != 0) {
                        objS = bwcVar.S();
                        defpackage.cgf cgfVar117 = cgfVar4;
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.ltk(20);
                            bwcVar.ad(objS);
                        }
                        i24 = i25;
                        affcVar3 = (defpackage.affc) objS;
                        aferVar9 = aferVar8;
                        cgfVar2 = cgfVar117;
                    } else {
                        defpackage.cgf cgfVar118 = cgfVar4;
                        i24 = i25;
                        aferVar9 = aferVar8;
                        cgfVar2 = cgfVar118;
                        affcVar3 = affcVar;
                    }
                } else {
                    if (i30 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i24;
                    }
                    z5 = z2 & z;
                    if (i23 != 0) {
                        i5 &= -458753;
                        jN = defpackage.kfp.i(bveVarC).N();
                    }
                    if (i22 != 0) {
                        int i3117 = mcx.a;
                        i5 &= -3670017;
                        cldVarB = defpackage.bcw.b(24.0f);
                    } else {
                        cldVarB = cldVar;
                    }
                    if (i21 != 0) {
                        i5 &= -29360129;
                        citVar3 = new defpackage.cit();
                    }
                    if (i13 != 0) {
                        objS3 = bwcVar.S();
                        if (objS3 == defpackage.bvd.a) {
                            objS3 = new defpackage.llt(10);
                            bwcVar.ad(objS3);
                        }
                        aferVar7 = (defpackage.afer) objS3;
                    } else {
                        aferVar7 = aferVar2;
                    }
                    if (i20 != 0) {
                        citVar4 = new defpackage.cit();
                        i5 &= -1879048193;
                    } else {
                        citVar4 = citVar2;
                    }
                    if (i15 != 0) {
                        objS2 = bwcVar.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.llt(11);
                            bwcVar.ad(objS2);
                        }
                        aferVar8 = (defpackage.afer) objS2;
                    } else {
                        aferVar8 = aferVar3;
                    }
                    if (i18 != 0) {
                        objS = bwcVar.S();
                        defpackage.cgf cgfVar119 = cgfVar4;
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.ltk(20);
                            bwcVar.ad(objS);
                        }
                        i24 = i25;
                        affcVar3 = (defpackage.affc) objS;
                        aferVar9 = aferVar8;
                        cgfVar2 = cgfVar119;
                    } else {
                        defpackage.cgf cgfVar1110 = cgfVar4;
                        i24 = i25;
                        aferVar9 = aferVar8;
                        cgfVar2 = cgfVar1110;
                        affcVar3 = affcVar;
                    }
                }
                bveVarC.l();
                mcy mcyVar8 = new mcy();
                affcVar3.invoke(mcyVar8);
                defpackage.afer aferVar114 = aferVar9;
                objS4 = bwcVar.S();
                z6 = z5;
                obj = defpackage.bvd.a;
                if (objS4 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState8 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                    bwcVar.ad(parcelableSnapshotMutableState8);
                    objS4 = parcelableSnapshotMutableState8;
                }
                bwxVar = (defpackage.bwx) objS4;
                bveVarC.v(293719978);
                objS5 = bwcVar.S();
                if (objS5 == obj) {
                    objS5 = new defpackage.lra(bwxVar, 18);
                    bwcVar.ad(objS5);
                }
                cgfVarS = defpackage.bzd.s(cgfVar2, (defpackage.affc) objS5);
                ledVar = defpackage.lee.a;
                if (ledVar.a().b()) {
                    cgfVarS.getClass();
                    cgfVarS = defpackage.kfp.j(cgfVarS, defpackage.ksk.L5, cldVarB);
                }
                int i3118 = i5 >> 15;
                bwcVar.Y(false);
                defpackage.bmz bmzVarD8 = defpackage.vz.d(jN, 0L, bveVarC, 14);
                if (z6) {
                    bveVarC.v(515655544);
                    bnaVarE = defpackage.vz.e(63);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(515655544);
                    bnaVarE = defpackage.vz.e(63);
                    bwcVar.Y(false);
                }
                defpackage.afer aferVar115 = aferVar7;
                int i3119 = i24;
                i8 = i3119;
                defpackage.wf.a(cgfVarS, cldVarB, bmzVarD8, bnaVarE, null, defpackage.dai.as(-322962806, true, new mcu(mcyVar8, citVar3, aferVar115, i3119, bwxVar, affgVar, citVar4, aferVar114, aferVar4), bveVarC), bveVarC, (i3118 & 112) | i12, 16);
                aferVar5 = aferVar115;
                j2 = jN;
                bveVar2 = bveVarC;
                cgfVar3 = cgfVar2;
                affcVar2 = affcVar3;
                aferVar6 = aferVar114;
                cldVar2 = cldVarB;
                z4 = z6;
            } else {
                bveVarC.s();
                z4 = z;
                cldVar2 = cldVar;
                citVar4 = citVar2;
                affcVar2 = affcVar;
                bveVar2 = bveVarC;
                j2 = jN;
                cgfVar3 = cgfVar2;
                aferVar5 = aferVar2;
                aferVar6 = aferVar3;
            }
            citVar5 = citVar3;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mcv(affgVar, aferVar, cgfVar3, i8, z4, j2, cldVar2, citVar5, aferVar5, citVar4, aferVar6, affcVar2, i2, i3, i4);
            }
        }
        i16 |= 48;
        if ((306783379 & i5) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (bveVarC.I(z3, i5 & 1)) {
            i20 = i4 & 512;
            i21 = i4 & 128;
            i22 = i4 & 64;
            i23 = i4 & 32;
            bwcVar = (defpackage.bwc) bveVarC;
            i24 = i8;
            bwcVar.ab(-127, null, 0, null);
            if ((i2 & 1) != 0) {
                if (i30 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i6 != 0) {
                    i25 = 2;
                } else {
                    i25 = i24;
                }
                z5 = z2 & z;
                if (i23 != 0) {
                    i5 &= -458753;
                    jN = defpackage.kfp.i(bveVarC).N();
                }
                if (i22 != 0) {
                    int i31110 = mcx.a;
                    i5 &= -3670017;
                    cldVarB = defpackage.bcw.b(24.0f);
                } else {
                    cldVarB = cldVar;
                }
                if (i21 != 0) {
                    i5 &= -29360129;
                    citVar3 = new defpackage.cit();
                }
                if (i13 != 0) {
                    objS3 = bwcVar.S();
                    if (objS3 == defpackage.bvd.a) {
                        objS3 = new defpackage.llt(10);
                        bwcVar.ad(objS3);
                    }
                    aferVar7 = (defpackage.afer) objS3;
                } else {
                    aferVar7 = aferVar2;
                }
                if (i20 != 0) {
                    citVar4 = new defpackage.cit();
                    i5 &= -1879048193;
                } else {
                    citVar4 = citVar2;
                }
                if (i15 != 0) {
                    objS2 = bwcVar.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.llt(11);
                        bwcVar.ad(objS2);
                    }
                    aferVar8 = (defpackage.afer) objS2;
                } else {
                    aferVar8 = aferVar3;
                }
                if (i18 != 0) {
                    objS = bwcVar.S();
                    defpackage.cgf cgfVar1111 = cgfVar4;
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.ltk(20);
                        bwcVar.ad(objS);
                    }
                    i24 = i25;
                    affcVar3 = (defpackage.affc) objS;
                    aferVar9 = aferVar8;
                    cgfVar2 = cgfVar1111;
                } else {
                    defpackage.cgf cgfVar1112 = cgfVar4;
                    i24 = i25;
                    aferVar9 = aferVar8;
                    cgfVar2 = cgfVar1112;
                    affcVar3 = affcVar;
                }
            } else {
                if (i30 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i6 != 0) {
                    i25 = 2;
                } else {
                    i25 = i24;
                }
                z5 = z2 & z;
                if (i23 != 0) {
                    i5 &= -458753;
                    jN = defpackage.kfp.i(bveVarC).N();
                }
                if (i22 != 0) {
                    int i31111 = mcx.a;
                    i5 &= -3670017;
                    cldVarB = defpackage.bcw.b(24.0f);
                } else {
                    cldVarB = cldVar;
                }
                if (i21 != 0) {
                    i5 &= -29360129;
                    citVar3 = new defpackage.cit();
                }
                if (i13 != 0) {
                    objS3 = bwcVar.S();
                    if (objS3 == defpackage.bvd.a) {
                        objS3 = new defpackage.llt(10);
                        bwcVar.ad(objS3);
                    }
                    aferVar7 = (defpackage.afer) objS3;
                } else {
                    aferVar7 = aferVar2;
                }
                if (i20 != 0) {
                    citVar4 = new defpackage.cit();
                    i5 &= -1879048193;
                } else {
                    citVar4 = citVar2;
                }
                if (i15 != 0) {
                    objS2 = bwcVar.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.llt(11);
                        bwcVar.ad(objS2);
                    }
                    aferVar8 = (defpackage.afer) objS2;
                } else {
                    aferVar8 = aferVar3;
                }
                if (i18 != 0) {
                    objS = bwcVar.S();
                    defpackage.cgf cgfVar1113 = cgfVar4;
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.ltk(20);
                        bwcVar.ad(objS);
                    }
                    i24 = i25;
                    affcVar3 = (defpackage.affc) objS;
                    aferVar9 = aferVar8;
                    cgfVar2 = cgfVar1113;
                } else {
                    defpackage.cgf cgfVar1114 = cgfVar4;
                    i24 = i25;
                    aferVar9 = aferVar8;
                    cgfVar2 = cgfVar1114;
                    affcVar3 = affcVar;
                }
            }
            bveVarC.l();
            mcy mcyVar9 = new mcy();
            affcVar3.invoke(mcyVar9);
            defpackage.afer aferVar116 = aferVar9;
            objS4 = bwcVar.S();
            z6 = z5;
            obj = defpackage.bvd.a;
            if (objS4 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState9 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState9);
                objS4 = parcelableSnapshotMutableState9;
            }
            bwxVar = (defpackage.bwx) objS4;
            bveVarC.v(293719978);
            objS5 = bwcVar.S();
            if (objS5 == obj) {
                objS5 = new defpackage.lra(bwxVar, 18);
                bwcVar.ad(objS5);
            }
            cgfVarS = defpackage.bzd.s(cgfVar2, (defpackage.affc) objS5);
            ledVar = defpackage.lee.a;
            if (ledVar.a().b()) {
                cgfVarS.getClass();
                cgfVarS = defpackage.kfp.j(cgfVarS, defpackage.ksk.L5, cldVarB);
            }
            int i31112 = i5 >> 15;
            bwcVar.Y(false);
            defpackage.bmz bmzVarD9 = defpackage.vz.d(jN, 0L, bveVarC, 14);
            if (z6) {
                bveVarC.v(515655544);
                bnaVarE = defpackage.vz.e(63);
                bwcVar.Y(false);
            } else {
                bveVarC.v(515655544);
                bnaVarE = defpackage.vz.e(63);
                bwcVar.Y(false);
            }
            defpackage.afer aferVar117 = aferVar7;
            int i31113 = i24;
            i8 = i31113;
            defpackage.wf.a(cgfVarS, cldVarB, bmzVarD9, bnaVarE, null, defpackage.dai.as(-322962806, true, new mcu(mcyVar9, citVar3, aferVar117, i31113, bwxVar, affgVar, citVar4, aferVar116, aferVar4), bveVarC), bveVarC, (i31112 & 112) | i12, 16);
            aferVar5 = aferVar117;
            j2 = jN;
            bveVar2 = bveVarC;
            cgfVar3 = cgfVar2;
            affcVar2 = affcVar3;
            aferVar6 = aferVar116;
            cldVar2 = cldVarB;
            z4 = z6;
        } else {
            bveVarC.s();
            z4 = z;
            cldVar2 = cldVar;
            citVar4 = citVar2;
            affcVar2 = affcVar;
            bveVar2 = bveVarC;
            j2 = jN;
            cgfVar3 = cgfVar2;
            aferVar5 = aferVar2;
            aferVar6 = aferVar3;
        }
        citVar5 = citVar3;
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mcv(affgVar, aferVar, cgfVar3, i8, z4, j2, cldVar2, citVar5, aferVar5, citVar4, aferVar6, affcVar2, i2, i3, i4);
        }
    }

    public static final defpackage.cgf h(defpackage.cgf cgfVar, long j, float f, defpackage.cld cldVar) {
        return !defpackage.a.i(j, defpackage.cjv.j(0)) ? defpackage.asq.H(defpackage.dai.aj(defpackage.edd.k(cgfVar, f), new fzy(j, cldVar, 2)), f) : cgfVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0115  */
    /* JADX WARN: Code duplicated, block: B:103:0x011b  */
    /* JADX WARN: Code duplicated, block: B:105:0x011f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0128  */
    /* JADX WARN: Code duplicated, block: B:108:0x012a  */
    /* JADX WARN: Code duplicated, block: B:110:0x012e  */
    /* JADX WARN: Code duplicated, block: B:113:0x013e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0146  */
    /* JADX WARN: Code duplicated, block: B:120:0x014f  */
    /* JADX WARN: Code duplicated, block: B:122:0x016b  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:141:0x01af  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x01db  */
    /* JADX WARN: Code duplicated, block: B:153:0x01df  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:158:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:160:0x0201  */
    /* JADX WARN: Code duplicated, block: B:161:0x020d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0222  */
    /* JADX WARN: Code duplicated, block: B:166:0x0229  */
    /* JADX WARN: Code duplicated, block: B:168:0x022c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0231  */
    /* JADX WARN: Code duplicated, block: B:173:0x023f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0247 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x0253 A[PHI: r42
  0x0253: PHI (r42v3 int) = (r42v1 int), (r42v4 int), (r42v4 int) binds: [B:170:0x023a, B:178:0x0251, B:174:0x0245] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:181:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x025c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0268  */
    /* JADX WARN: Code duplicated, block: B:186:0x0274  */
    /* JADX WARN: Code duplicated, block: B:190:0x02da  */
    /* JADX WARN: Code duplicated, block: B:193:0x0316  */
    /* JADX WARN: Code duplicated, block: B:194:0x0318  */
    /* JADX WARN: Code duplicated, block: B:197:0x038c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0396  */
    /* JADX WARN: Code duplicated, block: B:201:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:202:0x03f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:205:0x043c  */
    /* JADX WARN: Code duplicated, block: B:206:0x044f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0459  */
    /* JADX WARN: Code duplicated, block: B:210:0x045c  */
    /* JADX WARN: Code duplicated, block: B:212:0x047e  */
    /* JADX WARN: Code duplicated, block: B:214:0x049a  */
    /* JADX WARN: Code duplicated, block: B:217:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x010b  */
    /* JADX WARN: Code duplicated, block: B:99:0x010f  */
    public static final void i(defpackage.affh affhVar, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, defpackage.cgf cgfVar, defpackage.cld cldVar, float f, long j, long j2, long j3, boolean z, long j4, boolean z2, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        defpackage.cld cldVar2;
        int i5;
        float f2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        long j5;
        long j6;
        boolean z5;
        defpackage.cgf cgfVar3;
        defpackage.bve bveVar2;
        defpackage.cld cldVar3;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2;
        float f3;
        long j7;
        long j8;
        boolean z6;
        defpackage.bxl bxlVarJ;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        defpackage.cld cldVar4;
        float f4;
        long jF;
        long jA;
        long jZ;
        boolean z7;
        long j9;
        boolean z8;
        defpackage.cgf cgfVar5;
        long j10;
        java.lang.Integer numValueOf;
        int i17;
        boolean zT;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon3;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon4;
        float f5;
        long j11;
        defpackage.cld cldVar5;
        defpackage.cld cldVar6;
        long j12;
        defpackage.bve bveVar3;
        defpackage.cgf cgfVarH;
        float f6;
        boolean z9;
        long jC;
        boolean z10;
        defpackage.bwc bwcVar2;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon5;
        long j13;
        defpackage.cld cldVar7;
        long j14;
        defpackage.bve bveVar4;
        boolean z11;
        boolean z12;
        long j15;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1254916432);
        if (i23 == 0) {
            i4 = (true != bveVarC.E(affhVar) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.C(ghIcon) ? 16 : 32;
        }
        int i24 = i3 & 4;
        if (i24 == 0) {
            if ((i & 384) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                i22 = 1024;
                if ((i3 & 8) == 0) {
                    cldVar2 = cldVar;
                    if (bveVarC.C(cldVar2)) {
                        i22 = 2048;
                    }
                } else {
                    cldVar2 = cldVar;
                }
                i4 |= i22;
            } else {
                cldVar2 = cldVar;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (true != bveVarC.z(f2)) {
                        i6 = 8192;
                    } else {
                        i6 = 16384;
                    }
                    i4 |= i6;
                }
                if ((196608 & i) == 0) {
                    i21 = 65536;
                    if ((i3 & 32) == 0 && bveVarC.B(j)) {
                        i21 = 131072;
                    }
                    i4 |= i21;
                }
                if ((i & 1572864) == 0) {
                    i20 = 524288;
                    if ((i3 & 64) == 0 && bveVarC.B(j2)) {
                        i20 = 1048576;
                    }
                    i4 |= i20;
                }
                if ((i & 12582912) == 0) {
                    i19 = 4194304;
                    if ((i3 & 128) == 0 && bveVarC.B(j3)) {
                        i19 = 8388608;
                    }
                    i4 |= i19;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (true != bveVarC.D(z)) {
                        i8 = 33554432;
                    } else {
                        i8 = 67108864;
                    }
                    i4 |= i8;
                }
                if ((i & 805306368) != 0) {
                    if ((i3 & 512) == 0 || !bveVarC.B(j4)) {
                        i18 = 268435456;
                    } else {
                        i18 = 536870912;
                    }
                    i4 |= i18;
                }
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i10 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (true != bveVarC.D(z2)) {
                        i11 = 2;
                    } else {
                        i11 = 4;
                    }
                    i10 = i2 | i11;
                } else {
                    i10 = i2;
                }
                int i25 = i10;
                if ((306783379 & i4) == 306783378 || (i25 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bveVarC.I(z4, i4 & 1)) {
                    i12 = i3 & 512;
                    i13 = i3 & 128;
                    i14 = i3 & 64;
                    i15 = i3 & 32;
                    i16 = i3 & 8;
                    bwcVar = (defpackage.bwc) bveVarC;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i & 1) != 0 || bveVarC.F()) {
                        if (i24 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i16 != 0) {
                            i4 &= -7169;
                            cldVar4 = defpackage.bcw.a;
                        } else {
                            cldVar4 = cldVar2;
                        }
                        if (i5 != 0) {
                            f4 = 26.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i15 != 0) {
                            jF = defpackage.kfp.i(bveVarC).F();
                            i4 &= -458753;
                        } else {
                            jF = j;
                        }
                        if (i14 != 0) {
                            jA = defpackage.ksx.a(defpackage.kfp.i(bveVarC), jF);
                            i4 &= -3670017;
                        } else {
                            jA = j2;
                        }
                        if (i13 != 0) {
                            jZ = defpackage.kfp.i(bveVarC).z();
                            i4 &= -29360129;
                        } else {
                            jZ = j3;
                        }
                        z7 = true;
                        z6 = (!z3) | z;
                        if (i12 != 0) {
                            i4 &= -1879048193;
                            j9 = 0;
                        } else {
                            j9 = j4;
                        }
                        if (i9 != 0) {
                            z8 = false;
                        } else {
                            z8 = z2;
                        }
                        cgfVar5 = cgfVar4;
                        j10 = j9;
                    } else {
                        bveVarC.s();
                        if (i16 != 0) {
                            i4 &= -7169;
                        }
                        if (i15 != 0) {
                            i4 &= -458753;
                        }
                        if (i14 != 0) {
                            i4 &= -3670017;
                        }
                        if (i13 != 0) {
                            i4 &= -29360129;
                        }
                        if (i12 != 0) {
                            i4 &= -1879048193;
                        }
                        jF = j;
                        z8 = z2;
                        cgfVar5 = cgfVar2;
                        cldVar4 = cldVar2;
                        f4 = f2;
                        z7 = true;
                        jA = j2;
                        jZ = j3;
                        z6 = z;
                        j10 = j4;
                    }
                    bveVarC.l();
                    if (ghIcon != null) {
                        numValueOf = java.lang.Integer.valueOf(ghIcon.b);
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf == null) {
                        i17 = i4;
                    } else {
                        i17 = i4;
                        if (numValueOf.intValue() != 2) {
                            zT = defpackage.acrf.t();
                        }
                        if (affhVar != null) {
                            if (ghIcon != null) {
                                int i26 = i17 >> 6;
                                bveVarC.v(1821000015);
                                if (z8) {
                                    z12 = zT;
                                    j15 = jF;
                                    if (defpackage.a.i(j10, 0L) || !defpackage.afga.f(cldVar4, defpackage.bcw.a)) {
                                        z10 = z12;
                                        jF = j15;
                                    } else {
                                        bveVarC.v(1821052033);
                                        long j16 = j10;
                                        jF = j15;
                                        float f7 = f4;
                                        defpackage.cgf cgfVar6 = cgfVar5;
                                        defpackage.ca.at(cgfVar6, null, defpackage.dai.as(-1614815687, z7, new mcr(f7, j16, z12, jF, jA, ghIcon, jZ, z6, affhVar, cldVar4), bveVarC), bveVarC, (i26 & 14) | 3072, 6);
                                        cgfVar5 = cgfVar6;
                                        bwcVar2 = bwcVar;
                                        bwcVar2.Y(false);
                                        j10 = j16;
                                        jZ = jZ;
                                        ghIcon5 = ghIcon;
                                        f5 = f7;
                                        z11 = false;
                                        bveVar4 = bveVarC;
                                        j14 = jA;
                                        cldVar7 = cldVar4;
                                    }
                                    bwcVar2.Y(z11);
                                    j12 = j14;
                                    ghIcon4 = ghIcon5;
                                    bveVar3 = bveVar4;
                                    cldVar6 = cldVar7;
                                } else {
                                    z10 = zT;
                                }
                                long j17 = j10;
                                bwcVar2 = bwcVar;
                                float f8 = f4;
                                int i27 = i17 >> 3;
                                bveVarC.v(1823266828);
                                long j18 = jZ;
                                ghIcon5 = ghIcon;
                                defpackage.ccz cczVarAs = defpackage.dai.as(-517864277, true, new mcs(ghIcon, j18, z10, z6, jF, 0), bveVarC);
                                if (z10) {
                                    j13 = jF;
                                } else {
                                    j13 = defpackage.cjv.j(0);
                                }
                                defpackage.cld cldVar8 = cldVar4;
                                long j19 = jA;
                                cldVar7 = cldVar8;
                                jZ = j18;
                                defpackage.kil.b(cczVarAs, cgfVar5, f8, j17, j13, null, j19, defpackage.dai.as(-1341321660, true, new defpackage.bsc(affhVar, j18, cldVar8, 3), bveVarC), bveVarC, (i26 & 896) | (i27 & 112) | 12582918 | ((i17 >> 18) & 7168) | (i17 & 3670016), 32);
                                f5 = f8;
                                j10 = j17;
                                j14 = j19;
                                bveVar4 = bveVarC;
                                z11 = false;
                                bwcVar2.Y(false);
                                bwcVar2.Y(z11);
                                j12 = j14;
                                ghIcon4 = ghIcon5;
                                bveVar3 = bveVar4;
                                cldVar6 = cldVar7;
                            } else {
                                ghIcon3 = ghIcon;
                                ghIcon4 = null;
                            }
                            j5 = jF;
                            bveVar2 = bveVar3;
                            f3 = f5;
                            cldVar3 = cldVar6;
                            j7 = j12;
                            j8 = jZ;
                            cgfVar3 = cgfVar5;
                            ghIcon2 = ghIcon4;
                            z5 = z8;
                            j6 = j10;
                        } else {
                            ghIcon3 = ghIcon;
                            ghIcon4 = ghIcon3;
                        }
                        f5 = f4;
                        j11 = jA;
                        cldVar5 = cldVar4;
                        cgfVar5 = cgfVar5;
                        if (affhVar != null) {
                            bveVarC.v(-910974998);
                            cldVar6 = cldVar5;
                            affhVar.invoke(defpackage.awj.c(defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431), 1.0f), bveVarC, java.lang.Integer.valueOf((i17 << 3) & 112));
                            bwcVar.Y(false);
                            j12 = j11;
                            bveVar3 = bveVarC;
                        } else if (ghIcon3 != null) {
                            bveVarC.v(1824765182);
                            j12 = j11;
                            defpackage.cne cneVarF = defpackage.lgo.f(ghIcon3, 0.0f, bveVarC, 3);
                            cgfVarH = defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431);
                            cldVar6 = cldVar5;
                            if (zT) {
                                f6 = 1.0f;
                                cgfVarH = defpackage.awj.c(defpackage.asq.H(cgfVarH.a(new defpackage.ajc(jF, defpackage.cky.a)), 12.0f), 1.0f);
                                z9 = true;
                            } else {
                                f6 = 1.0f;
                                z9 = false;
                            }
                            defpackage.cgf cgfVarC = defpackage.awj.c(cgfVarH, f6);
                            if (z9) {
                                jC = j12;
                            } else {
                                jC = defpackage.cjv.c();
                            }
                            defpackage.boh.a(cneVarF, null, cgfVarC, jC, bveVarC, 56, 0);
                            bveVar3 = bveVarC;
                            bwcVar.Y(false);
                        } else {
                            cldVar6 = cldVar5;
                            j12 = j11;
                            bveVar3 = bveVarC;
                            bveVar3.v(1825218898);
                            bwcVar.Y(false);
                        }
                        j5 = jF;
                        bveVar2 = bveVar3;
                        f3 = f5;
                        cldVar3 = cldVar6;
                        j7 = j12;
                        j8 = jZ;
                        cgfVar3 = cgfVar5;
                        ghIcon2 = ghIcon4;
                        z5 = z8;
                        j6 = j10;
                    }
                    if ((numValueOf == 0 && numValueOf.intValue() == 10) || (numValueOf != 0 && numValueOf.intValue() == 9)) {
                        zT = defpackage.acrf.t();
                    } else {
                        zT = false;
                    }
                    if (affhVar != null) {
                        if (ghIcon != null) {
                            int i28 = i17 >> 6;
                            bveVarC.v(1821000015);
                            if (z8) {
                                z12 = zT;
                                j15 = jF;
                                if (defpackage.a.i(j10, 0L)) {
                                }
                                z10 = z12;
                                jF = j15;
                            } else {
                                z10 = zT;
                            }
                            long j110 = j10;
                            bwcVar2 = bwcVar;
                            float f9 = f4;
                            int i29 = i17 >> 3;
                            bveVarC.v(1823266828);
                            long j111 = jZ;
                            ghIcon5 = ghIcon;
                            defpackage.ccz cczVarAs2 = defpackage.dai.as(-517864277, true, new mcs(ghIcon, j111, z10, z6, jF, 0), bveVarC);
                            if (z10) {
                                j13 = jF;
                            } else {
                                j13 = defpackage.cjv.j(0);
                            }
                            defpackage.cld cldVar9 = cldVar4;
                            long j112 = jA;
                            cldVar7 = cldVar9;
                            jZ = j111;
                            defpackage.kil.b(cczVarAs2, cgfVar5, f9, j110, j13, null, j112, defpackage.dai.as(-1341321660, true, new defpackage.bsc(affhVar, j111, cldVar9, 3), bveVarC), bveVarC, (i28 & 896) | (i29 & 112) | 12582918 | ((i17 >> 18) & 7168) | (i17 & 3670016), 32);
                            f5 = f9;
                            j10 = j110;
                            j14 = j112;
                            bveVar4 = bveVarC;
                            z11 = false;
                            bwcVar2.Y(false);
                            bwcVar2.Y(z11);
                            j12 = j14;
                            ghIcon4 = ghIcon5;
                            bveVar3 = bveVar4;
                            cldVar6 = cldVar7;
                        } else {
                            ghIcon3 = ghIcon;
                            ghIcon4 = null;
                        }
                        j5 = jF;
                        bveVar2 = bveVar3;
                        f3 = f5;
                        cldVar3 = cldVar6;
                        j7 = j12;
                        j8 = jZ;
                        cgfVar3 = cgfVar5;
                        ghIcon2 = ghIcon4;
                        z5 = z8;
                        j6 = j10;
                    } else {
                        ghIcon3 = ghIcon;
                        ghIcon4 = ghIcon3;
                    }
                    f5 = f4;
                    j11 = jA;
                    cldVar5 = cldVar4;
                    cgfVar5 = cgfVar5;
                    if (affhVar != null) {
                        bveVarC.v(-910974998);
                        cldVar6 = cldVar5;
                        affhVar.invoke(defpackage.awj.c(defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431), 1.0f), bveVarC, java.lang.Integer.valueOf((i17 << 3) & 112));
                        bwcVar.Y(false);
                        j12 = j11;
                        bveVar3 = bveVarC;
                    } else if (ghIcon3 != null) {
                        bveVarC.v(1824765182);
                        j12 = j11;
                        defpackage.cne cneVarF2 = defpackage.lgo.f(ghIcon3, 0.0f, bveVarC, 3);
                        cgfVarH = defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431);
                        cldVar6 = cldVar5;
                        if (zT) {
                            f6 = 1.0f;
                            cgfVarH = defpackage.awj.c(defpackage.asq.H(cgfVarH.a(new defpackage.ajc(jF, defpackage.cky.a)), 12.0f), 1.0f);
                            z9 = true;
                        } else {
                            f6 = 1.0f;
                            z9 = false;
                        }
                        defpackage.cgf cgfVarC2 = defpackage.awj.c(cgfVarH, f6);
                        if (z9) {
                            jC = j12;
                        } else {
                            jC = defpackage.cjv.c();
                        }
                        defpackage.boh.a(cneVarF2, null, cgfVarC2, jC, bveVarC, 56, 0);
                        bveVar3 = bveVarC;
                        bwcVar.Y(false);
                    } else {
                        cldVar6 = cldVar5;
                        j12 = j11;
                        bveVar3 = bveVarC;
                        bveVar3.v(1825218898);
                        bwcVar.Y(false);
                    }
                    j5 = jF;
                    bveVar2 = bveVar3;
                    f3 = f5;
                    cldVar3 = cldVar6;
                    j7 = j12;
                    j8 = jZ;
                    cgfVar3 = cgfVar5;
                    ghIcon2 = ghIcon4;
                    z5 = z8;
                    j6 = j10;
                } else {
                    bveVarC.s();
                    j5 = j;
                    j6 = j4;
                    z5 = z2;
                    cgfVar3 = cgfVar2;
                    bveVar2 = bveVarC;
                    cldVar3 = cldVar2;
                    ghIcon2 = ghIcon;
                    f3 = f2;
                    j7 = j2;
                    j8 = j3;
                    z6 = z;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new mct(affhVar, ghIcon2, cgfVar3, cldVar3, f3, j5, j7, j8, z6, j6, z5, i, i2, i3);
                }
            }
            i4 |= 24576;
            f2 = f;
            if ((196608 & i) == 0) {
                i21 = 65536;
                if ((i3 & 32) == 0) {
                    i21 = 131072;
                }
                i4 |= i21;
            }
            if ((i & 1572864) == 0) {
                i20 = 524288;
                if ((i3 & 64) == 0) {
                    i20 = 1048576;
                }
                i4 |= i20;
            }
            if ((i & 12582912) == 0) {
                i19 = 4194304;
                if ((i3 & 128) == 0) {
                    i19 = 8388608;
                }
                i4 |= i19;
            }
            i7 = i3 & 256;
            if (i7 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i7 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (true != bveVarC.D(z)) {
                    i8 = 33554432;
                } else {
                    i8 = 67108864;
                }
                i4 |= i8;
            }
            if ((i & 805306368) != 0) {
                if ((i3 & 512) == 0) {
                    i18 = 268435456;
                } else {
                    i18 = 268435456;
                }
                i4 |= i18;
            }
            i9 = i3 & 1024;
            if (i9 != 0) {
                i10 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.D(z2)) {
                    i11 = 2;
                } else {
                    i11 = 4;
                }
                i10 = i2 | i11;
            } else {
                i10 = i2;
            }
            int i210 = i10;
            if ((306783379 & i4) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (bveVarC.I(z4, i4 & 1)) {
                i12 = i3 & 512;
                i13 = i3 & 128;
                i14 = i3 & 64;
                i15 = i3 & 32;
                i16 = i3 & 8;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i16 != 0) {
                        i4 &= -7169;
                        cldVar4 = defpackage.bcw.a;
                    } else {
                        cldVar4 = cldVar2;
                    }
                    if (i5 != 0) {
                        f4 = 26.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i15 != 0) {
                        jF = defpackage.kfp.i(bveVarC).F();
                        i4 &= -458753;
                    } else {
                        jF = j;
                    }
                    if (i14 != 0) {
                        jA = defpackage.ksx.a(defpackage.kfp.i(bveVarC), jF);
                        i4 &= -3670017;
                    } else {
                        jA = j2;
                    }
                    if (i13 != 0) {
                        jZ = defpackage.kfp.i(bveVarC).z();
                        i4 &= -29360129;
                    } else {
                        jZ = j3;
                    }
                    z7 = true;
                    z6 = (!z3) | z;
                    if (i12 != 0) {
                        i4 &= -1879048193;
                        j9 = 0;
                    } else {
                        j9 = j4;
                    }
                    if (i9 != 0) {
                        z8 = false;
                    } else {
                        z8 = z2;
                    }
                    cgfVar5 = cgfVar4;
                    j10 = j9;
                } else {
                    if (i24 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i16 != 0) {
                        i4 &= -7169;
                        cldVar4 = defpackage.bcw.a;
                    } else {
                        cldVar4 = cldVar2;
                    }
                    if (i5 != 0) {
                        f4 = 26.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i15 != 0) {
                        jF = defpackage.kfp.i(bveVarC).F();
                        i4 &= -458753;
                    } else {
                        jF = j;
                    }
                    if (i14 != 0) {
                        jA = defpackage.ksx.a(defpackage.kfp.i(bveVarC), jF);
                        i4 &= -3670017;
                    } else {
                        jA = j2;
                    }
                    if (i13 != 0) {
                        jZ = defpackage.kfp.i(bveVarC).z();
                        i4 &= -29360129;
                    } else {
                        jZ = j3;
                    }
                    z7 = true;
                    z6 = (!z3) | z;
                    if (i12 != 0) {
                        i4 &= -1879048193;
                        j9 = 0;
                    } else {
                        j9 = j4;
                    }
                    if (i9 != 0) {
                        z8 = false;
                    } else {
                        z8 = z2;
                    }
                    cgfVar5 = cgfVar4;
                    j10 = j9;
                }
                bveVarC.l();
                if (ghIcon != null) {
                    numValueOf = java.lang.Integer.valueOf(ghIcon.b);
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    i17 = i4;
                } else {
                    i17 = i4;
                    if (numValueOf.intValue() != 2) {
                        zT = defpackage.acrf.t();
                    }
                    if (affhVar != null) {
                        if (ghIcon != null) {
                            int i211 = i17 >> 6;
                            bveVarC.v(1821000015);
                            if (z8) {
                                z12 = zT;
                                j15 = jF;
                                if (defpackage.a.i(j10, 0L)) {
                                }
                                z10 = z12;
                                jF = j15;
                            } else {
                                z10 = zT;
                            }
                            long j113 = j10;
                            bwcVar2 = bwcVar;
                            float f10 = f4;
                            int i212 = i17 >> 3;
                            bveVarC.v(1823266828);
                            long j114 = jZ;
                            ghIcon5 = ghIcon;
                            defpackage.ccz cczVarAs3 = defpackage.dai.as(-517864277, true, new mcs(ghIcon, j114, z10, z6, jF, 0), bveVarC);
                            if (z10) {
                                j13 = jF;
                            } else {
                                j13 = defpackage.cjv.j(0);
                            }
                            defpackage.cld cldVar10 = cldVar4;
                            long j115 = jA;
                            cldVar7 = cldVar10;
                            jZ = j114;
                            defpackage.kil.b(cczVarAs3, cgfVar5, f10, j113, j13, null, j115, defpackage.dai.as(-1341321660, true, new defpackage.bsc(affhVar, j114, cldVar10, 3), bveVarC), bveVarC, (i211 & 896) | (i212 & 112) | 12582918 | ((i17 >> 18) & 7168) | (i17 & 3670016), 32);
                            f5 = f10;
                            j10 = j113;
                            j14 = j115;
                            bveVar4 = bveVarC;
                            z11 = false;
                            bwcVar2.Y(false);
                            bwcVar2.Y(z11);
                            j12 = j14;
                            ghIcon4 = ghIcon5;
                            bveVar3 = bveVar4;
                            cldVar6 = cldVar7;
                        } else {
                            ghIcon3 = ghIcon;
                            ghIcon4 = null;
                        }
                        j5 = jF;
                        bveVar2 = bveVar3;
                        f3 = f5;
                        cldVar3 = cldVar6;
                        j7 = j12;
                        j8 = jZ;
                        cgfVar3 = cgfVar5;
                        ghIcon2 = ghIcon4;
                        z5 = z8;
                        j6 = j10;
                    } else {
                        ghIcon3 = ghIcon;
                        ghIcon4 = ghIcon3;
                    }
                    f5 = f4;
                    j11 = jA;
                    cldVar5 = cldVar4;
                    cgfVar5 = cgfVar5;
                    if (affhVar != null) {
                        bveVarC.v(-910974998);
                        cldVar6 = cldVar5;
                        affhVar.invoke(defpackage.awj.c(defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431), 1.0f), bveVarC, java.lang.Integer.valueOf((i17 << 3) & 112));
                        bwcVar.Y(false);
                        j12 = j11;
                        bveVar3 = bveVarC;
                    } else if (ghIcon3 != null) {
                        bveVarC.v(1824765182);
                        j12 = j11;
                        defpackage.cne cneVarF3 = defpackage.lgo.f(ghIcon3, 0.0f, bveVarC, 3);
                        cgfVarH = defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431);
                        cldVar6 = cldVar5;
                        if (zT) {
                            f6 = 1.0f;
                            cgfVarH = defpackage.awj.c(defpackage.asq.H(cgfVarH.a(new defpackage.ajc(jF, defpackage.cky.a)), 12.0f), 1.0f);
                            z9 = true;
                        } else {
                            f6 = 1.0f;
                            z9 = false;
                        }
                        defpackage.cgf cgfVarC3 = defpackage.awj.c(cgfVarH, f6);
                        if (z9) {
                            jC = j12;
                        } else {
                            jC = defpackage.cjv.c();
                        }
                        defpackage.boh.a(cneVarF3, null, cgfVarC3, jC, bveVarC, 56, 0);
                        bveVar3 = bveVarC;
                        bwcVar.Y(false);
                    } else {
                        cldVar6 = cldVar5;
                        j12 = j11;
                        bveVar3 = bveVarC;
                        bveVar3.v(1825218898);
                        bwcVar.Y(false);
                    }
                    j5 = jF;
                    bveVar2 = bveVar3;
                    f3 = f5;
                    cldVar3 = cldVar6;
                    j7 = j12;
                    j8 = jZ;
                    cgfVar3 = cgfVar5;
                    ghIcon2 = ghIcon4;
                    z5 = z8;
                    j6 = j10;
                }
                if (numValueOf == 0) {
                    zT = defpackage.acrf.t();
                } else {
                    zT = defpackage.acrf.t();
                }
                if (affhVar != null) {
                    if (ghIcon != null) {
                        int i213 = i17 >> 6;
                        bveVarC.v(1821000015);
                        if (z8) {
                            z12 = zT;
                            j15 = jF;
                            if (defpackage.a.i(j10, 0L)) {
                            }
                            z10 = z12;
                            jF = j15;
                        } else {
                            z10 = zT;
                        }
                        long j116 = j10;
                        bwcVar2 = bwcVar;
                        float f11 = f4;
                        int i214 = i17 >> 3;
                        bveVarC.v(1823266828);
                        long j117 = jZ;
                        ghIcon5 = ghIcon;
                        defpackage.ccz cczVarAs4 = defpackage.dai.as(-517864277, true, new mcs(ghIcon, j117, z10, z6, jF, 0), bveVarC);
                        if (z10) {
                            j13 = jF;
                        } else {
                            j13 = defpackage.cjv.j(0);
                        }
                        defpackage.cld cldVar11 = cldVar4;
                        long j118 = jA;
                        cldVar7 = cldVar11;
                        jZ = j117;
                        defpackage.kil.b(cczVarAs4, cgfVar5, f11, j116, j13, null, j118, defpackage.dai.as(-1341321660, true, new defpackage.bsc(affhVar, j117, cldVar11, 3), bveVarC), bveVarC, (i213 & 896) | (i214 & 112) | 12582918 | ((i17 >> 18) & 7168) | (i17 & 3670016), 32);
                        f5 = f11;
                        j10 = j116;
                        j14 = j118;
                        bveVar4 = bveVarC;
                        z11 = false;
                        bwcVar2.Y(false);
                        bwcVar2.Y(z11);
                        j12 = j14;
                        ghIcon4 = ghIcon5;
                        bveVar3 = bveVar4;
                        cldVar6 = cldVar7;
                    } else {
                        ghIcon3 = ghIcon;
                        ghIcon4 = null;
                    }
                    j5 = jF;
                    bveVar2 = bveVar3;
                    f3 = f5;
                    cldVar3 = cldVar6;
                    j7 = j12;
                    j8 = jZ;
                    cgfVar3 = cgfVar5;
                    ghIcon2 = ghIcon4;
                    z5 = z8;
                    j6 = j10;
                } else {
                    ghIcon3 = ghIcon;
                    ghIcon4 = ghIcon3;
                }
                f5 = f4;
                j11 = jA;
                cldVar5 = cldVar4;
                cgfVar5 = cgfVar5;
                if (affhVar != null) {
                    bveVarC.v(-910974998);
                    cldVar6 = cldVar5;
                    affhVar.invoke(defpackage.awj.c(defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431), 1.0f), bveVarC, java.lang.Integer.valueOf((i17 << 3) & 112));
                    bwcVar.Y(false);
                    j12 = j11;
                    bveVar3 = bveVarC;
                } else if (ghIcon3 != null) {
                    bveVarC.v(1824765182);
                    j12 = j11;
                    defpackage.cne cneVarF4 = defpackage.lgo.f(ghIcon3, 0.0f, bveVarC, 3);
                    cgfVarH = defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431);
                    cldVar6 = cldVar5;
                    if (zT) {
                        f6 = 1.0f;
                        cgfVarH = defpackage.awj.c(defpackage.asq.H(cgfVarH.a(new defpackage.ajc(jF, defpackage.cky.a)), 12.0f), 1.0f);
                        z9 = true;
                    } else {
                        f6 = 1.0f;
                        z9 = false;
                    }
                    defpackage.cgf cgfVarC4 = defpackage.awj.c(cgfVarH, f6);
                    if (z9) {
                        jC = j12;
                    } else {
                        jC = defpackage.cjv.c();
                    }
                    defpackage.boh.a(cneVarF4, null, cgfVarC4, jC, bveVarC, 56, 0);
                    bveVar3 = bveVarC;
                    bwcVar.Y(false);
                } else {
                    cldVar6 = cldVar5;
                    j12 = j11;
                    bveVar3 = bveVarC;
                    bveVar3.v(1825218898);
                    bwcVar.Y(false);
                }
                j5 = jF;
                bveVar2 = bveVar3;
                f3 = f5;
                cldVar3 = cldVar6;
                j7 = j12;
                j8 = jZ;
                cgfVar3 = cgfVar5;
                ghIcon2 = ghIcon4;
                z5 = z8;
                j6 = j10;
            } else {
                bveVarC.s();
                j5 = j;
                j6 = j4;
                z5 = z2;
                cgfVar3 = cgfVar2;
                bveVar2 = bveVarC;
                cldVar3 = cldVar2;
                ghIcon2 = ghIcon;
                f3 = f2;
                j7 = j2;
                j8 = j3;
                z6 = z;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mct(affhVar, ghIcon2, cgfVar3, cldVar3, f3, j5, j7, j8, z6, j6, z5, i, i2, i3);
            }
        }
        i4 |= 384;
        cgfVar2 = cgfVar;
        if ((i & 3072) == 0) {
            i22 = 1024;
            if ((i3 & 8) == 0) {
                cldVar2 = cldVar;
                if (bveVarC.C(cldVar2)) {
                    i22 = 2048;
                }
            } else {
                cldVar2 = cldVar;
            }
            i4 |= i22;
        } else {
            cldVar2 = cldVar;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                f2 = f;
                if (true != bveVarC.z(f2)) {
                    i6 = 8192;
                } else {
                    i6 = 16384;
                }
                i4 |= i6;
            }
            if ((196608 & i) == 0) {
                i21 = 65536;
                if ((i3 & 32) == 0) {
                    i21 = 131072;
                }
                i4 |= i21;
            }
            if ((i & 1572864) == 0) {
                i20 = 524288;
                if ((i3 & 64) == 0) {
                    i20 = 1048576;
                }
                i4 |= i20;
            }
            if ((i & 12582912) == 0) {
                i19 = 4194304;
                if ((i3 & 128) == 0) {
                    i19 = 8388608;
                }
                i4 |= i19;
            }
            i7 = i3 & 256;
            if (i7 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i7 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (true != bveVarC.D(z)) {
                    i8 = 33554432;
                } else {
                    i8 = 67108864;
                }
                i4 |= i8;
            }
            if ((i & 805306368) != 0) {
                if ((i3 & 512) == 0) {
                    i18 = 268435456;
                } else {
                    i18 = 268435456;
                }
                i4 |= i18;
            }
            i9 = i3 & 1024;
            if (i9 != 0) {
                i10 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.D(z2)) {
                    i11 = 2;
                } else {
                    i11 = 4;
                }
                i10 = i2 | i11;
            } else {
                i10 = i2;
            }
            int i215 = i10;
            if ((306783379 & i4) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (bveVarC.I(z4, i4 & 1)) {
                i12 = i3 & 512;
                i13 = i3 & 128;
                i14 = i3 & 64;
                i15 = i3 & 32;
                i16 = i3 & 8;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i16 != 0) {
                        i4 &= -7169;
                        cldVar4 = defpackage.bcw.a;
                    } else {
                        cldVar4 = cldVar2;
                    }
                    if (i5 != 0) {
                        f4 = 26.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i15 != 0) {
                        jF = defpackage.kfp.i(bveVarC).F();
                        i4 &= -458753;
                    } else {
                        jF = j;
                    }
                    if (i14 != 0) {
                        jA = defpackage.ksx.a(defpackage.kfp.i(bveVarC), jF);
                        i4 &= -3670017;
                    } else {
                        jA = j2;
                    }
                    if (i13 != 0) {
                        jZ = defpackage.kfp.i(bveVarC).z();
                        i4 &= -29360129;
                    } else {
                        jZ = j3;
                    }
                    z7 = true;
                    z6 = (!z3) | z;
                    if (i12 != 0) {
                        i4 &= -1879048193;
                        j9 = 0;
                    } else {
                        j9 = j4;
                    }
                    if (i9 != 0) {
                        z8 = false;
                    } else {
                        z8 = z2;
                    }
                    cgfVar5 = cgfVar4;
                    j10 = j9;
                } else {
                    if (i24 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i16 != 0) {
                        i4 &= -7169;
                        cldVar4 = defpackage.bcw.a;
                    } else {
                        cldVar4 = cldVar2;
                    }
                    if (i5 != 0) {
                        f4 = 26.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i15 != 0) {
                        jF = defpackage.kfp.i(bveVarC).F();
                        i4 &= -458753;
                    } else {
                        jF = j;
                    }
                    if (i14 != 0) {
                        jA = defpackage.ksx.a(defpackage.kfp.i(bveVarC), jF);
                        i4 &= -3670017;
                    } else {
                        jA = j2;
                    }
                    if (i13 != 0) {
                        jZ = defpackage.kfp.i(bveVarC).z();
                        i4 &= -29360129;
                    } else {
                        jZ = j3;
                    }
                    z7 = true;
                    z6 = (!z3) | z;
                    if (i12 != 0) {
                        i4 &= -1879048193;
                        j9 = 0;
                    } else {
                        j9 = j4;
                    }
                    if (i9 != 0) {
                        z8 = false;
                    } else {
                        z8 = z2;
                    }
                    cgfVar5 = cgfVar4;
                    j10 = j9;
                }
                bveVarC.l();
                if (ghIcon != null) {
                    numValueOf = java.lang.Integer.valueOf(ghIcon.b);
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    i17 = i4;
                } else {
                    i17 = i4;
                    if (numValueOf.intValue() != 2) {
                        zT = defpackage.acrf.t();
                    }
                    if (affhVar != null) {
                        if (ghIcon != null) {
                            int i216 = i17 >> 6;
                            bveVarC.v(1821000015);
                            if (z8) {
                                z12 = zT;
                                j15 = jF;
                                if (defpackage.a.i(j10, 0L)) {
                                }
                                z10 = z12;
                                jF = j15;
                            } else {
                                z10 = zT;
                            }
                            long j119 = j10;
                            bwcVar2 = bwcVar;
                            float f12 = f4;
                            int i217 = i17 >> 3;
                            bveVarC.v(1823266828);
                            long j1110 = jZ;
                            ghIcon5 = ghIcon;
                            defpackage.ccz cczVarAs5 = defpackage.dai.as(-517864277, true, new mcs(ghIcon, j1110, z10, z6, jF, 0), bveVarC);
                            if (z10) {
                                j13 = jF;
                            } else {
                                j13 = defpackage.cjv.j(0);
                            }
                            defpackage.cld cldVar12 = cldVar4;
                            long j1111 = jA;
                            cldVar7 = cldVar12;
                            jZ = j1110;
                            defpackage.kil.b(cczVarAs5, cgfVar5, f12, j119, j13, null, j1111, defpackage.dai.as(-1341321660, true, new defpackage.bsc(affhVar, j1110, cldVar12, 3), bveVarC), bveVarC, (i216 & 896) | (i217 & 112) | 12582918 | ((i17 >> 18) & 7168) | (i17 & 3670016), 32);
                            f5 = f12;
                            j10 = j119;
                            j14 = j1111;
                            bveVar4 = bveVarC;
                            z11 = false;
                            bwcVar2.Y(false);
                            bwcVar2.Y(z11);
                            j12 = j14;
                            ghIcon4 = ghIcon5;
                            bveVar3 = bveVar4;
                            cldVar6 = cldVar7;
                        } else {
                            ghIcon3 = ghIcon;
                            ghIcon4 = null;
                        }
                        j5 = jF;
                        bveVar2 = bveVar3;
                        f3 = f5;
                        cldVar3 = cldVar6;
                        j7 = j12;
                        j8 = jZ;
                        cgfVar3 = cgfVar5;
                        ghIcon2 = ghIcon4;
                        z5 = z8;
                        j6 = j10;
                    } else {
                        ghIcon3 = ghIcon;
                        ghIcon4 = ghIcon3;
                    }
                    f5 = f4;
                    j11 = jA;
                    cldVar5 = cldVar4;
                    cgfVar5 = cgfVar5;
                    if (affhVar != null) {
                        bveVarC.v(-910974998);
                        cldVar6 = cldVar5;
                        affhVar.invoke(defpackage.awj.c(defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431), 1.0f), bveVarC, java.lang.Integer.valueOf((i17 << 3) & 112));
                        bwcVar.Y(false);
                        j12 = j11;
                        bveVar3 = bveVarC;
                    } else if (ghIcon3 != null) {
                        bveVarC.v(1824765182);
                        j12 = j11;
                        defpackage.cne cneVarF5 = defpackage.lgo.f(ghIcon3, 0.0f, bveVarC, 3);
                        cgfVarH = defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431);
                        cldVar6 = cldVar5;
                        if (zT) {
                            f6 = 1.0f;
                            cgfVarH = defpackage.awj.c(defpackage.asq.H(cgfVarH.a(new defpackage.ajc(jF, defpackage.cky.a)), 12.0f), 1.0f);
                            z9 = true;
                        } else {
                            f6 = 1.0f;
                            z9 = false;
                        }
                        defpackage.cgf cgfVarC5 = defpackage.awj.c(cgfVarH, f6);
                        if (z9) {
                            jC = j12;
                        } else {
                            jC = defpackage.cjv.c();
                        }
                        defpackage.boh.a(cneVarF5, null, cgfVarC5, jC, bveVarC, 56, 0);
                        bveVar3 = bveVarC;
                        bwcVar.Y(false);
                    } else {
                        cldVar6 = cldVar5;
                        j12 = j11;
                        bveVar3 = bveVarC;
                        bveVar3.v(1825218898);
                        bwcVar.Y(false);
                    }
                    j5 = jF;
                    bveVar2 = bveVar3;
                    f3 = f5;
                    cldVar3 = cldVar6;
                    j7 = j12;
                    j8 = jZ;
                    cgfVar3 = cgfVar5;
                    ghIcon2 = ghIcon4;
                    z5 = z8;
                    j6 = j10;
                }
                if (numValueOf == 0) {
                    zT = defpackage.acrf.t();
                } else {
                    zT = defpackage.acrf.t();
                }
                if (affhVar != null) {
                    if (ghIcon != null) {
                        int i218 = i17 >> 6;
                        bveVarC.v(1821000015);
                        if (z8) {
                            z12 = zT;
                            j15 = jF;
                            if (defpackage.a.i(j10, 0L)) {
                            }
                            z10 = z12;
                            jF = j15;
                        } else {
                            z10 = zT;
                        }
                        long j1112 = j10;
                        bwcVar2 = bwcVar;
                        float f13 = f4;
                        int i219 = i17 >> 3;
                        bveVarC.v(1823266828);
                        long j1113 = jZ;
                        ghIcon5 = ghIcon;
                        defpackage.ccz cczVarAs6 = defpackage.dai.as(-517864277, true, new mcs(ghIcon, j1113, z10, z6, jF, 0), bveVarC);
                        if (z10) {
                            j13 = jF;
                        } else {
                            j13 = defpackage.cjv.j(0);
                        }
                        defpackage.cld cldVar13 = cldVar4;
                        long j1114 = jA;
                        cldVar7 = cldVar13;
                        jZ = j1113;
                        defpackage.kil.b(cczVarAs6, cgfVar5, f13, j1112, j13, null, j1114, defpackage.dai.as(-1341321660, true, new defpackage.bsc(affhVar, j1113, cldVar13, 3), bveVarC), bveVarC, (i218 & 896) | (i219 & 112) | 12582918 | ((i17 >> 18) & 7168) | (i17 & 3670016), 32);
                        f5 = f13;
                        j10 = j1112;
                        j14 = j1114;
                        bveVar4 = bveVarC;
                        z11 = false;
                        bwcVar2.Y(false);
                        bwcVar2.Y(z11);
                        j12 = j14;
                        ghIcon4 = ghIcon5;
                        bveVar3 = bveVar4;
                        cldVar6 = cldVar7;
                    } else {
                        ghIcon3 = ghIcon;
                        ghIcon4 = null;
                    }
                    j5 = jF;
                    bveVar2 = bveVar3;
                    f3 = f5;
                    cldVar3 = cldVar6;
                    j7 = j12;
                    j8 = jZ;
                    cgfVar3 = cgfVar5;
                    ghIcon2 = ghIcon4;
                    z5 = z8;
                    j6 = j10;
                } else {
                    ghIcon3 = ghIcon;
                    ghIcon4 = ghIcon3;
                }
                f5 = f4;
                j11 = jA;
                cldVar5 = cldVar4;
                cgfVar5 = cgfVar5;
                if (affhVar != null) {
                    bveVarC.v(-910974998);
                    cldVar6 = cldVar5;
                    affhVar.invoke(defpackage.awj.c(defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431), 1.0f), bveVarC, java.lang.Integer.valueOf((i17 << 3) & 112));
                    bwcVar.Y(false);
                    j12 = j11;
                    bveVar3 = bveVarC;
                } else if (ghIcon3 != null) {
                    bveVarC.v(1824765182);
                    j12 = j11;
                    defpackage.cne cneVarF6 = defpackage.lgo.f(ghIcon3, 0.0f, bveVarC, 3);
                    cgfVarH = defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431);
                    cldVar6 = cldVar5;
                    if (zT) {
                        f6 = 1.0f;
                        cgfVarH = defpackage.awj.c(defpackage.asq.H(cgfVarH.a(new defpackage.ajc(jF, defpackage.cky.a)), 12.0f), 1.0f);
                        z9 = true;
                    } else {
                        f6 = 1.0f;
                        z9 = false;
                    }
                    defpackage.cgf cgfVarC6 = defpackage.awj.c(cgfVarH, f6);
                    if (z9) {
                        jC = j12;
                    } else {
                        jC = defpackage.cjv.c();
                    }
                    defpackage.boh.a(cneVarF6, null, cgfVarC6, jC, bveVarC, 56, 0);
                    bveVar3 = bveVarC;
                    bwcVar.Y(false);
                } else {
                    cldVar6 = cldVar5;
                    j12 = j11;
                    bveVar3 = bveVarC;
                    bveVar3.v(1825218898);
                    bwcVar.Y(false);
                }
                j5 = jF;
                bveVar2 = bveVar3;
                f3 = f5;
                cldVar3 = cldVar6;
                j7 = j12;
                j8 = jZ;
                cgfVar3 = cgfVar5;
                ghIcon2 = ghIcon4;
                z5 = z8;
                j6 = j10;
            } else {
                bveVarC.s();
                j5 = j;
                j6 = j4;
                z5 = z2;
                cgfVar3 = cgfVar2;
                bveVar2 = bveVarC;
                cldVar3 = cldVar2;
                ghIcon2 = ghIcon;
                f3 = f2;
                j7 = j2;
                j8 = j3;
                z6 = z;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mct(affhVar, ghIcon2, cgfVar3, cldVar3, f3, j5, j7, j8, z6, j6, z5, i, i2, i3);
            }
        }
        i4 |= 24576;
        f2 = f;
        if ((196608 & i) == 0) {
            i21 = 65536;
            if ((i3 & 32) == 0) {
                i21 = 131072;
            }
            i4 |= i21;
        }
        if ((i & 1572864) == 0) {
            i20 = 524288;
            if ((i3 & 64) == 0) {
                i20 = 1048576;
            }
            i4 |= i20;
        }
        if ((i & 12582912) == 0) {
            i19 = 4194304;
            if ((i3 & 128) == 0) {
                i19 = 8388608;
            }
            i4 |= i19;
        }
        i7 = i3 & 256;
        if (i7 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i7 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (true != bveVarC.D(z)) {
                i8 = 33554432;
            } else {
                i8 = 67108864;
            }
            i4 |= i8;
        }
        if ((i & 805306368) != 0) {
            if ((i3 & 512) == 0) {
                i18 = 268435456;
            } else {
                i18 = 268435456;
            }
            i4 |= i18;
        }
        i9 = i3 & 1024;
        if (i9 != 0) {
            i10 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (true != bveVarC.D(z2)) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            i10 = i2 | i11;
        } else {
            i10 = i2;
        }
        int i2110 = i10;
        if ((306783379 & i4) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (bveVarC.I(z4, i4 & 1)) {
            i12 = i3 & 512;
            i13 = i3 & 128;
            i14 = i3 & 64;
            i15 = i3 & 32;
            i16 = i3 & 8;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i24 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i16 != 0) {
                    i4 &= -7169;
                    cldVar4 = defpackage.bcw.a;
                } else {
                    cldVar4 = cldVar2;
                }
                if (i5 != 0) {
                    f4 = 26.0f;
                } else {
                    f4 = f2;
                }
                if (i15 != 0) {
                    jF = defpackage.kfp.i(bveVarC).F();
                    i4 &= -458753;
                } else {
                    jF = j;
                }
                if (i14 != 0) {
                    jA = defpackage.ksx.a(defpackage.kfp.i(bveVarC), jF);
                    i4 &= -3670017;
                } else {
                    jA = j2;
                }
                if (i13 != 0) {
                    jZ = defpackage.kfp.i(bveVarC).z();
                    i4 &= -29360129;
                } else {
                    jZ = j3;
                }
                z7 = true;
                z6 = (!z3) | z;
                if (i12 != 0) {
                    i4 &= -1879048193;
                    j9 = 0;
                } else {
                    j9 = j4;
                }
                if (i9 != 0) {
                    z8 = false;
                } else {
                    z8 = z2;
                }
                cgfVar5 = cgfVar4;
                j10 = j9;
            } else {
                if (i24 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i16 != 0) {
                    i4 &= -7169;
                    cldVar4 = defpackage.bcw.a;
                } else {
                    cldVar4 = cldVar2;
                }
                if (i5 != 0) {
                    f4 = 26.0f;
                } else {
                    f4 = f2;
                }
                if (i15 != 0) {
                    jF = defpackage.kfp.i(bveVarC).F();
                    i4 &= -458753;
                } else {
                    jF = j;
                }
                if (i14 != 0) {
                    jA = defpackage.ksx.a(defpackage.kfp.i(bveVarC), jF);
                    i4 &= -3670017;
                } else {
                    jA = j2;
                }
                if (i13 != 0) {
                    jZ = defpackage.kfp.i(bveVarC).z();
                    i4 &= -29360129;
                } else {
                    jZ = j3;
                }
                z7 = true;
                z6 = (!z3) | z;
                if (i12 != 0) {
                    i4 &= -1879048193;
                    j9 = 0;
                } else {
                    j9 = j4;
                }
                if (i9 != 0) {
                    z8 = false;
                } else {
                    z8 = z2;
                }
                cgfVar5 = cgfVar4;
                j10 = j9;
            }
            bveVarC.l();
            if (ghIcon != null) {
                numValueOf = java.lang.Integer.valueOf(ghIcon.b);
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                i17 = i4;
            } else {
                i17 = i4;
                if (numValueOf.intValue() != 2) {
                    zT = defpackage.acrf.t();
                }
                if (affhVar != null) {
                    if (ghIcon != null) {
                        int i2111 = i17 >> 6;
                        bveVarC.v(1821000015);
                        if (z8) {
                            z12 = zT;
                            j15 = jF;
                            if (defpackage.a.i(j10, 0L)) {
                            }
                            z10 = z12;
                            jF = j15;
                        } else {
                            z10 = zT;
                        }
                        long j1115 = j10;
                        bwcVar2 = bwcVar;
                        float f14 = f4;
                        int i2112 = i17 >> 3;
                        bveVarC.v(1823266828);
                        long j1116 = jZ;
                        ghIcon5 = ghIcon;
                        defpackage.ccz cczVarAs7 = defpackage.dai.as(-517864277, true, new mcs(ghIcon, j1116, z10, z6, jF, 0), bveVarC);
                        if (z10) {
                            j13 = jF;
                        } else {
                            j13 = defpackage.cjv.j(0);
                        }
                        defpackage.cld cldVar14 = cldVar4;
                        long j1117 = jA;
                        cldVar7 = cldVar14;
                        jZ = j1116;
                        defpackage.kil.b(cczVarAs7, cgfVar5, f14, j1115, j13, null, j1117, defpackage.dai.as(-1341321660, true, new defpackage.bsc(affhVar, j1116, cldVar14, 3), bveVarC), bveVarC, (i2111 & 896) | (i2112 & 112) | 12582918 | ((i17 >> 18) & 7168) | (i17 & 3670016), 32);
                        f5 = f14;
                        j10 = j1115;
                        j14 = j1117;
                        bveVar4 = bveVarC;
                        z11 = false;
                        bwcVar2.Y(false);
                        bwcVar2.Y(z11);
                        j12 = j14;
                        ghIcon4 = ghIcon5;
                        bveVar3 = bveVar4;
                        cldVar6 = cldVar7;
                    } else {
                        ghIcon3 = ghIcon;
                        ghIcon4 = null;
                    }
                    j5 = jF;
                    bveVar2 = bveVar3;
                    f3 = f5;
                    cldVar3 = cldVar6;
                    j7 = j12;
                    j8 = jZ;
                    cgfVar3 = cgfVar5;
                    ghIcon2 = ghIcon4;
                    z5 = z8;
                    j6 = j10;
                } else {
                    ghIcon3 = ghIcon;
                    ghIcon4 = ghIcon3;
                }
                f5 = f4;
                j11 = jA;
                cldVar5 = cldVar4;
                cgfVar5 = cgfVar5;
                if (affhVar != null) {
                    bveVarC.v(-910974998);
                    cldVar6 = cldVar5;
                    affhVar.invoke(defpackage.awj.c(defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431), 1.0f), bveVarC, java.lang.Integer.valueOf((i17 << 3) & 112));
                    bwcVar.Y(false);
                    j12 = j11;
                    bveVar3 = bveVarC;
                } else if (ghIcon3 != null) {
                    bveVarC.v(1824765182);
                    j12 = j11;
                    defpackage.cne cneVarF7 = defpackage.lgo.f(ghIcon3, 0.0f, bveVarC, 3);
                    cgfVarH = defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431);
                    cldVar6 = cldVar5;
                    if (zT) {
                        f6 = 1.0f;
                        cgfVarH = defpackage.awj.c(defpackage.asq.H(cgfVarH.a(new defpackage.ajc(jF, defpackage.cky.a)), 12.0f), 1.0f);
                        z9 = true;
                    } else {
                        f6 = 1.0f;
                        z9 = false;
                    }
                    defpackage.cgf cgfVarC7 = defpackage.awj.c(cgfVarH, f6);
                    if (z9) {
                        jC = j12;
                    } else {
                        jC = defpackage.cjv.c();
                    }
                    defpackage.boh.a(cneVarF7, null, cgfVarC7, jC, bveVarC, 56, 0);
                    bveVar3 = bveVarC;
                    bwcVar.Y(false);
                } else {
                    cldVar6 = cldVar5;
                    j12 = j11;
                    bveVar3 = bveVarC;
                    bveVar3.v(1825218898);
                    bwcVar.Y(false);
                }
                j5 = jF;
                bveVar2 = bveVar3;
                f3 = f5;
                cldVar3 = cldVar6;
                j7 = j12;
                j8 = jZ;
                cgfVar3 = cgfVar5;
                ghIcon2 = ghIcon4;
                z5 = z8;
                j6 = j10;
            }
            if (numValueOf == 0) {
                zT = defpackage.acrf.t();
            } else {
                zT = defpackage.acrf.t();
            }
            if (affhVar != null) {
                if (ghIcon != null) {
                    int i2113 = i17 >> 6;
                    bveVarC.v(1821000015);
                    if (z8) {
                        z12 = zT;
                        j15 = jF;
                        if (defpackage.a.i(j10, 0L)) {
                        }
                        z10 = z12;
                        jF = j15;
                    } else {
                        z10 = zT;
                    }
                    long j1118 = j10;
                    bwcVar2 = bwcVar;
                    float f15 = f4;
                    int i2114 = i17 >> 3;
                    bveVarC.v(1823266828);
                    long j1119 = jZ;
                    ghIcon5 = ghIcon;
                    defpackage.ccz cczVarAs8 = defpackage.dai.as(-517864277, true, new mcs(ghIcon, j1119, z10, z6, jF, 0), bveVarC);
                    if (z10) {
                        j13 = jF;
                    } else {
                        j13 = defpackage.cjv.j(0);
                    }
                    defpackage.cld cldVar15 = cldVar4;
                    long j11110 = jA;
                    cldVar7 = cldVar15;
                    jZ = j1119;
                    defpackage.kil.b(cczVarAs8, cgfVar5, f15, j1118, j13, null, j11110, defpackage.dai.as(-1341321660, true, new defpackage.bsc(affhVar, j1119, cldVar15, 3), bveVarC), bveVarC, (i2113 & 896) | (i2114 & 112) | 12582918 | ((i17 >> 18) & 7168) | (i17 & 3670016), 32);
                    f5 = f15;
                    j10 = j1118;
                    j14 = j11110;
                    bveVar4 = bveVarC;
                    z11 = false;
                    bwcVar2.Y(false);
                    bwcVar2.Y(z11);
                    j12 = j14;
                    ghIcon4 = ghIcon5;
                    bveVar3 = bveVar4;
                    cldVar6 = cldVar7;
                } else {
                    ghIcon3 = ghIcon;
                    ghIcon4 = null;
                }
                j5 = jF;
                bveVar2 = bveVar3;
                f3 = f5;
                cldVar3 = cldVar6;
                j7 = j12;
                j8 = jZ;
                cgfVar3 = cgfVar5;
                ghIcon2 = ghIcon4;
                z5 = z8;
                j6 = j10;
            } else {
                ghIcon3 = ghIcon;
                ghIcon4 = ghIcon3;
            }
            f5 = f4;
            j11 = jA;
            cldVar5 = cldVar4;
            cgfVar5 = cgfVar5;
            if (affhVar != null) {
                bveVarC.v(-910974998);
                cldVar6 = cldVar5;
                affhVar.invoke(defpackage.awj.c(defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431), 1.0f), bveVarC, java.lang.Integer.valueOf((i17 << 3) & 112));
                bwcVar.Y(false);
                j12 = j11;
                bveVar3 = bveVarC;
            } else if (ghIcon3 != null) {
                bveVarC.v(1824765182);
                j12 = j11;
                defpackage.cne cneVarF8 = defpackage.lgo.f(ghIcon3, 0.0f, bveVarC, 3);
                cgfVarH = defpackage.cjv.h(h(cgfVar5, jZ, 4.0f, cldVar5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar5, true, 0, 1042431);
                cldVar6 = cldVar5;
                if (zT) {
                    f6 = 1.0f;
                    cgfVarH = defpackage.awj.c(defpackage.asq.H(cgfVarH.a(new defpackage.ajc(jF, defpackage.cky.a)), 12.0f), 1.0f);
                    z9 = true;
                } else {
                    f6 = 1.0f;
                    z9 = false;
                }
                defpackage.cgf cgfVarC8 = defpackage.awj.c(cgfVarH, f6);
                if (z9) {
                    jC = j12;
                } else {
                    jC = defpackage.cjv.c();
                }
                defpackage.boh.a(cneVarF8, null, cgfVarC8, jC, bveVarC, 56, 0);
                bveVar3 = bveVarC;
                bwcVar.Y(false);
            } else {
                cldVar6 = cldVar5;
                j12 = j11;
                bveVar3 = bveVarC;
                bveVar3.v(1825218898);
                bwcVar.Y(false);
            }
            j5 = jF;
            bveVar2 = bveVar3;
            f3 = f5;
            cldVar3 = cldVar6;
            j7 = j12;
            j8 = jZ;
            cgfVar3 = cgfVar5;
            ghIcon2 = ghIcon4;
            z5 = z8;
            j6 = j10;
        } else {
            bveVarC.s();
            j5 = j;
            j6 = j4;
            z5 = z2;
            cgfVar3 = cgfVar2;
            bveVar2 = bveVarC;
            cldVar3 = cldVar2;
            ghIcon2 = ghIcon;
            f3 = f2;
            j7 = j2;
            j8 = j3;
            z6 = z;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mct(affhVar, ghIcon2, cgfVar3, cldVar3, f3, j5, j7, j8, z6, j6, z5, i, i2, i3);
        }
    }

    public static /* synthetic */ defpackage.afbk j(defpackage.affh affhVar, long j, defpackage.cld cldVar, defpackage.bve bveVar, int i) {
        if (bveVar.I((i & 3) != 2, i & 1)) {
            affhVar.invoke(defpackage.awj.c(defpackage.cjv.h(h(defpackage.cgf.e, j, 4.0f, cldVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar, true, 0, 1042431), 1.0f), bveVar, 0);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    public static final void k(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2, defpackage.cgf cgfVar, boolean z, float f, long j, long j2, long j3, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar2;
        float f2;
        long j4;
        long j5;
        long j6;
        long jA;
        long jZ;
        defpackage.cgf cgfVar3;
        long j7;
        float f3;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1962549138);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(ghIcon) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(ghIcon2) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != bveVarC.D(z) ? 1024 : 2048;
        }
        int i5 = i4 | 24576;
        if ((196608 & i) == 0) {
            i5 = i4 | 90112;
        }
        if ((1572864 & i) == 0) {
            i5 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        if (bveVarC.I((4793491 & i5) != 4793490, i5 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            defpackage.ccz cczVarAs = null;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                defpackage.cgc cgcVar = defpackage.cgf.e;
                long jF = defpackage.kfp.i(bveVarC).F();
                jA = defpackage.ksx.a(defpackage.kfp.i(bveVarC), jF);
                jZ = defpackage.kfp.i(bveVarC).z();
                cgfVar3 = cgcVar;
                j7 = jF;
                f3 = 24.0f;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar;
                f3 = f;
                j7 = j;
                jA = j2;
                jZ = j3;
            }
            bveVarC.l();
            if (ghIcon == null) {
                bveVarC.v(-1087929762);
            } else {
                bveVarC.v(-1087901831);
                cczVarAs = defpackage.dai.as(2011136488, true, new defpackage.klc(ghIcon, 17), bveVarC);
            }
            bwcVar.Y(false);
            bveVar2 = bveVarC;
            i(cczVarAs, ghIcon2, cgfVar3, (!z || ghIcon == null || ghIcon.b == 7) ? defpackage.bcw.a : defpackage.cky.a, f3, j7, jA, jZ, false, 0L, false, bveVar2, i5 & 58352, 0, 1792);
            cgfVar2 = cgfVar3;
            f2 = f3;
            j4 = j7;
            j5 = jA;
            j6 = jZ;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar2 = cgfVar;
            f2 = f;
            j4 = j;
            j5 = j2;
            j6 = j3;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mcq(ghIcon, ghIcon2, cgfVar2, z, f2, j4, j5, j6, i);
        }
    }

    public static final float l() {
        return defpackage.leh.a.a().f() ? 8.0f : 10.0f;
    }

    public static final float m() {
        return defpackage.leh.a.a().f() ? 4.0f : 8.0f;
    }

    public static final float n() {
        return defpackage.leh.a.a().f() ? 8.0f : 10.0f;
    }

    public static final boolean o(float f, float f2) {
        if (defpackage.dlr.a(f, 304.0f) >= 0) {
            if (defpackage.dlr.a(f2, true != defpackage.lee.a.a().b() ? 190.0f : 180.0f) >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0132  */
    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:103:0x0138  */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0158  */
    /* JADX WARN: Code duplicated, block: B:122:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0185  */
    /* JADX WARN: Code duplicated, block: B:124:0x0187  */
    /* JADX WARN: Code duplicated, block: B:126:0x018b  */
    /* JADX WARN: Code duplicated, block: B:128:0x018e  */
    /* JADX WARN: Code duplicated, block: B:129:0x019b  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01db  */
    /* JADX WARN: Code duplicated, block: B:141:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:157:0x0222  */
    /* JADX WARN: Code duplicated, block: B:160:0x0231  */
    /* JADX WARN: Code duplicated, block: B:161:0x0233  */
    /* JADX WARN: Code duplicated, block: B:164:0x0241  */
    /* JADX WARN: Code duplicated, block: B:165:0x0243  */
    /* JADX WARN: Code duplicated, block: B:168:0x024b  */
    /* JADX WARN: Code duplicated, block: B:169:0x024d  */
    /* JADX WARN: Code duplicated, block: B:180:0x026d  */
    /* JADX WARN: Code duplicated, block: B:181:0x026f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0281  */
    /* JADX WARN: Code duplicated, block: B:190:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:193:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0127  */
    /* JADX WARN: Code duplicated, block: B:98:0x012c  */
    public static final void p(defpackage.bby bbyVar, boolean z, int i, java.util.List list, java.util.List list2, defpackage.affc affcVar, defpackage.affg affgVar, defpackage.affg affgVar2, int i2, int i3, defpackage.oqk oqkVar, defpackage.bve bveVar, int i4, int i5, int i6) {
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        defpackage.oqk oqkVar2;
        int i13;
        defpackage.bxl bxlVarJ;
        int i14;
        defpackage.bwc bwcVar;
        int i15;
        defpackage.oqk oqkVarA;
        int i16;
        defpackage.bys bysVarC;
        defpackage.bys bysVarC2;
        int i17;
        boolean z4;
        boolean z5;
        boolean zC;
        boolean z6;
        java.lang.Object objS;
        int i18;
        defpackage.bys bysVar;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        java.lang.Object objS2;
        defpackage.oqk oqkVar3;
        int i19;
        boolean zE;
        bbyVar.getClass();
        list.getClass();
        list2.getClass();
        affcVar.getClass();
        affgVar.getClass();
        affgVar2.getClass();
        int i20 = i4 & 6;
        defpackage.bve bveVarC = bveVar.c(1632714778);
        if (i20 == 0) {
            i7 = (true != bveVarC.C(bbyVar) ? 2 : 4) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            z2 = z;
            i7 |= true != bveVarC.D(z2) ? 16 : 32;
        } else {
            z2 = z;
        }
        if ((i4 & 384) == 0) {
            i8 = i;
            i7 |= true != bveVarC.A(i8) ? 128 : 256;
        } else {
            i8 = i;
        }
        if ((i4 & 3072) == 0) {
            i7 |= true != ((i4 & 4096) == 0 ? bveVarC.C(list) : bveVarC.E(list)) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i7 |= true != ((32768 & i4) == 0 ? bveVarC.C(list2) : bveVarC.E(list2)) ? 8192 : 16384;
        }
        if ((196608 & i4) == 0) {
            i7 |= true != bveVarC.E(affcVar) ? 65536 : 131072;
        }
        if ((1572864 & i4) == 0) {
            i7 |= true != bveVarC.E(affgVar) ? 524288 : 1048576;
        }
        if ((12582912 & i4) == 0) {
            i7 |= true != bveVarC.E(affgVar2) ? 4194304 : 8388608;
        }
        int i21 = i6 & 256;
        if (i21 != 0) {
            i7 |= 100663296;
        } else if ((i4 & 100663296) == 0) {
            i7 |= true != bveVarC.A(i2) ? 33554432 : 67108864;
        }
        int i22 = i6 & 512;
        if (i22 == 0) {
            i9 = i3;
            if ((i4 & 805306368) == 0) {
                i7 |= true != bveVarC.A(i9) ? 268435456 : 536870912;
            }
            if ((i5 & 6) == 0) {
                if ((i6 & 1024) != 0) {
                    i19 = 2;
                } else {
                    if ((i5 & 8) == 0) {
                        zE = bveVarC.C(oqkVar);
                    } else {
                        zE = bveVarC.E(oqkVar);
                    }
                    if (zE) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                }
                i10 = i5 | i19;
            } else {
                i10 = i5;
            }
            i11 = i10;
            if ((i7 & 306783379) == 306783378 || (i11 & 3) != 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i7 & 1)) {
                i14 = i6 & 1024;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i4 & 1) != 0 || bveVarC.F()) {
                    if (i21 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i2;
                    }
                    if (i22 != 0) {
                        i9 = 0;
                    }
                    if (i14 != 0) {
                        oqkVarA = defpackage.oqk.a.a();
                        i16 = i15;
                        i11 &= -15;
                    } else {
                        oqkVarA = oqkVar;
                        i16 = i15;
                    }
                } else {
                    bveVarC.s();
                    if (i14 != 0) {
                        i16 = i2;
                        oqkVarA = oqkVar;
                        i11 &= -15;
                    } else {
                        i16 = i2;
                        oqkVarA = oqkVar;
                    }
                }
                bveVarC.l();
                bysVarC = defpackage.bzd.c(list2, bveVarC);
                bysVarC2 = defpackage.bzd.c(java.lang.Integer.valueOf(i8), bveVarC);
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
                i17 = i9;
                if ((i7 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z14 = z4;
                if ((i7 & 14) == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zC = z14 | z5 | bveVarC.C(bysVarC2);
                boolean z15 = z5;
                if ((i7 & 234881024) == 67108864) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objS = bwcVar.S();
                if ((!z6 && !zC) || objS == defpackage.bvd.a) {
                    i18 = 2048;
                    mwc mwcVar = new mwc(z, bbyVar, i16, bysVarC2, (defpackage.afdk) null);
                    bysVar = bysVarC2;
                    bwcVar.ad(mwcVar);
                    objS = mwcVar;
                } else {
                    bysVar = bysVarC2;
                    i18 = 2048;
                }
                defpackage.bvx.g(boolValueOf, (defpackage.affg) objS, bveVarC);
                java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(bbyVar.i());
                if ((i7 & 7168) != i18 || ((i7 & 4096) != 0 && bveVarC.E(list))) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zC2 = z15 | z7 | bveVarC.C(bysVarC);
                if ((3670016 & i7) == 1048576) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zC3 = zC2 | z8 | bveVarC.C(bysVar);
                if ((458752 & i7) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((1879048192 & i7) == 536870912) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = (((i11 & 14) ^ 6) <= 4 && bveVarC.E(oqkVarA)) || (i11 & 6) == 4;
                z12 = zC3 | z9 | z10;
                if ((29360128 & i7) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objS2 = bwcVar.S();
                if ((!(z11 | z12) && !z13) || objS2 == defpackage.bvd.a) {
                    i9 = i17;
                    oqkVar3 = oqkVarA;
                    mwd mwdVar = new mwd(bbyVar, list, affgVar, affcVar, i9, oqkVar3, affgVar2, bysVarC, bysVar, (defpackage.afdk) null);
                    bwcVar.ad(mwdVar);
                    objS2 = mwdVar;
                } else {
                    i9 = i17;
                    oqkVar3 = oqkVarA;
                }
                defpackage.bvx.f(list, boolValueOf2, (defpackage.affg) objS2, bveVarC);
                oqkVar2 = oqkVar3;
                i12 = i16;
            } else {
                bveVarC.s();
                i12 = i2;
                oqkVar2 = oqkVar;
            }
            i13 = i9;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mwb(bbyVar, z, i, list, list2, affcVar, affgVar, affgVar2, i12, i13, oqkVar2, i4, i5, i6);
            }
        }
        i7 |= 805306368;
        i9 = i3;
        if ((i5 & 6) == 0) {
            if ((i6 & 1024) != 0) {
                i19 = 2;
            } else {
                if ((i5 & 8) == 0) {
                    zE = bveVarC.C(oqkVar);
                } else {
                    zE = bveVarC.E(oqkVar);
                }
                if (zE) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
            }
            i10 = i5 | i19;
        } else {
            i10 = i5;
        }
        i11 = i10;
        if ((i7 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (bveVarC.I(z3, i7 & 1)) {
            i14 = i6 & 1024;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i4 & 1) != 0) {
                if (i21 != 0) {
                    i15 = 0;
                } else {
                    i15 = i2;
                }
                if (i22 != 0) {
                    i9 = 0;
                }
                if (i14 != 0) {
                    oqkVarA = defpackage.oqk.a.a();
                    i16 = i15;
                    i11 &= -15;
                } else {
                    oqkVarA = oqkVar;
                    i16 = i15;
                }
            } else {
                if (i21 != 0) {
                    i15 = 0;
                } else {
                    i15 = i2;
                }
                if (i22 != 0) {
                    i9 = 0;
                }
                if (i14 != 0) {
                    oqkVarA = defpackage.oqk.a.a();
                    i16 = i15;
                    i11 &= -15;
                } else {
                    oqkVarA = oqkVar;
                    i16 = i15;
                }
            }
            bveVarC.l();
            bysVarC = defpackage.bzd.c(list2, bveVarC);
            bysVarC2 = defpackage.bzd.c(java.lang.Integer.valueOf(i8), bveVarC);
            java.lang.Boolean boolValueOf3 = java.lang.Boolean.valueOf(z2);
            i17 = i9;
            if ((i7 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z16 = z4;
            if ((i7 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            zC = z16 | z5 | bveVarC.C(bysVarC2);
            boolean z17 = z5;
            if ((i7 & 234881024) == 67108864) {
                z6 = true;
            } else {
                z6 = false;
            }
            objS = bwcVar.S();
            if (!z6 && !zC) {
                i18 = 2048;
                mwc mwcVar2 = new mwc(z, bbyVar, i16, bysVarC2, (defpackage.afdk) null);
                bysVar = bysVarC2;
                bwcVar.ad(mwcVar2);
                objS = mwcVar2;
            } else {
                i18 = 2048;
                mwc mwcVar3 = new mwc(z, bbyVar, i16, bysVarC2, (defpackage.afdk) null);
                bysVar = bysVarC2;
                bwcVar.ad(mwcVar3);
                objS = mwcVar3;
            }
            defpackage.bvx.g(boolValueOf3, (defpackage.affg) objS, bveVarC);
            java.lang.Boolean boolValueOf4 = java.lang.Boolean.valueOf(bbyVar.i());
            if ((i7 & 7168) != i18) {
                z7 = true;
            } else {
                z7 = true;
            }
            boolean zC4 = z17 | z7 | bveVarC.C(bysVarC);
            if ((3670016 & i7) == 1048576) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean zC5 = zC4 | z8 | bveVarC.C(bysVar);
            if ((458752 & i7) == 131072) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((1879048192 & i7) == 536870912) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((i11 & 14) ^ 6) <= 4) {
            }
            z12 = zC5 | z9 | z10;
            if ((29360128 & i7) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            objS2 = bwcVar.S();
            if (!(z11 | z12) && !z13) {
                i9 = i17;
                oqkVar3 = oqkVarA;
                mwd mwdVar2 = new mwd(bbyVar, list, affgVar, affcVar, i9, oqkVar3, affgVar2, bysVarC, bysVar, (defpackage.afdk) null);
                bwcVar.ad(mwdVar2);
                objS2 = mwdVar2;
            } else {
                i9 = i17;
                oqkVar3 = oqkVarA;
                mwd mwdVar3 = new mwd(bbyVar, list, affgVar, affcVar, i9, oqkVar3, affgVar2, bysVarC, bysVar, (defpackage.afdk) null);
                bwcVar.ad(mwdVar3);
                objS2 = mwdVar3;
            }
            defpackage.bvx.f(list, boolValueOf4, (defpackage.affg) objS2, bveVarC);
            oqkVar2 = oqkVar3;
            i12 = i16;
        } else {
            bveVarC.s();
            i12 = i2;
            oqkVar2 = oqkVar;
        }
        i13 = i9;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mwb(bbyVar, z, i, list, list2, affcVar, affgVar, affgVar2, i12, i13, oqkVar2, i4, i5, i6);
        }
    }

    public static final java.util.List q(java.util.List list, float f, float f2, defpackage.bve bveVar) {
        list.getClass();
        boolean zC = bveVar.C(list) | bveVar.z(f) | bveVar.z(f2);
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo = ((oqu) obj).b;
                if (appWidgetProviderInfo != null && (defpackage.mvm.x(appWidgetProviderInfo) > f || defpackage.mvm.w(appWidgetProviderInfo) > f2)) {
                    arrayList2.add(obj);
                } else {
                    arrayList.add(obj);
                }
            }
            java.lang.Object afauVar = new defpackage.afau(arrayList, arrayList2);
            bveVar.x(afauVar);
            objG = afauVar;
        }
        defpackage.afau afauVar2 = (defpackage.afau) objG;
        java.util.List list2 = (java.util.List) afauVar2.a;
        java.util.List list3 = (java.util.List) afauVar2.b;
        java.lang.Float fValueOf = java.lang.Float.valueOf(f);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(f2);
        boolean zE = bveVar.E(list3) | bveVar.z(f) | bveVar.z(f2);
        java.lang.Object objG2 = bveVar.g();
        if (zE || objG2 == defpackage.bvd.a) {
            objG2 = new mwe(list3, f, f2, (defpackage.afdk) null);
            bveVar.x(objG2);
        }
        defpackage.bvx.e(list3, fValueOf, fValueOf2, (defpackage.affg) objG2, bveVar);
        return list2;
    }

    public static final boolean r(defpackage.bby bbyVar, int i, defpackage.bve bveVar) {
        bbyVar.getClass();
        boolean z = (bbyVar.i() || ((java.lang.Boolean) defpackage.bxi.m(defpackage.muj.h.a().b(), java.lang.Boolean.FALSE, bveVar).a()).booleanValue()) && i > 1;
        java.lang.Object objG = bveVar.g();
        java.lang.Object obj = defpackage.bvd.a;
        if (objG == obj) {
            java.lang.Object parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z), defpackage.bxv.c);
            bveVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        defpackage.bwx bwxVar = (defpackage.bwx) objG;
        java.lang.Object objG2 = bveVar.g();
        if (objG2 == obj) {
            java.lang.Object xzgVar = new defpackage.xzg((defpackage.xzo) defpackage.ojm.a().b);
            bveVar.x(xzgVar);
            objG2 = xzgVar;
        }
        objG2.getClass();
        defpackage.xzg xzgVar2 = (defpackage.xzg) objG2;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        boolean zD = bveVar.D(z) | bveVar.E(xzgVar2);
        java.lang.Object objG3 = bveVar.g();
        if (zD || objG3 == obj) {
            java.lang.Object faxVar = new fax(z, xzgVar2, bwxVar, (defpackage.afdk) null, 3);
            bveVar.x(faxVar);
            objG3 = faxVar;
        }
        defpackage.bvx.g(boolValueOf, (defpackage.affg) objG3, bveVar);
        return ((java.lang.Boolean) bwxVar.a()).booleanValue();
    }

    public static final void s(float f, float f2, float f3, float f4, float f5, defpackage.bve bveVar, int i) {
        float f6;
        int i2;
        float f7;
        float f8;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(483771738);
        if (i3 == 0) {
            f6 = f;
            i2 = (true != bveVarC.z(f6) ? 2 : 4) | i;
        } else {
            f6 = f;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.z(f2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.z(f3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            f7 = f4;
            i2 |= true != bveVarC.z(f7) ? 1024 : 2048;
        } else {
            f7 = f4;
        }
        if ((i & 24576) == 0) {
            f8 = f5;
            i2 |= true != bveVarC.z(f8) ? 8192 : 16384;
        } else {
            f8 = f5;
        }
        if (bveVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            defpackage.cgf cgfVarC = defpackage.awj.c(defpackage.cgf.e, 1.0f);
            boolean z = (i2 & 7168) == 2048;
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 14) == 4;
            boolean z4 = (i2 & 112) == 32;
            boolean z5 = (i2 & 57344) == 16384;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if ((z3 | z2 | z | z4 | z5) || objS == defpackage.bvd.a) {
                mvx mvxVar = new mvx(f7, f3, f6, f2, f8);
                bwcVar.ad(mvxVar);
                objS = mvxVar;
            }
            defpackage.afw.z(cgfVarC, (defpackage.affc) objS, bveVarC, 6);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mvy(f, f2, f3, f4, f5, i);
        }
    }

    public static final void t(java.lang.String str, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1015477890);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.bqv.b(null, defpackage.bcw.b(12.0f), -4294967296L, 0L, 4.0f, defpackage.afw.B(1.0f, -59604181744353280L), defpackage.dai.as(760091197, true, new defpackage.mjl(str, 17), bveVarC), bveVarC, 25);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kky(str, cgfVar, i, 19);
        }
    }

    public static final void u(defpackage.cgf cgfVar, int i, int i2, nfd nfdVar, defpackage.bve bveVar, int i3) {
        int i4;
        int i5;
        int i6;
        nfd nfdVar2;
        nfd nfdVar3;
        int i7;
        int i8;
        int i9;
        defpackage.bys bysVarM;
        int i10;
        defpackage.bys bysVarM2;
        java.lang.CharSequence charSequence;
        defpackage.bve bveVarC = bveVar.c(-677535448);
        if ((i3 & 6) == 0) {
            i4 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        int i11 = i4 | 432;
        if ((i3 & 3072) == 0) {
            i11 = i4 | 1456;
        }
        if (bveVarC.I((i11 & 1171) != 1170, i11 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i3 & 1) == 0 || bveVarC.F()) {
                defpackage.bvm bvmVar = defpackage.esn.a;
                defpackage.esa esaVarA = defpackage.esn.a(bveVarC);
                if (esaVarA == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                nfdVar3 = (nfd) defpackage.ebl.l(defpackage.afgw.b(nfd.class), esaVarA, null, null, defpackage.edd.f(esaVarA));
                i7 = i11 & (-7169);
                i8 = 4000;
                i9 = 600000;
            } else {
                i7 = i11 & (-7169);
                bveVarC.s();
                i9 = i;
                i8 = i2;
                nfdVar3 = nfdVar;
            }
            bveVarC.l();
            defpackage.afbk afbkVar = defpackage.afbk.a;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = new defpackage.dxd((defpackage.afdk) null, 4, (int[]) null);
                bwcVar.ad(objS);
            }
            defpackage.bvx.g(afbkVar, (defpackage.affg) objS, bveVarC);
            defpackage.eqp eqpVar = nfdVar3.c;
            java.lang.String resourceEntryName = "";
            if (eqpVar == null) {
                bveVarC.v(1888286461);
                bwcVar.Y(false);
                bysVarM = null;
            } else {
                bveVarC.v(1723480452);
                bysVarM = defpackage.bxi.m(eqpVar, "", bveVarC);
                bwcVar.Y(false);
            }
            java.lang.CharSequence charSequence2 = (bysVarM == null || (charSequence = (java.lang.CharSequence) bysVarM.a()) == null) ? "" : charSequence;
            defpackage.eqp eqpVar2 = nfdVar3.b;
            bveVarC.v(1723485159);
            defpackage.bys bysVarM3 = defpackage.bxi.m(eqpVar2, java.lang.Boolean.FALSE, bveVarC);
            bwcVar.Y(false);
            boolean zBooleanValue = bysVarM3 != null ? ((java.lang.Boolean) bysVarM3.a()).booleanValue() : false;
            defpackage.eqp eqpVar3 = nfdVar3.f;
            if (eqpVar3 == null) {
                bveVarC.v(1888588153);
                bwcVar.Y(false);
                i10 = 2131231294;
                bysVarM2 = null;
            } else {
                i10 = 2131231294;
                bveVarC.v(1723490184);
                bysVarM2 = defpackage.bxi.m(eqpVar3, 2131231294, bveVarC);
                bwcVar.Y(false);
            }
            int iIntValue = bysVarM2 != null ? ((java.lang.Number) bysVarM2.a()).intValue() : i10;
            boolean zA = bveVarC.A(iIntValue);
            java.lang.Object objS2 = bwcVar.S();
            if (zA || objS2 == obj) {
                try {
                    resourceEntryName = defpackage.mkp.a.c.getResources().getResourceEntryName(iIntValue);
                } catch (java.lang.Exception unused) {
                }
                resourceEntryName.getClass();
                objS2 = java.lang.Boolean.valueOf(afzh.u(resourceEntryName, "rain", false) || afzh.u(resourceEntryName, "drizzle", false) || afzh.u(resourceEntryName, "shower", false) || afzh.u(resourceEntryName, "thunderstorm", false));
                bwcVar.ad(objS2);
            }
            boolean zBooleanValue2 = ((java.lang.Boolean) objS2).booleanValue();
            defpackage.afo afoVarL = defpackage.afw.l(bveVarC);
            boolean z = (i7 & 112) == 32;
            boolean z2 = (i7 & 896) == 256;
            java.lang.Object objS3 = bwcVar.S();
            if ((z2 | z) || objS3 == defpackage.bvd.a) {
                objS3 = new mfj(i9, i8, 2);
                bwcVar.ad(objS3);
            }
            defpackage.bys bysVarK = defpackage.afw.k(afoVarL, -0.3f, 1.3f, defpackage.ca.G(defpackage.ca.E((defpackage.affc) objS3), 1, 4), bveVarC, 29064);
            defpackage.aez aezVar = defpackage.afc.d;
            defpackage.ca.at(defpackage.dai.y(defpackage.awj.c(cgfVar, 1.0f), "jimothy"), null, defpackage.dai.as(542018046, true, new mvw(zBooleanValue, iIntValue, charSequence2, zBooleanValue2, defpackage.afw.k(afoVarL, -1.0f, 1.0f, defpackage.ca.G(defpackage.ca.F(150, 0, aezVar, 2), 2, 4), bveVarC, 29064), defpackage.afw.k(afoVarL, -15.0f, 15.0f, defpackage.ca.G(defpackage.ca.F(200, 0, aezVar, 2), 2, 4), bveVarC, 29064), bysVarK, defpackage.afw.k(afoVarL, 0.0f, 1.0f, defpackage.ca.G(defpackage.ca.F(600, 0, aezVar, 2), 1, 4), bveVarC, 29112)), bveVarC), bveVarC, 3072, 6);
            bveVarC = bveVarC;
            i5 = i9;
            i6 = i8;
            nfdVar2 = nfdVar3;
        } else {
            bveVarC.s();
            i5 = i;
            i6 = i2;
            nfdVar2 = nfdVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new hbr(cgfVar, i5, i6, nfdVar2, i3, 3);
        }
    }

    public static void v(odl odlVar, defpackage.zbd zbdVar) {
        defpackage.omf.u().o(((odd) odlVar).g.g, zbdVar);
    }

    public static ocv w(ocs ocsVar) {
        return new ocv(ocsVar.a(1.0f).c);
    }

    public static final boolean x() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        str.getClass();
        return afzh.u(str, "samsung", true);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void y(nvb nvbVar, int i, boolean z, defpackage.cgf cgfVar, defpackage.bve bveVar, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        boolean z2;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar3;
        defpackage.ccz cczVarAs;
        defpackage.bwc bwcVar;
        defpackage.afer aferVar;
        int i5 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(2145729612);
        if (i5 == 0) {
            i4 = (true != bveVarC.E(nvbVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != bveVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != bveVarC.D(z) ? 128 : 256;
        }
        int i6 = i3 & 8;
        if (i6 == 0) {
            if ((i2 & 3072) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 1024 : 2048;
            }
            if ((i4 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bveVarC.I(z2, i4 & 1)) {
                if (i6 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                cczVarAs = defpackage.dai.as(219581421, true, new nyt(nvbVar, nvbVar.a, defpackage.lee.a.a().b(), z, i, 1), bveVarC);
                if (nvbVar.e == 6) {
                    bveVarC.v(1434326497);
                    defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
                    bwcVar = (defpackage.bwc) bveVarC;
                    int iF = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh = bwcVar.ah();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar3);
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                    defpackage.byw.b(bveVarC, defpackage.cwl.g);
                    defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                    defpackage.ats atsVar = defpackage.ats.a;
                    defpackage.cgc cgcVar = defpackage.cgf.e;
                    defpackage.atp.c(defpackage.lyd.z(atsVar.b(cgcVar), bveVarC), bveVarC, 0);
                    cczVarAs.invoke(defpackage.awj.r(cgcVar), bveVarC, 54);
                    bwcVar.Y(true);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(1434476630);
                    cczVarAs.invoke(cgfVar3, bveVarC, java.lang.Integer.valueOf(((i4 >> 9) & 14) | 48));
                    ((defpackage.bwc) bveVarC).Y(false);
                }
                cgfVar2 = cgfVar3;
            } else {
                bveVarC.s();
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new nys(nvbVar, i, z, cgfVar2, i2, i3);
            }
        }
        i4 |= 3072;
        cgfVar2 = cgfVar;
        if ((i4 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bveVarC.I(z2, i4 & 1)) {
            if (i6 != 0) {
                cgfVar3 = defpackage.cgf.e;
            } else {
                cgfVar3 = cgfVar2;
            }
            cczVarAs = defpackage.dai.as(219581421, true, new nyt(nvbVar, nvbVar.a, defpackage.lee.a.a().b(), z, i, 1), bveVarC);
            if (nvbVar.e == 6) {
                bveVarC.v(1434326497);
                defpackage.cty ctyVarB2 = defpackage.atp.b(defpackage.cfs.a, false);
                bwcVar = (defpackage.bwc) bveVarC;
                int iF2 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh2 = bwcVar.ah();
                defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVar3);
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB2, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh2, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN2, defpackage.cwl.c);
                defpackage.ats atsVar2 = defpackage.ats.a;
                defpackage.cgc cgcVar2 = defpackage.cgf.e;
                defpackage.atp.c(defpackage.lyd.z(atsVar2.b(cgcVar2), bveVarC), bveVarC, 0);
                cczVarAs.invoke(defpackage.awj.r(cgcVar2), bveVarC, 54);
                bwcVar.Y(true);
                bwcVar.Y(false);
            } else {
                bveVarC.v(1434476630);
                cczVarAs.invoke(cgfVar3, bveVarC, java.lang.Integer.valueOf(((i4 >> 9) & 14) | 48));
                ((defpackage.bwc) bveVarC).Y(false);
            }
            cgfVar2 = cgfVar3;
        } else {
            bveVarC.s();
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nys(nvbVar, i, z, cgfVar2, i2, i3);
        }
    }

    public static final void z(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2, defpackage.nve nveVar, defpackage.afer aferVar, defpackage.afer aferVar2, boolean z, int i, boolean z2, java.util.List list, boolean z3, boolean z4, boolean z5, defpackage.cgf cgfVar, defpackage.bve bveVar, int i2, int i3) {
        int i4;
        java.lang.String str4;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon3;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon4;
        defpackage.afer aferVar3;
        int i5;
        defpackage.cgf cgfVar2;
        defpackage.bve bveVar2;
        defpackage.nve nveVar2;
        int i6 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(42444634);
        if (i6 == 0) {
            i4 = (true != bveVarC.C(str) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str4 = str2;
            i4 |= true != bveVarC.C(str4) ? 16 : 32;
        } else {
            str4 = str2;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != bveVarC.C(str3) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            ghIcon3 = ghIcon;
            i4 |= true != bveVarC.C(ghIcon3) ? 1024 : 2048;
        } else {
            ghIcon3 = ghIcon;
        }
        if ((i2 & 24576) == 0) {
            ghIcon4 = ghIcon2;
            i4 |= true != bveVarC.C(ghIcon4) ? 8192 : 16384;
        } else {
            ghIcon4 = ghIcon2;
        }
        if ((i2 & 196608) == 0) {
            i4 |= true != bveVarC.A(nveVar.ordinal()) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            aferVar3 = aferVar;
            i4 |= true != bveVarC.E(aferVar3) ? 524288 : 1048576;
        } else {
            aferVar3 = aferVar;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != bveVarC.E(aferVar2) ? 4194304 : 8388608;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= true != bveVarC.D(z) ? 33554432 : 67108864;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= true != bveVarC.A(i) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (true != bveVarC.D(z2) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != ((i3 & 64) == 0 ? bveVarC.C(list) : bveVarC.E(list)) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true == bveVarC.D(z3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= true == bveVarC.D(z4) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= true == bveVarC.D(z5) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= true == bveVarC.C(cgfVar) ? 131072 : 65536;
        }
        int i7 = i5;
        if (bveVarC.I(((306783379 & i4) == 306783378 && (i7 & 74899) == 74898) ? false : true, i4 & 1)) {
            java.util.Iterator it = list.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                nvb nvbVar = (nvb) it.next();
                if ((nvbVar != null ? nvbVar.c : null) != null && (nvbVar.b != null || nvbVar.a != null)) {
                    i8++;
                }
            }
            boolean z6 = i8 > 1;
            defpackage.bys bysVarA = defpackage.aef.a(z3 ? 42.0f : 8.0f, null, null, null, bveVarC, 0, 14);
            defpackage.bys bysVarA2 = defpackage.aef.a(z4 ? 42.0f : 8.0f, null, null, null, bveVarC, 0, 14);
            defpackage.bcr bcrVarC = defpackage.bcw.c(((defpackage.dlr) bysVarA.a()).a, ((defpackage.dlr) bysVarA.a()).a, ((defpackage.dlr) bysVarA2.a()).a, ((defpackage.dlr) bysVarA2.a()).a);
            nyx nyxVar = new nyx(aferVar2, bcrVarC, z6, list, z5, i8, str4, ghIcon3, ghIcon4, aferVar3, i, z3, str, z2, z, str3, nveVar, bysVarA, bysVarA2);
            bveVar2 = bveVarC;
            defpackage.ccz cczVarAs = defpackage.dai.as(15515666, true, nyxVar, bveVar2);
            nveVar2 = nveVar;
            if (nveVar2 == defpackage.nve.k) {
                bveVar2.v(1751960974);
                defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
                defpackage.bwc bwcVar = (defpackage.bwc) bveVar2;
                int iF = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh = bwcVar.ah();
                cgfVar2 = cgfVar;
                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgfVar2);
                defpackage.afer aferVar4 = defpackage.cwl.a;
                bveVar2.w();
                if (bwcVar.t) {
                    bveVar2.j(aferVar4);
                } else {
                    bveVar2.y();
                }
                defpackage.byw.c(bveVar2, ctyVarB, defpackage.cwl.e);
                defpackage.byw.c(bveVar2, cddVarAh, defpackage.cwl.d);
                defpackage.byw.c(bveVar2, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                defpackage.byw.b(bveVar2, defpackage.cwl.g);
                defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
                defpackage.ats atsVar = defpackage.ats.a;
                defpackage.cgc cgcVar = defpackage.cgf.e;
                defpackage.atp.c(defpackage.lyd.y(atsVar.b(cgcVar), bcrVarC, bveVar2), bveVar2, 0);
                cczVarAs.invoke(cgcVar, bveVar2, 54);
                bwcVar.Y(true);
                bwcVar.Y(false);
            } else {
                cgfVar2 = cgfVar;
                bveVar2.v(1752116098);
                cczVarAs.invoke(cgfVar2, bveVar2, java.lang.Integer.valueOf(((i7 >> 15) & 14) | 48));
                ((defpackage.bwc) bveVar2).Y(false);
            }
        } else {
            cgfVar2 = cgfVar;
            bveVar2 = bveVarC;
            nveVar2 = nveVar;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nyy(str, str2, str3, ghIcon, ghIcon2, nveVar2, aferVar, aferVar2, z, i, z2, list, z3, z4, z5, cgfVar2, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:72:0x0108  */
    /* JADX WARN: Code duplicated, block: B:73:0x013e  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x018b  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0086, please report this as an issue */
    public final void c(java.lang.String str, defpackage.cgf cgfVar, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, long j, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2;
        int i5;
        long jS;
        boolean z;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar3;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon3;
        long j2;
        defpackage.bxl bxlVarJ;
        int i6;
        defpackage.bwc bwcVar;
        defpackage.afer aferVar;
        defpackage.bwc bwcVar2;
        int i7;
        str.getClass();
        int i8 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1972795325);
        if (i8 == 0) {
            i3 = (true != bveVarC.C(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    ghIcon2 = ghIcon;
                    if (true != bveVarC.C(ghIcon2)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    i7 = 1024;
                    if ((i2 & 8) == 0) {
                        jS = j;
                        if (bveVarC.B(jS)) {
                            i7 = 2048;
                        }
                    } else {
                        jS = j;
                    }
                    i3 |= i7;
                } else {
                    jS = j;
                }
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    i6 = i2 & 8;
                    bwcVar = (defpackage.bwc) bveVarC;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i & 1) != 0 || bveVarC.F()) {
                        if (i9 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar2;
                        }
                        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon4 = i4 == 0 ? ghIcon2 : null;
                        if (i6 != 0) {
                            i3 &= -7169;
                            jS = defpackage.kfp.i(bveVarC).S();
                        }
                        ghIcon2 = ghIcon4;
                    } else {
                        bveVarC.s();
                        if (i6 != 0) {
                            i3 &= -7169;
                        }
                        cgfVar3 = cgfVar2;
                    }
                    bveVarC.l();
                    defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
                    int iF = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh = bwcVar.ah();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar3);
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                    defpackage.byw.b(bveVarC, defpackage.cwl.g);
                    defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                    if (ghIcon2 != null) {
                        bveVarC.v(332053922);
                        defpackage.cne cneVarF = defpackage.lgo.f(ghIcon2, 0.0f, bveVarC, 3);
                        defpackage.cgc cgcVar = defpackage.cgf.e;
                        long j3 = jS;
                        bwcVar2 = bwcVar;
                        defpackage.boh.a(cneVarF, null, defpackage.awj.i(cgcVar, 28.0f), j3, bveVarC, (i3 & 7168) | 440, 0);
                        jS = j3;
                        defpackage.asq.A(defpackage.awj.m(cgcVar, 10.0f), bveVarC);
                        bwcVar2.Y(false);
                    } else {
                        bwcVar2 = bwcVar;
                        bveVarC.v(332275913);
                        bwcVar2.Y(false);
                    }
                    bveVar2 = bveVarC;
                    defpackage.brv.b(str, null, jS, 0L, null, 0L, null, 0L, 2, false, 1, 0, defpackage.bxi.p(bveVarC).l, bveVar2, (i3 & 14) | ((i3 >> 3) & 896), 24960, 110586);
                    bwcVar2.Y(true);
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar3 = cgfVar2;
                }
                ghIcon3 = ghIcon2;
                j2 = jS;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new mcn(this, str, cgfVar3, ghIcon3, j2, i, i2);
                }
            }
            i3 |= 384;
            ghIcon2 = ghIcon;
            if ((i & 3072) == 0) {
                i7 = 1024;
                if ((i2 & 8) == 0) {
                    jS = j;
                    if (bveVarC.B(jS)) {
                        i7 = 2048;
                    }
                } else {
                    jS = j;
                }
                i3 |= i7;
            } else {
                jS = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                i6 = i2 & 8;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        i3 &= -7169;
                        jS = defpackage.kfp.i(bveVarC).S();
                    }
                    ghIcon2 = ghIcon4;
                } else {
                    if (i9 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        i3 &= -7169;
                        jS = defpackage.kfp.i(bveVarC).S();
                    }
                    ghIcon2 = ghIcon4;
                }
                bveVarC.l();
                defpackage.cty ctyVarA2 = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
                int iF2 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh2 = bwcVar.ah();
                defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVar3);
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA2, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh2, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN2, defpackage.cwl.c);
                if (ghIcon2 != null) {
                    bveVarC.v(332053922);
                    defpackage.cne cneVarF2 = defpackage.lgo.f(ghIcon2, 0.0f, bveVarC, 3);
                    defpackage.cgc cgcVar2 = defpackage.cgf.e;
                    long j4 = jS;
                    bwcVar2 = bwcVar;
                    defpackage.boh.a(cneVarF2, null, defpackage.awj.i(cgcVar2, 28.0f), j4, bveVarC, (i3 & 7168) | 440, 0);
                    jS = j4;
                    defpackage.asq.A(defpackage.awj.m(cgcVar2, 10.0f), bveVarC);
                    bwcVar2.Y(false);
                } else {
                    bwcVar2 = bwcVar;
                    bveVarC.v(332275913);
                    bwcVar2.Y(false);
                }
                bveVar2 = bveVarC;
                defpackage.brv.b(str, null, jS, 0L, null, 0L, null, 0L, 2, false, 1, 0, defpackage.bxi.p(bveVarC).l, bveVar2, (i3 & 14) | ((i3 >> 3) & 896), 24960, 110586);
                bwcVar2.Y(true);
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar3 = cgfVar2;
            }
            ghIcon3 = ghIcon2;
            j2 = jS;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mcn(this, str, cgfVar3, ghIcon3, j2, i, i2);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                ghIcon2 = ghIcon;
                if (true != bveVarC.C(ghIcon2)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i7 = 1024;
                if ((i2 & 8) == 0) {
                    jS = j;
                    if (bveVarC.B(jS)) {
                        i7 = 2048;
                    }
                } else {
                    jS = j;
                }
                i3 |= i7;
            } else {
                jS = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                i6 = i2 & 8;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        i3 &= -7169;
                        jS = defpackage.kfp.i(bveVarC).S();
                    }
                    ghIcon2 = ghIcon4;
                } else {
                    if (i9 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        i3 &= -7169;
                        jS = defpackage.kfp.i(bveVarC).S();
                    }
                    ghIcon2 = ghIcon4;
                }
                bveVarC.l();
                defpackage.cty ctyVarA3 = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
                int iF3 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh3 = bwcVar.ah();
                defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVar3);
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA3, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh3, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF3), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN3, defpackage.cwl.c);
                if (ghIcon2 != null) {
                    bveVarC.v(332053922);
                    defpackage.cne cneVarF3 = defpackage.lgo.f(ghIcon2, 0.0f, bveVarC, 3);
                    defpackage.cgc cgcVar3 = defpackage.cgf.e;
                    long j5 = jS;
                    bwcVar2 = bwcVar;
                    defpackage.boh.a(cneVarF3, null, defpackage.awj.i(cgcVar3, 28.0f), j5, bveVarC, (i3 & 7168) | 440, 0);
                    jS = j5;
                    defpackage.asq.A(defpackage.awj.m(cgcVar3, 10.0f), bveVarC);
                    bwcVar2.Y(false);
                } else {
                    bwcVar2 = bwcVar;
                    bveVarC.v(332275913);
                    bwcVar2.Y(false);
                }
                bveVar2 = bveVarC;
                defpackage.brv.b(str, null, jS, 0L, null, 0L, null, 0L, 2, false, 1, 0, defpackage.bxi.p(bveVarC).l, bveVar2, (i3 & 14) | ((i3 >> 3) & 896), 24960, 110586);
                bwcVar2.Y(true);
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar3 = cgfVar2;
            }
            ghIcon3 = ghIcon2;
            j2 = jS;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mcn(this, str, cgfVar3, ghIcon3, j2, i, i2);
            }
        }
        i3 |= 384;
        ghIcon2 = ghIcon;
        if ((i & 3072) == 0) {
            i7 = 1024;
            if ((i2 & 8) == 0) {
                jS = j;
                if (bveVarC.B(jS)) {
                    i7 = 2048;
                }
            } else {
                jS = j;
            }
            i3 |= i7;
        } else {
            jS = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i3 & 1)) {
            i6 = i2 & 8;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                if (i4 == 0) {
                }
                if (i6 != 0) {
                    i3 &= -7169;
                    jS = defpackage.kfp.i(bveVarC).S();
                }
                ghIcon2 = ghIcon4;
            } else {
                if (i9 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                if (i4 == 0) {
                }
                if (i6 != 0) {
                    i3 &= -7169;
                    jS = defpackage.kfp.i(bveVarC).S();
                }
                ghIcon2 = ghIcon4;
            }
            bveVarC.l();
            defpackage.cty ctyVarA4 = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
            int iF4 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh4 = bwcVar.ah();
            defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVar3);
            aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA4, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh4, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF4), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN4, defpackage.cwl.c);
            if (ghIcon2 != null) {
                bveVarC.v(332053922);
                defpackage.cne cneVarF4 = defpackage.lgo.f(ghIcon2, 0.0f, bveVarC, 3);
                defpackage.cgc cgcVar4 = defpackage.cgf.e;
                long j6 = jS;
                bwcVar2 = bwcVar;
                defpackage.boh.a(cneVarF4, null, defpackage.awj.i(cgcVar4, 28.0f), j6, bveVarC, (i3 & 7168) | 440, 0);
                jS = j6;
                defpackage.asq.A(defpackage.awj.m(cgcVar4, 10.0f), bveVarC);
                bwcVar2.Y(false);
            } else {
                bwcVar2 = bwcVar;
                bveVarC.v(332275913);
                bwcVar2.Y(false);
            }
            bveVar2 = bveVarC;
            defpackage.brv.b(str, null, jS, 0L, null, 0L, null, 0L, 2, false, 1, 0, defpackage.bxi.p(bveVarC).l, bveVar2, (i3 & 14) | ((i3 >> 3) & 896), 24960, 110586);
            bwcVar2.Y(true);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar3 = cgfVar2;
        }
        ghIcon3 = ghIcon2;
        j2 = jS;
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mcn(this, str, cgfVar3, ghIcon3, j2, i, i2);
        }
    }
}
