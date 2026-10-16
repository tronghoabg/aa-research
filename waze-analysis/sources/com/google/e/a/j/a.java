package com.google.e.a.j;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a implements af {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f8655a;

    /* renamed from: b, reason: collision with root package name */
    private SecretKeySpec f8656b;

    /* renamed from: c, reason: collision with root package name */
    private SecretKeySpec f8657c;

    /* renamed from: d, reason: collision with root package name */
    private Cipher f8658d;

    /* renamed from: e, reason: collision with root package name */
    private Mac f8659e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f8660f;

    a(c cVar) {
        Objects.requireNonNull(cVar);
        this.f8655a = cVar;
    }

    @Override // com.google.e.a.j.af
    public final synchronized void a(ByteBuffer byteBuffer, int i2, boolean z, ByteBuffer byteBuffer2) {
        int iPosition = byteBuffer.position();
        byte[] bArrR = c.r(this.f8660f, i2, z);
        c cVar = this.f8655a;
        int iRemaining = byteBuffer.remaining();
        if (iRemaining < cVar.f8702c) {
            throw new GeneralSecurityException("Ciphertext too short");
        }
        int i3 = iPosition + (iRemaining - cVar.f8702c);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(i3);
        ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
        byteBufferDuplicate2.position(i3);
        this.f8659e.init(this.f8657c);
        this.f8659e.update(bArrR);
        this.f8659e.update(byteBufferDuplicate);
        byte[] bArrCopyOf = Arrays.copyOf(this.f8659e.doFinal(), cVar.f8702c);
        byte[] bArr = new byte[cVar.f8702c];
        byteBufferDuplicate2.get(bArr);
        if (!MessageDigest.isEqual(bArr, bArrCopyOf)) {
            throw new GeneralSecurityException("Tag mismatch");
        }
        byteBuffer.limit(i3);
        this.f8658d.init(1, this.f8656b, new IvParameterSpec(bArrR));
        this.f8658d.doFinal(byteBuffer, byteBuffer2);
    }

    @Override // com.google.e.a.j.af
    public final synchronized void b(ByteBuffer byteBuffer, byte[] bArr) {
        c cVar = this.f8655a;
        if (byteBuffer.remaining() != cVar.g()) {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
        if (byteBuffer.get() != cVar.g()) {
            throw new GeneralSecurityException("Invalid ciphertext");
        }
        this.f8660f = new byte[7];
        byte[] bArr2 = new byte[cVar.f8700a];
        byteBuffer.get(bArr2);
        byteBuffer.get(this.f8660f);
        byte[] bArrB = com.google.e.a.i.a.e.b(cVar.f8705f, cVar.f8706g, bArr2, bArr, cVar.f8700a + 32);
        this.f8656b = c.o(cVar, bArrB);
        this.f8657c = c.n(cVar, bArrB);
        this.f8658d = c.l();
        this.f8659e = c.m(cVar);
    }
}
