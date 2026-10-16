package X;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class o extends A {

    /* renamed from: c, reason: collision with root package name */
    public R.c f15729c;

    /* renamed from: d, reason: collision with root package name */
    public int f15730d;

    /* renamed from: e, reason: collision with root package name */
    public int f15731e;

    public o(R.c cVar) {
        this.f15729c = cVar;
    }

    @Override // X.A
    public final void a(A a5) {
        synchronized (q.f15733a) {
            AbstractC3340k.c(a5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.f15729c = ((o) a5).f15729c;
            this.f15730d = ((o) a5).f15730d;
            this.f15731e = ((o) a5).f15731e;
        }
    }

    @Override // X.A
    public final A b() {
        return new o(this.f15729c);
    }
}
