package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidView_androidKt$AndroidView$3$1 extends y implements p<LayoutNode, l, ab> {
    public static final AndroidView_androidKt$AndroidView$3$1 INSTANCE = new AndroidView_androidKt$AndroidView$3$1();

    AndroidView_androidKt$AndroidView$3$1() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(LayoutNode layoutNode, l lVar) {
        invoke2(layoutNode, lVar);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode layoutNode, l lVar) {
        AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setUpdateBlock(lVar);
    }
}
