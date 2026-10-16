package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidView_androidKt$updateViewHolderParams$3 extends y implements p<LayoutNode, LifecycleOwner, ab> {
    public static final AndroidView_androidKt$updateViewHolderParams$3 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$3();

    AndroidView_androidKt$updateViewHolderParams$3() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner) {
        invoke2(layoutNode, lifecycleOwner);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode layoutNode, LifecycleOwner lifecycleOwner) {
        AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setLifecycleOwner(lifecycleOwner);
    }
}
