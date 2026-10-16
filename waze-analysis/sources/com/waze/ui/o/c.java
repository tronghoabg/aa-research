package com.waze.ui.o;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f43136a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43137b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43138c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43139d;

    /* renamed from: e, reason: collision with root package name */
    private final String f43140e;

    /* renamed from: f, reason: collision with root package name */
    private final String f43141f;

    /* renamed from: g, reason: collision with root package name */
    private final int f43142g;

    public c(String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        h.g.b.x.f(str, "bannerId");
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str3, "text");
        h.g.b.x.f(str4, "callToAction");
        h.g.b.x.f(str5, "actionDeeplink");
        h.g.b.x.f(str6, "imageUrl");
        this.f43136a = str;
        this.f43137b = str2;
        this.f43138c = str3;
        this.f43139d = str4;
        this.f43140e = str5;
        this.f43141f = str6;
        this.f43142g = i2;
    }

    public final int a() {
        return this.f43142g;
    }

    public final String b() {
        return this.f43140e;
    }

    public final String c() {
        return this.f43136a;
    }

    public final String d() {
        return this.f43139d;
    }

    public final String e() {
        return this.f43141f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.g.b.x.n(this.f43136a, cVar.f43136a) && h.g.b.x.n(this.f43137b, cVar.f43137b) && h.g.b.x.n(this.f43138c, cVar.f43138c) && h.g.b.x.n(this.f43139d, cVar.f43139d) && h.g.b.x.n(this.f43140e, cVar.f43140e) && h.g.b.x.n(this.f43141f, cVar.f43141f) && this.f43142g == cVar.f43142g;
    }

    public final String f() {
        return this.f43137b;
    }

    public final String g() {
        return this.f43138c;
    }

    public final int hashCode() {
        return (((((((((((this.f43136a.hashCode() * 31) + this.f43137b.hashCode()) * 31) + this.f43138c.hashCode()) * 31) + this.f43139d.hashCode()) * 31) + this.f43140e.hashCode()) * 31) + this.f43141f.hashCode()) * 31) + this.f43142g;
    }

    public final String toString() {
        return "MainMenuBannerUiModel(bannerId=" + this.f43136a + ", name=" + this.f43137b + ", text=" + this.f43138c + ", callToAction=" + this.f43139d + ", actionDeeplink=" + this.f43140e + ", imageUrl=" + this.f43141f + ", position=" + this.f43142g + ")";
    }
}
