package com.waze.g;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f23988a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23989b;

    public a(String str, String str2) {
        x.f(str, "model");
        x.f(str2, "manufacturer");
        this.f23988a = str;
        this.f23989b = str2;
    }

    public final String a() {
        return this.f23989b;
    }

    public final String b() {
        return this.f23988a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f23988a, aVar.f23988a) && x.n(this.f23989b, aVar.f23989b);
    }

    public final int hashCode() {
        return (this.f23988a.hashCode() * 31) + this.f23989b.hashCode();
    }

    public final String toString() {
        return "DeviceInfo(model=" + this.f23988a + ", manufacturer=" + this.f23989b + ")";
    }
}
