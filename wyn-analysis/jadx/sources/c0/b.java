package C0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1752a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1753b;

    public b(String fontFeatureSettings) {
        AbstractC3340k.e(fontFeatureSettings, "fontFeatureSettings");
        this.f1753b = fontFeatureSettings;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f1752a) {
            case 0:
                AbstractC3340k.e(textPaint, "textPaint");
                textPaint.setFontFeatureSettings((String) this.f1753b);
                break;
            default:
                AbstractC3340k.e(textPaint, "ds");
                textPaint.setTypeface((Typeface) this.f1753b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f1752a) {
            case 0:
                AbstractC3340k.e(textPaint, "textPaint");
                textPaint.setFontFeatureSettings((String) this.f1753b);
                break;
            default:
                AbstractC3340k.e(textPaint, "paint");
                textPaint.setTypeface((Typeface) this.f1753b);
                break;
        }
    }

    public b(Typeface typeface) {
        AbstractC3340k.e(typeface, "typeface");
        this.f1753b = typeface;
    }
}
