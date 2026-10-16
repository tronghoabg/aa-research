package com.waze.car_lib.login;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20305a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20306b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z, String str) {
        super(null);
        x.f(str, "appDownloadUrl");
        this.f20305a = z;
        this.f20306b = str;
    }

    public final String a() {
        return this.f20306b;
    }

    public final boolean b() {
        return this.f20305a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f20305a == hVar.f20305a && x.n(this.f20306b, hVar.f20306b);
    }

    public final int hashCode() {
        return (a.a.a(this.f20305a) * 31) + this.f20306b.hashCode();
    }

    public final String toString() {
        return "VersionUpgrade(hasUnsupportedOs=" + this.f20305a + ", appDownloadUrl=" + this.f20306b + ")";
    }
}
