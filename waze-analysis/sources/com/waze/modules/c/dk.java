package com.waze.modules.c;

import i.b.l.ps;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dk implements as {

    /* renamed from: a, reason: collision with root package name */
    private final ps f30081a;

    /* renamed from: b, reason: collision with root package name */
    private final List f30082b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30083c;

    /* renamed from: d, reason: collision with root package name */
    private final cw f30084d;

    /* renamed from: e, reason: collision with root package name */
    private final ea f30085e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.ae.e f30086f;

    public dk(ps psVar, List list, long j2, com.waze.ae.e eVar, cw cwVar, ea eaVar) {
        h.g.b.x.f(psVar, "proto");
        h.g.b.x.f(list, "routes");
        this.f30081a = psVar;
        this.f30082b = list;
        this.f30083c = j2;
        this.f30086f = eVar;
        this.f30084d = cwVar;
        this.f30085e = eaVar;
    }

    @Override // com.waze.modules.c.as
    public final long a() {
        return ((ar) h.a.i.P(this.f30082b)).a();
    }

    @Override // com.waze.modules.c.as
    public final boolean b() {
        return !this.f30082b.isEmpty();
    }

    public final long c() {
        return this.f30083c;
    }

    public final cw d() {
        return this.f30084d;
    }

    public final ea e() {
        return this.f30085e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk)) {
            return false;
        }
        dk dkVar = (dk) obj;
        return h.g.b.x.n(this.f30081a, dkVar.f30081a) && h.g.b.x.n(this.f30082b, dkVar.f30082b) && this.f30083c == dkVar.f30083c && h.g.b.x.n(this.f30086f, dkVar.f30086f) && h.g.b.x.n(this.f30084d, dkVar.f30084d) && h.g.b.x.n(this.f30085e, dkVar.f30085e);
    }

    public final List f() {
        return this.f30082b;
    }

    public final ps g() {
        return this.f30081a;
    }

    public final com.waze.ae.e h() {
        return this.f30086f;
    }

    public final int hashCode() {
        int iHashCode = (this.f30081a.hashCode() * 31) + this.f30082b.hashCode();
        com.waze.ae.e eVar = this.f30086f;
        int iB = ((((iHashCode * 31) + a.a.b(this.f30083c)) * 31) + (eVar == null ? 0 : eVar.hashCode())) * 31;
        cw cwVar = this.f30084d;
        int iHashCode2 = (iB + (cwVar == null ? 0 : cwVar.hashCode())) * 31;
        ea eaVar = this.f30085e;
        return iHashCode2 + (eaVar != null ? eaVar.hashCode() : 0);
    }

    public final String toString() {
        return "RoutingResponse(proto=" + this.f30081a + ", routes=" + this.f30082b + ", routingId=" + this.f30083c + ", closureImpactInfo=" + this.f30086f + ", routingNotification=" + this.f30084d + ", visualImpactInfo=" + this.f30085e + ")";
    }

    public /* synthetic */ dk(ps psVar, List list, long j2, com.waze.ae.e eVar, int i2) {
        this(psVar, list, j2, (i2 & 8) != 0 ? null : eVar, null, null);
    }
}
