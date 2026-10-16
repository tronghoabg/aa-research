package Y2;

/* loaded from: classes.dex */
public final class r implements A {

    /* renamed from: a, reason: collision with root package name */
    public final h f16566a;

    /* renamed from: b, reason: collision with root package name */
    public final J5.y f16567b = new J5.y(new byte[10], 10, 1, (byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public int f16568c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f16569d;

    /* renamed from: e, reason: collision with root package name */
    public Q1.u f16570e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16571f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16572g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16573h;

    /* renamed from: i, reason: collision with root package name */
    public int f16574i;

    /* renamed from: j, reason: collision with root package name */
    public int f16575j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f16576l;

    public r(h hVar) {
        this.f16566a = hVar;
    }

    @Override // Y2.A
    public final void a() {
        this.f16568c = 0;
        this.f16569d = 0;
        this.f16573h = false;
        this.f16566a.a();
    }

    @Override // Y2.A
    public final void b(Q1.u uVar, s2.o oVar, T5.B b5) {
        this.f16570e = uVar;
        this.f16566a.f(oVar, b5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [J5.y] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Y2.h] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // Y2.A
    public final void c(int i5, Q1.o oVar) {
        int i10;
        int i11;
        int i12;
        Q1.k.h(this.f16570e);
        int i13 = i5 & 1;
        ?? r32 = this.f16566a;
        int i14 = 2;
        ?? r92 = 0;
        if (i13 != 0) {
            int i15 = this.f16568c;
            if (i15 != 0 && i15 != 1) {
                if (i15 == 2) {
                    Q1.k.w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f16575j != -1) {
                        Q1.k.w("PesReader", "Unexpected start indicator: expected " + this.f16575j + " more bytes");
                    }
                    r32.h(oVar.f9704c == 0);
                }
            }
            this.f16568c = 1;
            this.f16569d = 0;
        }
        int i16 = i5;
        while (oVar.a() > 0) {
            int i17 = this.f16568c;
            if (i17 != 0) {
                ?? r11 = this.f16567b;
                if (i17 != 1) {
                    if (i17 == i14) {
                        if (d(oVar, r11.f5695b, Math.min(10, this.f16574i)) && d(oVar, null, this.f16574i)) {
                            r11.q(r92);
                            this.f16576l = -9223372036854775807L;
                            if (this.f16571f) {
                                r11.t(4);
                                r11.t(1);
                                r11.t(1);
                                long jI = (r11.i(15) << 15) | (r11.i(3) << 30) | r11.i(15);
                                r11.t(1);
                                if (!this.f16573h && this.f16572g) {
                                    r11.t(4);
                                    r11.t(1);
                                    r11.t(1);
                                    r11.t(1);
                                    this.f16570e.b((r11.i(3) << 30) | (r11.i(15) << 15) | r11.i(15));
                                    this.f16573h = true;
                                }
                                this.f16576l = this.f16570e.b(jI);
                            }
                            i16 |= this.k ? 4 : 0;
                            r32.d(i16, this.f16576l);
                            this.f16568c = 3;
                            this.f16569d = 0;
                            r92 = 0;
                            i14 = 2;
                        }
                    } else {
                        if (i17 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = oVar.a();
                        int i18 = this.f16575j;
                        int i19 = i18 == -1 ? r92 : iA - i18;
                        if (i19 > 0) {
                            iA -= i19;
                            oVar.F(oVar.f9703b + iA);
                        }
                        r32.e(oVar);
                        int i20 = this.f16575j;
                        if (i20 != -1) {
                            int i21 = i20 - iA;
                            this.f16575j = i21;
                            if (i21 == 0) {
                                r32.h(r92);
                                this.f16568c = 1;
                                this.f16569d = r92;
                            }
                        }
                    }
                    i10 = i14;
                    i11 = r92;
                } else {
                    i11 = r92;
                    if (d(oVar, r11.f5695b, 9)) {
                        r11.q(i11);
                        int i22 = r11.i(24);
                        if (i22 != 1) {
                            N0.a.o(i22, "Unexpected start code prefix: ", "PesReader");
                            this.f16575j = -1;
                            i12 = 0;
                            i10 = 2;
                        } else {
                            r11.t(8);
                            int i23 = r11.i(16);
                            r11.t(5);
                            this.k = r11.h();
                            i10 = 2;
                            r11.t(2);
                            this.f16571f = r11.h();
                            this.f16572g = r11.h();
                            r11.t(6);
                            int i24 = r11.i(8);
                            this.f16574i = i24;
                            if (i23 == 0) {
                                this.f16575j = -1;
                            } else {
                                int i25 = (i23 - 3) - i24;
                                this.f16575j = i25;
                                if (i25 < 0) {
                                    Q1.k.w("PesReader", "Found negative packet payload size: " + this.f16575j);
                                    this.f16575j = -1;
                                }
                            }
                            i12 = 2;
                        }
                        this.f16568c = i12;
                        i11 = 0;
                        this.f16569d = 0;
                    } else {
                        i10 = 2;
                    }
                }
            } else {
                i10 = i14;
                i11 = r92;
                oVar.H(oVar.a());
            }
            r92 = i11;
            i14 = i10;
        }
    }

    public final boolean d(Q1.o oVar, byte[] bArr, int i5) {
        int iMin = Math.min(oVar.a(), i5 - this.f16569d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            oVar.H(iMin);
        } else {
            oVar.f(this.f16569d, iMin, bArr);
        }
        int i10 = this.f16569d + iMin;
        this.f16569d = i10;
        return i10 == i5;
    }
}
