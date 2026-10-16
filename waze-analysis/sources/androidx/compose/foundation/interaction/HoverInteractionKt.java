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
public final class HoverInteractionKt {
    public static final State<Boolean> collectIsHoveredAsState(InteractionSource interactionSource, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1206586544, i2, -1, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:63)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i3 = i2 & 14;
        MutableState mutableState = (MutableState) objRememberedValue;
        boolean z = ((i3 ^ 6) > 4 && composer.changed(interactionSource)) || (i2 & 6) == 4;
        HoverInteractionKt$collectIsHoveredAsState$1$1 hoverInteractionKt$collectIsHoveredAsState$1$1RememberedValue = composer.rememberedValue();
        if (z || hoverInteractionKt$collectIsHoveredAsState$1$1RememberedValue == Composer.Companion.getEmpty()) {
            hoverInteractionKt$collectIsHoveredAsState$1$1RememberedValue = new HoverInteractionKt$collectIsHoveredAsState$1$1(interactionSource, mutableState, null);
            composer.updateRememberedValue(hoverInteractionKt$collectIsHoveredAsState$1$1RememberedValue);
        }
        EffectsKt.LaunchedEffect(interactionSource, (p<? super af, ? super e<? super ab>, ? extends Object>) hoverInteractionKt$collectIsHoveredAsState$1$1RememberedValue, composer, i3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
