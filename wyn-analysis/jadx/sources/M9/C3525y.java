package m9;

import A.AbstractC0213f;
import j$.util.Objects;
import java.util.List;

/* renamed from: m9.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3525y extends AbstractC3501A {

    /* renamed from: a, reason: collision with root package name */
    public final List f40514a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40515b;

    public C3525y(int i5, List list) {
        this.f40514a = list;
        this.f40515b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3525y.class != obj.getClass()) {
            return false;
        }
        C3525y c3525y = (C3525y) obj;
        return this.f40515b == c3525y.f40515b && Objects.equals(this.f40514a, c3525y.f40514a);
    }

    public final int hashCode() {
        List list = this.f40514a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        int i5 = this.f40515b;
        return iHashCode + (i5 != 0 ? AbstractC0213f.f(i5) : 0);
    }
}
