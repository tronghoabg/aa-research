package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RippleKt {
    private static final TweenSpec<Float> DefaultTweenSpec = new TweenSpec<>(15, 0, EasingKt.getLinearEasing(), 2, null);

    /* renamed from: createRippleModifierNode-TDGSqEk, reason: not valid java name */
    public static final DelegatableNode m4310createRippleModifierNodeTDGSqEk(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, a<RippleAlpha> aVar) {
        return Ripple_androidKt.m4316createPlatformRippleNodeTDGSqEk(interactionSource, z, f2, colorProducer, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec<Float> incomingStateLayerAnimationSpecFor(Interaction interaction) {
        return interaction instanceof HoverInteraction.Enter ? DefaultTweenSpec : interaction instanceof FocusInteraction.Focus ? new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null) : interaction instanceof DragInteraction.Start ? new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null) : DefaultTweenSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec<Float> outgoingStateLayerAnimationSpecFor(Interaction interaction) {
        return interaction instanceof HoverInteraction.Enter ? DefaultTweenSpec : interaction instanceof FocusInteraction.Focus ? DefaultTweenSpec : interaction instanceof DragInteraction.Start ? new TweenSpec(150, 0, EasingKt.getLinearEasing(), 2, null) : DefaultTweenSpec;
    }

    /* renamed from: rememberRipple-9IZ8Weo, reason: not valid java name */
    public static final Indication m4311rememberRipple9IZ8Weo(boolean z, float f2, long j2, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1635163520, i2, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:144)");
        }
        boolean z2 = true;
        boolean z3 = 1 == ((z ? 1 : 0) | (i3 & 1));
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(j2), composer, (i2 >> 6) & 14);
        boolean z4 = (((i2 & 14) ^ 6) > 4 && composer.changed(z3)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(f2)) && (i2 & 48) != 32) {
            z2 = false;
        }
        boolean z5 = z4 | z2;
        Object objRememberedValue = composer.rememberedValue();
        if (z5 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new PlatformRipple(z3, f2, stateRememberUpdatedState, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        PlatformRipple platformRipple = (PlatformRipple) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return platformRipple;
    }
}
