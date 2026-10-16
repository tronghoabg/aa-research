package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f38260a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedrive.c.a.l f38261b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sharedrive.c.a.l f38262c;

    public s(String str, com.waze.sharedrive.c.a.l lVar, com.waze.sharedrive.c.a.l lVar2) {
        h.g.b.x.f(str, "driveId");
        h.g.b.x.f(lVar, "originalParticipant");
        h.g.b.x.f(lVar2, "updatedParticipant");
        this.f38260a = str;
        this.f38261b = lVar;
        this.f38262c = lVar2;
    }

    public final com.waze.sharedrive.c.a.l a() {
        return this.f38261b;
    }

    public final com.waze.sharedrive.c.a.l b() {
        return this.f38262c;
    }

    public final String c() {
        return this.f38260a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return h.g.b.x.n(this.f38260a, sVar.f38260a) && h.g.b.x.n(this.f38261b, sVar.f38261b) && h.g.b.x.n(this.f38262c, sVar.f38262c);
    }

    public final int hashCode() {
        return (((this.f38260a.hashCode() * 31) + this.f38261b.hashCode()) * 31) + this.f38262c.hashCode();
    }

    public final String toString() {
        return "RoleUpdateResult(driveId=" + this.f38260a + ", originalParticipant=" + this.f38261b + ", updatedParticipant=" + this.f38262c + ")";
    }
}
