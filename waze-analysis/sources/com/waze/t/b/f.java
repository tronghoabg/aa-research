package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends as {

    /* renamed from: a, reason: collision with root package name */
    private final h f40771a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(null, null);
        h.g.b.x.f(hVar, "controller");
        this.f40771a = hVar;
    }

    public final h a() {
        return this.f40771a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && h.g.b.x.n(this.f40771a, ((f) obj).f40771a);
    }

    public final int hashCode() {
        return this.f40771a.hashCode();
    }

    public final String toString() {
        return "Success(controller=" + this.f40771a + ")";
    }
}
