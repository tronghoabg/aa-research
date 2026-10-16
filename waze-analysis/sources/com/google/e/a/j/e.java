package com.google.e.a.j;

import com.google.e.a.e.al;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements y {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f8707a = new d();

    /* renamed from: b, reason: collision with root package name */
    private final SecretKeySpec f8708b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8709c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8710d;

    public e(byte[] bArr, int i2) throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        aj.a(bArr.length);
        this.f8708b = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f8707a.get()).getBlockSize();
        this.f8710d = blockSize;
        if (i2 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f8709c = i2;
    }

    private final void c(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f8707a.get();
        int i5 = this.f8709c;
        byte[] bArr4 = new byte[this.f8710d];
        System.arraycopy(bArr3, 0, bArr4, 0, i5);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f8708b;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i2, i3, bArr2, i4) != i3) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // com.google.e.a.j.y
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.f8709c;
        if (length < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        int i3 = length - i2;
        byte[] bArr3 = new byte[i3];
        c(bArr, i2, i3, bArr3, 0, bArr2, false);
        return bArr3;
    }

    @Override // com.google.e.a.j.y
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        int i2 = this.f8709c;
        int length = bArr.length;
        int i3 = Integer.MAX_VALUE - i2;
        if (length > i3) {
            throw new GeneralSecurityException("plaintext length can not exceed " + i3);
        }
        byte[] bArr2 = new byte[i2 + length];
        byte[] bArrB = al.b(i2);
        System.arraycopy(bArrB, 0, bArr2, 0, i2);
        c(bArr, 0, length, bArr2, i2, bArrB, true);
        return bArr2;
    }
}
