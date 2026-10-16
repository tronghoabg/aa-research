package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class DragAndDropSourceKt__DragAndDropSourceKt {
    public static final Modifier dragAndDropSource(Modifier modifier, l<? super Offset, DragAndDropTransferData> lVar) {
        return modifier.then(new DragAndDropSourceWithDefaultShadowElement(DragAndDropSourceDefaults.INSTANCE.getDefaultStartDetector(), lVar));
    }

    public static final Modifier dragAndDropSource(Modifier modifier, l<? super DrawScope, ab> lVar, l<? super Offset, DragAndDropTransferData> lVar2) {
        return modifier.then(new DragAndDropSourceElement(lVar, DragAndDropSourceDefaults.INSTANCE.getDefaultStartDetector(), lVar2));
    }
}
