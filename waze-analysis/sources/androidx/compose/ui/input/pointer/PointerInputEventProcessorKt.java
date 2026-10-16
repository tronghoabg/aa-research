package androidx.compose.ui.input.pointer;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PointerInputEventProcessorKt {
    public static final int ProcessResult(boolean z, boolean z2, boolean z3) {
        return (z ? 1 : 0) | ((z2 ? 1 : 0) + (z2 ? 1 : 0)) | ((z3 ? 1 : 0) << 2);
    }

    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }
}
