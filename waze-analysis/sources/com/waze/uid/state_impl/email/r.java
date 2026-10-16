package com.waze.uid.state_impl.email;

import androidx.core.app.NotificationCompat;
import com.waze.R;
import com.waze.sharedui.api.PinCodeStatus;
import com.waze.uid.UidModel;
import com.waze.uid.c.ba;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends com.waze.uid.e.f implements com.waze.uid.b.h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44661a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar, boolean z) {
        super("PinCodeEnterState", bVar, hVar, mVar);
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(mVar, "controller");
        this.f44661a = z;
    }

    static final h.ab b(r rVar) {
        rVar.k();
        return h.ab.f48028a;
    }

    static final h.ab c(r rVar) {
        com.waze.uid.b.m mVar = rVar.f44485c;
        mVar.k(mVar.a().b(null));
        return h.ab.f48028a;
    }

    static final void g(r rVar, com.waze.sharedui.b bVar) {
        h.g.b.x.f(bVar, "it");
        com.waze.uid.b.m mVar = rVar.f44485c;
        PinCodeStatus pinCodeStatus = ((UidModel) mVar.b()).getEmailParameters().getPinCodeStatus();
        PinCodeStatus pinCodeStatus2 = PinCodeStatus.UNKNOWN;
        if (pinCodeStatus.ordinal() == 2) {
            mVar.w(new ba(R.string.VERIFY_EMAIL_WRONG_PIN_MSG));
            aj.z(com.waze.uid.b.m.t().d(), null, null, new p(rVar, null), 3);
        } else if (bVar.hasServerError()) {
            mVar.w(new com.waze.uid.b.d(bVar));
        }
        mVar.k(mVar.a().b(null));
        rVar.k();
    }

    private final bm m() {
        return this.f44661a ? bm.f44287h : bm.f44288i;
    }

    private final void n() {
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().b(new com.waze.uid.b.n((byte[]) null)).e(new bb(m())));
        com.waze.uid.d.c cVar = com.waze.uid.d.q.f44463a.a().f44464b;
        com.waze.uid.e.d dVarB = mVar.b();
        h.g.b.x.e(dVarB, "<get-model>(...)");
        cVar.a((UidModel) dVarB, new com.waze.uid.d.m(new com.waze.uid.d.l() { // from class: com.waze.uid.state_impl.email.o
            @Override // com.waze.uid.d.l
            public final void a(com.waze.sharedui.b bVar) {
                r.g(this.f44657a, bVar);
            }
        }));
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().e(new bb(m(), eVar)));
        com.waze.uid.d.q.f44463a.a().c().q(((UidModel) mVar.b()).getFlowContext().getOnboardingContext());
        if (eVar == com.waze.uid.e.e.f44481a) {
            if (((UidModel) mVar.b()).getEmailParameters().getPinCode().length() <= 0 && ((UidModel) mVar.b()).getEmailParameters().getPinCodeUuid().length() <= 0) {
                return;
            }
            n();
        }
    }

    @Override // com.waze.uid.e.f
    public final boolean j() {
        com.waze.uid.d.q.f44463a.a().c().p(((UidModel) this.f44485c.b()).getFlowContext().getOnboardingContext(), com.waze.uid.stats.j.f44753a);
        return super.j();
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        int i2 = 1;
        if (sVar instanceof v) {
            com.waze.uid.b.m mVar = this.f44485c;
            mVar.k(mVar.a().b(new com.waze.uid.b.n((byte[]) null)));
            com.waze.uid.d.c cVar = com.waze.uid.d.q.f44463a.a().f44464b;
            com.waze.uid.e.d dVarB = mVar.b();
            h.g.b.x.e(dVarB, "<get-model>(...)");
            bm bmVarM = m();
            h.g.b.x.e(mVar, "controller");
            cVar.b((UidModel) dVarB, com.waze.ui.v.f.l(bmVarM, mVar, null, new n(this, i2), new n(this, 0)));
            return;
        }
        if (sVar instanceof aa) {
            com.waze.uid.b.m mVar2 = this.f44485c;
            mVar2.k(mVar2.a().b(null).e(new bb(m(), null)));
            if (((UidModel) mVar2.b()).getEmailParameters().getPinCodeToken().length() > 0) {
                mVar2.w(new com.waze.uid.b.v(R.string.VERIFY_EMAIL_SENT_MSG, R.drawable.toast_check, null));
                return;
            }
            return;
        }
        if (sVar instanceof e) {
            ((UidModel) this.f44485c.b()).getEmailParameters().setPinCodeUuid(((e) sVar).a());
            n();
            return;
        }
        if (sVar instanceof b) {
            com.waze.uid.stats.s sVarC = com.waze.uid.d.q.f44463a.a().c();
            com.waze.uid.b.m mVar3 = this.f44485c;
            sVarC.p(((UidModel) mVar3.b()).getFlowContext().getOnboardingContext(), com.waze.uid.stats.j.f44756d);
            ((UidModel) mVar3.b()).getEmailParameters().setPinCode(((b) sVar).a());
            n();
            return;
        }
        if (sVar instanceof u) {
            com.waze.uid.d.q.f44463a.a().c().p(((UidModel) this.f44485c.b()).getFlowContext().getOnboardingContext(), com.waze.uid.stats.j.f44754b);
            return;
        }
        if (sVar instanceof t) {
            com.waze.uid.d.q.f44463a.a().c().p(((UidModel) this.f44485c.b()).getFlowContext().getOnboardingContext(), com.waze.uid.stats.j.f44755c);
        } else if (!(sVar instanceof d)) {
            super.o(sVar);
        } else {
            ((UidModel) this.f44485c.b()).getEmailParameters().setContinuedAsGuest(true);
            com.waze.uid.d.q.f44463a.a().f44467e.n(new q(this));
        }
    }
}
