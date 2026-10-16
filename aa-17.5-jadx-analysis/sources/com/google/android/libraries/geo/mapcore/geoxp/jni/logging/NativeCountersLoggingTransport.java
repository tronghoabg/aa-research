package com.google.android.libraries.geo.mapcore.geoxp.jni.logging;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.libraries.geo.mapcore.geoxp.jni.logging.NativeCountersLoggingTransport;
import defpackage.shd;
import defpackage.urj;
import defpackage.yob;
import defpackage.zgl;
import defpackage.zgp;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class NativeCountersLoggingTransport {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/geoxp/jni/logging/NativeCountersLoggingTransport");
    public final urj b;
    private final Executor c;

    static {
        zgp zgpVar = zgl.a;
    }

    public NativeCountersLoggingTransport(urj urjVar, Executor executor) {
        this.b = urjVar;
        this.c = executor;
    }

    private static native boolean nativeInitClass();

    public void onCounterEvent(final byte[] bArr) {
        this.c.execute(new Runnable() { // from class: tsg
            @Override // java.lang.Runnable
            public final void run() {
                NativeCountersLoggingTransport nativeCountersLoggingTransport = this.a;
                byte[] bArr2 = bArr;
                try {
                    urj urjVar = nativeCountersLoggingTransport.b;
                    zqm zqmVar = (zqm) abnv.B(zqm.a, bArr2, abnj.a());
                    zqo zqoVarB = zqo.b(zqmVar.d);
                    if (zqoVarB == null) {
                        zqoVarB = zqo.COUNTERS_METRIC_NONE;
                    }
                    switch (zqoVarB.ordinal()) {
                        case 2:
                            urjVar.d(zqmVar, uik.L);
                            break;
                        case 3:
                        case 4:
                        case 16:
                        case 17:
                        case 24:
                        case 63:
                        case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                        case 65:
                        default:
                            ynz ynzVar = (ynz) urj.a.h();
                            zqo zqoVarB2 = zqo.b(zqmVar.d);
                            if (zqoVarB2 == null) {
                                zqoVarB2 = zqo.COUNTERS_METRIC_NONE;
                            }
                            ynz ynzVar2 = (ynz) ((ynz) ((ynz) ynzVar.m(zqoVarB2)).l(60, TimeUnit.MINUTES)).ai(9622);
                            zqo zqoVarB3 = zqo.b(zqmVar.d);
                            if (zqoVarB3 == null) {
                                zqoVarB3 = zqo.COUNTERS_METRIC_NONE;
                            }
                            ynzVar2.y("Unsupported metric type: %s", zqoVarB3.name());
                            break;
                        case 5:
                            urjVar.c(zqmVar, qbl.g);
                            break;
                        case 6:
                            urjVar.c(zqmVar, qbl.h);
                            break;
                        case 7:
                            urjVar.c(zqmVar, qbl.i);
                            break;
                        case 8:
                            urjVar.b(zqmVar, qbl.v);
                            break;
                        case 9:
                            urjVar.b(zqmVar, qbl.w);
                            break;
                        case 10:
                            urjVar.b(zqmVar, qbl.x);
                            break;
                        case 11:
                            urjVar.a(zqmVar, qbl.d);
                            break;
                        case 12:
                            urjVar.a(zqmVar, qbl.e);
                            break;
                        case 13:
                            urjVar.a(zqmVar, qbl.a);
                            break;
                        case 14:
                            urjVar.a(zqmVar, qbl.c);
                            break;
                        case 15:
                            urjVar.b(zqmVar, uil.a);
                            break;
                        case 18:
                            urjVar.b(zqmVar, qbl.r);
                            break;
                        case 19:
                            urjVar.b(zqmVar, qbl.z);
                            break;
                        case 20:
                            urjVar.b(zqmVar, qbl.s);
                            break;
                        case 21:
                            urjVar.a(zqmVar, qbl.C);
                            break;
                        case 22:
                            urjVar.a(zqmVar, qbl.D);
                            break;
                        case 23:
                            urjVar.d(zqmVar, qbl.A);
                            break;
                        case 25:
                            urjVar.d(zqmVar, uik.d);
                            break;
                        case 26:
                            urjVar.d(zqmVar, uik.g);
                            break;
                        case 27:
                            urjVar.d(zqmVar, uik.h);
                            break;
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                            urjVar.d(zqmVar, uik.f);
                            break;
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                            urjVar.c(zqmVar, uik.p);
                            break;
                        case 30:
                            urjVar.c(zqmVar, uik.q);
                            break;
                        case 31:
                            urjVar.c(zqmVar, uik.r);
                            break;
                        case 32:
                            urjVar.c(zqmVar, uik.s);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                            urjVar.c(zqmVar, uik.t);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            urjVar.c(zqmVar, uik.u);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                            urjVar.c(zqmVar, uik.v);
                            break;
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                            urjVar.c(zqmVar, uik.w);
                            break;
                        case 37:
                            urjVar.c(zqmVar, uik.x);
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                            urjVar.c(zqmVar, uik.y);
                            break;
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                            urjVar.c(zqmVar, uik.z);
                            break;
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                            urjVar.c(zqmVar, uik.A);
                            break;
                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                            urjVar.c(zqmVar, uik.B);
                            break;
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                            urjVar.c(zqmVar, uik.C);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                            urjVar.d(zqmVar, qbl.u);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                            urjVar.d(zqmVar, uik.K);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                            urjVar.c(zqmVar, uik.j);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                            urjVar.b(zqmVar, uik.l);
                            break;
                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                            urjVar.c(zqmVar, uik.m);
                            break;
                        case 48:
                            urjVar.b(zqmVar, uik.o);
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                            urjVar.b(zqmVar, uik.k);
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            urjVar.b(zqmVar, uik.D);
                            break;
                        case 51:
                            urjVar.c(zqmVar, uik.E);
                            break;
                        case 52:
                            urjVar.c(zqmVar, uik.H);
                            break;
                        case 53:
                            urjVar.c(zqmVar, uik.i);
                            break;
                        case 54:
                            urjVar.a(zqmVar, qbo.ah);
                            break;
                        case 55:
                            urjVar.c(zqmVar, uik.G);
                            break;
                        case 56:
                            urjVar.c(zqmVar, uik.F);
                            break;
                        case 57:
                            urjVar.d(zqmVar, uik.e);
                            break;
                        case 58:
                            urjVar.c(zqmVar, uik.I);
                            break;
                        case 59:
                            urjVar.d(zqmVar, uik.J);
                            break;
                        case 60:
                            urjVar.b(zqmVar, qbo.ak);
                            break;
                        case 61:
                            urjVar.b(zqmVar, qbo.al);
                            break;
                        case 62:
                            urjVar.c(zqmVar, uik.n);
                            break;
                        case 66:
                            urjVar.b(zqmVar, uik.Q);
                            break;
                        case 67:
                            urjVar.b(zqmVar, uik.M);
                            break;
                        case 68:
                            urjVar.c(zqmVar, uik.N);
                            break;
                        case 69:
                            urjVar.c(zqmVar, uik.O);
                            break;
                        case 70:
                            urjVar.c(zqmVar, uik.P);
                            break;
                    }
                } catch (abon e) {
                    ((ynz) ((ynz) ((ynz) NativeCountersLoggingTransport.a.h()).p(e)).ai((char) 9111)).u("Failed to parse counter event");
                }
            }
        });
    }

    public void onCounterfactualEvent(byte[] bArr) {
        this.c.execute(new shd(bArr, 11));
    }
}
