package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AppBarMenuState {
    public static final int $stable = 8;
    private boolean isExpanded;
    private final MutableState isShowing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    private final void setShowing(boolean z) {
        this.isShowing$delegate.setValue(Boolean.valueOf(z));
    }

    public final void dismiss() {
        setShowing(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: isShowing, reason: merged with bridge method [inline-methods] */
    public final boolean isExpanded() {
        return ((Boolean) this.isShowing$delegate.getValue()).booleanValue();
    }

    public final void show() {
        setShowing(true);
    }

    public static /* synthetic */ void isExpanded$annotations() {
    }
}
