package defpackage;

import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public final class ajos extends ajou {
    public static final /* synthetic */ int a = 0;
    private static final byte[] c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private final byte[] e;
    private final byte[] f;

    public ajos(byte[] bArr) {
        byte[] bArr2 = c;
        this.f = d;
        this.e = bArr2;
        byte[] bArr3 = (byte[]) bArr.clone();
        if (bArr3 != null) {
            for (byte b : bArr3) {
                if (b != 61) {
                    if (b >= 0) {
                        byte[] bArr4 = this.f;
                        if (b >= 123 || bArr4[b] == -1) {
                        }
                    }
                }
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + new String(bArr3, StandardCharsets.UTF_8) + "]");
            }
        }
    }

    @Override // defpackage.ajou
    public final void a(byte[] bArr, int i, ajot ajotVar) {
        byte b;
        if (ajotVar.e) {
            return;
        }
        int i2 = 0;
        if (i < 0) {
            ajotVar.e = true;
        }
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            byte[] bArrD = d(3, ajotVar);
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 == 61) {
                ajotVar.e = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = this.f;
                if (b2 < 123 && (b = bArr2[b2]) >= 0) {
                    int i5 = (ajotVar.g + 1) & 3;
                    ajotVar.g = i5;
                    int i6 = (ajotVar.a << 6) + b;
                    ajotVar.a = i6;
                    if (i5 == 0) {
                        int i7 = ajotVar.c;
                        int i8 = i7 + 1;
                        ajotVar.c = i8;
                        bArrD[i7] = (byte) ((i6 >> 16) & 255);
                        int i9 = i7 + 2;
                        ajotVar.c = i9;
                        bArrD[i8] = (byte) ((i6 >> 8) & 255);
                        ajotVar.c = i7 + 3;
                        bArrD[i9] = (byte) (i6 & 255);
                    }
                }
            }
            i2++;
            i3 = i4;
        }
        if (!ajotVar.e || ajotVar.g == 0) {
            return;
        }
        byte[] bArrD2 = d(3, ajotVar);
        int i10 = ajotVar.g;
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = ajotVar.a >> 4;
                ajotVar.a = i11;
                int i12 = ajotVar.c;
                ajotVar.c = i12 + 1;
                bArrD2[i12] = (byte) (i11 & 255);
                return;
            }
            if (i10 != 3) {
                throw new IllegalStateException(a.bp(i10, "Impossible modulus "));
            }
            int i13 = ajotVar.a;
            int i14 = i13 >> 2;
            ajotVar.a = i14;
            int i15 = ajotVar.c;
            int i16 = i15 + 1;
            ajotVar.c = i16;
            bArrD2[i15] = (byte) ((i13 >> 10) & 255);
            ajotVar.c = i15 + 2;
            bArrD2[i16] = (byte) (i14 & 255);
        }
    }

    @Override // defpackage.ajou
    public final void b(byte[] bArr, int i, ajot ajotVar) {
        int i2;
        if (ajotVar.e) {
            return;
        }
        if (i >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                byte[] bArrD = d(4, ajotVar);
                int i5 = (ajotVar.g + 1) % 3;
                ajotVar.g = i5;
                int i6 = i4 + 1;
                int i7 = bArr[i4];
                if (i7 < 0) {
                    i7 += 256;
                }
                int i8 = (ajotVar.a << 8) + i7;
                ajotVar.a = i8;
                if (i5 == 0) {
                    int i9 = ajotVar.c;
                    int i10 = i9 + 1;
                    ajotVar.c = i10;
                    byte[] bArr2 = this.e;
                    bArrD[i9] = bArr2[(i8 >> 18) & 63];
                    int i11 = i9 + 2;
                    ajotVar.c = i11;
                    bArrD[i10] = bArr2[(i8 >> 12) & 63];
                    int i12 = i9 + 3;
                    ajotVar.c = i12;
                    bArrD[i11] = bArr2[(i8 >> 6) & 63];
                    ajotVar.c = i9 + 4;
                    bArrD[i12] = bArr2[i8 & 63];
                    ajotVar.f += 4;
                }
                i3++;
                i4 = i6;
            }
            return;
        }
        ajotVar.e = true;
        if (ajotVar.g != 0) {
            byte[] bArrD2 = d(4, ajotVar);
            int i13 = ajotVar.c;
            int i14 = ajotVar.g;
            if (i14 == 0) {
                i2 = i13;
            } else if (i14 == 1) {
                int i15 = i13 + 1;
                i2 = i13 + 2;
                ajotVar.c = i15;
                byte[] bArr3 = this.e;
                int i16 = ajotVar.a;
                bArrD2[i13] = bArr3[(i16 >> 2) & 63];
                ajotVar.c = i2;
                bArrD2[i15] = bArr3[(i16 << 4) & 63];
                if (bArr3 == c) {
                    int i17 = i13 + 3;
                    int i18 = i13 + 4;
                    ajotVar.c = i17;
                    bArrD2[i2] = 61;
                    ajotVar.c = i18;
                    bArrD2[i17] = 61;
                    i2 = i18;
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException(a.bp(i14, "Impossible modulus "));
                }
                int i19 = i13 + 1;
                int i20 = i13 + 2;
                i2 = i13 + 3;
                ajotVar.c = i19;
                byte[] bArr4 = this.e;
                int i21 = ajotVar.a;
                bArrD2[i13] = bArr4[(i21 >> 10) & 63];
                ajotVar.c = i20;
                bArrD2[i19] = bArr4[(i21 >> 4) & 63];
                ajotVar.c = i2;
                bArrD2[i20] = bArr4[(i21 << 2) & 63];
                if (bArr4 == c) {
                    int i22 = i13 + 4;
                    ajotVar.c = i22;
                    bArrD2[i2] = 61;
                    i2 = i22;
                }
            }
            ajotVar.f += i2 - i13;
        }
    }

    public ajos() {
        this(b);
    }
}
