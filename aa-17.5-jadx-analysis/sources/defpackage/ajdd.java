package defpackage;

/* loaded from: classes3.dex */
public final class ajdd implements afcn {
    private final ThreadLocal a;

    public ajdd(ThreadLocal threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajdd) && affa.f(this.a, ((ajdd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ")";
    }
}
