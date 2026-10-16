package com.google.e.a.a;

import com.google.e.a.h.bl;
import com.google.e.a.h.bm;
import com.google.e.a.h.ci;
import j$.util.DesugarCollections;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class af implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8174a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f8175b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    private static final Set f8176c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8177d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.e.a.a f8178e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.d.m.a.a.b f8179f;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f8176c = DesugarCollections.unmodifiableSet(hashSet);
    }

    @Deprecated
    af(bm bmVar, com.google.e.a.a aVar) {
        if (!f8176c.contains(bmVar.getTypeUrl())) {
            throw new IllegalArgumentException("Unsupported DEK key type: " + bmVar.getTypeUrl() + ". Only Tink AEAD key types are supported.");
        }
        this.f8177d = bmVar.getTypeUrl();
        bl blVarNewBuilder = bm.newBuilder(bmVar);
        blVarNewBuilder.a(ci.RAW);
        this.f8179f = com.google.e.a.e.e(blVarNewBuilder.build().toByteArray());
        this.f8178e = aVar;
    }

    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i2 = byteBufferWrap.getInt();
            if (i2 <= 0 || i2 > 4096 || i2 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i2];
            byteBufferWrap.get(bArr3, 0, i2);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((com.google.e.a.a) com.google.e.a.e.t.a().e(com.google.e.a.e.v.a().d(com.waze.car_lib.r.ai.i(this.f8177d, com.google.v.v.q(this.f8178e.a(bArr3, f8175b)), com.google.e.a.r.f8777b, com.google.e.a.s.f8785d, null), com.google.e.a.e.a()), com.google.e.a.a.class)).a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e2) {
            throw new GeneralSecurityException("invalid ciphertext", e2);
        }
    }

    @Override // com.google.e.a.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        com.google.d.m.a.a.b bVarC = com.google.e.a.e.n.a().c(this.f8179f, null);
        byte[] bArrB = this.f8178e.b(com.google.e.a.e.v.a().e(bVarC, com.google.e.a.e.a()).f().x(), f8175b);
        int length = bArrB.length;
        if (length > 4096) {
            throw new GeneralSecurityException("length of encrypted DEK too large");
        }
        byte[] bArrB2 = ((com.google.e.a.a) com.google.e.a.e.t.a().e(bVarC, com.google.e.a.a.class)).b(bArr, bArr2);
        return ByteBuffer.allocate(length + 4 + bArrB2.length).putInt(length).put(bArrB).put(bArrB2).array();
    }
}
