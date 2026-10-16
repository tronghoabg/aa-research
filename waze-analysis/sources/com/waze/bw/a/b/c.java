package com.waze.bw.a.b;

import com.waze.modules.navigation.ah;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f17570a;

    /* renamed from: b, reason: collision with root package name */
    private final ah f17571b;

    public c(com.waze.av.b.n nVar, ah ahVar) {
        x.f(nVar, "destinationGenericPlace");
        x.f(ahVar, "caller");
        this.f17570a = nVar;
        this.f17571b = ahVar;
    }

    public final com.waze.av.b.n a() {
        return this.f17570a;
    }

    public final ah b() {
        return this.f17571b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f17570a, cVar.f17570a) && this.f17571b == cVar.f17571b;
    }

    public final int hashCode() {
        return (this.f17570a.hashCode() * 31) + this.f17571b.hashCode();
    }

    public final String toString() {
        return "StartNavigation(destinationGenericPlace=" + this.f17570a + ", caller=" + this.f17571b + ")";
    }

    private c() {
        throw null;
    }
}
