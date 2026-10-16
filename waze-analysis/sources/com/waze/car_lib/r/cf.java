package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cf {

    /* renamed from: a, reason: collision with root package name */
    private final ce f21195a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.navigate.de f21196b;

    /* renamed from: c, reason: collision with root package name */
    private final ce f21197c;

    public cf(ce ceVar, com.waze.navigate.de deVar, ce ceVar2) {
        this.f21195a = ceVar;
        this.f21196b = deVar;
        this.f21197c = ceVar2;
    }

    public final ce a() {
        return this.f21195a;
    }

    public final ce b() {
        return this.f21197c;
    }

    public final com.waze.navigate.de c() {
        return this.f21196b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return h.g.b.x.n(this.f21195a, cfVar.f21195a) && h.g.b.x.n(this.f21196b, cfVar.f21196b) && h.g.b.x.n(this.f21197c, cfVar.f21197c);
    }

    public final int hashCode() {
        ce ceVar = this.f21195a;
        int iHashCode = ceVar == null ? 0 : ceVar.hashCode();
        com.waze.navigate.de deVar = this.f21196b;
        int iHashCode2 = deVar == null ? 0 : deVar.hashCode();
        int i2 = iHashCode * 31;
        ce ceVar2 = this.f21197c;
        return ((i2 + iHashCode2) * 31) + (ceVar2 != null ? ceVar2.hashCode() : 0);
    }

    public final String toString() {
        return "InstructionsState(currentInstructionState=" + this.f21195a + ", currentInstructionDistance=" + this.f21196b + ", nextInstructionState=" + this.f21197c + ")";
    }
}
