package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cb extends cg {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.ad f34942a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(com.waze.reports_v2.b.ad adVar) {
        super(null);
        h.g.b.x.f(adVar, "category");
        this.f34942a = adVar;
    }

    public final com.waze.reports_v2.b.ad a() {
        return this.f34942a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cb) && this.f34942a == ((cb) obj).f34942a;
    }

    public final int hashCode() {
        return this.f34942a.hashCode();
    }

    public final String toString() {
        return "CloseMenuWithLegacyCategory(category=" + this.f34942a + ")";
    }
}
