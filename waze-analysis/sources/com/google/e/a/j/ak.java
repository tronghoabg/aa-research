package com.google.e.a.j;

import com.google.e.a.a.bb;
import com.google.e.a.e.al;
import com.google.e.a.e.ar;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ak implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.e.a.a.a.p f8690a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f8691b;

    private ak(byte[] bArr, byte[] bArr2) {
        this.f8690a = new com.google.e.a.a.a.p(bArr);
        this.f8691b = bArr2;
    }

    public static com.google.e.a.a c(bb bbVar) {
        return new ak(bbVar.i().e(), bbVar.f().c());
    }

    private final byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f8690a.c(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    private final byte[] e(byte[] bArr, byte[] bArr2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrB = al.b(24);
        byteBufferAllocate.put(bArrB);
        this.f8690a.b(byteBufferAllocate, bArrB, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f8691b;
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
        byte[] bArr3 = this.f8691b;
        int length = bArr3.length;
        byte[] bArrE = e(bArr, bArr2);
        return length == 0 ? bArrE : com.google.e.a.d.a.d.d(bArr3, bArrE);
    }
}
