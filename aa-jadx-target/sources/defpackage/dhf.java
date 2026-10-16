package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dhf extends android.text.style.ReplacementSpan {
    public final int a;
    private final float b;
    private final int c;
    private final float d;
    private final int e;
    private final float f;
    private final float g;
    private android.graphics.Paint.FontMetricsInt h;
    private int i;
    private int j;
    private boolean k;

    public dhf(float f, int i, float f2, int i2, defpackage.dlo dloVar) {
        float fDH = i == 0 ? dloVar.dH(defpackage.dmh.h(4294967296L, f)) : 0.0f;
        float fDH2 = i2 == 0 ? dloVar.dH(defpackage.dmh.h(4294967296L, f2)) : 0.0f;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = i2;
        this.f = fDH;
        this.g = fDH2;
        this.a = 6;
    }

    public final int a() {
        if (!this.k) {
            defpackage.dki.d("PlaceholderSpan is not laid out yet.");
        }
        return this.j;
    }

    public final int b() {
        if (!this.k) {
            defpackage.dki.d("PlaceholderSpan is not laid out yet.");
        }
        return this.i;
    }

    public final android.graphics.Paint.FontMetricsInt c() {
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.h;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        defpackage.afga.d("fontMetrics");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        this.k = true;
        float textSize = paint.getTextSize();
        this.h = paint.getFontMetricsInt();
        if (c().descent <= c().ascent) {
            defpackage.dki.c("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.c;
        if (i3 == 0) {
            f = this.f;
        } else {
            if (i3 != 1) {
                defpackage.dki.a("Unsupported unit.");
                throw new defpackage.afap();
            }
            f = this.b * textSize;
        }
        this.i = defpackage.dax.m(f);
        int i4 = this.e;
        if (i4 == 0) {
            f2 = this.g;
        } else {
            if (i4 != 1) {
                defpackage.dki.a("Unsupported unit.");
                throw new defpackage.afap();
            }
            f2 = this.d * textSize;
        }
        this.j = defpackage.dax.m(f2);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = c().ascent;
            fontMetricsInt.descent = c().descent;
            fontMetricsInt.leading = c().leading;
            int i5 = this.a;
            if (i5 != 0) {
                if (i5 == 1) {
                    if (fontMetricsInt.ascent + a() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + a();
                    }
                } else if (i5 == 2) {
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - a()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - a();
                    }
                } else if (i5 != 4) {
                    if (i5 != 5) {
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < a()) {
                            fontMetricsInt.ascent -= (a() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2;
                            fontMetricsInt.descent = fontMetricsInt.ascent + a();
                        }
                    } else if (fontMetricsInt.ascent > fontMetricsInt.descent - a()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - a();
                    }
                } else if (fontMetricsInt.ascent + a() > fontMetricsInt.descent) {
                    fontMetricsInt.descent = fontMetricsInt.ascent + a();
                }
            } else if (fontMetricsInt.ascent > (-a())) {
                fontMetricsInt.ascent = -a();
            }
            fontMetricsInt.top = java.lang.Math.min(c().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = java.lang.Math.max(c().bottom, fontMetricsInt.descent);
        }
        return b();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
    }
}
