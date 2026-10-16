package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class df {

    /* renamed from: a, reason: collision with root package name */
    private final String f31234a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31235b;

    public df(String str, String str2) {
        h.g.b.x.f(str, "resourceName");
        h.g.b.x.f(str2, "text");
        this.f31234a = str;
        this.f31235b = str2;
    }

    public final String a() {
        return this.f31234a;
    }

    public final String b() {
        return this.f31235b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df)) {
            return false;
        }
        df dfVar = (df) obj;
        return h.g.b.x.n(this.f31234a, dfVar.f31234a) && h.g.b.x.n(this.f31235b, dfVar.f31235b);
    }

    public final int hashCode() {
        return (this.f31234a.hashCode() * 31) + this.f31235b.hashCode();
    }

    public final String toString() {
        return "NavigationExitSign(resourceName=" + this.f31234a + ", text=" + this.f31235b + ")";
    }
}
