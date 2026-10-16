package com.waze.uid.d;

import com.waze.sharedui.api.AuthParameters;
import com.waze.sharedui.api.PinCodeStatus;
import com.waze.uid.UidModel;
import com.waze.uid.state_impl.util.InstallParameters;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements com.waze.sharedui.api.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UidModel f44446a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f44447b;

    d(UidModel uidModel, l lVar) {
        this.f44446a = uidModel;
        this.f44447b = lVar;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        this.f44446a.getEmailParameters().setPinCodeStatus((bVar == null || !bVar.hasServerError()) ? PinCodeStatus.OTHER_ERROR : PinCodeStatus.UNKNOWN);
        l lVar = this.f44447b;
        if (bVar == null) {
            bVar = com.waze.sharedui.i.c();
        }
        lVar.a(bVar);
    }

    @Override // com.waze.sharedui.api.b
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        com.waze.sharedui.api.f fVar = (com.waze.sharedui.api.f) obj;
        x.f(fVar, "value");
        UidModel uidModel = this.f44446a;
        uidModel.getEmailParameters().setPinCodeStatus(fVar.a());
        if (fVar.a() == PinCodeStatus.VERIFIED) {
            String strB = fVar.b();
            String str = InstallParameters.Community.EMAIL.apiName;
            x.e(str, "apiName");
            uidModel.setAuthParameters(new AuthParameters(str, strB, null, false, 8, null));
        }
        this.f44447b.a(com.waze.sharedui.i.b());
    }
}
