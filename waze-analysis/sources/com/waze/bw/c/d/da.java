package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class da extends dc {

    /* renamed from: a, reason: collision with root package name */
    private final long f18081a;

    /* renamed from: b, reason: collision with root package name */
    private final cz f18082b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18083c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(long j2, cz czVar, String str, boolean z) {
        super(null);
        h.g.b.x.f(str, "eventName");
        this.f18081a = j2;
        this.f18082b = czVar;
        this.f18083c = str;
        this.f18084d = z;
    }

    @Override // com.waze.bw.c.d.dc
    public final long a() {
        return this.f18081a;
    }

    @Override // com.waze.bw.c.d.dc
    public final cz b() {
        return this.f18082b;
    }

    public final String c() {
        return this.f18083c;
    }

    public final boolean d() {
        return this.f18084d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        return this.f18081a == daVar.f18081a && h.g.b.x.n(this.f18082b, daVar.f18082b) && h.g.b.x.n(this.f18083c, daVar.f18083c) && this.f18084d == daVar.f18084d;
    }

    public final int hashCode() {
        cz czVar = this.f18082b;
        return (((((a.a.b(this.f18081a) * 31) + (czVar == null ? 0 : czVar.hashCode())) * 31) + this.f18083c.hashCode()) * 31) + a.a.a(this.f18084d);
    }

    public final String toString() {
        return "CalendarEventDrive(eventId=" + this.f18081a + ", driveTimes=" + this.f18082b + ", eventName=" + this.f18083c + ", isLocationVerified=" + this.f18084d + ")";
    }
}
