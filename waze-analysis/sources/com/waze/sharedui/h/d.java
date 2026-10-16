package com.waze.sharedui.h;

import com.waze.shared_infra.q.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends m {

    /* renamed from: a, reason: collision with root package name */
    private final h f39032a;

    /* renamed from: b, reason: collision with root package name */
    private final c f39033b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f39034c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f39035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, c cVar, Long l2, Integer num) {
        super(null);
        x.f(hVar, "requestResult");
        x.f(cVar, "api");
        this.f39032a = hVar;
        this.f39033b = cVar;
        this.f39034c = l2;
        this.f39035d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return x.n(this.f39032a, dVar.f39032a) && this.f39033b == dVar.f39033b && x.n(this.f39034c, dVar.f39034c) && x.n(this.f39035d, dVar.f39035d);
    }

    public final c g() {
        return this.f39033b;
    }

    public final h h() {
        return this.f39032a;
    }

    public final int hashCode() {
        int iHashCode = (this.f39032a.hashCode() * 31) + this.f39033b.hashCode();
        Long l2 = this.f39034c;
        int iHashCode2 = ((iHashCode * 31) + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f39035d;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final Integer i() {
        return this.f39035d;
    }

    public final Long j() {
        return this.f39034c;
    }

    public final String toString() {
        return "End(requestResult=" + this.f39032a + ", api=" + this.f39033b + ", latencyMs=" + this.f39034c + ", attemptsCount=" + this.f39035d + ")";
    }
}
