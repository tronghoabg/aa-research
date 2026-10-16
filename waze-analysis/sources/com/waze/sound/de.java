package com.waze.sound;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class de {

    /* renamed from: a, reason: collision with root package name */
    private final List f39761a;

    /* renamed from: b, reason: collision with root package name */
    private final bz f39762b;

    public de(List list, bz bzVar) {
        h.g.b.x.f(list, "turnByTurnInstructions");
        h.g.b.x.f(bzVar, "initialAnnouncement");
        this.f39761a = list;
        this.f39762b = bzVar;
    }

    public final bz a() {
        return this.f39762b;
    }

    public final List b() {
        return this.f39761a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de)) {
            return false;
        }
        de deVar = (de) obj;
        return h.g.b.x.n(this.f39761a, deVar.f39761a) && h.g.b.x.n(this.f39762b, deVar.f39762b);
    }

    public final int hashCode() {
        return (this.f39761a.hashCode() * 31) + this.f39762b.hashCode();
    }

    public final String toString() {
        return "RouteInstructionsData(turnByTurnInstructions=" + this.f39761a + ", initialAnnouncement=" + this.f39762b + ")";
    }
}
