package com.waze.sharedui.api;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38821a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38822b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38823c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38824d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f38825e;

    public s(boolean z, String str, String str2, int i2, boolean z2) {
        x.f(str, "uuid");
        x.f(str2, "pinCodeToken");
        this.f38821a = z;
        this.f38822b = str;
        this.f38823c = str2;
        this.f38824d = i2;
        this.f38825e = z2;
    }

    public final int a() {
        return this.f38824d;
    }

    public final String b() {
        return this.f38823c;
    }

    public final boolean c() {
        return this.f38825e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f38821a == sVar.f38821a && x.n(this.f38822b, sVar.f38822b) && x.n(this.f38823c, sVar.f38823c) && this.f38824d == sVar.f38824d && this.f38825e == sVar.f38825e;
    }

    public final int hashCode() {
        return (((((((a.a.a(this.f38821a) * 31) + this.f38822b.hashCode()) * 31) + this.f38823c.hashCode()) * 31) + this.f38824d) * 31) + a.a.a(this.f38825e);
    }

    public final String toString() {
        return "VerifyEmailResponse(sent=" + this.f38821a + ", uuid=" + this.f38822b + ", pinCodeToken=" + this.f38823c + ", pinCodeLength=" + this.f38824d + ", pinCodeRequired=" + this.f38825e + ")";
    }
}
