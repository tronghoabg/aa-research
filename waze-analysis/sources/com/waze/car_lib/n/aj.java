package com.waze.car_lib.n;

import com.waze.car_lib.r.cr;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aj extends cr {

    /* renamed from: a, reason: collision with root package name */
    private final String f20364a;

    /* renamed from: b, reason: collision with root package name */
    private final List f20365b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(String str, List list) {
        super((byte[]) null);
        h.g.b.x.f(str, "searchTerm");
        h.g.b.x.f(list, "items");
        this.f20364a = str;
        this.f20365b = list;
    }

    public final String a() {
        return this.f20364a;
    }

    public final List b() {
        return this.f20365b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return h.g.b.x.n(this.f20364a, ajVar.f20364a) && h.g.b.x.n(this.f20365b, ajVar.f20365b);
    }

    public final int hashCode() {
        return (this.f20364a.hashCode() * 31) + this.f20365b.hashCode();
    }

    public final String toString() {
        return "Autocomplete(searchTerm=" + this.f20364a + ", items=" + this.f20365b + ")";
    }
}
