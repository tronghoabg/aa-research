package androidx.compose.animation;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SharedContentNodeKt {
    private static final ProvidableModifierLocal<SharedElementEntry> ModifierLocalSharedElementInternalState = ModifierLocalKt.modifierLocalOf(SharedContentNodeKt$ModifierLocalSharedElementInternalState$1.INSTANCE);

    public static final ProvidableModifierLocal<SharedElementEntry> getModifierLocalSharedElementInternalState() {
        return ModifierLocalSharedElementInternalState;
    }
}
