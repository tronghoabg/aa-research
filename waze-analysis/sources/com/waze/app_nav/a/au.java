package com.waze.app_nav.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class au extends ax {

    /* renamed from: a, reason: collision with root package name */
    private final at f15120a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(at atVar) {
        super(null);
        h.g.b.x.f(atVar, "result");
        this.f15120a = atVar;
    }

    public final at a() {
        return this.f15120a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au) && h.g.b.x.n(this.f15120a, ((au) obj).f15120a);
    }

    public final int hashCode() {
        return this.f15120a.hashCode();
    }

    public final String toString() {
        return "Close(result=" + this.f15120a + ")";
    }
}
