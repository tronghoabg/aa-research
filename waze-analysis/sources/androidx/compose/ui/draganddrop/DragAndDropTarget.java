package androidx.compose.ui.draganddrop;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DragAndDropTarget {
    void onChanged(DragAndDropEvent dragAndDropEvent);

    boolean onDrop(DragAndDropEvent dragAndDropEvent);

    void onEnded(DragAndDropEvent dragAndDropEvent);

    void onEntered(DragAndDropEvent dragAndDropEvent);

    void onExited(DragAndDropEvent dragAndDropEvent);

    void onMoved(DragAndDropEvent dragAndDropEvent);

    void onStarted(DragAndDropEvent dragAndDropEvent);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.draganddrop.DragAndDropTarget$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static void $default$onChanged(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        }

        public static void $default$onEnded(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        }

        public static void $default$onEntered(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        }

        public static void $default$onExited(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        }

        public static void $default$onMoved(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        }

        public static void $default$onStarted(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        }
    }
}
