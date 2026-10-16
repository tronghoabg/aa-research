package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarInstrumentClusterInfo;
import com.google.android.gms.car.navigation.AdasRouteInfo;
import com.google.android.gms.car.navigation.ChargingStationDetails;
import com.google.android.gms.car.navigation.DestinationDetails;
import com.google.android.gms.car.navigation.DestinationDistance;
import com.google.android.gms.car.navigation.Distance;
import com.google.android.gms.car.navigation.Lane;
import com.google.android.gms.car.navigation.LaneDirection;
import com.google.android.gms.car.navigation.Maneuver;
import com.google.android.gms.car.navigation.NavigationCurrentPosition;
import com.google.android.gms.car.navigation.NavigationState;
import com.google.android.gms.car.navigation.NavigationStep;
import com.google.android.gms.car.navigation.StepDistance;
import com.google.android.gms.car.navigation.VehicleEnergyForecast;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ikg extends qxi implements jba, jbo {
    public static final yph a = yph.c("CAR.INST");
    public final List b = new ArrayList();
    public CarInstrumentClusterInfo c = null;
    volatile boolean d;
    private final jev e;
    private final jew f;
    private final jer g;
    private final jes h;
    private final Context i;
    private jbb j;
    private ixf k;

    public ikg(jev jevVar, jew jewVar, jer jerVar, jes jesVar, Context context) {
        this.e = jevVar;
        this.f = jewVar;
        this.g = jerVar;
        this.h = jesVar;
        this.i = context;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qxm] */
    private final ikf w(qxm qxmVar) {
        for (ikf ikfVar : this.b) {
            if (ikfVar.a.asBinder() == qxmVar.asBinder()) {
                return ikfVar;
            }
        }
        return null;
    }

    private final void x() throws IllegalStateException {
        this.g.b();
        if (!this.d) {
            throw new IllegalStateException("CarNotConnected");
        }
        if (this.j == null) {
            throw new RuntimeException("InstrumentClusterEndpoint not set.");
        }
    }

    private static boolean y(CarInfo carInfo) {
        int i = carInfo.e;
        if (i <= 1) {
            return i == 1 && carInfo.f >= 6;
        }
        return true;
    }

    private static boolean z(CarInfo carInfo) {
        return !y(carInfo);
    }

    @Override // defpackage.jbo
    @ResultIgnorabilityUnspecified
    public final iyw a(xnz xnzVar) {
        xlo xloVar;
        int i;
        int i2;
        int i3;
        if ((xnzVar.b & 128) == 0) {
            return null;
        }
        CarInstrumentClusterInfo carInstrumentClusterInfo = new CarInstrumentClusterInfo();
        this.c = carInstrumentClusterInfo;
        xlo xloVar2 = xnzVar.j;
        if (xloVar2 == null) {
            xloVar2 = xlo.a;
        }
        carInstrumentClusterInfo.a = xloVar2.c;
        CarInstrumentClusterInfo carInstrumentClusterInfo2 = this.c;
        xlo xloVar3 = xnzVar.j;
        int iZ = wpq.z((xloVar3 == null ? xlo.a : xloVar3).d);
        if (iZ == 0) {
            iZ = 1;
        }
        carInstrumentClusterInfo2.b = iZ;
        if (iZ == 1) {
            if (xloVar3 == null) {
                xloVar3 = xlo.a;
                xloVar = null;
            } else {
                xloVar = xloVar3;
            }
            if ((xloVar3.b & 4) == 0) {
                this.e.ax(yze.PROTOCOL_WRONG_CONFIGURATION, yzf.NAV_NO_IMAGE_OPTIONS, "No image options set for image capable instrument cluster.");
                return null;
            }
            if (xloVar == null) {
                xloVar = xlo.a;
            }
            xlm xlmVar = xloVar.e;
            if (xlmVar == null) {
                xlmVar = xlm.a;
            }
            int i4 = xlmVar.b;
            if ((i4 & 1) == 0 || (i4 & 2) == 0 || (i = xlmVar.c) <= 0 || (i2 = xlmVar.d) <= 0) {
                this.e.ax(yze.PROTOCOL_WRONG_CONFIGURATION, yzf.NAV_BAD_SIZE, "width and height must both be positive values:  Width = " + xlmVar.c + "Height = " + xlmVar.d);
                return null;
            }
            if ((i4 & 4) == 0 || !((i3 = xlmVar.e) == 8 || i3 == 16 || i3 == 32)) {
                this.e.ax(yze.PROTOCOL_WRONG_CONFIGURATION, yzf.NAV_BAD_COLOR, "ColorDepthBits must be 8, 16, or 32.  However the value was = " + xlmVar.e);
                return null;
            }
            if (i != i2) {
                ((ype) ((ype) a.f()).ai(160)).B("CarNavigationStatusService onServiceDiscover called with non-square screen dimensions.  Height and width should be the same but got h=%d and w=%d", xlmVar.c, xlmVar.d);
            }
            CarInstrumentClusterInfo carInstrumentClusterInfo3 = this.c;
            int i5 = xlmVar.c;
            carInstrumentClusterInfo3.d = i5;
            int i6 = xlmVar.d;
            carInstrumentClusterInfo3.c = i6;
            int i7 = xlmVar.e;
            carInstrumentClusterInfo3.e = i7;
            if (this.k == null) {
                this.k = new ixf(this.i, i5, i6, i7);
            }
        }
        this.d = true;
        return this;
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        return new jbb(this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    @Override // defpackage.qxj
    public final CarInstrumentClusterInfo f() throws RemoteException {
        return this.c;
    }

    @Override // defpackage.qxj
    public final void g(AdasRouteInfo adasRouteInfo) {
        abnp abnpVarN = xhd.a.n();
        AdasRouteInfo.Path path = adasRouteInfo.a;
        if (path != null) {
            xma xmaVarB = ixi.b(path);
            abnpVarN.t();
            xhd xhdVar = (xhd) abnpVarN.b;
            xmaVarB.getClass();
            xhdVar.c = xmaVarB;
            xhdVar.b |= 1;
        }
        AdasRouteInfo.Trip trip = adasRouteInfo.b;
        if (trip != null) {
            abnp abnpVarN2 = xoo.a.n();
            String str = trip.a;
            if (str != null) {
                abnpVarN2.t();
                xoo xooVar = (xoo) abnpVarN2.b;
                xooVar.b |= 1;
                xooVar.c = str;
            }
            int i = trip.b;
            abnpVarN2.t();
            xoo xooVar2 = (xoo) abnpVarN2.b;
            xooVar2.b |= 2;
            xooVar2.d = i;
            AdasRouteInfo.Path path2 = trip.c;
            if (path2 != null) {
                xma xmaVarB2 = ixi.b(path2);
                abnpVarN2.t();
                xoo xooVar3 = (xoo) abnpVarN2.b;
                xmaVarB2.getClass();
                xooVar3.e = xmaVarB2;
                xooVar3.b |= 4;
            }
            xoo xooVar4 = (xoo) abnpVarN2.q();
            abnpVarN.t();
            xhd xhdVar2 = (xhd) abnpVarN.b;
            xooVar4.getClass();
            xhdVar2.d = xooVar4;
            xhdVar2.b |= 2;
        }
        abnp abnpVarN3 = xnh.a.n();
        abms abmsVarF = ((xhd) abnpVarN.q()).f();
        abnpVarN3.t();
        xnh xnhVar = (xnh) abnpVarN3.b;
        xnhVar.b |= 1;
        xnhVar.c = abmsVarF;
        this.j.k(32777, (xnh) abnpVarN3.q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qxj
    public final void h(NavigationCurrentPosition navigationCurrentPosition) throws IllegalStateException {
        int i;
        int i2;
        CarInfo carInfoT = this.h.t();
        int i3 = 0;
        if (y(carInfoT)) {
            abnp abnpVarN = xla.a.n();
            StepDistance stepDistance = navigationCurrentPosition.a;
            if (stepDistance != null) {
                abnp abnpVarN2 = xls.a.n();
                Distance distance = stepDistance.a;
                if (distance != null) {
                    xld xldVarA = ixi.a(distance);
                    abnpVarN2.t();
                    xls xlsVar = (xls) abnpVarN2.b;
                    xldVarA.getClass();
                    xlsVar.c = xldVarA;
                    xlsVar.b |= 1;
                }
                long j = stepDistance.b;
                if (j > 0) {
                    abnpVarN2.t();
                    xls xlsVar2 = (xls) abnpVarN2.b;
                    xlsVar2.b |= 2;
                    xlsVar2.d = j;
                }
                xls xlsVar3 = (xls) abnpVarN2.q();
                abnpVarN.t();
                xla xlaVar = (xla) abnpVarN.b;
                xlsVar3.getClass();
                xlaVar.c = xlsVar3;
                xlaVar.b |= 1;
            }
            if (!navigationCurrentPosition.a().isEmpty()) {
                int i4 = 0;
                while (true) {
                    yfq yfqVarA = navigationCurrentPosition.a();
                    yfqVarA.getClass();
                    if (i4 >= yfqVarA.size()) {
                        break;
                    }
                    yfq yfqVarA2 = navigationCurrentPosition.a();
                    yfqVarA2.getClass();
                    DestinationDistance destinationDistance = (DestinationDistance) yfqVarA2.get(i4);
                    abnp abnpVarN3 = xlc.a.n();
                    Distance distance2 = destinationDistance.a;
                    if (distance2 != null) {
                        xld xldVarA2 = ixi.a(distance2);
                        abnpVarN3.t();
                        xlc xlcVar = (xlc) abnpVarN3.b;
                        xldVarA2.getClass();
                        xlcVar.c = xldVarA2;
                        xlcVar.b |= 1;
                    }
                    long j2 = destinationDistance.c;
                    if (j2 > 0) {
                        abnpVarN3.t();
                        xlc xlcVar2 = (xlc) abnpVarN3.b;
                        xlcVar2.b |= 4;
                        xlcVar2.e = j2;
                    }
                    String str = destinationDistance.b;
                    if (str != null) {
                        abnpVarN3.t();
                        xlc xlcVar3 = (xlc) abnpVarN3.b;
                        xlcVar3.b |= 2;
                        xlcVar3.d = str;
                    }
                    xlc xlcVar4 = (xlc) abnpVarN3.q();
                    abnpVarN.t();
                    xla xlaVar2 = (xla) abnpVarN.b;
                    xlcVar4.getClass();
                    aboh abohVar = xlaVar2.d;
                    if (!abohVar.c()) {
                        xlaVar2.d = abnv.I(abohVar);
                    }
                    xlaVar2.d.add(xlcVar4);
                    i4++;
                }
            }
            String str2 = navigationCurrentPosition.b;
            if (str2 != null) {
                abnp abnpVarN4 = xlj.a.n();
                abnpVarN4.t();
                xlj xljVar = (xlj) abnpVarN4.b;
                xljVar.b |= 1;
                xljVar.c = str2;
                abnpVarN.t();
                xla xlaVar3 = (xla) abnpVarN.b;
                xlj xljVar2 = (xlj) abnpVarN4.q();
                xljVar2.getClass();
                xlaVar3.e = xljVar2;
                xlaVar3.b |= 2;
            }
            this.j.k(32775, (xla) abnpVarN.q());
        }
        if (z(carInfoT)) {
            StepDistance stepDistance2 = navigationCurrentPosition.a;
            if (stepDistance2 == null) {
                ((ype) a.l().ai((char) 165)).u("NavigationCurrentPosition provided with empty step distances. Ignoring.");
                return;
            }
            Distance distance3 = stepDistance2.a;
            if (distance3 != null) {
                i3 = distance3.c;
                long j3 = distance3.d;
                i = distance3.a;
                i2 = (int) j3;
            } else {
                i = -1;
                i2 = -1;
            }
            k(i, (int) stepDistance2.b, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qxj
    public final void i(NavigationState navigationState) throws Throwable {
        CarInfo carInfo;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Throwable th;
        x();
        CarInfo carInfoT = this.h.t();
        int i8 = 2;
        int i9 = 1;
        if (y(carInfoT)) {
            navigationState.c().getClass();
            navigationState.b().getClass();
            navigationState.a().getClass();
            abnp abnpVarN = xlk.a.n();
            yfq yfqVarC = navigationState.c();
            int size = yfqVarC.size();
            int i10 = 0;
            while (i10 < size) {
                NavigationStep navigationStep = (NavigationStep) yfqVarC.get(i10);
                abnp abnpVarN2 = xlr.a.n();
                Maneuver maneuver = navigationStep.a;
                if (maneuver != null) {
                    xlg xlgVar = xlg.a;
                    abnp abnpVarN3 = xlgVar.n();
                    th = null;
                    int i11 = maneuver.a;
                    if (wox.C(i11) != 0) {
                        int iC = wox.C(i11);
                        abnpVarN3.t();
                        xlg xlgVar2 = (xlg) abnpVarN3.b;
                        int i12 = iC - 1;
                        if (iC == 0) {
                            throw null;
                        }
                        xlgVar2.c = i12;
                        xlgVar2.b |= i9;
                        int i13 = maneuver.b;
                        if (i13 > 0) {
                            abnpVarN3.t();
                            xlg xlgVar3 = (xlg) abnpVarN3.b;
                            xlgVar3.b |= i8;
                            xlgVar3.d = i13;
                        }
                        int i14 = maneuver.c;
                        if (i14 > 0) {
                            abnpVarN3.t();
                            xlg xlgVar4 = (xlg) abnpVarN3.b;
                            xlgVar4.b |= 4;
                            xlgVar4.e = i14;
                        }
                        xlgVar = (xlg) abnpVarN3.q();
                    }
                    abnpVarN2.t();
                    xlr xlrVar = (xlr) abnpVarN2.b;
                    xlgVar.getClass();
                    xlrVar.c = xlgVar;
                    xlrVar.b |= i9;
                } else {
                    th = null;
                }
                if (!navigationStep.b().isEmpty()) {
                    int i15 = 0;
                    while (true) {
                        yfq yfqVarB = navigationStep.b();
                        yfqVarB.getClass();
                        if (i15 >= yfqVarB.size()) {
                            break;
                        }
                        yfq yfqVarB2 = navigationStep.b();
                        yfqVarB2.getClass();
                        Lane lane = (Lane) yfqVarB2.get(i15);
                        abnp abnpVarN4 = xlf.a.n();
                        if (!lane.a().isEmpty()) {
                            int i16 = 0;
                            while (true) {
                                yfq yfqVarA = lane.a();
                                yfqVarA.getClass();
                                if (i16 >= yfqVarA.size()) {
                                    break;
                                }
                                yfq yfqVarA2 = lane.a();
                                yfqVarA2.getClass();
                                LaneDirection laneDirection = (LaneDirection) yfqVarA2.get(i16);
                                int i17 = i8;
                                abnp abnpVarN5 = xle.a.n();
                                int i18 = i9;
                                int iAE = a.aE(laneDirection.a);
                                abnpVarN5.t();
                                xle xleVar = (xle) abnpVarN5.b;
                                CarInfo carInfo2 = carInfoT;
                                int i19 = iAE - 1;
                                if (iAE == 0) {
                                    throw th;
                                }
                                xleVar.c = i19;
                                xleVar.b |= 1;
                                boolean z = laneDirection.b;
                                abnpVarN5.t();
                                xle xleVar2 = (xle) abnpVarN5.b;
                                xleVar2.b |= 2;
                                xleVar2.d = z;
                                xle xleVar3 = (xle) abnpVarN5.q();
                                abnpVarN4.t();
                                xlf xlfVar = (xlf) abnpVarN4.b;
                                xleVar3.getClass();
                                aboh abohVar = xlfVar.b;
                                if (!abohVar.c()) {
                                    xlfVar.b = abnv.I(abohVar);
                                }
                                xlfVar.b.add(xleVar3);
                                i16++;
                                i9 = i18;
                                i8 = i17;
                                carInfoT = carInfo2;
                            }
                        }
                        CarInfo carInfo3 = carInfoT;
                        int i20 = i8;
                        int i21 = i9;
                        xlf xlfVar2 = (xlf) abnpVarN4.q();
                        abnpVarN2.t();
                        xlr xlrVar2 = (xlr) abnpVarN2.b;
                        xlfVar2.getClass();
                        aboh abohVar2 = xlrVar2.e;
                        if (!abohVar2.c()) {
                            xlrVar2.e = abnv.I(abohVar2);
                        }
                        xlrVar2.e.add(xlfVar2);
                        i15++;
                        i9 = i21;
                        i8 = i20;
                        carInfoT = carInfo3;
                    }
                }
                CarInfo carInfo4 = carInfoT;
                int i22 = i8;
                int i23 = i9;
                String str = navigationStep.b;
                if (str != null) {
                    abnp abnpVarN6 = xlj.a.n();
                    abnpVarN6.t();
                    xlj xljVar = (xlj) abnpVarN6.b;
                    xljVar.b |= 1;
                    xljVar.c = str;
                    abnpVarN2.t();
                    xlr xlrVar3 = (xlr) abnpVarN2.b;
                    xlj xljVar2 = (xlj) abnpVarN6.q();
                    xljVar2.getClass();
                    xlrVar3.d = xljVar2;
                    xlrVar3.b |= 2;
                }
                if (!navigationStep.a().isEmpty()) {
                    abnp abnpVarN7 = xkz.a.n();
                    yfq yfqVarA3 = navigationStep.a();
                    abnpVarN7.t();
                    xkz xkzVar = (xkz) abnpVarN7.b;
                    aboh abohVar3 = xkzVar.b;
                    if (!abohVar3.c()) {
                        xkzVar.b = abnv.I(abohVar3);
                    }
                    abmc.i(yfqVarA3, xkzVar.b);
                    abnpVarN2.t();
                    xlr xlrVar4 = (xlr) abnpVarN2.b;
                    xkz xkzVar2 = (xkz) abnpVarN7.q();
                    xkzVar2.getClass();
                    xlrVar4.f = xkzVar2;
                    xlrVar4.b |= 4;
                }
                xlr xlrVar5 = (xlr) abnpVarN2.q();
                abnpVarN.t();
                xlk xlkVar = (xlk) abnpVarN.b;
                xlrVar5.getClass();
                aboh abohVar4 = xlkVar.b;
                if (!abohVar4.c()) {
                    xlkVar.b = abnv.I(abohVar4);
                }
                xlkVar.b.add(xlrVar5);
                i10++;
                i9 = i23;
                i8 = i22;
                carInfoT = carInfo4;
            }
            carInfo = carInfoT;
            i = i8;
            i2 = i9;
            bArr = null;
            i3 = 4;
            if (!navigationState.a().isEmpty()) {
                yfq yfqVarA4 = navigationState.a();
                int size2 = yfqVarA4.size();
                for (int i24 = 0; i24 < size2; i24++) {
                    DestinationDetails destinationDetails = (DestinationDetails) yfqVarA4.get(i24);
                    abnp abnpVarN8 = xlb.a.n();
                    ChargingStationDetails chargingStationDetails = destinationDetails.b;
                    if (chargingStationDetails != null) {
                        abnp abnpVarN9 = xis.a.n();
                        abnpVarN9.t();
                        xis xisVar = (xis) abnpVarN9.b;
                        xisVar.b |= 1;
                        xisVar.c = chargingStationDetails.a;
                        abnpVarN9.t();
                        xis xisVar2 = (xis) abnpVarN9.b;
                        xisVar2.b |= 2;
                        xisVar2.d = chargingStationDetails.b;
                        abnpVarN9.t();
                        xis xisVar3 = (xis) abnpVarN9.b;
                        xisVar3.b |= 4;
                        xisVar3.e = chargingStationDetails.c;
                        xis xisVar4 = (xis) abnpVarN9.q();
                        abnpVarN8.t();
                        xlb xlbVar = (xlb) abnpVarN8.b;
                        xisVar4.getClass();
                        xlbVar.d = xisVar4;
                        xlbVar.b |= 2;
                    }
                    String str2 = destinationDetails.a;
                    if (str2 != null) {
                        abnpVarN8.t();
                        xlb xlbVar2 = (xlb) abnpVarN8.b;
                        xlbVar2.b |= 1;
                        xlbVar2.c = str2;
                    }
                    xlb xlbVar3 = (xlb) abnpVarN8.q();
                    abnpVarN.t();
                    xlk xlkVar2 = (xlk) abnpVarN.b;
                    xlbVar3.getClass();
                    xlkVar2.b();
                    xlkVar2.c.add(xlbVar3);
                }
            } else if (!navigationState.b().isEmpty()) {
                yfq yfqVarB3 = navigationState.b();
                int size3 = yfqVarB3.size();
                for (int i25 = 0; i25 < size3; i25++) {
                    String str3 = (String) yfqVarB3.get(i25);
                    abnp abnpVarN10 = xlb.a.n();
                    abnpVarN10.t();
                    xlb xlbVar4 = (xlb) abnpVarN10.b;
                    str3.getClass();
                    xlbVar4.b |= 1;
                    xlbVar4.c = str3;
                    abnpVarN.t();
                    xlk xlkVar3 = (xlk) abnpVarN.b;
                    xlb xlbVar5 = (xlb) abnpVarN10.q();
                    xlbVar5.getClass();
                    xlkVar3.b();
                    xlkVar3.c.add(xlbVar5);
                }
            }
            this.j.k(32774, (xlk) abnpVarN.q());
        } else {
            carInfo = carInfoT;
            i = 2;
            i2 = 1;
            bArr = null;
            i3 = 4;
        }
        if (z(carInfo)) {
            if (navigationState.c().isEmpty()) {
                ((ype) a.l().ai((char) 166)).u("NavigationState provided with empty steps. Ignoring.");
                return;
            }
            NavigationStep navigationStep2 = (NavigationStep) navigationState.c().get(0);
            Maneuver maneuver2 = navigationStep2.a;
            int i26 = 3;
            if (maneuver2 != null) {
                int i27 = maneuver2.a;
                switch (i27) {
                    case 0:
                    default:
                        i6 = i2;
                        break;
                    case 1:
                        i6 = i;
                        break;
                    case 2:
                        i6 = 3;
                        break;
                    case 3:
                    case 4:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                        i6 = 15;
                        break;
                    case 5:
                    case 6:
                        i6 = i3;
                        break;
                    case 7:
                    case 8:
                        i6 = 5;
                        break;
                    case 9:
                    case 10:
                        i6 = 6;
                        break;
                    case 11:
                    case 12:
                        i6 = 7;
                        break;
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        i6 = 8;
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        i6 = 9;
                        break;
                    case 25:
                    case 26:
                        i6 = 10;
                        break;
                    case 27:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        i6 = 11;
                        break;
                    case 30:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        i6 = 12;
                        break;
                    case 31:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        i6 = 13;
                        break;
                    case 32:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        i6 = 14;
                        break;
                    case 37:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    case 48:
                        i6 = 17;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        i6 = 18;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        i6 = 20;
                        break;
                }
                switch (i27) {
                    case 5:
                    case 7:
                    case 9:
                    case 11:
                    case 13:
                    case 15:
                    case 17:
                    case 19:
                    case 21:
                    case 23:
                    case 25:
                    case 27:
                    case 32:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        i26 = i2;
                        break;
                    case 6:
                    case 8:
                    case 10:
                    case 12:
                    case 14:
                    case 16:
                    case 18:
                    case 20:
                    case 22:
                    case 24:
                    case 26:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    case 48:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        i26 = i;
                        break;
                }
                int i28 = maneuver2.b;
                if (i28 == -1) {
                    i28 = 0;
                }
                i4 = maneuver2.c;
                if (i4 == -1) {
                    int i29 = i28;
                    i5 = i26;
                    i7 = i29;
                    i4 = 0;
                } else {
                    int i30 = i28;
                    i5 = i26;
                    i7 = i30;
                }
            } else {
                i4 = 0;
                i5 = 3;
                i6 = i2;
                i7 = 0;
            }
            byte[] bArr2 = navigationStep2.c;
            if (bArr2 != null) {
                bArr = bArr2;
            }
            String str4 = navigationStep2.b;
            if (str4 == null) {
                str4 = "";
            }
            o(i6 - 1, str4, i4, i7, bArr, i5);
        }
    }

    @Override // defpackage.qxj
    public final void j(int i) throws IllegalStateException {
        int i2;
        x();
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                } else if (i != 3) {
                    ((ype) ((ype) a.f()).ai((char) 158)).w("Using UNAVAILABLE for unknown NavigationStatusEnum value: %d", i);
                    i2 = 1;
                } else if (y(this.h.t())) {
                    i2 = 4;
                } else {
                    ((ype) a.l().ai((char) 159)).u("Suppressing REROUTING navigation status for unsupported head unit");
                    i2 = 0;
                }
            }
        } else {
            i2 = 1;
        }
        if (i2 != 0) {
            jbb jbbVar = this.j;
            abnp abnpVarN = xll.a.n();
            abnpVarN.t();
            xll xllVar = (xll) abnpVarN.b;
            xllVar.c = i2 - 1;
            xllVar.b = 1 | xllVar.b;
            jbbVar.k(32771, (xll) abnpVarN.q());
        }
    }

    @Override // defpackage.qxj
    public final void k(int i, int i2, int i3, int i4) throws IllegalStateException {
        x();
        int iAD = a.aD(i4);
        if (iAD == 0) {
            ((ype) ((ype) a.f()).ai((char) 167)).w("Using UNKNOWN_DISTANCE_UNIT for unknown DistanceUnits value: %d", i4);
            iAD = 1;
        }
        this.j.h(i, i2, i3, iAD);
    }

    @Override // defpackage.qxj
    @Deprecated
    public final void l(int i, int i2) throws IllegalStateException {
        int i3 = jbb.a;
        k(i, i2, 0, 0);
    }

    @Override // defpackage.qxj
    @Deprecated
    public final void n(int i, int i2, float f, int i3) throws IllegalStateException {
        x();
        int iAD = a.aD(i3);
        if (iAD == 0) {
            ((ype) ((ype) a.f()).ai((char) 168)).w("Using UNKNOWN_DISTANCE_UNIT for unknown DistanceUnits value: %d", i3);
            iAD = 1;
        }
        this.j.h(i, i2, Math.round(f * 1000.0f), iAD);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    @Override // defpackage.qxj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(int r6, java.lang.String r7, int r8, int r9, byte[] r10, int r11) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikg.o(int, java.lang.String, int, int, byte[], int):void");
    }

    @Override // defpackage.qxj
    public final void p(VehicleEnergyForecast vehicleEnergyForecast) throws RemoteException {
        CarInfo carInfoT = this.h.t();
        int i = carInfoT.e;
        if (i <= 5 && (i != 5 || carInfoT.f <= 0)) {
            ((ype) a.l().ai((char) 171)).u("Suppressing raw vehicle energy forecast if vehicle energy forecast is not supported.");
            return;
        }
        abnp abnpVarN = xnj.a.n();
        abms abmsVarF = ixi.a.apply(vehicleEnergyForecast).f();
        abnpVarN.t();
        xnj xnjVar = (xnj) abnpVarN.b;
        xnjVar.b |= 1;
        xnjVar.c = abmsVarF;
        this.j.k(32776, (xnj) abnpVarN.q());
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        this.j = (jbb) jbjVar;
    }

    @Override // defpackage.qxj
    public final boolean s() throws RemoteException {
        return this.c != null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, qxm] */
    @Override // defpackage.qxj
    @ResultIgnorabilityUnspecified
    public final boolean t(qxm qxmVar) throws IllegalStateException {
        x();
        synchronized (this.b) {
            if (w(qxmVar) == null) {
                ikf ikfVar = new ikf(this, qxmVar, 0);
                try {
                    qxmVar.asBinder().linkToDeath(ikfVar, 0);
                    try {
                        ?? r3 = ikfVar.a;
                        CarInstrumentClusterInfo carInstrumentClusterInfo = this.c;
                        r3.e(carInstrumentClusterInfo.a, carInstrumentClusterInfo.b, carInstrumentClusterInfo.d, carInstrumentClusterInfo.c, carInstrumentClusterInfo.e);
                        this.b.add(ikfVar);
                    } catch (RemoteException unused) {
                        ((ype) ((ype) a.g()).ai(163)).u("listener.onStart failed.");
                        return false;
                    }
                } catch (RemoteException unused2) {
                    ((ype) ((ype) a.h()).ai(164)).u("Adding listener failed.");
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, qxm] */
    @ResultIgnorabilityUnspecified
    public final boolean u(ikf ikfVar) {
        List<ikf> list = this.b;
        synchronized (list) {
            for (ikf ikfVar2 : list) {
                if (ikfVar2 == ikfVar) {
                    ikfVar2.a.asBinder().unlinkToDeath(ikfVar2, 0);
                    return list.remove(ikfVar2);
                }
            }
            return false;
        }
    }

    @Override // defpackage.qxj
    public final boolean v(qxm qxmVar) {
        ikf ikfVarW;
        synchronized (this.b) {
            ikfVarW = w(qxmVar);
        }
        if (ikfVarW == null) {
            return false;
        }
        return u(ikfVarW);
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
    }
}
