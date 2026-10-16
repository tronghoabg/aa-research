package com.waze.o.c.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r implements w {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32825a;

    public r(boolean z) {
        this.f32825a = z;
    }

    @Override // com.waze.t.b.cb
    public final boolean e() {
        return this.f32825a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f32825a == ((r) obj).f32825a;
    }

    public final int hashCode() {
        return a.a.a(this.f32825a);
    }

    public final String toString() {
        return "FavoriteUpdatedResult(success=" + this.f32825a + ")";
    }
}
