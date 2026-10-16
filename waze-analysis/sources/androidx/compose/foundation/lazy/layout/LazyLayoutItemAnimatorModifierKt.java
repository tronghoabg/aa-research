package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimatorModifierKt {
    public static final Modifier lazyLayoutItemAnimator(Modifier modifier, LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
        return modifier.then(new DisplayingDisappearingItemsElement(lazyLayoutItemAnimator));
    }
}
