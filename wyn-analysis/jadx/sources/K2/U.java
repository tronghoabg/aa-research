package k2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import s8.C4026b;

/* loaded from: classes.dex */
public final class U implements o2.j {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f38943a;

    /* renamed from: b, reason: collision with root package name */
    public final S1.z f38944b;

    /* renamed from: c, reason: collision with root package name */
    public final Dd.c f38945c;

    /* renamed from: d, reason: collision with root package name */
    public final X f38946d;

    /* renamed from: e, reason: collision with root package name */
    public final C4026b f38947e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f38949g;

    /* renamed from: i, reason: collision with root package name */
    public long f38951i;

    /* renamed from: j, reason: collision with root package name */
    public S1.k f38952j;
    public s2.C k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f38953l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X f38954m;

    /* renamed from: f, reason: collision with root package name */
    public final J5.n f38948f = new J5.n();

    /* renamed from: h, reason: collision with root package name */
    public boolean f38950h = true;

    public U(X x5, Uri uri, S1.h hVar, Dd.c cVar, X x10, C4026b c4026b) {
        this.f38954m = x5;
        this.f38943a = uri;
        this.f38944b = new S1.z(hVar);
        this.f38945c = cVar;
        this.f38946d = x10;
        this.f38947e = c4026b;
        C3168z.f39176b.getAndIncrement();
        this.f38952j = a(0L);
    }

    public final S1.k a(long j8) {
        Map map = Collections.EMPTY_MAP;
        this.f38954m.getClass();
        Map map2 = X.f38959P;
        Uri uri = this.f38943a;
        Q1.k.i(uri, "The uri must be set.");
        return new S1.k(uri, 1, null, map2, j8, -1L, null, 6);
    }

    @Override // o2.j
    public final void g() {
        this.f38949g = true;
    }

    @Override // o2.j
    public final void load() {
        S1.h c3167y;
        s2.m mVar;
        int i5;
        int iK = 0;
        while (iK == 0 && !this.f38949g) {
            try {
                long j8 = this.f38948f.f5655a;
                S1.k kVarA = a(j8);
                this.f38952j = kVarA;
                long jY = this.f38944b.y(kVarA);
                if (this.f38949g) {
                    if (iK != 1 && this.f38945c.F() != -1) {
                        this.f38948f.f5655a = this.f38945c.F();
                    }
                    Fe.b.m(this.f38944b);
                    return;
                }
                if (jY != -1) {
                    jY += j8;
                    X x5 = this.f38954m;
                    x5.f38990q.post(new S(x5, 2));
                }
                long j10 = jY;
                this.f38954m.f38992s = F2.b.c(this.f38944b.f10920a.d());
                S1.z zVar = this.f38944b;
                F2.b bVar = this.f38954m.f38992s;
                if (bVar == null || (i5 = bVar.f3818f) == -1) {
                    c3167y = zVar;
                } else {
                    c3167y = new C3167y(zVar, i5, this);
                    X x10 = this.f38954m;
                    x10.getClass();
                    s2.C cZ = x10.z(new W(0, true));
                    this.k = cZ;
                    cZ.c(X.f38960Q);
                }
                this.f38945c.K(c3167y, this.f38943a, this.f38944b.f10920a.d(), j8, j10, this.f38946d);
                if (this.f38954m.f38992s != null && (mVar = (s2.m) this.f38945c.f2643c) != null) {
                    s2.m mVarH = mVar.h();
                    if (mVarH instanceof L2.d) {
                        ((L2.d) mVarH).f6853s = true;
                    }
                }
                if (this.f38950h) {
                    Dd.c cVar = this.f38945c;
                    long j11 = this.f38951i;
                    s2.m mVar2 = (s2.m) cVar.f2643c;
                    mVar2.getClass();
                    mVar2.a(j8, j11);
                    this.f38950h = false;
                }
                while (iK == 0 && !this.f38949g) {
                    try {
                        C4026b c4026b = this.f38947e;
                        synchronized (c4026b) {
                            while (!c4026b.f45322b) {
                                c4026b.wait();
                            }
                        }
                        Dd.c cVar2 = this.f38945c;
                        J5.n nVar = this.f38948f;
                        s2.m mVar3 = (s2.m) cVar2.f2643c;
                        mVar3.getClass();
                        s2.j jVar = (s2.j) cVar2.f2644d;
                        jVar.getClass();
                        iK = mVar3.k(jVar, nVar);
                        long jF = this.f38945c.F();
                        if (jF > this.f38954m.f38983i + j8) {
                            this.f38947e.b();
                            X x11 = this.f38954m;
                            x11.f38990q.post(x11.f38989p);
                            j8 = jF;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iK == 1) {
                    iK = 0;
                } else if (this.f38945c.F() != -1) {
                    this.f38948f.f5655a = this.f38945c.F();
                }
                Fe.b.m(this.f38944b);
            } catch (Throwable th) {
                if (iK != 1 && this.f38945c.F() != -1) {
                    this.f38948f.f5655a = this.f38945c.F();
                }
                Fe.b.m(this.f38944b);
                throw th;
            }
        }
    }
}
