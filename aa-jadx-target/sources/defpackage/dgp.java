package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dgp {
    public final android.text.TextPaint a;
    public final android.text.TextUtils.TruncateAt b;
    public final boolean c;
    public final android.text.Layout d;
    public final int e;
    public final int f;
    public final float g;
    public final float h;
    public final android.graphics.Paint.FontMetricsInt i;
    private final defpackage.dgk j;
    private defpackage.dgw k;
    private final int l;
    private final boolean m;
    private final int n;
    private final defpackage.dhe[] o;
    private final android.graphics.Rect p = new android.graphics.Rect();
    private defpackage.oln q;

    /* JADX WARN: Code duplicated, block: B:112:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x02de  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v34 */
    public dgp(java.lang.CharSequence charSequence, float f, android.text.TextPaint textPaint, int i, android.text.TextUtils.TruncateAt truncateAt, int i2, int i3, int i4, int i5, int i6, int i7, int i8, defpackage.dgk dgkVar) {
        int i9;
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        android.text.Layout layoutK;
        boolean z;
        int i10;
        defpackage.dhe[] dheVarArr;
        int i11;
        ?? M;
        long j;
        long j2;
        long j3;
        int i12;
        int i13;
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        int iC;
        this.a = textPaint;
        this.b = truncateAt;
        this.j = dgkVar;
        int length = charSequence.length();
        android.text.TextDirectionHeuristic textDirectionHeuristicA = defpackage.dgq.a(i2);
        android.text.Layout.Alignment alignment = defpackage.dgn.a;
        android.text.Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? defpackage.dgn.b : defpackage.dgn.a : android.text.Layout.Alignment.ALIGN_CENTER : android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof android.text.Spanned) && ((android.text.Spanned) charSequence).nextSpanTransition(-1, length, defpackage.dgy.class) < length;
        android.text.BoringLayout.Metrics metricsC = dgkVar.c();
        double d = f;
        int iCeil = (int) java.lang.Math.ceil(d);
        if (metricsC == null || dgkVar.b() > f || z2) {
            this.m = false;
            i9 = i3;
            textDirectionHeuristic = textDirectionHeuristicA;
            layoutK = defpackage.day.k(new defpackage.dgm(charSequence, charSequence.length(), textPaint, iCeil, textDirectionHeuristic, alignment2, i9, truncateAt, (int) java.lang.Math.ceil(d), i8, i4, i5, 0, 0));
            z = false;
        } else {
            this.m = true;
            if (iCeil < 0) {
                defpackage.dki.c("negative width");
            }
            if (iCeil < 0) {
                defpackage.dki.c("negative ellipsized width");
            }
            layoutK = android.os.Build.VERSION.SDK_INT >= 33 ? new android.text.BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsC, false, truncateAt, iCeil, true) : new android.text.BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsC, false, truncateAt, iCeil);
            i9 = i3;
            textDirectionHeuristic = textDirectionHeuristicA;
            z = true;
        }
        this.d = layoutK;
        int iMin = java.lang.Math.min(layoutK.getLineCount(), i9);
        this.e = iMin;
        int i14 = iMin - 1;
        this.c = iMin >= i9 && (layoutK.getEllipsisCount(i14) > 0 || layoutK.getLineEnd(i14) != charSequence.length());
        if (o() instanceof android.text.Spanned) {
            java.lang.CharSequence charSequenceO = o();
            charSequenceO.getClass();
            if (defpackage.day.l((android.text.Spanned) charSequenceO, defpackage.dhe.class) || o().length() <= 0) {
                java.lang.CharSequence charSequenceO2 = o();
                charSequenceO2.getClass();
                i10 = 0;
                dheVarArr = (defpackage.dhe[]) ((android.text.Spanned) charSequenceO2).getSpans(0, o().length(), defpackage.dhe.class);
            } else {
                dheVarArr = null;
                i10 = 0;
            }
        } else {
            dheVarArr = null;
            i10 = 0;
        }
        this.o = dheVarArr;
        if (dheVarArr != null && dheVarArr.length != 0) {
            defpackage.dhe dheVar = dheVarArr[i10];
        }
        if (dheVarArr != null && dheVarArr.length != 0) {
            defpackage.dhe dheVar2 = dheVarArr[i10];
        }
        if (z) {
            layoutK.getClass();
            i11 = 33;
            M = android.os.Build.VERSION.SDK_INT >= 33 ? ag$.ExternalSyntheticApiModelOutline0.m((android.text.BoringLayout) layoutK) : i10;
        } else {
            i11 = 33;
            layoutK.getClass();
            M = android.os.Build.VERSION.SDK_INT >= 33 ? ag$.ExternalSyntheticApiModelOutline0.m((android.text.StaticLayout) layoutK) : 1;
        }
        if (M != 0) {
            j = 0;
        } else {
            android.text.TextPaint paint = layoutK.getPaint();
            java.lang.CharSequence text = layoutK.getText();
            android.graphics.Rect rectD = defpackage.dax.d(paint, text, layoutK.getLineStart(i10), layoutK.getLineEnd(i10));
            int lineAscent = layoutK.getLineAscent(i10);
            int topPadding = rectD.top < lineAscent ? lineAscent - rectD.top : layoutK.getTopPadding();
            if (iMin != 1) {
                int i15 = iMin - 1;
                rectD = defpackage.dax.d(paint, text, layoutK.getLineStart(i15), layoutK.getLineEnd(i15));
            }
            int lineDescent = layoutK.getLineDescent(iMin - 1);
            int bottomPadding = rectD.bottom > lineDescent ? rectD.bottom - lineDescent : layoutK.getBottomPadding();
            if (topPadding == 0) {
                if (bottomPadding == 0) {
                    j = 0;
                } else {
                    topPadding = i10;
                }
            }
            j = (((long) bottomPadding) & 4294967295L) | (((long) topPadding) << 32);
        }
        long j4 = j >> 32;
        long j5 = ((long) ((int) (j & 4294967295L))) & 4294967295L;
        long j6 = ((long) ((int) j4)) << 32;
        if (dheVarArr != null) {
            int i16 = i10;
            int iMax = i16;
            int iMax2 = iMax;
            j2 = 4294967295L;
            while (i16 < dheVarArr.length) {
                defpackage.dhe dheVar3 = dheVarArr[i16];
                int i17 = dheVar3.f;
                iMax = i17 < 0 ? java.lang.Math.max(iMax, java.lang.Math.abs(i17)) : iMax;
                int i18 = dheVar3.g;
                if (i18 < 0) {
                    iMax2 = java.lang.Math.max(iMax, java.lang.Math.abs(i18));
                }
                i16++;
            }
            if (iMax == 0) {
                if (iMax2 != 0) {
                    iMax = i10;
                }
                long j7 = j5 | j6;
                this.f = java.lang.Math.max((int) (j7 >> 32), (int) (j3 >> 32));
                this.l = java.lang.Math.max((int) (j7 & j2), (int) (j3 & j2));
                android.text.TextPaint textPaint2 = this.a;
                defpackage.dhe[] dheVarArr2 = this.o;
                i12 = this.e - 1;
                if (this.d.getLineStart(i12) == this.d.getLineEnd(i12) || dheVarArr2 == null || dheVarArr2.length == 0) {
                    i13 = i10;
                    fontMetricsInt = null;
                } else {
                    android.text.SpannableString spannableString = new android.text.SpannableString("\u200b");
                    defpackage.dhe dheVar4 = (defpackage.dhe) defpackage.afga.bO(dheVarArr2);
                    int length2 = spannableString.length();
                    ?? r4 = (i12 == 0 || !dheVar4.c) ? dheVar4.c : i10;
                    float f2 = dheVar4.a;
                    boolean z3 = dheVar4.c;
                    float f3 = dheVar4.d;
                    int i19 = dheVar4.e;
                    spannableString.setSpan(new defpackage.dhe(f2, length2, r4, z3, f3), i10, spannableString.length(), i11);
                    android.text.TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                    i13 = i10;
                    android.text.StaticLayout staticLayoutK = defpackage.day.k(new defpackage.dgm(spannableString, spannableString.length(), textPaint2, Integer.MAX_VALUE, textDirectionHeuristic2, defpackage.dgi.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, 0, 0, 0, 0));
                    fontMetricsInt = new android.graphics.Paint.FontMetricsInt();
                    fontMetricsInt.ascent = staticLayoutK.getLineAscent(i13);
                    fontMetricsInt.descent = staticLayoutK.getLineDescent(i13);
                    fontMetricsInt.top = staticLayoutK.getLineTop(i13);
                    fontMetricsInt.bottom = staticLayoutK.getLineBottom(i13);
                }
                if (fontMetricsInt != null) {
                    iC = fontMetricsInt.bottom - ((int) c(i14));
                } else {
                    iC = i13;
                }
                this.n = iC;
                this.i = fontMetricsInt;
                android.text.Layout layout = this.d;
                this.g = defpackage.day.i(layout, i14, layout.getPaint());
                android.text.Layout layout2 = this.d;
                this.h = defpackage.day.j(layout2, i14, layout2.getPaint());
            }
            j3 = (((long) iMax2) & 4294967295L) | (((long) iMax) << 32);
            long j8 = j5 | j6;
            this.f = java.lang.Math.max((int) (j8 >> 32), (int) (j3 >> 32));
            this.l = java.lang.Math.max((int) (j8 & j2), (int) (j3 & j2));
            android.text.TextPaint textPaint3 = this.a;
            defpackage.dhe[] dheVarArr3 = this.o;
            i12 = this.e - 1;
            if (this.d.getLineStart(i12) == this.d.getLineEnd(i12)) {
                i13 = i10;
                fontMetricsInt = null;
            } else {
                i13 = i10;
                fontMetricsInt = null;
            }
            if (fontMetricsInt != null) {
                iC = fontMetricsInt.bottom - ((int) c(i14));
            } else {
                iC = i13;
            }
            this.n = iC;
            this.i = fontMetricsInt;
            android.text.Layout layout3 = this.d;
            this.g = defpackage.day.i(layout3, i14, layout3.getPaint());
            android.text.Layout layout4 = this.d;
            this.h = defpackage.day.j(layout4, i14, layout4.getPaint());
        }
        j2 = 4294967295L;
        j3 = 0;
        long j9 = j5 | j6;
        this.f = java.lang.Math.max((int) (j9 >> 32), (int) (j3 >> 32));
        this.l = java.lang.Math.max((int) (j9 & j2), (int) (j3 & j2));
        android.text.TextPaint textPaint4 = this.a;
        defpackage.dhe[] dheVarArr4 = this.o;
        i12 = this.e - 1;
        if (this.d.getLineStart(i12) == this.d.getLineEnd(i12)) {
            i13 = i10;
            fontMetricsInt = null;
        } else {
            i13 = i10;
            fontMetricsInt = null;
        }
        if (fontMetricsInt != null) {
            iC = fontMetricsInt.bottom - ((int) c(i14));
        } else {
            iC = i13;
        }
        this.n = iC;
        this.i = fontMetricsInt;
        android.text.Layout layout5 = this.d;
        this.g = defpackage.day.i(layout5, i14, layout5.getPaint());
        android.text.Layout layout6 = this.d;
        this.h = defpackage.day.j(layout6, i14, layout6.getPaint());
    }

    public final float a(int i) {
        if (i == this.e - 1) {
            return this.g + this.h;
        }
        return 0.0f;
    }

    public final float b(int i) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.e - 1;
        if (i == i2 && (fontMetricsInt = this.i) != null) {
            return this.d.getLineBottom(i - 1) + fontMetricsInt.bottom;
        }
        return this.f + this.d.getLineBottom(i) + (i == i2 ? this.l : 0);
    }

    public final float c(int i) {
        return b(i) - d(i);
    }

    public final float d(int i) {
        return this.d.getLineTop(i) + (i == 0 ? 0 : this.f);
    }

    public final float e(int i, boolean z) {
        return r().e(i, true, z) + a(k(i));
    }

    public final float f(int i, boolean z) {
        return r().e(i, false, z) + a(k(i));
    }

    public final int g() {
        boolean z = this.c;
        android.text.Layout layout = this.d;
        return (z ? layout.getLineBottom(this.e - 1) : layout.getHeight()) + this.f + this.l + this.n;
    }

    public final int h(int i) {
        return this.d.getEllipsisCount(i);
    }

    public final int i(int i) {
        return this.d.getEllipsisStart(i);
    }

    public final int j(int i) {
        java.lang.ThreadLocal threadLocal = defpackage.dgq.a;
        android.text.Layout layout = this.d;
        return (layout.getEllipsisCount(i) <= 0 || this.b != android.text.TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int k(int i) {
        int i2 = this.e;
        if (i2 <= 0) {
            return 0;
        }
        android.text.Layout layout = this.d;
        if (i >= layout.getText().length()) {
            return i2 - 1;
        }
        if (i <= 0) {
            return 0;
        }
        int i3 = i2 - 1;
        int lineForOffset = layout.getLineForOffset(i);
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final int l(int i) {
        return this.d.getLineStart(i);
    }

    public final int m(int i) {
        return this.d.getParagraphDirection(i);
    }

    public final defpackage.dgw n() {
        defpackage.dgw dgwVar = this.k;
        if (dgwVar != null) {
            return dgwVar;
        }
        android.text.Layout layout = this.d;
        defpackage.dgw dgwVar2 = new defpackage.dgw(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.k = dgwVar2;
        return dgwVar2;
    }

    public final java.lang.CharSequence o() {
        return this.d.getText();
    }

    public final void p(android.graphics.Canvas canvas) {
        if (canvas.getClipBounds(this.p)) {
            int i = this.f;
            if (i != 0) {
                canvas.translate(0.0f, i);
            }
            java.lang.ThreadLocal threadLocal = defpackage.dgq.a;
            java.lang.Object dgoVar = threadLocal.get();
            if (dgoVar == null) {
                dgoVar = new defpackage.dgo();
                threadLocal.set(dgoVar);
            }
            defpackage.dgo dgoVar2 = (defpackage.dgo) dgoVar;
            dgoVar2.a = canvas;
            try {
                this.d.draw(dgoVar2);
                dgoVar2.a = null;
                int i2 = this.f;
                if (i2 != 0) {
                    canvas.translate(0.0f, -i2);
                }
            } catch (java.lang.Throwable th) {
                dgoVar2.a = null;
                throw th;
            }
        }
    }

    public final boolean q(int i) {
        return this.d.isRtlCharAt(i);
    }

    public final defpackage.oln r() {
        defpackage.oln olnVar = this.q;
        if (olnVar != null) {
            return olnVar;
        }
        defpackage.oln olnVar2 = new defpackage.oln(this.d);
        this.q = olnVar2;
        return olnVar2;
    }
}
