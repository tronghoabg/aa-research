package androidx.compose.ui.platform;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends u implements q<DragAndDropTransferData, Size, l<? super DrawScope, ? extends ab>, Boolean> {
    AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ Boolean invoke(DragAndDropTransferData dragAndDropTransferData, Size size, l<? super DrawScope, ? extends ab> lVar) {
        return m10191invoke12SF9DM(dragAndDropTransferData, size.m8054unboximpl(), lVar);
    }

    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m10191invoke12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j2, l<? super DrawScope, ab> lVar) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m10187startDrag12SF9DM(dragAndDropTransferData, j2, lVar));
    }
}
