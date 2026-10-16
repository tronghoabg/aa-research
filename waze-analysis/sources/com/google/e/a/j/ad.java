package com.google.e.a.j;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad implements com.google.e.a.g.c {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f8664a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8665b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f8666c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8667d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public ad(String str, Key key) throws GeneralSecurityException {
        int i2;
        ac acVar = new ac(this);
        this.f8664a = acVar;
        if (!com.google.e.a.b.a.a.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f8665b = str;
        this.f8666c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    i2 = 20;
                    this.f8667d = i2;
                    acVar.get();
                    return;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    i2 = 28;
                    this.f8667d = i2;
                    acVar.get();
                    return;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    i2 = 32;
                    this.f8667d = i2;
                    acVar.get();
                    return;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    i2 = 48;
                    this.f8667d = i2;
                    acVar.get();
                    return;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    i2 = 64;
                    this.f8667d = i2;
                    acVar.get();
                    return;
                }
                break;
        }
        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
    }

    @Override // com.google.e.a.g.c
    public final byte[] a(byte[] bArr, int i2) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i2 > this.f8667d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = this.f8664a;
        ((Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i2);
    }
}
