package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.c.a.q f38257a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38258b;

    /* renamed from: c, reason: collision with root package name */
    private final p f38259c;

    public q(com.waze.sharedrive.c.a.q qVar, boolean z, p pVar) {
        h.g.b.x.f(qVar, "drive");
        this.f38257a = qVar;
        this.f38258b = z;
        this.f38259c = pVar;
    }

    public static /* synthetic */ q d(q qVar, com.waze.sharedrive.c.a.q qVar2, boolean z, p pVar, int i2) {
        if ((i2 & 1) != 0) {
            qVar2 = qVar.f38257a;
        }
        if ((i2 & 2) != 0) {
            z = qVar.f38258b;
        }
        if ((i2 & 4) != 0) {
            pVar = qVar.f38259c;
        }
        h.g.b.x.f(qVar2, "drive");
        return new q(qVar2, z, pVar);
    }

    public final com.waze.sharedrive.c.a.q a() {
        return this.f38257a;
    }

    public final p b() {
        return this.f38259c;
    }

    public final boolean c() {
        return this.f38258b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return h.g.b.x.n(this.f38257a, qVar.f38257a) && this.f38258b == qVar.f38258b && h.g.b.x.n(this.f38259c, qVar.f38259c);
    }

    public final int hashCode() {
        int iHashCode = this.f38257a.hashCode() * 31;
        p pVar = this.f38259c;
        return ((iHashCode + a.a.a(this.f38258b)) * 31) + (pVar == null ? 0 : pVar.hashCode());
    }

    public final String toString() {
        return "LiveDrive(drive=" + this.f38257a + ", activePolling=" + this.f38258b + ", pendingJoin=" + this.f38259c + ")";
    }

    public /* synthetic */ q(com.waze.sharedrive.c.a.q qVar) {
        this(qVar, false, null);
    }
}
