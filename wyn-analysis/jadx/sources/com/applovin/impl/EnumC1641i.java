package com.applovin.impl;

/* renamed from: com.applovin.impl.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1641i {
    PUBLISHER_INITIATED("publisher_initiated"),
    SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
    REFRESH("refresh"),
    EXPONENTIAL_RETRY("exponential_retry"),
    EXPIRED("expired"),
    NATIVE_AD_PLACER("native_ad_placer");


    /* renamed from: a, reason: collision with root package name */
    private final String f21689a;

    EnumC1641i(String str) {
        this.f21689a = str;
    }

    public String b() {
        return this.f21689a;
    }
}
