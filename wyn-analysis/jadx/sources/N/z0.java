package N;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class z0 extends X.A {

    /* renamed from: c, reason: collision with root package name */
    public Object f7990c;

    public z0(Object obj) {
        this.f7990c = obj;
    }

    @Override // X.A
    public final void a(X.A a5) {
        AbstractC3340k.c(a5, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f7990c = ((z0) a5).f7990c;
    }

    @Override // X.A
    public final X.A b() {
        return new z0(this.f7990c);
    }
}
