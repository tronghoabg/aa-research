package T5;

import A7.AbstractC0279p0;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class t implements C {

    /* renamed from: a, reason: collision with root package name */
    public final f f11691a;

    /* renamed from: b, reason: collision with root package name */
    public final J5.y f11692b = new J5.y(new byte[10], 10, 6, (byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public int f11693c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f11694d;

    /* renamed from: e, reason: collision with root package name */
    public u6.t f11695e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11696f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11697g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11698h;

    /* renamed from: i, reason: collision with root package name */
    public int f11699i;

    /* renamed from: j, reason: collision with root package name */
    public int f11700j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f11701l;

    public t(f fVar) {
        this.f11691a = fVar;
    }

    @Override // T5.C
    public final void a() {
        this.f11693c = 0;
        this.f11694d = 0;
        this.f11698h = false;
        this.f11691a.a();
    }

    @Override // T5.C
    public final void b(int i5, Y4.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC4256a.j(this.f11695e);
        int i14 = i5 & 1;
        f fVar = this.f11691a;
        int i15 = -1;
        int i16 = 3;
        int i17 = 2;
        if (i14 != 0) {
            int i18 = this.f11693c;
            if (i18 != 0 && i18 != 1) {
                if (i18 == 2) {
                    AbstractC4256a.E("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i18 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f11700j != -1) {
                        AbstractC4256a.E("PesReader", "Unexpected start indicator: expected " + this.f11700j + " more bytes");
                    }
                    fVar.i();
                }
            }
            this.f11693c = 1;
            this.f11694d = 0;
        }
        int i19 = i5;
        while (bVar.a() > 0) {
            int i20 = this.f11693c;
            if (i20 != 0) {
                J5.y yVar = this.f11692b;
                if (i20 == 1) {
                    i11 = i16;
                    if (c(bVar, yVar.f5695b, 9)) {
                        yVar.q(0);
                        int i21 = yVar.i(24);
                        if (i21 != 1) {
                            AbstractC0279p0.u(i21, "Unexpected start code prefix: ", "PesReader");
                            this.f11700j = -1;
                            i13 = 0;
                            i10 = -1;
                            i12 = 2;
                        } else {
                            yVar.t(8);
                            int i22 = yVar.i(16);
                            yVar.t(5);
                            this.k = yVar.h();
                            i12 = 2;
                            yVar.t(2);
                            this.f11696f = yVar.h();
                            this.f11697g = yVar.h();
                            yVar.t(6);
                            int i23 = yVar.i(8);
                            this.f11699i = i23;
                            if (i22 == 0) {
                                this.f11700j = -1;
                                i10 = -1;
                            } else {
                                int i24 = (i22 - 3) - i23;
                                this.f11700j = i24;
                                if (i24 < 0) {
                                    AbstractC4256a.E("PesReader", "Found negative packet payload size: " + this.f11700j);
                                    i10 = -1;
                                    this.f11700j = -1;
                                } else {
                                    i10 = -1;
                                }
                            }
                            i13 = 2;
                        }
                        this.f11693c = i13;
                        this.f11694d = 0;
                    } else {
                        i10 = -1;
                        i12 = 2;
                    }
                } else if (i20 == i17) {
                    if (c(bVar, yVar.f5695b, Math.min(10, this.f11699i)) && c(bVar, null, this.f11699i)) {
                        yVar.q(0);
                        this.f11701l = -9223372036854775807L;
                        if (this.f11696f) {
                            yVar.t(4);
                            yVar.t(1);
                            yVar.t(1);
                            long jI = (yVar.i(15) << 15) | (yVar.i(i16) << 30) | yVar.i(15);
                            yVar.t(1);
                            if (!this.f11698h && this.f11697g) {
                                yVar.t(4);
                                yVar.t(1);
                                yVar.t(1);
                                yVar.t(1);
                                this.f11695e.b((yVar.i(15) << 15) | (yVar.i(i16) << 30) | yVar.i(15));
                                this.f11698h = true;
                            }
                            this.f11701l = this.f11695e.b(jI);
                        }
                        i19 |= this.k ? 4 : 0;
                        fVar.d(i19, this.f11701l);
                        this.f11693c = 3;
                        this.f11694d = 0;
                        i16 = 3;
                        i15 = -1;
                        i17 = 2;
                    } else {
                        i11 = i16;
                        i12 = i17;
                        i10 = -1;
                    }
                } else {
                    if (i20 != i16) {
                        throw new IllegalStateException();
                    }
                    int iA = bVar.a();
                    int i25 = this.f11700j;
                    int i26 = i25 == i15 ? 0 : iA - i25;
                    if (i26 > 0) {
                        iA -= i26;
                        bVar.z(bVar.f16680b + iA);
                    }
                    fVar.c(bVar);
                    int i27 = this.f11700j;
                    if (i27 != i15) {
                        int i28 = i27 - iA;
                        this.f11700j = i28;
                        if (i28 == 0) {
                            fVar.i();
                            this.f11693c = 1;
                            this.f11694d = 0;
                        }
                    }
                    int i29 = i16;
                    i10 = i15;
                    i11 = i29;
                    i12 = i17;
                }
            } else {
                int i30 = i16;
                i10 = i15;
                i11 = i30;
                i12 = i17;
                bVar.B(bVar.a());
            }
            int i31 = i10;
            i16 = i11;
            i15 = i31;
            i17 = i12;
        }
    }

    public final boolean c(Y4.b bVar, byte[] bArr, int i5) {
        int iMin = Math.min(bVar.a(), i5 - this.f11694d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            bVar.B(iMin);
        } else {
            bVar.c(this.f11694d, iMin, bArr);
        }
        int i10 = this.f11694d + iMin;
        this.f11694d = i10;
        return i10 == i5;
    }

    @Override // T5.C
    public final void d(u6.t tVar, J5.m mVar, B b5) {
        this.f11695e = tVar;
        this.f11691a.g(mVar, b5);
    }
}
