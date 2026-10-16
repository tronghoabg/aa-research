package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class deu {
    public final defpackage.dew a;
    public final defpackage.dgp b;
    public final java.lang.CharSequence c;
    public float d;
    public final java.util.List e;
    private final int f;
    private final int g;
    private final long h;

    /* JADX WARN: Code duplicated, block: B:104:0x01af  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:108:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:120:0x022d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0231  */
    /* JADX WARN: Code duplicated, block: B:123:0x0247  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02df  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:163:0x030a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0317  */
    /* JADX WARN: Code duplicated, block: B:166:0x032b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0336  */
    /* JADX WARN: Code duplicated, block: B:168:0x033d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0357  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x016d  */
    public deu(defpackage.dew dewVar, int i, int i2, long j) {
        java.lang.CharSequence charSequence;
        char c;
        int i3;
        int i4;
        android.text.TextUtils.TruncateAt truncateAt;
        defpackage.dgp dgpVarM;
        int i5;
        defpackage.deu deuVar;
        int i6;
        java.lang.CharSequence charSequenceO;
        defpackage.dkt[] dktVarArr;
        java.lang.CharSequence charSequence2;
        android.text.Spanned spanned;
        java.util.ArrayList arrayList;
        int i7;
        java.util.List list;
        int iK;
        boolean z;
        defpackage.cjj cjjVar;
        float f;
        int iB;
        float fE;
        int iB2;
        int i8;
        float fB;
        int iA;
        float fE2;
        float f2;
        float fB2;
        int i9;
        defpackage.deu deuVar2;
        java.lang.CharSequence charSequence3;
        this.a = dewVar;
        this.f = i;
        this.g = i2;
        this.h = j;
        if (defpackage.dlm.c(j) != 0 || defpackage.dlm.d(j) != 0) {
            defpackage.dki.c("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i <= 0) {
            defpackage.dki.c("maxLines should be greater than 0");
        }
        java.lang.CharSequence charSequence4 = dewVar.d;
        android.text.Spanned spanned2 = charSequence4 instanceof android.text.Spanned ? (android.text.Spanned) charSequence4 : null;
        if (spanned2 != null) {
            n(spanned2, android.text.style.LineHeightSpan.class);
        }
        defpackage.dgd dgdVar = dewVar.a;
        if (i2 == 2) {
            long jH = dgdVar.h();
            defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
            if (jH == 4294967296L || dgdVar.h() == 2143289344 || dgdVar.c() == 0 || dgdVar.c() == 5 || dgdVar.c() == 4) {
                charSequence = dewVar.d;
            } else {
                charSequence3 = dewVar.d;
                if (charSequence3.length() != 0) {
                    android.text.Spannable spannableString = charSequence3 instanceof android.text.Spannable ? (android.text.Spannable) charSequence3 : null;
                    if (spannableString == null) {
                        charSequence = charSequence3;
                        charSequence = charSequence3;
                        spannableString = new android.text.SpannableString(charSequence3);
                    }
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    android.text.Spannable spannable = spannableString;
                    boolean zL = defpackage.day.l(spannable, defpackage.dha.class);
                    charSequence = spannable;
                    if (!zL) {
                        spannable.setSpan(new defpackage.dha(), spannable.length() - 1, spannable.length() - 1, 33);
                        charSequence = spannable;
                    }
                }
            }
        } else {
            charSequence = dewVar.d;
        }
        charSequence = charSequence3;
        java.lang.CharSequence charSequence5 = charSequence;
        this.c = charSequence5;
        int iC = dgdVar.c();
        int i10 = iC == 1 ? 3 : iC == 2 ? 4 : iC == 3 ? 2 : 0;
        int i11 = dgdVar.c() == 4 ? 1 : 0;
        int iB3 = dgdVar.b() & 255;
        if (iB3 == 1) {
            c = 0;
        } else if (iB3 == 2) {
            c = 1;
        } else if (iB3 == 3) {
            c = 2;
        } else {
            c = 0;
        }
        int iB4 = (dgdVar.b() >> 8) & 255;
        if (iB4 == 1) {
            i3 = 1;
            i4 = 0;
        } else if (iB4 == 2) {
            i3 = 1;
            i4 = 1;
        } else if (iB4 == 3) {
            i3 = 1;
            i4 = 2;
        } else if (iB4 == 4) {
            i3 = 1;
            i4 = 3;
        } else {
            i3 = 1;
            i4 = 0;
        }
        if (i2 != 2) {
            if (i2 == 4) {
                truncateAt = android.text.TextUtils.TruncateAt.START;
            } else {
                truncateAt = null;
            }
            int i12 = i11;
            int i13 = i3;
            android.text.TextUtils.TruncateAt truncateAt2 = truncateAt;
            dgpVarM = m(i10, i12, truncateAt2, i, 0, c, i4, 0, charSequence5);
            if (android.os.Build.VERSION.SDK_INT < 35 || j().getLetterSpacing() == 0.0f || i2 != 4 || dgpVarM.h(0) <= 0) {
                i5 = 2;
                deuVar = this;
                i6 = i;
            } else {
                int i14 = dgpVarM.i(0);
                int iH = dgpVarM.h(0) + i14;
                java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[3];
                charSequenceArr[0] = charSequence5.subSequence(0, i14);
                charSequenceArr[i13] = "…";
                charSequenceArr[2] = charSequence5.subSequence(iH, charSequence5.length());
                deuVar2 = this;
                i6 = i;
                i5 = 2;
                dgpVarM = deuVar2.m(i10, i12, truncateAt2, i6, 0, c, i4, 0, android.text.TextUtils.concat(charSequenceArr));
            }
            if (i2 == i5 || dgpVarM.g() <= defpackage.dlm.a(j) || i6 <= i13) {
                deuVar = deuVar2;
                deuVar = deuVar2;
                deuVar = deuVar2;
                deuVar.b = dgpVarM;
            } else {
                int iA2 = defpackage.dlm.a(j);
                int i15 = dgpVarM.e;
                int i16 = 0;
                while (true) {
                    if (i16 >= i15) {
                        deuVar = deuVar2;
                        i9 = dgpVarM.e;
                        break;
                    } else if (dgpVarM.b(i16) > iA2) {
                        deuVar = deuVar2;
                        i9 = i16;
                        break;
                    } else {
                        deuVar = deuVar2;
                        i16++;
                    }
                }
                if (i9 >= 0 && i9 != deuVar.f) {
                    dgpVarM = deuVar.m(i10, i12, truncateAt2, i9 <= 0 ? 1 : i9, 0, c, i4, 0, deuVar.c);
                }
                deuVar.b = dgpVarM;
            }
            deuVar.d = dgpVarM.g();
            defpackage.dkp dkpVarJ = deuVar.j();
            dgdVar.y();
            dkpVarJ.b(null, (((long) java.lang.Float.floatToRawIntBits(deuVar.d)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(deuVar.g())) << 32), dgdVar.a());
            if (dgpVarM.o() instanceof android.text.Spanned) {
                charSequenceO = dgpVarM.o();
                charSequenceO.getClass();
                if (n((android.text.Spanned) charSequenceO, defpackage.dkt.class)) {
                    java.lang.CharSequence charSequenceO2 = dgpVarM.o();
                    charSequenceO2.getClass();
                    dktVarArr = (defpackage.dkt[]) ((android.text.Spanned) charSequenceO2).getSpans(0, dgpVarM.o().length(), defpackage.dkt.class);
                } else {
                    dktVarArr = null;
                }
            } else {
                dktVarArr = null;
            }
            if (dktVarArr == null && dktVarArr.length > 0) {
                defpackage.dkt dktVar = dktVarArr[0];
                deuVar.g();
                java.lang.Object obj = dktVar.a;
                throw null;
            }
            charSequence2 = deuVar.c;
            if (charSequence2 instanceof android.text.Spanned) {
                spanned = (android.text.Spanned) charSequence2;
                java.lang.Object[] spans = spanned.getSpans(0, charSequence2.length(), defpackage.dhf.class);
                arrayList = new java.util.ArrayList(spans.length);
                for (java.lang.Object obj2 : spans) {
                    defpackage.dhf dhfVar = (defpackage.dhf) obj2;
                    int spanStart = spanned.getSpanStart(dhfVar);
                    int spanEnd = spanned.getSpanEnd(dhfVar);
                    iK = deuVar.b.k(spanStart);
                    int i17 = deuVar.f;
                    if (deuVar.b.h(iK) > 0 || spanEnd <= deuVar.b.l(iK) + deuVar.b.i(iK)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int iJ = deuVar.b.j(iK);
                    if (!z || spanEnd > iJ) {
                        cjjVar = null;
                    } else if (iK >= i17) {
                        cjjVar = null;
                    } else {
                        boolean z2 = deuVar.b.m(iK) == 1;
                        boolean zQ = deuVar.b.q(spanStart);
                        if (!z2 || zQ) {
                            if (z2) {
                                fE = deuVar.b.f(spanStart, false);
                                iB2 = dhfVar.b();
                            } else {
                                defpackage.dgp dgpVar = deuVar.b;
                                if (zQ) {
                                    fE = dgpVar.e(spanStart, false);
                                    iB2 = dhfVar.b();
                                } else {
                                    f = dgpVar.f(spanStart, false);
                                    iB = dhfVar.b();
                                }
                            }
                            f = fE - iB2;
                            i8 = dhfVar.a;
                            if (i8 != 0) {
                                if (i8 != 1) {
                                    fE2 = deuVar.e(iK);
                                } else if (i8 != i5) {
                                    fB = deuVar.c(iK);
                                    iA = dhfVar.a();
                                } else if (i8 != 3) {
                                    if (i8 != 4) {
                                        f2 = dhfVar.c().ascent;
                                        fB2 = deuVar.b(iK);
                                    } else if (i8 != 5) {
                                        android.graphics.Paint.FontMetricsInt fontMetricsIntC = dhfVar.c();
                                        int iA3 = ((fontMetricsIntC.ascent + fontMetricsIntC.descent) - dhfVar.a()) / i5;
                                        fB2 = deuVar.b(iK);
                                        f2 = iA3;
                                    } else {
                                        fE2 = (dhfVar.c().descent + deuVar.b(iK)) - dhfVar.a();
                                    }
                                    fE2 = f2 + fB2;
                                } else {
                                    fE2 = ((deuVar.e(iK) + deuVar.c(iK)) - dhfVar.a()) / 2.0f;
                                }
                                cjjVar = new defpackage.cjj(f, fE2, fE, dhfVar.a() + fE2);
                            } else {
                                fB = deuVar.b(iK);
                                iA = dhfVar.a();
                            }
                            fE2 = fB - iA;
                            cjjVar = new defpackage.cjj(f, fE2, fE, dhfVar.a() + fE2);
                        } else {
                            f = deuVar.b.e(spanStart, false);
                            iB = dhfVar.b();
                        }
                        fE = iB + f;
                        i8 = dhfVar.a;
                        if (i8 != 0) {
                            if (i8 != 1) {
                                fE2 = deuVar.e(iK);
                            } else if (i8 != i5) {
                                fB = deuVar.c(iK);
                                iA = dhfVar.a();
                            } else if (i8 != 3) {
                                if (i8 != 4) {
                                    f2 = dhfVar.c().ascent;
                                    fB2 = deuVar.b(iK);
                                } else if (i8 != 5) {
                                    android.graphics.Paint.FontMetricsInt fontMetricsIntC2 = dhfVar.c();
                                    int iA4 = ((fontMetricsIntC2.ascent + fontMetricsIntC2.descent) - dhfVar.a()) / i5;
                                    fB2 = deuVar.b(iK);
                                    f2 = iA4;
                                } else {
                                    fE2 = (dhfVar.c().descent + deuVar.b(iK)) - dhfVar.a();
                                }
                                fE2 = f2 + fB2;
                            } else {
                                fE2 = ((deuVar.e(iK) + deuVar.c(iK)) - dhfVar.a()) / 2.0f;
                            }
                            cjjVar = new defpackage.cjj(f, fE2, fE, dhfVar.a() + fE2);
                        } else {
                            fB = deuVar.b(iK);
                            iA = dhfVar.a();
                        }
                        fE2 = fB - iA;
                        cjjVar = new defpackage.cjj(f, fE2, fE, dhfVar.a() + fE2);
                    }
                    arrayList.add(cjjVar);
                }
                list = arrayList;
            } else {
                list = defpackage.afce.a;
            }
            deuVar.e = list;
        }
        truncateAt = android.text.TextUtils.TruncateAt.END;
        int i18 = i11;
        int i19 = i3;
        android.text.TextUtils.TruncateAt truncateAt3 = truncateAt;
        dgpVarM = m(i10, i18, truncateAt3, i, 0, c, i4, 0, charSequence5);
        if (android.os.Build.VERSION.SDK_INT < 35) {
            i5 = 2;
            deuVar = this;
            i6 = i;
        } else {
            i5 = 2;
            deuVar = this;
            i6 = i;
        }
        if (i2 == i5) {
            deuVar = deuVar2;
            deuVar = deuVar2;
            deuVar = deuVar2;
            deuVar.b = dgpVarM;
        } else {
            deuVar = deuVar2;
            deuVar = deuVar2;
            deuVar = deuVar2;
            deuVar.b = dgpVarM;
        }
        deuVar.d = dgpVarM.g();
        defpackage.dkp dkpVarJ2 = deuVar.j();
        dgdVar.y();
        dkpVarJ2.b(null, (((long) java.lang.Float.floatToRawIntBits(deuVar.d)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(deuVar.g())) << 32), dgdVar.a());
        if (dgpVarM.o() instanceof android.text.Spanned) {
            dktVarArr = null;
        } else {
            charSequenceO = dgpVarM.o();
            charSequenceO.getClass();
            if (n((android.text.Spanned) charSequenceO, defpackage.dkt.class)) {
                dktVarArr = null;
            } else {
                java.lang.CharSequence charSequenceO3 = dgpVarM.o();
                charSequenceO3.getClass();
                dktVarArr = (defpackage.dkt[]) ((android.text.Spanned) charSequenceO3).getSpans(0, dgpVarM.o().length(), defpackage.dkt.class);
            }
        }
        if (dktVarArr == null) {
        }
        charSequence2 = deuVar.c;
        if (charSequence2 instanceof android.text.Spanned) {
            list = defpackage.afce.a;
        } else {
            spanned = (android.text.Spanned) charSequence2;
            java.lang.Object[] spans2 = spanned.getSpans(0, charSequence2.length(), defpackage.dhf.class);
            arrayList = new java.util.ArrayList(spans2.length);
            while (i7 < r4) {
                defpackage.dhf dhfVar2 = (defpackage.dhf) obj2;
                int spanStart2 = spanned.getSpanStart(dhfVar2);
                int spanEnd2 = spanned.getSpanEnd(dhfVar2);
                iK = deuVar.b.k(spanStart2);
                int i110 = deuVar.f;
                if (deuVar.b.h(iK) > 0) {
                    z = false;
                } else {
                    z = false;
                }
                int iJ2 = deuVar.b.j(iK);
                if (z) {
                    cjjVar = null;
                } else {
                    cjjVar = null;
                }
                arrayList.add(cjjVar);
            }
            list = arrayList;
        }
        deuVar.e = list;
    }

    private final defpackage.dgp m(int i, int i2, android.text.TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, java.lang.CharSequence charSequence) {
        float fG = g();
        defpackage.dkp dkpVarJ = j();
        defpackage.dkn dknVar = defpackage.dko.a;
        defpackage.dew dewVar = this.a;
        return new defpackage.dgp(charSequence, fG, dkpVarJ, i, truncateAt, dewVar.f, i3, i5, i6, 0, 0, i2, dewVar.e);
    }

    private static final boolean n(android.text.Spanned spanned, java.lang.Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public final float a() {
        return b(h() - 1);
    }

    public final float b(int i) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        defpackage.dgp dgpVar = this.b;
        return dgpVar.f + ((i != dgpVar.e + (-1) || (fontMetricsInt = dgpVar.i) == null) ? dgpVar.d.getLineBaseline(i) : dgpVar.d(i) - fontMetricsInt.ascent) + 0.0f;
    }

    public final float c(int i) {
        return this.b.b(i);
    }

    public final float d(int i) {
        return this.b.c(i);
    }

    public final float e(int i) {
        return this.b.d(i);
    }

    public final float f() {
        return this.a.a();
    }

    public final float g() {
        return defpackage.dlm.b(this.h);
    }

    public final int h() {
        return this.b.e;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    public final long i(defpackage.cjj cjjVar, int i, defpackage.dfy dfyVar) {
        defpackage.dgv dgtVar;
        int iM;
        int i2;
        int i3;
        int iM2;
        int[] iArrM;
        android.graphics.RectF rectFC = defpackage.ckn.c(cjjVar);
        final defpackage.cvi cviVar = new defpackage.cvi(dfyVar, 7);
        int i4 = android.os.Build.VERSION.SDK_INT;
        defpackage.dgp dgpVar = this.b;
        if (i4 >= 34) {
            iArrM = axd$.ExternalSyntheticApiModelOutline0.m(dgpVar.d, rectFC, i == 1 ? new defpackage.dgr(new defpackage.dgx(dgpVar.o(), dgpVar.n())) : new android.text.GraphemeClusterSegmentFinder(dgpVar.o(), dgpVar.a), new android.text.Layout.TextInclusionStrategy() { // from class: dgg
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(android.graphics.RectF rectF, android.graphics.RectF rectF2) {
                    return ((java.lang.Boolean) cviVar.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            android.text.Layout layout = dgpVar.d;
            defpackage.oln olnVarR = dgpVar.r();
            if (i == 1) {
                dgtVar = new defpackage.dgx(dgpVar.o(), dgpVar.n());
            } else {
                java.lang.CharSequence charSequenceO = dgpVar.o();
                dgtVar = android.os.Build.VERSION.SDK_INT >= 29 ? new defpackage.dgt(charSequenceO, dgpVar.a) : new defpackage.dgu(charSequenceO);
            }
            int lineForVertical = layout.getLineForVertical((int) rectFC.top);
            int[] iArr = null;
            if (rectFC.top <= dgpVar.b(lineForVertical) || (lineForVertical = lineForVertical + 1) < dgpVar.e) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFC.bottom);
                if (lineForVertical2 != 0) {
                    iM = defpackage.day.m(dgpVar, layout, olnVarR, i5, rectFC, dgtVar, cviVar, true);
                    while (true) {
                        i2 = i5;
                        if (iM != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        iM = defpackage.day.m(dgpVar, layout, olnVarR, i5, rectFC, dgtVar, cviVar, true);
                    }
                    if (iM != -1) {
                        i3 = lineForVertical2;
                        iM2 = defpackage.day.m(dgpVar, layout, olnVarR, i3, rectFC, dgtVar, cviVar, false);
                        while (iM2 == -1 && i2 < i3) {
                            i3--;
                            iM2 = defpackage.day.m(dgpVar, layout, olnVarR, i3, rectFC, dgtVar, cviVar, false);
                        }
                        if (iM2 != -1) {
                            iArr = new int[]{dgtVar.f(iM + 1), dgtVar.b(iM2 - 1)};
                        }
                    }
                } else if (rectFC.bottom >= dgpVar.d(0)) {
                    lineForVertical2 = 0;
                    iM = defpackage.day.m(dgpVar, layout, olnVarR, i5, rectFC, dgtVar, cviVar, true);
                    while (true) {
                        i2 = i5;
                        if (iM != -1) {
                            break;
                        }
                        break;
                        break;
                        i5 = i2 + 1;
                        iM = defpackage.day.m(dgpVar, layout, olnVarR, i5, rectFC, dgtVar, cviVar, true);
                    }
                    if (iM != -1) {
                        i3 = lineForVertical2;
                        iM2 = defpackage.day.m(dgpVar, layout, olnVarR, i3, rectFC, dgtVar, cviVar, false);
                        while (iM2 == -1) {
                            i3--;
                            iM2 = defpackage.day.m(dgpVar, layout, olnVarR, i3, rectFC, dgtVar, cviVar, false);
                        }
                        if (iM2 != -1) {
                            iArr = new int[]{dgtVar.f(iM + 1), dgtVar.b(iM2 - 1)};
                        }
                    }
                }
            }
            iArrM = iArr;
        }
        if (iArrM == null) {
            return defpackage.dgc.a;
        }
        long jG = defpackage.dax.g(iArrM[0], iArrM[1]);
        long j = defpackage.dgc.a;
        return jG;
    }

    public final defpackage.dkp j() {
        return this.a.c;
    }

    public final boolean k() {
        return this.b.c;
    }

    public final void l(defpackage.ckc ckcVar, long j, defpackage.clc clcVar, defpackage.dlc dlcVar, defpackage.dai daiVar) {
        defpackage.ckc ckcVar2;
        int i = j().a;
        defpackage.dkp dkpVarJ = j();
        dkpVarJ.c(j);
        dkpVarJ.d(clcVar);
        dkpVarJ.e(dlcVar);
        dkpVarJ.f(daiVar);
        dkpVarJ.a(3);
        if (k()) {
            ckcVar.g();
            if (k()) {
                ckcVar2 = ckcVar;
                ckcVar2.a(0.0f, 0.0f, g(), this.d, 1);
            } else {
                ckcVar2 = ckcVar;
            }
            defpackage.dgp dgpVar = this.b;
            android.graphics.Canvas canvas = defpackage.cjn.a;
            ckcVar2.getClass();
            dgpVar.p(((defpackage.cjm) ckcVar2).a);
            ckcVar2.e();
        } else {
            defpackage.dgp dgpVar2 = this.b;
            android.graphics.Canvas canvas2 = defpackage.cjn.a;
            ckcVar.getClass();
            dgpVar2.p(((defpackage.cjm) ckcVar).a);
        }
        j().a(i);
    }
}
