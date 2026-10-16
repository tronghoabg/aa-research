package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RotaryInputModifierKt {
    public static final Modifier onPreRotaryScrollEvent(Modifier modifier, l<? super RotaryScrollEvent, Boolean> lVar) {
        return modifier.then(new RotaryInputElement(null, lVar));
    }

    public static final Modifier onRotaryScrollEvent(Modifier modifier, l<? super RotaryScrollEvent, Boolean> lVar) {
        return modifier.then(new RotaryInputElement(lVar, null));
    }
}
