package com.waze.map;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class da {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28738a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.destination_cell.b.e f28739b;

    public da(com.waze.destination_cell.b.e eVar) {
        h.g.b.x.f(eVar, "position");
        this.f28739b = eVar;
        this.f28738a = false;
    }

    public final com.waze.destination_cell.b.e a() {
        return this.f28739b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        if (!h.g.b.x.n(this.f28739b, daVar.f28739b)) {
            return false;
        }
        boolean z = daVar.f28738a;
        return true;
    }

    public final int hashCode() {
        return (this.f28739b.hashCode() * 31) + DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER;
    }

    public final String toString() {
        return "UserLocationPositionRequestForPresenter(position=" + this.f28739b + ", animated=false)";
    }
}
