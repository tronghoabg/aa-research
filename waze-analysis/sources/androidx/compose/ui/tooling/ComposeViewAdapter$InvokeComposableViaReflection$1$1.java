package androidx.compose.ui.tooling;

import h.ab;
import h.g.a.a;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class ComposeViewAdapter$InvokeComposableViaReflection$1$1 extends u implements a<ab> {
    ComposeViewAdapter$InvokeComposableViaReflection$1$1(Object obj) {
        super(0, obj, ComposeViewAdapter.class, "requestLayout", "requestLayout()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ComposeViewAdapter) this.receiver).requestLayout();
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
