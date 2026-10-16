package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ha extends com.waze.car_lib.o.ae {

    /* renamed from: a, reason: collision with root package name */
    private final gu f19643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(gu guVar) {
        super(null);
        h.g.b.x.f(guVar, "filter");
        this.f19643a = guVar;
    }

    public final gu a() {
        return this.f19643a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha) && this.f19643a == ((ha) obj).f19643a;
    }

    public final int hashCode() {
        return this.f19643a.hashCode();
    }

    public final String toString() {
        return "OpenSearchPlaces(filter=" + this.f19643a + ")";
    }
}
