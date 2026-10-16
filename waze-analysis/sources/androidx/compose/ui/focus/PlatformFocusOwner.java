package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface PlatformFocusOwner {
    void clearOwnerFocus();

    void focusTargetAvailable();

    Rect getEmbeddedViewFocusRect();

    /* renamed from: moveFocusInChildren-3ESFkO8, reason: not valid java name */
    boolean mo7921moveFocusInChildren3ESFkO8(int i2);

    /* renamed from: requestOwnerFocus-7o62pno, reason: not valid java name */
    boolean mo7922requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect rect);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.PlatformFocusOwner$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$focusTargetAvailable(PlatformFocusOwner platformFocusOwner) {
        }
    }
}
