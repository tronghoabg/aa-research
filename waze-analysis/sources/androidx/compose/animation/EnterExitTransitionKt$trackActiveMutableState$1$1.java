package androidx.compose.animation;

import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionKt$trackActiveMutableState$1$1 extends y implements a<ab> {
    final /* synthetic */ SharedMutableTransformState $shared;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$trackActiveMutableState$1$1(SharedMutableTransformState sharedMutableTransformState) {
        super(0);
        this.$shared = sharedMutableTransformState;
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$shared.clear();
    }
}
