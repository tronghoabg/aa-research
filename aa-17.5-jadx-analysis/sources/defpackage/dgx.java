package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dgx implements LineHeightSpan {
    public final float a;
    public final boolean b;
    public final boolean c;
    public final float d;
    public int f;
    public int g;
    private final int h;
    public final int e = 0;
    private int i = Integer.MIN_VALUE;
    private int j = Integer.MIN_VALUE;
    private int k = Integer.MIN_VALUE;
    private int l = Integer.MIN_VALUE;

    public dgx(float f, int i, boolean z, boolean z2, float f2) {
        this.a = f;
        this.h = i;
        this.b = z;
        this.c = z2;
        this.d = f2;
        if ((f2 < BitmapDescriptorFactory.HUE_RED || f2 > 1.0f) && f2 != -1.0f) {
            dka.d("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.h;
        if (z && z2 && this.b && this.c) {
            return;
        }
        if (this.i == Integer.MIN_VALUE) {
            int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
            float fCeil = (float) Math.ceil(this.a);
            float fAbs = this.d;
            if (fAbs == -1.0f) {
                fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int i6 = (int) fCeil;
            int iCeil = fontMetricsInt.descent + ((int) (i6 - i5 <= 0 ? Math.ceil(r5 * fAbs) : Math.ceil(r5 * (1.0f - fAbs))));
            this.k = iCeil;
            int i7 = iCeil - i6;
            this.j = i7;
            if (this.b) {
                i7 = fontMetricsInt.ascent;
            }
            this.i = i7;
            this.l = this.c ? fontMetricsInt.descent : this.k;
            this.f = fontMetricsInt.ascent - this.i;
            this.g = this.l - fontMetricsInt.descent;
        }
        fontMetricsInt.ascent = z ? this.i : this.j;
        fontMetricsInt.descent = z2 ? this.l : this.k;
    }
}
