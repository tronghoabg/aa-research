package X;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class r extends A {

    /* renamed from: c, reason: collision with root package name */
    public Q.d f15735c;

    /* renamed from: d, reason: collision with root package name */
    public int f15736d;

    public r(Q.d dVar) {
        this.f15735c = dVar;
    }

    @Override // X.A
    public final void a(A a5) {
        AbstractC3340k.c(a5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        r rVar = (r) a5;
        synchronized (q.f15734b) {
            this.f15735c = rVar.f15735c;
            this.f15736d = rVar.f15736d;
        }
    }

    @Override // X.A
    public final A b() {
        return new r(this.f15735c);
    }
}
