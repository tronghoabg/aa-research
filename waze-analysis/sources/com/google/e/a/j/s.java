package com.google.e.a.j;

import com.google.e.a.e.ar;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final y f8752a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.e.a.q f8753b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8754c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f8755d;

    private s(y yVar, com.google.e.a.q qVar, int i2, byte[] bArr) {
        this.f8752a = yVar;
        this.f8753b = qVar;
        this.f8754c = i2;
        this.f8755d = bArr;
    }

    public static com.google.e.a.a c(com.google.e.a.a.d dVar) {
        e eVar = new e(dVar.h().e(), dVar.g().h());
        String strValueOf = String.valueOf(String.valueOf(dVar.g().k()));
        return new s(eVar, new ae(new ad("HMAC".concat(strValueOf), new SecretKeySpec(dVar.i().e(), "HMAC")), dVar.g().i()), dVar.g().i(), dVar.f().c());
    }

    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f8755d;
        int length = bArr.length;
        int i2 = this.f8754c;
        int length2 = bArr3.length;
        if (length < i2 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!ar.a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i3 = length - i2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i3);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i3, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((ae) this.f8753b).a(com.google.e.a.d.a.d.d(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.f8752a.a(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // com.google.e.a.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArrB = this.f8752a.b(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return com.google.e.a.d.a.d.d(this.f8755d, bArrB, this.f8753b.a(com.google.e.a.d.a.d.d(bArr2, bArrB, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
