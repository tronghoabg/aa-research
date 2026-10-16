package com.google.e.a.j;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends z {

    /* renamed from: a, reason: collision with root package name */
    private final int f8700a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8701b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8702c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8703d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8704e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8705f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f8706g;

    private c(com.google.e.a.i.a aVar) throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        this.f8706g = aVar.h().e();
        com.google.e.a.i.d dVarJ = aVar.f().j();
        com.google.e.a.i.d dVar = com.google.e.a.i.d.f8613a;
        String str = "HmacSha512";
        this.f8705f = dVarJ.equals(dVar) ? "HmacSha1" : aVar.f().j().equals(com.google.e.a.i.d.f8614b) ? "HmacSha256" : aVar.f().j().equals(com.google.e.a.i.d.f8615c) ? "HmacSha512" : "";
        this.f8700a = aVar.f().g();
        if (aVar.f().k().equals(dVar)) {
            str = "HmacSha1";
        } else if (aVar.f().k().equals(com.google.e.a.i.d.f8614b)) {
            str = "HmacSha256";
        } else if (!aVar.f().k().equals(com.google.e.a.i.d.f8615c)) {
            str = "";
        }
        this.f8701b = str;
        int iH = aVar.f().h();
        this.f8702c = iH;
        int iF = aVar.f().f();
        this.f8703d = iF;
        this.f8704e = iF - iH;
    }

    public static com.google.e.a.z i(com.google.e.a.i.a aVar) {
        return new c(aVar);
    }

    static /* bridge */ /* synthetic */ Cipher l() {
        return (Cipher) v.f8758a.a("AES/CTR/NoPadding");
    }

    static /* bridge */ /* synthetic */ Mac m(c cVar) {
        return (Mac) v.f8759b.a(cVar.f8701b);
    }

    static /* bridge */ /* synthetic */ SecretKeySpec n(c cVar, byte[] bArr) {
        return new SecretKeySpec(bArr, cVar.f8700a, 32, cVar.f8701b);
    }

    static /* bridge */ /* synthetic */ SecretKeySpec o(c cVar, byte[] bArr) {
        return new SecretKeySpec(bArr, 0, cVar.f8700a, "AES");
    }

    static /* bridge */ /* synthetic */ byte[] r(byte[] bArr, long j2, boolean z) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        com.google.firebase.a.a(byteBufferAllocate, j2);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        byteBufferAllocate.putInt(0);
        return byteBufferAllocate.array();
    }

    @Override // com.google.e.a.j.z
    public final int e() {
        return g();
    }

    @Override // com.google.e.a.j.z
    public final int f() {
        return this.f8703d;
    }

    @Override // com.google.e.a.j.z
    public final int g() {
        return this.f8700a + 8;
    }

    @Override // com.google.e.a.j.z
    public final int h() {
        return this.f8704e;
    }

    @Override // com.google.e.a.j.z
    public final /* synthetic */ af j() {
        return new a(this);
    }

    @Override // com.google.e.a.j.z
    public final /* synthetic */ ag k(byte[] bArr) {
        return new b(this, bArr);
    }
}
