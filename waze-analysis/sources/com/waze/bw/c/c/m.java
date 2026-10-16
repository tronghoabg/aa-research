package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends com.waze.sharedui.api.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.k f17854a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.waze.av.b.k kVar) {
        super(null, null);
        h.g.b.x.f(kVar, "genericPlace");
        this.f17854a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && h.g.b.x.n(this.f17854a, ((m) obj).f17854a);
    }

    public final com.waze.av.b.k g() {
        return this.f17854a;
    }

    public final int hashCode() {
        return this.f17854a.hashCode();
    }

    public final String toString() {
        return "OpenRenameNamedFavoriteDialog(genericPlace=" + this.f17854a + ")";
    }
}
