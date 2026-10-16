package A;

import kotlin.jvm.internal.AbstractC3340k;
import z.EnumC4601f;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final Object f57a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f58b;

    public N(Object obj, Object obj2) {
        this.f57a = obj;
        this.f58b = obj2;
    }

    public final boolean a(EnumC4601f enumC4601f, EnumC4601f enumC4601f2) {
        return enumC4601f.equals(this.f57a) && enumC4601f2.equals(this.f58b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        if (AbstractC3340k.a(this.f57a, n10.f57a)) {
            return AbstractC3340k.a(this.f58b, n10.f58b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f57a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f58b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
