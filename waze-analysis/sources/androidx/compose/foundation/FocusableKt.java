package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusableKt {
    public static final Modifier focusGroup(Modifier modifier) {
        return modifier.then(FocusGroupElement.INSTANCE);
    }

    public static final Modifier focusable(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource) {
        return modifier.then(z ? new FocusableElement(mutableInteractionSource) : Modifier.Companion);
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, 1 == ((z ? 1 : 0) | (i2 & 1)), mutableInteractionSource);
    }
}
