package k8;

import java.io.Serializable;
import java.util.List;

/* renamed from: k8.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3203l implements InterfaceC3202k, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f39303a;

    public C3203l(List list) {
        this.f39303a = list;
    }

    @Override // k8.InterfaceC3202k
    public final boolean apply(Object obj) {
        int i5 = 0;
        while (true) {
            List list = this.f39303a;
            if (i5 >= list.size()) {
                return true;
            }
            if (!((InterfaceC3202k) list.get(i5)).apply(obj)) {
                return false;
            }
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3203l) {
            return this.f39303a.equals(((C3203l) obj).f39303a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39303a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z2 = true;
        for (Object obj : this.f39303a) {
            if (!z2) {
                sb2.append(',');
            }
            sb2.append(obj);
            z2 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
