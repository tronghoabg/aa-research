package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends aa {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.w.b.bg f35074a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.waze.ui.w.b.bg bgVar) {
        super(null);
        h.g.b.x.f(bgVar, "reason");
        this.f35074a = bgVar;
    }

    public final com.waze.ui.w.b.bg a() {
        return this.f35074a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f35074a == ((t) obj).f35074a;
    }

    public final int hashCode() {
        return this.f35074a.hashCode();
    }

    public final String toString() {
        return "Cancelled(reason=" + this.f35074a + ")";
    }
}
