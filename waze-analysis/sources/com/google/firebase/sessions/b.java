package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f10858a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10859b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10860c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10861d;

    /* renamed from: e, reason: collision with root package name */
    private final t f10862e;

    /* renamed from: f, reason: collision with root package name */
    private final a f10863f;

    public b(String str, String str2, String str3, t tVar, a aVar) {
        h.g.b.x.f(str, "appId");
        h.g.b.x.f(str2, "deviceModel");
        h.g.b.x.f("2.0.4_1p", "sessionSdkVersion");
        h.g.b.x.f(str3, "osVersion");
        h.g.b.x.f(tVar, "logEnvironment");
        h.g.b.x.f(aVar, "androidAppInfo");
        this.f10858a = str;
        this.f10859b = str2;
        this.f10860c = "2.0.4_1p";
        this.f10861d = str3;
        this.f10862e = tVar;
        this.f10863f = aVar;
    }

    public final a a() {
        return this.f10863f;
    }

    public final t b() {
        return this.f10862e;
    }

    public final String c() {
        return this.f10858a;
    }

    public final String d() {
        return this.f10859b;
    }

    public final String e() {
        return this.f10861d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.g.b.x.n(this.f10858a, bVar.f10858a) && h.g.b.x.n(this.f10859b, bVar.f10859b) && h.g.b.x.n(this.f10860c, bVar.f10860c) && h.g.b.x.n(this.f10861d, bVar.f10861d) && this.f10862e == bVar.f10862e && h.g.b.x.n(this.f10863f, bVar.f10863f);
    }

    public final String f() {
        return this.f10860c;
    }

    public final int hashCode() {
        return (((((((((this.f10858a.hashCode() * 31) + this.f10859b.hashCode()) * 31) + this.f10860c.hashCode()) * 31) + this.f10861d.hashCode()) * 31) + this.f10862e.hashCode()) * 31) + this.f10863f.hashCode();
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f10858a + ", deviceModel=" + this.f10859b + ", sessionSdkVersion=" + this.f10860c + ", osVersion=" + this.f10861d + ", logEnvironment=" + this.f10862e + ", androidAppInfo=" + this.f10863f + ")";
    }
}
