package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dtf {
    static android.app.Notification.Builder a(android.app.Notification.Builder builder, android.app.Person person) {
        return hh$.ExternalSyntheticApiModelOutline0.m(builder, person);
    }

    public static void b(android.widget.TextView textView, int i) {
        defpackage.ebl.p(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void c(android.widget.TextView textView, int i, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            axd$.ExternalSyntheticApiModelOutline0.m(textView, i, f);
        } else {
            b(textView, java.lang.Math.round(android.util.TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void d(android.view.ActionMode.Callback callback) {
        if (callback instanceof eeq) {
            throw null;
        }
    }

    public static float e(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return defpackage.eem.a(edgeEffect);
        }
        return 0.0f;
    }

    public static float f(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return defpackage.eem.b(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static android.widget.EdgeEffect g(android.content.Context context, android.util.AttributeSet attributeSet) {
        return android.os.Build.VERSION.SDK_INT >= 31 ? defpackage.eem.c(context, attributeSet) : new android.widget.EdgeEffect(context);
    }

    public static final void h(java.lang.Object obj, defpackage.cgf cgfVar, defpackage.cne cneVar, defpackage.cne cneVar2, defpackage.cne cneVar3, defpackage.affc affcVar, defpackage.cfu cfuVar, defpackage.csr csrVar, float f, defpackage.cke ckeVar, int i, defpackage.bve bveVar, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        defpackage.cfu cfuVar2;
        defpackage.csr csrVar2;
        int i5;
        defpackage.cke ckeVar2;
        defpackage.cne cneVar4;
        int i6;
        defpackage.cne cneVar5;
        int i7;
        defpackage.cne cneVar6;
        uhj uhjVar;
        int i8 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(2027616330);
        if (i8 == 0) {
            i4 = (true != bveVarC.E(obj) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != bveVarC.C(null) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            cgfVar2 = cgfVar;
            i4 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
        } else {
            cgfVar2 = cgfVar;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != ((i2 & 4096) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != ((i2 & 32768) == 0 ? bveVarC.C(cneVar2) : bveVarC.E(cneVar2)) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= 65536;
        }
        int i9 = i4 | 1572864;
        if ((12582912 & i2) == 0) {
            i9 |= true != bveVarC.E(affcVar) ? 4194304 : 8388608;
        }
        int i10 = i9 | 100663296;
        if ((805306368 & i2) == 0) {
            cfuVar2 = cfuVar;
            i10 |= true != bveVarC.C(cfuVar2) ? 268435456 : 536870912;
        } else {
            cfuVar2 = cfuVar;
        }
        if ((i3 & 6) == 0) {
            csrVar2 = csrVar;
            i5 = i3 | (true != bveVarC.C(csrVar2) ? 2 : 4);
        } else {
            csrVar2 = csrVar;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != bveVarC.z(f) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            ckeVar2 = ckeVar;
            i5 |= true != bveVarC.C(ckeVar2) ? 128 : 256;
        } else {
            ckeVar2 = ckeVar;
        }
        if ((i3 & 3072) == 0) {
            i5 |= 1024;
        }
        if (bveVarC.I(((306783379 & i10) == 306783378 && (i5 & 1171) == 1170) ? false : true, i10 & 1)) {
            int i11 = i5 & (-7169);
            int i12 = (-458753) & i10;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i2 & 1) == 0 || bveVarC.F()) {
                cneVar5 = cneVar2;
                i7 = 1;
            } else {
                bveVarC.s();
                cneVar5 = cneVar3;
                i7 = i;
            }
            bveVarC.l();
            uhj uhjVar2 = (uhj) bveVarC.f(fqp.a);
            if (uhjVar2 == null) {
                bveVarC.v(-805878595);
                uhj uhjVarA = fpw.a((android.content.Context) bveVarC.f(defpackage.daj.b));
                bwcVar.Y(false);
                defpackage.cne cneVar7 = cneVar5;
                uhjVar = uhjVarA;
                cneVar6 = cneVar7;
            } else {
                cneVar6 = cneVar5;
                bveVarC.v(-805879866);
                bwcVar.Y(false);
                uhjVar = uhjVar2;
            }
            int i13 = i12 << 3;
            int i14 = i11 << 3;
            i6 = i7;
            defpackage.cgf cgfVar3 = cgfVar2;
            cneVar4 = cneVar6;
            p(obj, uhjVar, cgfVar3, cneVar, cneVar2, cneVar4, affcVar, cfuVar2, csrVar2, f, ckeVar2, i6, bveVarC, (i13 & 1879048192) | (i10 & 126) | (i13 & 7168) | 32768 | (57344 & i13) | 262144 | (458752 & i13) | 2097152 | (29360128 & i13) | (234881024 & i13), (i14 & 7168) | ((i10 >> 27) & 14) | (i14 & 112) | (i14 & 896));
        } else {
            bveVarC.s();
            cneVar4 = cneVar3;
            i6 = i;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new lft(obj, cgfVar, cneVar, cneVar2, cneVar4, affcVar, cfuVar, csrVar, f, ckeVar, i6, i2, i3, 1);
        }
    }

    static /* synthetic */ void i(java.lang.String str) {
        r(str, defpackage.a.bp(str, "If you wish to display this ", ", use androidx.compose.foundation.Image."));
    }

    public static final void j(defpackage.cgf cgfVar, defpackage.cne cneVar, defpackage.cfu cfuVar, defpackage.csr csrVar, float f, defpackage.cke ckeVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cfu cfuVar2;
        defpackage.csr csrVar2;
        float f2;
        defpackage.cke ckeVar2;
        cgfVar.getClass();
        cneVar.getClass();
        cfuVar.getClass();
        csrVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(10290533);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            cfuVar2 = cfuVar;
            i2 |= true != bveVarC.C(cfuVar2) ? 1024 : 2048;
        } else {
            cfuVar2 = cfuVar;
        }
        if ((i & 24576) == 0) {
            csrVar2 = csrVar;
            i2 |= true != bveVarC.C(csrVar2) ? 8192 : 16384;
        } else {
            csrVar2 = csrVar;
        }
        if ((196608 & i) == 0) {
            f2 = f;
            i2 |= true != bveVarC.z(f2) ? 65536 : 131072;
        } else {
            f2 = f;
        }
        if ((1572864 & i) == 0) {
            ckeVar2 = ckeVar;
            i2 |= true != bveVarC.C(ckeVar2) ? 524288 : 1048576;
        } else {
            ckeVar2 = ckeVar;
        }
        if (bveVarC.I((599187 & i2) != 599186, i2 & 1)) {
            defpackage.cgf cgfVarA = defpackage.cjv.h(cgfVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479).a(new fqo(cneVar, cfuVar2, csrVar2, f2, ckeVar2));
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = dni.c;
                bwcVar.ad(objS);
            }
            defpackage.cty ctyVar = (defpackage.cty) objS;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarA);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVar, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new fzx(cgfVar, cneVar, cfuVar, csrVar, f, ckeVar, i, 1);
        }
    }

    public static final void k(fsn fsnVar, java.lang.Class cls, java.util.List list) {
        list.add(new defpackage.afau(fsnVar, cls));
    }

    public static final void l(fru fruVar, java.lang.Class cls, java.util.List list) {
        list.add(new defpackage.afau(fruVar, cls));
    }

    public static final void m(fsk fskVar, java.lang.Class cls, java.util.List list) {
        list.add(new defpackage.afau(fskVar, cls));
    }

    public static final fqm n(java.lang.Object obj, uhj uhjVar, defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.csr csrVar, int i, defpackage.bve bveVar) {
        fti ftiVarD = fqq.d(obj, bveVar);
        java.lang.Object obj2 = ftiVarD.b;
        if (obj2 instanceof ftg) {
            r("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new defpackage.afap();
        }
        if (obj2 instanceof defpackage.cjr) {
            i("ImageBitmap");
            throw new defpackage.afap();
        }
        if (obj2 instanceof defpackage.cno) {
            i("ImageVector");
            throw new defpackage.afap();
        }
        if (obj2 instanceof defpackage.cne) {
            i("Painter");
            throw new defpackage.afap();
        }
        if (ftiVarD.c != null) {
            throw new java.lang.IllegalArgumentException("request.target must be null.");
        }
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        if (objS == defpackage.bvd.a) {
            objS = new fqm(ftiVarD, uhjVar);
            bwcVar.ad(objS);
        }
        fqm fqmVar = (fqm) objS;
        fqmVar.b = affcVar;
        fqmVar.c = affcVar2;
        csrVar.getClass();
        fqmVar.d = csrVar;
        fqmVar.e = i;
        fqmVar.f = ((java.lang.Boolean) bveVar.f(defpackage.dbw.a)).booleanValue();
        fqmVar.h.b(uhjVar);
        ftiVarD.getClass();
        fqmVar.g.b(ftiVarD);
        fqmVar.dw();
        return fqmVar;
    }

    public static final void o(java.lang.Object obj, uhj uhjVar, defpackage.cgf cgfVar, defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.cfu cfuVar, defpackage.csr csrVar, float f, defpackage.cke ckeVar, int i, defpackage.bve bveVar, int i2, int i3) {
        int i4;
        defpackage.affc affcVar3;
        defpackage.affc affcVar4;
        defpackage.cfu cfuVar2;
        float f2;
        defpackage.cke ckeVar2;
        int i5;
        int i6;
        ftv ftvVar;
        boolean z;
        int i7 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(-2030202961);
        if (i7 == 0) {
            i4 = (true != bveVarC.E(obj) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != bveVarC.C(null) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != ((i2 & 512) == 0 ? bveVarC.C(uhjVar) : bveVarC.E(uhjVar)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != bveVarC.C(cgfVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            affcVar3 = affcVar;
            i4 |= true != bveVarC.E(affcVar3) ? 8192 : 16384;
        } else {
            affcVar3 = affcVar;
        }
        if ((196608 & i2) == 0) {
            affcVar4 = affcVar2;
            i4 |= true != bveVarC.E(affcVar4) ? 65536 : 131072;
        } else {
            affcVar4 = affcVar2;
        }
        if ((1572864 & i2) == 0) {
            cfuVar2 = cfuVar;
            i4 |= true != bveVarC.C(cfuVar2) ? 524288 : 1048576;
        } else {
            cfuVar2 = cfuVar;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != bveVarC.C(csrVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            f2 = f;
            i4 |= true != bveVarC.z(f2) ? 33554432 : 67108864;
        } else {
            f2 = f;
        }
        if ((805306368 & i2) == 0) {
            ckeVar2 = ckeVar;
            i4 |= true != bveVarC.C(ckeVar2) ? 268435456 : 536870912;
        } else {
            ckeVar2 = ckeVar;
        }
        int i8 = i4;
        if ((i3 & 6) == 0) {
            i5 = i;
            i6 = i3 | (true != bveVarC.A(i5) ? 2 : 4);
        } else {
            i5 = i;
            i6 = i3;
        }
        if (bveVarC.I(((i8 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true, i8 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i2 & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            fti ftiVarD = fqq.d(obj, bveVarC);
            ftiVarD.getClass();
            csrVar.getClass();
            if (ftiVarD.x.a == null) {
                bveVarC.v(-279205842);
                if (defpackage.afga.f(csrVar, defpackage.csq.f)) {
                    bveVarC.v(-279144524);
                    bwcVar.Y(false);
                    ftvVar = new ftv(ftx.a);
                    z = false;
                } else {
                    bveVarC.v(-279083795);
                    java.lang.Object objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new fqn();
                        bwcVar.ad(objS);
                    }
                    ftvVar = (fqn) objS;
                    z = false;
                    bwcVar.Y(false);
                }
                ftg ftgVarA = fti.a(ftiVarD);
                ftgVarA.e(ftvVar);
                ftiVarD = ftgVarA.a();
                bwcVar.Y(z);
            } else {
                bveVarC.v(-278956044);
                bwcVar.Y(false);
            }
            int i9 = i8 >> 9;
            fti ftiVar = ftiVarD;
            fqm fqmVarN = n(ftiVar, uhjVar, affcVar3, affcVar4, csrVar, i5, bveVarC);
            fty ftyVar = ftiVar.v;
            j(ftyVar instanceof fqn ? cgfVar.a((defpackage.cgf) ftyVar) : cgfVar, fqmVarN, cfuVar2, csrVar, f2, ckeVar2, bveVarC, (57344 & i9) | ((i8 << 3) & 896) | (i9 & 7168) | (458752 & i9) | (3670016 & i9));
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new fqd(obj, uhjVar, cgfVar, affcVar, affcVar2, cfuVar, csrVar, f, ckeVar, i, i2, i3);
        }
    }

    public static final void p(java.lang.Object obj, uhj uhjVar, defpackage.cgf cgfVar, defpackage.cne cneVar, defpackage.cne cneVar2, defpackage.cne cneVar3, defpackage.affc affcVar, defpackage.cfu cfuVar, defpackage.csr csrVar, float f, defpackage.cke ckeVar, int i, defpackage.bve bveVar, int i2, int i3) {
        java.lang.Object obj2;
        int i4;
        defpackage.cgf cgfVar2;
        defpackage.cfu cfuVar2;
        int i5;
        float f2;
        uhjVar.getClass();
        int i6 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(-245964807);
        if (i6 == 0) {
            obj2 = obj;
            i4 = (true != bveVarC.E(obj2) ? 2 : 4) | i2;
        } else {
            obj2 = obj;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != bveVarC.C(null) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != ((i2 & 512) == 0 ? bveVarC.C(uhjVar) : bveVarC.E(uhjVar)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            cgfVar2 = cgfVar;
            i4 |= true != bveVarC.C(cgfVar2) ? 1024 : 2048;
        } else {
            cgfVar2 = cgfVar;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != ((32768 & i2) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != ((262144 & i2) == 0 ? bveVarC.C(cneVar2) : bveVarC.E(cneVar2)) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != ((2097152 & i2) == 0 ? bveVarC.C(cneVar3) : bveVarC.E(cneVar3)) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != bveVarC.E(null) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != bveVarC.E(affcVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != bveVarC.E(null) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            cfuVar2 = cfuVar;
            i5 = i3 | (true != bveVarC.C(cfuVar2) ? 2 : 4);
        } else {
            cfuVar2 = cfuVar;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != bveVarC.C(csrVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            f2 = f;
            i5 |= true == bveVarC.z(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if ((i3 & 3072) == 0) {
            i5 |= true == bveVarC.C(ckeVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= true == bveVarC.A(i) ? 16384 : 8192;
        }
        if (bveVarC.I(((306783379 & i4) == 306783378 && (i5 & 9363) == 9362) ? false : true, i4 & 1)) {
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i2 & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            int i7 = i5 << 18;
            o(obj2, uhjVar, cgfVar2, fqq.c(cneVar, cneVar2, cneVar3), fqq.b((defpackage.affc) null, affcVar, (defpackage.affc) null), cfuVar2, csrVar, f2, ckeVar, i, bveVarC, (i4 & 8190) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), (i5 >> 12) & 14);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new fqc(obj, uhjVar, cgfVar, cneVar, cneVar2, cneVar3, affcVar, cfuVar, csrVar, f, ckeVar, i, i2, i3);
        }
    }

    public static final ajer q(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5) {
        return new ajer(defpackage.a.aY(list), defpackage.a.aY(list2), defpackage.a.aY(list3), defpackage.a.aY(list4), defpackage.a.aY(list5));
    }

    private static final void r(java.lang.String str, java.lang.String str2) {
        throw new java.lang.IllegalArgumentException(defpackage.a.bL(str2, str, "Unsupported type: ", ". "));
    }
}
