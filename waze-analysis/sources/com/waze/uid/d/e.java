package com.waze.uid.d;

import com.waze.sharedui.api.PinCodeStatus;
import com.waze.uid.UidModel;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements com.waze.sharedui.api.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UidModel f44448a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f44449b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f44450c;

    e(UidModel uidModel, f fVar, l lVar) {
        this.f44448a = uidModel;
        this.f44449b = fVar;
        this.f44450c = lVar;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        if (bVar == null) {
            bVar = com.waze.sharedui.i.c();
        }
        this.f44450c.a(bVar);
    }

    @Override // com.waze.sharedui.api.b
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        com.waze.sharedui.api.s sVar = (com.waze.sharedui.api.s) obj;
        x.f(sVar, "value");
        UidModel uidModel = this.f44448a;
        uidModel.getEmailParameters().setPinCodeLength(sVar.a());
        uidModel.getEmailParameters().setPinCodeStatus(!sVar.c() ? PinCodeStatus.VERIFIED : PinCodeStatus.UNKNOWN);
        uidModel.getEmailParameters().setPinCodeToken(sVar.b());
        uidModel.getEmailParameters().setEmailAuthSkipped(!sVar.c());
        this.f44449b.f44451a.c(uidModel);
        this.f44450c.a(com.waze.sharedui.i.b());
    }
}
