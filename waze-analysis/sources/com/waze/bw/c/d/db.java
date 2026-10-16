package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class db extends dc {

    /* renamed from: a, reason: collision with root package name */
    private final long f18085a;

    /* renamed from: b, reason: collision with root package name */
    private final cz f18086b;

    /* renamed from: c, reason: collision with root package name */
    private final cv f18087c;

    public db(long j2, cz czVar, cv cvVar) {
        super(null);
        this.f18085a = j2;
        this.f18086b = czVar;
        this.f18087c = cvVar;
    }

    @Override // com.waze.bw.c.d.dc
    public final long a() {
        return this.f18085a;
    }

    @Override // com.waze.bw.c.d.dc
    public final cz b() {
        return this.f18086b;
    }

    public final cv c() {
        return this.f18087c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return this.f18085a == dbVar.f18085a && h.g.b.x.n(this.f18086b, dbVar.f18086b) && h.g.b.x.n(this.f18087c, dbVar.f18087c);
    }

    public final int hashCode() {
        cz czVar = this.f18086b;
        int iHashCode = czVar == null ? 0 : czVar.hashCode();
        long j2 = this.f18085a;
        cv cvVar = this.f18087c;
        return (((a.a.b(j2) * 31) + iHashCode) * 31) + (cvVar != null ? cvVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlannedDrive(eventId=" + this.f18085a + ", driveTimes=" + this.f18086b + ", originLocation=" + this.f18087c + ")";
    }
}
