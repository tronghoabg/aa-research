package com.waze.search.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac extends com.waze.settings.v implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final List f35613a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.search.v2.o f35614b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(com.waze.search.v2.o oVar, List list) {
        super(null, null);
        h.g.b.x.f(list, "data");
        this.f35614b = oVar;
        this.f35613a = list;
    }

    public static /* synthetic */ ac c(ac acVar, com.waze.search.v2.o oVar) {
        List list = acVar.f35613a;
        h.g.b.x.f(list, "data");
        return new ac(oVar, list);
    }

    @Override // com.waze.search.e.ad
    public final List a() {
        return this.f35613a;
    }

    public final com.waze.search.v2.o b() {
        return this.f35614b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return h.g.b.x.n(this.f35614b, acVar.f35614b) && h.g.b.x.n(this.f35613a, acVar.f35613a);
    }

    public final int hashCode() {
        com.waze.search.v2.o oVar = this.f35614b;
        return ((oVar == null ? 0 : oVar.hashCode()) * 31) + this.f35613a.hashCode();
    }

    public final String toString() {
        return "AutoComplete(loading=" + this.f35614b + ", data=" + this.f35613a + ")";
    }
}
