package com.google.e.a.j;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends z {

    /* renamed from: a, reason: collision with root package name */
    private final int f8725a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8726b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8727c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8728d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f8729e;

    private j(com.google.e.a.i.f fVar) throws GeneralSecurityException {
        String str;
        this.f8729e = fVar.h().e();
        if (fVar.f().i().equals(com.google.e.a.i.i.f8634a)) {
            str = "HmacSha1";
        } else if (fVar.f().i().equals(com.google.e.a.i.i.f8635b)) {
            str = "HmacSha256";
        } else {
            if (!fVar.f().i().equals(com.google.e.a.i.i.f8636c)) {
                throw new GeneralSecurityException("Unknown HKDF algorithm ".concat(String.valueOf(String.valueOf(fVar.f().i()))));
            }
            str = "HmacSha512";
        }
        this.f8728d = str;
        this.f8725a = fVar.f().g();
        int iF = fVar.f().f();
        this.f8726b = iF;
        this.f8727c = iF - 16;
    }

    public static com.google.e.a.z d(com.google.e.a.i.f fVar) {
        return new j(fVar);
    }

    static /* bridge */ /* synthetic */ Cipher i() {
        return (Cipher) v.f8758a.a("AES/GCM/NoPadding");
    }

    static /* bridge */ /* synthetic */ GCMParameterSpec l(byte[] bArr, long j2, boolean z) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        com.google.firebase.a.a(byteBufferAllocate, j2);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(128, byteBufferAllocate.array());
    }

    static /* bridge */ /* synthetic */ SecretKeySpec m(j jVar, byte[] bArr, byte[] bArr2) {
        return new SecretKeySpec(com.google.e.a.i.a.e.b(jVar.f8728d, jVar.f8729e, bArr, bArr2, jVar.f8725a), "AES");
    }

    @Override // com.google.e.a.j.z
    public final int e() {
        return g();
    }

    @Override // com.google.e.a.j.z
    public final int f() {
        return this.f8726b;
    }

    @Override // com.google.e.a.j.z
    public final int g() {
        return this.f8725a + 8;
    }

    @Override // com.google.e.a.j.z
    public final int h() {
        return this.f8727c;
    }

    @Override // com.google.e.a.j.z
    public final /* synthetic */ af j() {
        return new h(this);
    }

    @Override // com.google.e.a.j.z
    public final /* synthetic */ ag k(byte[] bArr) {
        return new i(this, bArr);
    }
}
