package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jr extends com.waze.car_lib.p.dh {

    /* renamed from: a, reason: collision with root package name */
    private final jq f19767a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(jq jqVar) {
        super(null);
        h.g.b.x.f(jqVar, "reason");
        this.f19767a = jqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jr) && this.f19767a == ((jr) obj).f19767a;
    }

    public final int hashCode() {
        return this.f19767a.hashCode();
    }

    public final String toString() {
        return "Dismissed(reason=" + this.f19767a + ")";
    }
}
