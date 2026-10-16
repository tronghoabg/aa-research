package com.waze.bw.b.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17752a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17753b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17754c;

    public g(boolean z, boolean z2, boolean z3) {
        this.f17752a = z;
        this.f17753b = z2;
        this.f17754c = z3;
    }

    public final boolean a() {
        return this.f17752a;
    }

    public final boolean b() {
        return this.f17753b;
    }

    public final boolean c() {
        return this.f17754c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f17752a == gVar.f17752a && this.f17753b == gVar.f17753b && this.f17754c == gVar.f17754c;
    }

    public final int hashCode() {
        return (((a.a.a(this.f17752a) * 31) + a.a.a(this.f17753b)) * 31) + a.a.a(this.f17754c);
    }

    public final String toString() {
        return "RtInfo(etaShown=" + this.f17752a + ", leaveArriveShown=" + this.f17753b + ", rtTrafficShown=" + this.f17754c + ")";
    }
}
