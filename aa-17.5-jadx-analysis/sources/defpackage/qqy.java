package defpackage;

import android.content.Intent;
import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.car.ActivityLaunchInfo;
import com.google.android.gms.car.CarSensorEvent;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarDisplayUiFeatures;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class qqy implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qqy(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, qzv] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, rfy] */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.lang.Object, rad] */
    /* JADX WARN: Type inference failed for: r14v47, types: [java.lang.Object, rcg] */
    /* JADX WARN: Type inference failed for: r14v48, types: [java.lang.Object, rck] */
    /* JADX WARN: Type inference failed for: r14v55, types: [java.lang.Object, qqq] */
    /* JADX WARN: Type inference failed for: r14v56, types: [java.lang.Object, qqq] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 20;
        int i2 = 3;
        long j = 0;
        char[] cArr = null;
        boolean z = true;
        switch (this.c) {
            case 0:
                rhg rhgVar = ((qrg) this.a).d;
                ypf ypfVar = rhg.a;
                yop yopVarAi = ypfVar.l().ai(8164);
                Object obj = this.b;
                yopVarAi.y("setAuthenticationData: auth data=%s", obj);
                if (rhgVar.n != 0) {
                    ypfVar.l().ai(8165).u("setAuthenticationData: This object wasn't initialized successfully");
                    return;
                } else {
                    rhgVar.r = (String) obj;
                    rbe.h(new ral(rhgVar, 13));
                    return;
                }
            case 1:
                ((qpl) this.a).a(this.b);
                return;
            case 2:
                ypf ypfVar2 = qrg.a;
                yop yopVarAi2 = ypfVar2.l().ai(7671);
                ?? r3 = this.b;
                yopVarAi2.y("handleIncomingMessage on main thread. handler=%s", r3);
                qrg qrgVar = (qrg) this.a;
                if (qrgVar.i) {
                    return;
                }
                if (qrgVar.g == null) {
                    ypfVar2.g().ai(7673).u("handleIncomingMessage: Channel not established yet");
                    return;
                } else if (qrgVar.b != 0) {
                    ypfVar2.g().ai(7672).u("handleIncomingMessage: Service not initialized");
                    return;
                } else {
                    r3.run();
                    return;
                }
            case 3:
                CountDownLatch countDownLatch = (CountDownLatch) this.b;
                if (countDownLatch.getCount() != 0) {
                    ((qso) this.a).o();
                    countDownLatch.countDown();
                    return;
                }
                return;
            case 4:
                qtf qtfVar = (qtf) this.b;
                ((CarSensorEvent) this.a).b(qtfVar.j);
                Location location = qtfVar.j;
                if (location.hasBearing() && (!location.hasSpeed() || location.getSpeed() <= 1.0f)) {
                    location.removeBearing();
                }
                if (location.hasSpeed()) {
                    if (qtfVar.d) {
                        location.removeSpeed();
                    } else if (location.getSpeed() >= 70.0f || location.getSpeed() < BitmapDescriptorFactory.HUE_RED) {
                        qtf.a.l().ai(7908).u("Integration error: GPS speed seems invalid. Disabling.");
                        location.removeSpeed();
                        qtfVar.d = true;
                    }
                }
                if (location.hasAccuracy()) {
                    if (qtfVar.e) {
                        location.removeAccuracy();
                    } else if (location.getAccuracy() <= 1.0f || location.getAccuracy() >= 500.0f) {
                        qtf.a.l().ai(7906).u("Integration error: GPS accuracy is suspicious. Disabling.");
                        qtfVar.e = true;
                        location.removeAccuracy();
                    }
                }
                if (!location.hasAccuracy()) {
                    location.setAccuracy(5.67f);
                }
                Object[] objArr = qtfVar.f != null;
                if (objArr != false) {
                    long time = location.getTime() - qtfVar.f.getTime();
                    objArr = time >= 500 && time < 2000;
                    j = time;
                }
                if (objArr != false) {
                    float fDistanceTo = qtfVar.f.distanceTo(location);
                    float fBearingTo = qtfVar.f.bearingTo(location);
                    Object[] objArr2 = fDistanceTo > 2.0f;
                    i = (!location.hasSpeed() || location.getSpeed() >= 1.0f) ? 0 : 1;
                    if (!location.hasBearing()) {
                        if (i == 0 && objArr2 == true) {
                            location.setBearing(fBearingTo);
                        } else if (qtfVar.f.hasBearing()) {
                            location.setBearing(qtfVar.f.getBearing());
                        }
                    }
                    if (!location.hasSpeed() && objArr2 != false) {
                        location.setSpeed((fDistanceTo / j) * 1000.0f);
                    }
                }
                Location location2 = qtfVar.f;
                qtfVar.f = location;
                qtfVar.j = (Location) new ntn(location2).h(new joa(i));
                qtfVar.a(qtfVar.f);
                if (qtfVar.f.hasSpeed() && qtfVar.f.getSpeed() > 0.5f) {
                    qtfVar.g.set(false);
                }
                qtfVar.h = SystemClock.elapsedRealtime();
                qtfVar.d();
                qtfVar.c(qtfVar.k, qtfVar.i.nextInt(400) + 1800);
                return;
            case 5:
                AtomicReference atomicReference = (AtomicReference) this.b;
                if (atomicReference.get() != null) {
                    throw new RuntimeException((Throwable) atomicReference.get());
                }
                this.a.a();
                return;
            case 6:
                rrd.d(5, "CAR.CLIENT.PLS", null, "Calling doProjectionTearDown from death recipient", new Object[0]);
                ?? r0 = this.a;
                rbb rbbVar = (rbb) this.b;
                rbbVar.b(r0);
                rrd.d(5, "CAR.CLIENT.PLS", null, "Calling doProjectionEnd from death recipient", new Object[0]);
                rbbVar.a();
                rrd.d(5, "CAR.CLIENT.PLS", null, "Calling doProjectionLost from death recipient", new Object[0]);
                if (omc.c("CAR.CLIENT.PLS", 3)) {
                    rrd.a("CAR.CLIENT.PLS", null, "Projection attempt recovery");
                }
                rbbVar.e();
                rbbVar.e = false;
                return;
            case 7:
                Object obj2 = this.a;
                rrd.d(5, "CAR.TOKEN", (Throwable) obj2, "CarClient failed.", new Object[0]);
                Object obj3 = ((rdr) ((rdq) this.b).d).a;
                synchronized (((qsz) obj3).f) {
                    if (!(obj2 instanceof rch)) {
                        i2 = obj2 instanceof rcj ? 6 : 5;
                    }
                    rbv rbvVar = ((qsz) obj3).c;
                    rbu rbuVar = new rbu(i2);
                    if (rbuVar.a == 2) {
                        z = false;
                    }
                    woy.aa(z, "legacyConnectionResult must be set iff failureReason is LEGACY_GMSCORE_FAILURE");
                    rbvVar.a(rbuVar);
                }
                return;
            case 8:
                ((sgk) this.a).c((CarDisplay) this.b);
                return;
            case 9:
                ?? r02 = this.b;
                ((wyd) this.a).m((UUID) r02.getValue(), (CarDisplayId) r02.getKey());
                return;
            case 10:
                this.a.a((CarDisplayUiFeatures) this.b);
                return;
            case 11:
                this.b.a((CarUiInfo) this.a);
                return;
            case 12:
                yph yphVar = mpd.a;
                Iterator it = ((mpd) ((wyd) this.b).a).d.iterator();
                while (it.hasNext()) {
                    ActivityLaunchInfo activityLaunchInfo = (ActivityLaunchInfo) this.a;
                    ((mpb) it.next()).b(activityLaunchInfo.a, activityLaunchInfo.b);
                }
                return;
            case 13:
                yph yphVar2 = mpd.a;
                Iterator it2 = ((mpd) ((wyd) this.b).a).d.iterator();
                while (it2.hasNext()) {
                    ActivityLaunchInfo activityLaunchInfo2 = (ActivityLaunchInfo) this.a;
                    ((mpb) it2.next()).a(activityLaunchInfo2.a, activityLaunchInfo2.b);
                }
                return;
            case 14:
                yph yphVar3 = mpd.a;
                mpd mpdVar = (mpd) ((wyd) this.b).a;
                Iterator it3 = mpdVar.d.iterator();
                while (true) {
                    Object obj4 = this.a;
                    if (!it3.hasNext()) {
                        if (mpdVar.m()) {
                            ((ype) mpd.a.l().ai((char) 5147)).y("Activity %s stopped when inactive, ignoring", obj4);
                            return;
                        }
                        ActivityLaunchInfo activityLaunchInfo3 = (ActivityLaunchInfo) obj4;
                        Intent intent = activityLaunchInfo3.a;
                        if ((intent.getFlags() & 4) != 0 && !mkn.e.equals(intent.getComponent())) {
                            ((ype) mpd.a.l().ai((char) 5146)).y("Ignoring stop of %s since it was due to non user action (video focus loss)", obj4);
                            return;
                        }
                        mqb mqbVarB = mpe.a().b(intent);
                        mqbVarB.getClass();
                        yph yphVar4 = mpd.a;
                        ((ype) yphVar4.l().ai(5144)).M("Projected activity stopped: %s, appKey: %s", obj4, mqbVarB);
                        CarRegionId carRegionId = activityLaunchInfo3.b;
                        mpa mpaVarA = mpdVar.a(carRegionId);
                        mqc mqcVar = mpaVarA.c;
                        if (mqcVar == null) {
                            return;
                        }
                        if (Objects.equals(mqcVar.a(), mqbVarB.a)) {
                            ((ype) yphVar4.l().ai((char) 5145)).y("Active activity %s stopped, removing active app for the region", obj4);
                            mpdVar.i(null, carRegionId);
                            mpaVarA.c = null;
                            mpaVarA.b = null;
                            mpdVar.k(carRegionId, null, mpdVar.a(carRegionId).d);
                            mpd.l(null, carRegionId, mpdVar.h);
                            return;
                        }
                        return;
                    }
                    ActivityLaunchInfo activityLaunchInfo4 = (ActivityLaunchInfo) obj4;
                    ((mpb) it3.next()).f(activityLaunchInfo4.a, activityLaunchInfo4.b);
                }
                break;
            case 15:
                Iterator it4 = ((mpd) this.b).d.iterator();
                while (it4.hasNext()) {
                    ((mpb) it4.next()).b((Intent) this.a, CarRegionId.a);
                }
                return;
            case 16:
                this.b.e((Intent) this.a);
                return;
            case 17:
                this.b.e((Intent) this.a);
                return;
            case 18:
                if (((rec) this.b).e(true)) {
                    rbb rbbVar2 = (rbb) ((rdr) this.a).a;
                    if (rbbVar2.i()) {
                        rbbVar2.a.sendEmptyMessage(1);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                Object obj5 = this.a;
                ots otsVar = (ots) obj5;
                otw otwVar = otsVar.c;
                if (otwVar == null) {
                    otwVar = otw.a;
                }
                ott ottVar = otsVar.f;
                if (ottVar == null) {
                    ottVar = ott.a;
                }
                abpt abptVar = ottVar.c;
                if (abptVar == null) {
                    abptVar = abpt.a;
                }
                Object obj6 = this.b;
                rzj rzjVar = (rzj) obj6;
                rzjVar.l();
                StringBuilder sb = new StringBuilder();
                sb.append('{');
                uqw.V("session_id", otwVar.c, sb);
                otv otvVarB = otv.b(otwVar.d);
                if (otvVarB == null) {
                    otvVarB = otv.AUDIO_CODEC_TYPE_UNSPECIFIED;
                }
                uqw.W("codec_type", uqw.Q(otvVarB), sb);
                ouh ouhVarB = ouh.b(otwVar.e);
                if (ouhVarB == null) {
                    ouhVarB = ouh.AUDIO_STREAM_TYPE_UNSPECIFIED;
                }
                uqw.W("stream_type", uqw.Q(ouhVarB), sb);
                rzj rzjVarA = rzjVar.a("unique_id", uqw.T(sb)).a("previous_diagnostics_message_count", Integer.valueOf(otsVar.d));
                otr otrVarB = otr.b(otsVar.e);
                if (otrVarB == null) {
                    otrVarB = otr.AUDIO_STREAMING_STATUS_UNSPECIFIED;
                }
                rzjVarA.a("current_status", uqw.Q(otrVarB)).b("stats", new qqy(obj6, obj5, i, cArr)).a("events count", Integer.valueOf(otsVar.g.size())).a("events dropped", Integer.valueOf(otsVar.h)).d("events", otsVar.g, new rey(rzjVar, abptVar, i));
                return;
            default:
                Object obj7 = this.a;
                Object obj8 = this.b;
                ((rzj) obj8).f("AudioStreamStats", new rfc(obj8, obj7, i));
                return;
        }
    }

    public qqy(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ qqy(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public qqy(AtomicReference atomicReference, rad radVar, int i) {
        this.c = i;
        this.b = atomicReference;
        this.a = radVar;
    }

    public qqy(qtf qtfVar, CarSensorEvent carSensorEvent, int i) {
        this.c = i;
        this.a = carSensorEvent;
        this.b = qtfVar;
    }
}
