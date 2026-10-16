package com.waze;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.MimeTypes;
import com.waze.config.ConfigValues;
import com.waze.install.InstallNativeManager;
import com.waze.location.LocationSensorListener;
import com.waze.uid.FlowContext;
import com.waze.uid.FlowType;
import com.waze.uid.UidModel;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class co extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final InstallNativeManager f22512a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.install.x f22513b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f22514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(InstallNativeManager installNativeManager, com.waze.install.x xVar, Application application) {
        super(application);
        h.g.b.x.f(installNativeManager, "installNativeManager");
        h.g.b.x.f(xVar, "installationRequirements");
        h.g.b.x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
        this.f22512a = installNativeManager;
        this.f22513b = xVar;
        co coVar = this;
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(coVar), null, null, new ck(this, (h.c.e) null, 0), 3);
        cn cnVar = new cn(xVar.a(), this);
        kotlinx.coroutines.af viewModelScope = ViewModelKt.getViewModelScope(coVar);
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.f22514c = kotlinx.coroutines.b.ai.V(cnVar, viewModelScope, kotlinx.coroutines.b.by.c(), null);
    }

    public static final /* synthetic */ void c(co coVar) {
        UidModel uidModelD;
        MainActivity.f13554f = true;
        com.waze.uid.b.z zVar = com.waze.uid.b.ab.f44136a;
        com.waze.uid.b.ab abVarA = zVar.a();
        FlowType flowType = FlowType.MAIN;
        FlowContext flowContext = FlowContext.WAZE_ONBOARDING;
        h.g.b.x.f(flowType, "flowType");
        h.g.b.x.f(flowContext, "flowContext");
        if (((UidModel) abVarA.b()).getFlowType() != FlowType.NONE) {
            uidModelD = (UidModel) abVarA.b();
            uidModelD.setFlowContext(flowContext);
        } else {
            com.waze.shared_infra.i.h.k("UidEventsController", "creating default model flowType=" + flowType + ", flowContext=" + flowContext);
            uidModelD = com.waze.uid.r.d(flowType, flowContext);
        }
        zVar.a().A(uidModelD);
        com.waze.install.x xVar = coVar.f22513b;
        int i2 = h.g.b.ar.f48106a;
        xVar.f(new h.g.b.m(com.waze.install.v.class));
    }

    public static final /* synthetic */ boolean h(co coVar) {
        String strA = com.waze.install.n.a(coVar.getApplication());
        if (strA == null) {
            return false;
        }
        com.waze.install.m.setCountry$default(coVar.f22512a, strA, null, 2, null);
        com.waze.install.x xVar = coVar.f22513b;
        int i2 = h.g.b.ar.f48106a;
        xVar.f(new h.g.b.m(com.waze.install.r.class));
        return true;
    }

    public final kotlinx.coroutines.b.ch b() {
        return this.f22514c;
    }

    public final void d() {
        int i2 = h.g.b.ar.f48106a;
        this.f22513b.f(new h.g.b.m(com.waze.install.p.class));
    }

    public final void e() {
        int i2 = h.g.b.ar.f48106a;
        this.f22513b.f(new h.g.b.m(com.waze.install.r.class));
    }

    public final void f() {
        if (!LocationSensorListener.canUseLocation(getApplication())) {
            this.f22513b.e(com.waze.install.r.f24792a);
        }
        com.waze.install.x xVar = this.f22513b;
        int i2 = h.g.b.ar.f48106a;
        xVar.f(new h.g.b.m(com.waze.install.s.class));
    }

    public final void g() {
        com.waze.n.ac.q(ConfigValues.CONFIG_VALUE_PERMISSIONS_NOTIFICATIONS_REQUESTED_AMOUNT);
        int i2 = h.g.b.ar.f48106a;
        this.f22513b.f(new h.g.b.m(com.waze.install.t.class));
    }
}
