package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldDefaultsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final State<BorderStroke> m4264animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f2, float f3, Composer composer, int i2) {
        State<Dp> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1097899920, i2, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:955)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i2 >> 6) & 14);
        State<Color> stateIndicatorColor = textFieldColors.indicatorColor(z, z2, interactionSource, composer, i2 & 8190);
        float f4 = true != animateBorderStrokeAsState_NuRrP5Q$lambda$0(stateCollectIsFocusedAsState) ? f3 : f2;
        if (z) {
            composer.startReplaceGroup(1361082574);
            stateRememberUpdatedState = AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(f4, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1361186796);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Dp.m11162boximpl(f3), composer, (i2 >> 15) & 14);
            composer.endReplaceGroup();
        }
        State<BorderStroke> stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new BorderStroke(stateRememberUpdatedState.getValue().m11178unboximpl(), new SolidColor(stateIndicatorColor.getValue().m8238unboximpl(), null), null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState2;
    }

    private static final boolean animateBorderStrokeAsState_NuRrP5Q$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
