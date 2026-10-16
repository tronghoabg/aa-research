package q9;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[][] f44180c = {new byte[]{0, 0}, new byte[]{-128, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, -128}, new byte[]{-1, -64}};

    /* renamed from: a, reason: collision with root package name */
    public byte[] f44181a;

    /* renamed from: b, reason: collision with root package name */
    public int f44182b;

    public final void a(int i5) {
        int i10 = i5 + this.f44182b;
        byte[] bArr = this.f44181a;
        if (i10 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i10) {
            i10 = length;
        }
        this.f44181a = Arrays.copyOf(bArr, i10);
    }

    public final void b(byte b5) {
        if (b5 == 0) {
            d((byte) 0);
            d((byte) -1);
        } else if (b5 != -1) {
            d(b5);
        } else {
            d((byte) -1);
            d((byte) 0);
        }
    }

    public final void c(byte b5) {
        if (b5 == 0) {
            e((byte) 0);
            e((byte) -1);
        } else if (b5 != -1) {
            e(b5);
        } else {
            e((byte) -1);
            e((byte) 0);
        }
    }

    public final void d(byte b5) {
        a(1);
        byte[] bArr = this.f44181a;
        int i5 = this.f44182b;
        this.f44182b = i5 + 1;
        bArr[i5] = b5;
    }

    public final void e(byte b5) {
        a(1);
        byte[] bArr = this.f44181a;
        int i5 = this.f44182b;
        this.f44182b = i5 + 1;
        bArr[i5] = (byte) (~b5);
    }

    public final void f(long j8) {
        int i5;
        long j10 = j8 < 0 ? ~j8 : j8;
        byte[][] bArr = f44180c;
        if (j10 < 64) {
            a(1);
            byte[] bArr2 = this.f44181a;
            int i10 = this.f44182b;
            this.f44182b = i10 + 1;
            bArr2[i10] = (byte) (j8 ^ bArr[1][0]);
            return;
        }
        if (j10 < 0) {
            j10 = ~j10;
        }
        int iNumberOfLeadingZeros = 65 - Long.numberOfLeadingZeros(j10);
        RoundingMode roundingMode = RoundingMode.UP;
        int iR = A6.c.r(iNumberOfLeadingZeros, 7);
        a(iR);
        if (iR < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(iR)));
        }
        byte b5 = j8 < 0 ? (byte) -1 : (byte) 0;
        int i11 = this.f44182b;
        if (iR == 10) {
            i5 = 2 + i11;
            byte[] bArr3 = this.f44181a;
            bArr3[i11] = b5;
            bArr3[i11 + 1] = b5;
        } else if (iR == 9) {
            i5 = i11 + 1;
            this.f44181a[i11] = b5;
        } else {
            i5 = i11;
        }
        for (int i12 = (iR - 1) + i11; i12 >= i5; i12--) {
            this.f44181a[i12] = (byte) (255 & j8);
            j8 >>= 8;
        }
        byte[] bArr4 = this.f44181a;
        int i13 = this.f44182b;
        byte b10 = bArr4[i13];
        byte[] bArr5 = bArr[iR];
        bArr4[i13] = (byte) (b10 ^ bArr5[0]);
        int i14 = i13 + 1;
        bArr4[i14] = (byte) (bArr5[1] ^ bArr4[i14]);
        this.f44182b = i13 + iR;
    }
}
