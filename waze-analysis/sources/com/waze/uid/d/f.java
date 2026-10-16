package com.waze.uid.d;

import com.waze.sharedui.api.t;
import com.waze.uid.UidModel;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private final j f44451a;

    public f(j jVar) {
        x.f(jVar, "persistence");
        this.f44451a = jVar;
    }

    @Override // com.waze.uid.d.c
    public final void a(UidModel uidModel, l lVar) {
        x.f(uidModel, "model");
        x.f(lVar, "callback");
        d dVar = new d(uidModel, lVar);
        String pinCode = uidModel.getEmailParameters().getPinCode();
        String pinCodeUuid = uidModel.getEmailParameters().getPinCodeUuid();
        uidModel.getEmailParameters().setPinCode("");
        uidModel.getEmailParameters().setPinCodeUuid("");
        t.f38827b.a(pinCode, pinCodeUuid, uidModel.getEmailParameters().getPinCodeToken(), dVar);
    }

    @Override // com.waze.uid.d.c
    public final void b(UidModel uidModel, l lVar) {
        x.f(uidModel, "model");
        x.f(lVar, "callback");
        this.f44451a.b();
        uidModel.getEmailParameters().resetPinCodeDetails();
        t.f38827b.j(uidModel.getEmailParameters().getEmailAddress(), new e(uidModel, this, lVar));
    }
}
