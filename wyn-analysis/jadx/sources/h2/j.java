package h2;

import N1.C0764m;
import N1.C0765n;
import Q1.k;
import Q1.o;
import Q1.x;
import Va.M6;
import g2.C2688i;
import g2.C2691l;
import java.util.Locale;
import s2.C;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C2691l f36033a;

    /* renamed from: b, reason: collision with root package name */
    public C f36034b;

    /* renamed from: c, reason: collision with root package name */
    public long f36035c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public int f36036d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f36037e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f36038f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f36039g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f36040h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f36041i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f36042j;

    public j(C2691l c2691l) {
        this.f36033a = c2691l;
    }

    @Override // h2.i
    public final void a(long j8, long j10) {
        this.f36035c = j8;
        this.f36037e = -1;
        this.f36039g = j10;
    }

    @Override // h2.i
    public final void b(o oVar, long j8, int i5, boolean z2) {
        k.h(this.f36034b);
        int iU = oVar.u();
        if ((iU & 16) == 16 && (iU & 7) == 0) {
            if (this.f36040h && this.f36037e > 0) {
                C c10 = this.f36034b;
                c10.getClass();
                c10.a(this.f36038f, this.f36041i ? 1 : 0, this.f36037e, 0, null);
                this.f36037e = -1;
                this.f36038f = -9223372036854775807L;
                this.f36040h = false;
            }
            this.f36040h = true;
        } else {
            if (!this.f36040h) {
                k.w("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return;
            }
            int iA = C2688i.a(this.f36036d);
            if (i5 < iA) {
                int i10 = x.f9724a;
                Locale locale = Locale.US;
                k.w("RtpVP8Reader", N0.a.e("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i5, ". Dropping packet."));
                return;
            }
        }
        if ((iU & 128) != 0) {
            int iU2 = oVar.u();
            if ((iU2 & 128) != 0 && (oVar.u() & 128) != 0) {
                oVar.H(1);
            }
            if ((iU2 & 64) != 0) {
                oVar.H(1);
            }
            if ((iU2 & 32) != 0 || (16 & iU2) != 0) {
                oVar.H(1);
            }
        }
        if (this.f36037e == -1 && this.f36040h) {
            this.f36041i = (oVar.e() & 1) == 0;
        }
        if (!this.f36042j) {
            int i11 = oVar.f9703b;
            oVar.G(i11 + 6);
            int iN = oVar.n() & 16383;
            int iN2 = oVar.n() & 16383;
            oVar.G(i11);
            C0765n c0765n = this.f36033a.f35621c;
            if (iN != c0765n.f8239u || iN2 != c0765n.f8240v) {
                C c11 = this.f36034b;
                C0764m c0764mA = c0765n.a();
                c0764mA.f8201t = iN;
                c0764mA.f8202u = iN2;
                M6.y(c0764mA, c11);
            }
            this.f36042j = true;
        }
        int iA2 = oVar.a();
        this.f36034b.e(iA2, oVar);
        int i12 = this.f36037e;
        if (i12 == -1) {
            this.f36037e = iA2;
        } else {
            this.f36037e = i12 + iA2;
        }
        this.f36038f = S3.f.N(this.f36039g, j8, 90000, this.f36035c);
        if (z2) {
            C c12 = this.f36034b;
            c12.getClass();
            c12.a(this.f36038f, this.f36041i ? 1 : 0, this.f36037e, 0, null);
            this.f36037e = -1;
            this.f36038f = -9223372036854775807L;
            this.f36040h = false;
        }
        this.f36036d = i5;
    }

    @Override // h2.i
    public final void c(s2.o oVar, int i5) {
        C cMo0m = oVar.mo0m(i5, 2);
        this.f36034b = cMo0m;
        cMo0m.c(this.f36033a.f35621c);
    }

    @Override // h2.i
    public final void d(long j8) {
        k.g(this.f36035c == -9223372036854775807L);
        this.f36035c = j8;
    }
}
