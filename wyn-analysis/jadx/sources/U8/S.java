package U8;

import A7.AbstractC0279p0;
import java.util.List;

/* loaded from: classes4.dex */
public final class S extends F0 {

    /* renamed from: a, reason: collision with root package name */
    public final T f12467a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12468b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12469c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f12470d;

    /* renamed from: e, reason: collision with root package name */
    public final E0 f12471e;

    /* renamed from: f, reason: collision with root package name */
    public final List f12472f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12473g;

    public S(T t10, List list, List list2, Boolean bool, E0 e02, List list3, int i5) {
        this.f12467a = t10;
        this.f12468b = list;
        this.f12469c = list2;
        this.f12470d = bool;
        this.f12471e = e02;
        this.f12472f = list3;
        this.f12473g = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        S s10 = (S) ((F0) obj);
        if (!this.f12467a.equals(s10.f12467a)) {
            return false;
        }
        List list = this.f12468b;
        if (list == null) {
            if (s10.f12468b != null) {
                return false;
            }
        } else if (!list.equals(s10.f12468b)) {
            return false;
        }
        List list2 = this.f12469c;
        if (list2 == null) {
            if (s10.f12469c != null) {
                return false;
            }
        } else if (!list2.equals(s10.f12469c)) {
            return false;
        }
        Boolean bool = this.f12470d;
        if (bool == null) {
            if (s10.f12470d != null) {
                return false;
            }
        } else if (!bool.equals(s10.f12470d)) {
            return false;
        }
        E0 e02 = this.f12471e;
        if (e02 == null) {
            if (s10.f12471e != null) {
                return false;
            }
        } else if (!e02.equals(s10.f12471e)) {
            return false;
        }
        List list3 = this.f12472f;
        if (list3 == null) {
            if (s10.f12472f != null) {
                return false;
            }
        } else if (!list3.equals(s10.f12472f)) {
            return false;
        }
        return this.f12473g == s10.f12473g;
    }

    public final int hashCode() {
        int iHashCode = (this.f12467a.hashCode() ^ 1000003) * 1000003;
        List list = this.f12468b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f12469c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f12470d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        E0 e02 = this.f12471e;
        int iHashCode5 = (iHashCode4 ^ (e02 == null ? 0 : e02.hashCode())) * 1000003;
        List list3 = this.f12472f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f12473g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f12467a);
        sb2.append(", customAttributes=");
        sb2.append(this.f12468b);
        sb2.append(", internalKeys=");
        sb2.append(this.f12469c);
        sb2.append(", background=");
        sb2.append(this.f12470d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f12471e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f12472f);
        sb2.append(", uiOrientation=");
        return AbstractC0279p0.j(this.f12473g, "}", sb2);
    }
}
