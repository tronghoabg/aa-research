package com.waze.uid.state_impl.d;

import com.waze.uid.FlowContext;
import com.waze.uid.UidModel;
import com.waze.uid.b.m;
import com.waze.uid.state_impl.username_login.LoginParameters;
import com.waze.uid.state_impl.util.InstallParameters;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements com.waze.sharedui.api.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f44626a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f44627b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f44628c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f44629d;

    f(int i2, h hVar, String str, String str2) {
        this.f44626a = i2;
        this.f44627b = hVar;
        this.f44628c = str;
        this.f44629d = str2;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        if (this.f44626a == com.waze.uid.e.f.i()) {
            h.f44632a.b("Failed to restore user, API error ".concat(String.valueOf(bVar != null ? bVar.getErrorMessage() : null)));
            h hVar = this.f44627b;
            m.t().c().d(false);
            hVar.k();
        }
    }

    @Override // com.waze.sharedui.api.b
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        com.waze.sharedui.api.g gVar = (com.waze.sharedui.api.g) obj;
        x.f(gVar, "value");
        if (this.f44626a == com.waze.uid.e.f.i()) {
            if (gVar.a() == null) {
                h.f44632a.b("Failed to restore user, profile empty");
                m.t().c().d(false);
            } else {
                UidModel uidModel = (UidModel) this.f44627b.f44485c.b();
                if (uidModel != null) {
                    String str = this.f44628c;
                    String str2 = this.f44629d;
                    uidModel.getInstallParameters().result = InstallParameters.Result.RECOVERY;
                    uidModel.getLoginParameters().setLoginOption(LoginParameters.LOGIN_OPTION.USERNAME);
                    uidModel.getLoginParameters().setUsername(str);
                    uidModel.getLoginParameters().setPassword(str2);
                    uidModel.getLoginParameters().setExistingProfile(gVar.a());
                    uidModel.setFlowContext(FlowContext.LOGIN);
                }
                m.t().c().d(true);
                h.f44632a.a("Restored user");
            }
            this.f44627b.k();
        }
    }
}
