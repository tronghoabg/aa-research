package com.waze.main_screen.o;

import androidx.autofill.HintConstants;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f26681a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26682b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26683c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26684d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26685e;

    /* renamed from: f, reason: collision with root package name */
    private final String f26686f;

    public b(String str, String str2, String str3, String str4, String str5, String str6) {
        x.f(str, "bannerId");
        x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        x.f(str3, "text");
        x.f(str4, "callToAction");
        x.f(str5, "actionDeeplink");
        x.f(str6, "imageUrl");
        this.f26681a = str;
        this.f26682b = str2;
        this.f26683c = str3;
        this.f26684d = str4;
        this.f26685e = str5;
        this.f26686f = str6;
    }

    public final String a() {
        return this.f26685e;
    }

    public final String b() {
        return this.f26681a;
    }

    public final String c() {
        return this.f26684d;
    }

    public final String d() {
        return this.f26686f;
    }

    public final String e() {
        return this.f26682b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f26681a, bVar.f26681a) && x.n(this.f26682b, bVar.f26682b) && x.n(this.f26683c, bVar.f26683c) && x.n(this.f26684d, bVar.f26684d) && x.n(this.f26685e, bVar.f26685e) && x.n(this.f26686f, bVar.f26686f);
    }

    public final String f() {
        return this.f26683c;
    }

    public final int hashCode() {
        return (((((((((this.f26681a.hashCode() * 31) + this.f26682b.hashCode()) * 31) + this.f26683c.hashCode()) * 31) + this.f26684d.hashCode()) * 31) + this.f26685e.hashCode()) * 31) + this.f26686f.hashCode();
    }

    public final String toString() {
        return "MainMenuBannerModel(bannerId=" + this.f26681a + ", name=" + this.f26682b + ", text=" + this.f26683c + ", callToAction=" + this.f26684d + ", actionDeeplink=" + this.f26685e + ", imageUrl=" + this.f26686f + ")";
    }
}
