package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class di implements cz {

    /* renamed from: a, reason: collision with root package name */
    private final int f28190a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28191b;

    public di(int i2, com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        this.f28190a = i2;
        this.f28191b = cVar;
    }

    public final int a() {
        return this.f28190a;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f28191b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di)) {
            return false;
        }
        di diVar = (di) obj;
        return this.f28190a == diVar.f28190a && h.g.b.x.n(this.f28191b, diVar.f28191b);
    }

    public final int hashCode() {
        return (this.f28190a * 31) + this.f28191b.hashCode();
    }

    public final String toString() {
        return "WazerClicked(id=" + this.f28190a + ", coordinate=" + this.f28191b + ")";
    }
}
