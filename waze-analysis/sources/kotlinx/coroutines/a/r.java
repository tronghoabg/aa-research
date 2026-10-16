package kotlinx.coroutines.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends s {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f51321a;

    public r(Throwable th) {
        this.f51321a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r) && h.g.b.x.n(this.f51321a, ((r) obj).f51321a);
    }

    public final int hashCode() {
        Throwable th = this.f51321a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // kotlinx.coroutines.a.s
    public final String toString() {
        return "Closed(" + this.f51321a + ")";
    }
}
