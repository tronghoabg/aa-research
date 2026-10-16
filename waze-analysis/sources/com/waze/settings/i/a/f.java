package com.waze.settings.i.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    private final String f37406a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37407b;

    public f(String str, String str2) {
        x.f(str, "uuid");
        x.f(str2, "deepLinkWithWildCard");
        this.f37406a = str;
        this.f37407b = str2;
    }

    public final String a() {
        return this.f37407b;
    }

    public final String b() {
        return this.f37406a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f37406a, fVar.f37406a) && x.n(this.f37407b, fVar.f37407b);
    }

    public final int hashCode() {
        return (this.f37406a.hashCode() * 31) + this.f37407b.hashCode();
    }

    public final String toString() {
        return "ShareCustomVoice(uuid=" + this.f37406a + ", deepLinkWithWildCard=" + this.f37407b + ")";
    }
}
