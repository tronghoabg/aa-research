package androidx.compose.ui.layout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PinnableContainer {

    /* compiled from: WazeSource */
    public interface PinnedHandle {
        void release();
    }

    PinnedHandle pin();
}
