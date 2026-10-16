package X1;

import A.e0;
import E4.n;
import N1.AbstractC0774x;
import N1.C0769s;
import N1.C0770t;
import N1.C0773w;
import Q1.x;
import S1.A;
import a2.C1323c;
import a9.C1341a;
import a9.C1342b;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import io.ktor.utils.io.T;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import k2.AbstractC3144a;
import k2.C3168z;
import k2.F;
import k2.H;
import l2.C3383h;
import o2.o;
import o2.p;
import p2.AbstractC3759b;

/* loaded from: classes.dex */
public final class f extends AbstractC3144a {

    /* renamed from: A, reason: collision with root package name */
    public o2.m f15954A;

    /* renamed from: B, reason: collision with root package name */
    public A f15955B;

    /* renamed from: C, reason: collision with root package name */
    public T f15956C;

    /* renamed from: D, reason: collision with root package name */
    public Handler f15957D;

    /* renamed from: E, reason: collision with root package name */
    public C0769s f15958E;

    /* renamed from: F, reason: collision with root package name */
    public Uri f15959F;

    /* renamed from: G, reason: collision with root package name */
    public final Uri f15960G;

    /* renamed from: H, reason: collision with root package name */
    public Y1.c f15961H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f15962I;

    /* renamed from: J, reason: collision with root package name */
    public long f15963J;

    /* renamed from: K, reason: collision with root package name */
    public long f15964K;
    public long L;

    /* renamed from: M, reason: collision with root package name */
    public int f15965M;

    /* renamed from: N, reason: collision with root package name */
    public long f15966N;

    /* renamed from: O, reason: collision with root package name */
    public int f15967O;

    /* renamed from: P, reason: collision with root package name */
    public C0773w f15968P;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15969h;

    /* renamed from: i, reason: collision with root package name */
    public final S1.g f15970i;

    /* renamed from: j, reason: collision with root package name */
    public final n f15971j;
    public final C1342b k;

    /* renamed from: l, reason: collision with root package name */
    public final Z1.g f15972l;

    /* renamed from: m, reason: collision with root package name */
    public final ae.d f15973m;

    /* renamed from: n, reason: collision with root package name */
    public final S3.n f15974n;

    /* renamed from: o, reason: collision with root package name */
    public final long f15975o;

    /* renamed from: p, reason: collision with root package name */
    public final long f15976p;

    /* renamed from: q, reason: collision with root package name */
    public final Z1.d f15977q;

    /* renamed from: r, reason: collision with root package name */
    public final o f15978r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f15979s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f15980t;

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f15981u;

    /* renamed from: v, reason: collision with root package name */
    public final c f15982v;

    /* renamed from: w, reason: collision with root package name */
    public final c f15983w;

    /* renamed from: x, reason: collision with root package name */
    public final Y9.c f15984x;

    /* renamed from: y, reason: collision with root package name */
    public final o2.n f15985y;

    /* renamed from: z, reason: collision with root package name */
    public S1.h f15986z;

    static {
        AbstractC0774x.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [X1.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [X1.c] */
    public f(C0773w c0773w, S1.g gVar, o oVar, n nVar, C1342b c1342b, Z1.g gVar2, ae.d dVar, long j8, long j10) {
        this.f15968P = c0773w;
        this.f15958E = c0773w.f8273c;
        C0770t c0770t = c0773w.f8272b;
        c0770t.getClass();
        Uri uri = c0770t.f8264a;
        this.f15959F = uri;
        this.f15960G = uri;
        this.f15961H = null;
        this.f15970i = gVar;
        this.f15978r = oVar;
        this.f15971j = nVar;
        this.f15972l = gVar2;
        this.f15973m = dVar;
        this.f15975o = j8;
        this.f15976p = j10;
        this.k = c1342b;
        Random random = new Random();
        S3.n nVar2 = new S3.n();
        nVar2.f10972c = new HashMap();
        nVar2.f10973d = random;
        nVar2.f10970a = new HashMap();
        nVar2.f10971b = new HashMap();
        this.f15974n = nVar2;
        this.f15969h = false;
        this.f15977q = a(null);
        this.f15980t = new Object();
        this.f15981u = new SparseArray();
        this.f15984x = new Y9.c(this, 25);
        this.f15966N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f15979s = new e0(this, 24);
        this.f15985y = new xa.d(this, 26);
        final int i5 = 0;
        this.f15982v = new Runnable(this) { // from class: X1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15943b;

            {
                this.f15943b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f15943b.z();
                        break;
                    default:
                        this.f15943b.y(false);
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f15983w = new Runnable(this) { // from class: X1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15943b;

            {
                this.f15943b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f15943b.z();
                        break;
                    default:
                        this.f15943b.y(false);
                        break;
                }
            }
        };
    }

    public static boolean t(Y1.h hVar) {
        int i5 = 0;
        while (true) {
            List list = hVar.f16344c;
            if (i5 >= list.size()) {
                return false;
            }
            int i10 = ((Y1.a) list.get(i5)).f16301b;
            if (i10 == 1 || i10 == 2) {
                break;
            }
            i5++;
        }
        return true;
    }

    @Override // k2.AbstractC3144a
    public final F b(H h10, o2.e eVar, long j8) {
        int iIntValue = ((Integer) h10.f38903a).intValue() - this.f15967O;
        Z1.d dVarA = a(h10);
        Z1.d dVar = new Z1.d(this.f39019d.f16928c, 0, h10);
        int i5 = this.f15967O + iIntValue;
        Y1.c cVar = this.f15961H;
        A a5 = this.f15955B;
        long j10 = this.L;
        V1.k kVar = this.f39022g;
        Q1.k.h(kVar);
        b bVar = new b(i5, cVar, this.f15974n, iIntValue, this.f15971j, a5, this.f15972l, dVar, this.f15973m, dVarA, j10, this.f15985y, eVar, this.k, this.f15984x, kVar);
        this.f15981u.put(i5, bVar);
        return bVar;
    }

    @Override // k2.AbstractC3144a
    public final synchronized C0773w h() {
        return this.f15968P;
    }

    @Override // k2.AbstractC3144a
    public final void j() {
        this.f15985y.a();
    }

    @Override // k2.AbstractC3144a
    public final void l(A a5) {
        this.f15955B = a5;
        Looper looperMyLooper = Looper.myLooper();
        V1.k kVar = this.f39022g;
        Q1.k.h(kVar);
        Z1.g gVar = this.f15972l;
        gVar.h(looperMyLooper, kVar);
        gVar.f();
        if (this.f15969h) {
            y(false);
            return;
        }
        this.f15986z = this.f15970i.b();
        this.f15954A = new o2.m("DashMediaSource");
        this.f15957D = x.m(null);
        z();
    }

    @Override // k2.AbstractC3144a
    public final void n(F f10) {
        b bVar = (b) f10;
        m mVar = bVar.f15929m;
        mVar.f16025i = true;
        mVar.f16020d.removeCallbacksAndMessages(null);
        for (C3383h c3383h : bVar.f15934r) {
            c3383h.y(bVar);
        }
        bVar.f15933q = null;
        this.f15981u.remove(bVar.f15918a);
    }

    @Override // k2.AbstractC3144a
    public final void p() {
        this.f15962I = false;
        this.f15986z = null;
        o2.m mVar = this.f15954A;
        if (mVar != null) {
            mVar.e(null);
            this.f15954A = null;
        }
        this.f15963J = 0L;
        this.f15964K = 0L;
        this.f15959F = this.f15960G;
        this.f15956C = null;
        Handler handler = this.f15957D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f15957D = null;
        }
        this.L = -9223372036854775807L;
        this.f15965M = 0;
        this.f15966N = -9223372036854775807L;
        this.f15981u.clear();
        S3.n nVar = this.f15974n;
        ((HashMap) nVar.f10970a).clear();
        ((HashMap) nVar.f10971b).clear();
        ((HashMap) nVar.f10972c).clear();
        this.f15972l.release();
    }

    @Override // k2.AbstractC3144a
    public final synchronized void s(C0773w c0773w) {
        this.f15968P = c0773w;
    }

    public final void u() {
        boolean z2;
        o2.m mVar = this.f15954A;
        S3.l lVar = new S3.l(this);
        synchronized (AbstractC3759b.f43199b) {
            z2 = AbstractC3759b.f43200c;
        }
        if (z2) {
            lVar.r();
            return;
        }
        if (mVar == null) {
            mVar = new o2.m("SntpClient");
        }
        mVar.f(new C1341a(), new C1323c(lVar, 21), 1);
    }

    public final void v(p pVar, long j8) {
        long j10 = pVar.f41323a;
        Uri uri = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j8);
        this.f15973m.getClass();
        this.f15977q.c(c3168z, pVar.f41325c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        Q1.k.l("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c6  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [int] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v31, types: [n2.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(boolean r43) {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.f.y(boolean):void");
    }

    public final void z() {
        Uri uri;
        this.f15957D.removeCallbacks(this.f15982v);
        if (this.f15954A.c()) {
            return;
        }
        if (this.f15954A.d()) {
            this.f15962I = true;
            return;
        }
        synchronized (this.f15980t) {
            uri = this.f15959F;
        }
        this.f15962I = false;
        p pVar = new p(this.f15986z, uri, 4, this.f15978r);
        e0 e0Var = this.f15979s;
        this.f15973m.getClass();
        this.f15954A.f(pVar, e0Var, 3);
        this.f15977q.h(new C3168z(pVar.f41324b), pVar.f41325c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
