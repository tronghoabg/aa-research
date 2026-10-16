package com.waze.nav_connect.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f30715a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30716b;

    public d(String str, String str2) {
        x.f(str, "isvBusinessName");
        x.f(str2, "isvPrivacyPolicyUrl");
        this.f30715a = str;
        this.f30716b = str2;
    }

    public final String a() {
        return this.f30715a;
    }

    public final String b() {
        return this.f30716b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return x.n(this.f30715a, dVar.f30715a) && x.n(this.f30716b, dVar.f30716b);
    }

    public final int hashCode() {
        return (this.f30715a.hashCode() * 31) + this.f30716b.hashCode();
    }

    public final String toString() {
        return "IsvInfo(isvBusinessName=" + this.f30715a + ", isvPrivacyPolicyUrl=" + this.f30716b + ")";
    }
}
