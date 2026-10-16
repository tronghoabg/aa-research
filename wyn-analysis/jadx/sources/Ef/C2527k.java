package ef;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ef.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2527k implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34671a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34672b;

    public C2527k(Object obj, Object obj2) {
        this.f34671a = obj;
        this.f34672b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2527k)) {
            return false;
        }
        C2527k c2527k = (C2527k) obj;
        return AbstractC3340k.a(this.f34671a, c2527k.f34671a) && AbstractC3340k.a(this.f34672b, c2527k.f34672b);
    }

    public final int hashCode() {
        Object obj = this.f34671a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f34672b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f34671a + ", " + this.f34672b + ')';
    }
}
