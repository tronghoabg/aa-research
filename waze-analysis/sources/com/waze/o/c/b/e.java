package com.waze.o.c.b;

import com.waze.t.b.bz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends bz {

    /* renamed from: a, reason: collision with root package name */
    private final long f32793a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32794b;

    public e(long j2, long j3) {
        super(null);
        this.f32793a = j2;
        this.f32794b = j3;
    }

    public final long a() {
        return this.f32793a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f32793a == eVar.f32793a && this.f32794b == eVar.f32794b;
    }

    public final int hashCode() {
        return (a.a.b(this.f32793a) * 31) + a.a.b(this.f32794b);
    }

    public final String toString() {
        return "StartNavigation(routeId=" + this.f32793a + ", altId=" + this.f32794b + ")";
    }
}
