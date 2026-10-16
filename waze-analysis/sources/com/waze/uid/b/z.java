package com.waze.uid.b;

import com.waze.uid.FlowType;
import com.waze.uid.UidModel;
import h.g.b.ar;
import java.util.Objects;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z implements org.a.d.a.a {
    public static final kotlinx.coroutines.b.k b(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "sessionsStateFlow");
        return ai.F(kVar, ab.f44137b, new y(null));
    }

    public final synchronized ab a() {
        ab abVar;
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        if (ab.f44138c == null) {
            UidModel uidModel = (UidModel) com.waze.uid.d.q.f44463a.a().f44465c.a(UidModel.class);
            if (uidModel != null) {
                FlowType flowType = uidModel.getFlowType();
                Objects.toString(flowType);
                com.waze.shared_infra.i.h.i("UidEventsController", "loaded model ".concat(String.valueOf(flowType)));
            } else {
                uidModel = new UidModel();
            }
            z zVar = this;
            if (zVar instanceof org.a.d.a.b) {
                bVarC = ((org.a.d.a.b) zVar).l();
                int i2 = ar.f48106a;
                mVar = new h.g.b.m(com.waze.sharedui.h.j.class);
            } else {
                bVarC = zVar.getKoin().a().c();
                int i3 = ar.f48106a;
                mVar = new h.g.b.m(com.waze.sharedui.h.j.class);
            }
            ab.f44138c = new ab(uidModel, (com.waze.sharedui.h.j) bVarC.a(mVar, null, null));
        }
        abVar = ab.f44138c;
        h.g.b.x.c(abVar);
        return abVar;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
