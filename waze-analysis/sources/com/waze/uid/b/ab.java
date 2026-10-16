package com.waze.uid.b;

import androidx.core.app.NotificationCompat;
import com.waze.uid.FlowType;
import com.waze.uid.UidModel;
import com.waze.uid.activities.UidFragmentActivity;
import com.waze.uid.state_impl.util.InstallParameters;
import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab extends m {

    /* renamed from: a, reason: collision with root package name */
    public static final z f44136a = new z();

    /* renamed from: b, reason: collision with root package name */
    public static final bn f44137b = ck.b(new com.waze.uid.p(false, false, com.waze.uid.n.f44538a));

    /* renamed from: c, reason: collision with root package name */
    private static ab f44138c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.h.j f44139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected ab(UidModel uidModel, com.waze.sharedui.h.j jVar) {
        super(uidModel);
        h.g.b.x.f(uidModel, "model");
        h.g.b.x.f(jVar, "sessionStatsSender");
        this.f44139d = jVar;
    }

    public static final synchronized ab y() {
        return f44136a.a();
    }

    public final void A(UidModel uidModel) {
        h.g.b.x.f(uidModel, "model");
        FlowType flowType = uidModel.getFlowType();
        Objects.toString(flowType);
        com.waze.shared_infra.i.h.i("UidEventsController", "starting a new flow ".concat(String.valueOf(flowType)));
        com.waze.uid.d.q.f44463a.a().f44465c.b();
        j(uidModel);
        u();
        FlowType flowType2 = ((UidModel) b()).getFlowType();
        com.waze.uid.e.f fVarD = d();
        StringBuilder sb = new StringBuilder("starting flow with existing model, flowType=");
        sb.append(flowType2);
        sb.append(", newFlow=");
        sb.append(fVarD == null);
        com.waze.shared_infra.i.h.k("UidEventsController", sb.toString());
        bn bnVar = f44137b;
        bnVar.e((((UidModel) b()).getFlowType() == FlowType.LOGIN || ((UidModel) b()).getFlowType() == FlowType.MAIN) ? com.waze.uid.p.c((com.waze.uid.p) bnVar.d(), true, true, com.waze.uid.n.f44538a, 4) : com.waze.uid.p.c((com.waze.uid.p) bnVar.d(), true, false, com.waze.uid.n.f44538a, 6));
        if (((UidModel) b()).getFlowType() == FlowType.MAIN) {
            this.f44139d.f(com.waze.sharedui.h.e.f39036a);
        }
        super.m();
    }

    @Override // com.waze.uid.b.m
    protected final com.waze.uid.e.f c() {
        FlowType flowType = ((UidModel) b()).getFlowType();
        FlowType flowType2 = FlowType.NONE;
        int iOrdinal = flowType.ordinal();
        if (iOrdinal == 0) {
            throw new RuntimeException("flow type is not set");
        }
        if (iOrdinal == 1) {
            return com.waze.uid.d.q.f44463a.a().f44467e.e();
        }
        if (iOrdinal == 2) {
            return new com.waze.uid.state_impl.username_login.k(new com.waze.uid.e.b(), this, com.waze.b.u.f16171a.a());
        }
        if (iOrdinal == 3) {
            return new com.waze.uid.state_impl.add_id.w(new com.waze.uid.e.b(), this, com.waze.b.u.f16171a.a(), com.waze.b.o.f16158a.a());
        }
        if (iOrdinal == 4) {
            return new com.waze.uid.state_impl.add_id.w(new com.waze.uid.e.b(), this, com.waze.b.u.f16171a.a(), com.waze.b.o.f16158a.a());
        }
        throw new h.i();
    }

    @Override // com.waze.uid.b.m
    protected final Class e() {
        return UidFragmentActivity.class;
    }

    @Override // com.waze.uid.b.m
    public final void f() {
        bn bnVar = f44137b;
        bnVar.e(com.waze.uid.p.c((com.waze.uid.p) bnVar.d(), false, false, com.waze.uid.n.f44540c, 6));
        w(new e(0, null));
        i();
    }

    @Override // com.waze.uid.b.m
    public final void g() {
        com.waze.uid.d.q.f44463a.a().f44467e.k(new aa());
        com.waze.uid.n nVar = ((((UidModel) b()).getFlowType() == FlowType.MAIN || ((UidModel) b()).getFlowType() == FlowType.LOGIN) && ((UidModel) b()).getInstallParameters().result == InstallParameters.Result.GUEST) ? com.waze.uid.n.f44541d : com.waze.uid.n.f44539b;
        bn bnVar = f44137b;
        bnVar.e(com.waze.uid.p.c((com.waze.uid.p) bnVar.d(), false, false, nVar, 6));
        i();
    }

    @Override // com.waze.uid.b.m
    public final void i() {
        FlowType flowType = ((UidModel) b()).getFlowType();
        Objects.toString(flowType);
        com.waze.shared_infra.i.h.k("UidEventsController", "resetting flow, flowType=".concat(String.valueOf(flowType)));
        super.i();
        com.waze.uid.d.q.f44463a.a().f44465c.b();
    }

    @Override // com.waze.uid.b.m, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof com.waze.uid.state_impl.email.e) {
            com.waze.shared_infra.i.h.i("UidEventsController", "saving pin code from deeplink");
            ((UidModel) b()).getEmailParameters().setPinCodeUuid(((com.waze.uid.state_impl.email.e) sVar).a());
        }
        super.o(sVar);
    }
}
