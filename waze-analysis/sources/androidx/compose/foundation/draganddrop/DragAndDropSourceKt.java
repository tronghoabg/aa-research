package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;

/* loaded from: classes.dex */
public final class DragAndDropSourceKt {
    public static final Modifier dragAndDropSource(Modifier modifier, l<? super Offset, DragAndDropTransferData> lVar) {
        return DragAndDropSourceKt__DragAndDropSourceKt.dragAndDropSource(modifier, lVar);
    }

    public static final Modifier dragAndDropSource(Modifier modifier, l<? super DrawScope, ab> lVar, l<? super Offset, DragAndDropTransferData> lVar2) {
        return DragAndDropSourceKt__DragAndDropSourceKt.dragAndDropSource(modifier, lVar, lVar2);
    }

    public static final Modifier dragAndDropSource(Modifier modifier, l<? super DrawScope, ab> lVar, p<? super DragAndDropSourceScope, ? super e<? super ab>, ? extends Object> pVar) {
        return DragAndDropSourceKt__LegacyDragAndDropSource_androidKt.dragAndDropSource(modifier, lVar, pVar);
    }
}
