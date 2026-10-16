package com.applovin.impl;

import java.util.Map;

/* renamed from: com.applovin.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1633e {

    /* renamed from: a, reason: collision with root package name */
    private final String f21387a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21388b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f21389c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21390d;

    public C1633e(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f21388b;
    }

    public Map b() {
        return this.f21389c;
    }

    public String c() {
        return this.f21387a;
    }

    public boolean d() {
        return this.f21390d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f21387a + "', backupUrl='" + this.f21388b + "', headers='" + this.f21389c + "', shouldFireInWebView='" + this.f21390d + "'}";
    }

    public C1633e(String str, String str2, Map map, boolean z2) {
        this.f21387a = str;
        this.f21388b = str2;
        this.f21389c = map;
        this.f21390d = z2;
    }
}
