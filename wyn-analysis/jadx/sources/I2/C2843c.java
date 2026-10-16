package i2;

import E5.C0441b;
import N1.AbstractC0774x;
import N1.C0770t;
import N1.C0773w;
import N1.D;
import Q1.x;
import S1.A;
import S1.g;
import S1.i;
import S1.r;
import U5.f;
import V1.k;
import a9.C1342b;
import ae.d;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.X;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import k2.AbstractC3144a;
import k2.C3168z;
import k2.F;
import k2.H;
import k2.InterfaceC3143E;
import k2.k0;
import l2.C3383h;
import o2.e;
import o2.h;
import o2.j;
import o2.l;
import o2.m;
import o2.n;
import o2.o;
import o2.p;

/* renamed from: i2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2843c extends AbstractC3144a implements h {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f36741h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f36742i;

    /* renamed from: j, reason: collision with root package name */
    public final g f36743j;
    public final C0441b k;

    /* renamed from: l, reason: collision with root package name */
    public final C1342b f36744l;

    /* renamed from: m, reason: collision with root package name */
    public final Z1.g f36745m;

    /* renamed from: n, reason: collision with root package name */
    public final d f36746n;

    /* renamed from: o, reason: collision with root package name */
    public final long f36747o;

    /* renamed from: p, reason: collision with root package name */
    public final Z1.d f36748p;

    /* renamed from: q, reason: collision with root package name */
    public final o f36749q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f36750r;

    /* renamed from: s, reason: collision with root package name */
    public S1.h f36751s;

    /* renamed from: t, reason: collision with root package name */
    public m f36752t;

    /* renamed from: u, reason: collision with root package name */
    public n f36753u;

    /* renamed from: v, reason: collision with root package name */
    public A f36754v;

    /* renamed from: w, reason: collision with root package name */
    public long f36755w;

    /* renamed from: x, reason: collision with root package name */
    public j2.c f36756x;

    /* renamed from: y, reason: collision with root package name */
    public Handler f36757y;

    /* renamed from: z, reason: collision with root package name */
    public C0773w f36758z;

    static {
        AbstractC0774x.a("media3.exoplayer.smoothstreaming");
    }

    public C2843c(C0773w c0773w, g gVar, o oVar, C0441b c0441b, C1342b c1342b, Z1.g gVar2, d dVar, long j8) {
        this.f36758z = c0773w;
        C0770t c0770t = c0773w.f8272b;
        c0770t.getClass();
        this.f36756x = null;
        Uri uri = Uri.EMPTY;
        Uri uriWithAppendedPath = c0770t.f8264a;
        if (uriWithAppendedPath.equals(uri)) {
            uriWithAppendedPath = null;
        } else {
            String path = uriWithAppendedPath.getPath();
            if (path != null) {
                Matcher matcher = x.f9733j.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedPath, "Manifest");
                }
            }
        }
        this.f36742i = uriWithAppendedPath;
        this.f36743j = gVar;
        this.f36749q = oVar;
        this.k = c0441b;
        this.f36744l = c1342b;
        this.f36745m = gVar2;
        this.f36746n = dVar;
        this.f36747o = j8;
        this.f36748p = a(null);
        this.f36741h = false;
        this.f36750r = new ArrayList();
    }

    @Override // o2.h
    public final void A(j jVar, long j8, long j10) {
        p pVar = (p) jVar;
        long j11 = pVar.f41323a;
        Uri uri = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j10);
        this.f36746n.getClass();
        this.f36748p.d(c3168z, pVar.f41325c);
        this.f36756x = (j2.c) pVar.f41328f;
        this.f36755w = j8 - j10;
        t();
        if (this.f36756x.f38598d) {
            this.f36757y.postDelayed(new com.applovin.adview.a(this, 27), Math.max(0L, (this.f36755w + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // o2.h
    public final f E(j jVar, long j8, long j10, IOException iOException, int i5) {
        long jMin;
        p pVar = (p) jVar;
        long j11 = pVar.f41323a;
        Uri uri = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j10);
        this.f36746n.getClass();
        if ((iOException instanceof D) || (iOException instanceof FileNotFoundException) || (iOException instanceof r) || (iOException instanceof l)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i10 = i.f10862b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof i) && ((i) cause).f10863a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i5 - 1) * 1000, 5000);
        f fVar = jMin == -9223372036854775807L ? m.f41319f : new f(jMin, 0, false);
        this.f36748p.g(c3168z, pVar.f41325c, iOException, !fVar.a());
        return fVar;
    }

    @Override // k2.AbstractC3144a
    public final F b(H h10, e eVar, long j8) {
        Z1.d dVarA = a(h10);
        Z1.d dVar = new Z1.d(this.f39019d.f16928c, 0, h10);
        j2.c cVar = this.f36756x;
        A a5 = this.f36754v;
        n nVar = this.f36753u;
        C2842b c2842b = new C2842b(cVar, this.k, a5, this.f36744l, this.f36745m, dVar, this.f36746n, dVarA, nVar, eVar);
        this.f36750r.add(c2842b);
        return c2842b;
    }

    @Override // k2.AbstractC3144a
    public final synchronized C0773w h() {
        return this.f36758z;
    }

    @Override // k2.AbstractC3144a
    public final void j() {
        this.f36753u.a();
    }

    @Override // k2.AbstractC3144a
    public final void l(A a5) {
        this.f36754v = a5;
        Looper looperMyLooper = Looper.myLooper();
        k kVar = this.f39022g;
        Q1.k.h(kVar);
        Z1.g gVar = this.f36745m;
        gVar.h(looperMyLooper, kVar);
        gVar.f();
        if (this.f36741h) {
            this.f36753u = new X(10);
            t();
            return;
        }
        this.f36751s = this.f36743j.b();
        m mVar = new m("SsMediaSource");
        this.f36752t = mVar;
        this.f36753u = mVar;
        this.f36757y = x.m(null);
        u();
    }

    @Override // k2.AbstractC3144a
    public final void n(F f10) {
        C2842b c2842b = (C2842b) f10;
        for (C3383h c3383h : c2842b.f36739m) {
            c3383h.y(null);
        }
        c2842b.k = null;
        this.f36750r.remove(f10);
    }

    @Override // k2.AbstractC3144a
    public final void p() {
        this.f36756x = this.f36741h ? this.f36756x : null;
        this.f36751s = null;
        this.f36755w = 0L;
        m mVar = this.f36752t;
        if (mVar != null) {
            mVar.e(null);
            this.f36752t = null;
        }
        Handler handler = this.f36757y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f36757y = null;
        }
        this.f36745m.release();
    }

    @Override // k2.AbstractC3144a
    public final synchronized void s(C0773w c0773w) {
        this.f36758z = c0773w;
    }

    public final void t() {
        k0 k0Var;
        int i5;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36750r;
            if (i10 >= arrayList.size()) {
                break;
            }
            C2842b c2842b = (C2842b) arrayList.get(i10);
            j2.c cVar = this.f36756x;
            c2842b.f36738l = cVar;
            C3383h[] c3383hArr = c2842b.f36739m;
            int length = c3383hArr.length;
            int i11 = 0;
            while (i11 < length) {
                C2841a c2841a = (C2841a) c3383hArr[i11].f39907e;
                j2.b[] bVarArr = c2841a.f36725f.f38600f;
                int i12 = c2841a.f36721b;
                j2.b bVar = bVarArr[i12];
                int i13 = bVar.k;
                j2.b bVar2 = cVar.f38600f[i12];
                if (i13 == 0 || bVar2.k == 0) {
                    i5 = i10;
                    c2841a.f36726g += i13;
                } else {
                    int i14 = i13 - 1;
                    long[] jArr = bVar.f38593o;
                    long jB = bVar.b(i14) + jArr[i14];
                    i5 = i10;
                    long j8 = bVar2.f38593o[0];
                    if (jB <= j8) {
                        c2841a.f36726g += i13;
                    } else {
                        c2841a.f36726g = x.e(jArr, j8, true) + c2841a.f36726g;
                    }
                }
                c2841a.f36725f = cVar;
                i11++;
                i10 = i5;
            }
            InterfaceC3143E interfaceC3143E = c2842b.k;
            interfaceC3143E.getClass();
            interfaceC3143E.a(c2842b);
            i10++;
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (j2.b bVar3 : this.f36756x.f38600f) {
            if (bVar3.k > 0) {
                long[] jArr2 = bVar3.f38593o;
                jMax2 = Math.min(jMax2, jArr2[0]);
                int i15 = bVar3.k - 1;
                jMax = Math.max(jMax, bVar3.b(i15) + jArr2[i15]);
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j10 = this.f36756x.f38598d ? -9223372036854775807L : 0L;
            j2.c cVar2 = this.f36756x;
            boolean z2 = cVar2.f38598d;
            k0Var = new k0(j10, 0L, 0L, 0L, true, z2, z2, cVar2, h());
        } else {
            j2.c cVar3 = this.f36756x;
            if (cVar3.f38598d) {
                long j11 = cVar3.f38602h;
                if (j11 != -9223372036854775807L && j11 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j11);
                }
                long j12 = jMax2;
                long j13 = jMax - j12;
                long jK = j13 - x.K(this.f36747o);
                if (jK < 5000000) {
                    jK = Math.min(5000000L, j13 / 2);
                }
                k0Var = new k0(-9223372036854775807L, j13, j12, jK, true, true, true, this.f36756x, h());
            } else {
                long j14 = cVar3.f38601g;
                if (j14 == -9223372036854775807L) {
                    j14 = jMax - jMax2;
                }
                long j15 = j14;
                k0Var = new k0(-9223372036854775807L, -9223372036854775807L, jMax2 + j15, j15, jMax2, 0L, true, false, false, this.f36756x, h(), null);
            }
        }
        m(k0Var);
    }

    public final void u() {
        if (this.f36752t.c()) {
            return;
        }
        p pVar = new p(this.f36751s, this.f36742i, 4, this.f36749q);
        m mVar = this.f36752t;
        d dVar = this.f36746n;
        int i5 = pVar.f41325c;
        mVar.f(pVar, this, dVar.g(i5));
        this.f36748p.h(new C3168z(pVar.f41324b), i5, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // o2.h
    public final void w(j jVar, long j8, long j10, boolean z2) {
        p pVar = (p) jVar;
        long j11 = pVar.f41323a;
        Uri uri = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j10);
        this.f36746n.getClass();
        this.f36748p.c(c3168z, pVar.f41325c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
