package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SpannedStringKt {
    public static final /* synthetic */ <T> T[] getSpans(Spanned spanned, int i2, int i3) {
        x.f(spanned, "<this>");
        x.i();
        Object[] spans = spanned.getSpans(i2, i3, Object.class);
        x.e(spans, "getSpans(...)");
        return (T[]) spans;
    }

    public static /* synthetic */ Object[] getSpans$default(Spanned spanned, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = spanned.length();
        }
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        x.f(spanned, "<this>");
        x.i();
        Object[] spans = spanned.getSpans(i2, i3, Object.class);
        x.e(spans, "getSpans(...)");
        return spans;
    }

    public static final Spanned toSpanned(CharSequence charSequence) {
        x.f(charSequence, "<this>");
        SpannedString spannedStringValueOf = SpannedString.valueOf(charSequence);
        x.e(spannedStringValueOf, "valueOf(...)");
        return spannedStringValueOf;
    }
}
