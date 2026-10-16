package com.google.e.a.j;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements af {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f8716a;

    /* renamed from: b, reason: collision with root package name */
    private SecretKeySpec f8717b;

    /* renamed from: c, reason: collision with root package name */
    private Cipher f8718c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f8719d;

    h(j jVar) {
        Objects.requireNonNull(jVar);
        this.f8716a = jVar;
    }

    @Override // com.google.e.a.j.af
    public final synchronized void a(ByteBuffer byteBuffer, int i2, boolean z, ByteBuffer byteBuffer2) {
        this.f8718c.init(2, this.f8717b, j.l(this.f8719d, i2, z));
        this.f8718c.doFinal(byteBuffer, byteBuffer2);
    }

    @Override // com.google.e.a.j.af
    public final synchronized void b(ByteBuffer byteBuffer, byte[] bArr) {
        j jVar = this.f8716a;
        if (byteBuffer.remaining() != jVar.g()) {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
        if (byteBuffer.get() != jVar.g()) {
            throw new GeneralSecurityException("Invalid ciphertext");
        }
        this.f8719d = new byte[7];
        byte[] bArr2 = new byte[jVar.f8725a];
        byteBuffer.get(bArr2);
        byteBuffer.get(this.f8719d);
        this.f8717b = j.m(jVar, bArr2, bArr);
        this.f8718c = j.i();
    }
}
