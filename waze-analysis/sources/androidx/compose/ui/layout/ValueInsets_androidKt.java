package androidx.compose.ui.layout;

import androidx.core.graphics.Insets;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ValueInsets_androidKt {
    private static final long UnsetValueInsets = -1;
    private static final long ZeroValueInsets = 0;

    public static final long ValueInsets(Insets insets) {
        return (insets.left << 48) | (insets.top << 32) | (insets.right << 16) | insets.bottom;
    }

    public static final long getUnsetValueInsets() {
        return UnsetValueInsets;
    }

    public static final long getZeroValueInsets() {
        return ZeroValueInsets;
    }

    public static final long ValueInsets(int i2, int i3, int i4, int i5) {
        return (i3 << 32) | (i2 << 48) | (i4 << 16) | i5;
    }
}
