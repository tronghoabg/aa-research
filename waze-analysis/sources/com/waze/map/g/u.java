package com.waze.map.g;

import com.waze.map.b.Cdo;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class u extends t {

    /* renamed from: a, reason: collision with root package name */
    private final Cdo f29104a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29105b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.destination_cell.b.e f29106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Cdo cdo, com.waze.destination_cell.b.e eVar) {
        super(null, null);
        h.g.b.x.f(cdo, "behavior");
        h.g.b.x.f(eVar, "userPosition");
        this.f29104a = cdo;
        this.f29106c = eVar;
        this.f29105b = true;
    }

    public final Cdo a() {
        return this.f29104a;
    }

    public final com.waze.destination_cell.b.e c() {
        return this.f29106c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f29104a != uVar.f29104a || !h.g.b.x.n(this.f29106c, uVar.f29106c)) {
            return false;
        }
        boolean z = uVar.f29105b;
        return true;
    }

    public final int hashCode() {
        return (((this.f29104a.hashCode() * 31) + this.f29106c.hashCode()) * 31) + DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS;
    }

    public final String toString() {
        return "ChangeNorthLockBehavior(behavior=" + this.f29104a + ", userPosition=" + this.f29106c + ", animated=true)";
    }
}
