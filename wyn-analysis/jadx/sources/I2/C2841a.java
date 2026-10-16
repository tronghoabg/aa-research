package i2;

import A.C0230x;
import E4.F;
import F6.p;
import M2.l;
import M2.s;
import M2.t;
import N1.C0765n;
import Q1.k;
import Q1.x;
import S1.h;
import U1.C;
import U1.a0;
import U5.f;
import Va.M6;
import ae.d;
import android.net.Uri;
import android.os.SystemClock;
import ff.AbstractC2641B;
import j2.C3077a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k2.C3145b;
import l2.AbstractC3380e;
import l2.C3379d;
import l2.InterfaceC3381f;
import l2.i;
import l2.j;
import l2.m;
import l8.e0;
import n2.q;
import o2.n;
import wa.C4398a;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2841a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final n f36720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36721b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3381f[] f36722c;

    /* renamed from: d, reason: collision with root package name */
    public final h f36723d;

    /* renamed from: e, reason: collision with root package name */
    public q f36724e;

    /* renamed from: f, reason: collision with root package name */
    public j2.c f36725f;

    /* renamed from: g, reason: collision with root package name */
    public int f36726g;

    /* renamed from: h, reason: collision with root package name */
    public C3145b f36727h;

    public C2841a(n nVar, j2.c cVar, int i5, q qVar, h hVar, C4398a c4398a, boolean z2) {
        t[] tVarArr;
        this.f36720a = nVar;
        this.f36725f = cVar;
        this.f36721b = i5;
        this.f36724e = qVar;
        this.f36723d = hVar;
        j2.b bVar = cVar.f38600f[i5];
        this.f36722c = new InterfaceC3381f[qVar.length()];
        for (int i10 = 0; i10 < this.f36722c.length; i10++) {
            int iC = qVar.c(i10);
            C0765n c0765n = bVar.f38589j[iC];
            if (c0765n.f8236r != null) {
                C3077a c3077a = cVar.f38599e;
                c3077a.getClass();
                tVarArr = c3077a.f38579c;
            } else {
                tVarArr = null;
            }
            t[] tVarArr2 = tVarArr;
            int i11 = bVar.f38580a;
            int i12 = i11 == 2 ? 4 : 0;
            long j8 = cVar.f38601g;
            this.f36722c[i10] = new C3379d(new l(c4398a, !z2 ? 35 : 3, null, new s(iC, i11, bVar.f38582c, -9223372036854775807L, j8, j8, c0765n, 0, tVarArr2, i12, null, null), e0.f40101e, null), bVar.f38580a, c0765n);
        }
    }

    @Override // l2.i
    public final void a() throws C3145b {
        C3145b c3145b = this.f36727h;
        if (c3145b != null) {
            throw c3145b;
        }
        this.f36720a.a();
    }

    @Override // l2.i
    public final long b(long j8, a0 a0Var) {
        j2.b bVar = this.f36725f.f38600f[this.f36721b];
        int iE = x.e(bVar.f38593o, j8, true);
        long[] jArr = bVar.f38593o;
        long j10 = jArr[iE];
        return a0Var.a(j8, j10, (j10 >= j8 || iE >= bVar.k - 1) ? j10 : jArr[iE + 1]);
    }

    @Override // l2.i
    public final boolean d(long j8, AbstractC3380e abstractC3380e, List list) {
        if (this.f36727h != null) {
            return false;
        }
        return this.f36724e.r(j8, abstractC3380e, list);
    }

    @Override // l2.i
    public final boolean e(AbstractC3380e abstractC3380e, boolean z2, C0230x c0230x, d dVar) {
        p pVarO = AbstractC2641B.o(this.f36724e);
        dVar.getClass();
        f fVarF = d.f(pVarO, c0230x);
        if (!z2 || fVarF == null || fVarF.f12344a != 2) {
            return false;
        }
        q qVar = this.f36724e;
        return qVar.o(qVar.q(abstractC3380e.f39892d), fVarF.f12345b);
    }

    @Override // l2.i
    public final void f(C c10, long j8, List list, F f10) {
        List list2;
        int iA;
        long jB;
        if (this.f36727h != null) {
            return;
        }
        j2.b[] bVarArr = this.f36725f.f38600f;
        int i5 = this.f36721b;
        j2.b bVar = bVarArr[i5];
        if (bVar.k == 0) {
            f10.f2853b = !r4.f38598d;
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        long[] jArr = bVar.f38593o;
        if (zIsEmpty) {
            iA = x.e(jArr, j8, true);
            list2 = list;
        } else {
            list2 = list;
            iA = (int) (((l2.l) M6.k(1, list2)).a() - this.f36726g);
            if (iA < 0) {
                this.f36727h = new C3145b();
                return;
            }
        }
        if (iA >= bVar.k) {
            f10.f2853b = !this.f36725f.f38598d;
            return;
        }
        long j10 = c10.f11907a;
        long j11 = j8 - j10;
        j2.c cVar = this.f36725f;
        if (cVar.f38598d) {
            j2.b bVar2 = cVar.f38600f[i5];
            int i10 = bVar2.k - 1;
            jB = (bVar2.b(i10) + bVar2.f38593o[i10]) - j10;
        } else {
            jB = -9223372036854775807L;
        }
        int length = this.f36724e.length();
        m[] mVarArr = new m[length];
        for (int i11 = 0; i11 < length; i11++) {
            this.f36724e.c(i11);
            mVarArr[i11] = new X1.h(bVar, iA);
        }
        List list3 = list2;
        int i12 = iA;
        this.f36724e.l(j10, j11, jB, list3, mVarArr);
        long j12 = jArr[i12];
        long jB2 = bVar.b(i12) + j12;
        long j13 = list.isEmpty() ? j8 : -9223372036854775807L;
        int i13 = i12 + this.f36726g;
        int iN = this.f36724e.n();
        InterfaceC3381f interfaceC3381f = this.f36722c[iN];
        int iC = this.f36724e.c(iN);
        C0765n[] c0765nArr = bVar.f38589j;
        k.g(c0765nArr != null);
        ArrayList arrayList = bVar.f38592n;
        k.g(arrayList != null);
        k.g(i12 < arrayList.size());
        String string = Integer.toString(c0765nArr[iC].f8229j);
        String string2 = ((Long) arrayList.get(i12)).toString();
        Uri uriU = k.u(bVar.f38590l, bVar.f38591m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        SystemClock.elapsedRealtime();
        C0765n c0765nJ = this.f36724e.j();
        int iU = this.f36724e.u();
        Object objP = this.f36724e.p();
        Map map = Collections.EMPTY_MAP;
        k.i(uriU, "The uri must be set.");
        f10.f2854c = new j(this.f36723d, new S1.k(uriU, 1, null, map, 0L, -1L, null, 0), c0765nJ, iU, objP, j12, jB2, j13, -9223372036854775807L, i13, 1, j12, interfaceC3381f);
    }

    @Override // l2.i
    public final int g(long j8, List list) {
        return (this.f36727h != null || this.f36724e.length() < 2) ? list.size() : this.f36724e.s(j8, list);
    }

    @Override // l2.i
    public final void release() {
        for (InterfaceC3381f interfaceC3381f : this.f36722c) {
            ((C3379d) interfaceC3381f).f39880a.release();
        }
    }

    @Override // l2.i
    public final void c(AbstractC3380e abstractC3380e) {
    }
}
