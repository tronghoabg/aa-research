package p9;

import A.AbstractC0213f;
import java.util.List;
import ka.C1;

/* renamed from: p9.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3782c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f43342a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f43343b;

    public C3782c(List list, boolean z2) {
        this.f43343b = list;
        this.f43342a = z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final int a(List list, s9.k kVar) {
        int iB;
        ?? r02 = this.f43343b;
        A6.c.z(r02.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i5 = 0;
        for (int i10 = 0; i10 < r02.size(); i10++) {
            t tVar = (t) list.get(i10);
            C1 c12 = (C1) r02.get(i10);
            if (tVar.f43407b.equals(s9.j.f45378b)) {
                A6.c.z(s9.p.i(c12), "Bound has a non-key value where the key path is being used %s", c12);
                iB = s9.h.c(c12.t()).compareTo(kVar.f45380a);
            } else {
                C1 c1F = kVar.f45384e.f(tVar.f43407b);
                A6.c.z(c1F != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                iB = s9.p.b(c12, c1F);
            }
            if (AbstractC0213f.b(tVar.f43406a, 2)) {
                iB *= -1;
            }
            i5 = iB;
            if (i5 != 0) {
                return i5;
            }
        }
        return i5;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        boolean z2 = true;
        for (C1 c12 : this.f43343b) {
            if (!z2) {
                sb2.append(",");
            }
            C1 c13 = s9.p.f45391a;
            StringBuilder sb3 = new StringBuilder();
            s9.p.a(sb3, c12);
            sb2.append(sb3.toString());
            z2 = false;
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3782c.class != obj.getClass()) {
            return false;
        }
        C3782c c3782c = (C3782c) obj;
        return this.f43342a == c3782c.f43342a && this.f43343b.equals(c3782c.f43343b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final int hashCode() {
        return this.f43343b.hashCode() + ((this.f43342a ? 1 : 0) * 31);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Bound(inclusive=");
        sb2.append(this.f43342a);
        sb2.append(", position=");
        int i5 = 0;
        while (true) {
            ?? r22 = this.f43343b;
            if (i5 >= r22.size()) {
                sb2.append(")");
                return sb2.toString();
            }
            if (i5 > 0) {
                sb2.append(" and ");
            }
            C1 c12 = (C1) r22.get(i5);
            C1 c13 = s9.p.f45391a;
            StringBuilder sb3 = new StringBuilder();
            s9.p.a(sb3, c12);
            sb2.append(sb3.toString());
            i5++;
        }
    }
}
