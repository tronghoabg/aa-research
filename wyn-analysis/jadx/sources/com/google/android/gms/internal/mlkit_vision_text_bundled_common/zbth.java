package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zbth extends zbtk {
    private final byte[] zbb;
    private final int zbc;
    private int zbd;

    public zbth(byte[] bArr, int i5, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.zbb = bArr;
        this.zbd = 0;
        this.zbc = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final int zba() {
        return this.zbc - this.zbd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbb(byte b5) throws IOException {
        try {
            byte[] bArr = this.zbb;
            int i5 = this.zbd;
            this.zbd = i5 + 1;
            bArr[i5] = b5;
        } catch (IndexOutOfBoundsException e7) {
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e7);
        }
    }

    public final void zbc(byte[] bArr, int i5, int i10) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zbb, this.zbd, i10);
            this.zbd += i10;
        } catch (IndexOutOfBoundsException e7) {
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), Integer.valueOf(i10)), e7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbd(int i5, boolean z2) throws IOException {
        zbw(i5 << 3);
        zbb(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbe(byte[] bArr, int i5, int i10) throws IOException {
        zbw(i10);
        zbc(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbf(int i5, zbtc zbtcVar) throws IOException {
        zbw((i5 << 3) | 2);
        zbg(zbtcVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbg(zbtc zbtcVar) throws IOException {
        zbw(zbtcVar.zbd());
        zbtcVar.zbg(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbh(int i5, int i10) throws IOException {
        zbw((i5 << 3) | 5);
        zbi(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbi(int i5) throws IOException {
        try {
            byte[] bArr = this.zbb;
            int i10 = this.zbd;
            int i11 = i10 + 1;
            this.zbd = i11;
            bArr[i10] = (byte) (i5 & 255);
            int i12 = i10 + 2;
            this.zbd = i12;
            bArr[i11] = (byte) ((i5 >> 8) & 255);
            int i13 = i10 + 3;
            this.zbd = i13;
            bArr[i12] = (byte) ((i5 >> 16) & 255);
            this.zbd = i10 + 4;
            bArr[i13] = (byte) ((i5 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbj(int i5, long j8) throws IOException {
        zbw((i5 << 3) | 1);
        zbk(j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbk(long j8) throws IOException {
        try {
            byte[] bArr = this.zbb;
            int i5 = this.zbd;
            int i10 = i5 + 1;
            this.zbd = i10;
            bArr[i5] = (byte) (((int) j8) & 255);
            int i11 = i5 + 2;
            this.zbd = i11;
            bArr[i10] = (byte) (((int) (j8 >> 8)) & 255);
            int i12 = i5 + 3;
            this.zbd = i12;
            bArr[i11] = (byte) (((int) (j8 >> 16)) & 255);
            int i13 = i5 + 4;
            this.zbd = i13;
            bArr[i12] = (byte) (((int) (j8 >> 24)) & 255);
            int i14 = i5 + 5;
            this.zbd = i14;
            bArr[i13] = (byte) (((int) (j8 >> 32)) & 255);
            int i15 = i5 + 6;
            this.zbd = i15;
            bArr[i14] = (byte) (((int) (j8 >> 40)) & 255);
            int i16 = i5 + 7;
            this.zbd = i16;
            bArr[i15] = (byte) (((int) (j8 >> 48)) & 255);
            this.zbd = i5 + 8;
            bArr[i16] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbl(int i5, int i10) throws IOException {
        zbw(i5 << 3);
        zbm(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbm(int i5) throws IOException {
        if (i5 >= 0) {
            zbw(i5);
        } else {
            zby(i5);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbn(byte[] bArr, int i5, int i10) throws IOException {
        zbc(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbo(int i5, zbvm zbvmVar, zbvx zbvxVar) throws IOException {
        zbw((i5 << 3) | 2);
        zbw(((zbsj) zbvmVar).zbj(zbvxVar));
        zbvxVar.zbi(zbvmVar, this.zba);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbp(zbvm zbvmVar) throws IOException {
        zbw(zbvmVar.zbo());
        zbvmVar.zbL(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbq(int i5, zbvm zbvmVar) throws IOException {
        zbw(11);
        zbv(2, i5);
        zbw(26);
        zbp(zbvmVar);
        zbw(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbr(int i5, zbtc zbtcVar) throws IOException {
        zbw(11);
        zbv(2, i5);
        zbf(3, zbtcVar);
        zbw(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbs(int i5, String str) throws IOException {
        zbw((i5 << 3) | 2);
        zbt(str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbt(String str) throws IOException {
        int i5 = this.zbd;
        try {
            int iZbD = zbtk.zbD(str.length() * 3);
            int iZbD2 = zbtk.zbD(str.length());
            if (iZbD2 != iZbD) {
                zbw(zbwv.zbc(str));
                byte[] bArr = this.zbb;
                int i10 = this.zbd;
                this.zbd = zbwv.zbb(str, bArr, i10, this.zbc - i10);
                return;
            }
            int i11 = i5 + iZbD2;
            this.zbd = i11;
            int iZbb = zbwv.zbb(str, this.zbb, i11, this.zbc - i11);
            this.zbd = i5;
            zbw((iZbb - i5) - iZbD2);
            this.zbd = iZbb;
        } catch (zbwu e7) {
            this.zbd = i5;
            zbG(str, e7);
        } catch (IndexOutOfBoundsException e10) {
            throw new zbti(e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbu(int i5, int i10) throws IOException {
        zbw((i5 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbv(int i5, int i10) throws IOException {
        zbw(i5 << 3);
        zbw(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbw(int i5) throws IOException {
        while ((i5 & (-128)) != 0) {
            try {
                byte[] bArr = this.zbb;
                int i10 = this.zbd;
                this.zbd = i10 + 1;
                bArr[i10] = (byte) ((i5 | 128) & 255);
                i5 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e7);
            }
        }
        byte[] bArr2 = this.zbb;
        int i11 = this.zbd;
        this.zbd = i11 + 1;
        bArr2[i11] = (byte) i5;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbx(int i5, long j8) throws IOException {
        zbw(i5 << 3);
        zby(j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zby(long j8) throws IOException {
        if (!zbtk.zbc || this.zbc - this.zbd < 10) {
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zbb;
                    int i5 = this.zbd;
                    this.zbd = i5 + 1;
                    bArr[i5] = (byte) ((((int) j8) | 128) & 255);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e7);
                }
            }
            byte[] bArr2 = this.zbb;
            int i10 = this.zbd;
            this.zbd = i10 + 1;
            bArr2[i10] = (byte) j8;
            return;
        }
        while (true) {
            int i11 = (int) j8;
            if ((j8 & (-128)) == 0) {
                byte[] bArr3 = this.zbb;
                int i12 = this.zbd;
                this.zbd = 1 + i12;
                zbws.zbn(bArr3, i12, (byte) i11);
                return;
            }
            byte[] bArr4 = this.zbb;
            int i13 = this.zbd;
            this.zbd = i13 + 1;
            zbws.zbn(bArr4, i13, (byte) ((i11 | 128) & 255));
            j8 >>>= 7;
        }
    }
}
