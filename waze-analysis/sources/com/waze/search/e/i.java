package com.waze.search.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f35627a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35628b;

    public i(com.waze.ui.ac.n nVar, boolean z) {
        h.g.b.x.f(nVar, "content");
        this.f35627a = nVar;
        this.f35628b = z;
    }

    public final com.waze.ui.ac.n a() {
        return this.f35627a;
    }

    public final boolean b() {
        return this.f35628b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.g.b.x.n(this.f35627a, iVar.f35627a) && this.f35628b == iVar.f35628b;
    }

    public final int hashCode() {
        return (this.f35627a.hashCode() * 31) + a.a.a(this.f35628b);
    }

    public final String toString() {
        return "Description(content=" + this.f35627a + ", enableSetAddress=" + this.f35628b + ")";
    }

    public /* synthetic */ i(com.waze.ui.ac.n nVar) {
        this(nVar, false);
    }
}
