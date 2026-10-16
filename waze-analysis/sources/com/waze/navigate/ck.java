package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ck {

    /* renamed from: a, reason: collision with root package name */
    private final String f31167a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31168b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31169c;

    public ck(String str, String str2, int i2) {
        h.g.b.x.f(str, "str");
        h.g.b.x.f(str2, "unit");
        this.f31167a = str;
        this.f31168b = str2;
        this.f31169c = i2;
    }

    public final int a() {
        return this.f31169c;
    }

    public final String b() {
        return this.f31167a;
    }

    public final String c() {
        return this.f31168b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        return h.g.b.x.n(this.f31167a, ckVar.f31167a) && h.g.b.x.n(this.f31168b, ckVar.f31168b) && this.f31169c == ckVar.f31169c;
    }

    public final int hashCode() {
        return (((this.f31167a.hashCode() * 31) + this.f31168b.hashCode()) * 31) + this.f31169c;
    }

    public final String toString() {
        return "EtaTimeState(str=" + this.f31167a + ", unit=" + this.f31168b + ", minutes=" + this.f31169c + ")";
    }
}
