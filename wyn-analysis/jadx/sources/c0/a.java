package C0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1750a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1751b;

    public /* synthetic */ a(float f10, int i5) {
        this.f1750a = i5;
        this.f1751b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f1750a) {
            case 0:
                AbstractC3340k.e(textPaint, "textPaint");
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f1751b);
                break;
            default:
                AbstractC3340k.e(textPaint, "textPaint");
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f1751b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f1750a) {
            case 0:
                AbstractC3340k.e(textPaint, "textPaint");
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f1751b);
                break;
            default:
                AbstractC3340k.e(textPaint, "textPaint");
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f1751b);
                break;
        }
    }
}
