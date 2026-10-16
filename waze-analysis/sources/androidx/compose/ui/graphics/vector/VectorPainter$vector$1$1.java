package androidx.compose.ui.graphics.vector;

import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VectorPainter$vector$1$1 extends y implements a<ab> {
    final /* synthetic */ VectorPainter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VectorPainter$vector$1$1(VectorPainter vectorPainter) {
        super(0);
        this.this$0 = vectorPainter;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.setDrawInvalidation(ab.f48028a);
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
