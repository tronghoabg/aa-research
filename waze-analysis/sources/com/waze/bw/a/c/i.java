package com.waze.bw.a.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    private final long f17650a;

    /* renamed from: b, reason: collision with root package name */
    private final d f17651b;

    /* renamed from: c, reason: collision with root package name */
    private final b f17652c;

    public i(long j2, b bVar, d dVar) {
        super(null);
        this.f17650a = j2;
        this.f17652c = bVar;
        this.f17651b = dVar;
    }

    @Override // com.waze.bw.a.c.j
    public final long a() {
        return this.f17650a;
    }

    public final d b() {
        return this.f17651b;
    }

    @Override // com.waze.bw.a.c.j
    public final b c() {
        return this.f17652c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f17650a == iVar.f17650a && x.n(this.f17652c, iVar.f17652c) && x.n(this.f17651b, iVar.f17651b);
    }

    public final int hashCode() {
        b bVar = this.f17652c;
        int iHashCode = bVar == null ? 0 : bVar.hashCode();
        long j2 = this.f17650a;
        d dVar = this.f17651b;
        return (((a.a.b(j2) * 31) + iHashCode) * 31) + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlannedDrive(eventId=" + this.f17650a + ", driveTimes=" + this.f17652c + ", originLocation=" + this.f17651b + ")";
    }
}
