package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultChipColors implements ChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconContentColor;
    private final long leadingIconContentColor;

    private DefaultChipColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.backgroundColor = j2;
        this.contentColor = j3;
        this.leadingIconContentColor = j4;
        this.disabledBackgroundColor = j5;
        this.disabledContentColor = j6;
        this.disabledLeadingIconContentColor = j7;
    }

    @Override // androidx.compose.material.ChipColors
    public State<Color> backgroundColor(boolean z, Composer composer, int i2) {
        composer.startReplaceGroup(-1593588247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1593588247, i2, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:576)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(z ? this.backgroundColor : this.disabledBackgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.ChipColors
    public State<Color> contentColor(boolean z, Composer composer, int i2) {
        composer.startReplaceGroup(483145880);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(483145880, i2, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:581)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(z ? this.contentColor : this.disabledContentColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultChipColors defaultChipColors = (DefaultChipColors) obj;
        return Color.m8229equalsimpl0(this.backgroundColor, defaultChipColors.backgroundColor) && Color.m8229equalsimpl0(this.contentColor, defaultChipColors.contentColor) && Color.m8229equalsimpl0(this.leadingIconContentColor, defaultChipColors.leadingIconContentColor) && Color.m8229equalsimpl0(this.disabledBackgroundColor, defaultChipColors.disabledBackgroundColor) && Color.m8229equalsimpl0(this.disabledContentColor, defaultChipColors.disabledContentColor) && Color.m8229equalsimpl0(this.disabledLeadingIconContentColor, defaultChipColors.disabledLeadingIconContentColor);
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.backgroundColor);
        long j2 = this.disabledLeadingIconContentColor;
        long j3 = this.disabledContentColor;
        long j4 = this.disabledBackgroundColor;
        return (((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.contentColor)) * 31) + Color.m8235hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    @Override // androidx.compose.material.ChipColors
    public State<Color> leadingIconContentColor(boolean z, Composer composer, int i2) {
        composer.startReplaceGroup(1955749013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1955749013, i2, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:586)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(z ? this.leadingIconContentColor : this.disabledLeadingIconContentColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    public /* synthetic */ DefaultChipColors(long j2, long j3, long j4, long j5, long j6, long j7, o oVar) {
        this(j2, j3, j4, j5, j6, j7);
    }
}
