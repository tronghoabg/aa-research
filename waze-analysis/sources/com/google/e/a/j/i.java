package com.google.e.a.j;

import com.google.e.a.e.al;
import j$.util.Objects;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements ag {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f8720a;

    /* renamed from: b, reason: collision with root package name */
    private final Cipher f8721b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8722c;

    /* renamed from: d, reason: collision with root package name */
    private final ByteBuffer f8723d;

    /* renamed from: e, reason: collision with root package name */
    private long f8724e;

    public i(j jVar, byte[] bArr) {
        Objects.requireNonNull(jVar);
        this.f8724e = 0L;
        this.f8721b = j.i();
        this.f8724e = 0L;
        byte[] bArrB = al.b(jVar.f8725a);
        byte[] bArrB2 = al.b(7);
        this.f8722c = bArrB2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(jVar.g());
        this.f8723d = byteBufferAllocate;
        byteBufferAllocate.put((byte) jVar.g());
        byteBufferAllocate.put(bArrB);
        byteBufferAllocate.put(bArrB2);
        byteBufferAllocate.flip();
        this.f8720a = j.m(jVar, bArrB, bArr);
    }

    @Override // com.google.e.a.j.ag
    public final ByteBuffer a() {
        return this.f8723d.asReadOnlyBuffer();
    }

    @Override // com.google.e.a.j.ag
    public final synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        GCMParameterSpec gCMParameterSpecL = j.l(this.f8722c, this.f8724e, false);
        SecretKeySpec secretKeySpec = this.f8720a;
        Cipher cipher = this.f8721b;
        cipher.init(1, secretKeySpec, gCMParameterSpecL);
        this.f8724e++;
        if (!byteBuffer2.hasRemaining()) {
            cipher.doFinal(byteBuffer, byteBuffer3);
        } else {
            cipher.update(byteBuffer, byteBuffer3);
            cipher.doFinal(byteBuffer2, byteBuffer3);
        }
    }

    @Override // com.google.e.a.j.ag
    public final synchronized void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        GCMParameterSpec gCMParameterSpecL = j.l(this.f8722c, this.f8724e, true);
        SecretKeySpec secretKeySpec = this.f8720a;
        Cipher cipher = this.f8721b;
        cipher.init(1, secretKeySpec, gCMParameterSpecL);
        this.f8724e++;
        cipher.doFinal(byteBuffer, byteBuffer2);
    }
}
