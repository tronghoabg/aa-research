package com.google.e.a.a.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private final l f8137a;

    /* renamed from: b, reason: collision with root package name */
    private final l f8138b;

    public n(byte[] bArr) throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f8137a = a(bArr, 1);
        this.f8138b = a(bArr, 0);
    }

    private final byte[] d(byte[] bArr) {
        ByteBuffer byteBufferC = this.f8138b.c(bArr, 0);
        byte[] bArr2 = new byte[32];
        byteBufferC.get(bArr2);
        return bArr2;
    }

    private static byte[] e(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length;
        int i2 = length & 15;
        int i3 = i2 == 0 ? length : (length + 16) - i2;
        int iRemaining = byteBuffer.remaining();
        int i4 = iRemaining % 16;
        int i5 = (i4 == 0 ? iRemaining : (iRemaining + 16) - i4) + i3;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i5 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(i3);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i5);
        byteBufferOrder.putLong(length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    abstract l a(byte[] bArr, int i2);

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        this.f8137a.d(byteBuffer, bArr, bArr2);
        int iPosition2 = byteBuffer.position();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iPosition2);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArrD = com.google.e.a.e.d(d(bArr), e(bArr3, byteBuffer));
        byteBuffer.limit(iLimit);
        byteBuffer.position(iPosition2);
        byteBuffer.put(bArrD);
    }

    public final byte[] c(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            if (!MessageDigest.isEqual(com.google.e.a.e.d(d(bArr), e(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            return this.f8137a.e(bArr, byteBuffer);
        } catch (GeneralSecurityException e2) {
            throw new AEADBadTagException(e2.toString());
        }
    }
}
