package com.waze.t.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f40841a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.design_components.b.d f40842b;

    public d(String str, com.waze.design_components.b.d dVar) {
        x.f(str, "text");
        this.f40841a = str;
        this.f40842b = dVar;
    }

    public final com.waze.design_components.b.d a() {
        return this.f40842b;
    }

    public final String b() {
        return this.f40841a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return x.n(this.f40841a, dVar.f40841a) && this.f40842b == dVar.f40842b;
    }

    public final int hashCode() {
        int iHashCode = this.f40841a.hashCode() * 31;
        com.waze.design_components.b.d dVar = this.f40842b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "ButtonProperties(text=" + this.f40841a + ", icon=" + this.f40842b + ")";
    }
}
