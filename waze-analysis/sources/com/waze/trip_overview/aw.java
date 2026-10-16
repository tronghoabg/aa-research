package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aw implements ax {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.x.g f41034a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.x.g f41035b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f41036c;

    public aw(com.waze.ui.x.g gVar, com.waze.ui.x.g gVar2, boolean z) {
        h.g.b.x.f(gVar, "tolls");
        h.g.b.x.f(gVar2, "ferries");
        this.f41034a = gVar;
        this.f41035b = gVar2;
        this.f41036c = z;
    }

    public final com.waze.ui.x.g a() {
        return this.f41035b;
    }

    public final com.waze.ui.x.g b() {
        return this.f41034a;
    }

    public final boolean c() {
        return this.f41036c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw)) {
            return false;
        }
        aw awVar = (aw) obj;
        return h.g.b.x.n(this.f41034a, awVar.f41034a) && h.g.b.x.n(this.f41035b, awVar.f41035b) && this.f41036c == awVar.f41036c;
    }

    public final int hashCode() {
        return (((this.f41034a.hashCode() * 31) + this.f41035b.hashCode()) * 31) + a.a.a(this.f41036c);
    }

    public final String toString() {
        return "Enabled(tolls=" + this.f41034a + ", ferries=" + this.f41035b + ", isSheetVisible=" + this.f41036c + ")";
    }
}
