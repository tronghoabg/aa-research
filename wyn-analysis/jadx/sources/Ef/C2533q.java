package ef;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ef.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2533q implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34681a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34682b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34683c;

    public C2533q(Object obj, Object obj2, Object obj3) {
        this.f34681a = obj;
        this.f34682b = obj2;
        this.f34683c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2533q)) {
            return false;
        }
        C2533q c2533q = (C2533q) obj;
        return AbstractC3340k.a(this.f34681a, c2533q.f34681a) && AbstractC3340k.a(this.f34682b, c2533q.f34682b) && AbstractC3340k.a(this.f34683c, c2533q.f34683c);
    }

    public final int hashCode() {
        Object obj = this.f34681a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f34682b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f34683c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f34681a + ", " + this.f34682b + ", " + this.f34683c + ')';
    }
}
