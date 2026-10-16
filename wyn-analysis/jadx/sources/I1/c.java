package i1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import db.AbstractC2404b;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f36711a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f36712b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36713c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36714d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i5, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2404b.i(textPaint).setBreakStrategy(i5).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build();
        }
        this.f36711a = textPaint;
        this.f36712b = textDirectionHeuristic;
        this.f36713c = i5;
        this.f36714d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i5 = Build.VERSION.SDK_INT;
            if (this.f36713c == cVar.f36713c && this.f36714d == cVar.f36714d) {
                TextPaint textPaint = this.f36711a;
                float textSize = textPaint.getTextSize();
                TextPaint textPaint2 = cVar.f36711a;
                if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && (i5 < 24 ? textPaint.getTextLocale().equals(textPaint2.getTextLocale()) : textPaint.getTextLocales().equals(textPaint2.getTextLocales())) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f36712b == cVar.f36712b) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.f36712b;
        int i5 = Build.VERSION.SDK_INT;
        int i10 = this.f36714d;
        int i11 = this.f36713c;
        TextPaint textPaint = this.f36711a;
        return i5 >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i11), Integer.valueOf(i10)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f36711a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i5 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i5 >= 24) {
            sb2.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb2.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i5 >= 26) {
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb2.append(", textDir=" + this.f36712b);
        sb2.append(", breakStrategy=" + this.f36713c);
        sb2.append(", hyphenationFrequency=" + this.f36714d);
        sb2.append("}");
        return sb2.toString();
    }

    public c(PrecomputedText.Params params) {
        this.f36711a = params.getTextPaint();
        this.f36712b = params.getTextDirection();
        this.f36713c = params.getBreakStrategy();
        this.f36714d = params.getHyphenationFrequency();
    }
}
