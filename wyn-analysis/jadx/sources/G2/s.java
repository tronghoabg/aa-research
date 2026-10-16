package g2;

import A.C0230x;
import N1.C0765n;
import N1.O;
import U1.a0;
import ac.C1346a;
import ad.C1355I;
import android.net.Uri;
import android.os.Handler;
import io.ktor.utils.io.T;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.SocketFactory;
import k2.InterfaceC3143E;
import k2.c0;
import k2.d0;
import k2.n0;
import l8.AbstractC3403E;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.e0;
import l8.j0;

/* loaded from: classes.dex */
public final class s implements k2.F {

    /* renamed from: a, reason: collision with root package name */
    public final o2.e f35659a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f35660b = Q1.x.m(null);

    /* renamed from: c, reason: collision with root package name */
    public final C1346a f35661c;

    /* renamed from: d, reason: collision with root package name */
    public final C2693n f35662d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f35663e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f35664f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.ads.nativead.l f35665g;

    /* renamed from: h, reason: collision with root package name */
    public final C1355I f35666h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC3143E f35667i;

    /* renamed from: j, reason: collision with root package name */
    public e0 f35668j;
    public IOException k;

    /* renamed from: l, reason: collision with root package name */
    public T f35669l;

    /* renamed from: m, reason: collision with root package name */
    public long f35670m;

    /* renamed from: n, reason: collision with root package name */
    public long f35671n;

    /* renamed from: o, reason: collision with root package name */
    public long f35672o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35673p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35674q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f35675r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35676s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f35677t;

    /* renamed from: u, reason: collision with root package name */
    public int f35678u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35679v;

    public s(o2.e eVar, C1355I c1355i, Uri uri, com.google.android.gms.ads.nativead.l lVar, String str, SocketFactory socketFactory) {
        this.f35659a = eVar;
        this.f35666h = c1355i;
        this.f35665g = lVar;
        C1346a c1346a = new C1346a(this, 6);
        this.f35661c = c1346a;
        this.f35662d = new C2693n(c1346a, c1346a, str, uri, socketFactory);
        this.f35663e = new ArrayList();
        this.f35664f = new ArrayList();
        this.f35671n = -9223372036854775807L;
        this.f35670m = -9223372036854775807L;
        this.f35672o = -9223372036854775807L;
    }

    public static void a(s sVar) {
        sVar.f35673p = true;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = sVar.f35663e;
            if (i5 >= arrayList.size()) {
                return;
            }
            sVar.f35673p = ((r) arrayList.get(i5)).f35656d & sVar.f35673p;
            i5++;
        }
    }

    public static void g(s sVar) {
        if (sVar.f35675r || sVar.f35676s) {
            return;
        }
        int i5 = 0;
        while (true) {
            ArrayList arrayList = sVar.f35663e;
            if (i5 >= arrayList.size()) {
                sVar.f35676s = true;
                AbstractC3409K abstractC3409KJ = AbstractC3409K.j(arrayList);
                AbstractC3437s.d(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (i10 < abstractC3409KJ.size()) {
                    c0 c0Var = ((r) abstractC3409KJ.get(i10)).f35655c;
                    String string = Integer.toString(i10);
                    C0765n c0765nU = c0Var.u();
                    c0765nU.getClass();
                    O o7 = new O(string, c0765nU);
                    int i12 = i11 + 1;
                    int iF = AbstractC3403E.f(objArrCopyOf.length, i12);
                    if (iF > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                    }
                    objArrCopyOf[i11] = o7;
                    i10++;
                    i11 = i12;
                }
                sVar.f35668j = AbstractC3409K.h(i11, objArrCopyOf);
                InterfaceC3143E interfaceC3143E = sVar.f35667i;
                interfaceC3143E.getClass();
                interfaceC3143E.l(sVar);
                return;
            }
            if (((r) arrayList.get(i5)).f35655c.u() == null) {
                return;
            } else {
                i5++;
            }
        }
    }

    public static void l(s sVar) {
        sVar.f35679v = true;
        C2693n c2693n = sVar.f35662d;
        c2693n.getClass();
        try {
            c2693n.close();
            z zVar = new z(new Y2.B(c2693n));
            c2693n.f35636i = zVar;
            zVar.a(c2693n.d(c2693n.f35635h));
            c2693n.k = null;
            c2693n.f35643q = false;
            c2693n.f35640n = null;
        } catch (IOException e7) {
            c2693n.f35629b.L(new T(e7));
        }
        sVar.f35666h.getClass();
        ad.r rVar = new ad.r();
        ArrayList arrayList = sVar.f35663e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = sVar.f35664f;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            r rVar2 = (r) arrayList.get(i5);
            if (rVar2.f35656d) {
                arrayList2.add(rVar2);
            } else {
                q qVar = rVar2.f35653a;
                r rVar3 = new r(sVar, qVar.f35649a, i5, rVar);
                arrayList2.add(rVar3);
                q qVar2 = rVar3.f35653a;
                rVar3.f35654b.f(qVar2.f35650b, sVar.f35661c, 0);
                if (arrayList3.contains(qVar)) {
                    arrayList4.add(qVar2);
                }
            }
        }
        AbstractC3409K abstractC3409KJ = AbstractC3409K.j(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        for (int i10 = 0; i10 < abstractC3409KJ.size(); i10++) {
            ((r) abstractC3409KJ.get(i10)).a();
        }
    }

    @Override // k2.f0
    public final long c() {
        return n();
    }

    @Override // k2.F
    public final long d(long j8) throws Throwable {
        if (n() == 0 && !this.f35679v) {
            this.f35672o = j8;
            return j8;
        }
        i(j8);
        this.f35670m = j8;
        if (m()) {
            C2693n c2693n = this.f35662d;
            int i5 = c2693n.f35641o;
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException();
                }
                this.f35671n = j8;
                c2693n.h(j8);
                return j8;
            }
        } else {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f35663e;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((r) arrayList.get(i10)).f35655c.F(j8, false)) {
                    i10++;
                } else {
                    this.f35671n = j8;
                    if (this.f35673p) {
                        for (int i11 = 0; i11 < this.f35663e.size(); i11++) {
                            r rVar = (r) this.f35663e.get(i11);
                            Q1.k.g(rVar.f35656d);
                            rVar.f35656d = false;
                            a(rVar.f35658f);
                            rVar.f35654b.f(rVar.f35653a.f35650b, rVar.f35658f.f35661c, 0);
                        }
                        if (this.f35679v) {
                            this.f35662d.i(Q1.x.W(j8));
                        } else {
                            this.f35662d.h(j8);
                        }
                    } else {
                        this.f35662d.h(j8);
                    }
                    for (int i12 = 0; i12 < this.f35663e.size(); i12++) {
                        r rVar2 = (r) this.f35663e.get(i12);
                        if (!rVar2.f35656d) {
                            C2686g c2686g = rVar2.f35653a.f35650b.f35584h;
                            c2686g.getClass();
                            synchronized (c2686g.f35592e) {
                                c2686g.k = true;
                            }
                            rVar2.f35655c.C(false);
                            rVar2.f35655c.f39051t = j8;
                        }
                    }
                }
            }
        }
        return j8;
    }

    @Override // k2.f0
    public final boolean e() {
        if (this.f35673p) {
            return false;
        }
        int i5 = this.f35662d.f35641o;
        return i5 == 2 || i5 == 1;
    }

    @Override // k2.F
    public final long f() {
        if (!this.f35674q) {
            return -9223372036854775807L;
        }
        this.f35674q = false;
        return 0L;
    }

    @Override // k2.F
    public final void h() throws IOException {
        IOException iOException = this.k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // k2.F
    public final void i(long j8) throws Throwable {
        if (m()) {
            return;
        }
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f35663e;
            if (i5 >= arrayList.size()) {
                return;
            }
            r rVar = (r) arrayList.get(i5);
            if (!rVar.f35656d) {
                rVar.f35655c.i(j8, true);
            }
            i5++;
        }
    }

    @Override // k2.F
    public final n0 j() {
        Q1.k.g(this.f35676s);
        e0 e0Var = this.f35668j;
        e0Var.getClass();
        return new n0((O[]) e0Var.toArray(new O[0]));
    }

    @Override // k2.f0
    public final boolean k(U1.C c10) {
        return e();
    }

    public final boolean m() {
        return this.f35671n != -9223372036854775807L;
    }

    @Override // k2.f0
    public final long n() {
        if (!this.f35673p) {
            ArrayList arrayList = this.f35663e;
            if (!arrayList.isEmpty()) {
                long j8 = this.f35670m;
                if (j8 != -9223372036854775807L) {
                    return j8;
                }
                boolean z2 = true;
                long jMin = Long.MAX_VALUE;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    r rVar = (r) arrayList.get(i5);
                    if (!rVar.f35656d) {
                        jMin = Math.min(jMin, rVar.f35655c.o());
                        z2 = false;
                    }
                }
                if (z2 || jMin == Long.MIN_VALUE) {
                    return 0L;
                }
                return jMin;
            }
        }
        return Long.MIN_VALUE;
    }

    public final void p() {
        ArrayList arrayList;
        boolean z2 = true;
        int i5 = 0;
        while (true) {
            arrayList = this.f35664f;
            if (i5 >= arrayList.size()) {
                break;
            }
            z2 &= ((q) arrayList.get(i5)).f35651c != null;
            i5++;
        }
        if (z2 && this.f35677t) {
            C2693n c2693n = this.f35662d;
            c2693n.f35632e.addAll(arrayList);
            c2693n.b();
        }
    }

    @Override // k2.F
    public final void q(InterfaceC3143E interfaceC3143E, long j8) throws NumberFormatException, IOException {
        C2693n c2693n = this.f35662d;
        this.f35667i = interfaceC3143E;
        try {
            c2693n.getClass();
            try {
                c2693n.f35636i.a(c2693n.d(c2693n.f35635h));
                Uri uri = c2693n.f35635h;
                String str = c2693n.k;
                E4.n nVar = c2693n.f35634g;
                nVar.y(nVar.k(4, str, j0.f40119g, uri));
            } catch (IOException e7) {
                Q1.x.g(c2693n.f35636i);
                throw e7;
            }
        } catch (IOException e10) {
            this.k = e10;
            Q1.x.g(c2693n);
        }
    }

    @Override // k2.F
    public final long r(n2.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j8) {
        ArrayList arrayList;
        for (int i5 = 0; i5 < qVarArr.length; i5++) {
            if (d0VarArr[i5] != null && (qVarArr[i5] == null || !zArr[i5])) {
                d0VarArr[i5] = null;
            }
        }
        ArrayList arrayList2 = this.f35664f;
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            int length = qVarArr.length;
            arrayList = this.f35663e;
            if (i10 >= length) {
                break;
            }
            n2.q qVar = qVarArr[i10];
            if (qVar != null) {
                O oG = qVar.g();
                e0 e0Var = this.f35668j;
                e0Var.getClass();
                int iIndexOf = e0Var.indexOf(oG);
                r rVar = (r) arrayList.get(iIndexOf);
                rVar.getClass();
                arrayList2.add(rVar.f35653a);
                if (this.f35668j.contains(oG) && d0VarArr[i10] == null) {
                    d0VarArr[i10] = new C0230x(this, iIndexOf, 15);
                    zArr2[i10] = true;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r rVar2 = (r) arrayList.get(i11);
            if (!arrayList2.contains(rVar2.f35653a)) {
                rVar2.a();
            }
        }
        this.f35677t = true;
        if (j8 != 0) {
            this.f35670m = j8;
            this.f35671n = j8;
            this.f35672o = j8;
        }
        p();
        return j8;
    }

    @Override // k2.f0
    public final void o(long j8) {
    }

    @Override // k2.F
    public final long b(long j8, a0 a0Var) {
        return j8;
    }
}
