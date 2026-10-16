package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.DraggableAnchors;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AnchoredDraggableUninitializedException extends Throwable {
    public static final int $stable = 8;
    private final String message;

    public AnchoredDraggableUninitializedException(boolean z, boolean z2, DraggableAnchors<?> draggableAnchors, Object obj) {
        this.message = "AnchoredDraggableState was not initialized correctly. isLookingAhead=" + z + ",didLookahead=" + z2 + ",anchors=" + draggableAnchors + ",targetValue=" + obj;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
