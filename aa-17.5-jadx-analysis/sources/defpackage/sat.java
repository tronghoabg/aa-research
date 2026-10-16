package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.Closeable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class sat {
    public final Handler c;
    public final CarSetupServiceImpl d;
    public final Context e;
    public final sak f;
    public final sgn g;
    public Closeable h;
    public Bundle i;
    public Runnable j;
    public long k;
    public int l;
    public int m;
    public sgy n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public volatile boolean s;
    public volatile boolean t;
    public ComponentName v;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final Runnable b = new rsv(this, 12);
    public final AtomicReference u = new AtomicReference(null);

    public sat(Handler handler, CarSetupServiceImpl carSetupServiceImpl, Context context, sak sakVar, sgn sgnVar) {
        CarSetupServiceImpl.a.f().ai(8602).u("Creating ConnectionHandoffStateManager");
        this.c = handler;
        this.n = null;
        this.d = carSetupServiceImpl;
        this.e = context;
        this.f = sakVar;
        this.g = sgnVar;
    }

    public final Bundle a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("car_handoff_start_activities", true);
        bundle.putBoolean("car_handoff_user_authorized_projection", z);
        bundle.putInt("connection_tag", this.m);
        CarSetupServiceImpl.a.l().ai(8604).y("At Handoff, legacyFrxRan: %b", Boolean.valueOf(this.r));
        bundle.putBoolean("car_handoff_legacy_frx_ran", this.r);
        return bundle;
    }

    public final void b() {
        boolean zBooleanValue;
        if (this.o) {
            try {
                zBooleanValue = ((Boolean) ((zeu) this.n.a(this.k, a(true))).t(500L, TimeUnit.MILLISECONDS)).booleanValue();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                CarSetupServiceImpl.a.h().p(e).ai(8611).u("Could not complete call to startup service");
                zBooleanValue = false;
            }
            woy.aa(zBooleanValue, "Failed to signal user authorization state");
            Context context = this.e;
            Intent intentPutExtra = new Intent("com.google.android.gms.car.HANDOFF_USER_AUTHORIZATION").setComponent((ComponentName) rhz.a.gu()).putExtra("car_handoff_user_authorized_projection", true).putExtra("car_handoff_session_id", this.k);
            sgn sgnVar = this.g;
            ypf ypfVar = CarSetupServiceImpl.a;
            sgnVar.a(intentPutExtra);
            if (f()) {
                intentPutExtra.putExtra("car_handoff_is_car_audio_service_migration_enabled", true);
            }
            context.startService(intentPutExtra);
        }
    }

    public final void c(ComponentName componentName, boolean z) {
        ypf ypfVar = CarSetupServiceImpl.a;
        yop yopVarAi = ypfVar.f().ai(8616);
        String strFlattenToString = componentName == null ? "null" : componentName.flattenToString();
        zjc zjcVar = zjc.a;
        yopVarAi.M("Interested in handoff %s %b", new zjd(zjcVar, strFlattenToString), new zjd(zjcVar, Boolean.valueOf(z)));
        if (aczv.a.gu().ah() && componentName == null) {
            if (z) {
                throw new IllegalStateException("onInterestedInHandoff: Canadiate is null but interested is true");
            }
        } else if (z) {
            componentName.getClass();
            this.v = componentName;
            ypfVar.f().ai(8608).u("Interested in handoff - start handoff");
            sak sakVar = this.f;
            abnp abnpVarN = yxb.a.n();
            abnp abnpVarN2 = yyz.a.n();
            abnpVarN2.t();
            yyz yyzVar = (yyz) abnpVarN2.b;
            yyzVar.b |= 1;
            yyzVar.c = 27;
            abnpVarN2.t();
            yyz yyzVar2 = (yyz) abnpVarN2.b;
            yyzVar2.b |= 2;
            yyzVar2.d = 3009;
            yyz yyzVar3 = (yyz) abnpVarN2.q();
            abnpVarN.t();
            yxb yxbVar = (yxb) abnpVarN.b;
            yyzVar3.getClass();
            yxbVar.p = yyzVar3;
            yxbVar.b |= 8192;
            sakVar.d((yxb) abnpVarN.q(), yxc.NON_UI);
            this.c.post(new rsv(this, 13));
            return;
        }
        if (componentName != null) {
            sgy sgyVar = this.n;
            ((shi) sgyVar).e.post(new rzy(sgyVar, 20));
        } else {
            ypfVar.g().ai(8617).u("All handoff candidates have declined the handoff, running default behavior");
            this.n.b();
            this.c.post(this.j);
        }
    }

    public final void d(xhv xhvVar) {
        yop yopVarAi = CarSetupServiceImpl.a.f().ai(8619);
        int i = xhvVar.i;
        yopVarAi.w("Tearing down car connection for reason %d", i);
        if (!this.p) {
            sgy sgyVar = this.n;
            shi.a.f().ai(8973).w("Tearing down car connection with reason %s", i);
            ((shi) sgyVar).d().execute(new sbj(sgyVar, xhvVar, 3));
        } else if (this.o) {
            this.n.a(this.k, a(false));
            Context context = this.e;
            Intent intentPutExtra = new Intent("com.google.android.gms.car.HANDOFF_USER_AUTHORIZATION").setComponent((ComponentName) rhz.a.gu()).putExtra("car_handoff_user_authorized_projection", false).putExtra("car_handoff_session_id", this.k).putExtra("car_handoff_user_not_authorized_projection_bye_bye_reason", i);
            this.g.a(intentPutExtra);
            if (f()) {
                intentPutExtra.putExtra("car_handoff_is_car_audio_service_migration_enabled", true);
            }
            context.startService(intentPutExtra);
        }
    }

    public final void e(boolean z, boolean z2) {
        if (!this.n.c(z, z2)) {
            throw new IllegalStateException("Authorization state failed to persist");
        }
    }

    public final boolean f() {
        yop yopVarAi = CarSetupServiceImpl.a.f().ai(8607);
        AtomicReference atomicReference = this.u;
        yopVarAi.y("isCarAudioServiceMigrationEnabled: %s", new zjd(zjc.a, atomicReference.get()));
        woy.aa(atomicReference.get() != null, "isCarAudioServiceMigrationEnabled must be set");
        return ((Boolean) atomicReference.get()).booleanValue();
    }
}
