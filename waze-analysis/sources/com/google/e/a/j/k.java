package com.google.e.a.j;

import com.google.e.a.e.al;
import com.google.e.a.e.ar;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8730a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f8731b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8732c;

    private k(byte[] bArr, com.google.e.a.k.a aVar, int i2) throws GeneralSecurityException {
        this.f8731b = i2;
        if (!com.google.e.a.b.a.a.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f8732c = com.google.e.a.a.a.d.d(bArr);
        this.f8730a = aVar.c();
    }

    public static com.google.e.a.a c(com.google.e.a.a.p pVar) {
        return new k(pVar.h().e(), pVar.f(), 0);
    }

    public static com.google.e.a.a d(com.google.e.a.e.i iVar) {
        com.waze.car_lib.r.ai aiVarG = iVar.g();
        return new k((com.google.e.a.a) com.google.e.a.e.c.a().c(aiVarG.h(), com.google.e.a.a.class).a(aiVarG.f()), com.google.e.a.b.a.a.f(aiVarG.e(), iVar.b()).c(), 1);
    }

    public static com.google.e.a.a e(com.google.e.a.a aVar, com.google.e.a.k.a aVar2) {
        return new k(aVar, aVar2.c(), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.google.e.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.security.Key] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.google.e.a.a, java.lang.Object] */
    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.f8731b != 0) {
            byte[] bArr3 = this.f8730a;
            if (bArr3.length == 0) {
                return this.f8732c.a(bArr, bArr2);
            }
            if (ar.a(bArr3, bArr)) {
                return this.f8732c.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
            }
            throw new GeneralSecurityException("wrong prefix");
        }
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr4 = this.f8730a;
        int length = bArr.length;
        int length2 = bArr4.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ar.a(bArr4, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecB = com.google.e.a.a.a.d.b(bArr, length2, 12);
        ?? r5 = this.f8732c;
        Cipher cipherC = com.google.e.a.a.a.d.c();
        cipherC.init(2, (Key) r5, algorithmParameterSpecB);
        if (bArr2 != null && bArr2.length != 0) {
            cipherC.updateAAD(bArr2);
        }
        return cipherC.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.google.e.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.security.Key] */
    @Override // com.google.e.a.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.f8731b != 0) {
            byte[] bArr3 = this.f8730a;
            int length = bArr3.length;
            ?? r12 = this.f8732c;
            return length == 0 ? r12.b(bArr, bArr2) : com.google.e.a.d.a.d.d(bArr3, r12.b(bArr, bArr2));
        }
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrB = al.b(12);
        AlgorithmParameterSpec algorithmParameterSpecA = com.google.e.a.a.a.d.a(bArrB);
        ?? r5 = this.f8732c;
        Cipher cipherC = com.google.e.a.a.a.d.c();
        cipherC.init(1, (Key) r5, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherC.updateAAD(bArr2);
        }
        int length2 = bArr.length;
        int outputSize = cipherC.getOutputSize(length2);
        byte[] bArr4 = this.f8730a;
        int length3 = bArr4.length;
        if (outputSize > 2147483635 - length3) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i2 = length3 + 12;
        byte[] bArrCopyOf = Arrays.copyOf(bArr4, i2 + outputSize);
        System.arraycopy(bArrB, 0, bArrCopyOf, length3, 12);
        if (cipherC.doFinal(bArr, 0, length2, bArrCopyOf, i2) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    private k(com.google.e.a.a aVar, byte[] bArr, int i2) {
        this.f8731b = i2;
        this.f8732c = aVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f8730a = bArr;
    }
}
