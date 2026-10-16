package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hgw implements gmw {
    public final fvz a;
    public final List b;
    public final gmw c;
    public final boolean d;

    public hgw(fvz fvzVar, List list, gmw gmwVar, boolean z) {
        this.a = fvzVar;
        this.b = list;
        this.c = gmwVar;
        this.d = z;
    }

    public final String a() {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((hgv) next).c) {
                break;
            }
        }
        hgv hgvVar = (hgv) next;
        if (hgvVar != null) {
            return hgvVar.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgw)) {
            return false;
        }
        hgw hgwVar = (hgw) obj;
        return affa.f(this.a, hgwVar.a) && affa.f(this.b, hgwVar.b) && affa.f(this.c, hgwVar.c) && this.d == hgwVar.d;
    }

    public final int hashCode() {
        fvz fvzVar = this.a;
        int iHashCode = ((fvzVar == null ? 0 : fvzVar.hashCode()) * 31) + this.b.hashCode();
        gmw gmwVar = this.c;
        return (((iHashCode * 31) + (gmwVar != null ? gmwVar.hashCode() : 0)) * 31) + a.f(this.d);
    }

    public final String toString() {
        return "TabTemplateInternal(headerAction=" + this.a + ", tabs=" + this.b + ", content=" + this.c + ", isLoading=" + this.d + ")";
    }
}
