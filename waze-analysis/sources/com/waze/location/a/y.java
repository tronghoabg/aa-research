package com.waze.location.a;

import com.waze.location.bf;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final String f25231a;

    /* renamed from: b, reason: collision with root package name */
    private final bf f25232b;

    public y(String str, bf bfVar) {
        h.g.b.x.f(str, "provider");
        h.g.b.x.f(bfVar, "source");
        this.f25231a = str;
        this.f25232b = bfVar;
    }

    public final bf a() {
        return this.f25232b;
    }

    public final String b() {
        return this.f25231a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return h.g.b.x.n(this.f25231a, yVar.f25231a) && this.f25232b == yVar.f25232b;
    }

    public final int hashCode() {
        return (this.f25231a.hashCode() * 31) + this.f25232b.hashCode();
    }

    public final String toString() {
        return "LocationProvider(provider=" + this.f25231a + ", source=" + this.f25232b + ")";
    }
}
