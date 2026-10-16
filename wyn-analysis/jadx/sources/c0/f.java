package C0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class f implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f1757a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1758b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1759c;

    /* renamed from: d, reason: collision with root package name */
    public int f1760d;

    /* renamed from: e, reason: collision with root package name */
    public int f1761e;

    /* renamed from: f, reason: collision with root package name */
    public int f1762f;

    /* renamed from: g, reason: collision with root package name */
    public int f1763g;

    /* renamed from: h, reason: collision with root package name */
    public int f1764h;

    /* renamed from: i, reason: collision with root package name */
    public int f1765i;

    public f(float f10, int i5, int i10) {
        this.f1757a = f10;
        this.f1758b = i5;
        this.f1759c = i10;
        if ((i10 < 0 || i10 >= 101) && i10 != -1) {
            throw new IllegalStateException("topRatio should be in [0..100] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence text, int i5, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        AbstractC3340k.e(text, "text");
        AbstractC3340k.e(fontMetricsInt, "fontMetricsInt");
        int i13 = fontMetricsInt.descent;
        int i14 = fontMetricsInt.ascent;
        if (i13 - i14 <= 0) {
            return;
        }
        boolean z2 = i5 == 0;
        boolean z10 = i10 == this.f1758b;
        if (z2 && z10) {
            return;
        }
        if (z2) {
            int iCeil = (int) Math.ceil(this.f1757a);
            int i15 = iCeil - (i13 - i14);
            int iAbs = this.f1759c;
            if (iAbs == -1) {
                iAbs = (int) ((Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent)) * 100.0f);
            }
            int iCeil2 = (int) (i15 <= 0 ? Math.ceil((i15 * iAbs) / 100.0f) : Math.ceil(((100 - iAbs) * i15) / 100.0f));
            int i16 = fontMetricsInt.descent;
            int i17 = iCeil2 + i16;
            this.f1762f = i17;
            this.f1761e = i17 - iCeil;
            this.f1760d = fontMetricsInt.ascent;
            this.f1763g = i16;
            this.f1764h = 0;
            this.f1765i = 0;
        }
        fontMetricsInt.ascent = z2 ? this.f1760d : this.f1761e;
        fontMetricsInt.descent = z10 ? this.f1763g : this.f1762f;
    }
}
