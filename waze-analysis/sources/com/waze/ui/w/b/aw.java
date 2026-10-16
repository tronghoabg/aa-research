package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aw extends com.waze.ui.j.h {

    /* renamed from: a, reason: collision with root package name */
    private final am f43622a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(am amVar) {
        super(null);
        h.g.b.x.f(amVar, "state");
        this.f43622a = amVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && h.g.b.x.n(this.f43622a, ((aw) obj).f43622a);
    }

    public final int hashCode() {
        return this.f43622a.hashCode();
    }

    public final am k() {
        return this.f43622a;
    }

    public final String toString() {
        return "Bardinio(state=" + this.f43622a + ")";
    }
}
