package androidx.compose.ui.layout;

import h.ab;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SubcomposeLayoutKt$SubcomposeLayout$4$1 extends y implements h.g.a.a<ab> {
    final /* synthetic */ SubcomposeLayoutState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutKt$SubcomposeLayout$4$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(0);
        this.$state = subcomposeLayoutState;
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$state.forceRecomposeChildren$ui();
    }
}
