package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dax {
    public static final void a(android.view.View view, int i, boolean z) {
        ep$.ExternalSyntheticApiModelOutline1.m(view, 1);
        a$.ExternalSyntheticApiModelOutline1.m$1(view, false);
    }

    public static final defpackage.bxt b(android.view.View view) {
        defpackage.afdo afdoVar;
        defpackage.bxf bxfVar;
        defpackage.aau aauVar = defpackage.dcw.a;
        defpackage.afdo afdoVar2 = defpackage.afdp.a;
        defpackage.afar afarVar = defpackage.dap.a;
        if (defpackage.a.Y()) {
            afdoVar = (defpackage.afdo) defpackage.dap.a.a();
        } else {
            afdoVar = (defpackage.afdo) defpackage.dap.b.get();
            if (afdoVar == null) {
                throw new java.lang.IllegalStateException("no AndroidUiDispatcher for this thread");
            }
        }
        defpackage.afdo afdoVarPlus = afdoVar.plus(afdoVar2);
        defpackage.bwq bwqVar = (defpackage.bwq) afdoVarPlus.get(defpackage.bwq.b);
        if (bwqVar != null) {
            bxfVar = new defpackage.bxf(bwqVar);
            bxfVar.b();
        } else {
            bxfVar = null;
        }
        defpackage.afgv afgvVar = new defpackage.afgv();
        defpackage.afdo dcbVar = (defpackage.cgh) afdoVarPlus.get(defpackage.cgh.a);
        if (dcbVar == null) {
            dcbVar = new defpackage.dcb(view.getContext().getApplicationContext());
            afgvVar.a = dcbVar;
        }
        if (bxfVar != null) {
            afdoVar2 = bxfVar;
        }
        defpackage.afdo afdoVarPlus2 = afdoVarPlus.plus(afdoVar2).plus(dcbVar);
        defpackage.bxt bxtVar = new defpackage.bxt(afdoVarPlus2);
        bxtVar.D();
        aiuw aiuwVarB = ahoi.b(afdoVarPlus2);
        defpackage.eqg eqgVarC = defpackage.edd.c(view);
        defpackage.epy lifecycle = eqgVarC != null ? eqgVarC.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new defpackage.dcr(view, bxtVar, 0));
            lifecycle.c(new defpackage.dct(aiuwVarB, bxfVar, bxtVar, afgvVar));
            return bxtVar;
        }
        java.util.Objects.toString(view);
        defpackage.csc.a("ViewTreeLifecycleOwner not found from ".concat(java.lang.String.valueOf(view)));
        throw new defpackage.afap();
    }

    public static final defpackage.afer c(defpackage.czl czlVar, defpackage.epy epyVar) {
        if (epyVar.a().compareTo(defpackage.epx.a) <= 0) {
            throw new java.lang.IllegalStateException(defpackage.a.bv(epyVar, czlVar, "Cannot configure ", " to disposeComposition at Lifecycle ON_DESTROY: ", "is already destroyed"));
        }
        defpackage.oa oaVar = new defpackage.oa(czlVar, 4);
        epyVar.c(oaVar);
        return new defpackage.bxn(epyVar, oaVar, 5);
    }

    public static final android.graphics.Rect d(android.text.TextPaint textPaint, java.lang.CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, android.text.style.MetricAffectingSpan.class) != i2) {
                android.graphics.Rect rect = new android.graphics.Rect();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                android.text.TextPaint textPaint2 = new android.text.TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, android.text.style.MetricAffectingSpan.class);
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = (android.text.style.MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, android.text.style.MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    p(textPaint2, charSequence, i, iNextSpanTransition, rect2);
                    rect.right += rect2.width();
                    rect.top = java.lang.Math.min(rect.top, rect2.top);
                    rect.bottom = java.lang.Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        android.graphics.Rect rect3 = new android.graphics.Rect();
        p(textPaint, charSequence, i, i2, rect3);
        return rect3;
    }

    public static final int e(android.text.Layout layout, int i) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        return ((lineStart == i || layout.getLineEnd(lineForOffset) == i) && lineStart == i) ? lineForOffset - 1 : lineForOffset;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0106  */
    /* JADX WARN: Code duplicated, block: B:80:0x010e  */
    /* JADX WARN: Code duplicated, block: B:83:0x011a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0123  */
    public static final defpackage.dgd f(defpackage.dgd dgdVar, defpackage.dlz dlzVar) {
        int i;
        long j;
        defpackage.dlh dlhVar;
        int i2;
        defpackage.dli dliVar;
        defpackage.dft dftVar = dgdVar.b;
        defpackage.dlf dlfVar = dftVar.a;
        long j2 = defpackage.dfu.a;
        defpackage.dlf dlfVarD = dlfVar.d(new defpackage.con(11));
        long j3 = dftVar.b;
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        if ((j3 & 1095216660480L) == 0) {
            j3 = defpackage.dfu.a;
        }
        long j4 = j3;
        defpackage.dil dilVar = dftVar.c;
        if (dilVar == null) {
            dilVar = defpackage.dil.k;
        }
        defpackage.dil dilVar2 = dilVar;
        defpackage.die dieVar = dftVar.d;
        defpackage.die dieVar2 = new defpackage.die(dieVar != null ? dieVar.a : 0);
        defpackage.dif difVar = dftVar.e;
        defpackage.dif difVar2 = new defpackage.dif(difVar != null ? difVar.a : 65535);
        defpackage.dhz dhzVar = dftVar.f;
        if (dhzVar == null) {
            dhzVar = defpackage.dhz.e;
        }
        defpackage.dhz dhzVar2 = dhzVar;
        java.lang.String str = dftVar.g;
        long j5 = dftVar.h;
        if ((j5 & 1095216660480L) == 0) {
            j5 = defpackage.dfu.b;
        }
        long j6 = j5;
        defpackage.dku dkuVar = dftVar.i;
        float f = dkuVar != null ? dkuVar.a : 0.0f;
        defpackage.dku dkuVar2 = new defpackage.dku(true != java.lang.Float.isNaN(f) ? f : 0.0f);
        defpackage.dlg dlgVar = dftVar.j;
        if (dlgVar == null) {
            dlgVar = defpackage.dlg.a;
        }
        defpackage.dlg dlgVar2 = dlgVar;
        defpackage.dkl dklVarA = dftVar.k;
        if (dklVarA == null) {
            defpackage.dkl dklVar = defpackage.dkl.a;
            dklVarA = defpackage.dkm.a.a();
        }
        defpackage.dkl dklVar2 = dklVarA;
        long j7 = dftVar.l;
        if (j7 == 16) {
            j7 = defpackage.dfu.c;
        }
        long j8 = j7;
        defpackage.dlc dlcVar = dftVar.m;
        if (dlcVar == null) {
            dlcVar = defpackage.dlc.a;
        }
        defpackage.dlc dlcVar2 = dlcVar;
        defpackage.clc clcVar = dftVar.n;
        if (clcVar == null) {
            clcVar = defpackage.clc.a;
        }
        defpackage.clc clcVar2 = clcVar;
        defpackage.dai daiVar = dftVar.p;
        if (daiVar == null) {
            daiVar = defpackage.cmn.a;
        }
        defpackage.dai daiVar2 = daiVar;
        if (str == null) {
            str = "";
        }
        defpackage.dft dftVar2 = new defpackage.dft(dlfVarD, j4, dilVar2, dieVar2, difVar2, dhzVar2, str, j6, dkuVar2, dlgVar2, dklVar2, j8, dlcVar2, clcVar2, daiVar2);
        defpackage.dfn dfnVar = dgdVar.c;
        int i3 = dfnVar.a;
        int i4 = 5;
        int i5 = i3 == 0 ? 5 : i3;
        int i6 = dfnVar.b;
        long j9 = defpackage.dfo.a;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = dlzVar.ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else {
                    if (iOrdinal != 1) {
                        throw new defpackage.afas();
                    }
                    i4 = 2;
                }
            } else {
                i = i6;
            }
            j = dfnVar.c;
            if ((j & 1095216660480L) == 0) {
                j = defpackage.dfo.a;
            }
            long j10 = j;
            dlhVar = dfnVar.d;
            if (dlhVar == null) {
                dlhVar = defpackage.dlh.a;
            }
            defpackage.dlh dlhVar2 = dlhVar;
            defpackage.dfq dfqVar = dfnVar.e;
            defpackage.dla dlaVar = dfnVar.f;
            i2 = dfnVar.g;
            if (i2 == 0) {
                i2 = 66305;
            }
            int i7 = i2;
            dliVar = dfnVar.i;
            if (dliVar == null) {
                dliVar = defpackage.dli.a;
            }
            return new defpackage.dgd(dftVar2, new defpackage.dfn(i5, i, j10, dlhVar2, dfqVar, dlaVar, i7, 1, dliVar), dgdVar.d);
        }
        int iOrdinal2 = dlzVar.ordinal();
        if (iOrdinal2 == 0) {
            i4 = 4;
        } else if (iOrdinal2 != 1) {
            throw new defpackage.afas();
        }
        i = i4;
        j = dfnVar.c;
        if ((j & 1095216660480L) == 0) {
            j = defpackage.dfo.a;
        }
        long j11 = j;
        dlhVar = dfnVar.d;
        if (dlhVar == null) {
            dlhVar = defpackage.dlh.a;
        }
        defpackage.dlh dlhVar3 = dlhVar;
        defpackage.dfq dfqVar2 = dfnVar.e;
        defpackage.dla dlaVar2 = dfnVar.f;
        i2 = dfnVar.g;
        if (i2 == 0) {
            i2 = 66305;
        }
        int i8 = i2;
        dliVar = dfnVar.i;
        if (dliVar == null) {
            dliVar = defpackage.dli.a;
        }
        return new defpackage.dgd(dftVar2, new defpackage.dfn(i5, i, j11, dlhVar3, dfqVar2, dlaVar2, i8, 1, dliVar), dgdVar.d);
    }

    public static final long g(int i, int i2) {
        if (i < 0 || i2 < 0) {
            defpackage.dki.c(defpackage.a.bz(i2, i, "start and end cannot be negative. [start: ", ", end: ", "]"));
        }
        return (((long) i2) & 4294967295L) | (i << 32);
    }

    public static final long h(long j, int i) {
        long j2 = defpackage.dgc.a;
        int i2 = (int) (4294967295L & j);
        int i3 = i2 < 0 ? 0 : i2;
        if (i3 > i) {
            i3 = i;
        }
        int i4 = (int) (j >> 32);
        int i5 = i4 >= 0 ? i4 : 0;
        if (i5 <= i) {
            i = i5;
        }
        return (i == i4 && i3 == i2) ? j : g(i, i3);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r0 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(int r4, java.lang.Object r5, defpackage.dhy r6, defpackage.dil r7, int r8) {
        /*
            boolean r0 = r5 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            goto L3d
        L5:
            r0 = r4 & 1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L29
            dil r0 = r6.c()
            boolean r0 = defpackage.afga.f(r0, r7)
            if (r0 != 0) goto L29
            dil r0 = defpackage.dil.f
            int r3 = r7.compareTo(r0)
            if (r3 < 0) goto L29
            dil r3 = r6.c()
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L29
            r0 = r1
            goto L2a
        L29:
            r0 = r2
        L2a:
            r4 = r4 & 2
            if (r4 == 0) goto L37
            int r4 = r6.b()
            if (r8 != r4) goto L35
            goto L37
        L35:
            r4 = r1
            goto L38
        L37:
            r4 = r2
        L38:
            if (r4 != 0) goto L3e
            if (r0 == 0) goto L3d
            goto L47
        L3d:
            return r5
        L3e:
            if (r0 != 0) goto L47
            dil r7 = r6.c()
            int r7 = r7.o
            goto L49
        L47:
            int r7 = r7.o
        L49:
            if (r4 == 0) goto L4e
            if (r8 != r1) goto L55
            goto L56
        L4e:
            int r4 = r6.b()
            if (r4 != r1) goto L55
            goto L56
        L55:
            r1 = r2
        L56:
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            android.graphics.Typeface r4 = hh$.ExternalSyntheticApiModelOutline0.m(r5, r7, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dax.i(int, java.lang.Object, dhy, dil, int):java.lang.Object");
    }

    public static /* synthetic */ defpackage.dhy j(int i) {
        return new defpackage.dip(i, defpackage.dil.k, 0, new defpackage.dij(new defpackage.dig[0]));
    }

    public static final defpackage.dhz k(defpackage.dhy... dhyVarArr) {
        java.util.List listAsList = java.util.Arrays.asList(dhyVarArr);
        listAsList.getClass();
        return new defpackage.dic(listAsList);
    }

    public static /* synthetic */ defpackage.dhy l(java.lang.String str, defpackage.dil dilVar, int i) {
        return new defpackage.dhx(str, dilVar, i, new defpackage.dij(new defpackage.dig[0]));
    }

    public static final int m(float f) {
        return (int) java.lang.Math.ceil(f);
    }

    public static final defpackage.wde n(android.content.Context context) {
        return new defpackage.wde(new defpackage.ldx(context), new defpackage.dho(android.os.Build.VERSION.SDK_INT >= 31 ? defpackage.dim.a.a(context) : 0), defpackage.dib.a, new defpackage.did(defpackage.dib.b, defpackage.afdp.a));
    }

    public static /* synthetic */ defpackage.bys o(defpackage.wde wdeVar, defpackage.dhz dhzVar, defpackage.dil dilVar, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            dilVar = defpackage.dil.k;
        }
        int i4 = i & ((i3 & 4) != 0 ? 0 : 1);
        if ((i3 & 8) != 0) {
            i2 = 65535;
        }
        if (1 == (i3 & 1)) {
            dhzVar = null;
        }
        return wdeVar.f(dhzVar, dilVar, i4, i2);
    }

    private static final void p(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Rect rect) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            alh$.ExternalSyntheticApiModelOutline0.m(paint, charSequence, i, i2, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i, i2, rect);
        }
    }
}
