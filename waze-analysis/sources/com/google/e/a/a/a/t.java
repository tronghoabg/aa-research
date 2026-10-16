package com.google.e.a.a.a;

import com.google.e.a.a.ax;
import com.google.e.a.e.al;
import com.google.e.a.e.ar;
import com.google.e.a.j.ab;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8143a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8144b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.e.a.g.c f8145c;

    private t(byte[] bArr, com.google.e.a.k.a aVar, int i2) {
        this.f8145c = ab.b(com.google.e.a.g.a.f(com.google.e.a.g.b.g(bArr.length), com.google.android.libraries.phenotype.client.stable.p.g(bArr)));
        this.f8143a = aVar.c();
        this.f8144b = i2;
    }

    public static com.google.e.a.a c(ax axVar) {
        return new t(axVar.i().e(), axVar.f(), axVar.g().f());
    }

    private final byte[] d(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length = bArr.length;
        if (length > 12 || length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, length);
        System.arraycopy(bArr, 0, bArr3, 4, length);
        com.google.e.a.g.c cVar = this.f8145c;
        byte[] bArr4 = new byte[32];
        System.arraycopy(cVar.a(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(cVar.a(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }

    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f8143a;
        int i2 = this.f8144b;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i3 = i2 + length2;
        if (length < i3 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ar.a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrD = d(Arrays.copyOfRange(bArr, length2, i3));
        if (!com.google.e.a.b.a.a.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyD = d.d(bArrD);
        int i4 = i3 + 12;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, i4);
        if (bArrCopyOfRange.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i3 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = d.a(bArrCopyOfRange);
        Cipher cipherC = d.c();
        cipherC.init(2, secretKeyD, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherC.updateAAD(bArr2);
        }
        return cipherC.doFinal(bArr, i4, length - i4);
    }

    @Override // com.google.e.a.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        int i2 = this.f8144b;
        int i3 = i2 + 12;
        byte[] bArrB = al.b(i3);
        byte[] bArrCopyOf = Arrays.copyOf(bArrB, i2);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrB, i2, i3);
        byte[] bArrD = d(bArrCopyOf);
        if (!com.google.e.a.b.a.a.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyD = d.d(bArrD);
        byte[] bArr3 = this.f8143a;
        int length = bArr3.length;
        int length2 = bArrCopyOfRange.length;
        int i4 = i2 + length + length2;
        if (length2 != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = d.a(bArrCopyOfRange);
        Cipher cipherC = d.c();
        cipherC.init(1, secretKeyD, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherC.updateAAD(bArr2);
        }
        int length3 = bArr.length;
        int outputSize = cipherC.getOutputSize(length3);
        if (outputSize > Integer.MAX_VALUE - i4) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i4 + outputSize];
        if (cipherC.doFinal(bArr, 0, length3, bArr4, i4) != outputSize) {
            throw new GeneralSecurityException("not enough data written");
        }
        System.arraycopy(bArr3, 0, bArr4, 0, length);
        System.arraycopy(bArrB, 0, bArr4, length, bArrB.length);
        return bArr4;
    }
}
