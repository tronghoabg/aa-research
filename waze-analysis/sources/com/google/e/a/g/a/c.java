package com.google.e.a.g.a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements com.google.e.a.g.c {

    /* renamed from: a, reason: collision with root package name */
    private final Key f8543a;

    /* renamed from: b, reason: collision with root package name */
    private final Provider f8544b;

    private c(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.f8543a = new SecretKeySpec(bArr, "AES");
        this.f8544b = provider;
    }

    public static com.google.e.a.g.c b(com.google.e.a.g.a aVar) throws GeneralSecurityException {
        Provider providerA = com.google.e.a.e.a.a();
        if (providerA == null) {
            throw new GeneralSecurityException("Conscrypt not available");
        }
        Mac.getInstance("AESCMAC", providerA);
        return new c(aVar.g().e(), providerA);
    }

    @Override // com.google.e.a.g.c
    public final byte[] a(byte[] bArr, int i2) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Provider provider = this.f8544b;
        Key key = this.f8543a;
        Mac mac = Mac.getInstance("AESCMAC", provider);
        mac.init(key);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i2 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i2);
    }
}
