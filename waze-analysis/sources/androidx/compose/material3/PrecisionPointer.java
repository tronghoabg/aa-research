package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PrecisionPointer {
    private static final MutableState<Boolean> shouldUsePrecisionPointerComponentSizing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    public static final MutableState<Boolean> getShouldUsePrecisionPointerComponentSizing() {
        return shouldUsePrecisionPointerComponentSizing;
    }

    public static final boolean shouldUsePrecisionPointerComponentSizing() {
        return shouldUsePrecisionPointerComponentSizing.getValue().booleanValue();
    }
}
