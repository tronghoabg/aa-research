package com.waze.o.c.b;

import com.waze.t.b.bz;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends bz {

    /* renamed from: a, reason: collision with root package name */
    private final String f32787a;

    /* renamed from: b, reason: collision with root package name */
    private final List f32788b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, List list, boolean z) {
        super(null);
        h.g.b.x.f(str, "venueId");
        h.g.b.x.f(list, "routingOptions");
        this.f32787a = str;
        this.f32788b = list;
        this.f32789c = z;
    }

    public final String a() {
        return this.f32787a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f32787a, aVar.f32787a) && h.g.b.x.n(this.f32788b, aVar.f32788b) && this.f32789c == aVar.f32789c;
    }

    public final int hashCode() {
        return (((this.f32787a.hashCode() * 31) + this.f32788b.hashCode()) * 31) + a.a.a(this.f32789c);
    }

    public final String toString() {
        return "CalculateRoute(venueId=" + this.f32787a + ", routingOptions=" + this.f32788b + ", showOverview=" + this.f32789c + ")";
    }
}
