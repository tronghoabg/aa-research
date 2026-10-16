package D3;

import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2316a;

    public k(List list) {
        this.f2316a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.class.equals(obj.getClass())) {
            return false;
        }
        return this.f2316a.equals(((k) obj).f2316a);
    }

    public final int hashCode() {
        return this.f2316a.hashCode();
    }

    public final String toString() {
        return ff.o.w0((Iterable) this.f2316a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
