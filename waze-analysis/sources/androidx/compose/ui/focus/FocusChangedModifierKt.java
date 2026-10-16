package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusChangedModifierKt {
    public static final Modifier onFocusChanged(Modifier modifier, l<? super FocusState, ab> lVar) {
        return modifier.then(new FocusChangedElement(lVar));
    }
}
