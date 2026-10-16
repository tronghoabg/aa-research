package l2;

import A.C0230x;
import E4.F;
import N1.C0765n;
import Q1.x;
import U1.C;
import Y2.B;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.C3168z;
import k2.H;
import k2.c0;
import k2.d0;
import k2.e0;
import k2.f0;
import ka.AbstractC3256n;

/* renamed from: l2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3383h implements d0, f0, o2.h, o2.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f39903a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f39904b;

    /* renamed from: c, reason: collision with root package name */
    public final C0765n[] f39905c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f39906d;

    /* renamed from: e, reason: collision with root package name */
    public final i f39907e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f39908f;

    /* renamed from: g, reason: collision with root package name */
    public final Z1.d f39909g;

    /* renamed from: h, reason: collision with root package name */
    public final ae.d f39910h;

    /* renamed from: i, reason: collision with root package name */
    public final o2.m f39911i;

    /* renamed from: j, reason: collision with root package name */
    public final F f39912j;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final List f39913l;

    /* renamed from: m, reason: collision with root package name */
    public final c0 f39914m;

    /* renamed from: n, reason: collision with root package name */
    public final c0[] f39915n;

    /* renamed from: o, reason: collision with root package name */
    public final B f39916o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC3380e f39917p;

    /* renamed from: q, reason: collision with root package name */
    public C0765n f39918q;

    /* renamed from: r, reason: collision with root package name */
    public X1.b f39919r;

    /* renamed from: s, reason: collision with root package name */
    public long f39920s;

    /* renamed from: t, reason: collision with root package name */
    public long f39921t;

    /* renamed from: u, reason: collision with root package name */
    public int f39922u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC3376a f39923v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39924w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f39925x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f39926y;

    public C3383h(int i5, int[] iArr, C0765n[] c0765nArr, i iVar, e0 e0Var, o2.e eVar, long j8, Z1.g gVar, Z1.d dVar, ae.d dVar2, Z1.d dVar3, boolean z2) {
        this.f39903a = i5;
        int i10 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f39904b = iArr;
        this.f39905c = c0765nArr == null ? new C0765n[0] : c0765nArr;
        this.f39907e = iVar;
        this.f39908f = e0Var;
        this.f39909g = dVar3;
        this.f39910h = dVar2;
        this.f39924w = z2;
        this.f39911i = new o2.m("ChunkSampleStream");
        this.f39912j = new F(12);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f39913l = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f39915n = new c0[length];
        this.f39906d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        c0[] c0VarArr = new c0[i11];
        gVar.getClass();
        c0 c0Var = new c0(eVar, gVar, dVar);
        this.f39914m = c0Var;
        iArr2[0] = i5;
        c0VarArr[0] = c0Var;
        while (i10 < length) {
            c0 c0Var2 = new c0(eVar, null, null);
            this.f39915n[i10] = c0Var2;
            int i12 = i10 + 1;
            c0VarArr[i12] = c0Var2;
            iArr2[i12] = this.f39904b[i10];
            i10 = i12;
        }
        this.f39916o = new B(iArr2, false, c0VarArr, 17);
        this.f39920s = j8;
        this.f39921t = j8;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, k2.e0] */
    @Override // o2.h
    public final void A(o2.j jVar, long j8, long j10) {
        AbstractC3380e abstractC3380e = (AbstractC3380e) jVar;
        this.f39917p = null;
        this.f39907e.c(abstractC3380e);
        long j11 = abstractC3380e.f39889a;
        Uri uri = abstractC3380e.f39897i.f10922c;
        C3168z c3168z = new C3168z(j10);
        this.f39910h.getClass();
        this.f39909g.e(c3168z, abstractC3380e.f39891c, this.f39903a, abstractC3380e.f39892d, abstractC3380e.f39893e, abstractC3380e.f39894f, abstractC3380e.f39895g, abstractC3380e.f39896h);
        this.f39908f.a(this);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, k2.e0] */
    @Override // o2.h
    public final U5.f E(o2.j jVar, long j8, long j10, IOException iOException, int i5) {
        U5.f fVar;
        AbstractC3380e abstractC3380e = (AbstractC3380e) jVar;
        long j11 = abstractC3380e.f39897i.f10921b;
        boolean z2 = abstractC3380e instanceof AbstractC3376a;
        ArrayList arrayList = this.k;
        int size = arrayList.size() - 1;
        boolean z10 = (j11 != 0 && z2 && t(size)) ? false : true;
        Uri uri = abstractC3380e.f39897i.f10922c;
        C3168z c3168z = new C3168z(j10);
        x.W(abstractC3380e.f39895g);
        x.W(abstractC3380e.f39896h);
        C0230x c0230x = new C0230x(iOException, i5, 17);
        i iVar = this.f39907e;
        ae.d dVar = this.f39910h;
        if (!iVar.e(abstractC3380e, z10, c0230x, dVar)) {
            fVar = null;
        } else if (z10) {
            if (z2) {
                Q1.k.g(l(size) == abstractC3380e);
                if (arrayList.isEmpty()) {
                    this.f39920s = this.f39921t;
                }
            }
            fVar = o2.m.f41318e;
        } else {
            Q1.k.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            fVar = null;
        }
        if (fVar == null) {
            dVar.getClass();
            long jH = ae.d.h(c0230x);
            fVar = jH != -9223372036854775807L ? new U5.f(jH, 0, false) : o2.m.f41319f;
        }
        boolean zA = fVar.a();
        this.f39909g.f(c3168z, abstractC3380e.f39891c, this.f39903a, abstractC3380e.f39892d, abstractC3380e.f39893e, abstractC3380e.f39894f, abstractC3380e.f39895g, abstractC3380e.f39896h, iOException, !zA);
        if (!zA) {
            this.f39917p = null;
            dVar.getClass();
            this.f39908f.a(this);
        }
        return fVar;
    }

    @Override // k2.d0
    public final void a() throws Z1.b {
        o2.m mVar = this.f39911i;
        mVar.a();
        this.f39914m.x();
        if (mVar.d()) {
            return;
        }
        this.f39907e.a();
    }

    @Override // k2.f0
    public final long c() {
        if (u()) {
            return this.f39920s;
        }
        if (this.f39926y) {
            return Long.MIN_VALUE;
        }
        return m().f39896h;
    }

    @Override // k2.f0
    public final boolean e() {
        return this.f39911i.d();
    }

    @Override // k2.d0
    public final int g(long j8) {
        if (u()) {
            return 0;
        }
        c0 c0Var = this.f39914m;
        int iT = c0Var.t(j8, this.f39926y);
        AbstractC3376a abstractC3376a = this.f39923v;
        if (abstractC3376a != null) {
            iT = Math.min(iT, abstractC3376a.c(0) - c0Var.r());
        }
        c0Var.G(iT);
        v();
        return iT;
    }

    public final void i(long j8) throws Throwable {
        long j10;
        if (u()) {
            return;
        }
        c0 c0Var = this.f39914m;
        int i5 = c0Var.f39048q;
        c0Var.i(j8, true);
        c0 c0Var2 = this.f39914m;
        int i10 = c0Var2.f39048q;
        if (i10 > i5) {
            synchronized (c0Var2) {
                j10 = c0Var2.f39047p == 0 ? Long.MIN_VALUE : c0Var2.f39045n[c0Var2.f39049r];
            }
            int i11 = 0;
            while (true) {
                c0[] c0VarArr = this.f39915n;
                if (i11 >= c0VarArr.length) {
                    break;
                }
                c0VarArr[i11].i(j10, this.f39906d[i11]);
                i11++;
            }
        }
        int iMin = Math.min(x(i10, 0), this.f39922u);
        if (iMin > 0) {
            x.P(this.k, 0, iMin);
            this.f39922u -= iMin;
        }
    }

    @Override // k2.d0
    public final boolean isReady() {
        return !u() && this.f39914m.v(this.f39926y);
    }

    @Override // k2.f0
    public final boolean k(C c10) {
        long j8;
        List list;
        if (!this.f39926y) {
            o2.m mVar = this.f39911i;
            if (!mVar.d() && !mVar.c()) {
                boolean zU = u();
                if (zU) {
                    list = Collections.EMPTY_LIST;
                    j8 = this.f39920s;
                } else {
                    j8 = m().f39896h;
                    list = this.f39913l;
                }
                this.f39907e.f(c10, j8, list, this.f39912j);
                F f10 = this.f39912j;
                boolean z2 = f10.f2853b;
                AbstractC3380e abstractC3380e = (AbstractC3380e) f10.f2854c;
                f10.f2854c = null;
                f10.f2853b = false;
                if (z2) {
                    this.f39920s = -9223372036854775807L;
                    this.f39926y = true;
                    return true;
                }
                if (abstractC3380e != null) {
                    this.f39917p = abstractC3380e;
                    boolean z10 = abstractC3380e instanceof AbstractC3376a;
                    B b5 = this.f39916o;
                    if (z10) {
                        AbstractC3376a abstractC3376a = (AbstractC3376a) abstractC3380e;
                        if (zU) {
                            long j10 = this.f39920s;
                            if (abstractC3376a.f39895g < j10) {
                                this.f39914m.f39051t = j10;
                                for (c0 c0Var : this.f39915n) {
                                    c0Var.f39051t = this.f39920s;
                                }
                                if (this.f39924w) {
                                    C0765n c0765n = abstractC3376a.f39892d;
                                    this.f39925x = !N1.C.a(c0765n.f8232n, c0765n.k);
                                }
                            }
                            this.f39924w = false;
                            this.f39920s = -9223372036854775807L;
                        }
                        abstractC3376a.f39868m = b5;
                        c0[] c0VarArr = (c0[]) b5.f16384c;
                        int[] iArr = new int[c0VarArr.length];
                        for (int i5 = 0; i5 < c0VarArr.length; i5++) {
                            c0 c0Var2 = c0VarArr[i5];
                            iArr[i5] = c0Var2.f39048q + c0Var2.f39047p;
                        }
                        abstractC3376a.f39869n = iArr;
                        this.k.add(abstractC3376a);
                    } else if (abstractC3380e instanceof k) {
                        ((k) abstractC3380e).k = b5;
                    }
                    mVar.f(abstractC3380e, this, this.f39910h.g(abstractC3380e.f39891c));
                    this.f39909g.h(new C3168z(abstractC3380e.f39890b), abstractC3380e.f39891c, this.f39903a, abstractC3380e.f39892d, abstractC3380e.f39893e, abstractC3380e.f39894f, abstractC3380e.f39895g, abstractC3380e.f39896h);
                    return true;
                }
            }
        }
        return false;
    }

    public final AbstractC3376a l(int i5) {
        ArrayList arrayList = this.k;
        AbstractC3376a abstractC3376a = (AbstractC3376a) arrayList.get(i5);
        x.P(arrayList, i5, arrayList.size());
        this.f39922u = Math.max(this.f39922u, arrayList.size());
        int i10 = 0;
        this.f39914m.l(abstractC3376a.c(0));
        while (true) {
            c0[] c0VarArr = this.f39915n;
            if (i10 >= c0VarArr.length) {
                return abstractC3376a;
            }
            c0 c0Var = c0VarArr[i10];
            i10++;
            c0Var.l(abstractC3376a.c(i10));
        }
    }

    public final AbstractC3376a m() {
        return (AbstractC3376a) AbstractC3256n.e(this.k, 1);
    }

    @Override // k2.f0
    public final long n() {
        if (this.f39926y) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.f39920s;
        }
        long jMax = this.f39921t;
        AbstractC3376a abstractC3376aM = m();
        if (!abstractC3376aM.b()) {
            ArrayList arrayList = this.k;
            abstractC3376aM = arrayList.size() > 1 ? (AbstractC3376a) AbstractC3256n.e(arrayList, 2) : null;
        }
        if (abstractC3376aM != null) {
            jMax = Math.max(jMax, abstractC3376aM.f39896h);
        }
        return Math.max(jMax, this.f39914m.o());
    }

    @Override // k2.f0
    public final void o(long j8) {
        o2.m mVar = this.f39911i;
        if (mVar.c() || u()) {
            return;
        }
        boolean zD = mVar.d();
        i iVar = this.f39907e;
        ArrayList arrayList = this.k;
        List list = this.f39913l;
        if (zD) {
            AbstractC3380e abstractC3380e = this.f39917p;
            abstractC3380e.getClass();
            boolean z2 = abstractC3380e instanceof AbstractC3376a;
            if (!(z2 && t(arrayList.size() - 1)) && iVar.d(j8, abstractC3380e, list)) {
                mVar.b();
                if (z2) {
                    this.f39923v = (AbstractC3376a) abstractC3380e;
                    return;
                }
                return;
            }
            return;
        }
        int iG = iVar.g(j8, list);
        if (iG < arrayList.size()) {
            Q1.k.g(!mVar.d());
            int size = arrayList.size();
            while (true) {
                if (iG >= size) {
                    iG = -1;
                    break;
                } else if (!t(iG)) {
                    break;
                } else {
                    iG++;
                }
            }
            if (iG == -1) {
                return;
            }
            long j10 = m().f39896h;
            AbstractC3376a abstractC3376aL = l(iG);
            if (arrayList.isEmpty()) {
                this.f39920s = this.f39921t;
            }
            this.f39926y = false;
            Z1.d dVar = this.f39909g;
            h2.g gVar = new h2.g(1, this.f39903a, null, 3, null, x.W(abstractC3376aL.f39895g), x.W(j10));
            H h10 = dVar.f16927b;
            h10.getClass();
            dVar.a(new A5.g(dVar, h10, gVar, 16));
        }
    }

    @Override // o2.k
    public final void p() {
        this.f39914m.B();
        for (c0 c0Var : this.f39915n) {
            c0Var.B();
        }
        this.f39907e.release();
        X1.b bVar = this.f39919r;
        if (bVar != null) {
            synchronized (bVar) {
                X1.l lVar = (X1.l) bVar.f15930n.remove(this);
                if (lVar != null) {
                    lVar.f16012a.B();
                }
            }
        }
    }

    @Override // k2.d0
    public final int s(S3.c cVar, T1.d dVar, int i5) {
        if (u()) {
            return -3;
        }
        AbstractC3376a abstractC3376a = this.f39923v;
        c0 c0Var = this.f39914m;
        if (abstractC3376a != null && abstractC3376a.c(0) <= c0Var.r()) {
            return -3;
        }
        v();
        return c0Var.A(cVar, dVar, i5, this.f39926y);
    }

    public final boolean t(int i5) {
        int iR;
        AbstractC3376a abstractC3376a = (AbstractC3376a) this.k.get(i5);
        if (this.f39914m.r() > abstractC3376a.c(0)) {
            return true;
        }
        int i10 = 0;
        do {
            c0[] c0VarArr = this.f39915n;
            if (i10 >= c0VarArr.length) {
                return false;
            }
            iR = c0VarArr[i10].r();
            i10++;
        } while (iR <= abstractC3376a.c(i10));
        return true;
    }

    public final boolean u() {
        return this.f39920s != -9223372036854775807L;
    }

    public final void v() {
        int iX = x(this.f39914m.r(), this.f39922u - 1);
        while (true) {
            int i5 = this.f39922u;
            if (i5 > iX) {
                return;
            }
            this.f39922u = i5 + 1;
            AbstractC3376a abstractC3376a = (AbstractC3376a) this.k.get(i5);
            C0765n c0765n = abstractC3376a.f39892d;
            if (!c0765n.equals(this.f39918q)) {
                this.f39909g.b(this.f39903a, c0765n, abstractC3376a.f39893e, abstractC3376a.f39894f, abstractC3376a.f39895g);
            }
            this.f39918q = c0765n;
        }
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, k2.e0] */
    @Override // o2.h
    public final void w(o2.j jVar, long j8, long j10, boolean z2) {
        AbstractC3380e abstractC3380e = (AbstractC3380e) jVar;
        this.f39917p = null;
        this.f39923v = null;
        long j11 = abstractC3380e.f39889a;
        Uri uri = abstractC3380e.f39897i.f10922c;
        C3168z c3168z = new C3168z(j10);
        this.f39910h.getClass();
        this.f39909g.c(c3168z, abstractC3380e.f39891c, this.f39903a, abstractC3380e.f39892d, abstractC3380e.f39893e, abstractC3380e.f39894f, abstractC3380e.f39895g, abstractC3380e.f39896h);
        if (z2) {
            return;
        }
        if (u()) {
            this.f39914m.C(false);
            for (c0 c0Var : this.f39915n) {
                c0Var.C(false);
            }
        } else if (abstractC3380e instanceof AbstractC3376a) {
            ArrayList arrayList = this.k;
            l(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f39920s = this.f39921t;
            }
        }
        this.f39908f.a(this);
    }

    public final int x(int i5, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.k;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((AbstractC3376a) arrayList.get(i10)).c(0) <= i5);
        return i10 - 1;
    }

    public final void y(X1.b bVar) {
        this.f39919r = bVar;
        c0 c0Var = this.f39914m;
        c0Var.j();
        S3.l lVar = c0Var.f39040h;
        if (lVar != null) {
            lVar.s(c0Var.f39037e);
            c0Var.f39040h = null;
            c0Var.f39039g = null;
        }
        for (c0 c0Var2 : this.f39915n) {
            c0Var2.j();
            S3.l lVar2 = c0Var2.f39040h;
            if (lVar2 != null) {
                lVar2.s(c0Var2.f39037e);
                c0Var2.f39040h = null;
                c0Var2.f39039g = null;
            }
        }
        this.f39911i.e(this);
    }

    public final void z(long j8) throws Throwable {
        ArrayList arrayList;
        AbstractC3376a abstractC3376a;
        this.f39921t = j8;
        int i5 = 0;
        this.f39924w = false;
        if (u()) {
            this.f39920s = j8;
            return;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.k;
            if (i10 >= arrayList.size()) {
                break;
            }
            abstractC3376a = (AbstractC3376a) arrayList.get(i10);
            long j10 = abstractC3376a.f39895g;
            if (j10 == j8 && abstractC3376a.k == -9223372036854775807L) {
                break;
            } else if (j10 > j8) {
                break;
            } else {
                i10++;
            }
        }
        abstractC3376a = null;
        c0 c0Var = this.f39914m;
        boolean zE = abstractC3376a != null ? c0Var.E(abstractC3376a.c(0)) : c0Var.F(j8, j8 < c());
        c0[] c0VarArr = this.f39915n;
        if (zE) {
            this.f39922u = x(c0Var.r(), 0);
            int length = c0VarArr.length;
            while (i5 < length) {
                c0VarArr[i5].F(j8, true);
                i5++;
            }
            return;
        }
        this.f39920s = j8;
        this.f39926y = false;
        arrayList.clear();
        this.f39922u = 0;
        o2.m mVar = this.f39911i;
        if (mVar.d()) {
            c0Var.j();
            int length2 = c0VarArr.length;
            while (i5 < length2) {
                c0VarArr[i5].j();
                i5++;
            }
            mVar.b();
            return;
        }
        mVar.f41322c = null;
        c0Var.C(false);
        for (c0 c0Var2 : c0VarArr) {
            c0Var2.C(false);
        }
    }
}
