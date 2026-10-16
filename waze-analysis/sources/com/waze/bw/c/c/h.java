package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends com.waze.sharedui.api.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f17849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.waze.av.b.n nVar) {
        super(null, null);
        h.g.b.x.f(nVar, "genericPlace");
        this.f17849a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && h.g.b.x.n(this.f17849a, ((h) obj).f17849a);
    }

    public final com.waze.av.b.n g() {
        return this.f17849a;
    }

    public final int hashCode() {
        return this.f17849a.hashCode();
    }

    public final String toString() {
        return "OpenLocationPreviewScreen(genericPlace=" + this.f17849a + ")";
    }
}
