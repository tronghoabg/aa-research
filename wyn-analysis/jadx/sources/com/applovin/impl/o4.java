package com.applovin.impl;

import java.util.Map;

/* loaded from: classes.dex */
public class o4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f22429a;

    /* renamed from: b, reason: collision with root package name */
    private Map f22430b;

    private o4(String str, Map map) {
        this.f22429a = str;
        this.f22430b = map;
    }

    public static o4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f22429a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f22429a + "'params='" + this.f22430b + "'}";
    }

    public static o4 a(String str, Map map) {
        return new o4(str, map);
    }

    public Map a() {
        return this.f22430b;
    }
}
