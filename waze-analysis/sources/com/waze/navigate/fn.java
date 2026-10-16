package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fn {

    /* renamed from: a, reason: collision with root package name */
    private final String f31370a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31371b;

    public fn(String str, String str2) {
        h.g.b.x.f(str, "remainingTimeText");
        h.g.b.x.f(str2, "remainingDistanceText");
        this.f31370a = str;
        this.f31371b = str2;
    }

    public final String a() {
        return this.f31371b;
    }

    public final String b() {
        return this.f31370a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn)) {
            return false;
        }
        fn fnVar = (fn) obj;
        return h.g.b.x.n(this.f31370a, fnVar.f31370a) && h.g.b.x.n(this.f31371b, fnVar.f31371b);
    }

    public final int hashCode() {
        return (this.f31370a.hashCode() * 31) + this.f31371b.hashCode();
    }

    public final String toString() {
        return "RecenterBarModel(remainingTimeText=" + this.f31370a + ", remainingDistanceText=" + this.f31371b + ")";
    }

    public fn() {
        this(null);
    }

    public /* synthetic */ fn(byte[] bArr) {
        this("", "");
    }
}
