package androidx.compose.ui.draganddrop;

import android.view.DragEvent;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DragAndDropEvent {
    public static final int $stable = 8;
    private final DragEvent dragEvent;

    public DragAndDropEvent(DragEvent dragEvent) {
        this.dragEvent = dragEvent;
    }

    public final DragEvent getDragEvent$ui() {
        return this.dragEvent;
    }
}
