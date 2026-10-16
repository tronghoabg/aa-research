package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SoftwareKeyboardInterceptionModifierKt {
    public static final Modifier onInterceptKeyBeforeSoftKeyboard(Modifier modifier, l<? super KeyEvent, Boolean> lVar) {
        return modifier.then(new SoftKeyboardInterceptionElement(lVar, null));
    }

    public static final Modifier onPreInterceptKeyBeforeSoftKeyboard(Modifier modifier, l<? super KeyEvent, Boolean> lVar) {
        return modifier.then(new SoftKeyboardInterceptionElement(null, lVar));
    }
}
