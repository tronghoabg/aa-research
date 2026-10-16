package androidx.compose.ui.platform;

import h.ab;
import h.g.a.a;
import h.g.b.aq;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2 extends y implements a<ab> {
    final /* synthetic */ aq<a<ab>> $disposer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(aq<a<ab>> aqVar) {
        super(0);
        this.$disposer = aqVar;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((a) this.$disposer.f48105a).invoke();
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
