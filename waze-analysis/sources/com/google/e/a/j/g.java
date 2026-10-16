package com.google.e.a.j;

import com.google.e.a.e.al;
import com.google.e.a.e.ar;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f8711a = new f();

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f8712b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.e.a.g.c f8713c;

    /* renamed from: d, reason: collision with root package name */
    private final SecretKeySpec f8714d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8715e;

    private g(byte[] bArr, int i2, byte[] bArr2) throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i2 != 12 && i2 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f8715e = i2;
        int length = bArr.length;
        aj.a(length);
        this.f8714d = new SecretKeySpec(bArr, "AES");
        this.f8713c = ab.b(com.google.e.a.g.a.f(com.google.e.a.g.b.g(length), com.google.android.libraries.phenotype.client.stable.p.g(bArr)));
        this.f8712b = bArr2;
    }

    public static com.google.e.a.a c(com.google.e.a.a.k kVar) throws GeneralSecurityException {
        if (com.google.e.a.b.a.a.a(1)) {
            return new g(kVar.h().e(), kVar.g().f(), kVar.f().c());
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private final byte[] d(int i2, byte[] bArr, int i3, int i4) {
        byte[] bArr2 = new byte[i4 + 16];
        bArr2[15] = (byte) i2;
        System.arraycopy(bArr, i3, bArr2, 16, i4);
        return this.f8713c.a(bArr2, 16);
    }

    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f8712b;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i2 = this.f8715e;
        int i3 = ((length - length2) - i2) - 16;
        if (i3 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ar.a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrD = d(0, bArr, length2, i2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrD2 = d(1, bArr2, 0, bArr2.length);
        byte[] bArrD3 = d(2, bArr, length2 + i2, i3);
        int i4 = length - 16;
        byte b2 = 0;
        for (int i5 = 0; i5 < 16; i5++) {
            b2 = (byte) (b2 | (((bArr[i4 + i5] ^ bArrD2[i5]) ^ bArrD[i5]) ^ bArrD3[i5]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f8711a.get();
        cipher.init(1, this.f8714d, new IvParameterSpec(bArrD));
        return cipher.doFinal(bArr, bArr3.length + i2, i3);
    }

    @Override // com.google.e.a.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f8712b;
        int length = bArr3.length;
        int i2 = this.f8715e;
        int length2 = bArr.length;
        if (length2 > ((Integer.MAX_VALUE - length) - i2) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i3 = length + i2;
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, i3 + length2 + 16);
        byte[] bArrB = al.b(i2);
        System.arraycopy(bArrB, 0, bArrCopyOf, length, i2);
        byte[] bArrD = d(0, bArrB, 0, bArrB.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrD2 = d(1, bArr2, 0, bArr2.length);
        Cipher cipher = (Cipher) f8711a.get();
        cipher.init(1, this.f8714d, new IvParameterSpec(bArrD));
        cipher.doFinal(bArr, 0, length2, bArrCopyOf, i3);
        byte[] bArrD3 = d(2, bArrCopyOf, i3, length2);
        int i4 = length + length2 + i2;
        for (int i5 = 0; i5 < 16; i5++) {
            bArrCopyOf[i4 + i5] = (byte) ((bArrD2[i5] ^ bArrD[i5]) ^ bArrD3[i5]);
        }
        return bArrCopyOf;
    }
}
