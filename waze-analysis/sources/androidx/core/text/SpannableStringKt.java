package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import h.k.j;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SpannableStringKt {
    public static final void clearSpans(Spannable spannable) {
        x.f(spannable, "<this>");
        Spannable spannable2 = spannable;
        Object[] spans = spannable2.getSpans(0, spannable2.length(), Object.class);
        x.e(spans, "getSpans(...)");
        for (Object obj : spans) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(Spannable spannable, j jVar, Object obj) {
        x.f(spannable, "<this>");
        x.f(jVar, "range");
        x.f(obj, TtmlNode.TAG_SPAN);
        spannable.setSpan(obj, jVar.getStart().intValue(), jVar.getEndInclusive().intValue(), 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        x.f(charSequence, "<this>");
        SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
        x.e(spannableStringValueOf, "valueOf(...)");
        return spannableStringValueOf;
    }

    public static final void set(Spannable spannable, int i2, int i3, Object obj) {
        x.f(spannable, "<this>");
        x.f(obj, TtmlNode.TAG_SPAN);
        spannable.setSpan(obj, i2, i3, 17);
    }
}
