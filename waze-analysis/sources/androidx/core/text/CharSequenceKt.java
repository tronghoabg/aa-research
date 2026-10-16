package androidx.core.text;

import android.text.TextUtils;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CharSequenceKt {
    public static final boolean isDigitsOnly(CharSequence charSequence) {
        x.f(charSequence, "<this>");
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int trimmedLength(CharSequence charSequence) {
        x.f(charSequence, "<this>");
        return TextUtils.getTrimmedLength(charSequence);
    }
}
