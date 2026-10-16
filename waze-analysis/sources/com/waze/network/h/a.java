package com.waze.network.h;

import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f32387a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32388b;

    /* renamed from: c, reason: collision with root package name */
    private final l f32389c;

    public a(Object obj, long j2, l lVar) {
        x.f(lVar, "task");
        this.f32387a = obj;
        this.f32388b = j2;
        this.f32389c = lVar;
    }

    public final long a() {
        return this.f32388b;
    }

    public final Object b() {
        return this.f32387a;
    }

    public final l c() {
        return this.f32389c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f32387a, aVar.f32387a) && this.f32388b == aVar.f32388b && x.n(this.f32389c, aVar.f32389c);
    }

    public final int hashCode() {
        Object obj = this.f32387a;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + a.a.b(this.f32388b)) * 31) + this.f32389c.hashCode();
    }

    public final String toString() {
        return "QueueItem(priority=" + this.f32387a + ", insertionId=" + this.f32388b + ", task=" + this.f32389c + ")";
    }
}
