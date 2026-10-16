package androidx.compose.runtime.composer;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class DebugStringFormattable {
    public static final int $stable = 0;

    public static /* synthetic */ String toDebugString$default(DebugStringFormattable debugStringFormattable, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
        }
        if (1 == (i2 & 1)) {
            str = "  ";
        }
        return debugStringFormattable.toDebugString(str);
    }

    public abstract String toDebugString(String str);
}
