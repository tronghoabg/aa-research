package G5;

import s2.AbstractC3991a;

/* loaded from: classes3.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4324a;

    /* renamed from: b, reason: collision with root package name */
    public int f4325b;

    /* renamed from: c, reason: collision with root package name */
    public String f4326c;

    /* renamed from: d, reason: collision with root package name */
    public int f4327d;

    /* renamed from: e, reason: collision with root package name */
    public int f4328e;

    /* renamed from: f, reason: collision with root package name */
    public int f4329f;

    /* renamed from: g, reason: collision with root package name */
    public int f4330g;

    /* renamed from: h, reason: collision with root package name */
    public int f4331h;

    public /* synthetic */ L(int i5) {
        this.f4324a = i5;
    }

    public final boolean a(int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f4324a) {
            case 0:
                if (!((i5 & (-2097152)) == -2097152) || (i10 = (i5 >>> 19) & 3) == 1 || (i11 = (i5 >>> 17) & 3) == 0 || (i12 = (i5 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i5 >>> 10) & 3) == 3) {
                    return false;
                }
                this.f4325b = i10;
                this.f4326c = AbstractC0521b.f4398m[3 - i11];
                int i18 = AbstractC0521b.f4399n[i13];
                this.f4328e = i18;
                if (i10 == 2) {
                    this.f4328e = i18 / 2;
                } else if (i10 == 0) {
                    this.f4328e = i18 / 4;
                }
                int i19 = (i5 >>> 9) & 1;
                int i20 = 1152;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalArgumentException();
                        }
                        i20 = 384;
                    }
                } else if (i10 != 3) {
                    i20 = 576;
                }
                this.f4331h = i20;
                if (i11 == 3) {
                    int i21 = i10 == 3 ? AbstractC0521b.f4400o[i12 - 1] : AbstractC0521b.f4401p[i12 - 1];
                    this.f4330g = i21;
                    this.f4327d = (((i21 * 12) / this.f4328e) + i19) * 4;
                } else {
                    if (i10 == 3) {
                        int i22 = i11 == 2 ? AbstractC0521b.f4402q[i12 - 1] : AbstractC0521b.f4403r[i12 - 1];
                        this.f4330g = i22;
                        this.f4327d = ((i22 * 144) / this.f4328e) + i19;
                    } else {
                        int i23 = AbstractC0521b.f4404s[i12 - 1];
                        this.f4330g = i23;
                        this.f4327d = (((i11 == 1 ? 72 : 144) * i23) / this.f4328e) + i19;
                    }
                }
                this.f4329f = ((i5 >> 6) & 3) == 3 ? 1 : 2;
                return true;
            default:
                if (!((i5 & (-2097152)) == -2097152) || (i14 = (i5 >>> 19) & 3) == 1 || (i15 = (i5 >>> 17) & 3) == 0 || (i16 = (i5 >>> 12) & 15) == 0 || i16 == 15 || (i17 = (i5 >>> 10) & 3) == 3) {
                    return false;
                }
                this.f4325b = i14;
                this.f4326c = AbstractC3991a.f44848s[3 - i15];
                int i24 = AbstractC3991a.f44849t[i17];
                this.f4328e = i24;
                if (i14 == 2) {
                    this.f4328e = i24 / 2;
                } else if (i14 == 0) {
                    this.f4328e = i24 / 4;
                }
                int i25 = (i5 >>> 9) & 1;
                int i26 = 1152;
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            throw new IllegalArgumentException();
                        }
                        i26 = 384;
                    }
                } else if (i14 != 3) {
                    i26 = 576;
                }
                this.f4331h = i26;
                if (i15 == 3) {
                    int i27 = i14 == 3 ? AbstractC3991a.f44850u[i16 - 1] : AbstractC3991a.f44851v[i16 - 1];
                    this.f4330g = i27;
                    this.f4327d = (((i27 * 12) / this.f4328e) + i25) * 4;
                } else {
                    if (i14 == 3) {
                        int i28 = i15 == 2 ? AbstractC3991a.f44852w[i16 - 1] : AbstractC3991a.f44853x[i16 - 1];
                        this.f4330g = i28;
                        this.f4327d = ((i28 * 144) / this.f4328e) + i25;
                    } else {
                        int i29 = AbstractC3991a.f44854y[i16 - 1];
                        this.f4330g = i29;
                        this.f4327d = (((i15 == 1 ? 72 : 144) * i29) / this.f4328e) + i25;
                    }
                }
                this.f4329f = ((i5 >> 6) & 3) == 3 ? 1 : 2;
                return true;
        }
    }
}
