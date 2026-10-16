package com.waze.o.c.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f32799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super(null);
        h.g.b.x.f(str, "venueId");
        this.f32799a = str;
    }

    public final String a() {
        return this.f32799a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && h.g.b.x.n(this.f32799a, ((h) obj).f32799a);
    }

    public final int hashCode() {
        return this.f32799a.hashCode();
    }

    public final String toString() {
        return "Delete(venueId=" + this.f32799a + ")";
    }
}
