package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1639h {

    /* renamed from: a, reason: collision with root package name */
    private final int f21620a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21621b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21622c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21623d;

    public C1639h(int i5, int i10, int i11, int i12) {
        this.f21620a = i5;
        this.f21621b = i10;
        this.f21622c = i11;
        this.f21623d = i12;
    }

    public boolean a(Object obj) {
        return obj instanceof C1639h;
    }

    public int b() {
        return this.f21622c;
    }

    public int c() {
        return this.f21621b;
    }

    public int d() {
        return this.f21620a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f21620a));
        map.put("air_num", Integer.valueOf(this.f21621b));
        map.put("fsr_num", Integer.valueOf(this.f21622c));
        map.put("fir_num", Integer.valueOf(this.f21623d));
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1639h)) {
            return false;
        }
        C1639h c1639h = (C1639h) obj;
        return c1639h.a(this) && d() == c1639h.d() && c() == c1639h.c() && b() == c1639h.b() && a() == c1639h.a();
    }

    public int hashCode() {
        return a() + ((b() + ((c() + ((d() + 59) * 59)) * 59)) * 59);
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + ")";
    }

    public int a() {
        return this.f21623d;
    }
}
