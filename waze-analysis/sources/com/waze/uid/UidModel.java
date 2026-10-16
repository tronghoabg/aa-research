package com.waze.uid;

import com.waze.sharedui.api.AuthParameters;
import com.waze.uid.state_impl.add_id.AddIdParameters;
import com.waze.uid.state_impl.email.EmailParameters;
import com.waze.uid.state_impl.username_login.LoginParameters;
import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class UidModel extends com.waze.uid.e.d {
    public static final int $stable = 8;
    private int requestCode;
    private long startFlowNanoTime;
    private FlowType flowType = FlowType.NONE;
    private FlowContext flowContext = FlowContext.OTHER;
    private EmailParameters emailParameters = new EmailParameters(null, null, null, 0, null, null, false, false, null, null, null, 2047, null);
    private InstallParameters installParameters = new InstallParameters();
    private LoginParameters loginParameters = new LoginParameters();
    private AddIdParameters addIdParameters = new AddIdParameters();
    private AuthParameters authParameters = AuthParameters.empty;

    public final AddIdParameters getAddIdParameters() {
        return this.addIdParameters;
    }

    public final AuthParameters getAuthParameters() {
        return this.authParameters;
    }

    public final EmailParameters getEmailParameters() {
        return this.emailParameters;
    }

    public final FlowContext getFlowContext() {
        return this.flowContext;
    }

    public final FlowType getFlowType() {
        return this.flowType;
    }

    public final InstallParameters getInstallParameters() {
        return this.installParameters;
    }

    public final LoginParameters getLoginParameters() {
        return this.loginParameters;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public final long getStartFlowNanoTime() {
        return this.startFlowNanoTime;
    }

    @Override // com.waze.uid.e.d
    public void reset() {
        this.flowType = FlowType.NONE;
        this.flowContext = FlowContext.OTHER;
        this.requestCode = 0;
        this.emailParameters = new EmailParameters(null, null, null, 0, null, null, false, false, null, null, null, 2047, null);
        this.installParameters = new InstallParameters();
        this.loginParameters.reset();
        this.addIdParameters = new AddIdParameters();
        this.authParameters = AuthParameters.empty;
    }

    public final void setAddIdParameters(AddIdParameters addIdParameters) {
        h.g.b.x.f(addIdParameters, "<set-?>");
        this.addIdParameters = addIdParameters;
    }

    public final void setAuthParameters(AuthParameters authParameters) {
        h.g.b.x.f(authParameters, "<set-?>");
        this.authParameters = authParameters;
    }

    public final void setEmailParameters(EmailParameters emailParameters) {
        h.g.b.x.f(emailParameters, "<set-?>");
        this.emailParameters = emailParameters;
    }

    public final void setFlowContext(FlowContext flowContext) {
        h.g.b.x.f(flowContext, "<set-?>");
        this.flowContext = flowContext;
    }

    public final void setFlowType(FlowType flowType) {
        h.g.b.x.f(flowType, "<set-?>");
        this.flowType = flowType;
    }

    public final void setInstallParameters(InstallParameters installParameters) {
        h.g.b.x.f(installParameters, "<set-?>");
        this.installParameters = installParameters;
    }

    public final void setLoginParameters(LoginParameters loginParameters) {
        h.g.b.x.f(loginParameters, "<set-?>");
        this.loginParameters = loginParameters;
    }

    public final void setRequestCode(int i2) {
        this.requestCode = i2;
    }

    public final void setStartFlowNanoTime(long j2) {
        this.startFlowNanoTime = j2;
    }
}
