package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bp extends bs {

    /* renamed from: a, reason: collision with root package name */
    private final ba f40754a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(ba baVar) {
        super(null);
        h.g.b.x.f(baVar, "reason");
        this.f40754a = baVar;
    }

    public final ba a() {
        return this.f40754a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bp) && this.f40754a == ((bp) obj).f40754a;
    }

    public final int hashCode() {
        return this.f40754a.hashCode();
    }

    public final String toString() {
        return "Paused(reason=" + this.f40754a + ")";
    }
}
