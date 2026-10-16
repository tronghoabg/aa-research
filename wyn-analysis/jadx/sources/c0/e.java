package C0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class e implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f1756a;

    public e(float f10) {
        this.f1756a = f10;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence text, int i5, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        AbstractC3340k.e(text, "text");
        AbstractC3340k.e(fontMetricsInt, "fontMetricsInt");
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = iCeil;
        fontMetricsInt.ascent = iCeil - ((int) Math.ceil(this.f1756a));
    }
}
