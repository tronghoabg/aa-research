package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.intl.Locale;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InputTransformationKt {
    public static final InputTransformation allCaps(InputTransformation inputTransformation, Locale locale) {
        return then(inputTransformation, new AllCapsTransformation(locale));
    }

    public static final InputTransformation byValue(InputTransformation inputTransformation, p<? super CharSequence, ? super CharSequence, ? extends CharSequence> pVar) {
        return then(inputTransformation, new InputTransformationByValue(pVar));
    }

    public static final InputTransformation maxLength(InputTransformation inputTransformation, int i2) {
        return then(inputTransformation, new MaxLengthFilter(i2));
    }

    public static final InputTransformation then(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return new FilterChain(inputTransformation, inputTransformation2);
    }
}
