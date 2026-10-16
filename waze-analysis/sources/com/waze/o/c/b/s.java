package com.waze.o.c.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s implements w {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bl.c.b.j f32826a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32827b;

    public s(com.waze.bl.c.b.j jVar) {
        h.g.b.x.f(jVar, "result");
        this.f32826a = jVar;
        this.f32827b = jVar.e();
    }

    public final com.waze.bl.c.b.j a() {
        return this.f32826a;
    }

    @Override // com.waze.t.b.cb
    public final boolean e() {
        return this.f32827b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && h.g.b.x.n(this.f32826a, ((s) obj).f32826a);
    }

    public final int hashCode() {
        return this.f32826a.hashCode();
    }

    public final String toString() {
        return "ReportResult(result=" + this.f32826a + ")";
    }
}
