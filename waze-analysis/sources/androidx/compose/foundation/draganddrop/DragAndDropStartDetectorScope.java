package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DragAndDropStartDetectorScope extends PointerInputScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: requestDragAndDropTransfer-k-4lQ0M$default, reason: not valid java name */
        public static /* synthetic */ void m2132requestDragAndDropTransferk4lQ0M$default(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestDragAndDropTransfer-k-4lQ0M");
            }
            if ((i2 & 1) != 0) {
                j2 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
            }
            dragAndDropStartDetectorScope.mo2119requestDragAndDropTransferk4lQ0M(j2);
        }
    }

    /* renamed from: requestDragAndDropTransfer-k-4lQ0M */
    void mo2119requestDragAndDropTransferk4lQ0M(long j2);
}
