package androidx.compose.ui.autofill;

import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AutofillUtils_androidKt {
    public static final int MAX_AUTOFILL_TEXT_LENGTH = 5000;

    public static final CharSequence trimToSafeLength(CharSequence charSequence) {
        return charSequence.length() <= 5000 ? charSequence : (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? o.J(charSequence, 4999) : o.J(charSequence, 5000);
    }
}
