package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mfx implements defpackage.mft, defpackage.mfu {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.PreflightManager");
    public final defpackage.mgv b = new defpackage.mgv();
    public defpackage.mfw c;

    @Override // defpackage.mfu
    public final void b() {
        if (this.c == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4870)).u("Preflight not in progress!");
            return;
        }
        ((defpackage.yqj) a.l().ai((char) 4869)).u("tearDown, broadcasting TEARDOWN event");
        this.b.a(defpackage.mgt.a);
        defpackage.mfw mfwVar = this.c;
        mfwVar.getClass();
        android.content.Context context = defpackage.mkp.a.c;
        int i = com.google.android.apps.auto.components.preflight.phone.PreflightPhoneErrorActivity.o;
        context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.preflight.phone.PreflightPhoneErrorActivity.class).setFlags(268435456).addFlags(32768).putExtra("com.google.android.apps.auto.components.preflight.phone.EXTRA_CONNECTION_TYPE", mfwVar.c), defpackage.luq.c());
        d();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.mfu
    public final void c(defpackage.qsh qshVar, defpackage.ntl ntlVar, boolean z, int i, com.google.android.gms.carsetup.CarInfoInternal carInfoInternal) throws rlo {
        ?? r0;
        int i2;
        int i3;
        final int iA;
        if (!qshVar.b()) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4868)).u("Car not currently connected, likely being torn down");
            return;
        }
        if (this.c != null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4867)).u("Preflight already in progress!");
            return;
        }
        defpackage.rpe rpeVar = null;
        defpackage.mfw mfwVar = new defpackage.mfw(this, ntlVar, qshVar, new defpackage.ldx((byte[]) null), z, i, carInfoInternal);
        this.c = mfwVar;
        defpackage.mfq mfqVar = mfwVar.d;
        defpackage.qsh qshVar2 = mfwVar.a;
        ((defpackage.yqj) defpackage.mfq.a.l().ai((char) 4850)).u("starting");
        try {
            defpackage.mkp.a.f();
            defpackage.rpe rpeVarY = ((defpackage.rbu) qshVar2).a.y();
            if (rpeVarY.d(11)) {
                rpeVar = rpeVarY;
            }
        } catch (defpackage.qst | defpackage.qsu unused) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.mfq.a.h()).ai((char) 4847)).u("Unable to access CarSensorManager!");
        }
        mfqVar.e = rpeVar;
        defpackage.rpe rpeVar2 = mfqVar.e;
        if (rpeVar2 != null) {
            try {
                defpackage.qsy qsyVar = mfqVar.b;
                rpeVar2.f(qsyVar, 11, 0);
                defpackage.rpe rpeVar3 = mfqVar.e;
                rpeVar3.getClass();
                defpackage.qsz qszVarA = rpeVar3.a(11);
                if (qszVarA != null) {
                    qsyVar.d(qszVarA.a, qszVarA.b, qszVarA.c, qszVarA.d);
                }
            } catch (defpackage.qst e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.mfq.a.h()).p(e)).ai((char) 4849)).u("Unable to setup driveStatusEventListener!");
                mfqVar.a();
            }
        }
        defpackage.mfx mfxVar = mfwVar.j;
        mfxVar.b.b(mfwVar.i);
        mfwVar.h.a();
        defpackage.mfw mfwVar2 = mfxVar.c;
        mfwVar2.getClass();
        defpackage.qsh qshVar3 = mfwVar2.a;
        qshVar3.getClass();
        defpackage.yqm yqmVar = defpackage.mfr.a;
        defpackage.mkp.a.g();
        defpackage.zbe zbeVar = defpackage.zbe.PREFLIGHT;
        int i4 = 1;
        try {
            defpackage.rcz rczVar = ((defpackage.rbu) qshVar3).a;
            if (!rczVar.N("frx_activation_logged")) {
                ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).F(defpackage.rrw.h(defpackage.yzd.FRX, zbeVar, defpackage.zbd.bX).l());
                rczVar.n("frx_activation_logged", true);
                ((defpackage.yqj) ((defpackage.yqj) defpackage.mfr.a.f()).ai(4852)).u("FRX Activation Logged");
            }
            while (true) {
                if (i3 >= i2) {
                    iA = 0;
                    break;
                }
                defpackage.mhm mhmVar = (defpackage.mhm) r0.get(i3);
                i3++;
                if (!mhmVar.e()) {
                    iA = mhmVar.a();
                    break;
                }
            }
        } catch (java.lang.IllegalStateException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.mfr.a.g()).p(e2)).ai((char) 4854)).u("Client is not connected while writing activation bit");
        } catch (defpackage.qst e3) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.mfr.a.g()).p(e3)).ai((char) 4853)).u("Failed to write FRX activation bit");
        }
        if (defpackage.acwj.a.fF().p()) {
            android.content.Context context = defpackage.mkp.a.c;
            ((defpackage.yqj) ((defpackage.yqj) les.a.f()).ai((char) 3812)).u("Cancelling any pending FRX Rewinds");
            android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
            jobScheduler.getClass();
            jobScheduler.cancel(368496209);
        }
        defpackage.mfw mfwVar3 = this.c;
        mfwVar3.getClass();
        r0 = mfwVar3.k.a;
        i2 = ((defpackage.ymx) r0).c;
        i3 = 0;
        if (iA == 0) {
            defpackage.yqm yqmVar2 = a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 4866)).u("Preflight checks passed. Completing preflight as no-op.");
            if (z) {
                ((defpackage.yqj) yqmVar2.l().ai((char) 4864)).u("Logging FRX Complete since legacyFrxRan");
                ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).F(defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.FRX_COMPLETION_SUCCESS_PROJECTED, defpackage.zbd.f).l());
            }
            defpackage.mfw mfwVar4 = this.c;
            mfwVar4.getClass();
            mfwVar4.a(true);
            return;
        }
        defpackage.yqm yqmVar3 = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai(4865)).w("Preflight detected missing requirement: %d", iA);
        ((defpackage.yqj) yqmVar3.l().ai(4862)).w("Launching Preflight UI, missingRequirementId: %d", iA);
        final defpackage.qrh qrhVar = new defpackage.qrh();
        qrhVar.e = com.google.android.gms.car.display.CarRegionId.d;
        defpackage.kgu.c(new defpackage.kjg(new defpackage.kje() { // from class: mfv
            @Override // defpackage.kje
            public final void a() throws defpackage.qst {
                android.content.Intent component = new android.content.Intent().setComponent(defpackage.mfs.a);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("missing_requirement_id", iA);
                android.content.Intent intentPutExtras = component.putExtras(bundle);
                defpackage.mfw mfwVar5 = this.a.c;
                mfwVar5.getClass();
                defpackage.mkp.a.g();
                defpackage.qsh qshVar4 = mfwVar5.a;
                ((defpackage.rbu) qshVar4).a.z(intentPutExtras, qrhVar.a());
            }
        }, i4), "GH.PreflightManager", defpackage.zbe.PREFLIGHT, defpackage.zbd.un, false, "Unable to start Preflight UI", new java.lang.Object[0]);
        if (iA != 2 && iA != 3) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 4863)).u("Launching Welcome Activity");
            android.content.Context context2 = defpackage.mkp.a.c;
            context2.startActivity(new android.content.Intent(context2, (java.lang.Class<?>) com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity.class).setFlags(268435456).addFlags(32768), defpackage.luq.c());
        }
        defpackage.omv.i(defpackage.mkp.a.c, defpackage.yyn.PREFLIGHT_UI_STARTING);
    }

    public final void d() {
        defpackage.mfw mfwVar = this.c;
        mfwVar.getClass();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4861)).u("tearDown");
        mfwVar.d.a();
        mfwVar.j.b.c(mfwVar.i);
        defpackage.mho mhoVar = mfwVar.h;
        mhoVar.c.removeMessages(0);
        mhoVar.d = true;
        boolean zIsEmpty = mhoVar.b.isEmpty();
        defpackage.yqj yqjVar = (defpackage.yqj) defpackage.mgc.a.l().ai(4872);
        defpackage.mgc mgcVar = mfwVar.f;
        yqjVar.Q("Evaluating completion: frxRequirementsProcessed: %b, allRequirementsProcessed: %b", mgcVar.b, zIsEmpty);
        if (mgcVar.b) {
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.FRX, zIsEmpty ? defpackage.zbe.FRX_COMPLETION_SUCCESS_PROJECTED : defpackage.zbe.FRX_COMPLETION_FAILURE, defpackage.zbd.f).l());
        }
        this.c = null;
    }

    @Override // defpackage.mfu
    public final defpackage.mft a() {
        return this;
    }
}
