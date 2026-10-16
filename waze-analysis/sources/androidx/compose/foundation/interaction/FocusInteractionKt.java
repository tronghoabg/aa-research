package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import h.ab;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusInteractionKt {
    public static final State<Boolean> collectIsFocusedAsState(InteractionSource interactionSource, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1805515472, i2, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:63)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i3 = i2 & 14;
        MutableState mutableState = (MutableState) objRememberedValue;
        boolean z = ((i3 ^ 6) > 4 && composer.changed(interactionSource)) || (i2 & 6) == 4;
        FocusInteractionKt$collectIsFocusedAsState$1$1 focusInteractionKt$collectIsFocusedAsState$1$1RememberedValue = composer.rememberedValue();
        if (z || focusInteractionKt$collectIsFocusedAsState$1$1RememberedValue == Composer.Companion.getEmpty()) {
            focusInteractionKt$collectIsFocusedAsState$1$1RememberedValue = new FocusInteractionKt$collectIsFocusedAsState$1$1(interactionSource, mutableState, null);
            composer.updateRememberedValue(focusInteractionKt$collectIsFocusedAsState$1$1RememberedValue);
        }
        EffectsKt.LaunchedEffect(interactionSource, (p<? super af, ? super e<? super ab>, ? extends Object>) focusInteractionKt$collectIsFocusedAsState$1$1RememberedValue, composer, i3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
