package T5;

import E5.S;
import E5.T;
import E5.o0;
import G5.AbstractC0521b;
import G5.C0520a;
import com.applovin.shadow.okio.Segment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class q implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f11654a;

    /* renamed from: b, reason: collision with root package name */
    public final Y4.b f11655b;

    /* renamed from: c, reason: collision with root package name */
    public final J5.y f11656c;

    /* renamed from: d, reason: collision with root package name */
    public J5.w f11657d;

    /* renamed from: e, reason: collision with root package name */
    public String f11658e;

    /* renamed from: f, reason: collision with root package name */
    public T f11659f;

    /* renamed from: g, reason: collision with root package name */
    public int f11660g;

    /* renamed from: h, reason: collision with root package name */
    public int f11661h;

    /* renamed from: i, reason: collision with root package name */
    public int f11662i;

    /* renamed from: j, reason: collision with root package name */
    public int f11663j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11664l;

    /* renamed from: m, reason: collision with root package name */
    public int f11665m;

    /* renamed from: n, reason: collision with root package name */
    public int f11666n;

    /* renamed from: o, reason: collision with root package name */
    public int f11667o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11668p;

    /* renamed from: q, reason: collision with root package name */
    public long f11669q;

    /* renamed from: r, reason: collision with root package name */
    public int f11670r;

    /* renamed from: s, reason: collision with root package name */
    public long f11671s;

    /* renamed from: t, reason: collision with root package name */
    public int f11672t;

    /* renamed from: u, reason: collision with root package name */
    public String f11673u;

    public q(String str) {
        this.f11654a = str;
        Y4.b bVar = new Y4.b(Segment.SHARE_MINIMUM);
        this.f11655b = bVar;
        byte[] bArr = bVar.f16679a;
        this.f11656c = new J5.y(bArr, bArr.length, 6, (byte) 0);
        this.k = -9223372036854775807L;
    }

    @Override // T5.f
    public final void a() {
        this.f11660g = 0;
        this.k = -9223372036854775807L;
        this.f11664l = false;
    }

    @Override // T5.f
    public final void c(Y4.b bVar) throws o0 {
        int i5;
        boolean zH;
        AbstractC4256a.j(this.f11657d);
        while (bVar.a() > 0) {
            int i10 = this.f11660g;
            if (i10 != 0) {
                if (i10 != 1) {
                    Y4.b bVar2 = this.f11655b;
                    J5.y yVar = this.f11656c;
                    if (i10 == 2) {
                        int iQ = ((this.f11663j & (-225)) << 8) | bVar.q();
                        this.f11662i = iQ;
                        if (iQ > bVar2.f16679a.length) {
                            bVar2.x(iQ);
                            byte[] bArr = bVar2.f16679a;
                            yVar.o(bArr.length, bArr);
                        }
                        this.f11661h = 0;
                        this.f11660g = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(bVar.a(), this.f11662i - this.f11661h);
                        bVar.c(this.f11661h, iMin, yVar.f5695b);
                        int i11 = this.f11661h + iMin;
                        this.f11661h = i11;
                        if (i11 == this.f11662i) {
                            yVar.q(0);
                            if (yVar.h()) {
                                if (this.f11664l) {
                                }
                                this.f11660g = 0;
                            } else {
                                this.f11664l = true;
                                int i12 = yVar.i(1);
                                int i13 = i12 == 1 ? yVar.i(1) : 0;
                                this.f11665m = i13;
                                if (i13 != 0) {
                                    throw o0.a(null, null);
                                }
                                if (i12 == 1) {
                                    yVar.i((yVar.i(2) + 1) * 8);
                                }
                                if (!yVar.h()) {
                                    throw o0.a(null, null);
                                }
                                this.f11666n = yVar.i(6);
                                int i14 = yVar.i(4);
                                int i15 = yVar.i(3);
                                if (i14 != 0 || i15 != 0) {
                                    throw o0.a(null, null);
                                }
                                if (i12 == 0) {
                                    int iG = yVar.g();
                                    int iB = yVar.b();
                                    C0520a c0520aF = AbstractC0521b.f(yVar, true);
                                    this.f11673u = c0520aF.f4386c;
                                    this.f11670r = c0520aF.f4384a;
                                    this.f11672t = c0520aF.f4385b;
                                    int iB2 = iB - yVar.b();
                                    yVar.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    yVar.j(iB2, bArr2);
                                    S s10 = new S();
                                    s10.f3195a = this.f11658e;
                                    s10.k = "audio/mp4a-latm";
                                    s10.f3202h = this.f11673u;
                                    s10.f3217x = this.f11672t;
                                    s10.f3218y = this.f11670r;
                                    s10.f3206m = Collections.singletonList(bArr2);
                                    s10.f3197c = this.f11654a;
                                    T t10 = new T(s10);
                                    if (!t10.equals(this.f11659f)) {
                                        this.f11659f = t10;
                                        this.f11671s = 1024000000 / t10.f3252z;
                                        this.f11657d.a(t10);
                                    }
                                } else {
                                    int iB3 = yVar.b();
                                    C0520a c0520aF2 = AbstractC0521b.f(yVar, true);
                                    this.f11673u = c0520aF2.f4386c;
                                    this.f11670r = c0520aF2.f4384a;
                                    this.f11672t = c0520aF2.f4385b;
                                    yVar.t(yVar.i((yVar.i(2) + 1) * 8) - (iB3 - yVar.b()));
                                }
                                int i16 = yVar.i(3);
                                this.f11667o = i16;
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
                                this.f11668p = zH2;
                                this.f11669q = 0L;
                                if (zH2) {
                                    if (i12 == 1) {
                                        this.f11669q = yVar.i((yVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = yVar.h();
                                            this.f11669q = (this.f11669q << 8) + yVar.i(8);
                                        } while (zH);
                                    }
                                }
                                if (yVar.h()) {
                                    yVar.t(8);
                                }
                            }
                            if (this.f11665m != 0) {
                                throw o0.a(null, null);
                            }
                            if (this.f11666n != 0) {
                                throw o0.a(null, null);
                            }
                            if (this.f11667o != 0) {
                                throw o0.a(null, null);
                            }
                            int i17 = 0;
                            do {
                                i5 = yVar.i(8);
                                i17 += i5;
                            } while (i5 == 255);
                            int iG2 = yVar.g();
                            if ((iG2 & 7) == 0) {
                                bVar2.A(iG2 >> 3);
                            } else {
                                yVar.j(i17 * 8, bVar2.f16679a);
                                bVar2.A(0);
                            }
                            this.f11657d.c(i17, bVar2);
                            long j8 = this.k;
                            if (j8 != -9223372036854775807L) {
                                this.f11657d.b(j8, 1, i17, 0, null);
                                this.k += this.f11671s;
                            }
                            if (this.f11668p) {
                                yVar.t((int) this.f11669q);
                            }
                            this.f11660g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iQ2 = bVar.q();
                    if ((iQ2 & Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE) == 224) {
                        this.f11663j = iQ2;
                        this.f11660g = 2;
                    } else if (iQ2 != 86) {
                        this.f11660g = 0;
                    }
                }
            } else if (bVar.q() == 86) {
                this.f11660g = 1;
            }
        }
    }

    @Override // T5.f
    public final void d(int i5, long j8) {
        if (j8 != -9223372036854775807L) {
            this.k = j8;
        }
    }

    @Override // T5.f
    public final void g(J5.m mVar, B b5) {
        b5.a();
        b5.b();
        this.f11657d = mVar.m(b5.f11473e, 1);
        b5.b();
        this.f11658e = b5.f11474f;
    }

    @Override // T5.f
    public final void i() {
    }
}
