package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.os.RemoteException;
import android.telecom.Call;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ogz {
    public final Object a;
    public final Object b;

    public ogz(byte[] bArr) {
        HashMap map = new HashMap();
        this.b = map;
        this.a = new HashMap();
        map.put("MODEL", 1);
        map.put("ENERGY_PROFILE", 2);
        map.put("TOLLCARD", 3);
        map.put("SPEED", 5);
        map.put("MILEAGE", 6);
        map.put("ENERGY_LEVEL", 4);
        map.put("ACCELEROMETER", 20);
        map.put("COMPASS", 21);
        map.put("GYROSCOPE", 22);
        map.put("CAR_LOCATION", 23);
    }

    public final void a() {
        lnm.j().f((lvg) this.b);
    }

    public final void b(boolean z) {
        lnm.j().g((lvg) this.b, z);
    }

    public final boolean c() {
        return ((lvg) this.b).o();
    }

    public final lkc d(yzz yzzVar) {
        return new lpa((lmb) this.a, (ComponentName) this.b, yzzVar);
    }

    public final void e(kpv kpvVar) {
        mki.a.d.execute(new kot(this, kpvVar, 4, null));
    }

    public final void f(final Optional optional, final kpx kpxVar, final kpw kpwVar) {
        if (!optional.isEmpty()) {
            e(new kpv() { // from class: kpt
                @Override // defpackage.kpv
                public final void a(jlo jloVar) {
                    boolean zA = kpwVar.a(jloVar, (CarInfoInternal) optional.get());
                    kqb.a();
                    kqd kqdVarA = kqd.a();
                    Optional optionalEmpty = (Optional) kqdVarA.a.e();
                    if (optionalEmpty == null) {
                        optionalEmpty = Optional.empty();
                    }
                    kpx kpxVar2 = kpxVar;
                    kqdVarA.b(optionalEmpty);
                    kpxVar2.a(zA);
                }
            });
        } else {
            ((ype) ((ype) ((yns) this.b).h()).ai((char) 3367)).u("Database operation not completed, no CarInfoInternal provided.");
            kpxVar.a(false);
        }
    }

    public final void g() {
        ActionStripView actionStripView = (ActionStripView) this.b;
        actionStripView.setVisibility(8);
        actionStripView.clearAnimation();
    }

    public final void h(Runnable runnable) throws Resources.NotFoundException {
        ActionStripView actionStripView = (ActionStripView) this.b;
        if (actionStripView.getVisibility() == 0) {
            return;
        }
        actionStripView.setVisibility(0);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation((Context) this.a, R.anim.action_strip_fade_in_animation);
        animationLoadAnimation.setAnimationListener(new kcq(runnable));
        actionStripView.setAnimation(animationLoadAnimation);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean i(int i) {
        Boolean bool = (Boolean) this.a.get(Integer.valueOf(i));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public ogz(File file, pkt pktVar) {
        this.b = file;
        this.a = pktVar;
    }

    public ogz(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ogz(lky lkyVar, afdr afdrVar) {
        this.a = lkyVar;
        this.b = afdrVar;
    }

    public ogz(cil cilVar, afdr afdrVar) {
        cilVar.getClass();
        this.b = cilVar;
        this.a = afdrVar;
    }

    public ogz(lvi lviVar, lwb lwbVar) {
        lviVar.getClass();
        this.b = lviVar;
        this.a = lwbVar;
    }

    public ogz(ActionStripView actionStripView, geu geuVar) {
        this.b = actionStripView;
        this.a = geuVar;
    }

    public ogz(ajmd ajmdVar, Call call) {
        ajmdVar.getClass();
        this.b = ajmdVar;
        this.a = call;
    }

    public ogz(eqa eqaVar, ajmd ajmdVar, kny knyVar) {
        knc kncVar = new knc(eqaVar, new knq(ajmdVar, knyVar));
        this.a = new knd(this);
        this.b = kncVar;
    }

    public ogz(Context context) {
        this.b = yph.c("GH.CONN.LD.DbMediator");
        this.a = context;
    }

    public ogz(ovi oviVar, oct octVar) {
        this.a = oviVar;
        this.b = octVar;
        try {
            oviVar.g(new ove(this));
        } catch (RemoteException e) {
            Log.e("CSL.DrawerController", "Error setting DrawerCallbacks", e);
        }
    }

    public ogz() {
        this.b = new thp(new lkr(), lkk.a);
        this.a = new thp(new lld(), lkj.a);
    }
}
