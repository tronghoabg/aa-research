package J5;

import org.apache.tika.fork.ForkServer;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5694a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f5695b;

    /* renamed from: c, reason: collision with root package name */
    public int f5696c;

    /* renamed from: d, reason: collision with root package name */
    public int f5697d;

    /* renamed from: e, reason: collision with root package name */
    public int f5698e;

    public /* synthetic */ y(byte[] bArr, int i5, int i10, byte b5) {
        this.f5694a = i10;
        this.f5695b = bArr;
        this.f5698e = i5;
    }

    public void a() {
        int i5;
        int i10;
        int i11;
        int i12;
        switch (this.f5694a) {
            case 1:
                int i13 = this.f5696c;
                Q1.k.g(i13 >= 0 && (i13 < (i5 = this.f5698e) || (i13 == i5 && this.f5697d == 0)));
                break;
            case 3:
                int i14 = this.f5697d;
                Q1.k.g(i14 >= 0 && (i14 < (i10 = this.f5696c) || (i14 == i10 && this.f5698e == 0)));
                break;
            case 6:
                int i15 = this.f5696c;
                AbstractC4256a.i(i15 >= 0 && (i15 < (i11 = this.f5698e) || (i15 == i11 && this.f5697d == 0)));
                break;
            default:
                int i16 = this.f5697d;
                AbstractC4256a.i(i16 >= 0 && (i16 < (i12 = this.f5696c) || (i16 == i12 && this.f5698e == 0)));
                break;
        }
    }

    public int b() {
        switch (this.f5694a) {
        }
        return ((this.f5698e - this.f5696c) * 8) - this.f5697d;
    }

    public void c() {
        switch (this.f5694a) {
            case 1:
                if (this.f5697d != 0) {
                    this.f5697d = 0;
                    this.f5696c++;
                    a();
                    break;
                }
                break;
            default:
                if (this.f5697d != 0) {
                    this.f5697d = 0;
                    this.f5696c++;
                    a();
                    break;
                }
                break;
        }
    }

    public boolean d(int i5) {
        switch (this.f5694a) {
            case 3:
                int i10 = this.f5697d;
                int i11 = i5 / 8;
                int i12 = i10 + i11;
                int i13 = (this.f5698e + i5) - (i11 * 8);
                if (i13 > 7) {
                    i12++;
                    i13 -= 8;
                }
                while (true) {
                    i10++;
                    if (i10 <= i12 && i12 < this.f5696c) {
                        if (r(i10)) {
                            i12++;
                            i10 += 2;
                        }
                    }
                }
                int i14 = this.f5696c;
                if (i12 >= i14) {
                    if (i12 != i14 || i13 != 0) {
                    }
                }
                break;
            default:
                int i15 = this.f5697d;
                int i16 = i5 / 8;
                int i17 = i15 + i16;
                int i18 = (this.f5698e + i5) - (i16 * 8);
                if (i18 > 7) {
                    i17++;
                    i18 -= 8;
                }
                while (true) {
                    i15++;
                    if (i15 <= i17 && i17 < this.f5696c) {
                        if (r(i15)) {
                            i17++;
                            i15 += 2;
                        }
                    }
                }
                int i19 = this.f5696c;
                if (i17 >= i19) {
                    if (i17 != i19 || i18 != 0) {
                    }
                }
                break;
        }
        return true;
    }

    public boolean e() {
        switch (this.f5694a) {
            case 3:
                int i5 = this.f5697d;
                int i10 = this.f5698e;
                int i11 = 0;
                while (this.f5697d < this.f5696c && !h()) {
                    i11++;
                }
                boolean z2 = this.f5697d == this.f5696c;
                this.f5697d = i5;
                this.f5698e = i10;
                if (!z2 && d((i11 * 2) + 1)) {
                    break;
                }
                break;
            default:
                int i12 = this.f5697d;
                int i13 = this.f5698e;
                int i14 = 0;
                while (this.f5697d < this.f5696c && !h()) {
                    i14++;
                }
                boolean z10 = this.f5697d == this.f5696c;
                this.f5697d = i12;
                this.f5698e = i13;
                if (!z10 && d((i14 * 2) + 1)) {
                    break;
                }
                break;
        }
        return true;
    }

    public int f() {
        switch (this.f5694a) {
            case 1:
                Q1.k.g(this.f5697d == 0);
                break;
            default:
                AbstractC4256a.i(this.f5697d == 0);
                break;
        }
        return this.f5696c;
    }

    public int g() {
        switch (this.f5694a) {
        }
        return (this.f5696c * 8) + this.f5697d;
    }

    public boolean h() {
        switch (this.f5694a) {
            case 0:
                boolean z2 = (((this.f5695b[this.f5697d] & ForkServer.ERROR) >> this.f5698e) & 1) == 1;
                t(1);
                return z2;
            case 1:
                boolean z10 = (this.f5695b[this.f5696c] & (128 >> this.f5697d)) != 0;
                s();
                return z10;
            case 2:
            case 4:
            default:
                boolean z11 = (this.f5695b[this.f5697d] & (128 >> this.f5698e)) != 0;
                s();
                return z11;
            case 3:
                boolean z12 = (this.f5695b[this.f5697d] & (128 >> this.f5698e)) != 0;
                s();
                return z12;
            case 5:
                boolean z13 = (((this.f5695b[this.f5697d] & ForkServer.ERROR) >> this.f5698e) & 1) == 1;
                t(1);
                return z13;
            case 6:
                boolean z14 = (this.f5695b[this.f5696c] & (128 >> this.f5697d)) != 0;
                s();
                return z14;
        }
    }

    public int i(int i5) {
        switch (this.f5694a) {
            case 0:
                int i10 = this.f5697d;
                int iMin = Math.min(i5, 8 - this.f5698e);
                int i11 = i10 + 1;
                byte[] bArr = this.f5695b;
                int i12 = ((bArr[i10] & ForkServer.ERROR) >> this.f5698e) & (255 >> (8 - iMin));
                while (iMin < i5) {
                    i12 |= (bArr[i11] & ForkServer.ERROR) << iMin;
                    iMin += 8;
                    i11++;
                }
                int i13 = i12 & ((-1) >>> (32 - i5));
                t(i5);
                return i13;
            case 1:
                if (i5 == 0) {
                    return 0;
                }
                this.f5697d += i5;
                int i14 = 0;
                while (true) {
                    int i15 = this.f5697d;
                    if (i15 <= 8) {
                        byte[] bArr2 = this.f5695b;
                        int i16 = this.f5696c;
                        int i17 = ((-1) >>> (32 - i5)) & (i14 | ((bArr2[i16] & ForkServer.ERROR) >> (8 - i15)));
                        if (i15 == 8) {
                            this.f5697d = 0;
                            this.f5696c = i16 + 1;
                        }
                        a();
                        return i17;
                    }
                    int i18 = i15 - 8;
                    this.f5697d = i18;
                    byte[] bArr3 = this.f5695b;
                    int i19 = this.f5696c;
                    this.f5696c = i19 + 1;
                    i14 |= (bArr3[i19] & ForkServer.ERROR) << i18;
                }
            case 2:
            case 4:
            default:
                this.f5698e += i5;
                int i20 = 0;
                while (true) {
                    int i21 = this.f5698e;
                    if (i21 <= 8) {
                        byte[] bArr4 = this.f5695b;
                        int i22 = this.f5697d;
                        int i23 = ((-1) >>> (32 - i5)) & (i20 | ((bArr4[i22] & ForkServer.ERROR) >> (8 - i21)));
                        if (i21 == 8) {
                            this.f5698e = 0;
                            this.f5697d = i22 + (r(i22 + 1) ? 2 : 1);
                        }
                        a();
                        return i23;
                    }
                    int i24 = i21 - 8;
                    this.f5698e = i24;
                    byte[] bArr5 = this.f5695b;
                    int i25 = this.f5697d;
                    i20 |= (bArr5[i25] & ForkServer.ERROR) << i24;
                    if (!r(i25 + 1)) {
                        i = 1;
                    }
                    this.f5697d = i25 + i;
                }
            case 3:
                this.f5698e += i5;
                int i26 = 0;
                while (true) {
                    int i27 = this.f5698e;
                    if (i27 <= 8) {
                        byte[] bArr6 = this.f5695b;
                        int i28 = this.f5697d;
                        int i29 = ((-1) >>> (32 - i5)) & (i26 | ((bArr6[i28] & ForkServer.ERROR) >> (8 - i27)));
                        if (i27 == 8) {
                            this.f5698e = 0;
                            this.f5697d = i28 + (r(i28 + 1) ? 2 : 1);
                        }
                        a();
                        return i29;
                    }
                    int i30 = i27 - 8;
                    this.f5698e = i30;
                    byte[] bArr7 = this.f5695b;
                    int i31 = this.f5697d;
                    i26 |= (bArr7[i31] & ForkServer.ERROR) << i30;
                    if (!r(i31 + 1)) {
                        i = 1;
                    }
                    this.f5697d = i31 + i;
                }
            case 5:
                int i32 = this.f5697d;
                int iMin2 = Math.min(i5, 8 - this.f5698e);
                int i33 = i32 + 1;
                byte[] bArr8 = this.f5695b;
                int i34 = ((bArr8[i32] & ForkServer.ERROR) >> this.f5698e) & (255 >> (8 - iMin2));
                while (iMin2 < i5) {
                    i34 |= (bArr8[i33] & ForkServer.ERROR) << iMin2;
                    iMin2 += 8;
                    i33++;
                }
                int i35 = i34 & ((-1) >>> (32 - i5));
                t(i5);
                return i35;
            case 6:
                if (i5 == 0) {
                    return 0;
                }
                this.f5697d += i5;
                int i36 = 0;
                while (true) {
                    int i37 = this.f5697d;
                    if (i37 <= 8) {
                        byte[] bArr9 = this.f5695b;
                        int i38 = this.f5696c;
                        int i39 = ((-1) >>> (32 - i5)) & (i36 | ((bArr9[i38] & ForkServer.ERROR) >> (8 - i37)));
                        if (i37 == 8) {
                            this.f5697d = 0;
                            this.f5696c = i38 + 1;
                        }
                        a();
                        return i39;
                    }
                    int i40 = i37 - 8;
                    this.f5697d = i40;
                    byte[] bArr10 = this.f5695b;
                    int i41 = this.f5696c;
                    this.f5696c = i41 + 1;
                    i36 |= (bArr10[i41] & ForkServer.ERROR) << i40;
                }
        }
    }

    public void j(int i5, byte[] bArr) {
        switch (this.f5694a) {
            case 1:
                int i10 = i5 >> 3;
                for (int i11 = 0; i11 < i10; i11++) {
                    byte[] bArr2 = this.f5695b;
                    int i12 = this.f5696c;
                    int i13 = i12 + 1;
                    this.f5696c = i13;
                    byte b5 = bArr2[i12];
                    int i14 = this.f5697d;
                    byte b10 = (byte) (b5 << i14);
                    bArr[i11] = b10;
                    bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b10);
                }
                int i15 = i5 & 7;
                if (i15 != 0) {
                    byte b11 = (byte) (bArr[i10] & (255 >> i15));
                    bArr[i10] = b11;
                    int i16 = this.f5697d;
                    if (i16 + i15 > 8) {
                        byte[] bArr3 = this.f5695b;
                        int i17 = this.f5696c;
                        this.f5696c = i17 + 1;
                        bArr[i10] = (byte) (b11 | ((bArr3[i17] & ForkServer.ERROR) << i16));
                        this.f5697d = i16 - 8;
                    }
                    int i18 = this.f5697d + i15;
                    this.f5697d = i18;
                    byte[] bArr4 = this.f5695b;
                    int i19 = this.f5696c;
                    bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
                    if (i18 == 8) {
                        this.f5697d = 0;
                        this.f5696c = i19 + 1;
                    }
                    a();
                    break;
                }
                break;
            default:
                int i20 = i5 >> 3;
                for (int i21 = 0; i21 < i20; i21++) {
                    byte[] bArr5 = this.f5695b;
                    int i22 = this.f5696c;
                    int i23 = i22 + 1;
                    this.f5696c = i23;
                    byte b12 = bArr5[i22];
                    int i24 = this.f5697d;
                    byte b13 = (byte) (b12 << i24);
                    bArr[i21] = b13;
                    bArr[i21] = (byte) (((255 & bArr5[i23]) >> (8 - i24)) | b13);
                }
                int i25 = i5 & 7;
                if (i25 != 0) {
                    byte b14 = (byte) (bArr[i20] & (255 >> i25));
                    bArr[i20] = b14;
                    int i26 = this.f5697d;
                    if (i26 + i25 > 8) {
                        byte[] bArr6 = this.f5695b;
                        int i27 = this.f5696c;
                        this.f5696c = i27 + 1;
                        bArr[i20] = (byte) (b14 | ((bArr6[i27] & ForkServer.ERROR) << i26));
                        this.f5697d = i26 - 8;
                    }
                    int i28 = this.f5697d + i25;
                    this.f5697d = i28;
                    byte[] bArr7 = this.f5695b;
                    int i29 = this.f5696c;
                    bArr[i20] = (byte) (((byte) (((255 & bArr7[i29]) >> (8 - i28)) << (8 - i25))) | bArr[i20]);
                    if (i28 == 8) {
                        this.f5697d = 0;
                        this.f5696c = i29 + 1;
                    }
                    a();
                    break;
                }
                break;
        }
    }

    public long k(int i5) {
        if (i5 <= 32) {
            int i10 = i(i5);
            int i11 = Q1.x.f9724a;
            return 4294967295L & i10;
        }
        int i12 = i(i5 - 32);
        int i13 = i(32);
        int i14 = Q1.x.f9724a;
        return (4294967295L & i13) | ((i12 & 4294967295L) << 32);
    }

    public void l(int i5, byte[] bArr) {
        switch (this.f5694a) {
            case 1:
                Q1.k.g(this.f5697d == 0);
                System.arraycopy(this.f5695b, this.f5696c, bArr, 0, i5);
                this.f5696c += i5;
                a();
                break;
            default:
                AbstractC4256a.i(this.f5697d == 0);
                System.arraycopy(this.f5695b, this.f5696c, bArr, 0, i5);
                this.f5696c += i5;
                a();
                break;
        }
    }

    public int m() {
        switch (this.f5694a) {
            case 3:
                int i5 = 0;
                while (!h()) {
                    i5++;
                }
                return ((1 << i5) - 1) + (i5 > 0 ? i(i5) : 0);
            default:
                int i10 = 0;
                while (!h()) {
                    i10++;
                }
                return ((1 << i10) - 1) + (i10 > 0 ? i(i10) : 0);
        }
    }

    public int n() {
        switch (this.f5694a) {
            case 3:
                int iM = m();
                return ((iM + 1) / 2) * (iM % 2 == 0 ? -1 : 1);
            default:
                int iM2 = m();
                return ((iM2 + 1) / 2) * (iM2 % 2 == 0 ? -1 : 1);
        }
    }

    public void o(int i5, byte[] bArr) {
        switch (this.f5694a) {
            case 1:
                this.f5695b = bArr;
                this.f5696c = 0;
                this.f5697d = 0;
                this.f5698e = i5;
                break;
            default:
                this.f5695b = bArr;
                this.f5696c = 0;
                this.f5697d = 0;
                this.f5698e = i5;
                break;
        }
    }

    public void p(Q1.o oVar) {
        o(oVar.f9704c, oVar.f9702a);
        q(oVar.f9703b * 8);
    }

    public void q(int i5) {
        switch (this.f5694a) {
            case 1:
                int i10 = i5 / 8;
                this.f5696c = i10;
                this.f5697d = i5 - (i10 * 8);
                a();
                break;
            default:
                int i11 = i5 / 8;
                this.f5696c = i11;
                this.f5697d = i5 - (i11 * 8);
                a();
                break;
        }
    }

    public boolean r(int i5) {
        switch (this.f5694a) {
            case 3:
                if (2 <= i5 && i5 < this.f5696c) {
                    byte[] bArr = this.f5695b;
                    if (bArr[i5] != 3 || bArr[i5 - 2] != 0 || bArr[i5 - 1] != 0) {
                    }
                }
                break;
            default:
                if (2 <= i5 && i5 < this.f5696c) {
                    byte[] bArr2 = this.f5695b;
                    if (bArr2[i5] != 3 || bArr2[i5 - 2] != 0 || bArr2[i5 - 1] != 0) {
                    }
                }
                break;
        }
        return true;
    }

    public void s() {
        switch (this.f5694a) {
            case 1:
                int i5 = this.f5697d + 1;
                this.f5697d = i5;
                if (i5 == 8) {
                    this.f5697d = 0;
                    this.f5696c++;
                }
                a();
                break;
            case 3:
                int i10 = this.f5698e + 1;
                this.f5698e = i10;
                if (i10 == 8) {
                    this.f5698e = 0;
                    int i11 = this.f5697d;
                    this.f5697d = i11 + (r(i11 + 1) ? 2 : 1);
                }
                a();
                break;
            case 6:
                int i12 = this.f5697d + 1;
                this.f5697d = i12;
                if (i12 == 8) {
                    this.f5697d = 0;
                    this.f5696c++;
                }
                a();
                break;
            default:
                int i13 = this.f5698e + 1;
                this.f5698e = i13;
                if (i13 == 8) {
                    this.f5698e = 0;
                    int i14 = this.f5697d;
                    this.f5697d = i14 + (r(i14 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i5) {
        int i10;
        int i11;
        switch (this.f5694a) {
            case 0:
                int i12 = i5 / 8;
                int i13 = this.f5697d + i12;
                this.f5697d = i13;
                int i14 = (i5 - (i12 * 8)) + this.f5698e;
                this.f5698e = i14;
                boolean z2 = true;
                if (i14 > 7) {
                    this.f5697d = i13 + 1;
                    this.f5698e = i14 - 8;
                }
                int i15 = this.f5697d;
                if (i15 < 0 || (i15 >= (i10 = this.f5696c) && (i15 != i10 || this.f5698e != 0))) {
                    z2 = false;
                }
                AbstractC4256a.i(z2);
                break;
            case 1:
                int i16 = i5 / 8;
                int i17 = this.f5696c + i16;
                this.f5696c = i17;
                int i18 = (i5 - (i16 * 8)) + this.f5697d;
                this.f5697d = i18;
                if (i18 > 7) {
                    this.f5696c = i17 + 1;
                    this.f5697d = i18 - 8;
                }
                a();
                break;
            case 2:
            case 4:
            default:
                int i19 = this.f5697d;
                int i20 = i5 / 8;
                int i21 = i19 + i20;
                this.f5697d = i21;
                int i22 = (i5 - (i20 * 8)) + this.f5698e;
                this.f5698e = i22;
                if (i22 > 7) {
                    this.f5697d = i21 + 1;
                    this.f5698e = i22 - 8;
                }
                while (true) {
                    i19++;
                    if (i19 > this.f5697d) {
                        a();
                        break;
                    } else if (r(i19)) {
                        this.f5697d++;
                        i19 += 2;
                    }
                }
            case 3:
                int i23 = this.f5697d;
                int i24 = i5 / 8;
                int i25 = i23 + i24;
                this.f5697d = i25;
                int i26 = (i5 - (i24 * 8)) + this.f5698e;
                this.f5698e = i26;
                if (i26 > 7) {
                    this.f5697d = i25 + 1;
                    this.f5698e = i26 - 8;
                }
                while (true) {
                    i23++;
                    if (i23 > this.f5697d) {
                        a();
                        break;
                    } else if (r(i23)) {
                        this.f5697d++;
                        i23 += 2;
                    }
                }
            case 5:
                int i27 = i5 / 8;
                int i28 = this.f5697d + i27;
                this.f5697d = i28;
                int i29 = (i5 - (i27 * 8)) + this.f5698e;
                this.f5698e = i29;
                boolean z10 = true;
                if (i29 > 7) {
                    this.f5697d = i28 + 1;
                    this.f5698e = i29 - 8;
                }
                int i30 = this.f5697d;
                if (i30 < 0 || (i30 >= (i11 = this.f5696c) && (i30 != i11 || this.f5698e != 0))) {
                    z10 = false;
                }
                Q1.k.g(z10);
                break;
            case 6:
                int i31 = i5 / 8;
                int i32 = this.f5696c + i31;
                this.f5696c = i32;
                int i33 = (i5 - (i31 * 8)) + this.f5697d;
                this.f5697d = i33;
                if (i33 > 7) {
                    this.f5696c = i32 + 1;
                    this.f5697d = i33 - 8;
                }
                a();
                break;
        }
    }

    public void u(int i5) {
        switch (this.f5694a) {
            case 1:
                Q1.k.g(this.f5697d == 0);
                this.f5696c += i5;
                a();
                break;
            default:
                AbstractC4256a.i(this.f5697d == 0);
                this.f5696c += i5;
                a();
                break;
        }
    }

    public y(int i5) {
        this.f5694a = i5;
        switch (i5) {
            case 6:
                this.f5695b = u6.v.f46726f;
                break;
            default:
                this.f5695b = Q1.x.f9729f;
                break;
        }
    }

    public y(byte[] bArr, int i5) {
        this.f5694a = i5;
        switch (i5) {
            case 5:
                this.f5695b = bArr;
                this.f5696c = bArr.length;
                break;
            default:
                this.f5695b = bArr;
                this.f5696c = bArr.length;
                break;
        }
    }

    public y(int i5, byte[] bArr, int i10, int i11) {
        this.f5694a = i11;
        switch (i11) {
            case 7:
                this.f5695b = bArr;
                this.f5697d = i5;
                this.f5696c = i10;
                this.f5698e = 0;
                a();
                break;
            default:
                this.f5695b = bArr;
                this.f5697d = i5;
                this.f5696c = i10;
                this.f5698e = 0;
                a();
                break;
        }
    }

    public y(int i5, int i10, int i11) {
        this.f5694a = i11;
        switch (i11) {
            case 4:
                this.f5696c = i5;
                this.f5697d = i10;
                this.f5695b = new byte[(i10 * 2) - 1];
                this.f5698e = 0;
                break;
            default:
                this.f5696c = i5;
                this.f5697d = i10;
                this.f5695b = new byte[(i10 * 2) - 1];
                this.f5698e = 0;
                break;
        }
    }
}
