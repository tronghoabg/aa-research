package com.waze.uid.state_impl.email;

import com.waze.sharedui.api.PinCodeStatus;
import com.waze.uid.FlowType;
import com.waze.uid.UidModel;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends com.waze.uid.e.a {

    /* renamed from: f, reason: collision with root package name */
    private boolean f44649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("CheckPinCodeState", bVar, hVar, mVar);
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(mVar, "controller");
    }

    private final boolean g() {
        com.waze.uid.b.m mVar = this.f44485c;
        if (((UidModel) mVar.b()).getEmailParameters().getContinuedAsGuest() || ((UidModel) mVar.b()).getEmailParameters().getPinCodeStatus() == PinCodeStatus.VERIFIED || ((UidModel) mVar.b()).getAuthParameters().getToken().length() > 0) {
            return false;
        }
        if (((UidModel) mVar.b()).getEmailParameters().getPinCodeStatus() == PinCodeStatus.UNKNOWN || ((UidModel) mVar.b()).getEmailParameters().getPinCodeStatus() == PinCodeStatus.WRONG_PIN) {
            com.waze.uid.e.b bVar = this.f44486d;
            h.g.b.x.e(bVar, "trace");
            h.g.b.x.e(mVar, "controller");
            a(new r(bVar, this, mVar, this.f44649f));
            return true;
        }
        if (((UidModel) mVar.b()).getEmailParameters().getPinCodeStatus() != PinCodeStatus.OTHER_ERROR) {
            return false;
        }
        com.waze.uid.e.b bVar2 = this.f44486d;
        h.g.b.x.e(bVar2, "trace");
        h.g.b.x.e(mVar, "controller");
        a(new s(bVar2, this, mVar));
        return true;
    }

    @Override // com.waze.uid.e.a, com.waze.uid.e.h
    public final boolean b(com.waze.uid.e.f fVar) {
        if (fVar instanceof r) {
            ((UidModel) this.f44485c.b()).getEmailParameters().resetPinCodeDetails();
            com.waze.uid.d.q.f44463a.a().f44465c.b();
            return j();
        }
        if (!(fVar instanceof s)) {
            return j();
        }
        com.waze.uid.e.b bVar = this.f44486d;
        h.g.b.x.e(bVar, "trace");
        com.waze.uid.b.m mVar = this.f44485c;
        h.g.b.x.e(mVar, "controller");
        a(new r(bVar, this, mVar, this.f44649f));
        return false;
    }

    @Override // com.waze.uid.e.a, com.waze.uid.e.h
    public final boolean c(com.waze.uid.e.f fVar) {
        if (g()) {
            return false;
        }
        com.waze.uid.d.q.f44463a.a().f44465c.b();
        return k();
    }

    @Override // com.waze.uid.e.a, com.waze.uid.e.f
    public final boolean e() {
        if (g()) {
            return true;
        }
        com.waze.uid.d.q.f44463a.a().f44465c.b();
        return false;
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        boolean z = false;
        if (((UidModel) mVar.b()).getFlowType() != FlowType.ADD_ID && ((UidModel) mVar.b()).getFlowType() != FlowType.EDIT_ID) {
            z = true;
        }
        this.f44649f = z;
        if (g() || eVar == null) {
            return;
        }
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 0) {
            k();
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            j();
        }
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return ((UidModel) this.f44485c.b()).getEmailParameters().getPinCodeStatus() != PinCodeStatus.VERIFIED;
    }
}
