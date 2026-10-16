package com.waze.search.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae extends com.waze.settings.v implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final List f35615a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(List list) {
        super(null, null);
        h.g.b.x.f(list, "data");
        this.f35615a = list;
    }

    @Override // com.waze.search.e.ad
    public final List a() {
        return this.f35615a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae) && h.g.b.x.n(this.f35615a, ((ae) obj).f35615a);
    }

    public final int hashCode() {
        return this.f35615a.hashCode();
    }

    public final String toString() {
        return "EmptyState(data=" + this.f35615a + ")";
    }
}
