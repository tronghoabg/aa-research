package com.google.e.a.d.a;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8405a = "e";

    /* renamed from: b, reason: collision with root package name */
    private final com.google.e.a.a f8406b;

    public e(String str) {
        this.f8406b = d.a(str);
    }

    private static void c() throws InterruptedException {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws BadPaddingException, InterruptedException {
        try {
            return this.f8406b.a(bArr, bArr2);
        } catch (GeneralSecurityException e2) {
            e = e2;
            Log.w(f8405a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.f8406b.a(bArr, bArr2);
        } catch (ProviderException e3) {
            e = e3;
            Log.w(f8405a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.f8406b.a(bArr, bArr2);
        } catch (BadPaddingException e4) {
            throw e4;
        }
    }

    @Override // com.google.e.a.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws InterruptedException {
        try {
            return this.f8406b.b(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e2) {
            Log.w(f8405a, "encountered a potentially transient KeyStore error, will wait and retry", e2);
            c();
            return this.f8406b.b(bArr, bArr2);
        }
    }
}
