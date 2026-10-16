package h2;

import N1.C0764m;
import Q1.k;
import Q1.o;
import Q1.x;
import Va.M6;
import g2.C2688i;
import g2.C2691l;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import s2.AbstractC3991a;
import s2.C;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C2691l f36026a;

    /* renamed from: b, reason: collision with root package name */
    public C f36027b;

    /* renamed from: d, reason: collision with root package name */
    public long f36029d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36031f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f36032g;

    /* renamed from: c, reason: collision with root package name */
    public long f36028c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f36030e = -1;

    public h(C2691l c2691l) {
        this.f36026a = c2691l;
    }

    @Override // h2.i
    public final void a(long j8, long j10) {
        this.f36028c = j8;
        this.f36029d = j10;
    }

    @Override // h2.i
    public final void b(o oVar, long j8, int i5, boolean z2) {
        k.h(this.f36027b);
        if (!this.f36031f) {
            int i10 = oVar.f9703b;
            k.b("ID Header has insufficient data", oVar.f9704c > 18);
            k.b("ID Header missing", oVar.s(8, StandardCharsets.UTF_8).equals("OpusHead"));
            k.b("version number must always be 1", oVar.u() == 1);
            oVar.G(i10);
            ArrayList arrayListC = AbstractC3991a.c(oVar.f9702a);
            C0764m c0764mA = this.f36026a.f35621c.a();
            c0764mA.f8197p = arrayListC;
            M6.y(c0764mA, this.f36027b);
            this.f36031f = true;
        } else if (this.f36032g) {
            int iA = C2688i.a(this.f36030e);
            if (i5 != iA) {
                int i11 = x.f9724a;
                Locale locale = Locale.US;
                k.w("RtpOpusReader", N0.a.e("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i5, "."));
            }
            int iA2 = oVar.a();
            this.f36027b.e(iA2, oVar);
            this.f36027b.a(S3.f.N(this.f36029d, j8, 48000, this.f36028c), 1, iA2, 0, null);
        } else {
            k.b("Comment Header has insufficient data", oVar.f9704c >= 8);
            k.b("Comment Header should follow ID Header", oVar.s(8, StandardCharsets.UTF_8).equals("OpusTags"));
            this.f36032g = true;
        }
        this.f36030e = i5;
    }

    @Override // h2.i
    public final void c(s2.o oVar, int i5) {
        C cMo0m = oVar.mo0m(i5, 1);
        this.f36027b = cMo0m;
        cMo0m.c(this.f36026a.f35621c);
    }

    @Override // h2.i
    public final void d(long j8) {
        this.f36028c = j8;
    }
}
