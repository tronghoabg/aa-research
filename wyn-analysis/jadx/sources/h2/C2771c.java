package h2;

import Q1.k;
import Q1.o;
import Q1.x;
import g2.C2688i;
import g2.C2691l;
import java.util.Locale;
import s2.C;

/* renamed from: h2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2771c implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f35980h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f35981i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: a, reason: collision with root package name */
    public final C2691l f35982a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35983b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35984c;

    /* renamed from: d, reason: collision with root package name */
    public C f35985d;

    /* renamed from: e, reason: collision with root package name */
    public long f35986e;

    /* renamed from: f, reason: collision with root package name */
    public long f35987f;

    /* renamed from: g, reason: collision with root package name */
    public int f35988g;

    public C2771c(C2691l c2691l) {
        this.f35982a = c2691l;
        String str = c2691l.f35621c.f8232n;
        str.getClass();
        this.f35983b = "audio/amr-wb".equals(str);
        this.f35984c = c2691l.f35620b;
        this.f35986e = -9223372036854775807L;
        this.f35988g = -1;
        this.f35987f = 0L;
    }

    @Override // h2.i
    public final void a(long j8, long j10) {
        this.f35986e = j8;
        this.f35987f = j10;
    }

    @Override // h2.i
    public final void b(o oVar, long j8, int i5, boolean z2) {
        int iA;
        k.h(this.f35985d);
        int i10 = this.f35988g;
        if (i10 != -1 && i5 != (iA = C2688i.a(i10))) {
            int i11 = x.f9724a;
            Locale locale = Locale.US;
            k.w("RtpAmrReader", N0.a.e("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i5, "."));
        }
        oVar.H(1);
        int iE = (oVar.e() >> 3) & 15;
        boolean z10 = (iE >= 0 && iE <= 8) || iE == 15;
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        boolean z11 = this.f35983b;
        sb2.append(z11 ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(iE);
        k.b(sb2.toString(), z10);
        int i12 = z11 ? f35981i[iE] : f35980h[iE];
        int iA2 = oVar.a();
        k.b("compound payload not supported currently", iA2 == i12);
        this.f35985d.e(iA2, oVar);
        this.f35985d.a(S3.f.N(this.f35987f, j8, this.f35984c, this.f35986e), 1, iA2, 0, null);
        this.f35988g = i5;
    }

    @Override // h2.i
    public final void c(s2.o oVar, int i5) {
        C cMo0m = oVar.mo0m(i5, 1);
        this.f35985d = cMo0m;
        cMo0m.c(this.f35982a.f35621c);
    }

    @Override // h2.i
    public final void d(long j8) {
        this.f35986e = j8;
    }
}
