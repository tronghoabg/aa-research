package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y extends aa {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.w.b.an f35081a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.waze.ui.w.b.an anVar) {
        super(null);
        h.g.b.x.f(anVar, "variant");
        this.f35081a = anVar;
    }

    public final com.waze.ui.w.b.an a() {
        return this.f35081a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f35081a == ((y) obj).f35081a;
    }

    public final int hashCode() {
        return this.f35081a.hashCode();
    }

    public final String toString() {
        return "StartFteHint(variant=" + this.f35081a + ")";
    }
}
