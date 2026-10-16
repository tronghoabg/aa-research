package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultSelectableChipColors implements SelectableChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconColor;
    private final long leadingIconColor;
    private final long selectedBackgroundColor;
    private final long selectedContentColor;
    private final long selectedLeadingIconColor;

    private DefaultSelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.backgroundColor = j2;
        this.contentColor = j3;
        this.leadingIconColor = j4;
        this.disabledBackgroundColor = j5;
        this.disabledContentColor = j6;
        this.disabledLeadingIconColor = j7;
        this.selectedBackgroundColor = j8;
        this.selectedContentColor = j9;
        this.selectedLeadingIconColor = j10;
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State<Color> backgroundColor(boolean z, boolean z2, Composer composer, int i2) {
        composer.startReplaceGroup(-403836585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-403836585, i2, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:636)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(!z ? this.disabledBackgroundColor : !z2 ? this.backgroundColor : this.selectedBackgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State<Color> contentColor(boolean z, boolean z2, Composer composer, int i2) {
        composer.startReplaceGroup(2025240134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025240134, i2, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:647)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(!z ? this.disabledContentColor : !z2 ? this.contentColor : this.selectedContentColor), composer, 0);
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
        DefaultSelectableChipColors defaultSelectableChipColors = (DefaultSelectableChipColors) obj;
        return Color.m8229equalsimpl0(this.backgroundColor, defaultSelectableChipColors.backgroundColor) && Color.m8229equalsimpl0(this.contentColor, defaultSelectableChipColors.contentColor) && Color.m8229equalsimpl0(this.leadingIconColor, defaultSelectableChipColors.leadingIconColor) && Color.m8229equalsimpl0(this.disabledBackgroundColor, defaultSelectableChipColors.disabledBackgroundColor) && Color.m8229equalsimpl0(this.disabledContentColor, defaultSelectableChipColors.disabledContentColor) && Color.m8229equalsimpl0(this.disabledLeadingIconColor, defaultSelectableChipColors.disabledLeadingIconColor) && Color.m8229equalsimpl0(this.selectedBackgroundColor, defaultSelectableChipColors.selectedBackgroundColor) && Color.m8229equalsimpl0(this.selectedContentColor, defaultSelectableChipColors.selectedContentColor) && Color.m8229equalsimpl0(this.selectedLeadingIconColor, defaultSelectableChipColors.selectedLeadingIconColor);
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.backgroundColor);
        long j2 = this.selectedLeadingIconColor;
        long j3 = this.selectedContentColor;
        long j4 = this.selectedBackgroundColor;
        long j5 = this.disabledLeadingIconColor;
        long j6 = this.disabledContentColor;
        long j7 = this.disabledBackgroundColor;
        return (((((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.contentColor)) * 31) + Color.m8235hashCodeimpl(this.leadingIconColor)) * 31) + Color.m8235hashCodeimpl(j7)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State<Color> leadingIconColor(boolean z, boolean z2, Composer composer, int i2) {
        composer.startReplaceGroup(189838188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(189838188, i2, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:658)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(!z ? this.disabledLeadingIconColor : !z2 ? this.leadingIconColor : this.selectedLeadingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    public /* synthetic */ DefaultSelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }
}
