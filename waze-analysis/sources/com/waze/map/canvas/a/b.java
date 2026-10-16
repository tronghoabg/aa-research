package com.waze.map.canvas.a;

import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f28493a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28494b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.destination_cell.b.e f28495c;

    public b(String str, com.waze.destination_cell.b.e eVar) {
        x.f(str, "uniqueId");
        x.f(eVar, "fit");
        this.f28493a = str;
        this.f28495c = eVar;
        this.f28494b = true;
    }

    public final com.waze.destination_cell.b.e a() {
        return this.f28495c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!x.n(this.f28493a, bVar.f28493a) || !x.n(this.f28495c, bVar.f28495c)) {
            return false;
        }
        boolean z = bVar.f28494b;
        return true;
    }

    public final int hashCode() {
        return (((this.f28493a.hashCode() * 31) + this.f28495c.hashCode()) * 31) + DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS;
    }

    public final String toString() {
        return "MapBoundsUniqueData(uniqueId=" + this.f28493a + ", fit=" + this.f28495c + ", animated=true)";
    }
}
