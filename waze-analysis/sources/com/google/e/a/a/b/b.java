package com.google.e.a.a.b;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8245a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f8246b = new a();

    public static /* synthetic */ Cipher c() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) f8246b.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e2);
        }
    }

    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    @Override // com.google.e.a.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
