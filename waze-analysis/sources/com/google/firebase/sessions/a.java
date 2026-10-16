package com.google.firebase.sessions;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f10757a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10758b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10759c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10760d;

    /* renamed from: e, reason: collision with root package name */
    private final u f10761e;

    /* renamed from: f, reason: collision with root package name */
    private final List f10762f;

    public a(String str, String str2, String str3, String str4, u uVar, List list) {
        h.g.b.x.f(str, "packageName");
        h.g.b.x.f(str2, "versionName");
        h.g.b.x.f(str3, "appBuildVersion");
        h.g.b.x.f(str4, "deviceManufacturer");
        h.g.b.x.f(uVar, "currentProcessDetails");
        h.g.b.x.f(list, "appProcessDetails");
        this.f10757a = str;
        this.f10758b = str2;
        this.f10759c = str3;
        this.f10760d = str4;
        this.f10761e = uVar;
        this.f10762f = list;
    }

    public final u a() {
        return this.f10761e;
    }

    public final String b() {
        return this.f10759c;
    }

    public final String c() {
        return this.f10760d;
    }

    public final String d() {
        return this.f10757a;
    }

    public final String e() {
        return this.f10758b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f10757a, aVar.f10757a) && h.g.b.x.n(this.f10758b, aVar.f10758b) && h.g.b.x.n(this.f10759c, aVar.f10759c) && h.g.b.x.n(this.f10760d, aVar.f10760d) && h.g.b.x.n(this.f10761e, aVar.f10761e) && h.g.b.x.n(this.f10762f, aVar.f10762f);
    }

    public final List f() {
        return this.f10762f;
    }

    public final int hashCode() {
        return (((((((((this.f10757a.hashCode() * 31) + this.f10758b.hashCode()) * 31) + this.f10759c.hashCode()) * 31) + this.f10760d.hashCode()) * 31) + this.f10761e.hashCode()) * 31) + this.f10762f.hashCode();
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f10757a + ", versionName=" + this.f10758b + ", appBuildVersion=" + this.f10759c + ", deviceManufacturer=" + this.f10760d + ", currentProcessDetails=" + this.f10761e + ", appProcessDetails=" + this.f10762f + ")";
    }
}
