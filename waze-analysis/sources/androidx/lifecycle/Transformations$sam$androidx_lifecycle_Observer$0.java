package androidx.lifecycle;

import h.c;
import h.g.a.l;
import h.g.b.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, r {
    private final /* synthetic */ l function;

    Transformations$sam$androidx_lifecycle_Observer$0(l lVar) {
        x.f(lVar, "function");
        this.function = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof r)) {
            return x.n(getFunctionDelegate(), ((r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final c<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
