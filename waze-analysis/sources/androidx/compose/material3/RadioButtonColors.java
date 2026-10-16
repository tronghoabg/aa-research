package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RadioButtonColors {
    public static final int $stable = 0;
    private final long disabledSelectedColor;
    private final long disabledUnselectedColor;
    private final long selectedColor;
    private final long unselectedColor;

    private RadioButtonColors(long j2, long j3, long j4, long j5) {
        this.selectedColor = j2;
        this.unselectedColor = j3;
        this.disabledSelectedColor = j4;
        this.disabledUnselectedColor = j5;
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RadioButtonColors m5393copyjRlVdoo$default(RadioButtonColors radioButtonColors, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = radioButtonColors.selectedColor;
        }
        long j6 = j2;
        if ((i2 & 2) != 0) {
            j3 = radioButtonColors.unselectedColor;
        }
        long j7 = j3;
        if ((i2 & 4) != 0) {
            j4 = radioButtonColors.disabledSelectedColor;
        }
        return radioButtonColors.m5394copyjRlVdoo(j6, j7, j4, (i2 & 8) != 0 ? radioButtonColors.disabledUnselectedColor : j5);
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final RadioButtonColors m5394copyjRlVdoo(long j2, long j3, long j4, long j5) {
        return new RadioButtonColors(j2 != 16 ? j2 : this.selectedColor, j3 != 16 ? j3 : this.unselectedColor, j4 != 16 ? j4 : this.disabledSelectedColor, j5 != 16 ? j5 : this.disabledUnselectedColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) obj;
        return Color.m8229equalsimpl0(this.selectedColor, radioButtonColors.selectedColor) && Color.m8229equalsimpl0(this.unselectedColor, radioButtonColors.unselectedColor) && Color.m8229equalsimpl0(this.disabledSelectedColor, radioButtonColors.disabledSelectedColor) && Color.m8229equalsimpl0(this.disabledUnselectedColor, radioButtonColors.disabledUnselectedColor);
    }

    /* renamed from: getDisabledSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m5395getDisabledSelectedColor0d7_KjU() {
        return this.disabledSelectedColor;
    }

    /* renamed from: getDisabledUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m5396getDisabledUnselectedColor0d7_KjU() {
        return this.disabledUnselectedColor;
    }

    /* renamed from: getSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m5397getSelectedColor0d7_KjU() {
        return this.selectedColor;
    }

    /* renamed from: getUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m5398getUnselectedColor0d7_KjU() {
        return this.unselectedColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.selectedColor);
        long j2 = this.disabledUnselectedColor;
        return (((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.unselectedColor)) * 31) + Color.m8235hashCodeimpl(this.disabledSelectedColor)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    public final State<Color> radioColor$material3(boolean z, boolean z2, Composer composer, int i2) {
        long j2;
        State<Color> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1840145292, i2, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:230)");
        }
        if (z && z2) {
            j2 = this.selectedColor;
        } else if (z) {
            j2 = this.unselectedColor;
        } else if (z2) {
            j2 = this.disabledSelectedColor;
        } else {
            j2 = this.disabledUnselectedColor;
            z = false;
        }
        if (z) {
            composer.startReplaceGroup(1194671677);
            stateRememberUpdatedState = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(j2, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1194849338);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(j2), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    public /* synthetic */ RadioButtonColors(long j2, long j3, long j4, long j5, o oVar) {
        this(j2, j3, j4, j5);
    }
}
