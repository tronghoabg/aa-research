package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class RenderNodeLayer$updateDisplayList$1$1 extends y implements l<Canvas, ab> {
    final /* synthetic */ p<Canvas, GraphicsLayer, ab> $drawBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RenderNodeLayer$updateDisplayList$1$1(p<? super Canvas, ? super GraphicsLayer, ab> pVar) {
        super(1);
        this.$drawBlock = pVar;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Canvas canvas) {
        invoke2(canvas);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Canvas canvas) {
        this.$drawBlock.invoke(canvas, null);
    }
}
