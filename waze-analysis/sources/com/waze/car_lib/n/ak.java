package com.waze.car_lib.n;

import com.waze.car_lib.r.cr;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak extends cr {

    /* renamed from: a, reason: collision with root package name */
    private final List f20366a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(List list) {
        super((byte[]) null);
        h.g.b.x.f(list, "items");
        this.f20366a = list;
    }

    public final List a() {
        return this.f20366a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak) && h.g.b.x.n(this.f20366a, ((ak) obj).f20366a);
    }

    public final int hashCode() {
        return this.f20366a.hashCode();
    }

    public final String toString() {
        return "EmptyText(items=" + this.f20366a + ")";
    }
}
