package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v implements x {

    /* renamed from: a, reason: collision with root package name */
    private final m f17311a;

    public v(m mVar) {
        h.g.b.x.f(mVar, "mateActionResult");
        this.f17311a = mVar;
    }

    public final m a() {
        return this.f17311a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && h.g.b.x.n(this.f17311a, ((v) obj).f17311a);
    }

    public final int hashCode() {
        return this.f17311a.hashCode();
    }

    public final String toString() {
        return "ActionResult(mateActionResult=" + this.f17311a + ")";
    }
}
