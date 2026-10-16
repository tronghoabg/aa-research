package com.waze.planned_drive;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k extends m {

    /* renamed from: a, reason: collision with root package name */
    private final String f33346a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33347b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, String str2) {
        super(null);
        h.g.b.x.f(str, "errorTitle");
        h.g.b.x.f(str2, "errorMsg");
        this.f33346a = str;
        this.f33347b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.g.b.x.n(this.f33346a, kVar.f33346a) && h.g.b.x.n(this.f33347b, kVar.f33347b);
    }

    public final int hashCode() {
        return (this.f33346a.hashCode() * 31) + this.f33347b.hashCode();
    }

    public final String toString() {
        return "Failure(errorTitle=" + this.f33346a + ", errorMsg=" + this.f33347b + ")";
    }
}
