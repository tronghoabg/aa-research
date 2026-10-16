package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DragAndDropManager {
    Modifier getModifier();

    boolean isInterestedTarget(DragAndDropTarget dragAndDropTarget);

    boolean isRequestDragAndDropTransferRequired();

    void registerTargetInterest(DragAndDropTarget dragAndDropTarget);

    /* renamed from: requestDragAndDropTransfer-Uv8p0NA */
    void mo7729requestDragAndDropTransferUv8p0NA(DragAndDropNode dragAndDropNode, long j2);
}
