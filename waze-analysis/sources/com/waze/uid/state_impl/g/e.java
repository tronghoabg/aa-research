package com.waze.uid.state_impl.g;

import com.waze.uid.UidModel;
import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends com.waze.uid.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.b.u f44678a;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.b.o f44679f;

    public e(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar, com.waze.b.u uVar, com.waze.b.o oVar) {
        super("SavedLoginChoiceState", bVar, hVar, mVar);
        this.f44678a = uVar;
        this.f44679f = oVar;
    }

    @Override // com.waze.uid.e.c
    protected final com.waze.uid.e.f a() {
        com.waze.uid.b.m mVar = this.f44485c;
        InstallParameters.Result result = ((UidModel) mVar.b()).getInstallParameters().result;
        return !((UidModel) mVar.b()).getEmailParameters().getPinCodeToken().isEmpty() ? new com.waze.uid.state_impl.email.f(this.f44486d, this.f44484b, mVar) : result == InstallParameters.Result.LOGIN ? new com.waze.uid.state_impl.username_login.k(this.f44486d, this.f44484b, mVar, this.f44678a) : result == InstallParameters.Result.AUTOMATION_LOGIN ? new com.waze.uid.state_impl.username_login.m(this.f44486d, this.f44484b, mVar) : result == InstallParameters.Result.RECOVERY ? new d(this.f44486d, this.f44484b, mVar) : new a(this.f44486d, this.f44484b, mVar, this.f44678a, this.f44679f);
    }

    @Override // com.waze.uid.e.c, com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return eVar != com.waze.uid.e.e.f44482b && super.h(eVar);
    }
}
