package a2;

import A.e0;
import N1.B;
import N1.C;
import N1.C0764m;
import N1.C0765n;
import N1.D;
import N1.O;
import Q1.x;
import S1.A;
import U1.a0;
import a9.C1342b;
import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k2.C3157n;
import k2.F;
import k2.InterfaceC3143E;
import k2.n0;
import ka.AbstractC3256n;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3407I;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public final class m implements F, b2.q {

    /* renamed from: a, reason: collision with root package name */
    public final C1324d f17216a;

    /* renamed from: b, reason: collision with root package name */
    public final b2.c f17217b;

    /* renamed from: c, reason: collision with root package name */
    public final C1323c f17218c;

    /* renamed from: d, reason: collision with root package name */
    public final A f17219d;

    /* renamed from: e, reason: collision with root package name */
    public final Z1.g f17220e;

    /* renamed from: f, reason: collision with root package name */
    public final Z1.d f17221f;

    /* renamed from: g, reason: collision with root package name */
    public final ae.d f17222g;

    /* renamed from: h, reason: collision with root package name */
    public final Z1.d f17223h;

    /* renamed from: i, reason: collision with root package name */
    public final o2.e f17224i;

    /* renamed from: j, reason: collision with root package name */
    public final IdentityHashMap f17225j;
    public final v k;

    /* renamed from: l, reason: collision with root package name */
    public final C1342b f17226l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f17227m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17228n;

    /* renamed from: o, reason: collision with root package name */
    public final V1.k f17229o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f17230p = new e0(this, 27);

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC3143E f17231q;

    /* renamed from: r, reason: collision with root package name */
    public int f17232r;

    /* renamed from: s, reason: collision with root package name */
    public n0 f17233s;

    /* renamed from: t, reason: collision with root package name */
    public s[] f17234t;

    /* renamed from: u, reason: collision with root package name */
    public s[] f17235u;

    /* renamed from: v, reason: collision with root package name */
    public int f17236v;

    /* renamed from: w, reason: collision with root package name */
    public C3157n f17237w;

    public m(C1324d c1324d, b2.c cVar, C1323c c1323c, A a5, Z1.g gVar, Z1.d dVar, ae.d dVar2, Z1.d dVar3, o2.e eVar, C1342b c1342b, boolean z2, int i5, V1.k kVar) {
        this.f17216a = c1324d;
        this.f17217b = cVar;
        this.f17218c = c1323c;
        this.f17219d = a5;
        this.f17220e = gVar;
        this.f17221f = dVar;
        this.f17222g = dVar2;
        this.f17223h = dVar3;
        this.f17224i = eVar;
        this.f17226l = c1342b;
        this.f17227m = z2;
        this.f17228n = i5;
        this.f17229o = kVar;
        c1342b.getClass();
        C3407I c3407i = AbstractC3409K.f40056b;
        l8.e0 e0Var = l8.e0.f40101e;
        this.f17237w = new C3157n(e0Var, e0Var);
        this.f17225j = new IdentityHashMap();
        this.k = new v(0);
        this.f17234t = new s[0];
        this.f17235u = new s[0];
    }

    public static C0765n m(C0765n c0765n, C0765n c0765n2, boolean z2) {
        B b5;
        int i5;
        String str;
        String str2;
        AbstractC3409K abstractC3409K;
        int i10;
        int i11;
        String str3;
        C3407I c3407i = AbstractC3409K.f40056b;
        l8.e0 e0Var = l8.e0.f40101e;
        if (c0765n2 != null) {
            str2 = c0765n2.k;
            b5 = c0765n2.f8230l;
            i10 = c0765n2.f8210C;
            i5 = c0765n2.f8224e;
            i11 = c0765n2.f8225f;
            str = c0765n2.f8223d;
            str3 = c0765n2.f8221b;
            abstractC3409K = c0765n2.f8222c;
        } else {
            String strT = x.t(1, c0765n.k);
            b5 = c0765n.f8230l;
            if (z2) {
                i10 = c0765n.f8210C;
                i5 = c0765n.f8224e;
                i11 = c0765n.f8225f;
                str = c0765n.f8223d;
                str3 = c0765n.f8221b;
                str2 = strT;
                abstractC3409K = c0765n.f8222c;
            } else {
                i5 = 0;
                str = null;
                str2 = strT;
                abstractC3409K = e0Var;
                i10 = -1;
                i11 = 0;
                str3 = null;
            }
        }
        String strD = C.d(str2);
        int i12 = z2 ? c0765n.f8227h : -1;
        int i13 = z2 ? c0765n.f8228i : -1;
        C0764m c0764m = new C0764m();
        c0764m.f8183a = c0765n.f8220a;
        c0764m.f8184b = str3;
        c0764m.f8185c = AbstractC3409K.j(abstractC3409K);
        c0764m.f8193l = C.m(c0765n.f8231m);
        c0764m.f8194m = C.m(strD);
        c0764m.f8192j = str2;
        c0764m.k = b5;
        c0764m.f8190h = i12;
        c0764m.f8191i = i13;
        c0764m.f8173B = i10;
        c0764m.f8187e = i5;
        c0764m.f8188f = i11;
        c0764m.f8186d = str;
        return new C0765n(c0764m);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0056 A[SYNTHETIC] */
    @Override // b2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.net.Uri r18, A.C0230x r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            a2.s[] r2 = r0.f17234t
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La3
            r8 = r2[r6]
            a2.j r9 = r8.f17290d
            android.net.Uri[] r10 = r9.f17174e
            boolean r11 = Q1.x.k(r1, r10)
            if (r11 != 0) goto L1e
            r8 = r19
            r4 = 1
            r16 = 1
            goto L9e
        L1e:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r20 != 0) goto L40
            n2.q r13 = r9.f17185q
            F6.p r13 = ff.AbstractC2641B.o(r13)
            ae.d r8 = r8.f17295i
            r8.getClass()
            r8 = r19
            U5.f r13 = ae.d.f(r13, r8)
            if (r13 == 0) goto L42
            int r14 = r13.f12344a
            r15 = 2
            if (r14 != r15) goto L42
            long r13 = r13.f12345b
            goto L43
        L40:
            r8 = r19
        L42:
            r13 = r11
        L43:
            r15 = 0
            r16 = 1
        L46:
            int r4 = r10.length
            r5 = -1
            if (r15 >= r4) goto L56
            r4 = r10[r15]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L53
            goto L57
        L53:
            int r15 = r15 + 1
            goto L46
        L56:
            r15 = r5
        L57:
            if (r15 != r5) goto L5c
        L59:
            r4 = r16
            goto L94
        L5c:
            n2.q r4 = r9.f17185q
            int r4 = r4.f(r15)
            if (r4 != r5) goto L65
            goto L59
        L65:
            boolean r5 = r9.f17187s
            android.net.Uri r10 = r9.f17183o
            boolean r10 = r1.equals(r10)
            r5 = r5 | r10
            r9.f17187s = r5
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 == 0) goto L59
            n2.q r5 = r9.f17185q
            boolean r4 = r5.o(r4, r13)
            if (r4 == 0) goto L93
            b2.c r4 = r9.f17176g
            java.util.HashMap r4 = r4.f19161d
            java.lang.Object r4 = r4.get(r1)
            b2.b r4 = (b2.b) r4
            if (r4 == 0) goto L8f
            boolean r4 = b2.b.a(r4, r13)
            r4 = r4 ^ 1
            goto L90
        L8f:
            r4 = 0
        L90:
            if (r4 == 0) goto L93
            goto L59
        L93:
            r4 = 0
        L94:
            if (r4 == 0) goto L9d
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L9d
            r4 = r16
            goto L9e
        L9d:
            r4 = 0
        L9e:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La3:
            k2.E r1 = r0.f17231q
            r1.a(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.m.a(android.net.Uri, A.x, boolean):boolean");
    }

    @Override // k2.F
    public final long b(long j8, a0 a0Var) {
        s[] sVarArr = this.f17235u;
        int length = sVarArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            s sVar = sVarArr[i5];
            if (sVar.f17264A == 2) {
                j jVar = sVar.f17290d;
                int iN = jVar.f17185q.n();
                Uri[] uriArr = jVar.f17174e;
                int length2 = uriArr.length;
                b2.c cVar = jVar.f17176g;
                b2.i iVarA = (iN >= length2 || iN == -1) ? null : cVar.a(true, uriArr[jVar.f17185q.t()]);
                if (iVarA != null) {
                    AbstractC3409K abstractC3409K = iVarA.f19206r;
                    if (!abstractC3409K.isEmpty() && iVarA.f19232c) {
                        long j10 = iVarA.f19197h - cVar.f19170n;
                        long j11 = j8 - j10;
                        int iC = x.c(abstractC3409K, Long.valueOf(j11), true);
                        long j12 = ((b2.f) abstractC3409K.get(iC)).f19182e;
                        return a0Var.a(j11, j12, iC != abstractC3409K.size() - 1 ? ((b2.f) abstractC3409K.get(iC + 1)).f19182e : j12) + j10;
                    }
                }
            } else {
                i5++;
            }
        }
        return j8;
    }

    @Override // k2.f0
    public final long c() {
        return this.f17237w.c();
    }

    @Override // k2.F
    public final long d(long j8) {
        s[] sVarArr = this.f17235u;
        if (sVarArr.length > 0) {
            boolean zH = sVarArr[0].H(j8, false);
            int i5 = 1;
            while (true) {
                s[] sVarArr2 = this.f17235u;
                if (i5 >= sVarArr2.length) {
                    break;
                }
                sVarArr2[i5].H(j8, zH);
                i5++;
            }
            if (zH) {
                ((SparseArray) this.k.f17322b).clear();
            }
        }
        return j8;
    }

    @Override // k2.f0
    public final boolean e() {
        return this.f17237w.e();
    }

    @Override // k2.F
    public final long f() {
        return -9223372036854775807L;
    }

    @Override // b2.q
    public final void g() {
        for (s sVar : this.f17234t) {
            ArrayList arrayList = sVar.f17299n;
            if (!arrayList.isEmpty()) {
                l lVar = (l) AbstractC3437s.j(arrayList);
                int iB = sVar.f17290d.b(lVar);
                if (iB == 1) {
                    lVar.f17200K = true;
                } else if (iB == 0) {
                    sVar.f17303r.post(new T3.r(23, sVar, lVar));
                } else if (iB == 2 && !sVar.f17282T) {
                    o2.m mVar = sVar.f17296j;
                    if (mVar.d()) {
                        mVar.b();
                    }
                }
            }
        }
        this.f17231q.a(this);
    }

    @Override // k2.F
    public final void h() throws IOException {
        for (s sVar : this.f17234t) {
            sVar.D();
            if (sVar.f17282T && !sVar.f17267D) {
                throw D.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // k2.F
    public final void i(long j8) throws Throwable {
        for (s sVar : this.f17235u) {
            if (sVar.f17266C && !sVar.z()) {
                int length = sVar.f17307v.length;
                for (int i5 = 0; i5 < length; i5++) {
                    sVar.f17307v[i5].i(j8, sVar.f17276N[i5]);
                }
            }
        }
    }

    @Override // k2.F
    public final n0 j() {
        n0 n0Var = this.f17233s;
        n0Var.getClass();
        return n0Var;
    }

    @Override // k2.f0
    public final boolean k(U1.C c10) {
        if (this.f17233s != null) {
            return this.f17237w.k(c10);
        }
        for (s sVar : this.f17234t) {
            if (!sVar.f17267D) {
                U1.B b5 = new U1.B();
                b5.f11904a = sVar.f17278P;
                sVar.k(new U1.C(b5));
            }
        }
        return false;
    }

    public final s l(String str, int i5, Uri[] uriArr, C0765n[] c0765nArr, C0765n c0765n, List list, Map map, long j8) {
        j jVar = new j(this.f17216a, this.f17217b, uriArr, c0765nArr, this.f17218c, this.f17219d, this.k, list, this.f17229o);
        Z1.d dVar = this.f17223h;
        return new s(str, i5, this.f17230p, jVar, map, this.f17224i, j8, c0765n, this.f17220e, this.f17221f, this.f17222g, dVar, this.f17228n);
    }

    @Override // k2.f0
    public final long n() {
        return this.f17237w.n();
    }

    @Override // k2.f0
    public final void o(long j8) {
        this.f17237w.o(j8);
    }

    @Override // k2.F
    public final void q(InterfaceC3143E interfaceC3143E, long j8) {
        boolean z2;
        List list;
        ArrayList arrayList;
        int i5;
        HashSet hashSet;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        Uri[] uriArr;
        boolean z13;
        int i12;
        int i13;
        this.f17231q = interfaceC3143E;
        b2.c cVar = this.f17217b;
        cVar.getClass();
        cVar.f19162e.add(this);
        b2.l lVar = cVar.f19167j;
        lVar.getClass();
        Map map = Collections.EMPTY_MAP;
        List list2 = lVar.f19222e;
        boolean zIsEmpty = list2.isEmpty();
        this.f17232r = 0;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C1324d c1324d = this.f17216a;
        boolean z14 = this.f17227m;
        List list3 = lVar.f19224g;
        if (zIsEmpty) {
            z2 = z14;
            list = list3;
        } else {
            int size = list2.size();
            int[] iArr = new int[size];
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i14 < list2.size()) {
                C0765n c0765n = ((b2.k) list2.get(i14)).f19215b;
                if (c0765n.f8240v <= 0) {
                    String str = c0765n.k;
                    if (x.t(2, str) != null) {
                        i13 = 2;
                        i12 = 1;
                    } else {
                        i12 = 1;
                        if (x.t(1, str) != null) {
                            iArr[i14] = 1;
                            i16++;
                        } else {
                            iArr[i14] = -1;
                        }
                        i14 += i12;
                    }
                } else {
                    i12 = 1;
                    i13 = 2;
                }
                iArr[i14] = i13;
                i15 += i12;
                i14 += i12;
            }
            if (i15 > 0) {
                i11 = i15;
                z12 = false;
                z11 = true;
                z10 = z14;
            } else if (i16 < size) {
                i11 = size - i16;
                z10 = z14;
                z11 = false;
                z12 = true;
            } else {
                i11 = size;
                z10 = z14;
                z11 = false;
                z12 = false;
            }
            Uri[] uriArr2 = new Uri[i11];
            C0765n[] c0765nArr = new C0765n[i11];
            int[] iArr2 = new int[i11];
            boolean z15 = z11;
            int i17 = 0;
            int i18 = 0;
            while (i17 < list2.size()) {
                if (z15) {
                    uriArr = uriArr2;
                    if (iArr[i17] != 2) {
                        z13 = true;
                    }
                    i17++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (z12) {
                    z13 = true;
                    if (iArr[i17] != 1) {
                    }
                    i17++;
                    uriArr2 = uriArr;
                } else {
                    z13 = true;
                }
                b2.k kVar = (b2.k) list2.get(i17);
                uriArr[i18] = kVar.f19214a;
                c0765nArr[i18] = kVar.f19215b;
                iArr2[i18] = i17;
                i18++;
                i17++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = c0765nArr[0].k;
            int iS = x.s(2, str2);
            int iS2 = x.s(1, str2);
            boolean z16 = (iS2 == 1 || (iS2 == 0 && list3.isEmpty())) && iS <= 1 && iS2 + iS > 0;
            int i19 = (z15 || iS2 <= 0) ? 0 : 1;
            z2 = z10;
            list = list3;
            s sVarL = l("main", i19, uriArr3, c0765nArr, lVar.f19227j, lVar.k, map, j8);
            arrayList2.add(sVarL);
            arrayList3.add(iArr2);
            if (z2 && z16) {
                ArrayList arrayList4 = new ArrayList();
                C0765n c0765n2 = lVar.f19227j;
                if (iS > 0) {
                    C0765n[] c0765nArr2 = new C0765n[i11];
                    int i20 = 0;
                    while (i20 < i11) {
                        C0765n c0765n3 = c0765nArr[i20];
                        String strT = x.t(2, c0765n3.k);
                        String strD = C.d(strT);
                        C0764m c0764m = new C0764m();
                        c0764m.f8183a = c0765n3.f8220a;
                        c0764m.f8184b = c0765n3.f8221b;
                        c0764m.f8185c = AbstractC3409K.j(c0765n3.f8222c);
                        c0764m.f8193l = C.m(c0765n3.f8231m);
                        c0764m.f8194m = C.m(strD);
                        c0764m.f8192j = strT;
                        c0764m.k = c0765n3.f8230l;
                        c0764m.f8190h = c0765n3.f8227h;
                        c0764m.f8191i = c0765n3.f8228i;
                        c0764m.f8201t = c0765n3.f8239u;
                        c0764m.f8202u = c0765n3.f8240v;
                        c0764m.f8203v = c0765n3.f8241w;
                        c0764m.f8187e = c0765n3.f8224e;
                        c0764m.f8188f = c0765n3.f8225f;
                        c0765nArr2[i20] = new C0765n(c0764m);
                        i20++;
                        c0765nArr = c0765nArr;
                    }
                    C0765n[] c0765nArr3 = c0765nArr;
                    arrayList4.add(new O("main", c0765nArr2));
                    if (iS2 > 0 && (c0765n2 != null || list.isEmpty())) {
                        arrayList4.add(new O("main:audio", m(c0765nArr3[0], c0765n2, false)));
                    }
                    List list4 = lVar.k;
                    if (list4 != null) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            arrayList4.add(new O(AbstractC3256n.g(i21, "main:cc:"), c1324d.b((C0765n) list4.get(i21))));
                        }
                    }
                } else {
                    C0765n[] c0765nArr4 = new C0765n[i11];
                    for (int i22 = 0; i22 < i11; i22++) {
                        c0765nArr4[i22] = m(c0765nArr[i22], c0765n2, true);
                    }
                    arrayList4.add(new O("main", c0765nArr4));
                }
                C0764m c0764m2 = new C0764m();
                c0764m2.f8183a = "ID3";
                c0764m2.f8194m = C.m("application/id3");
                O o7 = new O("main:id3", new C0765n(c0764m2));
                arrayList4.add(o7);
                sVarL.F((O[]) arrayList4.toArray(new O[0]), arrayList4.indexOf(o7));
            }
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        HashSet hashSet2 = new HashSet();
        int i23 = 0;
        while (i23 < list.size()) {
            List list5 = list;
            String str3 = ((b2.j) list5.get(i23)).f19213c;
            if (hashSet2.add(str3)) {
                arrayList5.clear();
                arrayList6.clear();
                arrayList7.clear();
                int i24 = 0;
                boolean z17 = true;
                while (i24 < list5.size()) {
                    String str4 = ((b2.j) list5.get(i24)).f19213c;
                    int i25 = x.f9724a;
                    if (str3.equals(str4)) {
                        b2.j jVar = (b2.j) list5.get(i24);
                        arrayList7.add(Integer.valueOf(i24));
                        arrayList5.add(jVar.f19211a);
                        C0765n c0765n4 = jVar.f19212b;
                        arrayList6.add(c0765n4);
                        i10 = 1;
                        z17 &= x.s(1, c0765n4.k) == 1;
                    } else {
                        i10 = 1;
                    }
                    i24 += i10;
                }
                String strConcat = "audio:".concat(str3);
                int i26 = x.f9724a;
                list = list5;
                arrayList = arrayList7;
                i5 = i23;
                hashSet = hashSet2;
                s sVarL2 = l(strConcat, 1, (Uri[]) arrayList5.toArray(new Uri[0]), (C0765n[]) arrayList6.toArray(new C0765n[0]), null, Collections.EMPTY_LIST, map, j8);
                arrayList3.add(S3.f.K(arrayList));
                arrayList2.add(sVarL2);
                if (z2 && z17) {
                    sVarL2.F(new O[]{new O(strConcat, (C0765n[]) arrayList6.toArray(new C0765n[0]))}, new int[0]);
                }
            } else {
                arrayList = arrayList7;
                hashSet = hashSet2;
                i5 = i23;
                list = list5;
            }
            i23 = i5 + 1;
            arrayList7 = arrayList;
            hashSet2 = hashSet;
        }
        this.f17236v = arrayList2.size();
        int i27 = 0;
        while (true) {
            List list6 = lVar.f19225h;
            if (i27 >= list6.size()) {
                break;
            }
            b2.j jVar2 = (b2.j) list6.get(i27);
            StringBuilder sbL = pd.f.l(i27, "subtitle:", TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sbL.append(jVar2.f19213c);
            String string = sbL.toString();
            Uri[] uriArr4 = {jVar2.f19211a};
            C0765n c0765n5 = jVar2.f19212b;
            int i28 = i27;
            s sVarL3 = l(string, 3, uriArr4, new C0765n[]{c0765n5}, null, Collections.EMPTY_LIST, map, j8);
            arrayList3.add(new int[]{i28});
            arrayList2.add(sVarL3);
            sVarL3.F(new O[]{new O(string, c1324d.b(c0765n5))}, new int[0]);
            i27 = i28 + 1;
        }
        this.f17234t = (s[]) arrayList2.toArray(new s[0]);
        this.f17232r = this.f17234t.length;
        for (int i29 = 0; i29 < this.f17236v; i29++) {
            this.f17234t[i29].f17290d.f17180l = true;
        }
        for (s sVar : this.f17234t) {
            if (!sVar.f17267D) {
                U1.B b5 = new U1.B();
                b5.f11904a = sVar.f17278P;
                sVar.k(new U1.C(b5));
            }
        }
        this.f17235u = this.f17234t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028b  */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    @Override // k2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long r(n2.q[] r36, boolean[] r37, k2.d0[] r38, boolean[] r39, long r40) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.m.r(n2.q[], boolean[], k2.d0[], boolean[], long):long");
    }
}
