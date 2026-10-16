package com.waze.map.b;

import com.waze.jni.protos.EtaLabelDefinitions;
import com.waze.jni.protos.Position;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dq {

    /* renamed from: a, reason: collision with root package name */
    private final Position.IntPosition f28219a;

    /* renamed from: b, reason: collision with root package name */
    private final EtaLabelDefinitions.PinAlignment f28220b;

    public dq(Position.IntPosition intPosition, EtaLabelDefinitions.PinAlignment pinAlignment) {
        h.g.b.x.f(intPosition, "position");
        h.g.b.x.f(pinAlignment, "alignment");
        this.f28219a = intPosition;
        this.f28220b = pinAlignment;
    }

    public final EtaLabelDefinitions.PinAlignment a() {
        return this.f28220b;
    }

    public final Position.IntPosition b() {
        return this.f28219a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq)) {
            return false;
        }
        dq dqVar = (dq) obj;
        return h.g.b.x.n(this.f28219a, dqVar.f28219a) && this.f28220b == dqVar.f28220b;
    }

    public final int hashCode() {
        return (this.f28219a.hashCode() * 31) + this.f28220b.hashCode();
    }

    public final String toString() {
        return "PositionAndAlignment(position=" + this.f28219a + ", alignment=" + this.f28220b + ")";
    }
}
