package com.waze.ui.m;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f43024a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.i f43025b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.n f43026c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ui.ac.n f43027d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ui.ac.n f43028e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.z.a.c f43029f;

    public q(com.waze.ui.ac.n nVar, com.waze.ui.ac.i iVar, com.waze.ui.ac.n nVar2, com.waze.ui.ac.n nVar3, com.waze.ui.ac.n nVar4, com.waze.z.a.c cVar) {
        h.g.b.x.f(nVar, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(iVar, "icon");
        h.g.b.x.f(nVar4, "count");
        h.g.b.x.f(cVar, "countSentiment");
        this.f43024a = nVar;
        this.f43025b = iVar;
        this.f43026c = nVar2;
        this.f43027d = nVar3;
        this.f43028e = nVar4;
        this.f43029f = cVar;
    }

    public final com.waze.z.a.c a() {
        return this.f43029f;
    }

    public final com.waze.ui.ac.i b() {
        return this.f43025b;
    }

    public final com.waze.ui.ac.n c() {
        return this.f43028e;
    }

    public final com.waze.ui.ac.n d() {
        return this.f43027d;
    }

    public final com.waze.ui.ac.n e() {
        return this.f43024a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return h.g.b.x.n(this.f43024a, qVar.f43024a) && h.g.b.x.n(this.f43025b, qVar.f43025b) && h.g.b.x.n(this.f43026c, qVar.f43026c) && h.g.b.x.n(this.f43027d, qVar.f43027d) && h.g.b.x.n(this.f43028e, qVar.f43028e) && this.f43029f == qVar.f43029f;
    }

    public final com.waze.ui.ac.n f() {
        return this.f43026c;
    }

    public final int hashCode() {
        int iHashCode = (this.f43024a.hashCode() * 31) + this.f43025b.hashCode();
        com.waze.ui.ac.n nVar = this.f43026c;
        int iHashCode2 = ((iHashCode * 31) + (nVar == null ? 0 : nVar.hashCode())) * 31;
        com.waze.ui.ac.n nVar2 = this.f43027d;
        return ((((iHashCode2 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31) + this.f43028e.hashCode()) * 31) + this.f43029f.hashCode();
    }

    public final String toString() {
        return "EVPlugUIModel(name=" + this.f43024a + ", icon=" + this.f43025b + ", speedTier=" + this.f43026c + ", kw=" + this.f43027d + ", count=" + this.f43028e + ", countSentiment=" + this.f43029f + ")";
    }
}
