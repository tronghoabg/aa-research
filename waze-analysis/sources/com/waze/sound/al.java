package com.waze.sound;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class al extends an {

    /* renamed from: a, reason: collision with root package name */
    private final long f39438a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39439b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39440c;

    /* renamed from: d, reason: collision with root package name */
    private final o f39441d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f39442e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39443f;

    /* renamed from: g, reason: collision with root package name */
    private final List f39444g;

    /* renamed from: h, reason: collision with root package name */
    private final gn f39445h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(long j2, int i2, o oVar, boolean z, boolean z2, List list, gn gnVar) {
        super(null);
        h.g.b.x.f(oVar, "announcementTiming");
        h.g.b.x.f(list, "prompts");
        h.g.b.x.f(gnVar, "speedConstraint");
        this.f39438a = j2;
        this.f39439b = i2;
        this.f39440c = false;
        this.f39441d = oVar;
        this.f39442e = z;
        this.f39443f = z2;
        this.f39444g = list;
        this.f39445h = gnVar;
    }

    @Override // com.waze.sound.an
    public final int a() {
        return this.f39439b;
    }

    @Override // com.waze.sound.an
    public final long b() {
        return this.f39438a;
    }

    @Override // com.waze.sound.an
    public final o c() {
        return this.f39441d;
    }

    public final gn d() {
        return this.f39445h;
    }

    public final List e() {
        return this.f39444g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        if (this.f39438a != alVar.f39438a || this.f39439b != alVar.f39439b) {
            return false;
        }
        boolean z = alVar.f39440c;
        return this.f39441d == alVar.f39441d && this.f39442e == alVar.f39442e && this.f39443f == alVar.f39443f && h.g.b.x.n(this.f39444g, alVar.f39444g) && h.g.b.x.n(this.f39445h, alVar.f39445h);
    }

    public final boolean f() {
        return this.f39442e;
    }

    @Override // com.waze.sound.an
    public final boolean g() {
        return this.f39443f;
    }

    public final int hashCode() {
        int iB = (((((a.a.b(this.f39438a) * 31) + this.f39439b) * 31) + a.a.a(false)) * 31) + this.f39441d.hashCode();
        List list = this.f39444g;
        return (((((((iB * 31) + a.a.a(this.f39442e)) * 31) + a.a.a(this.f39443f)) * 31) + list.hashCode()) * 31) + this.f39445h.hashCode();
    }

    public final String toString() {
        return "Local(announcementId=" + this.f39438a + ", distanceMeters=" + this.f39439b + ", includeLaneGuidance=false, announcementTiming=" + this.f39441d + ", andThenNeeded=" + this.f39442e + ", isDestination=" + this.f39443f + ", prompts=" + this.f39444g + ", speedConstraint=" + this.f39445h + ")";
    }

    public /* synthetic */ al(long j2, o oVar, boolean z, boolean z2, List list) {
        this(j2, 40, oVar, z, z2, list, gm.f40096a);
    }
}
