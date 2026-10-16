package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dgi {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final Layout d;
    public final int e;
    public final int f;
    public final float g;
    public final float h;
    public final Paint.FontMetricsInt i;
    public final Rect j = new Rect();
    private final dgd k;
    private dgp l;
    private final int m;
    private final boolean n;
    private final int o;
    private final dgx[] p;
    private okv q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dgi(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, defpackage.dgd r36) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgi.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, int, int, int, int, int, int, dgd):void");
    }

    public final float a(int i) {
        return i == this.e + (-1) ? this.g + this.h : BitmapDescriptorFactory.HUE_RED;
    }

    public final float b(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.e - 1;
        if (i == i2 && (fontMetricsInt = this.i) != null) {
            return this.d.getLineBottom(i - 1) + fontMetricsInt.bottom;
        }
        return this.f + this.d.getLineBottom(i) + (i == i2 ? this.m : 0);
    }

    public final float c(int i) {
        return b(i) - d(i);
    }

    public final float d(int i) {
        return this.d.getLineTop(i) + (i == 0 ? 0 : this.f);
    }

    public final float e(int i, boolean z) {
        return q().e(i, true, z) + a(k(i));
    }

    public final float f(int i, boolean z) {
        return q().e(i, false, z) + a(k(i));
    }

    public final int g() {
        boolean z = this.c;
        Layout layout = this.d;
        return (z ? layout.getLineBottom(this.e - 1) : layout.getHeight()) + this.f + this.m + this.o;
    }

    public final int h(int i) {
        return this.d.getEllipsisCount(i);
    }

    public final int i(int i) {
        return this.d.getEllipsisStart(i);
    }

    public final int j(int i) {
        ThreadLocal threadLocal = dgj.a;
        Layout layout = this.d;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int k(int i) {
        int i2 = this.e;
        if (i2 <= 0) {
            return 0;
        }
        Layout layout = this.d;
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

    public final dgp n() {
        dgp dgpVar = this.l;
        if (dgpVar != null) {
            return dgpVar;
        }
        Layout layout = this.d;
        dgp dgpVar2 = new dgp(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.l = dgpVar2;
        return dgpVar2;
    }

    public final CharSequence o() {
        return this.d.getText();
    }

    public final boolean p(int i) {
        return this.d.isRtlCharAt(i);
    }

    public final okv q() {
        okv okvVar = this.q;
        if (okvVar != null) {
            return okvVar;
        }
        okv okvVar2 = new okv(this.d);
        this.q = okvVar2;
        return okvVar2;
    }
}
