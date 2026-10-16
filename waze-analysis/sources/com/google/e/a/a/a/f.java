package com.google.e.a.a.a;

import com.google.e.a.e.al;
import com.google.e.a.e.ar;
import com.google.e.a.j.aj;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f8113a = com.google.e.a.f.a.e.c("7a806c");

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f8114b = com.google.e.a.f.a.e.c("46bb91c3c5");

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f8115c = com.google.e.a.f.a.e.c("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f8116d = com.google.e.a.f.a.e.c("bae8e37fc83441b16034566b");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f8117e = com.google.e.a.f.a.e.c("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: f, reason: collision with root package name */
    private final SecretKey f8118f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f8119g;

    private f(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.f8119g = bArr2;
        aj.a(bArr.length);
        this.f8118f = new SecretKeySpec(bArr, "AES");
    }

    public static boolean c(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            cipher.init(2, new SecretKeySpec(f8115c, "AES"), e(f8116d));
            cipher.updateAAD(f8114b);
            byte[] bArr = f8117e;
            return MessageDigest.isEqual(cipher.doFinal(bArr, 0, bArr.length), f8113a);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static com.google.e.a.a d(com.google.e.a.a.v vVar) {
        if (c(com.google.e.a.a.b.b.c())) {
            return new f(vVar.i().e(), vVar.f().c());
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    private static AlgorithmParameterSpec e(byte[] bArr) {
        return new GCMParameterSpec(128, bArr, 0, bArr.length);
    }

    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f8119g;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ar.a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipherC = com.google.e.a.a.b.b.c();
        cipherC.init(2, this.f8118f, new GCMParameterSpec(128, bArr, length2, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherC.updateAAD(bArr2);
        }
        return cipherC.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }

    @Override // com.google.e.a.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherC = com.google.e.a.a.b.b.c();
        int length = bArr.length;
        byte[] bArr3 = this.f8119g;
        int length2 = bArr3.length;
        if (length > 2147483619 - length2) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i2 = length2 + 12;
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, i2 + length + 16);
        byte[] bArrB = al.b(12);
        System.arraycopy(bArrB, 0, bArrCopyOf, length2, 12);
        cipherC.init(1, this.f8118f, e(bArrB));
        if (bArr2 != null && bArr2.length != 0) {
            cipherC.updateAAD(bArr2);
        }
        int iDoFinal = cipherC.doFinal(bArr, 0, length, bArrCopyOf, i2);
        if (iDoFinal == length + 16) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException(String.format("encryption failed; AES-GCM-SIV tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}
