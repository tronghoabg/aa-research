package C0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class d extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f1755a;

    public d(float f10) {
        this.f1755a = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC3340k.e(textPaint, "textPaint");
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        textPaint.setLetterSpacing(this.f1755a / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        AbstractC3340k.e(textPaint, "textPaint");
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        textPaint.setLetterSpacing(this.f1755a / textScaleX);
    }
}
