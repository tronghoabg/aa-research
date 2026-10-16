package androidx.compose.ui.viewinterop;

import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidViewHolder$layoutNode$1$coreModifier$2 extends y implements l<DrawScope, ab> {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder $this_run;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$coreModifier$2(AndroidViewHolder androidViewHolder, LayoutNode layoutNode, AndroidViewHolder androidViewHolder2) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
        this.this$0 = androidViewHolder2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope drawScope) {
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        AndroidViewHolder androidViewHolder = this.$this_run;
        if (androidViewHolder.getView().getVisibility() != 8) {
            LayoutNode layoutNode = this.$layoutNode;
            androidViewHolder.isDrawing = true;
            Owner owner$ui = layoutNode.getOwner$ui();
            AndroidComposeView androidComposeView = owner$ui instanceof AndroidComposeView ? (AndroidComposeView) owner$ui : null;
            if (androidComposeView != null) {
                androidComposeView.drawAndroidView(this.this$0, AndroidCanvas_androidKt.getNativeCanvas(canvas));
            }
            androidViewHolder.isDrawing = false;
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return ab.f48028a;
    }
}
