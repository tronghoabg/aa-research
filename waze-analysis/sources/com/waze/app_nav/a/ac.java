package com.waze.app_nav.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac extends ad {

    /* renamed from: a, reason: collision with root package name */
    private final String f15100a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15101b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15102c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(String str, String str2, boolean z) {
        super(null);
        h.g.b.x.f(str, "model");
        this.f15100a = str;
        this.f15101b = str2;
        this.f15102c = z;
    }

    public final String a() {
        return this.f15100a;
    }

    public final String b() {
        return this.f15101b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return h.g.b.x.n(this.f15100a, acVar.f15100a) && h.g.b.x.n(this.f15101b, acVar.f15101b) && this.f15102c == acVar.f15102c;
    }

    public final int hashCode() {
        int iHashCode = this.f15100a.hashCode() * 31;
        String str = this.f15101b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + a.a.a(this.f15102c);
    }

    public final String toString() {
        return "Start(model=" + this.f15100a + ", origin=" + this.f15101b + ", clearBackStack=" + this.f15102c + ")";
    }
}
