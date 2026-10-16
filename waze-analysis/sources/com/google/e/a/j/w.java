package com.google.e.a.j;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w implements x {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f8761a;

    public w(int i2) {
        this.f8761a = i2;
    }

    @Override // com.google.e.a.j.x
    public final /* synthetic */ Object a(String str, Provider provider) {
        int i2 = this.f8761a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider) : provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider) : provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider) : provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider) : provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider) : provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider) : provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
