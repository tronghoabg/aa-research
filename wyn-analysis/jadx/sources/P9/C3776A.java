package p9;

import A.AbstractC0213f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: p9.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3776A {

    /* renamed from: a, reason: collision with root package name */
    public String f43307a;

    /* renamed from: b, reason: collision with root package name */
    public final List f43308b;

    /* renamed from: c, reason: collision with root package name */
    public final List f43309c;

    /* renamed from: d, reason: collision with root package name */
    public final s9.m f43310d;

    /* renamed from: e, reason: collision with root package name */
    public final String f43311e;

    /* renamed from: f, reason: collision with root package name */
    public final long f43312f;

    /* renamed from: g, reason: collision with root package name */
    public final C3782c f43313g;

    /* renamed from: h, reason: collision with root package name */
    public final C3782c f43314h;

    public C3776A(s9.m mVar, String str, List list, List list2, long j8, C3782c c3782c, C3782c c3782c2) {
        this.f43310d = mVar;
        this.f43311e = str;
        this.f43308b = list2;
        this.f43309c = list;
        this.f43312f = j8;
        this.f43313g = c3782c;
        this.f43314h = c3782c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x000e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(s9.d r11, p9.C3782c r12) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.C3776A.a(s9.d, p9.c):android.util.Pair");
    }

    public final String b() {
        String str = this.f43307a;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43310d.c());
        String str2 = this.f43311e;
        if (str2 != null) {
            sb2.append("|cg:");
            sb2.append(str2);
        }
        sb2.append("|f:");
        Iterator it = this.f43309c.iterator();
        while (it.hasNext()) {
            sb2.append(((k) it.next()).a());
        }
        sb2.append("|ob:");
        for (t tVar : this.f43308b) {
            sb2.append(tVar.f43407b.c());
            sb2.append(AbstractC0213f.b(tVar.f43406a, 1) ? "asc" : "desc");
        }
        long j8 = this.f43312f;
        if (j8 != -1) {
            sb2.append("|l:");
            sb2.append(j8);
        }
        C3782c c3782c = this.f43313g;
        if (c3782c != null) {
            sb2.append("|lb:");
            sb2.append(c3782c.f43342a ? "b:" : "a:");
            sb2.append(c3782c.b());
        }
        C3782c c3782c2 = this.f43314h;
        if (c3782c2 != null) {
            sb2.append("|ub:");
            sb2.append(c3782c2.f43342a ? "a:" : "b:");
            sb2.append(c3782c2.b());
        }
        String string = sb2.toString();
        this.f43307a = string;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x000e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair c(s9.d r11, p9.C3782c r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.C3776A.c(s9.d, p9.c):android.util.Pair");
    }

    public final ArrayList d(s9.j jVar) {
        ArrayList arrayList = new ArrayList();
        for (k kVar : this.f43309c) {
            if (kVar instanceof C3789j) {
                C3789j c3789j = (C3789j) kVar;
                if (c3789j.f43373c.equals(jVar)) {
                    arrayList.add(c3789j);
                }
            }
        }
        return arrayList;
    }

    public final boolean e() {
        return s9.h.e(this.f43310d) && this.f43311e == null && this.f43309c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3776A.class == obj.getClass()) {
            C3776A c3776a = (C3776A) obj;
            String str = c3776a.f43311e;
            String str2 = this.f43311e;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            if (this.f43312f != c3776a.f43312f || !this.f43308b.equals(c3776a.f43308b) || !this.f43309c.equals(c3776a.f43309c) || !this.f43310d.equals(c3776a.f43310d)) {
                return false;
            }
            C3782c c3782c = c3776a.f43313g;
            C3782c c3782c2 = this.f43313g;
            if (c3782c2 == null ? c3782c != null : !c3782c2.equals(c3782c)) {
                return false;
            }
            C3782c c3782c3 = c3776a.f43314h;
            C3782c c3782c4 = this.f43314h;
            if (c3782c4 != null) {
                return c3782c4.equals(c3782c3);
            }
            if (c3782c3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f43308b.hashCode() * 31;
        String str = this.f43311e;
        int iHashCode2 = (this.f43310d.hashCode() + ((this.f43309c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j8 = this.f43312f;
        int i5 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        C3782c c3782c = this.f43313g;
        int iHashCode3 = (i5 + (c3782c != null ? c3782c.hashCode() : 0)) * 31;
        C3782c c3782c2 = this.f43314h;
        return iHashCode3 + (c3782c2 != null ? c3782c2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Query(");
        sb2.append(this.f43310d.c());
        String str = this.f43311e;
        if (str != null) {
            sb2.append(" collectionGroup=");
            sb2.append(str);
        }
        List list = this.f43309c;
        if (!list.isEmpty()) {
            sb2.append(" where ");
            for (int i5 = 0; i5 < list.size(); i5++) {
                if (i5 > 0) {
                    sb2.append(" and ");
                }
                sb2.append(list.get(i5));
            }
        }
        List list2 = this.f43308b;
        if (!list2.isEmpty()) {
            sb2.append(" order by ");
            for (int i10 = 0; i10 < list2.size(); i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(list2.get(i10));
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
