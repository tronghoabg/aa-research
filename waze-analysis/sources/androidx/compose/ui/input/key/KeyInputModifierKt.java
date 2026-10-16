package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class KeyInputModifierKt {
    public static final Modifier onKeyEvent(Modifier modifier, l<? super KeyEvent, Boolean> lVar) {
        return modifier.then(new KeyInputElement(lVar, null));
    }

    public static final Modifier onPreviewKeyEvent(Modifier modifier, l<? super KeyEvent, Boolean> lVar) {
        return modifier.then(new KeyInputElement(null, lVar));
    }
}
