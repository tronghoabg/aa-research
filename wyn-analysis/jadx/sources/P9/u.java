package p9;

import A.AbstractC0213f;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: l, reason: collision with root package name */
    public static final t f43408l;

    /* renamed from: m, reason: collision with root package name */
    public static final t f43409m;

    /* renamed from: a, reason: collision with root package name */
    public final List f43410a;

    /* renamed from: b, reason: collision with root package name */
    public List f43411b;

    /* renamed from: c, reason: collision with root package name */
    public C3776A f43412c;

    /* renamed from: d, reason: collision with root package name */
    public C3776A f43413d;

    /* renamed from: e, reason: collision with root package name */
    public final List f43414e;

    /* renamed from: f, reason: collision with root package name */
    public final s9.m f43415f;

    /* renamed from: g, reason: collision with root package name */
    public final String f43416g;

    /* renamed from: h, reason: collision with root package name */
    public final long f43417h;

    /* renamed from: i, reason: collision with root package name */
    public final int f43418i;

    /* renamed from: j, reason: collision with root package name */
    public final C3782c f43419j;
    public final C3782c k;

    static {
        s9.j jVar = s9.j.f45378b;
        f43408l = new t(1, jVar);
        f43409m = new t(2, jVar);
    }

    public u(s9.m mVar, String str, List list, List list2, long j8, int i5, C3782c c3782c, C3782c c3782c2) {
        this.f43415f = mVar;
        this.f43416g = str;
        this.f43410a = list2;
        this.f43414e = list;
        this.f43417h = j8;
        this.f43418i = i5;
        this.f43419j = c3782c;
        this.k = c3782c2;
    }

    public final O7.d a() {
        return new O7.d(d());
    }

    public final u b(k kVar) {
        A6.c.z(!e(), "No filter is allowed for document query", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f43414e);
        arrayList.add(kVar);
        return new u(this.f43415f, this.f43416g, arrayList, this.f43410a, this.f43417h, this.f43418i, this.f43419j, this.k);
    }

    public final TreeSet c() {
        TreeSet treeSet = new TreeSet();
        Iterator it = this.f43414e.iterator();
        while (it.hasNext()) {
            for (C3789j c3789j : ((k) it.next()).c()) {
                if (c3789j.f()) {
                    treeSet.add(c3789j.f43373c);
                }
            }
        }
        return treeSet;
    }

    public final synchronized List d() {
        int i5;
        try {
            if (this.f43411b == null) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (t tVar : this.f43410a) {
                    arrayList.add(tVar);
                    hashSet.add(tVar.f43407b.c());
                }
                if (this.f43410a.size() > 0) {
                    List list = this.f43410a;
                    i5 = ((t) list.get(list.size() - 1)).f43406a;
                } else {
                    i5 = 1;
                }
                Iterator it = c().iterator();
                while (it.hasNext()) {
                    s9.j jVar = (s9.j) it.next();
                    if (!hashSet.contains(jVar.c()) && !jVar.equals(s9.j.f45378b)) {
                        arrayList.add(new t(i5, jVar));
                    }
                }
                if (!hashSet.contains(s9.j.f45378b.c())) {
                    arrayList.add(AbstractC0213f.b(i5, 1) ? f43408l : f43409m);
                }
                this.f43411b = DesugarCollections.unmodifiableList(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f43411b;
    }

    public final boolean e() {
        return s9.h.e(this.f43415f) && this.f43416g == null && this.f43414e.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f43418i != uVar.f43418i) {
            return false;
        }
        return i().equals(uVar.i());
    }

    public final u f(long j8) {
        return new u(this.f43415f, this.f43416g, this.f43414e, this.f43410a, j8, 1, this.f43419j, this.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(s9.k r8) {
        /*
            r7 = this;
            boolean r0 = r8.d()
            r1 = 0
            if (r0 == 0) goto Ld1
            s9.h r0 = r8.f45380a
            s9.m r0 = r0.f45375a
            r2 = 1
            s9.m r3 = r7.f43415f
            java.lang.String r4 = r7.f43416g
            if (r4 == 0) goto L33
            java.util.List r5 = r0.f45369a
            int r5 = r5.size()
            r6 = 2
            if (r5 < r6) goto L31
            java.util.List r5 = r0.f45369a
            java.lang.Object r5 = Va.M6.k(r6, r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L31
            boolean r0 = r3.i(r0)
            if (r0 == 0) goto L31
        L2f:
            r0 = r2
            goto L54
        L31:
            r0 = r1
            goto L54
        L33:
            boolean r4 = s9.h.e(r3)
            if (r4 == 0) goto L3e
            boolean r0 = r3.equals(r0)
            goto L54
        L3e:
            boolean r4 = r3.i(r0)
            if (r4 == 0) goto L31
            java.util.List r3 = r3.f45369a
            int r3 = r3.size()
            java.util.List r0 = r0.f45369a
            int r0 = r0.size()
            int r0 = r0 - r2
            if (r3 != r0) goto L31
            goto L2f
        L54:
            if (r0 == 0) goto Ld1
            java.util.List r0 = r7.d()
            java.util.Iterator r0 = r0.iterator()
        L5e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r0.next()
            p9.t r3 = (p9.t) r3
            s9.j r4 = r3.f43407b
            s9.j r5 = s9.j.f45378b
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L5e
            s9.l r4 = r8.f45384e
            s9.j r3 = r3.f43407b
            ka.C1 r3 = r4.f(r3)
            if (r3 != 0) goto L5e
            r0 = r1
            goto L81
        L80:
            r0 = r2
        L81:
            if (r0 == 0) goto Ld1
            java.util.List r0 = r7.f43414e
            java.util.Iterator r0 = r0.iterator()
        L89:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r0.next()
            p9.k r3 = (p9.k) r3
            boolean r3 = r3.d(r8)
            if (r3 != 0) goto L89
            r0 = r1
            goto L9e
        L9d:
            r0 = r2
        L9e:
            if (r0 == 0) goto Ld1
            p9.c r0 = r7.f43419j
            if (r0 == 0) goto Lb8
            java.util.List r3 = r7.d()
            int r3 = r0.a(r3, r8)
            boolean r0 = r0.f43342a
            if (r0 == 0) goto Lb3
            if (r3 > 0) goto Lb6
            goto Lb8
        Lb3:
            if (r3 >= 0) goto Lb6
            goto Lb8
        Lb6:
            r8 = r1
            goto Lce
        Lb8:
            p9.c r0 = r7.k
            if (r0 == 0) goto Lcd
            java.util.List r3 = r7.d()
            int r8 = r0.a(r3, r8)
            boolean r0 = r0.f43342a
            if (r0 == 0) goto Lcb
            if (r8 < 0) goto Lb6
            goto Lcd
        Lcb:
            if (r8 <= 0) goto Lb6
        Lcd:
            r8 = r2
        Lce:
            if (r8 == 0) goto Ld1
            return r2
        Ld1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.u.g(s9.k):boolean");
    }

    public final boolean h() {
        if (this.f43414e.isEmpty() && this.f43417h == -1 && this.f43419j == null && this.k == null) {
            List list = this.f43410a;
            if (list.isEmpty() || (list.size() == 1 && ((t) list.get(0)).f43407b.equals(s9.j.f45378b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0213f.f(this.f43418i) + (i().hashCode() * 31);
    }

    public final synchronized C3776A i() {
        try {
            if (this.f43412c == null) {
                this.f43412c = j(d());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f43412c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final synchronized C3776A j(List list) {
        if (this.f43418i == 1) {
            return new C3776A(this.f43415f, this.f43416g, this.f43414e, list, this.f43417h, this.f43419j, this.k);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            int i5 = 2;
            if (tVar.f43406a == 2) {
                i5 = 1;
            }
            arrayList.add(new t(i5, tVar.f43407b));
        }
        C3782c c3782c = this.k;
        C3782c c3782c2 = c3782c != null ? new C3782c(c3782c.f43343b, c3782c.f43342a) : null;
        C3782c c3782c3 = this.f43419j;
        return new C3776A(this.f43415f, this.f43416g, this.f43414e, arrayList, this.f43417h, c3782c2, c3782c3 != null ? new C3782c(c3782c3.f43343b, c3782c3.f43342a) : null);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Query(target=");
        sb2.append(i().toString());
        sb2.append(";limitType=");
        int i5 = this.f43418i;
        if (i5 == 1) {
            str = "LIMIT_TO_FIRST";
        } else {
            if (i5 != 2) {
                throw null;
            }
            str = "LIMIT_TO_LAST";
        }
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(s9.m mVar, String str) {
        List list = Collections.EMPTY_LIST;
        this(mVar, str, list, list, -1L, 1, null, null);
    }
}
