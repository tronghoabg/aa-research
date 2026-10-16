package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.c.e;
import h.g.a.p;
import h.g.b.o;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultButtonElevation implements ButtonElevation {
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    private DefaultButtonElevation(float f2, float f3, float f4, float f5, float f6) {
        this.defaultElevation = f2;
        this.pressedElevation = f3;
        this.disabledElevation = f4;
        this.hoveredElevation = f5;
        this.focusedElevation = f6;
    }

    @Override // androidx.compose.material.ButtonElevation
    public State<Dp> elevation(boolean z, InteractionSource interactionSource, Composer composer, int i2) {
        Animatable animatable;
        composer.startReplaceGroup(-1588756907);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1588756907, i2, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:500)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        boolean z2 = true;
        boolean z3 = (((i2 & 112) ^ 48) > 32 && composer.changed(interactionSource)) || (i2 & 48) == 32;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (p) new DefaultButtonElevation$elevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(interactionSource, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue2, composer, (i2 >> 3) & 14);
        Interaction interaction = (Interaction) i.U(snapshotStateList);
        float f2 = !z ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
            Object animatable2 = new Animatable(Dp.m11162boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(animatable2);
            objRememberedValue3 = animatable2;
        }
        Animatable animatable3 = (Animatable) objRememberedValue3;
        Dp dpM11162boximpl = Dp.m11162boximpl(f2);
        boolean zChangedInstance = composer.changedInstance(animatable3) | composer.changed(f2) | ((((i2 & 14) ^ 6) > 4 && composer.changed(z)) || (i2 & 6) == 4);
        if ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) <= 256 || !composer.changed(this)) && (i2 & 384) != 256) {
            z2 = false;
        }
        boolean zChangedInstance2 = zChangedInstance | z2 | composer.changedInstance(interaction);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            animatable = animatable3;
            objRememberedValue4 = (p) new DefaultButtonElevation$elevation$2$1(animatable, f2, z, this, interaction, null);
            composer.updateRememberedValue(objRememberedValue4);
        } else {
            animatable = animatable3;
        }
        EffectsKt.LaunchedEffect(dpM11162boximpl, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue4, composer, 0);
        State<Dp> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateAsState;
    }

    public /* synthetic */ DefaultButtonElevation(float f2, float f3, float f4, float f5, float f6, o oVar) {
        this(f2, f3, f4, f5, f6);
    }
}
