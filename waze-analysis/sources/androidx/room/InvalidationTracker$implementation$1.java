package androidx.room;

import h.ab;
import h.g.a.l;
import h.g.b.u;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class InvalidationTracker$implementation$1 extends u implements l<Set<? extends Integer>, ab> {
    InvalidationTracker$implementation$1(Object obj) {
        super(1, obj, InvalidationTracker.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Set<Integer> set) {
        x.f(set, "p0");
        ((InvalidationTracker) this.receiver).notifyInvalidatedObservers(set);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Set<? extends Integer> set) {
        invoke2((Set<Integer>) set);
        return ab.f48028a;
    }
}
