package androidx.compose.ui.focus;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CancelIndicatingFocusBoundaryScope implements FocusEnterExitScope {
    public static final int $stable = 8;
    private boolean isCanceled;
    private final int requestedFocusDirection;

    private CancelIndicatingFocusBoundaryScope(int i2) {
        this.requestedFocusDirection = i2;
    }

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    public /* synthetic */ void cancelFocus() {
        cancelFocusChange();
    }

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    public void cancelFocusChange() {
        this.isCanceled = true;
    }

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    /* renamed from: getRequestedFocusDirection-dhqQ-8s, reason: not valid java name */
    public int mo7851getRequestedFocusDirectiondhqQ8s() {
        return this.requestedFocusDirection;
    }

    public final boolean isCanceled() {
        return this.isCanceled;
    }

    public /* synthetic */ CancelIndicatingFocusBoundaryScope(int i2, o oVar) {
        this(i2);
    }
}
