package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VisibleKt {
    public static final Modifier visible(Modifier modifier, boolean z) {
        return modifier.then(new VisibilityElement(z));
    }
}
