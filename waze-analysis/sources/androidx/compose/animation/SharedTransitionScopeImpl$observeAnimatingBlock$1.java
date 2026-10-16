package androidx.compose.animation;

import h.ab;
import h.g.a.a;
import h.g.b.y;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SharedTransitionScopeImpl$observeAnimatingBlock$1 extends y implements a<ab> {
    final /* synthetic */ SharedTransitionScopeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedTransitionScopeImpl$observeAnimatingBlock$1(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        super(0);
        this.this$0 = sharedTransitionScopeImpl;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Collection collectionValues = this.this$0.sharedElements.toMap().values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext() && !((SharedElement) it.next()).isAnimating()) {
        }
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
