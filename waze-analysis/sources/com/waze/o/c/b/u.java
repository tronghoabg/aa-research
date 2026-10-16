package com.waze.o.c.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32829a;

    public u(boolean z) {
        this.f32829a = z;
    }

    @Override // com.waze.t.b.cb
    public final boolean e() {
        return this.f32829a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f32829a == ((u) obj).f32829a;
    }

    public final int hashCode() {
        return a.a.a(this.f32829a);
    }

    public final String toString() {
        return "StartNavigationResult(success=" + this.f32829a + ")";
    }
}
