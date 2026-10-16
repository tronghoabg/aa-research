package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LookaheadDelegateKt {
    private static final byte AccessChanged = 1;
    private static final byte AccessNewValue = 3;
    private static final byte AccessNoChange = 0;
    private static final byte AccessNotSet = 2;
    private static final int MaxLayoutDimension = 16777215;
    private static final int MaxLayoutMask = -16777216;

    public static final void checkMeasuredSize(int i2, int i3) {
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
    }
}
