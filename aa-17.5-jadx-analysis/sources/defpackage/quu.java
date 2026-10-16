package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.car.ActivityLaunchInfo;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class quu extends ijo implements quv {
    public final qup a;
    private final sss b;
    private qqp c;

    public quu(qup qupVar) {
        super("com.google.android.gms.car.ICarActivityStartListener");
        this.b = new sss(Looper.getMainLooper());
        this.a = qupVar;
    }

    private final void g() {
        if (this.c != null) {
            this.c = null;
            rox.l(new rea(this, 3));
        }
    }

    public final synchronized void a() {
        if (rrd.e("GH.PrxyActStartLstnr", 3)) {
            rrd.d(3, "GH.PrxyActStartLstnr", null, "Clearing local CarActivityStartListener %s", this.c);
        }
        g();
    }

    @Deprecated
    public final synchronized void b(Intent intent) {
        if (this.c != null) {
            this.b.post(new oyx(7));
        } else if (rrd.e("GH.PrxyActStartLstnr", 4)) {
            rrd.d(4, "GH.PrxyActStartLstnr", null, "Trying to send onNewActivityRequestOnPrimaryDisplayAndRegion but there is no registered CarActivityStartListener. Intent: %s", intent);
        }
    }

    public final synchronized void c(qqp qqpVar) throws RemoteException {
        if (rrd.e("GH.PrxyActStartLstnr", 3)) {
            rrd.d(3, "GH.PrxyActStartLstnr", null, "Registering local CarActivityStartListener %s", qqpVar);
        }
        if (this.c != null) {
            throw new IllegalStateException("Attempted registration of multiple CarActivityStartListeners");
        }
        this.a.aK(this);
        this.c = qqpVar;
    }

    public final synchronized void d(qqp qqpVar) {
        if (rrd.e("GH.PrxyActStartLstnr", 3)) {
            rrd.d(3, "GH.PrxyActStartLstnr", null, "Unregistering local CarActivityStartListener %s", qqpVar);
        }
        qqp qqpVar2 = this.c;
        if (qqpVar2 != null && qqpVar2 != qqpVar) {
            throw new IllegalStateException("Attempting to unregister wrong CarActivityStartListener");
        }
        g();
    }

    @Override // defpackage.quv
    public final synchronized void e(final ActivityLaunchInfo activityLaunchInfo) {
        final qqp qqpVar = this.c;
        if (qqpVar != null) {
            this.b.post(new Runnable() { // from class: reb
                @Override // java.lang.Runnable
                public final void run() {
                    mpd mpdVar = (mpd) qqpVar;
                    boolean zM = mpdVar.m();
                    ActivityLaunchInfo activityLaunchInfo2 = activityLaunchInfo;
                    if (zM) {
                        ((ype) mpd.a.l().ai((char) 5149)).y("Activity start when inactive, ignoring. %s", activityLaunchInfo2);
                        return;
                    }
                    yph yphVar = mpd.a;
                    ((ype) yphVar.l().ai((char) 5148)).y("Projected activity start requested: %s", activityLaunchInfo2);
                    CarRegionId carRegionId = activityLaunchInfo2.b;
                    mpa mpaVarA = mpdVar.a(carRegionId);
                    if (!mpaVarA.a) {
                        ohs ohsVarJ = ebf.j();
                        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.ACTIVITY_TRACKER, yzy.qg);
                        rrbVarH.n(carRegionId);
                        ohsVarJ.F(rrbVarH.l());
                        mpaVarA.a = true;
                    }
                    Intent intent = activityLaunchInfo2.a;
                    mpa mpaVarA2 = mpdVar.a(carRegionId);
                    ComponentName component = intent.getComponent();
                    component.getClass();
                    mqb mqbVarB = mpe.a().b(intent);
                    mqbVarB.getClass();
                    List list = mpdVar.d;
                    String packageName = component.getPackageName();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((mpb) it.next()).e(intent, carRegionId);
                    }
                    ygr ygrVar = mpdVar.c;
                    if (!ygrVar.contains(component)) {
                        ComponentName componentName = mqbVarB.a;
                        if (!ygrVar.contains(componentName) && (!packageName.equals(RemoteApiConstants.NOW_PACKAGE) || (lal.a().b() && !intent.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_PREWARM", false)))) {
                            mqc mqcVarA = lem.a().a(kio.b().e(), mqbVarB);
                            if (mqcVarA == null) {
                                if (!mpd.b.contains(componentName.getPackageName()) && CarDisplayId.b(carRegionId.h)) {
                                    ((ype) ((ype) yphVar.f()).ai((char) 5142)).y("Ignoring non-launchable app target %s", mqbVarB);
                                    return;
                                }
                                mqcVarA = new mqc(mqbVarB, mpz.a, false, false, false);
                            }
                            if (!mjv.b().d(kio.b().e(), packageName, qpi.f) && (!lzf.c() || !mjv.b().d(kio.b().e(), packageName, qpi.j))) {
                                ((ype) ((ype) yphVar.f()).ai((char) 5141)).y("Package %s is not allowed in full-screen mode - switching to overview", packageName);
                                ohs ohsVarJ2 = ebf.j();
                                rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.FACET_BAR, yzy.n);
                                rrbVarH2.g(packageName);
                                rrbVarH2.n(carRegionId);
                                ohsVarJ2.F(rrbVarH2.l());
                                mpz mpzVar = mqcVarA.b;
                                if (component.equals(lgv.a().a(mpzVar))) {
                                    lgv.a().d(mpzVar);
                                }
                                Intent intent2 = new Intent();
                                mpx.d();
                                ComponentName componentName2 = mkn.z;
                                componentName2.getClass();
                                mpe.a().i(intent2.setComponent(componentName2));
                                return;
                            }
                            mqc mqcVar = mpaVarA2.c;
                            mpz mpzVar2 = mqcVarA.b;
                            mpz mpzVar3 = mqcVar == null ? mpz.a : mqcVar.b;
                            int iOrdinal = mpzVar2.ordinal();
                            if ((iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) && (mpzVar3 != mpzVar2 || (mqcVar != null && !mqcVar.a.equals(mqbVarB)))) {
                                nsx nsxVarE = lxw.E();
                                kio.b().e();
                                if (nsxVarE.d(carRegionId)) {
                                    kfl.h().P(mpd.o(mpzVar2));
                                    ((ype) yphVar.l().ai((char) 5156)).y("updateGsaWithNewCategory %s", mpzVar2);
                                }
                            }
                            if (!mpd.n(mqcVarA, mpdVar.a(carRegionId).c)) {
                                int iOrdinal2 = mpzVar2.ordinal();
                                yzz yzzVar = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? yzz.OEM_FACET : yzz.MEDIA_FACET : yzz.PHONE_FACET : yzz.MAPS_FACET;
                                ohs ohsVarJ3 = ebf.j();
                                rrb rrbVarH3 = rrc.h(yxy.GEARHEAD, yzzVar, yzy.b);
                                rrbVarH3.p(mqcVarA.a());
                                rrbVarH3.n(carRegionId);
                                ohsVarJ3.F(rrbVarH3.l());
                            }
                            mpdVar.i(mqcVarA, carRegionId);
                            long jElapsedRealtime = mpd.n(mpaVarA2.c, mqcVarA) ? mpaVarA2.d : SystemClock.elapsedRealtime();
                            mpaVarA2.d = jElapsedRealtime;
                            mpaVarA2.c = mqcVarA;
                            mpaVarA2.b = carRegionId;
                            mpdVar.k(carRegionId, mqcVarA, jElapsedRealtime);
                            mpd.l(mqcVarA, carRegionId, mpdVar.h);
                            nsx nsxVarE2 = lxw.E();
                            kio.b().e();
                            if (nsxVarE2.d(carRegionId) && CarDisplayId.b(carRegionId.h)) {
                                String packageName2 = componentName.getPackageName();
                                kfl.h().z(packageName2);
                                ((ype) yphVar.l().ai((char) 5155)).y("updateGsaWithNewApp %s", packageName2);
                                return;
                            }
                            return;
                        }
                    }
                    ((ype) yphVar.l().ai(5139)).M("Ignoring start of %s in %s", intent, carRegionId);
                }
            });
        } else if (rrd.e("GH.PrxyActStartLstnr", 4)) {
            rrd.d(4, "GH.PrxyActStartLstnr", null, "Trying to send onActivityStartRequested but there is no registered CarActivityStartListener. %s", activityLaunchInfo);
        }
    }

    @Override // defpackage.quv
    @Deprecated
    public final synchronized void f(Intent intent) {
        qqp qqpVar = this.c;
        char[] cArr = null;
        if (qqpVar != null) {
            this.b.post(new qqy(qqpVar, intent, 15, cArr));
        } else if (rrd.e("GH.PrxyActStartLstnr", 4)) {
            rrd.d(4, "GH.PrxyActStartLstnr", null, "Trying to send onActivityStartedOnPrimaryDisplayAndRegion but there is no registered CarActivityStartListener. Intent: %s", intent);
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            Intent intent = (Intent) ijp.a(parcel, Intent.CREATOR);
            ijp.d(parcel);
            f(intent);
        } else if (i == 2) {
            Intent intent2 = (Intent) ijp.a(parcel, Intent.CREATOR);
            ijp.d(parcel);
            b(intent2);
        } else {
            if (i != 3) {
                return false;
            }
            ActivityLaunchInfo activityLaunchInfo = (ActivityLaunchInfo) ijp.a(parcel, ActivityLaunchInfo.CREATOR);
            ijp.d(parcel);
            e(activityLaunchInfo);
        }
        return true;
    }

    public quu() {
        throw null;
    }
}
