package com.waze.uid.state_impl.d;

import com.waze.b.o;
import com.waze.b.u;
import com.waze.uid.UidModel;
import com.waze.uid.b.m;
import com.waze.uid.state_impl.username_login.k;
import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends com.waze.uid.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final u f44624a;

    /* renamed from: f, reason: collision with root package name */
    private final o f44625f;

    public d(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, m mVar, u uVar, o oVar) {
        super("LoginRegisterActionState", bVar, hVar, mVar);
        this.f44624a = uVar;
        this.f44625f = oVar;
    }

    @Override // com.waze.uid.e.c
    protected final com.waze.uid.e.f a() {
        m mVar = this.f44485c;
        InstallParameters installParameters = ((UidModel) mVar.b()).getInstallParameters();
        if (installParameters.result == InstallParameters.Result.LOGIN) {
            return new k(this.f44486d, this.f44484b, mVar, this.f44624a);
        }
        InstallParameters.Result result = installParameters.result;
        if (result == InstallParameters.Result.GUEST) {
            return new c(this.f44486d, this.f44484b, mVar);
        }
        if (result != InstallParameters.Result.NEW_USER) {
            return null;
        }
        return new e(this.f44486d, this.f44484b, mVar, this.f44624a, this.f44625f);
    }
}
