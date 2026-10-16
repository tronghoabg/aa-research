package com.waze.map.g;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class v extends t {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f29107a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.destination_cell.b.e f29108b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.waze.destination_cell.b.e eVar) {
        super(null, null);
        h.g.b.x.f(eVar, "userPosition");
        this.f29108b = eVar;
        this.f29107a = false;
    }

    public final com.waze.destination_cell.b.e a() {
        return this.f29108b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!h.g.b.x.n(this.f29108b, vVar.f29108b)) {
            return false;
        }
        boolean z = vVar.f29107a;
        return true;
    }

    public final int hashCode() {
        return (this.f29108b.hashCode() * 31) + DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER;
    }

    public final String toString() {
        return "UpdateUserPosition(userPosition=" + this.f29108b + ", animated=false)";
    }
}
