package com.waze.sharedui.f;

import androidx.autofill.HintConstants;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f38903a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38904b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38905c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38906d;

    /* renamed from: e, reason: collision with root package name */
    private final String f38907e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f38908f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f38909g;

    public h(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        x.f(str, "userName");
        x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        x.f(str3, "token");
        x.f(str4, "firstName");
        x.f(str5, "lastName");
        this.f38903a = str;
        this.f38904b = str2;
        this.f38905c = str3;
        this.f38906d = str4;
        this.f38907e = str5;
        this.f38908f = z;
        this.f38909g = z2;
    }

    public final String a() {
        return this.f38906d;
    }

    public final String b() {
        return this.f38907e;
    }

    public final String c() {
        return this.f38904b;
    }

    public final String d() {
        return this.f38905c;
    }

    public final String e() {
        return this.f38903a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return x.n(this.f38903a, hVar.f38903a) && x.n(this.f38904b, hVar.f38904b) && x.n(this.f38905c, hVar.f38905c) && x.n(this.f38906d, hVar.f38906d) && x.n(this.f38907e, hVar.f38907e) && this.f38908f == hVar.f38908f && this.f38909g == hVar.f38909g;
    }

    public final int hashCode() {
        return (((((((((((this.f38903a.hashCode() * 31) + this.f38904b.hashCode()) * 31) + this.f38905c.hashCode()) * 31) + this.f38906d.hashCode()) * 31) + this.f38907e.hashCode()) * 31) + a.a.a(this.f38908f)) * 31) + a.a.a(this.f38909g);
    }

    public final String toString() {
        return "LoginData(userName=" + this.f38903a + ", password=" + this.f38904b + ", token=" + this.f38905c + ", firstName=" + this.f38906d + ", lastName=" + this.f38907e + ", newUser=" + this.f38908f + ", isGuest=" + this.f38909g + ")";
    }

    public /* synthetic */ h(String str, String str2, String str3, String str4, String str5, boolean z) {
        this(str, str2, str3, str4, str5, z, false);
    }
}
