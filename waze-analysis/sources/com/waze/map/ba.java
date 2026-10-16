package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    private final long f28377a;

    /* renamed from: b, reason: collision with root package name */
    private final long f28378b;

    /* renamed from: c, reason: collision with root package name */
    private final bb f28379c;

    public ba(long j2, bb bbVar) {
        h.g.b.x.f(bbVar, "animationType");
        this.f28377a = j2;
        this.f28378b = 300L;
        this.f28379c = bbVar;
    }

    public final long a() {
        return this.f28377a;
    }

    public final bb b() {
        return this.f28379c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        if (this.f28377a != baVar.f28377a) {
            return false;
        }
        long j2 = baVar.f28378b;
        return this.f28379c == baVar.f28379c;
    }

    public final int hashCode() {
        return (((a.a.b(this.f28377a) * 31) + a.a.b(300L)) * 31) + this.f28379c.hashCode();
    }

    public final String toString() {
        return "ShowAnimationSpec(startTimeUTCMs=" + this.f28377a + ", durationMs=300, animationType=" + this.f28379c + ")";
    }
}
