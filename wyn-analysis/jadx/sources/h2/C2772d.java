package h2;

import N1.C0764m;
import N1.C0765n;
import Q1.k;
import Q1.o;
import Q1.x;
import Va.M6;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import g2.C2688i;
import g2.C2691l;
import java.util.Locale;
import s2.C;

/* renamed from: h2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2772d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35989a;

    /* renamed from: b, reason: collision with root package name */
    public final C2691l f35990b;

    /* renamed from: c, reason: collision with root package name */
    public C f35991c;

    /* renamed from: d, reason: collision with root package name */
    public long f35992d;

    /* renamed from: e, reason: collision with root package name */
    public long f35993e;

    /* renamed from: f, reason: collision with root package name */
    public int f35994f;

    /* renamed from: g, reason: collision with root package name */
    public int f35995g;

    /* renamed from: h, reason: collision with root package name */
    public long f35996h;

    /* renamed from: i, reason: collision with root package name */
    public int f35997i;

    /* renamed from: j, reason: collision with root package name */
    public int f35998j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35999l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f36000m;

    public C2772d(C2691l c2691l, int i5) {
        this.f35989a = i5;
        switch (i5) {
            case 1:
                this.f35990b = c2691l;
                this.f35992d = -9223372036854775807L;
                this.f35995g = -1;
                this.f35996h = -9223372036854775807L;
                this.f35993e = 0L;
                this.f35994f = -1;
                this.f35997i = -1;
                this.f35998j = -1;
                break;
            default:
                this.f35990b = c2691l;
                this.f35992d = -9223372036854775807L;
                this.f35995g = -1;
                break;
        }
    }

    @Override // h2.i
    public final void a(long j8, long j10) {
        switch (this.f35989a) {
            case 0:
                this.f35992d = j8;
                this.f35994f = 0;
                this.f35993e = j10;
                break;
            default:
                this.f35992d = j8;
                this.f35995g = -1;
                this.f35993e = j10;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h2.i
    public final void b(o oVar, long j8, int i5, boolean z2) {
        int i10;
        int i11;
        C2691l c2691l = this.f35990b;
        switch (this.f35989a) {
            case 0:
                k.h(this.f35991c);
                int i12 = oVar.f9703b;
                int iA = oVar.A();
                Object[] objArr = (iA & Segment.SHARE_MINIMUM) > 0;
                if ((iA & 512) != 0 || (iA & PglCryptUtils.BASE64_FAILED) != 0 || (iA & 7) != 0) {
                    k.w("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                    break;
                } else {
                    if (objArr == true) {
                        if (this.f36000m && this.f35994f > 0) {
                            C c10 = this.f35991c;
                            c10.getClass();
                            c10.a(this.f35996h, this.k ? 1 : 0, this.f35994f, 0, null);
                            this.f35994f = 0;
                            this.f35996h = -9223372036854775807L;
                            this.k = false;
                            this.f36000m = false;
                        }
                        this.f36000m = true;
                        if ((oVar.e() & 252) < 128) {
                            k.w("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                            break;
                        } else {
                            byte[] bArr = oVar.f9702a;
                            bArr[i12] = 0;
                            bArr[i12 + 1] = 0;
                            oVar.G(i12);
                        }
                    } else if (this.f36000m) {
                        int iA2 = C2688i.a(this.f35995g);
                        if (i5 < iA2) {
                            int i13 = x.f9724a;
                            Locale locale = Locale.US;
                            k.w("RtpH263Reader", N0.a.e("Received RTP packet with unexpected sequence number. Expected: ", iA2, "; received: ", i5, ". Dropping packet."));
                            break;
                        }
                    } else {
                        k.w("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        break;
                    }
                    if (this.f35994f == 0) {
                        boolean z10 = this.f35999l;
                        int i14 = oVar.f9703b;
                        if (((oVar.w() >> 10) & 63) == 32) {
                            int iE = oVar.e();
                            int i15 = (iE >> 1) & 1;
                            if (!z10 && i15 == 0) {
                                int i16 = (iE >> 2) & 7;
                                if (i16 == 1) {
                                    this.f35997i = 128;
                                    this.f35998j = 96;
                                } else {
                                    int i17 = i16 - 2;
                                    this.f35997i = 176 << i17;
                                    this.f35998j = 144 << i17;
                                }
                            }
                            oVar.G(i14);
                            this.k = i15 == 0;
                        } else {
                            oVar.G(i14);
                            this.k = false;
                        }
                        if (!this.f35999l && this.k) {
                            int i18 = this.f35997i;
                            C0765n c0765n = c2691l.f35621c;
                            if (i18 != c0765n.f8239u || this.f35998j != c0765n.f8240v) {
                                C c11 = this.f35991c;
                                C0764m c0764mA = c0765n.a();
                                c0764mA.f8201t = this.f35997i;
                                c0764mA.f8202u = this.f35998j;
                                M6.y(c0764mA, c11);
                            }
                            this.f35999l = true;
                        }
                    }
                    int iA3 = oVar.a();
                    this.f35991c.e(iA3, oVar);
                    this.f35994f += iA3;
                    this.f35996h = S3.f.N(this.f35993e, j8, 90000, this.f35992d);
                    if (z2) {
                        C c12 = this.f35991c;
                        c12.getClass();
                        c12.a(this.f35996h, this.k ? 1 : 0, this.f35994f, 0, null);
                        this.f35994f = 0;
                        this.f35996h = -9223372036854775807L;
                        this.k = false;
                        this.f36000m = false;
                    }
                    this.f35995g = i5;
                    break;
                }
                break;
            default:
                k.h(this.f35991c);
                int iU = oVar.u();
                if ((iU & 8) == 8) {
                    if (this.k && this.f35995g > 0) {
                        C c13 = this.f35991c;
                        c13.getClass();
                        c13.a(this.f35996h, this.f36000m ? 1 : 0, this.f35995g, 0, null);
                        this.f35995g = -1;
                        this.f35996h = -9223372036854775807L;
                        this.k = false;
                    }
                    this.k = true;
                } else if (this.k) {
                    int iA4 = C2688i.a(this.f35994f);
                    if (i5 < iA4) {
                        int i19 = x.f9724a;
                        Locale locale2 = Locale.US;
                        k.w("RtpVp9Reader", N0.a.e("Received RTP packet with unexpected sequence number. Expected: ", iA4, "; received: ", i5, ". Dropping packet."));
                        break;
                    }
                } else {
                    k.w("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                    break;
                }
                if ((iU & 128) == 0 || (oVar.u() & 128) == 0 || oVar.a() >= 1) {
                    int i20 = iU & 16;
                    k.b("VP9 flexible mode is not supported.", i20 == 0);
                    if ((iU & 32) != 0) {
                        oVar.H(1);
                        if (oVar.a() >= 1) {
                            if (i20 == 0) {
                                oVar.H(1);
                            }
                        }
                    }
                    if ((iU & 2) != 0) {
                        int iU2 = oVar.u();
                        int i21 = (iU2 >> 5) & 7;
                        if ((iU2 & 16) != 0) {
                            int i22 = i21 + 1;
                            if (oVar.a() >= i22 * 4) {
                                for (int i23 = 0; i23 < i22; i23++) {
                                    this.f35997i = oVar.A();
                                    this.f35998j = oVar.A();
                                }
                            }
                        }
                        if ((iU2 & 8) != 0) {
                            int iU3 = oVar.u();
                            if (oVar.a() >= iU3) {
                                for (int i24 = 0; i24 < iU3; i24++) {
                                    int iA5 = (oVar.A() & 12) >> 2;
                                    if (oVar.a() < iA5) {
                                        break;
                                    } else {
                                        oVar.H(iA5);
                                    }
                                }
                            }
                        }
                    }
                    if (this.f35995g == -1 && this.k) {
                        this.f36000m = (oVar.e() & 4) == 0;
                    }
                    if (!this.f35999l && (i10 = this.f35997i) != -1 && (i11 = this.f35998j) != -1) {
                        C0765n c0765n2 = c2691l.f35621c;
                        if (i10 != c0765n2.f8239u || i11 != c0765n2.f8240v) {
                            C c14 = this.f35991c;
                            C0764m c0764mA2 = c0765n2.a();
                            c0764mA2.f8201t = this.f35997i;
                            c0764mA2.f8202u = this.f35998j;
                            M6.y(c0764mA2, c14);
                        }
                        this.f35999l = true;
                    }
                    int iA6 = oVar.a();
                    this.f35991c.e(iA6, oVar);
                    int i25 = this.f35995g;
                    if (i25 == -1) {
                        this.f35995g = iA6;
                    } else {
                        this.f35995g = i25 + iA6;
                    }
                    this.f35996h = S3.f.N(this.f35993e, j8, 90000, this.f35992d);
                    if (z2) {
                        C c15 = this.f35991c;
                        c15.getClass();
                        c15.a(this.f35996h, this.f36000m ? 1 : 0, this.f35995g, 0, null);
                        this.f35995g = -1;
                        this.f35996h = -9223372036854775807L;
                        this.k = false;
                    }
                    this.f35994f = i5;
                    break;
                }
                break;
        }
    }

    @Override // h2.i
    public final void c(s2.o oVar, int i5) {
        switch (this.f35989a) {
            case 0:
                C cMo0m = oVar.mo0m(i5, 2);
                this.f35991c = cMo0m;
                cMo0m.c(this.f35990b.f35621c);
                break;
            default:
                C cMo0m2 = oVar.mo0m(i5, 2);
                this.f35991c = cMo0m2;
                cMo0m2.c(this.f35990b.f35621c);
                break;
        }
    }

    @Override // h2.i
    public final void d(long j8) {
        switch (this.f35989a) {
            case 0:
                k.g(this.f35992d == -9223372036854775807L);
                this.f35992d = j8;
                break;
            default:
                k.g(this.f35992d == -9223372036854775807L);
                this.f35992d = j8;
                break;
        }
    }
}
