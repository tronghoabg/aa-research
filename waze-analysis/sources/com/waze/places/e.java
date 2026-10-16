package com.waze.places;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e extends com.waze.reports_v2.presentation.p {

    /* renamed from: a, reason: collision with root package name */
    private final String f33106a;

    public e(String str) {
        super(null, null);
        this.f33106a = str;
    }

    public final String a() {
        return this.f33106a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && h.g.b.x.n(this.f33106a, ((e) obj).f33106a);
    }

    public final int hashCode() {
        String str = this.f33106a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "UnnamedRoad(city=" + this.f33106a + ")";
    }
}
