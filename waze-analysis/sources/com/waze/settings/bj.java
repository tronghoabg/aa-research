package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    private final String f36869a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36870b;

    public bj(String str) {
        h.g.b.x.f(str, "pageId");
        this.f36869a = str;
        this.f36870b = "DEEP_LINK";
    }

    public final String a() {
        return this.f36870b;
    }

    public final String b() {
        return this.f36869a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return h.g.b.x.n(this.f36869a, bjVar.f36869a) && h.g.b.x.n(this.f36870b, bjVar.f36870b);
    }

    public final int hashCode() {
        return (this.f36869a.hashCode() * 31) + this.f36870b.hashCode();
    }

    public final String toString() {
        return "SettingPageNavData(pageId=" + this.f36869a + ", origin=" + this.f36870b + ")";
    }
}
