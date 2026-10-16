package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultButtonColors implements ButtonColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;

    private DefaultButtonColors(long j2, long j3, long j4, long j5) {
        this.backgroundColor = j2;
        this.contentColor = j3;
        this.disabledBackgroundColor = j4;
        this.disabledContentColor = j5;
    }

    @Override // androidx.compose.material.ButtonColors
    public State<Color> backgroundColor(boolean z, Composer composer, int i2) {
        composer.startReplaceGroup(-655254499);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-655254499, i2, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:581)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m8218boximpl(z ? this.backgroundColor : this.disabledBackgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.ButtonColors
    public State<Color> contentColor(boolean z, Composer composer, int i2) {
        composer.startReplaceGroup(-2133647540);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2133647540, i2, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:586)");
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
        DefaultButtonColors defaultButtonColors = (DefaultButtonColors) obj;
        return Color.m8229equalsimpl0(this.backgroundColor, defaultButtonColors.backgroundColor) && Color.m8229equalsimpl0(this.contentColor, defaultButtonColors.contentColor) && Color.m8229equalsimpl0(this.disabledBackgroundColor, defaultButtonColors.disabledBackgroundColor) && Color.m8229equalsimpl0(this.disabledContentColor, defaultButtonColors.disabledContentColor);
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.backgroundColor);
        long j2 = this.disabledContentColor;
        return (((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.contentColor)) * 31) + Color.m8235hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    public /* synthetic */ DefaultButtonColors(long j2, long j3, long j4, long j5, o oVar) {
        this(j2, j3, j4, j5);
    }
}
