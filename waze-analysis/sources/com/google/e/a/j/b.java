package com.google.e.a.j;

import com.google.e.a.e.al;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements ag {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f8692a;

    /* renamed from: b, reason: collision with root package name */
    private final SecretKeySpec f8693b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f8694c;

    /* renamed from: d, reason: collision with root package name */
    private final Cipher f8695d;

    /* renamed from: e, reason: collision with root package name */
    private final Mac f8696e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f8697f;

    /* renamed from: g, reason: collision with root package name */
    private final ByteBuffer f8698g;

    /* renamed from: h, reason: collision with root package name */
    private long f8699h;

    public b(c cVar, byte[] bArr) throws IllegalStateException, GeneralSecurityException {
        Objects.requireNonNull(cVar);
        this.f8692a = cVar;
        this.f8699h = 0L;
        this.f8695d = c.l();
        this.f8696e = c.m(cVar);
        this.f8699h = 0L;
        byte[] bArrB = al.b(cVar.f8700a);
        byte[] bArrB2 = al.b(7);
        this.f8697f = bArrB2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(cVar.g());
        this.f8698g = byteBufferAllocate;
        byteBufferAllocate.put((byte) cVar.g());
        byteBufferAllocate.put(bArrB);
        byteBufferAllocate.put(bArrB2);
        byteBufferAllocate.flip();
        byte[] bArrB3 = com.google.e.a.i.a.e.b(cVar.f8705f, cVar.f8706g, bArrB, bArr, cVar.f8700a + 32);
        this.f8693b = c.o(cVar, bArrB3);
        this.f8694c = c.n(cVar, bArrB3);
    }

    @Override // com.google.e.a.j.ag
    public final ByteBuffer a() {
        return this.f8698g.asReadOnlyBuffer();
    }

    @Override // com.google.e.a.j.ag
    public final synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        byte[] bArr = this.f8697f;
        int iPosition = byteBuffer3.position();
        byte[] bArrR = c.r(bArr, this.f8699h, false);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrR);
        Cipher cipher = this.f8695d;
        cipher.init(1, this.f8693b, ivParameterSpec);
        this.f8699h++;
        cipher.update(byteBuffer, byteBuffer3);
        cipher.doFinal(byteBuffer2, byteBuffer3);
        ByteBuffer byteBufferDuplicate = byteBuffer3.duplicate();
        byteBufferDuplicate.flip();
        byteBufferDuplicate.position(iPosition);
        Mac mac = this.f8696e;
        mac.init(this.f8694c);
        mac.update(bArrR);
        mac.update(byteBufferDuplicate);
        byteBuffer3.put(mac.doFinal(), 0, this.f8692a.f8702c);
    }

    @Override // com.google.e.a.j.ag
    public final synchronized void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = this.f8697f;
        int iPosition = byteBuffer2.position();
        byte[] bArrR = c.r(bArr, this.f8699h, true);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrR);
        Cipher cipher = this.f8695d;
        cipher.init(1, this.f8693b, ivParameterSpec);
        this.f8699h++;
        cipher.doFinal(byteBuffer, byteBuffer2);
        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
        byteBufferDuplicate.flip();
        byteBufferDuplicate.position(iPosition);
        Mac mac = this.f8696e;
        mac.init(this.f8694c);
        mac.update(bArrR);
        mac.update(byteBufferDuplicate);
        byteBuffer2.put(mac.doFinal(), 0, this.f8692a.f8702c);
    }
}
