package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class AccountIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    public final String f19969a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19970b;

    public AccountIdentifiers(String str, String str2) {
        this.f19969a = str;
        this.f19970b = str2;
    }

    public String getObfuscatedAccountId() {
        return this.f19969a;
    }

    public String getObfuscatedProfileId() {
        return this.f19970b;
    }
}
