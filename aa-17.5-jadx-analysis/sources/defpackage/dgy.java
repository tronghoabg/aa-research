package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dgy extends ReplacementSpan {
    public final int a;
    private final float b;
    private final int c;
    private final float d;
    private final int e;
    private final float f;
    private final float g;
    private Paint.FontMetricsInt h;
    private int i;
    private int j;
    private boolean k;

    public dgy(float f, int i, float f2, int i2, dlg dlgVar) {
        float fEz = BitmapDescriptorFactory.HUE_RED;
        float fEz2 = i == 0 ? dlgVar.ez(dln.g(4294967296L, f)) : 0.0f;
        fEz = i2 == 0 ? dlgVar.ez(dln.g(4294967296L, f2)) : fEz;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = i2;
        this.f = fEz2;
        this.g = fEz;
        this.a = 6;
    }

    public final int a() {
        if (!this.k) {
            dka.d("PlaceholderSpan is not laid out yet.");
        }
        return this.j;
    }

    public final int b() {
        if (!this.k) {
            dka.d("PlaceholderSpan is not laid out yet.");
        }
        return this.i;
    }

    public final Paint.FontMetricsInt c() {
        Paint.FontMetricsInt fontMetricsInt = this.h;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        affa.d("fontMetrics");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getSize(android.graphics.Paint r2, java.lang.CharSequence r3, int r4, int r5, android.graphics.Paint.FontMetricsInt r6) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgy.getSize(android.graphics.Paint, java.lang.CharSequence, int, int, android.graphics.Paint$FontMetricsInt):int");
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
