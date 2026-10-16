package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhoneErrorActivity;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.carsetup.CarInfoInternal;

/* loaded from: classes.dex */
public final class mfp implements mfl, mfm {
    public static final yph a = yph.c("GH.PreflightManager");
    public final mgn b = new mgn();
    public mfo c;

    @Override // defpackage.mfm
    public final void b() {
        if (this.c == null) {
            ((ype) ((ype) a.h()).ai((char) 4867)).u("Preflight not in progress!");
            return;
        }
        ((ype) a.l().ai((char) 4866)).u("tearDown, broadcasting TEARDOWN event");
        this.b.a(mgl.a);
        mfo mfoVar = this.c;
        mfoVar.getClass();
        Context context = mki.a.c;
        int i = PreflightPhoneErrorActivity.o;
        context.startActivity(new Intent(context, (Class<?>) PreflightPhoneErrorActivity.class).setFlags(268435456).addFlags(32768).putExtra("com.google.android.apps.auto.components.preflight.phone.EXTRA_CONNECTION_TYPE", mfoVar.c), luk.c());
        d();
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.mfm
    public final void c(qrn qrnVar, kgx kgxVar, boolean z, int i, CarInfoInternal carInfoInternal) {
        final int iA;
        if (!qrnVar.b()) {
            ((ype) ((ype) a.h()).ai((char) 4865)).u("Car not currently connected, likely being torn down");
            return;
        }
        if (this.c != null) {
            ((ype) ((ype) a.h()).ai((char) 4864)).u("Preflight already in progress!");
            return;
        }
        roj rojVar = null;
        mfo mfoVar = new mfo(this, kgxVar, qrnVar, new lgx((byte[]) null), z, i, carInfoInternal);
        this.c = mfoVar;
        mfi mfiVar = mfoVar.d;
        qrn qrnVar2 = mfoVar.a;
        ((ype) mfi.a.l().ai((char) 4847)).u("starting");
        try {
            mki.a.f();
            roj rojVarY = ((raz) qrnVar2).a.y();
            if (rojVarY.d(11)) {
                rojVar = rojVarY;
            }
        } catch (qrz | qsa unused) {
            ((ype) ((ype) mfi.a.h()).ai((char) 4844)).u("Unable to access CarSensorManager!");
        }
        mfiVar.e = rojVar;
        roj rojVar2 = mfiVar.e;
        if (rojVar2 != null) {
            try {
                qse qseVar = mfiVar.b;
                rojVar2.f(qseVar, 11, 0);
                roj rojVar3 = mfiVar.e;
                rojVar3.getClass();
                qsf qsfVarA = rojVar3.a(11);
                if (qsfVarA != null) {
                    qseVar.d(qsfVarA.a, qsfVarA.b, qsfVarA.c, qsfVarA.d);
                }
            } catch (qrz e) {
                ((ype) ((ype) ((ype) mfi.a.h()).p(e)).ai((char) 4846)).u("Unable to setup driveStatusEventListener!");
                mfiVar.a();
            }
        }
        mfp mfpVar = mfoVar.j;
        mfpVar.b.b(mfoVar.i);
        mfoVar.h.a();
        mfo mfoVar2 = mfpVar.c;
        mfoVar2.getClass();
        qrn qrnVar3 = mfoVar2.a;
        qrnVar3.getClass();
        yph yphVar = mfj.a;
        mki.a.g();
        yzz yzzVar = yzz.PREFLIGHT;
        int i2 = 1;
        try {
            rce rceVar = ((raz) qrnVar3).a;
            if (!rceVar.N("frx_activation_logged")) {
                ((ohs) mki.a.i(ohs.class)).F(rrc.h(yxy.FRX, yzzVar, yzy.bX).l());
                rceVar.n("frx_activation_logged", true);
                ((ype) ((ype) mfj.a.f()).ai(4849)).u("FRX Activation Logged");
            }
        } catch (IllegalStateException e2) {
            ((ype) ((ype) ((ype) mfj.a.g()).p(e2)).ai((char) 4851)).u("Client is not connected while writing activation bit");
        } catch (qrz e3) {
            ((ype) ((ype) ((ype) mfj.a.g()).p(e3)).ai((char) 4850)).u("Failed to write FRX activation bit");
        }
        if (acvh.a.gu().p()) {
            Context context = mki.a.c;
            ((ype) ((ype) len.a.f()).ai((char) 3809)).u("Cancelling any pending FRX Rewinds");
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            jobScheduler.getClass();
            jobScheduler.cancel(368496209);
        }
        mfo mfoVar3 = this.c;
        mfoVar3.getClass();
        ?? r0 = mfoVar3.k.a;
        int i3 = ((yls) r0).c;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                iA = 0;
                break;
            }
            mhf mhfVar = (mhf) r0.get(i4);
            i4++;
            if (!mhfVar.e()) {
                iA = mhfVar.a();
                break;
            }
        }
        if (iA == 0) {
            yph yphVar2 = a;
            ((ype) ((ype) yphVar2.f()).ai((char) 4863)).u("Preflight checks passed. Completing preflight as no-op.");
            if (z) {
                ((ype) yphVar2.l().ai((char) 4861)).u("Logging FRX Complete since legacyFrxRan");
                ((ohs) mki.a.i(ohs.class)).F(rrc.h(yxy.FRX, yzz.FRX_COMPLETION_SUCCESS_PROJECTED, yzy.f).l());
            }
            mfo mfoVar4 = this.c;
            mfoVar4.getClass();
            mfoVar4.a(true);
            return;
        }
        yph yphVar3 = a;
        ((ype) ((ype) yphVar3.f()).ai(4862)).w("Preflight detected missing requirement: %d", iA);
        ((ype) yphVar3.l().ai(4859)).w("Launching Preflight UI, missingRequirementId: %d", iA);
        final qql qqlVar = new qql();
        qqlVar.e = CarRegionId.d;
        kgq.c(new kja(new kiy() { // from class: mfn
            @Override // defpackage.kiy
            public final void a() throws qrz {
                Intent component = new Intent().setComponent(mfk.a);
                Bundle bundle = new Bundle();
                bundle.putInt("missing_requirement_id", iA);
                Intent intentPutExtras = component.putExtras(bundle);
                mfo mfoVar5 = this.a.c;
                mfoVar5.getClass();
                mki.a.g();
                qrn qrnVar4 = mfoVar5.a;
                ((raz) qrnVar4).a.z(intentPutExtras, qqlVar.a());
            }
        }, i2), "GH.PreflightManager", yzz.PREFLIGHT, yzy.uj, false, "Unable to start Preflight UI", new Object[0]);
        if (iA != 2 && iA != 3) {
            ((ype) ((ype) yphVar3.f()).ai((char) 4860)).u("Launching Welcome Activity");
            Context context2 = mki.a.c;
            context2.startActivity(new Intent(context2, (Class<?>) PreflightPhoneWelcomeActivity.class).setFlags(268435456).addFlags(32768), luk.c());
        }
        ols.M(mki.a.c, yxi.PREFLIGHT_UI_STARTING);
    }

    public final void d() {
        mfo mfoVar = this.c;
        mfoVar.getClass();
        ((ype) ((ype) a.f()).ai((char) 4858)).u("tearDown");
        mfoVar.d.a();
        mfoVar.j.b.c(mfoVar.i);
        mhh mhhVar = mfoVar.h;
        mhhVar.c.removeMessages(0);
        mhhVar.d = true;
        boolean zIsEmpty = mhhVar.b.isEmpty();
        ype ypeVar = (ype) mfu.a.l().ai(4869);
        mfu mfuVar = mfoVar.f;
        ypeVar.Q("Evaluating completion: frxRequirementsProcessed: %b, allRequirementsProcessed: %b", mfuVar.b, zIsEmpty);
        if (mfuVar.b) {
            ((ohs) mki.a.i(ohs.class)).F(rrc.h(yxy.FRX, zIsEmpty ? yzz.FRX_COMPLETION_SUCCESS_PROJECTED : yzz.FRX_COMPLETION_FAILURE, yzy.f).l());
        }
        this.c = null;
    }

    @Override // defpackage.mfm
    public final mfl a() {
        return this;
    }
}
