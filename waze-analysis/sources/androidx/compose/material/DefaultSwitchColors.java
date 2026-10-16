package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultSwitchColors implements SwitchColors {
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    private DefaultSwitchColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.checkedThumbColor = j2;
        this.checkedTrackColor = j3;
        this.uncheckedThumbColor = j4;
        this.uncheckedTrackColor = j5;
        this.disabledCheckedThumbColor = j6;
        this.disabledCheckedTrackColor = j7;
        this.disabledUncheckedThumbColor = j8;
        this.disabledUncheckedTrackColor = j9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultSwitchColors defaultSwitchColors = (DefaultSwitchColors) obj;
        return Color.m8229equalsimpl0(this.checkedThumbColor, defaultSwitchColors.checkedThumbColor) && Color.m8229equalsimpl0(this.checkedTrackColor, defaultSwitchColors.checkedTrackColor) && Color.m8229equalsimpl0(this.uncheckedThumbColor, defaultSwitchColors.uncheckedThumbColor) && Color.m8229equalsimpl0(this.uncheckedTrackColor, defaultSwitchColors.uncheckedTrackColor) && Color.m8229equalsimpl0(this.disabledCheckedThumbColor, defaultSwitchColors.disabledCheckedThumbColor) && Color.m8229equalsimpl0(this.disabledCheckedTrackColor, defaultSwitchColors.disabledCheckedTrackColor) && Color.m8229equalsimpl0(this.disabledUncheckedThumbColor, defaultSwitchColors.disabledUncheckedThumbColor) && Color.m8229equalsimpl0(this.disabledUncheckedTrackColor, defaultSwitchColors.disabledUncheckedTrackColor);
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.checkedThumbColor);
        long j2 = this.disabledUncheckedTrackColor;
        long j3 = this.disabledUncheckedThumbColor;
        long j4 = this.disabledCheckedTrackColor;
        long j5 = this.disabledCheckedThumbColor;
        long j6 = this.uncheckedTrackColor;
        return (((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m8235hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    @Override // androidx.compose.material.SwitchColors
    public State<Color> thumbColor(boolean z, boolean z2, Composer composer, int i2) {
        composer.startReplaceGroup(-66424183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-66424183, i2, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:367)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(z ? z2 ? this.checkedThumbColor : this.uncheckedThumbColor : z2 ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SwitchColors
    public State<Color> trackColor(boolean z, boolean z2, Composer composer, int i2) {
        composer.startReplaceGroup(-1176343362);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1176343362, i2, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:378)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(z ? z2 ? this.checkedTrackColor : this.uncheckedTrackColor : z2 ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    public /* synthetic */ DefaultSwitchColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9);
    }
}
