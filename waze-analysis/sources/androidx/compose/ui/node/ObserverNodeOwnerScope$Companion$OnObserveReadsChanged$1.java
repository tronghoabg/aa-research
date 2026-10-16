package androidx.compose.ui.node;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1 extends y implements l<ObserverNodeOwnerScope, ab> {
    public static final ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1 INSTANCE = new ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1();

    ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ObserverNodeOwnerScope observerNodeOwnerScope) {
        if (observerNodeOwnerScope.isValidOwnerScope()) {
            observerNodeOwnerScope.getObserverNode$ui().onObservedReadsChanged();
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(ObserverNodeOwnerScope observerNodeOwnerScope) {
        invoke2(observerNodeOwnerScope);
        return ab.f48028a;
    }
}
