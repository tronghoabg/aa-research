package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ev extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bo.b.c f41446a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(com.waze.bo.b.c cVar) {
        super(null);
        h.g.b.x.f(cVar, "trigger");
        this.f41446a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ev) && this.f41446a == ((ev) obj).f41446a;
    }

    public final int hashCode() {
        return this.f41446a.hashCode();
    }

    public final String toString() {
        return "RouteSettingsSheetClosing(trigger=" + this.f41446a + ")";
    }
}
