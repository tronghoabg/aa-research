package j5;

import java.io.Serializable;
import java.util.List;

/* renamed from: j5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3080a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f38630a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f38631b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38632c;

    /* renamed from: d, reason: collision with root package name */
    public final List f38633d;

    public C3080a(List list, Boolean bool, String str, List list2) {
        this.f38630a = list;
        this.f38631b = bool;
        this.f38632c = str;
        this.f38633d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3080a.class == obj.getClass()) {
            C3080a c3080a = (C3080a) obj;
            List list = c3080a.f38630a;
            List list2 = this.f38630a;
            if (list2 == null ? list != null : !list2.equals(list)) {
                return false;
            }
            Boolean bool = c3080a.f38631b;
            Boolean bool2 = this.f38631b;
            if (bool2 == null ? bool != null : !bool2.equals(bool)) {
                return false;
            }
            String str = c3080a.f38632c;
            String str2 = this.f38632c;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            List list3 = c3080a.f38633d;
            List list4 = this.f38633d;
            if (list4 != null) {
                return list4.equals(list3);
            }
            if (list3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f38630a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        Boolean bool = this.f38631b;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f38632c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        List list2 = this.f38633d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }
}
