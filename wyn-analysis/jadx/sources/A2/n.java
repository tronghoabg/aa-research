package a2;

import N1.AbstractC0774x;
import N1.C0769s;
import N1.C0770t;
import N1.C0773w;
import Q1.x;
import S1.A;
import a9.C1342b;
import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import k2.AbstractC3144a;
import k2.C3168z;
import k2.F;
import k2.H;
import l8.AbstractC3409K;

/* loaded from: classes.dex */
public final class n extends AbstractC3144a {

    /* renamed from: h, reason: collision with root package name */
    public final C1324d f17238h;

    /* renamed from: i, reason: collision with root package name */
    public final C1323c f17239i;

    /* renamed from: j, reason: collision with root package name */
    public final C1342b f17240j;
    public final Z1.g k;

    /* renamed from: l, reason: collision with root package name */
    public final ae.d f17241l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f17242m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17243n;

    /* renamed from: o, reason: collision with root package name */
    public final b2.c f17244o;

    /* renamed from: p, reason: collision with root package name */
    public final long f17245p;

    /* renamed from: q, reason: collision with root package name */
    public C0769s f17246q;

    /* renamed from: r, reason: collision with root package name */
    public A f17247r;

    /* renamed from: s, reason: collision with root package name */
    public C0773w f17248s;

    static {
        AbstractC0774x.a("media3.exoplayer.hls");
    }

    public n(C0773w c0773w, C1323c c1323c, C1324d c1324d, C1342b c1342b, Z1.g gVar, ae.d dVar, b2.c cVar, long j8, boolean z2, int i5) {
        this.f17248s = c0773w;
        this.f17246q = c0773w.f8273c;
        this.f17239i = c1323c;
        this.f17238h = c1324d;
        this.f17240j = c1342b;
        this.k = gVar;
        this.f17241l = dVar;
        this.f17244o = cVar;
        this.f17245p = j8;
        this.f17242m = z2;
        this.f17243n = i5;
    }

    public static b2.d t(long j8, AbstractC3409K abstractC3409K) {
        b2.d dVar = null;
        for (int i5 = 0; i5 < abstractC3409K.size(); i5++) {
            b2.d dVar2 = (b2.d) abstractC3409K.get(i5);
            long j10 = dVar2.f19182e;
            if (j10 > j8 || !dVar2.f19171l) {
                if (j10 > j8) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    @Override // k2.AbstractC3144a
    public final F b(H h10, o2.e eVar, long j8) {
        Z1.d dVarA = a(h10);
        Z1.d dVar = new Z1.d(this.f39019d.f16928c, 0, h10);
        A a5 = this.f17247r;
        V1.k kVar = this.f39022g;
        Q1.k.h(kVar);
        return new m(this.f17238h, this.f17244o, this.f17239i, a5, this.k, dVar, this.f17241l, dVarA, eVar, this.f17240j, this.f17242m, this.f17243n, kVar);
    }

    @Override // k2.AbstractC3144a
    public final synchronized C0773w h() {
        return this.f17248s;
    }

    @Override // k2.AbstractC3144a
    public final void j() throws IOException {
        b2.c cVar = this.f17244o;
        o2.m mVar = cVar.f19164g;
        if (mVar != null) {
            mVar.a();
        }
        Uri uri = cVar.k;
        if (uri != null) {
            b2.b bVar = (b2.b) cVar.f19161d.get(uri);
            bVar.f19147b.a();
            IOException iOException = bVar.f19155j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // k2.AbstractC3144a
    public final void l(A a5) {
        this.f17247r = a5;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        V1.k kVar = this.f39022g;
        Q1.k.h(kVar);
        Z1.g gVar = this.k;
        gVar.h(looperMyLooper, kVar);
        gVar.f();
        Z1.d dVarA = a(null);
        C0770t c0770t = h().f8272b;
        c0770t.getClass();
        b2.c cVar = this.f17244o;
        cVar.getClass();
        cVar.f19165h = x.m(null);
        cVar.f19163f = dVarA;
        cVar.f19166i = this;
        o2.p pVar = new o2.p(((S1.g) cVar.f19158a.f17156b).b(), c0770t.f8264a, 4, cVar.f19159b.D());
        Q1.k.g(cVar.f19164g == null);
        o2.m mVar = new o2.m("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f19164g = mVar;
        ae.d dVar = cVar.f19160c;
        int i5 = pVar.f41325c;
        mVar.f(pVar, cVar, dVar.g(i5));
        dVarA.h(new C3168z(pVar.f41324b), i5, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // k2.AbstractC3144a
    public final void n(F f10) {
        m mVar = (m) f10;
        mVar.f17217b.f19162e.remove(mVar);
        for (s sVar : mVar.f17234t) {
            if (sVar.f17267D) {
                for (r rVar : sVar.f17307v) {
                    rVar.j();
                    S3.l lVar = rVar.f39040h;
                    if (lVar != null) {
                        lVar.s(rVar.f39037e);
                        rVar.f39040h = null;
                        rVar.f39039g = null;
                    }
                }
            }
            j jVar = sVar.f17290d;
            b2.b bVar = (b2.b) jVar.f17176g.f19161d.get(jVar.f17174e[jVar.f17185q.t()]);
            if (bVar != null) {
                bVar.k = false;
            }
            jVar.f17182n = null;
            sVar.f17296j.e(sVar);
            sVar.f17303r.removeCallbacksAndMessages(null);
            sVar.f17271H = true;
            sVar.f17304s.clear();
        }
        mVar.f17231q = null;
    }

    @Override // k2.AbstractC3144a
    public final void p() {
        b2.c cVar = this.f17244o;
        cVar.k = null;
        cVar.f19168l = null;
        cVar.f19167j = null;
        cVar.f19170n = -9223372036854775807L;
        cVar.f19164g.e(null);
        cVar.f19164g = null;
        HashMap map = cVar.f19161d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((b2.b) it.next()).f19147b.e(null);
        }
        cVar.f19165h.removeCallbacksAndMessages(null);
        cVar.f19165h = null;
        map.clear();
        this.k.release();
    }

    @Override // k2.AbstractC3144a
    public final synchronized void s(C0773w c0773w) {
        this.f17248s = c0773w;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111 A[PHI: r2
  0x0111: PHI (r2v42 long) = (r2v34 long), (r2v36 long), (r2v37 long), (r2v38 long) binds: [B:62:0x010f, B:74:0x0141, B:73:0x013e, B:67:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(b2.i r39) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.n.u(b2.i):void");
    }
}
