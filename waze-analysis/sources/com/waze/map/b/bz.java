package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bz extends com.waze.z.a.d.ai {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28119a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28120b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28121c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.z.a.d.ai f28122d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bz(boolean z, boolean z2, boolean z3, int i2) {
        bw bwVar = (i2 & 4) != 0 ? bw.f28116a : null;
        int i3 = i2 & 1;
        boolean z4 = z2 & ((i2 & 2) == 0);
        int i4 = (z ? 1 : 0) & (i3 ^ 1);
        this(1 == i4, z4, bwVar, z3 & ((i2 & 8) == 0));
    }

    public static /* synthetic */ bz A(bz bzVar, com.waze.z.a.d.ai aiVar) {
        h.g.b.x.f(aiVar, "arrow");
        return new bz(bzVar.f28119a, bzVar.f28120b, aiVar, bzVar.f28121c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        return this.f28119a == bzVar.f28119a && this.f28120b == bzVar.f28120b && h.g.b.x.n(this.f28122d, bzVar.f28122d) && this.f28121c == bzVar.f28121c;
    }

    public final int hashCode() {
        return (((((a.a.a(this.f28119a) * 31) + a.a.a(this.f28120b)) * 31) + this.f28122d.hashCode()) * 31) + a.a.a(this.f28121c);
    }

    public final String toString() {
        return "ShowActiveRoute(showRoutingLabels=" + this.f28119a + ", showDetourRoutes=" + this.f28120b + ", arrow=" + this.f28122d + ", showSuggestedParking=" + this.f28121c + ")";
    }

    public final boolean w() {
        return this.f28120b;
    }

    public final boolean x() {
        return this.f28119a;
    }

    public final boolean y() {
        return this.f28121c;
    }

    public final com.waze.z.a.d.ai z() {
        return this.f28122d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bz(boolean z, boolean z2, com.waze.z.a.d.ai aiVar, boolean z3) {
        h.g.b.x.f(aiVar, "arrow");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f28119a = z;
        this.f28120b = z2;
        this.f28122d = aiVar;
        this.f28121c = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bz() {
        boolean z = false;
        this(z, z, z, 15);
    }
}
