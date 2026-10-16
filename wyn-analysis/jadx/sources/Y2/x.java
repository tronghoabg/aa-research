package Y2;

/* loaded from: classes.dex */
public final class x implements A {

    /* renamed from: a, reason: collision with root package name */
    public final w f16603a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.o f16604b = new Q1.o(32);

    /* renamed from: c, reason: collision with root package name */
    public int f16605c;

    /* renamed from: d, reason: collision with root package name */
    public int f16606d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16607e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16608f;

    public x(w wVar) {
        this.f16603a = wVar;
    }

    @Override // Y2.A
    public final void a() {
        this.f16608f = true;
    }

    @Override // Y2.A
    public final void b(Q1.u uVar, s2.o oVar, T5.B b5) {
        this.f16603a.b(uVar, oVar, b5);
        this.f16608f = true;
    }

    @Override // Y2.A
    public final void c(int i5, Q1.o oVar) {
        boolean z2 = (i5 & 1) != 0;
        int iU = z2 ? oVar.f9703b + oVar.u() : -1;
        if (this.f16608f) {
            if (!z2) {
                return;
            }
            this.f16608f = false;
            oVar.G(iU);
            this.f16606d = 0;
        }
        while (oVar.a() > 0) {
            int i10 = this.f16606d;
            Q1.o oVar2 = this.f16604b;
            if (i10 < 3) {
                if (i10 == 0) {
                    int iU2 = oVar.u();
                    oVar.G(oVar.f9703b - 1);
                    if (iU2 == 255) {
                        this.f16608f = true;
                        return;
                    }
                }
                int iMin = Math.min(oVar.a(), 3 - this.f16606d);
                oVar.f(this.f16606d, iMin, oVar2.f9702a);
                int i11 = this.f16606d + iMin;
                this.f16606d = i11;
                if (i11 == 3) {
                    oVar2.G(0);
                    oVar2.F(3);
                    oVar2.H(1);
                    int iU3 = oVar2.u();
                    int iU4 = oVar2.u();
                    this.f16607e = (iU3 & 128) != 0;
                    int i12 = (((iU3 & 15) << 8) | iU4) + 3;
                    this.f16605c = i12;
                    byte[] bArr = oVar2.f9702a;
                    if (bArr.length < i12) {
                        oVar2.b(Math.min(4098, Math.max(i12, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(oVar.a(), this.f16605c - this.f16606d);
                oVar.f(this.f16606d, iMin2, oVar2.f9702a);
                int i13 = this.f16606d + iMin2;
                this.f16606d = i13;
                int i14 = this.f16605c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.f16607e) {
                        oVar2.F(i14);
                    } else {
                        if (Q1.x.l(0, oVar2.f9702a, i14, -1) != 0) {
                            this.f16608f = true;
                            return;
                        }
                        oVar2.F(this.f16605c - 4);
                    }
                    oVar2.G(0);
                    this.f16603a.e(oVar2);
                    this.f16606d = 0;
                }
            }
        }
    }
}
