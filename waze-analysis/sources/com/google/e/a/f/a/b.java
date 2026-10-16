package com.google.e.a.f.a;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements com.google.e.a.f.e {
    private b(com.google.e.a.f.a aVar, Provider provider) throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            aVar.g().c();
            new SecretKeySpec(aVar.h().e(), "AES");
        } catch (NoSuchAlgorithmException e2) {
            throw new GeneralSecurityException("AES-CMAC not available.", e2);
        }
    }

    public static com.google.e.a.f.e a(com.google.e.a.f.a aVar) throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerA = com.google.e.a.e.a.a();
        if (providerA != null) {
            try {
                return b(aVar, providerA);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new b();
    }

    public static com.google.e.a.f.e b(com.google.e.a.f.a aVar, Provider provider) {
        return new b(aVar, provider);
    }

    /* synthetic */ b(char[] cArr) {
    }

    public b(byte[] bArr) throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
