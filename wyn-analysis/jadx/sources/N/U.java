package N;

import kotlin.jvm.internal.AbstractC3340k;
import x.C4422o;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final C4422o f7732a;

    public final boolean equals(Object obj) {
        if (obj instanceof U) {
            return AbstractC3340k.a(this.f7732a, ((U) obj).f7732a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7732a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f7732a + ')';
    }
}
