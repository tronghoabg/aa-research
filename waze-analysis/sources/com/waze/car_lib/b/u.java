package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u extends v {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.alerters.a.a f19140a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.waze.alerters.a.a aVar) {
        super((byte[]) null);
        h.g.b.x.f(aVar, "action");
        this.f19140a = aVar;
    }

    public final com.waze.alerters.a.a a() {
        return this.f19140a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f19140a == ((u) obj).f19140a;
    }

    public final int hashCode() {
        return this.f19140a.hashCode();
    }

    public final String toString() {
        return "PredefinedAction(action=" + this.f19140a + ")";
    }
}
