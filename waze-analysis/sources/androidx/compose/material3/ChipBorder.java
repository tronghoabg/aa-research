package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ChipBorder {
    public static final int $stable = 0;
    private final long borderColor;
    private final float borderWidth;
    private final long disabledBorderColor;

    private ChipBorder(long j2, long j3, float f2) {
        this.borderColor = j2;
        this.disabledBorderColor = j3;
        this.borderWidth = f2;
    }

    public final State<BorderStroke> borderStroke$material3(boolean z, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899621712, i2, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:4160)");
        }
        State<BorderStroke> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m1998BorderStrokecXLIe8U(this.borderWidth, z ? this.borderColor : this.disabledBorderColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipBorder)) {
            return false;
        }
        ChipBorder chipBorder = (ChipBorder) obj;
        return Color.m8229equalsimpl0(this.borderColor, chipBorder.borderColor) && Color.m8229equalsimpl0(this.disabledBorderColor, chipBorder.disabledBorderColor) && Dp.m11169equalsimpl0(this.borderWidth, chipBorder.borderWidth);
    }

    public int hashCode() {
        return (((Color.m8235hashCodeimpl(this.borderColor) * 31) + Color.m8235hashCodeimpl(this.disabledBorderColor)) * 31) + Dp.m11170hashCodeimpl(this.borderWidth);
    }

    public /* synthetic */ ChipBorder(long j2, long j3, float f2, o oVar) {
        this(j2, j3, f2);
    }
}
