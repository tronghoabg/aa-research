package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ee extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.uid.r f41428a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(com.waze.uid.r rVar) {
        super(null);
        h.g.b.x.f(rVar, "buttonType");
        this.f41428a = rVar;
    }

    public final com.waze.uid.r a() {
        return this.f41428a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee) && h.g.b.x.n(this.f41428a, ((ee) obj).f41428a);
    }

    public final int hashCode() {
        return this.f41428a.hashCode();
    }

    public final String toString() {
        return "MainButtonClicked(buttonType=" + this.f41428a + ")";
    }
}
