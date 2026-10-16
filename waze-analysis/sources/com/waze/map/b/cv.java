package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cv implements cz {

    /* renamed from: a, reason: collision with root package name */
    private final int f28169a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28170b;

    public cv(int i2, com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        this.f28169a = i2;
        this.f28170b = cVar;
    }

    public final int a() {
        return this.f28169a;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f28170b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv)) {
            return false;
        }
        cv cvVar = (cv) obj;
        return this.f28169a == cvVar.f28169a && h.g.b.x.n(this.f28170b, cvVar.f28170b);
    }

    public final int hashCode() {
        return (this.f28169a * 31) + this.f28170b.hashCode();
    }

    public final String toString() {
        return "AlertClicked(id=" + this.f28169a + ", coordinate=" + this.f28170b + ")";
    }
}
