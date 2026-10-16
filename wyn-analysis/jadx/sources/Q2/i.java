package q2;

import N1.C0757f;
import N1.C0764m;
import N1.C0765n;
import N1.W;
import N1.Y;
import Q1.t;
import Q1.x;
import U1.C0840j;
import Y2.B;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kd.RunnableC3307c;
import l8.e0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f44040a;

    /* renamed from: b, reason: collision with root package name */
    public final C8.j f44041b;

    /* renamed from: c, reason: collision with root package name */
    public C0765n f44042c;

    /* renamed from: d, reason: collision with root package name */
    public long f44043d;

    /* renamed from: e, reason: collision with root package name */
    public long f44044e;

    /* renamed from: f, reason: collision with root package name */
    public long f44045f;

    /* renamed from: g, reason: collision with root package name */
    public long f44046g;

    /* renamed from: h, reason: collision with root package name */
    public long f44047h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f44048i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f44049j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public r f44050l;

    /* renamed from: m, reason: collision with root package name */
    public Executor f44051m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f44052n;

    public i(l lVar, Context context) {
        this.f44052n = lVar;
        x.G(context);
        this.f44040a = new ArrayList();
        this.f44041b = new C8.j(5);
        this.f44047h = -9223372036854775807L;
        this.f44050l = r.f44113e9;
        this.f44051m = l.f44054p;
    }

    public final void a(boolean z2) {
        this.f44048i = false;
        this.f44047h = -9223372036854775807L;
        l lVar = this.f44052n;
        if (lVar.f44068o == 1) {
            lVar.f44067n++;
            B b5 = lVar.f44061g;
            if (z2) {
                m mVar = (m) b5.f16383b;
                o oVar = mVar.f44070b;
                oVar.k = 0L;
                oVar.f44096n = -1L;
                oVar.f44094l = -1L;
                mVar.f44075g = -9223372036854775807L;
                mVar.f44073e = -9223372036854775807L;
                mVar.d(1);
                mVar.f44076h = -9223372036854775807L;
            }
            p pVar = (p) b5.f16384c;
            G4.f fVar = pVar.f44106f;
            fVar.f4233a = 0;
            fVar.f4234b = 0;
            pVar.f44110j = -9223372036854775807L;
            t tVar = pVar.f44105e;
            if (tVar.n() > 0) {
                Q1.k.c(tVar.n() > 0);
                while (tVar.n() > 1) {
                    tVar.i();
                }
                Object objI = tVar.i();
                objI.getClass();
                tVar.a(0L, (Long) objI);
            }
            Y y10 = pVar.f44107g;
            t tVar2 = pVar.f44104d;
            if (y10 != null) {
                tVar2.d();
            } else if (tVar2.n() > 0) {
                Q1.k.c(tVar2.n() > 0);
                while (tVar2.n() > 1) {
                    tVar2.i();
                }
                Object objI2 = tVar2.i();
                objI2.getClass();
                pVar.f44107g = (Y) objI2;
            }
            Q1.s sVar = lVar.f44065l;
            Q1.k.h(sVar);
            sVar.c(new RunnableC3307c(lVar, 7));
        }
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r8 >= r4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r18, boolean r20, long r21, long r23, E4.n r25) throws q2.s {
        /*
            r17 = this;
            r1 = r17
            r0 = r25
            q2.l r2 = r1.f44052n
            r3 = 0
            Q1.k.g(r3)
            long r4 = r1.f44045f
            long r7 = r18 - r4
            q2.m r6 = r2.f44057c     // Catch: U1.C0840j -> L6e
            long r13 = r1.f44043d     // Catch: U1.C0840j -> L6e
            C8.j r4 = r1.f44041b     // Catch: U1.C0840j -> L6e
            r15 = r20
            r9 = r21
            r11 = r23
            r16 = r4
            int r4 = r6.a(r7, r9, r11, r13, r15, r16)     // Catch: U1.C0840j -> L6e
            r5 = 4
            if (r4 != r5) goto L24
            return r3
        L24:
            long r4 = r1.f44046g
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 >= 0) goto L3b
            if (r20 != 0) goto L3b
            java.lang.Object r2 = r0.f2940d
            q2.e r2 = (q2.C3861e) r2
            java.lang.Object r3 = r0.f2939c
            d2.j r3 = (d2.j) r3
            int r0 = r0.f2938b
            r2.P0(r3, r0)
            r0 = 1
            return r0
        L3b:
            r9 = r21
            r11 = r23
            r1.f(r9, r11)
            boolean r0 = r1.f44049j
            if (r0 == 0) goto L69
            long r4 = r1.k
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L62
            int r0 = r2.f44067n
            if (r0 != 0) goto L61
            q2.p r0 = r2.f44058d
            long r8 = r0.f44110j
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L61
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L62
        L61:
            return r3
        L62:
            r1.e()
            r1.f44049j = r3
            r1.k = r6
        L69:
            r0 = 0
            Q1.k.h(r0)
            throw r0
        L6e:
            r0 = move-exception
            q2.s r2 = new q2.s
            N1.n r3 = r1.f44042c
            Q1.k.h(r3)
            r2.<init>(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.i.b(long, boolean, long, long, E4.n):boolean");
    }

    public final void c(C0765n c0765n) {
        l lVar = this.f44052n;
        Q1.k.g(lVar.f44068o == 0);
        C0757f c0757f = c0765n.f8209B;
        if (c0757f == null || !c0757f.d()) {
            c0757f = C0757f.f8149h;
        }
        if (c0757f.f8152c != 7 || x.f9724a < 34) {
        }
        Looper looperMyLooper = Looper.myLooper();
        Q1.k.h(looperMyLooper);
        lVar.f44065l = lVar.f44062h.a(looperMyLooper, null);
        try {
            k kVar = lVar.f44059e;
            e0 e0Var = e0.f40101e;
            kVar.a();
            Pair pair = lVar.f44066m;
            if (pair == null) {
                throw null;
            }
            int i5 = ((Q1.p) pair.second).f9706a;
            throw null;
        } catch (W e7) {
            throw new s(e7, c0765n);
        }
    }

    public final void d(boolean z2) {
        ((m) this.f44052n.f44061g.f16383b).c(z2);
    }

    public final void e() {
        if (this.f44042c == null) {
            return;
        }
        new ArrayList(this.f44040a);
        C0765n c0765n = this.f44042c;
        c0765n.getClass();
        Q1.k.h(null);
        C0757f c0757f = c0765n.f8209B;
        if (c0757f == null || !c0757f.d()) {
            C0757f c0757f2 = C0757f.f8149h;
        }
        int i5 = c0765n.f8239u;
        Q1.k.b("width must be positive, but is: " + i5, i5 > 0);
        int i10 = c0765n.f8240v;
        Q1.k.b("height must be positive, but is: " + i10, i10 > 0);
        throw null;
    }

    public final void f(long j8, long j10) {
        try {
            l.a(this.f44052n, j8, j10);
        } catch (C0840j e7) {
            C0765n c0765n = this.f44042c;
            if (c0765n == null) {
                c0765n = new C0765n(new C0764m());
            }
            throw new s(e7, c0765n);
        }
    }

    public final void g(int i5) {
        o oVar = ((m) this.f44052n.f44061g.f16383b).f44070b;
        if (oVar.f44091h == i5) {
            return;
        }
        oVar.f44091h = i5;
        oVar.d(true);
    }

    public final void h(Surface surface, Q1.p pVar) {
        l lVar = this.f44052n;
        Pair pair = lVar.f44066m;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Q1.p) lVar.f44066m.second).equals(pVar)) {
            return;
        }
        lVar.f44066m = Pair.create(surface, pVar);
        int i5 = pVar.f9706a;
    }

    public final void i(float f10) {
        ((m) this.f44052n.f44061g.f16383b).h(f10);
    }

    public final void j(long j8, long j10, long j11, long j12) {
        if (this.f44044e == j10) {
            int i5 = (this.f44045f > j11 ? 1 : (this.f44045f == j11 ? 0 : -1));
        }
        this.f44043d = j8;
        this.f44044e = j10;
        this.f44045f = j11;
        this.f44046g = j12;
    }

    public final void k(List list) {
        ArrayList arrayList = this.f44040a;
        if (arrayList.equals(list)) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(list);
        arrayList.addAll(this.f44052n.f44060f);
        e();
    }
}
