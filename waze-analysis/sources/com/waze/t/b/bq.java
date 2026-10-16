package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bq extends bs {

    /* renamed from: a, reason: collision with root package name */
    private final cc f40755a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40756b;

    /* renamed from: c, reason: collision with root package name */
    private final am f40757c;

    /* renamed from: d, reason: collision with root package name */
    private final a f40758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(cc ccVar, boolean z, am amVar, a aVar) {
        super(null);
        h.g.b.x.f(aVar, "additionalData");
        this.f40755a = ccVar;
        this.f40756b = z;
        this.f40757c = amVar;
        this.f40758d = aVar;
    }

    public static /* synthetic */ bq e(bq bqVar, cc ccVar, boolean z, am amVar, a aVar, int i2) {
        if ((i2 & 1) != 0) {
            ccVar = bqVar.f40755a;
        }
        if ((i2 & 2) != 0) {
            z = bqVar.f40756b;
        }
        if ((i2 & 4) != 0) {
            amVar = bqVar.f40757c;
        }
        if ((i2 & 8) != 0) {
            aVar = bqVar.f40758d;
        }
        h.g.b.x.f(aVar, "additionalData");
        return new bq(ccVar, z, amVar, aVar);
    }

    public final a a() {
        return this.f40758d;
    }

    public final am b() {
        return this.f40757c;
    }

    public final cc c() {
        return this.f40755a;
    }

    public final boolean d() {
        return this.f40756b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq)) {
            return false;
        }
        bq bqVar = (bq) obj;
        return h.g.b.x.n(this.f40755a, bqVar.f40755a) && this.f40756b == bqVar.f40756b && h.g.b.x.n(this.f40757c, bqVar.f40757c) && h.g.b.x.n(this.f40758d, bqVar.f40758d);
    }

    public final int hashCode() {
        cc ccVar = this.f40755a;
        int iHashCode = ccVar == null ? 0 : ccVar.hashCode();
        boolean z = this.f40756b;
        am amVar = this.f40757c;
        return (((((iHashCode * 31) + a.a.a(z)) * 31) + (amVar != null ? amVar.hashCode() : 0)) * 31) + this.f40758d.hashCode();
    }

    public final String toString() {
        return "Processing(playingAudio=" + this.f40755a + ", conversationShouldEnd=" + this.f40756b + ", featureActionStatus=" + this.f40757c + ", additionalData=" + this.f40758d + ")";
    }
}
