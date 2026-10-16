package com.google.e.a.j;

import com.google.e.a.e.al;
import com.google.e.a.e.ar;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.e.a.a.a.m f8750a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f8751b;

    private r(byte[] bArr, byte[] bArr2) {
        this.f8750a = new com.google.e.a.a.a.m(bArr);
        this.f8751b = bArr2;
    }

    public static com.google.e.a.a c(com.google.e.a.a.aa aaVar) {
        return new r(aaVar.i().e(), aaVar.f().c());
    }

    private final byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f8750a.c(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    private final byte[] e(byte[] bArr, byte[] bArr2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrB = al.b(12);
        byteBufferAllocate.put(bArrB);
        this.f8750a.b(byteBufferAllocate, bArrB, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f8751b;
        int length = bArr3.length;
        if (length == 0) {
            return d(bArr, bArr2);
        }
        if (ar.a(bArr3, bArr)) {
            return d(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    @Override // com.google.e.a.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f8751b;
        int length = bArr3.length;
        byte[] bArrE = e(bArr, bArr2);
        return length == 0 ? bArrE : com.google.e.a.d.a.d.d(bArr3, bArrE);
    }
}
