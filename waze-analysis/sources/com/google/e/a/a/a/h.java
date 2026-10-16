package com.google.e.a.a.a;

import com.google.e.a.a.aa;
import com.google.e.a.e.al;
import com.google.e.a.e.ar;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f8124a = com.google.e.a.f.a.e.c("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f8125b = com.google.e.a.f.a.e.c("070000004041424344454647");

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f8126c = com.google.e.a.f.a.e.c("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: d, reason: collision with root package name */
    private final SecretKey f8127d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f8128e;

    /* renamed from: f, reason: collision with root package name */
    private final Provider f8129f;

    private h(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f8127d = new SecretKeySpec(bArr, "ChaCha20");
        this.f8128e = bArr2;
        this.f8129f = provider;
    }

    public static com.google.e.a.a c(aa aaVar) throws GeneralSecurityException {
        return new h(aaVar.i().e(), aaVar.f().c(), e().getProvider());
    }

    static Cipher d(Provider provider) {
        return Cipher.getInstance("ChaCha20-Poly1305", provider);
    }

    static Cipher e() throws GeneralSecurityException {
        Cipher cipher = (Cipher) com.google.e.a.j.v.f8758a.a("ChaCha20-Poly1305");
        if (g(cipher)) {
            return cipher;
        }
        throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    public static boolean f() {
        try {
            e();
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    private static boolean g(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f8125b);
            byte[] bArr = f8124a;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f8126c;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f8128e;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ar.a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, length2, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Provider provider = this.f8129f;
        SecretKey secretKey = this.f8127d;
        Cipher cipherD = d(provider);
        cipherD.init(2, secretKey, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        return cipherD.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }

    @Override // com.google.e.a.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrB = al.b(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrB);
        Provider provider = this.f8129f;
        SecretKey secretKey = this.f8127d;
        Cipher cipherD = d(provider);
        cipherD.init(1, secretKey, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        int length = bArr.length;
        int outputSize = cipherD.getOutputSize(length);
        byte[] bArr3 = this.f8128e;
        int length2 = bArr3.length;
        if (outputSize > 2147483635 - length2) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i2 = length2 + 12;
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, i2 + outputSize);
        System.arraycopy(bArrB, 0, bArrCopyOf, length2, 12);
        if (cipherD.doFinal(bArr, 0, length, bArrCopyOf, i2) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
