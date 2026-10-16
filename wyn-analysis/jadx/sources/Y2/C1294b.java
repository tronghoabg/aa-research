package Y2;

import G5.C0522c;
import N1.C0764m;
import N1.C0765n;
import j$.util.Objects;
import s2.AbstractC3991a;
import s2.C;
import s2.C3992b;

/* renamed from: Y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1294b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16388a;

    /* renamed from: b, reason: collision with root package name */
    public final J5.y f16389b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.o f16390c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16391d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16392e;

    /* renamed from: f, reason: collision with root package name */
    public String f16393f;

    /* renamed from: g, reason: collision with root package name */
    public C f16394g;

    /* renamed from: h, reason: collision with root package name */
    public int f16395h;

    /* renamed from: i, reason: collision with root package name */
    public int f16396i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16397j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public C0765n f16398l;

    /* renamed from: m, reason: collision with root package name */
    public int f16399m;

    /* renamed from: n, reason: collision with root package name */
    public long f16400n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1294b() {
        this(null, 0, 0);
        this.f16388a = 0;
    }

    @Override // Y2.h
    public final void a() {
        switch (this.f16388a) {
            case 0:
                this.f16395h = 0;
                this.f16396i = 0;
                this.f16397j = false;
                this.f16400n = -9223372036854775807L;
                break;
            default:
                this.f16395h = 0;
                this.f16396i = 0;
                this.f16397j = false;
                this.f16400n = -9223372036854775807L;
                break;
        }
    }

    @Override // Y2.h
    public final void d(int i5, long j8) {
        switch (this.f16388a) {
            case 0:
                this.f16400n = j8;
                break;
            default:
                this.f16400n = j8;
                break;
        }
    }

    @Override // Y2.h
    public final void e(Q1.o oVar) {
        switch (this.f16388a) {
            case 0:
                Q1.k.h(this.f16394g);
                while (oVar.a() > 0) {
                    int i5 = this.f16395h;
                    Q1.o oVar2 = this.f16390c;
                    if (i5 == 0) {
                        while (true) {
                            if (oVar.a() <= 0) {
                                break;
                            }
                            if (this.f16397j) {
                                int iU = oVar.u();
                                if (iU == 119) {
                                    this.f16397j = false;
                                    this.f16395h = 1;
                                    byte[] bArr = oVar2.f9702a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f16396i = 2;
                                } else {
                                    this.f16397j = iU == 11;
                                }
                            } else {
                                this.f16397j = oVar.u() == 11;
                            }
                        }
                    } else if (i5 == 1) {
                        byte[] bArr2 = oVar2.f9702a;
                        int iMin = Math.min(oVar.a(), 128 - this.f16396i);
                        oVar.f(this.f16396i, iMin, bArr2);
                        int i10 = this.f16396i + iMin;
                        this.f16396i = i10;
                        if (i10 == 128) {
                            J5.y yVar = this.f16389b;
                            yVar.q(0);
                            C3992b c3992bO = AbstractC3991a.o(yVar);
                            C0765n c0765n = this.f16398l;
                            int i11 = c3992bO.f44856b;
                            int i12 = c3992bO.f44857c;
                            String str = c3992bO.f44855a;
                            if (c0765n == null || i12 != c0765n.f8210C || i11 != c0765n.f8211D || !Objects.equals(str, c0765n.f8232n)) {
                                C0764m c0764m = new C0764m();
                                c0764m.f8183a = this.f16393f;
                                c0764m.f8194m = N1.C.m(str);
                                c0764m.f8173B = i12;
                                c0764m.f8174C = i11;
                                c0764m.f8186d = this.f16391d;
                                c0764m.f8188f = this.f16392e;
                                int i13 = c3992bO.f44860f;
                                c0764m.f8191i = i13;
                                if ("audio/ac3".equals(str)) {
                                    c0764m.f8190h = i13;
                                }
                                C0765n c0765n2 = new C0765n(c0764m);
                                this.f16398l = c0765n2;
                                this.f16394g.c(c0765n2);
                            }
                            this.f16399m = c3992bO.f44858d;
                            this.k = (c3992bO.f44859e * 1000000) / this.f16398l.f8211D;
                            oVar2.G(0);
                            this.f16394g.e(128, oVar2);
                            this.f16395h = 2;
                        }
                    } else if (i5 == 2) {
                        int iMin2 = Math.min(oVar.a(), this.f16399m - this.f16396i);
                        this.f16394g.e(iMin2, oVar);
                        int i14 = this.f16396i + iMin2;
                        this.f16396i = i14;
                        if (i14 == this.f16399m) {
                            Q1.k.g(this.f16400n != -9223372036854775807L);
                            this.f16394g.a(this.f16400n, 1, this.f16399m, 0, null);
                            this.f16400n += this.k;
                            this.f16395h = 0;
                        }
                    }
                }
                break;
            default:
                Q1.k.h(this.f16394g);
                while (oVar.a() > 0) {
                    int i15 = this.f16395h;
                    Q1.o oVar3 = this.f16390c;
                    if (i15 == 0) {
                        while (oVar.a() > 0) {
                            if (this.f16397j) {
                                int iU2 = oVar.u();
                                this.f16397j = iU2 == 172;
                                if (iU2 == 64 || iU2 == 65) {
                                    boolean z2 = iU2 == 65;
                                    this.f16395h = 1;
                                    byte[] bArr3 = oVar3.f9702a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z2 ? 65 : 64);
                                    this.f16396i = 2;
                                }
                            } else {
                                this.f16397j = oVar.u() == 172;
                            }
                        }
                    } else if (i15 == 1) {
                        byte[] bArr4 = oVar3.f9702a;
                        int iMin3 = Math.min(oVar.a(), 16 - this.f16396i);
                        oVar.f(this.f16396i, iMin3, bArr4);
                        int i16 = this.f16396i + iMin3;
                        this.f16396i = i16;
                        if (i16 == 16) {
                            J5.y yVar2 = this.f16389b;
                            yVar2.q(0);
                            C0522c c0522cP = AbstractC3991a.p(yVar2);
                            C0765n c0765n3 = this.f16398l;
                            int i17 = c0522cP.f4405a;
                            if (c0765n3 == null || 2 != c0765n3.f8210C || i17 != c0765n3.f8211D || !"audio/ac4".equals(c0765n3.f8232n)) {
                                C0764m c0764m2 = new C0764m();
                                c0764m2.f8183a = this.f16393f;
                                c0764m2.f8194m = N1.C.m("audio/ac4");
                                c0764m2.f8173B = 2;
                                c0764m2.f8174C = i17;
                                c0764m2.f8186d = this.f16391d;
                                c0764m2.f8188f = this.f16392e;
                                C0765n c0765n4 = new C0765n(c0764m2);
                                this.f16398l = c0765n4;
                                this.f16394g.c(c0765n4);
                            }
                            this.f16399m = c0522cP.f4406b;
                            this.k = (c0522cP.f4407c * 1000000) / this.f16398l.f8211D;
                            oVar3.G(0);
                            this.f16394g.e(16, oVar3);
                            this.f16395h = 2;
                        }
                    } else if (i15 == 2) {
                        int iMin4 = Math.min(oVar.a(), this.f16399m - this.f16396i);
                        this.f16394g.e(iMin4, oVar);
                        int i18 = this.f16396i + iMin4;
                        this.f16396i = i18;
                        if (i18 == this.f16399m) {
                            Q1.k.g(this.f16400n != -9223372036854775807L);
                            this.f16394g.a(this.f16400n, 1, this.f16399m, 0, null);
                            this.f16400n += this.k;
                            this.f16395h = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // Y2.h
    public final void f(s2.o oVar, T5.B b5) {
        switch (this.f16388a) {
            case 0:
                b5.a();
                b5.b();
                this.f16393f = b5.f11474f;
                b5.b();
                this.f16394g = oVar.mo0m(b5.f11473e, 1);
                break;
            default:
                b5.a();
                b5.b();
                this.f16393f = b5.f11474f;
                b5.b();
                this.f16394g = oVar.mo0m(b5.f11473e, 1);
                break;
        }
    }

    @Override // Y2.h
    public final void h(boolean z2) {
        int i5 = this.f16388a;
    }

    public C1294b(String str, int i5, int i10) {
        this.f16388a = i10;
        switch (i10) {
            case 1:
                J5.y yVar = new J5.y(new byte[16], 16, 1, (byte) 0);
                this.f16389b = yVar;
                this.f16390c = new Q1.o(yVar.f5695b);
                this.f16395h = 0;
                this.f16396i = 0;
                this.f16397j = false;
                this.f16400n = -9223372036854775807L;
                this.f16391d = str;
                this.f16392e = i5;
                break;
            default:
                J5.y yVar2 = new J5.y(new byte[128], 128, 1, (byte) 0);
                this.f16389b = yVar2;
                this.f16390c = new Q1.o(yVar2.f5695b);
                this.f16395h = 0;
                this.f16400n = -9223372036854775807L;
                this.f16391d = str;
                this.f16392e = i5;
                break;
        }
    }

    private final void b(boolean z2) {
    }

    private final void c(boolean z2) {
    }
}
