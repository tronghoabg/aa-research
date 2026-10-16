package com.waze.main_screen.ae.a;

import com.waze.sdk.bk;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final bk f25716a;

    /* renamed from: b, reason: collision with root package name */
    private final c f25717b;

    public b(bk bkVar, c cVar) {
        x.f(bkVar, "button");
        this.f25716a = bkVar;
        this.f25717b = cVar;
    }

    public final c a() {
        return this.f25717b;
    }

    public final bk b() {
        return this.f25716a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f25716a, bVar.f25716a) && x.n(this.f25717b, bVar.f25717b);
    }

    public final int hashCode() {
        int iHashCode = this.f25716a.hashCode() * 31;
        c cVar = this.f25717b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "State(button=" + this.f25716a + ", tooltip=" + this.f25717b + ")";
    }
}
