package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class az extends com.waze.ui.j.h {

    /* renamed from: a, reason: collision with root package name */
    private final ar f43625a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(ar arVar) {
        super(null);
        h.g.b.x.f(arVar, "state");
        this.f43625a = arVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof az) && h.g.b.x.n(this.f43625a, ((az) obj).f43625a);
    }

    public final int hashCode() {
        return this.f43625a.hashCode();
    }

    public final ar k() {
        return this.f43625a;
    }

    public final String toString() {
        return "ReportAgent(state=" + this.f43625a + ")";
    }
}
