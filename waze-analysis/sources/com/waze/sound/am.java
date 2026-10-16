package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am extends an {

    /* renamed from: a, reason: collision with root package name */
    private final long f39446a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39447b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39448c;

    /* renamed from: d, reason: collision with root package name */
    private final o f39449d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f39450e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39451f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(long j2, int i2, boolean z, o oVar, boolean z2, boolean z3) {
        super(null);
        h.g.b.x.f(oVar, "announcementTiming");
        this.f39446a = j2;
        this.f39447b = i2;
        this.f39448c = z;
        this.f39449d = oVar;
        this.f39450e = z2;
        this.f39451f = z3;
    }

    @Override // com.waze.sound.an
    public final int a() {
        return this.f39447b;
    }

    @Override // com.waze.sound.an
    public final long b() {
        return this.f39446a;
    }

    @Override // com.waze.sound.an
    public final o c() {
        return this.f39449d;
    }

    public final boolean d() {
        return this.f39450e;
    }

    public final boolean e() {
        return this.f39448c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return this.f39446a == amVar.f39446a && this.f39447b == amVar.f39447b && this.f39448c == amVar.f39448c && this.f39449d == amVar.f39449d && this.f39450e == amVar.f39450e && this.f39451f == amVar.f39451f;
    }

    @Override // com.waze.sound.an
    public final boolean g() {
        return this.f39451f;
    }

    public final int hashCode() {
        int iB = a.a.b(this.f39446a) * 31;
        o oVar = this.f39449d;
        return ((((((((iB + this.f39447b) * 31) + a.a.a(this.f39448c)) * 31) + oVar.hashCode()) * 31) + a.a.a(this.f39450e)) * 31) + a.a.a(this.f39451f);
    }

    public final String toString() {
        return "Online(announcementId=" + this.f39446a + ", distanceMeters=" + this.f39447b + ", includeLaneGuidance=" + this.f39448c + ", announcementTiming=" + this.f39449d + ", andThenNeeded=" + this.f39450e + ", isDestination=" + this.f39451f + ")";
    }
}
