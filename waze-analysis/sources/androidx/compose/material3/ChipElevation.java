package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import h.a.i;
import h.ab;
import h.c.e;
import h.g.a.p;
import h.g.b.o;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ChipElevation {
    public static final int $stable = 0;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float elevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    private ChipElevation(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.elevation = f2;
        this.pressedElevation = f3;
        this.focusedElevation = f4;
        this.hoveredElevation = f5;
        this.draggedElevation = f6;
        this.disabledElevation = f7;
    }

    private final State<Dp> animateElevation(boolean z, InteractionSource interactionSource, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2071499570, i2, -1, "androidx.compose.material3.ChipElevation.animateElevation (Chip.kt:3606)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState = (MutableState) objRememberedValue2;
        boolean z2 = true;
        boolean z3 = (((i2 & 112) ^ 48) > 32 && composer.changed(interactionSource)) || (i2 & 48) == 32;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = (p) new ChipElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.LaunchedEffect(interactionSource, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue3, composer, (i2 >> 3) & 14);
        Interaction interaction = (Interaction) i.U(snapshotStateList);
        float f2 = !z ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : interaction instanceof DragInteraction.Start ? this.draggedElevation : this.elevation;
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
            Object animatable = new Animatable(Dp.m11162boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(animatable);
            objRememberedValue4 = animatable;
        }
        Animatable animatable2 = (Animatable) objRememberedValue4;
        Dp dpM11162boximpl = Dp.m11162boximpl(f2);
        boolean zChangedInstance = composer.changedInstance(animatable2) | composer.changed(f2);
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(z)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean zChangedInstance2 = zChangedInstance | z2 | composer.changedInstance(interaction);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
            objRememberedValue5 = (p) new ChipElevation$animateElevation$2$1(animatable2, f2, z, interaction, mutableState, null);
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.LaunchedEffect(dpM11162boximpl, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue5, composer, 0);
        State<Dp> stateAsState = animatable2.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interaction animateElevation$lambda$2(MutableState<Interaction> mutableState) {
        return mutableState.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipElevation)) {
            return false;
        }
        ChipElevation chipElevation = (ChipElevation) obj;
        return Dp.m11169equalsimpl0(this.elevation, chipElevation.elevation) && Dp.m11169equalsimpl0(this.pressedElevation, chipElevation.pressedElevation) && Dp.m11169equalsimpl0(this.focusedElevation, chipElevation.focusedElevation) && Dp.m11169equalsimpl0(this.hoveredElevation, chipElevation.hoveredElevation) && Dp.m11169equalsimpl0(this.disabledElevation, chipElevation.disabledElevation);
    }

    /* renamed from: getDisabledElevation-D9Ej5fM, reason: not valid java name */
    public final float m4510getDisabledElevationD9Ej5fM() {
        return this.disabledElevation;
    }

    /* renamed from: getDraggedElevation-D9Ej5fM, reason: not valid java name */
    public final float m4511getDraggedElevationD9Ej5fM() {
        return this.draggedElevation;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m4512getElevationD9Ej5fM() {
        return this.elevation;
    }

    /* renamed from: getFocusedElevation-D9Ej5fM, reason: not valid java name */
    public final float m4513getFocusedElevationD9Ej5fM() {
        return this.focusedElevation;
    }

    /* renamed from: getHoveredElevation-D9Ej5fM, reason: not valid java name */
    public final float m4514getHoveredElevationD9Ej5fM() {
        return this.hoveredElevation;
    }

    /* renamed from: getPressedElevation-D9Ej5fM, reason: not valid java name */
    public final float m4515getPressedElevationD9Ej5fM() {
        return this.pressedElevation;
    }

    public int hashCode() {
        return (((((((Dp.m11170hashCodeimpl(this.elevation) * 31) + Dp.m11170hashCodeimpl(this.pressedElevation)) * 31) + Dp.m11170hashCodeimpl(this.focusedElevation)) * 31) + Dp.m11170hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m11170hashCodeimpl(this.disabledElevation);
    }

    public final State<Dp> shadowElevation$material3(boolean z, InteractionSource interactionSource, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1881877139, i2, -1, "androidx.compose.material3.ChipElevation.shadowElevation (Chip.kt:3598)");
        }
        State<Dp> stateAnimateElevation = animateElevation(z, interactionSource, composer, i2 & 1022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateElevation;
    }

    public /* synthetic */ ChipElevation(float f2, float f3, float f4, float f5, float f6, float f7, o oVar) {
        this(f2, f3, f4, f5, f6, f7);
    }
}
