package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dl {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28200a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28201b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28202c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f28203d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f28204e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f28205f;

    public /* synthetic */ dl(boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), ((i2 & 2) == 0) & z2, false, ((i2 & 8) == 0) & z3, ((i2 & 16) == 0) & z4, false);
    }

    public final boolean a() {
        return this.f28205f;
    }

    public final boolean b() {
        return this.f28203d;
    }

    public final boolean c() {
        return this.f28200a;
    }

    public final boolean d() {
        return this.f28202c;
    }

    public final boolean e() {
        return this.f28204e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl)) {
            return false;
        }
        dl dlVar = (dl) obj;
        return this.f28200a == dlVar.f28200a && this.f28201b == dlVar.f28201b && this.f28202c == dlVar.f28202c && this.f28203d == dlVar.f28203d && this.f28204e == dlVar.f28204e && this.f28205f == dlVar.f28205f;
    }

    public final boolean f() {
        return this.f28201b;
    }

    public final int hashCode() {
        int iA = a.a.a(this.f28200a);
        boolean z = this.f28205f;
        boolean z2 = this.f28204e;
        boolean z3 = this.f28203d;
        return (((((((((iA * 31) + a.a.a(this.f28201b)) * 31) + a.a.a(this.f28202c)) * 31) + a.a.a(z3)) * 31) + a.a.a(z2)) * 31) + a.a.a(z);
    }

    public final String toString() {
        return "MapPois(showHomePoi=" + this.f28200a + ", showWorkPoi=" + this.f28201b + ", showParkedPoi=" + this.f28202c + ", showDestinationPoi=" + this.f28203d + ", showWaypointPoi=" + this.f28204e + ", showDeparturePoi=" + this.f28205f + ")";
    }

    public dl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f28200a = z;
        this.f28201b = z2;
        this.f28202c = z3;
        this.f28203d = z4;
        this.f28204e = z5;
        this.f28205f = z6;
    }

    public dl() {
        this(false, false, false, false, 63);
    }
}
