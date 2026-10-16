package com.waze.bl.d;

import com.waze.bl.b.c.r;
import com.waze.ui.w.b.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ar f17073a;

    /* renamed from: b, reason: collision with root package name */
    private final r f17074b;

    public b(ar arVar, r rVar) {
        x.f(arVar, "uiState");
        x.f(rVar, "mapState");
        this.f17073a = arVar;
        this.f17074b = rVar;
    }

    public final ar a() {
        return this.f17073a;
    }

    public final r b() {
        return this.f17074b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f17073a, bVar.f17073a) && x.n(this.f17074b, bVar.f17074b);
    }

    public final int hashCode() {
        return (this.f17073a.hashCode() * 31) + this.f17074b.hashCode();
    }

    public final String toString() {
        return "ReportAgentState(uiState=" + this.f17073a + ", mapState=" + this.f17074b + ")";
    }
}
