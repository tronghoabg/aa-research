package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hu extends com.waze.car_lib.p.dh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.o.x f19685a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(com.waze.car_lib.o.x xVar) {
        super(null);
        h.g.b.x.f(xVar, "settingMessage");
        this.f19685a = xVar;
    }

    public final com.waze.car_lib.o.x a() {
        return this.f19685a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu) && h.g.b.x.n(this.f19685a, ((hu) obj).f19685a);
    }

    public final int hashCode() {
        return this.f19685a.hashCode();
    }

    public final String toString() {
        return "OpenLongMessageScreen(settingMessage=" + this.f19685a + ")";
    }
}
