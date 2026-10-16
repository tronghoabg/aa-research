package com.waze;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class js extends ka {

    /* renamed from: a, reason: collision with root package name */
    private final String f24966a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24967b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24968c;

    public js(String str, String str2, int i2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "message");
        this.f24966a = str;
        this.f24967b = str2;
        this.f24968c = i2;
    }

    public final int a() {
        return this.f24968c;
    }

    public final String b() {
        return this.f24967b;
    }

    public final String c() {
        return this.f24966a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js)) {
            return false;
        }
        js jsVar = (js) obj;
        return h.g.b.x.n(this.f24966a, jsVar.f24966a) && h.g.b.x.n(this.f24967b, jsVar.f24967b) && this.f24968c == jsVar.f24968c;
    }

    public final int hashCode() {
        return (((this.f24966a.hashCode() * 31) + this.f24967b.hashCode()) * 31) + this.f24968c;
    }

    public final String toString() {
        return "RouteCalculationError(title=" + this.f24966a + ", message=" + this.f24967b + ", timeoutSeconds=" + this.f24968c + ")";
    }
}
