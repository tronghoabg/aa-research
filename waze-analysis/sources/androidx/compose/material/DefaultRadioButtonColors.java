package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultRadioButtonColors implements RadioButtonColors {
    private final long disabledColor;
    private final long selectedColor;
    private final long unselectedColor;

    private DefaultRadioButtonColors(long j2, long j3, long j4) {
        this.selectedColor = j2;
        this.unselectedColor = j3;
        this.disabledColor = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) obj;
        return Color.m8229equalsimpl0(this.selectedColor, defaultRadioButtonColors.selectedColor) && Color.m8229equalsimpl0(this.unselectedColor, defaultRadioButtonColors.unselectedColor) && Color.m8229equalsimpl0(this.disabledColor, defaultRadioButtonColors.disabledColor);
    }

    public int hashCode() {
        return (((Color.m8235hashCodeimpl(this.selectedColor) * 31) + Color.m8235hashCodeimpl(this.unselectedColor)) * 31) + Color.m8235hashCodeimpl(this.disabledColor);
    }

    @Override // androidx.compose.material.RadioButtonColors
    public State<Color> radioColor(boolean z, boolean z2, Composer composer, int i2) {
        Composer composer2;
        State<Color> stateRememberUpdatedState;
        composer.startReplaceGroup(1243421834);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1243421834, i2, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:176)");
        }
        long j2 = !z ? this.disabledColor : !z2 ? this.unselectedColor : this.selectedColor;
        if (z) {
            composer.startReplaceGroup(-1312667467);
            composer2 = composer;
            stateRememberUpdatedState = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(-1312564764);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(j2), composer2, 0);
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    public /* synthetic */ DefaultRadioButtonColors(long j2, long j3, long j4, o oVar) {
        this(j2, j3, j4);
    }
}
