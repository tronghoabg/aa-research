package com.waze.app_nav.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends r {

    /* renamed from: a, reason: collision with root package name */
    private final String f15154a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15155b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, String str2, boolean z) {
        super(null);
        h.g.b.x.f(str, "model");
        this.f15154a = str;
        this.f15155b = str2;
        this.f15156c = z;
    }

    public final String a() {
        return this.f15154a;
    }

    public final String b() {
        return this.f15155b;
    }

    public final boolean c() {
        return this.f15156c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.g.b.x.n(this.f15154a, nVar.f15154a) && h.g.b.x.n(this.f15155b, nVar.f15155b) && this.f15156c == nVar.f15156c;
    }

    public final int hashCode() {
        int iHashCode = this.f15154a.hashCode() * 31;
        String str = this.f15155b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + a.a.a(this.f15156c);
    }

    public final String toString() {
        return "ShowSettings(model=" + this.f15154a + ", origin=" + this.f15155b + ", clearBackStack=" + this.f15156c + ")";
    }
}
