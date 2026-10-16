package defpackage;

import android.content.ComponentName;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.car.app.FailureResponse;
import androidx.car.app.model.Alert;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.DateTimeWithZone;
import androidx.car.app.navigation.model.Destination;
import androidx.car.app.navigation.model.Maneuver;
import androidx.car.app.navigation.model.NavigationVoiceAssistantCapabilities;
import androidx.car.app.navigation.model.Step;
import androidx.car.app.navigation.model.TravelEstimate;
import androidx.car.app.navigation.model.Trip;
import androidx.car.app.serialization.Bundleable;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.auto.sdk.nav.state.DestinationDistance;
import com.google.android.apps.auto.sdk.nav.state.Distance;
import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;
import com.google.android.projection.gearhead.R;
import j$.time.ZoneId;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class esx implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public esx(etj etjVar, MediaSessionCompat.Token token, int i) {
        this.c = i;
        this.a = etjVar;
        this.b = token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v31, types: [fml, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v57, types: [geb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v76, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        flz flzVarA;
        fod fodVar = null;
        Object[] objArr = 0;
        boolean z = false;
        int i = 1;
        switch (this.c) {
            case 0:
                esy esyVar = (esy) this.b;
                boolean zF = esyVar.f();
                Object obj = this.a;
                if (zF) {
                    esyVar.b(obj);
                } else {
                    esyVar.c(obj);
                }
                esyVar.f = 3;
                return;
            case 1:
                ((epg) this.b).b(this.a);
                return;
            case 2:
                etj etjVar = (etj) this.a;
                List list = etjVar.a;
                Object obj2 = this.b;
                if (!list.isEmpty()) {
                    di diVarA = ((MediaSessionCompat.Token) obj2).a();
                    if (diVarA != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((Bundle) it.next()).putBinder("extra_session_binder", diVarA.asBinder());
                        }
                    }
                    list.clear();
                }
                etjVar.b.setSessionToken((MediaSession.Token) ((MediaSessionCompat.Token) obj2).b);
                return;
            case 3:
                ett ettVar = ((etj) this.b).d;
                yw ywVar = ettVar.c;
                Iterator it2 = ywVar.keySet().iterator();
                while (it2.hasNext()) {
                    etg etgVar = (etg) ywVar.get((IBinder) it2.next());
                    Object obj3 = this.a;
                    List list2 = (List) etgVar.d.get(obj3);
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Bundle bundle = (Bundle) ((dzi) it3.next()).b;
                            int i2 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
                            int i3 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                            if (i2 == -1 || i3 == -1 || ((i2 * i3) + i3) - 1 >= 0) {
                                ettVar.h((String) obj3, etgVar, bundle);
                            }
                        }
                    }
                }
                return;
            case 4:
                etg etgVar2 = (etg) ((ett) ((ajmd) this.b).a).c.remove(((erb) this.a).G());
                if (etgVar2 != null) {
                    etgVar2.g.G().unlinkToDeath(etgVar2, 0);
                    return;
                }
                return;
            case 5:
                IBinder iBinderG = ((erb) this.a).G();
                etg etgVar3 = (etg) ((ett) ((ajmd) this.b).a).c.remove(iBinderG);
                if (etgVar3 != null) {
                    iBinderG.unlinkToDeath(etgVar3, 0);
                    return;
                }
                return;
            case 6:
                Object obj4 = this.b;
                try {
                    this.a.run();
                    return;
                } finally {
                    ((ezj) obj4).a();
                }
            case 7:
                Object obj5 = this.b;
                synchronized (((fkm) obj5).k) {
                    arrayList = new ArrayList(((fkm) obj5).j);
                }
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((fkb) arrayList.get(i4)).a((fny) this.a, false);
                }
                return;
            case 8:
                fod fodVar2 = (fod) this.a;
                fjo.a().c(fmb.a, "Scheduling work ".concat(fodVar2.a));
                ((fmb) this.b).b.c(fodVar2);
                return;
            case 9:
                ((sx) ((ajjp) this.a).c).x((gjv) this.b, 3);
                return;
            case 10:
                Iterator it4 = this.a.iterator();
                while (it4.hasNext()) {
                    ((glf) it4.next()).c(((fnc) this.b).d);
                }
                return;
            case 11:
                fkm fkmVar = ((fni) this.b).b.f;
                Object obj6 = fkmVar.k;
                Object obj7 = this.a;
                synchronized (obj6) {
                    flz flzVarB = fkmVar.b((String) obj7);
                    if (flzVarB != null) {
                        fodVar = flzVarB.a;
                    }
                }
                if (fodVar == null || !fodVar.b()) {
                    return;
                }
                ?? r10 = this.b;
                synchronized (((fni) r10).c) {
                    ((fni) r10).f.put(dtb.l(fodVar), fodVar);
                    ((fni) r10).g.put(dtb.l(fodVar), fmp.a(((fni) r10).i, fodVar, (aitu) ((fni) r10).j.c, r10));
                }
                return;
            case 12:
                String string = ((UUID) this.a).toString();
                string.getClass();
                flo floVar = (flo) this.b;
                WorkDatabase workDatabase = floVar.d;
                workDatabase.getClass();
                foe foeVarX = workDatabase.x();
                fnk fnkVarS = workDatabase.s();
                List listBk = woy.bk(string);
                listBk.addAll(dtb.m(fnkVarS, string));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj8 : listBk) {
                    if (foeVarX.b((String) obj8) != null ? !r7.a() : false) {
                        arrayList2.add(obj8);
                    }
                }
                foe foeVarX2 = floVar.d.x();
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    foeVarX2.v((String) it5.next());
                }
                fkm fkmVar2 = floVar.f;
                fkmVar2.getClass();
                synchronized (fkmVar2.k) {
                    fjo.a().c(fkm.a, a.bz(string, "Processor cancelling "));
                    fkmVar2.i.add(string);
                    flzVarA = fkmVar2.a(string);
                }
                fkm.e(string, flzVarA, 1);
                ListIterator listIterator = ((afbt) floVar.e).listIterator(0);
                while (listIterator.hasNext()) {
                    ((fko) listIterator.next()).b(string);
                }
                return;
            case 13:
                gdl gdlVar = (gdl) this.a;
                Alert alertB = gdlVar.b();
                Alert alert = (Alert) this.b;
                if (alert.equals(alertB)) {
                    gdlVar.c();
                    ta callbackDelegate = alert.getCallbackDelegate();
                    if (callbackDelegate != null) {
                        glp glpVar = ((jwq) gdlVar.a).g;
                        glpVar.e(callbackDelegate, 1);
                        glpVar.f(callbackDelegate);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                Object obj9 = this.a;
                try {
                    FailureResponse failureResponse = (FailureResponse) ((Bundleable) this.b).a();
                    gdp gdpVar = new gdp();
                    gdpVar.b = failureResponse.getStackTrace();
                    Object obj10 = ((gej) obj9).d.a;
                    boolean z2 = ((gej) obj9).e.a;
                    int iOrdinal = ((gnk) obj10).ordinal();
                    if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 5) {
                        z = true;
                    }
                    if (z2 || z) {
                        ((gej) obj9).c.c(((gej) obj9).b, (gnk) obj10, gns.a(failureResponse));
                    } else {
                        gdpVar.d = true;
                    }
                    ((gej) obj9).a.a(new gdq(gdpVar));
                    return;
                } catch (xr e) {
                    gej gejVar = (gej) obj9;
                    geb gebVar = gejVar.a;
                    gdp gdpVar2 = new gdp();
                    gdpVar2.a = e;
                    gebVar.a(new gdq(gdpVar2));
                    gejVar.c.c(gejVar.b, (gnk) gejVar.d.a, gns.a(new FailureResponse(e)));
                    return;
                }
            case 15:
                kzt kztVar = (kzt) ((gly) this.b).a;
                kztVar.l((gnk) this.a);
                gdp gdpVar3 = new gdp();
                gdpVar3.e = 2;
                kztVar.b.a(new gdq(gdpVar3));
                return;
            case 16:
                gmg gmgVar = (gmg) this.a;
                gmgVar.k = null;
                gmgVar.f(glx.a);
                Object obj11 = this.b;
                if (obj11 != null && gmgVar.a) {
                    gmgVar.g.f().a((gdq) obj11);
                }
                gmgVar.e();
                glf glfVar = gmgVar.o;
                fug fugVar = (fug) glfVar.b;
                fugVar.h = false;
                geu geuVar = (geu) glfVar.a;
                geuVar.D().a = fugVar.h;
                geuVar.B().a(10);
                gmgVar.g.getApplicationContext().unbindService(gmgVar.e);
                return;
            case 17:
                Object obj12 = this.b;
                Object obj13 = this.a;
                try {
                    final Trip trip = (Trip) ((Bundleable) obj12).a();
                    final gsp gspVar = (gsp) obj13;
                    gev.c(new Runnable() { // from class: gso
                        @Override // java.lang.Runnable
                        public final void run() throws Resources.NotFoundException, IllegalArgumentException {
                            hrj hrjVar;
                            TravelEstimate travelEstimate;
                            int i5;
                            int i6;
                            int type;
                            int roundaboutExitAngle;
                            String strL;
                            Distance distance;
                            int i7;
                            gtl gtlVar;
                            gsr gsrVar = gspVar.a;
                            gsrVar.b(2);
                            jyj jyjVar = gsrVar.d;
                            geu geuVar2 = jyjVar.c;
                            gdv gdvVarD = geuVar2.d();
                            if (jyjVar.d.f() != jyjVar.f) {
                                ((ynz) ((ynz) jyj.a.e()).ai((char) 2835)).y("No focus for host receiving trip update from app %s", gdvVarD);
                                return;
                            }
                            Trip trip2 = trip;
                            un unVar = new un(null, null);
                            unVar.r(true != trip2.isLoading() ? 1 : 5);
                            Object obj14 = unVar.a;
                            mai maiVar = jyjVar.b;
                            maiVar.c((NavigationSummary) obj14);
                            gei geiVar = (gei) geuVar2.l(gei.class);
                            geiVar.getClass();
                            if (trip2 != null) {
                                hrj hrjVar2 = (hrj) geiVar.a.e();
                                int i8 = hrjVar2 == null ? -1 : hrjVar2.b;
                                if (trip2.isLoading()) {
                                    hrjVar = new hrj(3, (Step) null, (androidx.car.app.model.Distance) null, i8);
                                } else {
                                    List<Step> steps = trip2.getSteps();
                                    if (!steps.isEmpty()) {
                                        List<TravelEstimate> stepTravelEstimates = trip2.getStepTravelEstimates();
                                        hrjVar = new hrj(1, steps.get(0), !stepTravelEstimates.isEmpty() ? stepTravelEstimates.get(0).getRemainingDistance() : null, i8);
                                    }
                                    hrjVar = null;
                                }
                            } else {
                                hrjVar = null;
                            }
                            if (hrjVar == null) {
                                geiVar.a();
                            } else {
                                geiVar.a.j(hrjVar);
                            }
                            List<Step> steps2 = trip2.getSteps();
                            if (steps2.isEmpty()) {
                                ((ynz) ((ynz) jyj.a.e()).ai((char) 2834)).y("Received trip to publish without steps for app %s", gdvVarD);
                            } else {
                                List<TravelEstimate> stepTravelEstimates2 = trip2.getStepTravelEstimates();
                                if (stepTravelEstimates2.isEmpty()) {
                                    ((ynz) ((ynz) jyj.a.e()).ai((char) 2833)).y("Received trip to publish without step estimates for app %s", gdvVarD);
                                } else {
                                    Step step = steps2.get(0);
                                    TravelEstimate travelEstimate2 = stepTravelEstimates2.get(0);
                                    List<TravelEstimate> destinationTravelEstimates = trip2.getDestinationTravelEstimates();
                                    if (destinationTravelEstimates.isEmpty()) {
                                        ((ynz) ((ynz) jyj.a.e()).ai((char) 2832)).y("Received trip to publish without dest estimates for app %s", gdvVarD);
                                        travelEstimate = null;
                                    } else {
                                        travelEstimate = destinationTravelEstimates.get(0);
                                    }
                                    yph yphVar = jyi.a;
                                    un unVar2 = new un((char[]) null);
                                    CarText road = step == null ? null : step.getRoad();
                                    String strA = jyi.a(road == null ? null : road.toString());
                                    if (strA != null && !TextUtils.isEmpty(strA)) {
                                        unVar2.n(strA);
                                    }
                                    CarText cue = step == null ? null : step.getCue();
                                    String strA2 = jyi.a(cue == null ? null : cue.toString());
                                    if (strA2 != null && !TextUtils.isEmpty(strA2)) {
                                        unVar2.a(yfq.q(strA2));
                                    }
                                    if (travelEstimate2 != null) {
                                        unVar2.j((int) travelEstimate2.getRemainingTimeSeconds());
                                        androidx.car.app.model.Distance remainingDistance = travelEstimate2.getRemainingDistance();
                                        if (remainingDistance != null) {
                                            unVar2.l(hly.a(remainingDistance));
                                            int displayUnit = remainingDistance.getDisplayUnit();
                                            switch (displayUnit) {
                                                case 1:
                                                    i7 = 1;
                                                    break;
                                                case 2:
                                                    i7 = 2;
                                                    break;
                                                case 3:
                                                    i7 = 3;
                                                    break;
                                                case 4:
                                                    i7 = 4;
                                                    break;
                                                case 5:
                                                    i7 = 5;
                                                    break;
                                                case 6:
                                                    i7 = 6;
                                                    break;
                                                case 7:
                                                    i7 = 7;
                                                    break;
                                                default:
                                                    throw new UnsupportedOperationException("Unsupported distance unit type: " + displayUnit);
                                            }
                                            unVar2.m(i7);
                                            unVar2.k((int) Math.round(remainingDistance.getDisplayDistance() * 1000.0d));
                                        } else {
                                            ((ype) ((ype) jyi.a.h()).ai((char) 2828)).u("Remaining distance in step is expected but not set. Some turn event information will be unavailable");
                                        }
                                    }
                                    if (travelEstimate != null) {
                                        DateTimeWithZone arrivalTimeAtDestination = travelEstimate.getArrivalTimeAtDestination();
                                        if (arrivalTimeAtDestination != null) {
                                            strL = hbz.l(geuVar2, arrivalTimeAtDestination, ZoneId.systemDefault());
                                            if (strL == null) {
                                                throw new IllegalArgumentException("Estimated Time Of Arrival must not be null");
                                            }
                                        } else {
                                            strL = null;
                                        }
                                        long remainingTimeSeconds = -1;
                                        if (travelEstimate.getRemainingTimeSeconds() != -1) {
                                            remainingTimeSeconds = travelEstimate.getRemainingTimeSeconds();
                                            if (remainingTimeSeconds < 0) {
                                                throw new IllegalArgumentException("Time to destination is invalid: -1");
                                            }
                                        }
                                        long j = remainingTimeSeconds;
                                        androidx.car.app.model.Distance remainingDistance2 = travelEstimate.getRemainingDistance();
                                        if (remainingDistance2 != null) {
                                            int iA = hly.a(remainingDistance2);
                                            String strC = hly.c(remainingDistance2);
                                            int displayUnit2 = remainingDistance2.getDisplayUnit();
                                            if (iA < 0) {
                                                throw new IllegalArgumentException("Meters must be a positive value");
                                            }
                                            if (strC == null) {
                                                throw new IllegalArgumentException("DisplayValue must not be null.");
                                            }
                                            if (displayUnit2 <= 0 || displayUnit2 > 7) {
                                                throw new IllegalArgumentException("DisplayUnit is invalid: " + displayUnit2);
                                            }
                                            distance = new Distance(iA, strC, displayUnit2);
                                        } else {
                                            ((ype) ((ype) jyi.a.h()).ai((char) 2827)).u("Remaining distance in destination is expected but not set. Some turn event information will be unavailable");
                                            distance = null;
                                        }
                                        unVar2.d(new ArrayList(yfq.q(new DestinationDistance(distance, strL, j))));
                                    }
                                    Maneuver maneuver = step == null ? null : step.getManeuver();
                                    if (maneuver != null) {
                                        type = maneuver.getType();
                                        roundaboutExitAngle = maneuver.getRoundaboutExitAngle();
                                        int roundaboutExitNumber = maneuver.getRoundaboutExitNumber();
                                        CarIcon icon = maneuver.getIcon();
                                        if (!aczc.w() || icon == null) {
                                            i5 = 6;
                                        } else {
                                            int dimensionPixelSize = geuVar2.getResources().getDimensionPixelSize(R.dimen.navigation_step_routing_turn_icon_size);
                                            i5 = 6;
                                            Bitmap bitmapE = hbz.e(geuVar2, icon, dimensionPixelSize, dimensionPixelSize, hmb.a, 0);
                                            if (bitmapE != null) {
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                bitmapE.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                                unVar2.p(byteArrayOutputStream.toByteArray());
                                            }
                                        }
                                        i6 = roundaboutExitNumber;
                                    } else {
                                        i5 = 6;
                                        i6 = 0;
                                        type = 0;
                                        roundaboutExitAngle = 0;
                                    }
                                    switch (type) {
                                        case 0:
                                            unVar2.f(0);
                                            break;
                                        case 1:
                                            unVar2.f(1);
                                            break;
                                        case 2:
                                            unVar2.f(2);
                                            break;
                                        case 3:
                                            unVar2.f(3);
                                            break;
                                        case 4:
                                            unVar2.f(4);
                                            break;
                                        case 5:
                                            unVar2.f(5);
                                            break;
                                        case 6:
                                            unVar2.f(i5);
                                            break;
                                        case 7:
                                            unVar2.f(7);
                                            break;
                                        case 8:
                                            unVar2.f(8);
                                            break;
                                        case 9:
                                            unVar2.f(9);
                                            break;
                                        case 10:
                                            unVar2.f(10);
                                            break;
                                        case 11:
                                            unVar2.f(11);
                                            break;
                                        case 12:
                                            unVar2.f(12);
                                            break;
                                        case 13:
                                            unVar2.f(13);
                                            break;
                                        case 14:
                                            unVar2.f(14);
                                            break;
                                        case 15:
                                            unVar2.f(15);
                                            break;
                                        case 16:
                                            unVar2.f(16);
                                            break;
                                        case 17:
                                            unVar2.f(17);
                                            break;
                                        case 18:
                                            unVar2.f(18);
                                            break;
                                        case 19:
                                            unVar2.f(19);
                                            break;
                                        case 20:
                                            unVar2.f(20);
                                            break;
                                        case 21:
                                            unVar2.f(21);
                                            break;
                                        case 22:
                                            unVar2.f(22);
                                            break;
                                        case 23:
                                            unVar2.f(23);
                                            break;
                                        case 24:
                                            unVar2.f(24);
                                            break;
                                        case 25:
                                            unVar2.f(25);
                                            break;
                                        case 26:
                                            unVar2.f(26);
                                            break;
                                        case 27:
                                            unVar2.f(27);
                                            break;
                                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                            unVar2.f(28);
                                            break;
                                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                            unVar2.f(29);
                                            break;
                                        case 30:
                                        case 31:
                                        default:
                                            throw new IllegalStateException("Unexpected value: " + type);
                                        case 32:
                                            unVar2.f(32);
                                            unVar2.h(i6);
                                            break;
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                            unVar2.f(33);
                                            unVar2.g(roundaboutExitAngle);
                                            if (i6 > 0) {
                                                unVar2.h(i6);
                                                break;
                                            }
                                            break;
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                            unVar2.f(34);
                                            unVar2.h(i6);
                                            break;
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                            unVar2.f(35);
                                            unVar2.g(roundaboutExitAngle);
                                            if (i6 > 0) {
                                                unVar2.h(i6);
                                                break;
                                            }
                                            break;
                                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                                            unVar2.f(36);
                                            break;
                                        case 37:
                                            unVar2.f(37);
                                            break;
                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                            unVar2.f(38);
                                            break;
                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                            unVar2.f(39);
                                            break;
                                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                            unVar2.f(40);
                                            break;
                                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                            unVar2.f(41);
                                            break;
                                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                            unVar2.f(42);
                                            break;
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                            unVar2.f(43);
                                            break;
                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                            unVar2.f(44);
                                            break;
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                            unVar2.f(45);
                                            break;
                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                            unVar2.f(46);
                                            break;
                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                            unVar2.f(47);
                                            break;
                                        case 48:
                                            unVar2.f(48);
                                            break;
                                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                            unVar2.f(49);
                                            break;
                                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                            unVar2.f(50);
                                            break;
                                    }
                                    maiVar.d((TurnEvent) unVar2.a);
                                }
                            }
                            gts gtsVar = (gts) gsrVar.a.F(gts.class);
                            trip2.getClass();
                            geu geuVar3 = gtsVar.a;
                            List<Destination> destinations = trip2.getDestinations();
                            destinations.getClass();
                            Destination destination = (Destination) woy.bL(destinations);
                            List<TravelEstimate> destinationTravelEstimates2 = trip2.getDestinationTravelEstimates();
                            destinationTravelEstimates2.getClass();
                            TravelEstimate travelEstimate3 = (TravelEstimate) woy.bL(destinationTravelEstimates2);
                            gtf gtfVar = (destination == null || travelEstimate3 == null) ? null : new gtf(new gtg(destination.getName(), destination.getImage(), destination.getAddress()), gmn.b(travelEstimate3, geuVar3));
                            boolean zIsLoading = trip2.isLoading();
                            List<Step> steps3 = trip2.getSteps();
                            steps3.getClass();
                            List<TravelEstimate> stepTravelEstimates3 = trip2.getStepTravelEstimates();
                            stepTravelEstimates3.getClass();
                            int iMin = Math.min(steps3.size(), stepTravelEstimates3.size());
                            if (zIsLoading) {
                                gtlVar = new gtl(new gmq(null), 1);
                            } else if (iMin == 0) {
                                gtlVar = null;
                            } else {
                                aezu aezuVar = new aezu(0, Integer.valueOf(iMin - 1));
                                List listBi = woy.bi(aezuVar.a, aezuVar.b);
                                ArrayList arrayList3 = new ArrayList(woy.bp(listBi, 10));
                                Iterator it6 = listBi.iterator();
                                while (it6.hasNext()) {
                                    int iIntValue = ((Number) it6.next()).intValue();
                                    Step step2 = steps3.get(iIntValue);
                                    TravelEstimate travelEstimate4 = stepTravelEstimates3.get(iIntValue);
                                    step2.getClass();
                                    travelEstimate4.getClass();
                                    gtk gtkVar = new gtk(gmn.b(travelEstimate4, geuVar3), step2.getManeuver(), step2.getLanes(), step2.getLanesImage(), null, step2.getCue(), step2.getRoad(), travelEstimate4.getRemainingDistance());
                                    gka.b(gtkVar, step2);
                                    arrayList3.add(gtkVar);
                                }
                                gtlVar = new gtl(new gmq(new gtj(woy.cf(arrayList3))), 1);
                            }
                            gta gtaVar = new gta(gtfVar, gtlVar, null);
                            gka.b(gtaVar, trip2);
                            gtsVar.c = gtaVar;
                            gtsVar.b();
                        }
                    });
                    return;
                } catch (xr e2) {
                    geb gebVarF = ((gsp) obj13).a.a.f();
                    gdp gdpVar4 = new gdp();
                    gdpVar4.a = e2;
                    gebVarF.a(new gdq(gdpVar4));
                    return;
                }
            case 18:
                try {
                    if (((NavigationVoiceAssistantCapabilities) ((Bundleable) this.b).a()) != null) {
                        gev.c(new ily(i));
                        return;
                    }
                    return;
                } catch (xr e3) {
                    geb gebVarF2 = ((gsp) this.a).a.a.f();
                    gdp gdpVar5 = new gdp();
                    gdpVar5.a = e3;
                    gebVarF2.a(new gdq(gdpVar5));
                    return;
                }
            case 19:
                hfe hfeVar = ((hfd) this.b).a;
                ComponentName componentName = ((gmh) hfeVar.a.d()).a;
                ?? r102 = this.a;
                ((mod) hfeVar.e.a).b(r102, componentName);
                hfeVar.d = r102;
                return;
            default:
                Object obj14 = this.b;
                Object obj15 = this.a;
                try {
                    if (((Bundleable) obj14).a() instanceof List) {
                        gev.c(new esx(obj15, ((Bundleable) obj14).a(), 19, (byte[]) (objArr == true ? 1 : 0)));
                        return;
                    }
                    return;
                } catch (xr e4) {
                    ((ynz) ((ynz) ((ynz) hfe.c.f().o(ypi.a, "CarApp.H.Sug")).p(e4)).ai('e')).u("Could not extract suggestions. ");
                    geb gebVarF3 = ((hfd) obj15).a.a.f();
                    gdp gdpVar6 = new gdp();
                    gdpVar6.a = e4;
                    gebVarF3.a(new gdq(gdpVar6));
                    return;
                }
        }
    }

    public esx(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ esx(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ esx(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
