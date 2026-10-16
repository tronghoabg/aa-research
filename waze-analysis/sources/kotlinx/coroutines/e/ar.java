package kotlinx.coroutines.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar implements h.c.i {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f51879a;

    public ar(ThreadLocal threadLocal) {
        this.f51879a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar) && h.g.b.x.n(this.f51879a, ((ar) obj).f51879a);
    }

    public final int hashCode() {
        return this.f51879a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f51879a + ")";
    }
}
