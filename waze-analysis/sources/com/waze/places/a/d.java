package com.waze.places.a;

import h.g.b.x;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f33098a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.a.a f33099b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f33100c;

    public d(String str, com.waze.av.a.a aVar, com.waze.shared_infra.h.c cVar) {
        x.f(aVar, "address");
        x.f(cVar, "coordinate");
        this.f33098a = str;
        this.f33099b = aVar;
        this.f33100c = cVar;
    }

    public final boolean equals(Object obj) {
        String str;
        if (!(obj instanceof d)) {
            return false;
        }
        String str2 = this.f33098a;
        return (str2 == null || (str = ((d) obj).f33098a) == null) ? x.n(this.f33099b, ((d) obj).f33099b) : x.n(str, str2);
    }

    public final int hashCode() {
        com.waze.shared_infra.h.c cVar = this.f33100c;
        return new k(Integer.valueOf(cVar.c() >> 13), Integer.valueOf(cVar.d() >> 13)).hashCode();
    }
}
