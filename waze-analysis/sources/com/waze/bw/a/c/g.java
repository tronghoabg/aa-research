package com.waze.bw.a.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends b {

    /* renamed from: a, reason: collision with root package name */
    private final String f17645a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17646b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, String str2) {
        super(null);
        x.f(str, "departureTimeText");
        x.f(str2, "arrivalTimeText");
        this.f17645a = str;
        this.f17646b = str2;
    }

    public final String a() {
        return this.f17646b;
    }

    public final String d() {
        return this.f17645a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return x.n(this.f17645a, gVar.f17645a) && x.n(this.f17646b, gVar.f17646b);
    }

    public final int hashCode() {
        return (this.f17645a.hashCode() * 31) + this.f17646b.hashCode();
    }

    public final String toString() {
        return "Upcoming(departureTimeText=" + this.f17645a + ", arrivalTimeText=" + this.f17646b + ")";
    }
}
