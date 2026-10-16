package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultSliderColors implements SliderColors {
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    private DefaultSliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.thumbColor = j2;
        this.disabledThumbColor = j3;
        this.activeTrackColor = j4;
        this.inactiveTrackColor = j5;
        this.disabledActiveTrackColor = j6;
        this.disabledInactiveTrackColor = j7;
        this.activeTickColor = j8;
        this.inactiveTickColor = j9;
        this.disabledActiveTickColor = j10;
        this.disabledInactiveTickColor = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultSliderColors defaultSliderColors = (DefaultSliderColors) obj;
        return Color.m8229equalsimpl0(this.thumbColor, defaultSliderColors.thumbColor) && Color.m8229equalsimpl0(this.disabledThumbColor, defaultSliderColors.disabledThumbColor) && Color.m8229equalsimpl0(this.activeTrackColor, defaultSliderColors.activeTrackColor) && Color.m8229equalsimpl0(this.inactiveTrackColor, defaultSliderColors.inactiveTrackColor) && Color.m8229equalsimpl0(this.disabledActiveTrackColor, defaultSliderColors.disabledActiveTrackColor) && Color.m8229equalsimpl0(this.disabledInactiveTrackColor, defaultSliderColors.disabledInactiveTrackColor) && Color.m8229equalsimpl0(this.activeTickColor, defaultSliderColors.activeTickColor) && Color.m8229equalsimpl0(this.inactiveTickColor, defaultSliderColors.inactiveTickColor) && Color.m8229equalsimpl0(this.disabledActiveTickColor, defaultSliderColors.disabledActiveTickColor) && Color.m8229equalsimpl0(this.disabledInactiveTickColor, defaultSliderColors.disabledInactiveTickColor);
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.thumbColor);
        long j2 = this.disabledInactiveTickColor;
        long j3 = this.disabledActiveTickColor;
        long j4 = this.inactiveTickColor;
        long j5 = this.activeTickColor;
        long j6 = this.disabledInactiveTrackColor;
        long j7 = this.disabledActiveTrackColor;
        long j8 = this.inactiveTrackColor;
        return (((((((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.disabledThumbColor)) * 31) + Color.m8235hashCodeimpl(this.activeTrackColor)) * 31) + Color.m8235hashCodeimpl(j8)) * 31) + Color.m8235hashCodeimpl(j7)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    @Override // androidx.compose.material.SliderColors
    public State<Color> thumbColor(boolean z, Composer composer, int i2) {
        composer.startReplaceGroup(-1733795637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1733795637, i2, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1186)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(z ? this.thumbColor : this.disabledThumbColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    public State<Color> tickColor(boolean z, boolean z2, Composer composer, int i2) {
        composer.startReplaceGroup(-1491563694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1491563694, i2, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1202)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(z ? z2 ? this.activeTickColor : this.inactiveTickColor : z2 ? this.disabledActiveTickColor : this.disabledInactiveTickColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    public State<Color> trackColor(boolean z, boolean z2, Composer composer, int i2) {
        composer.startReplaceGroup(1575395620);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575395620, i2, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1191)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(z ? z2 ? this.activeTrackColor : this.inactiveTrackColor : z2 ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    public /* synthetic */ DefaultSliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }
}
