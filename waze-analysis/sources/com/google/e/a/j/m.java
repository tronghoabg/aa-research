package com.google.e.a.j;

import com.google.e.a.e.ar;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m implements com.google.e.a.d, com.google.e.a.c.b.a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f8733a = new byte[16];

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f8734b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f8735c = new l();

    /* renamed from: d, reason: collision with root package name */
    private final com.google.e.a.g.c f8736d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f8737e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f8738f;

    private m(byte[] bArr, com.google.e.a.k.a aVar) throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        int length = bArr.length;
        if (length != 32 && length != 64) {
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 32 or 64 bytes");
        }
        int i2 = length >> 1;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i2);
        this.f8737e = Arrays.copyOfRange(bArr, i2, length);
        this.f8736d = ab.b(com.google.e.a.g.a.f(com.google.e.a.g.b.g(bArrCopyOfRange.length), com.google.android.libraries.phenotype.client.stable.p.g(bArrCopyOfRange)));
        this.f8738f = aVar.c();
    }

    public static com.google.e.a.c.b.a c(com.google.e.a.c.b bVar) {
        return new m(bVar.i().e(), bVar.h());
    }

    private final byte[] d(byte[]... bArr) {
        int length;
        byte[] bArrE;
        int length2 = bArr.length;
        com.google.e.a.g.c cVar = this.f8736d;
        if (length2 == 0) {
            return cVar.a(f8734b, 16);
        }
        byte[] bArrA = cVar.a(f8733a, 16);
        int i2 = 0;
        while (true) {
            length = bArr.length - 1;
            if (i2 >= length) {
                break;
            }
            byte[] bArr2 = bArr[i2];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = com.google.e.a.d.a.d.e(com.google.e.a.c.a.e.c(bArrA), cVar.a(bArr2, 16));
            i2++;
        }
        byte[] bArr3 = bArr[length];
        int length3 = bArr3.length;
        if (length3 >= 16) {
            int length4 = bArrA.length;
            if (length3 < length4) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            bArrE = Arrays.copyOf(bArr3, length3);
            for (int i3 = 0; i3 < bArrA.length; i3++) {
                int i4 = (length3 - length4) + i3;
                bArrE[i4] = (byte) (bArrE[i4] ^ bArrA[i3]);
            }
        } else {
            bArrE = com.google.e.a.d.a.d.e(com.google.e.a.c.a.e.b(bArr3), com.google.e.a.c.a.e.c(bArrA));
        }
        return cVar.a(bArrE, 16);
    }

    @Override // com.google.e.a.d
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[][] bArr3 = {bArr2};
        byte[] bArr4 = this.f8738f;
        int length = bArr4.length;
        int length2 = bArr.length;
        int i2 = length + 16;
        if (length2 < i2) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        if (!ar.a(bArr4, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) f8735c.get();
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length, i2);
        byte[] bArr5 = (byte[]) bArrCopyOfRange.clone();
        bArr5[8] = (byte) (bArr5[8] & 127);
        bArr5[12] = (byte) (bArr5[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f8737e, "AES"), new IvParameterSpec(bArr5));
        int i3 = length2 - i2;
        byte[] bArrDoFinal = cipher.doFinal(bArr, i2, i3);
        if (i3 == 0 && bArrDoFinal == null && com.google.firebase.a.b()) {
            bArrDoFinal = new byte[0];
        }
        byte[][] bArr6 = (byte[][]) Arrays.copyOf(bArr3, 2);
        bArr6[1] = bArrDoFinal;
        if (MessageDigest.isEqual(bArrCopyOfRange, d(bArr6))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // com.google.e.a.d
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[][] bArr3 = {bArr2};
        byte[] bArr4 = this.f8738f;
        int length = bArr4.length;
        int length2 = bArr.length;
        if (length2 > 2147483631 - length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) f8735c.get();
        byte[][] bArr5 = (byte[][]) Arrays.copyOf(bArr3, 2);
        bArr5[1] = bArr;
        byte[] bArrD = d(bArr5);
        byte[] bArr6 = (byte[]) bArrD.clone();
        bArr6[8] = (byte) (bArr6[8] & 127);
        bArr6[12] = (byte) (bArr6[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f8737e, "AES"), new IvParameterSpec(bArr6));
        int length3 = bArrD.length;
        int i2 = length + length3;
        byte[] bArrCopyOf = Arrays.copyOf(bArr4, i2 + length2);
        System.arraycopy(bArrD, 0, bArrCopyOf, length, length3);
        if (cipher.doFinal(bArr, 0, length2, bArrCopyOf, i2) == length2) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
