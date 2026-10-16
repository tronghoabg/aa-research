package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35816a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.br.b.w f35817b;

    public bd(boolean z, com.waze.br.b.w wVar) {
        this.f35816a = z;
        this.f35817b = wVar;
    }

    public final boolean a() {
        return this.f35816a;
    }

    public final com.waze.br.b.w b() {
        return this.f35817b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return this.f35816a == bdVar.f35816a && h.g.b.x.n(this.f35817b, bdVar.f35817b);
    }

    public final int hashCode() {
        com.waze.br.b.w wVar = this.f35817b;
        return (a.a.a(this.f35816a) * 31) + (wVar == null ? 0 : wVar.hashCode());
    }

    public final String toString() {
        return "Args(addStopMode=" + this.f35816a + ", searchMateController=" + this.f35817b + ")";
    }
}
