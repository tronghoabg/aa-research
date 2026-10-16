package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ah extends com.waze.navigate.location_preview.ba {

    /* renamed from: a, reason: collision with root package name */
    private final ai f31872a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31873b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31874c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31875d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f31876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ai aiVar, int i2, int i3, boolean z, boolean z2) {
        super(null);
        h.g.b.x.f(aiVar, "connectionType");
        this.f31872a = aiVar;
        this.f31873b = i2;
        this.f31874c = i3;
        this.f31875d = z;
        this.f31876e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return this.f31872a == ahVar.f31872a && this.f31873b == ahVar.f31873b && this.f31874c == ahVar.f31874c && this.f31875d == ahVar.f31875d && this.f31876e == ahVar.f31876e;
    }

    public final int hashCode() {
        int iHashCode = this.f31872a.hashCode() * 31;
        boolean z = this.f31876e;
        return ((((((iHashCode + this.f31873b) * 31) + this.f31874c) * 31) + a.a.a(this.f31875d)) * 31) + a.a.a(z);
    }

    public final ai j() {
        return this.f31872a;
    }

    public final boolean k() {
        return this.f31875d;
    }

    public final boolean l() {
        return this.f31876e;
    }

    public final String toString() {
        return "Connected(connectionType=" + this.f31872a + ", upstreamKbps=" + this.f31873b + ", downstreamKbps=" + this.f31874c + ", hasIpv4=" + this.f31875d + ", hasIpv6=" + this.f31876e + ")";
    }
}
