package com.waze.bw.b.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f17677a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17678b;

    public a(b bVar, String str) {
        x.f(bVar, "location");
        this.f17677a = bVar;
        this.f17678b = str;
    }

    public final b a() {
        return this.f17677a;
    }

    public final String b() {
        return this.f17678b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f17677a, aVar.f17677a) && x.n(this.f17678b, aVar.f17678b);
    }

    public final int hashCode() {
        int iHashCode = this.f17677a.hashCode() * 31;
        String str = this.f17678b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Destination(location=" + this.f17677a + ", venueId=" + this.f17678b + ")";
    }

    public /* synthetic */ a(b bVar) {
        this(bVar, null);
    }
}
