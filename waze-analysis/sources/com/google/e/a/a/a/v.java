package com.google.e.a.a.a;

import com.google.e.a.a.bb;
import com.google.e.a.e.al;
import com.google.e.a.e.ar;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8150a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f8151b;

    /* renamed from: c, reason: collision with root package name */
    private final Provider f8152c;

    private v(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f8150a = bArr;
        this.f8151b = bArr2;
        this.f8152c = provider;
    }

    public static com.google.e.a.a c(bb bbVar) throws GeneralSecurityException {
        return new v(bbVar.i().e(), bbVar.f().c(), h.e().getProvider());
    }

    static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 16, bArr2, 4, 8);
        return bArr2;
    }

    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f8151b;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ar.a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, length2, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(j.d(this.f8150a, bArr4), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d(bArr4));
        Cipher cipherD = h.d(this.f8152c);
        cipherD.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        return cipherD.doFinal(bArr, length2 + 24, (length - length2) - 24);
    }

    @Override // com.google.e.a.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArr3 = this.f8150a;
        byte[] bArrB = al.b(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(j.d(bArr3, bArrB), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d(bArrB));
        Cipher cipherD = h.d(this.f8152c);
        cipherD.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        int length = bArr.length;
        int outputSize = cipherD.getOutputSize(length);
        byte[] bArr4 = this.f8151b;
        int length2 = bArr4.length;
        if (outputSize > 2147483623 - length2) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i2 = length2 + 24;
        byte[] bArrCopyOf = Arrays.copyOf(bArr4, i2 + outputSize);
        System.arraycopy(bArrB, 0, bArrCopyOf, length2, 24);
        if (cipherD.doFinal(bArr, 0, length, bArrCopyOf, i2) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
