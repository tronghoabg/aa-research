package com.waze.uid.state_impl.b;

import com.waze.b.s;
import com.waze.b.u;
import com.waze.sharedui.profile.AgeRestrictionMode;
import com.waze.uid.UidModel;
import com.waze.uid.state_impl.add_id.w;
import com.waze.uid.state_impl.util.InstallParameters;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends com.waze.uid.e.c implements com.waze.uid.e.h {

    /* renamed from: a, reason: collision with root package name */
    private final u f44599a;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.b.o f44600f;

    /* renamed from: g, reason: collision with root package name */
    private final d f44601g;

    /* renamed from: h, reason: collision with root package name */
    private final n f44602h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.uid.state_impl.f.d f44603i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, u uVar, com.waze.b.o oVar, com.waze.uid.b.m mVar) {
        super("AuthChoiceState", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(uVar, "ageRestrictionRepository");
        x.f(oVar, "ageRestrictionApi");
        x.f(mVar, "controller");
        this.f44599a = uVar;
        this.f44600f = oVar;
        this.f44601g = new d(bVar, hVar, mVar);
        this.f44602h = new n(bVar, hVar, mVar);
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("RequestU18UserAgeState");
        x.e(eVarD, "create(...)");
        this.f44603i = new com.waze.uid.state_impl.f.d(bVar, this, mVar, oVar, uVar, eVarD);
    }

    @Override // com.waze.uid.e.c
    protected final com.waze.uid.e.f a() {
        s sVar = (s) this.f44599a.a().d();
        if (sVar.c() == null && sVar.b().a() == AgeRestrictionMode.CHECK) {
            return this.f44603i;
        }
        InstallParameters.Community community = ((UidModel) this.f44485c.b()).getInstallParameters().community;
        if (community == null) {
            return null;
        }
        int iOrdinal = community.ordinal();
        if (iOrdinal == 0) {
            return this.f44602h;
        }
        if (iOrdinal == 1) {
            return this.f44601g;
        }
        throw new h.i();
    }

    @Override // com.waze.uid.e.h
    public final boolean b(com.waze.uid.e.f fVar) {
        return false;
    }

    @Override // com.waze.uid.e.h
    public final boolean c(com.waze.uid.e.f fVar) {
        if (!(fVar instanceof com.waze.uid.state_impl.f.d)) {
            return false;
        }
        com.waze.tide.s sVar = ((com.waze.uid.state_impl.f.d) fVar).f44674a;
        if (sVar == null) {
            x.j("lastEvent");
            sVar = null;
        }
        if (sVar instanceof com.waze.uid.state_impl.a.a) {
            com.waze.uid.e.e eVar = com.waze.uid.e.e.f44481a;
            if (h(eVar)) {
                f(eVar);
                return true;
            }
            j();
            return true;
        }
        if (sVar instanceof com.waze.uid.state_impl.a.c) {
            com.waze.uid.e.h hVar = this.f44484b;
            x.d(hVar, "null cannot be cast to non-null type com.waze.uid.state_impl.add_id.AddIdStatesContainer");
            ((w) hVar).m();
            return true;
        }
        if (!(sVar instanceof com.waze.uid.state_impl.a.b)) {
            return true;
        }
        com.waze.uid.e.h hVar2 = this.f44484b;
        x.d(hVar2, "null cannot be cast to non-null type com.waze.uid.state_impl.add_id.AddIdStatesContainer");
        ((w) hVar2).n(com.waze.uid.e.e.f44481a);
        return true;
    }

    @Override // com.waze.uid.e.c, com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        com.waze.uid.e.d dVarB = this.f44485c.b();
        x.e(dVarB, "<get-model>(...)");
        if (com.waze.ui.r.a.d.d.f((UidModel) dVarB)) {
            return false;
        }
        return super.h(eVar);
    }
}
