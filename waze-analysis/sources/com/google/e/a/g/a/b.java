package com.google.e.a.g.a;

import com.google.e.a.c.a.e;
import com.google.e.a.d.a.d;
import com.google.e.a.j.aj;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements com.google.e.a.g.c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f8539a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final SecretKey f8540b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8541c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f8542d;

    private b(byte[] bArr) throws GeneralSecurityException {
        aj.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f8540b = secretKeySpec;
        Cipher cipherC = c();
        cipherC.init(1, secretKeySpec);
        byte[] bArrC = e.c(cipherC.doFinal(new byte[16]));
        this.f8541c = bArrC;
        this.f8542d = e.c(bArrC);
    }

    public static com.google.e.a.g.c b(com.google.e.a.g.a aVar) {
        return new b(aVar.g().e());
    }

    private static Cipher c() throws GeneralSecurityException {
        if (com.google.e.a.b.a.a.a(1)) {
            return (Cipher) f8539a.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void d(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3) {
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3 + i2]);
        }
    }

    @Override // com.google.e.a.g.c
    public final byte[] a(byte[] bArr, int i2) throws GeneralSecurityException {
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.f8540b;
        Cipher cipherC = c();
        cipherC.init(1, secretKey);
        int length = bArr.length;
        int i3 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i4 = i3 - 1;
        int i5 = i4 * 16;
        byte[] bArrF = i3 * 16 == length ? d.f(bArr, i5, this.f8541c, 16) : d.e(e.b(Arrays.copyOfRange(bArr, i5, length)), this.f8542d);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i6 = 0; i6 < i4; i6++) {
            d(bArr2, bArr, i6 * 16, bArr3);
            if (cipherC.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        d(bArr2, bArrF, 0, bArr3);
        if (cipherC.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i2 == 16 ? bArr2 : Arrays.copyOf(bArr2, i2);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
