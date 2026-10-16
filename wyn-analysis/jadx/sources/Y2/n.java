package Y2;

import G5.C0520a;
import N1.C0764m;
import N1.C0765n;
import N1.D;
import com.applovin.shadow.okio.Segment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import s2.AbstractC3991a;
import s2.C;

/* loaded from: classes.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f16510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16511b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.o f16512c;

    /* renamed from: d, reason: collision with root package name */
    public final J5.y f16513d;

    /* renamed from: e, reason: collision with root package name */
    public C f16514e;

    /* renamed from: f, reason: collision with root package name */
    public String f16515f;

    /* renamed from: g, reason: collision with root package name */
    public C0765n f16516g;

    /* renamed from: h, reason: collision with root package name */
    public int f16517h;

    /* renamed from: i, reason: collision with root package name */
    public int f16518i;

    /* renamed from: j, reason: collision with root package name */
    public int f16519j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public long f16520l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16521m;

    /* renamed from: n, reason: collision with root package name */
    public int f16522n;

    /* renamed from: o, reason: collision with root package name */
    public int f16523o;

    /* renamed from: p, reason: collision with root package name */
    public int f16524p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16525q;

    /* renamed from: r, reason: collision with root package name */
    public long f16526r;

    /* renamed from: s, reason: collision with root package name */
    public int f16527s;

    /* renamed from: t, reason: collision with root package name */
    public long f16528t;

    /* renamed from: u, reason: collision with root package name */
    public int f16529u;

    /* renamed from: v, reason: collision with root package name */
    public String f16530v;

    public n(String str, int i5) {
        this.f16510a = str;
        this.f16511b = i5;
        Q1.o oVar = new Q1.o(Segment.SHARE_MINIMUM);
        this.f16512c = oVar;
        byte[] bArr = oVar.f9702a;
        this.f16513d = new J5.y(bArr, bArr.length, 1, (byte) 0);
        this.f16520l = -9223372036854775807L;
    }

    @Override // Y2.h
    public final void a() {
        this.f16517h = 0;
        this.f16520l = -9223372036854775807L;
        this.f16521m = false;
    }

    @Override // Y2.h
    public final void d(int i5, long j8) {
        this.f16520l = j8;
    }

    @Override // Y2.h
    public final void e(Q1.o oVar) throws D {
        int i5;
        boolean zH;
        Q1.k.h(this.f16514e);
        while (oVar.a() > 0) {
            int i10 = this.f16517h;
            if (i10 != 0) {
                if (i10 != 1) {
                    Q1.o oVar2 = this.f16512c;
                    J5.y yVar = this.f16513d;
                    if (i10 == 2) {
                        int iU = ((this.k & (-225)) << 8) | oVar.u();
                        this.f16519j = iU;
                        if (iU > oVar2.f9702a.length) {
                            oVar2.D(iU);
                            byte[] bArr = oVar2.f9702a;
                            yVar.getClass();
                            yVar.o(bArr.length, bArr);
                        }
                        this.f16518i = 0;
                        this.f16517h = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(oVar.a(), this.f16519j - this.f16518i);
                        oVar.f(this.f16518i, iMin, yVar.f5695b);
                        int i11 = this.f16518i + iMin;
                        this.f16518i = i11;
                        if (i11 == this.f16519j) {
                            yVar.q(0);
                            if (yVar.h()) {
                                if (this.f16521m) {
                                }
                                this.f16517h = 0;
                            } else {
                                this.f16521m = true;
                                int i12 = yVar.i(1);
                                int i13 = i12 == 1 ? yVar.i(1) : 0;
                                this.f16522n = i13;
                                if (i13 != 0) {
                                    throw D.a(null, null);
                                }
                                if (i12 == 1) {
                                    yVar.i((yVar.i(2) + 1) * 8);
                                }
                                if (!yVar.h()) {
                                    throw D.a(null, null);
                                }
                                this.f16523o = yVar.i(6);
                                int i14 = yVar.i(4);
                                int i15 = yVar.i(3);
                                if (i14 != 0 || i15 != 0) {
                                    throw D.a(null, null);
                                }
                                if (i12 == 0) {
                                    int iG = yVar.g();
                                    int iB = yVar.b();
                                    C0520a c0520aQ = AbstractC3991a.q(yVar, true);
                                    this.f16530v = c0520aQ.f4386c;
                                    this.f16527s = c0520aQ.f4384a;
                                    this.f16529u = c0520aQ.f4385b;
                                    int iB2 = iB - yVar.b();
                                    yVar.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    yVar.j(iB2, bArr2);
                                    C0764m c0764m = new C0764m();
                                    c0764m.f8183a = this.f16515f;
                                    c0764m.f8194m = N1.C.m("audio/mp4a-latm");
                                    c0764m.f8192j = this.f16530v;
                                    c0764m.f8173B = this.f16529u;
                                    c0764m.f8174C = this.f16527s;
                                    c0764m.f8197p = Collections.singletonList(bArr2);
                                    c0764m.f8186d = this.f16510a;
                                    c0764m.f8188f = this.f16511b;
                                    C0765n c0765n = new C0765n(c0764m);
                                    if (!c0765n.equals(this.f16516g)) {
                                        this.f16516g = c0765n;
                                        this.f16528t = 1024000000 / c0765n.f8211D;
                                        this.f16514e.c(c0765n);
                                    }
                                } else {
                                    int iB3 = yVar.b();
                                    C0520a c0520aQ2 = AbstractC3991a.q(yVar, true);
                                    this.f16530v = c0520aQ2.f4386c;
                                    this.f16527s = c0520aQ2.f4384a;
                                    this.f16529u = c0520aQ2.f4385b;
                                    yVar.t(yVar.i((yVar.i(2) + 1) * 8) - (iB3 - yVar.b()));
                                }
                                int i16 = yVar.i(3);
                                this.f16524p = i16;
                                if (i16 == 0) {
                                    yVar.t(8);
                                } else if (i16 == 1) {
                                    yVar.t(9);
                                } else if (i16 == 3 || i16 == 4 || i16 == 5) {
                                    yVar.t(6);
                                } else {
                                    if (i16 != 6 && i16 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    yVar.t(1);
                                }
                                boolean zH2 = yVar.h();
                                this.f16525q = zH2;
                                this.f16526r = 0L;
                                if (zH2) {
                                    if (i12 == 1) {
                                        this.f16526r = yVar.i((yVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = yVar.h();
                                            this.f16526r = (this.f16526r << 8) + yVar.i(8);
                                        } while (zH);
                                    }
                                }
                                if (yVar.h()) {
                                    yVar.t(8);
                                }
                            }
                            if (this.f16522n != 0) {
                                throw D.a(null, null);
                            }
                            if (this.f16523o != 0) {
                                throw D.a(null, null);
                            }
                            if (this.f16524p != 0) {
                                throw D.a(null, null);
                            }
                            int i17 = 0;
                            do {
                                i5 = yVar.i(8);
                                i17 += i5;
                            } while (i5 == 255);
                            int iG2 = yVar.g();
                            if ((iG2 & 7) == 0) {
                                oVar2.G(iG2 >> 3);
                            } else {
                                yVar.j(i17 * 8, oVar2.f9702a);
                                oVar2.G(0);
                            }
                            this.f16514e.e(i17, oVar2);
                            Q1.k.g(this.f16520l != -9223372036854775807L);
                            this.f16514e.a(this.f16520l, 1, i17, 0, null);
                            this.f16520l += this.f16528t;
                            if (this.f16525q) {
                                yVar.t((int) this.f16526r);
                            }
                            this.f16517h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU2 = oVar.u();
                    if ((iU2 & Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE) == 224) {
                        this.k = iU2;
                        this.f16517h = 2;
                    } else if (iU2 != 86) {
                        this.f16517h = 0;
                    }
                }
            } else if (oVar.u() == 86) {
                this.f16517h = 1;
            }
        }
    }

    @Override // Y2.h
    public final void f(s2.o oVar, T5.B b5) {
        b5.a();
        b5.b();
        this.f16514e = oVar.mo0m(b5.f11473e, 1);
        b5.b();
        this.f16515f = b5.f11474f;
    }

    @Override // Y2.h
    public final void h(boolean z2) {
    }
}
