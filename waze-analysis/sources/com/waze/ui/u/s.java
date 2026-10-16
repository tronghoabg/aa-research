package com.waze.ui.u;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    private final aj f43467a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(aj ajVar) {
        super(null);
        h.g.b.x.f(ajVar, "state");
        this.f43467a = ajVar;
    }

    public final aj a() {
        return this.f43467a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && h.g.b.x.n(this.f43467a, ((s) obj).f43467a);
    }

    public final int hashCode() {
        return this.f43467a.hashCode();
    }

    public final String toString() {
        return "Prediction(state=" + this.f43467a + ")";
    }
}
