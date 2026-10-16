package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ModifierUtilsKt {
    /* renamed from: maxWidthForTextLayout-R2G3SPE, reason: not valid java name */
    public static final int m3800maxWidthForTextLayoutR2G3SPE(long j2, boolean z, int i2) {
        if ((z || TextOverflow.m11059equalsimpl0(i2, TextOverflow.Companion.m11069getEllipsisgIe3tQ8())) && Constraints.m11103getHasBoundedWidthimpl(j2)) {
            return Constraints.m11107getMaxWidthimpl(j2);
        }
        return Integer.MAX_VALUE;
    }
}
