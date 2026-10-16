package androidx.compose.ui.focus;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FocusManager {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.FocusManager$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void clearFocus$default(FocusManager focusManager, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
            }
            focusManager.clearFocus(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)));
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class DefaultImpls {
    }

    void clearFocus(boolean z);

    /* renamed from: moveFocus-3ESFkO8, reason: not valid java name */
    boolean mo7869moveFocus3ESFkO8(int i2);
}
