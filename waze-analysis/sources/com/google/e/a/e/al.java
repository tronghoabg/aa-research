package com.google.e.a.e;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f8424a = new ak();

    static /* bridge */ /* synthetic */ SecureRandom a() {
        SecureRandom secureRandomC = c();
        secureRandomC.nextLong();
        return secureRandomC;
    }

    public static byte[] b(int i2) {
        byte[] bArr = new byte[i2];
        ((SecureRandom) f8424a.get()).nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom c() {
        Provider providerA = a.a();
        if (providerA != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerA);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider provider = null;
        try {
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (Throwable unused2) {
        }
        if (provider != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (GeneralSecurityException unused3) {
            }
        }
        return new SecureRandom();
    }
}
