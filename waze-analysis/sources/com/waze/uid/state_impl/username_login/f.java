package com.waze.uid.state_impl.username_login;

import com.waze.uid.FlowContext;
import com.waze.uid.UidModel;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends com.waze.uid.e.a {

    /* renamed from: f, reason: collision with root package name */
    private FlowContext f44707f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("ChangeAnalyticsContext", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        FlowContext flowContext;
        super.f(eVar);
        if (eVar == com.waze.uid.e.e.f44481a) {
            com.waze.uid.b.m mVar = this.f44485c;
            FlowContext flowContext2 = ((UidModel) mVar.b()).getFlowContext();
            this.f44707f = flowContext2;
            if (flowContext2 != FlowContext.SETTINGS) {
                ((UidModel) mVar.b()).setFlowContext(FlowContext.LOGIN);
            }
            k();
            return;
        }
        UidModel uidModel = (UidModel) this.f44485c.b();
        FlowContext flowContext3 = this.f44707f;
        if (flowContext3 == null || e.f44706a[flowContext3.ordinal()] == -1) {
            flowContext = FlowContext.LOGIN;
        } else {
            flowContext = this.f44707f;
            x.c(flowContext);
        }
        uidModel.setFlowContext(flowContext);
        this.f44707f = null;
        j();
    }
}
