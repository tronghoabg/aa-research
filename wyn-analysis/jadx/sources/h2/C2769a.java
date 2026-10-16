package h2;

import J5.y;
import Q1.o;
import Q1.x;
import g2.C2691l;
import java.math.RoundingMode;
import s2.C;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2769a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C2691l f35964a;

    /* renamed from: b, reason: collision with root package name */
    public final y f35965b = new y(1);

    /* renamed from: c, reason: collision with root package name */
    public final int f35966c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35967d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35968e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35969f;

    /* renamed from: g, reason: collision with root package name */
    public long f35970g;

    /* renamed from: h, reason: collision with root package name */
    public C f35971h;

    /* renamed from: i, reason: collision with root package name */
    public long f35972i;

    public C2769a(C2691l c2691l) {
        this.f35964a = c2691l;
        this.f35966c = c2691l.f35620b;
        String str = (String) c2691l.f35622d.get("mode");
        str.getClass();
        if (A6.h.v(str, "AAC-hbr")) {
            this.f35967d = 13;
            this.f35968e = 3;
        } else {
            if (!A6.h.v(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f35967d = 6;
            this.f35968e = 2;
        }
        this.f35969f = this.f35968e + this.f35967d;
    }

    @Override // h2.i
    public final void a(long j8, long j10) {
        this.f35970g = j8;
        this.f35972i = j10;
    }

    @Override // h2.i
    public final void b(o oVar, long j8, int i5, boolean z2) {
        this.f35971h.getClass();
        short sR = oVar.r();
        int i10 = sR / this.f35969f;
        long jN = S3.f.N(this.f35972i, j8, this.f35966c, this.f35970g);
        y yVar = this.f35965b;
        yVar.p(oVar);
        int i11 = this.f35968e;
        int i12 = this.f35967d;
        if (i10 == 1) {
            int i13 = yVar.i(i12);
            yVar.t(i11);
            this.f35971h.e(oVar.a(), oVar);
            if (z2) {
                this.f35971h.a(jN, 1, i13, 0, null);
                return;
            }
            return;
        }
        oVar.H((sR + 7) / 8);
        long jS = jN;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = yVar.i(i12);
            yVar.t(i11);
            this.f35971h.e(i15, oVar);
            this.f35971h.a(jS, 1, i15, 0, null);
            jS += x.S(i10, 1000000L, this.f35966c, RoundingMode.DOWN);
        }
    }

    @Override // h2.i
    public final void c(s2.o oVar, int i5) {
        C cMo0m = oVar.mo0m(i5, 1);
        this.f35971h = cMo0m;
        cMo0m.c(this.f35964a.f35621c);
    }

    @Override // h2.i
    public final void d(long j8) {
        this.f35970g = j8;
    }
}
