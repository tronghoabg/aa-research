package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ikp extends defpackage.qye implements defpackage.jbh, defpackage.jbv {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.INST");
    public final java.util.List b = new java.util.ArrayList();
    public com.google.android.gms.car.CarInstrumentClusterInfo c = null;
    volatile boolean d;
    private final defpackage.jfd e;
    private final defpackage.jfe f;
    private final defpackage.jez g;
    private final defpackage.jfa h;
    private final android.content.Context i;
    private defpackage.jbi j;
    private defpackage.ixn k;

    public ikp(defpackage.jfd jfdVar, defpackage.jfe jfeVar, defpackage.jez jezVar, defpackage.jfa jfaVar, android.content.Context context) {
        this.e = jfdVar;
        this.f = jfeVar;
        this.g = jezVar;
        this.h = jfaVar;
        this.i = context;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qyi] */
    private final defpackage.iko w(qyi qyiVar) {
        for (defpackage.iko ikoVar : this.b) {
            if (ikoVar.a.asBinder() == qyiVar.asBinder()) {
                return ikoVar;
            }
        }
        return null;
    }

    private final void x() throws java.lang.IllegalStateException {
        this.g.b();
        if (!this.d) {
            throw new java.lang.IllegalStateException("CarNotConnected");
        }
        if (this.j == null) {
            throw new java.lang.RuntimeException("InstrumentClusterEndpoint not set.");
        }
    }

    private static boolean y(com.google.android.gms.car.CarInfo carInfo) {
        int i = carInfo.e;
        if (i <= 1) {
            return i == 1 && carInfo.f >= 6;
        }
        return true;
    }

    private static boolean z(com.google.android.gms.car.CarInfo carInfo) {
        return !y(carInfo);
    }

    @Override // defpackage.jbv
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        defpackage.xmp xmpVar;
        int i;
        int i2;
        int i3;
        if ((xpaVar.b & 128) == 0) {
            return null;
        }
        com.google.android.gms.car.CarInstrumentClusterInfo carInstrumentClusterInfo = new com.google.android.gms.car.CarInstrumentClusterInfo();
        this.c = carInstrumentClusterInfo;
        defpackage.xmp xmpVar2 = xpaVar.j;
        if (xmpVar2 == null) {
            xmpVar2 = defpackage.xmp.a;
        }
        carInstrumentClusterInfo.a = xmpVar2.c;
        com.google.android.gms.car.CarInstrumentClusterInfo carInstrumentClusterInfo2 = this.c;
        defpackage.xmp xmpVar3 = xpaVar.j;
        int iS = defpackage.wva.s((xmpVar3 == null ? defpackage.xmp.a : xmpVar3).d);
        if (iS == 0) {
            iS = 1;
        }
        carInstrumentClusterInfo2.b = iS;
        if (iS == 1) {
            if (xmpVar3 == null) {
                xmpVar3 = defpackage.xmp.a;
                xmpVar = null;
            } else {
                xmpVar = xmpVar3;
            }
            if ((xmpVar3.b & 4) == 0) {
                this.e.ax(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.NAV_NO_IMAGE_OPTIONS, "No image options set for image capable instrument cluster.");
                return null;
            }
            if (xmpVar == null) {
                xmpVar = defpackage.xmp.a;
            }
            defpackage.xmn xmnVar = xmpVar.e;
            if (xmnVar == null) {
                xmnVar = defpackage.xmn.a;
            }
            int i4 = xmnVar.b;
            if ((i4 & 1) == 0 || (i4 & 2) == 0 || (i = xmnVar.c) <= 0 || (i2 = xmnVar.d) <= 0) {
                this.e.ax(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.NAV_BAD_SIZE, "width and height must both be positive values:  Width = " + xmnVar.c + "Height = " + xmnVar.d);
                return null;
            }
            if ((i4 & 4) == 0 || !((i3 = xmnVar.e) == 8 || i3 == 16 || i3 == 32)) {
                this.e.ax(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.NAV_BAD_COLOR, "ColorDepthBits must be 8, 16, or 32.  However the value was = " + xmnVar.e);
                return null;
            }
            if (i != i2) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(160)).B("CarNavigationStatusService onServiceDiscover called with non-square screen dimensions.  Height and width should be the same but got h=%d and w=%d", xmnVar.c, xmnVar.d);
            }
            com.google.android.gms.car.CarInstrumentClusterInfo carInstrumentClusterInfo3 = this.c;
            int i5 = xmnVar.c;
            carInstrumentClusterInfo3.d = i5;
            int i6 = xmnVar.d;
            carInstrumentClusterInfo3.c = i6;
            int i7 = xmnVar.e;
            carInstrumentClusterInfo3.e = i7;
            if (this.k == null) {
                this.k = new defpackage.ixn(this.i, i5, i6, i7);
            }
        }
        this.d = true;
        return this;
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        return new defpackage.jbi(this, jbuVar);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.qyf
    public final com.google.android.gms.car.CarInstrumentClusterInfo f() throws android.os.RemoteException {
        return this.c;
    }

    @Override // defpackage.qyf
    public final void g(com.google.android.gms.car.navigation.AdasRouteInfo adasRouteInfo) {
        defpackage.abor aborVarN = xie.a.n();
        com.google.android.gms.car.navigation.AdasRouteInfo.Path path = adasRouteInfo.a;
        if (path != null) {
            xnb xnbVarB = ixq.b(path);
            aborVarN.t();
            xie xieVar = aborVarN.b;
            xnbVarB.getClass();
            xieVar.c = xnbVarB;
            xieVar.b |= 1;
        }
        com.google.android.gms.car.navigation.AdasRouteInfo.Trip trip = adasRouteInfo.b;
        if (trip != null) {
            defpackage.abor aborVarN2 = xpp.a.n();
            java.lang.String str = trip.a;
            if (str != null) {
                aborVarN2.t();
                xpp xppVar = aborVarN2.b;
                xppVar.b |= 1;
                xppVar.c = str;
            }
            int i = trip.b;
            aborVarN2.t();
            xpp xppVar2 = aborVarN2.b;
            xppVar2.b |= 2;
            xppVar2.d = i;
            com.google.android.gms.car.navigation.AdasRouteInfo.Path path2 = trip.c;
            if (path2 != null) {
                xnb xnbVarB2 = ixq.b(path2);
                aborVarN2.t();
                xpp xppVar3 = aborVarN2.b;
                xnbVarB2.getClass();
                xppVar3.e = xnbVarB2;
                xppVar3.b |= 4;
            }
            xpp xppVarQ = aborVarN2.q();
            aborVarN.t();
            xie xieVar2 = aborVarN.b;
            xppVarQ.getClass();
            xieVar2.d = xppVarQ;
            xieVar2.b |= 2;
        }
        defpackage.abor aborVarN3 = xoi.a.n();
        defpackage.abnv abnvVarF = aborVarN.q().f();
        aborVarN3.t();
        xoi xoiVar = aborVarN3.b;
        xoiVar.b |= 1;
        xoiVar.c = abnvVarF;
        this.j.k(32777, (xoi) aborVarN3.q());
    }

    @Override // defpackage.qyf
    public final void h(com.google.android.gms.car.navigation.NavigationCurrentPosition navigationCurrentPosition) {
        int i;
        int i2;
        com.google.android.gms.car.CarInfo carInfoT = this.h.t();
        int i3 = 0;
        if (y(carInfoT)) {
            defpackage.abor aborVarN = xmb.a.n();
            com.google.android.gms.car.navigation.StepDistance stepDistance = navigationCurrentPosition.a;
            if (stepDistance != null) {
                defpackage.abor aborVarN2 = xmt.a.n();
                com.google.android.gms.car.navigation.Distance distance = stepDistance.a;
                if (distance != null) {
                    xme xmeVarA = ixq.a(distance);
                    aborVarN2.t();
                    xmt xmtVar = aborVarN2.b;
                    xmeVarA.getClass();
                    xmtVar.c = xmeVarA;
                    xmtVar.b |= 1;
                }
                long j = stepDistance.b;
                if (j > 0) {
                    aborVarN2.t();
                    xmt xmtVar2 = aborVarN2.b;
                    xmtVar2.b |= 2;
                    xmtVar2.d = j;
                }
                xmt xmtVarQ = aborVarN2.q();
                aborVarN.t();
                xmb xmbVar = aborVarN.b;
                xmtVarQ.getClass();
                xmbVar.c = xmtVarQ;
                xmbVar.b |= 1;
            }
            if (!navigationCurrentPosition.a().isEmpty()) {
                int i4 = 0;
                while (true) {
                    defpackage.ygw ygwVarA = navigationCurrentPosition.a();
                    ygwVarA.getClass();
                    if (i4 >= ygwVarA.size()) {
                        break;
                    }
                    defpackage.ygw ygwVarA2 = navigationCurrentPosition.a();
                    ygwVarA2.getClass();
                    com.google.android.gms.car.navigation.DestinationDistance destinationDistance = (com.google.android.gms.car.navigation.DestinationDistance) ygwVarA2.get(i4);
                    defpackage.abor aborVarN3 = xmd.a.n();
                    com.google.android.gms.car.navigation.Distance distance2 = destinationDistance.a;
                    if (distance2 != null) {
                        xme xmeVarA2 = ixq.a(distance2);
                        aborVarN3.t();
                        xmd xmdVar = aborVarN3.b;
                        xmeVarA2.getClass();
                        xmdVar.c = xmeVarA2;
                        xmdVar.b |= 1;
                    }
                    long j2 = destinationDistance.c;
                    if (j2 > 0) {
                        aborVarN3.t();
                        xmd xmdVar2 = aborVarN3.b;
                        xmdVar2.b |= 4;
                        xmdVar2.e = j2;
                    }
                    java.lang.String str = destinationDistance.b;
                    if (str != null) {
                        aborVarN3.t();
                        xmd xmdVar3 = aborVarN3.b;
                        xmdVar3.b |= 2;
                        xmdVar3.d = str;
                    }
                    xmd xmdVarQ = aborVarN3.q();
                    aborVarN.t();
                    xmb xmbVar2 = aborVarN.b;
                    xmdVarQ.getClass();
                    defpackage.abpj abpjVar = xmbVar2.d;
                    if (!abpjVar.c()) {
                        xmbVar2.d = defpackage.abox.I(abpjVar);
                    }
                    xmbVar2.d.add(xmdVarQ);
                    i4++;
                }
            }
            java.lang.String str2 = navigationCurrentPosition.b;
            if (str2 != null) {
                defpackage.abor aborVarN4 = xmk.a.n();
                aborVarN4.t();
                xmk xmkVar = aborVarN4.b;
                xmkVar.b |= 1;
                xmkVar.c = str2;
                aborVarN.t();
                xmb xmbVar3 = aborVarN.b;
                xmk xmkVarQ = aborVarN4.q();
                xmkVarQ.getClass();
                xmbVar3.e = xmkVarQ;
                xmbVar3.b |= 2;
            }
            this.j.k(32775, (xmb) aborVarN.q());
        }
        if (z(carInfoT)) {
            com.google.android.gms.car.navigation.StepDistance stepDistance2 = navigationCurrentPosition.a;
            if (stepDistance2 == null) {
                ((defpackage.yqj) a.l().ai((char) 165)).u("NavigationCurrentPosition provided with empty step distances. Ignoring.");
                return;
            }
            com.google.android.gms.car.navigation.Distance distance3 = stepDistance2.a;
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
    @Override // defpackage.qyf
    public final void i(com.google.android.gms.car.navigation.NavigationState navigationState) throws java.lang.Throwable {
        com.google.android.gms.car.CarInfo carInfo;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        java.lang.Throwable th;
        x();
        com.google.android.gms.car.CarInfo carInfoT = this.h.t();
        int i8 = 2;
        int i9 = 1;
        if (y(carInfoT)) {
            navigationState.c().getClass();
            navigationState.b().getClass();
            navigationState.a().getClass();
            defpackage.abor aborVarN = xml.a.n();
            defpackage.ygw ygwVarC = navigationState.c();
            int size = ygwVarC.size();
            int i10 = 0;
            while (i10 < size) {
                com.google.android.gms.car.navigation.NavigationStep navigationStep = (com.google.android.gms.car.navigation.NavigationStep) ygwVarC.get(i10);
                defpackage.abor aborVarN2 = xms.a.n();
                com.google.android.gms.car.navigation.Maneuver maneuver = navigationStep.a;
                if (maneuver != null) {
                    xmh xmhVar = xmh.a;
                    defpackage.abor aborVarN3 = xmhVar.n();
                    th = null;
                    int i11 = maneuver.a;
                    if (defpackage.wqn.y(i11) != 0) {
                        int iY = defpackage.wqn.y(i11);
                        aborVarN3.t();
                        xmh xmhVar2 = aborVarN3.b;
                        int i12 = iY - 1;
                        if (iY == 0) {
                            throw null;
                        }
                        xmhVar2.c = i12;
                        xmhVar2.b |= i9;
                        int i13 = maneuver.b;
                        if (i13 > 0) {
                            aborVarN3.t();
                            xmh xmhVar3 = aborVarN3.b;
                            xmhVar3.b |= i8;
                            xmhVar3.d = i13;
                        }
                        int i14 = maneuver.c;
                        if (i14 > 0) {
                            aborVarN3.t();
                            xmh xmhVar4 = aborVarN3.b;
                            xmhVar4.b |= 4;
                            xmhVar4.e = i14;
                        }
                        xmhVar = (xmh) aborVarN3.q();
                    }
                    aborVarN2.t();
                    xms xmsVar = aborVarN2.b;
                    xmhVar.getClass();
                    xmsVar.c = xmhVar;
                    xmsVar.b |= i9;
                } else {
                    th = null;
                }
                if (!navigationStep.b().isEmpty()) {
                    int i15 = 0;
                    while (true) {
                        defpackage.ygw ygwVarB = navigationStep.b();
                        ygwVarB.getClass();
                        if (i15 >= ygwVarB.size()) {
                            break;
                        }
                        defpackage.ygw ygwVarB2 = navigationStep.b();
                        ygwVarB2.getClass();
                        com.google.android.gms.car.navigation.Lane lane = (com.google.android.gms.car.navigation.Lane) ygwVarB2.get(i15);
                        defpackage.abor aborVarN4 = xmg.a.n();
                        if (!lane.a().isEmpty()) {
                            int i16 = 0;
                            while (true) {
                                defpackage.ygw ygwVarA = lane.a();
                                ygwVarA.getClass();
                                if (i16 >= ygwVarA.size()) {
                                    break;
                                }
                                defpackage.ygw ygwVarA2 = lane.a();
                                ygwVarA2.getClass();
                                com.google.android.gms.car.navigation.LaneDirection laneDirection = (com.google.android.gms.car.navigation.LaneDirection) ygwVarA2.get(i16);
                                int i17 = i8;
                                defpackage.abor aborVarN5 = xmf.a.n();
                                int i18 = i9;
                                int iAD = defpackage.a.aD(laneDirection.a);
                                aborVarN5.t();
                                xmf xmfVar = aborVarN5.b;
                                com.google.android.gms.car.CarInfo carInfo2 = carInfoT;
                                int i19 = iAD - 1;
                                if (iAD == 0) {
                                    throw th;
                                }
                                xmfVar.c = i19;
                                xmfVar.b |= 1;
                                boolean z = laneDirection.b;
                                aborVarN5.t();
                                xmf xmfVar2 = aborVarN5.b;
                                xmfVar2.b |= 2;
                                xmfVar2.d = z;
                                xmf xmfVarQ = aborVarN5.q();
                                aborVarN4.t();
                                xmg xmgVar = aborVarN4.b;
                                xmfVarQ.getClass();
                                defpackage.abpj abpjVar = xmgVar.b;
                                if (!abpjVar.c()) {
                                    xmgVar.b = defpackage.abox.I(abpjVar);
                                }
                                xmgVar.b.add(xmfVarQ);
                                i16++;
                                i9 = i18;
                                i8 = i17;
                                carInfoT = carInfo2;
                            }
                        }
                        com.google.android.gms.car.CarInfo carInfo3 = carInfoT;
                        int i20 = i8;
                        int i21 = i9;
                        xmg xmgVarQ = aborVarN4.q();
                        aborVarN2.t();
                        xms xmsVar2 = aborVarN2.b;
                        xmgVarQ.getClass();
                        defpackage.abpj abpjVar2 = xmsVar2.e;
                        if (!abpjVar2.c()) {
                            xmsVar2.e = defpackage.abox.I(abpjVar2);
                        }
                        xmsVar2.e.add(xmgVarQ);
                        i15++;
                        i9 = i21;
                        i8 = i20;
                        carInfoT = carInfo3;
                    }
                }
                com.google.android.gms.car.CarInfo carInfo4 = carInfoT;
                int i22 = i8;
                int i23 = i9;
                java.lang.String str = navigationStep.b;
                if (str != null) {
                    defpackage.abor aborVarN6 = xmk.a.n();
                    aborVarN6.t();
                    xmk xmkVar = aborVarN6.b;
                    xmkVar.b |= 1;
                    xmkVar.c = str;
                    aborVarN2.t();
                    xms xmsVar3 = aborVarN2.b;
                    xmk xmkVarQ = aborVarN6.q();
                    xmkVarQ.getClass();
                    xmsVar3.d = xmkVarQ;
                    xmsVar3.b |= 2;
                }
                if (!navigationStep.a().isEmpty()) {
                    defpackage.abor aborVarN7 = xma.a.n();
                    defpackage.ygw ygwVarA3 = navigationStep.a();
                    aborVarN7.t();
                    xma xmaVar = aborVarN7.b;
                    defpackage.abpj abpjVar3 = xmaVar.b;
                    if (!abpjVar3.c()) {
                        xmaVar.b = defpackage.abox.I(abpjVar3);
                    }
                    defpackage.abnf.i(ygwVarA3, xmaVar.b);
                    aborVarN2.t();
                    xms xmsVar4 = aborVarN2.b;
                    xma xmaVarQ = aborVarN7.q();
                    xmaVarQ.getClass();
                    xmsVar4.f = xmaVarQ;
                    xmsVar4.b |= 4;
                }
                xms xmsVarQ = aborVarN2.q();
                aborVarN.t();
                xml xmlVar = aborVarN.b;
                xmsVarQ.getClass();
                defpackage.abpj abpjVar4 = xmlVar.b;
                if (!abpjVar4.c()) {
                    xmlVar.b = defpackage.abox.I(abpjVar4);
                }
                xmlVar.b.add(xmsVarQ);
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
                defpackage.ygw ygwVarA4 = navigationState.a();
                int size2 = ygwVarA4.size();
                for (int i24 = 0; i24 < size2; i24++) {
                    com.google.android.gms.car.navigation.DestinationDetails destinationDetails = (com.google.android.gms.car.navigation.DestinationDetails) ygwVarA4.get(i24);
                    defpackage.abor aborVarN8 = xmc.a.n();
                    com.google.android.gms.car.navigation.ChargingStationDetails chargingStationDetails = destinationDetails.b;
                    if (chargingStationDetails != null) {
                        defpackage.abor aborVarN9 = xjt.a.n();
                        aborVarN9.t();
                        xjt xjtVar = aborVarN9.b;
                        xjtVar.b |= 1;
                        xjtVar.c = chargingStationDetails.a;
                        aborVarN9.t();
                        xjt xjtVar2 = aborVarN9.b;
                        xjtVar2.b |= 2;
                        xjtVar2.d = chargingStationDetails.b;
                        aborVarN9.t();
                        xjt xjtVar3 = aborVarN9.b;
                        xjtVar3.b |= 4;
                        xjtVar3.e = chargingStationDetails.c;
                        xjt xjtVarQ = aborVarN9.q();
                        aborVarN8.t();
                        xmc xmcVar = aborVarN8.b;
                        xjtVarQ.getClass();
                        xmcVar.d = xjtVarQ;
                        xmcVar.b |= 2;
                    }
                    java.lang.String str2 = destinationDetails.a;
                    if (str2 != null) {
                        aborVarN8.t();
                        xmc xmcVar2 = aborVarN8.b;
                        xmcVar2.b |= 1;
                        xmcVar2.c = str2;
                    }
                    xmc xmcVarQ = aborVarN8.q();
                    aborVarN.t();
                    xml xmlVar2 = aborVarN.b;
                    xmcVarQ.getClass();
                    xmlVar2.b();
                    xmlVar2.c.add(xmcVarQ);
                }
            } else if (!navigationState.b().isEmpty()) {
                defpackage.ygw ygwVarB3 = navigationState.b();
                int size3 = ygwVarB3.size();
                for (int i25 = 0; i25 < size3; i25++) {
                    java.lang.String str3 = (java.lang.String) ygwVarB3.get(i25);
                    defpackage.abor aborVarN10 = xmc.a.n();
                    aborVarN10.t();
                    xmc xmcVar3 = aborVarN10.b;
                    str3.getClass();
                    xmcVar3.b |= 1;
                    xmcVar3.c = str3;
                    aborVarN.t();
                    xml xmlVar3 = aborVarN.b;
                    xmc xmcVarQ2 = aborVarN10.q();
                    xmcVarQ2.getClass();
                    xmlVar3.b();
                    xmlVar3.c.add(xmcVarQ2);
                }
            }
            this.j.k(32774, (xml) aborVarN.q());
        } else {
            carInfo = carInfoT;
            i = 2;
            i2 = 1;
            bArr = null;
            i3 = 4;
        }
        if (z(carInfo)) {
            if (navigationState.c().isEmpty()) {
                ((defpackage.yqj) a.l().ai((char) 166)).u("NavigationState provided with empty steps. Ignoring.");
                return;
            }
            com.google.android.gms.car.navigation.NavigationStep navigationStep2 = (com.google.android.gms.car.navigation.NavigationStep) navigationState.c().get(0);
            com.google.android.gms.car.navigation.Maneuver maneuver2 = navigationStep2.a;
            int i26 = 3;
            if (maneuver2 != null) {
                int i27 = maneuver2.a;
                switch (i27) {
                    case defpackage.abnt.b /* 0 */:
                    default:
                        i6 = i2;
                        break;
                    case 1:
                        i6 = i;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        i6 = 3;
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    case 36:
                        i6 = 15;
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        i6 = i3;
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
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
                    case 28:
                    case 29:
                        i6 = 11;
                        break;
                    case 30:
                    case 43:
                    case 45:
                        i6 = 12;
                        break;
                    case 31:
                    case 44:
                    case 46:
                        i6 = 13;
                        break;
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                        i6 = 14;
                        break;
                    case 37:
                    case 47:
                    case 48:
                        i6 = 17;
                        break;
                    case 38:
                    case 49:
                    case 50:
                        i6 = 18;
                        break;
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        i6 = 20;
                        break;
                }
                switch (i27) {
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
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
                    case 33:
                    case 41:
                    case 43:
                    case 44:
                    case 47:
                    case 49:
                        i26 = i2;
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    case 10:
                    case 12:
                    case 14:
                    case 16:
                    case 18:
                    case 20:
                    case 22:
                    case 24:
                    case 26:
                    case 28:
                    case 34:
                    case 35:
                    case 42:
                    case 45:
                    case 46:
                    case 48:
                    case 50:
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
            java.lang.String str4 = navigationStep2.b;
            if (str4 == null) {
                str4 = "";
            }
            o(i6 - 1, str4, i4, i7, bArr, i5);
        }
    }

    @Override // defpackage.qyf
    public final void j(int i) {
        int i2;
        x();
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                } else if (i != 3) {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 158)).w("Using UNAVAILABLE for unknown NavigationStatusEnum value: %d", i);
                    i2 = 1;
                } else if (y(this.h.t())) {
                    i2 = 4;
                } else {
                    ((defpackage.yqj) a.l().ai((char) 159)).u("Suppressing REROUTING navigation status for unsupported head unit");
                    i2 = 0;
                }
            }
        } else {
            i2 = 1;
        }
        if (i2 != 0) {
            defpackage.jbi jbiVar = this.j;
            defpackage.abor aborVarN = xmm.a.n();
            aborVarN.t();
            xmm xmmVar = aborVarN.b;
            xmmVar.c = i2 - 1;
            xmmVar.b = 1 | xmmVar.b;
            jbiVar.k(32771, aborVarN.q());
        }
    }

    @Override // defpackage.qyf
    public final void k(int i, int i2, int i3, int i4) {
        x();
        int iAC = defpackage.a.aC(i4);
        if (iAC == 0) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 167)).w("Using UNKNOWN_DISTANCE_UNIT for unknown DistanceUnits value: %d", i4);
            iAC = 1;
        }
        this.j.h(i, i2, i3, iAC);
    }

    @Override // defpackage.qyf
    @java.lang.Deprecated
    public final void l(int i, int i2) {
        int i3 = defpackage.jbi.a;
        k(i, i2, 0, 0);
    }

    @Override // defpackage.qyf
    @java.lang.Deprecated
    public final void n(int i, int i2, float f, int i3) {
        x();
        int iAC = defpackage.a.aC(i3);
        if (iAC == 0) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 168)).w("Using UNKNOWN_DISTANCE_UNIT for unknown DistanceUnits value: %d", i3);
            iAC = 1;
        }
        this.j.h(i, i2, java.lang.Math.round(f * 1000.0f), iAC);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    @Override // defpackage.qyf
    public final void o(int i, java.lang.String str, int i2, int i3, byte[] bArr, int i4) {
        defpackage.ixn ixnVar;
        int i5;
        java.lang.String str2;
        boolean z;
        java.lang.String str3;
        x();
        if (true != this.f.bt()) {
            bArr = null;
        }
        if (bArr == null && (ixnVar = this.k) != null) {
            switch (i) {
                case 1:
                    bArr = ixnVar.a("da_turn_depart");
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                case 14:
                    bArr = ixnVar.a("da_turn_straight");
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                    if (i4 == 1) {
                        i5 = i4;
                    } else if (i4 != 2) {
                        bArr = ixnVar.a("da_turn_unknown");
                    } else {
                        i5 = 2;
                    }
                    switch (i) {
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            str2 = "da_turn_slight_right";
                            if (i5 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bArr = ixnVar.c.a(str2, z);
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            str2 = "da_turn_right";
                            if (i5 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bArr = ixnVar.c.a(str2, z);
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            str2 = "da_turn_sharp_right";
                            if (i5 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bArr = ixnVar.c.a(str2, z);
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        default:
                            bArr = ixnVar.a("da_turn_unknown");
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            str2 = "da_turn_ramp_right";
                            if (i5 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bArr = ixnVar.c.a(str2, z);
                            break;
                        case 9:
                            str2 = "da_turn_fork_right";
                            if (i5 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bArr = ixnVar.c.a(str2, z);
                            break;
                    }
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                case 11:
                case 12:
                case 13:
                    if (i != 6) {
                        str3 = "da_turn_generic_roundabout";
                        switch (i) {
                            case 12:
                                str3 = "da_turn_roundabout_exit";
                                break;
                            case 13:
                                if (i2 > 0) {
                                    if (i2 <= 67) {
                                        str3 = "da_turn_roundabout_1";
                                    } else if (i2 <= 112) {
                                        str3 = "da_turn_roundabout_2";
                                    } else if (i2 <= 157) {
                                        str3 = "da_turn_roundabout_3";
                                    } else if (i2 <= 202) {
                                        str3 = "da_turn_roundabout_4";
                                    } else if (i2 <= 247) {
                                        str3 = "da_turn_roundabout_5";
                                    } else if (i2 <= 292) {
                                        str3 = "da_turn_roundabout_6";
                                    } else if (i2 <= 337) {
                                        str3 = "da_turn_roundabout_7";
                                    } else if (i2 <= 360) {
                                        str3 = "da_turn_roundabout_8";
                                    }
                                }
                                break;
                        }
                    } else {
                        str3 = "da_turn_uturn";
                    }
                    bArr = ixnVar.c.a(str3, ixnVar.a);
                    break;
                case 10:
                    bArr = ixnVar.a("da_turn_generic_merge");
                    break;
                case 15:
                case 18:
                default:
                    bArr = ixnVar.a("da_turn_unknown");
                    break;
                case 16:
                case 17:
                    bArr = ixnVar.a("da_turn_ferry");
                    break;
                case 19:
                    bArr = ixnVar.a("da_turn_arrive");
                    break;
            }
        }
        int iX = defpackage.wqn.x(i);
        if (iX == 0) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 170)).w("Using UNKNOWN for unknown NextTurnEnum value: %d", i);
            iX = 1;
        }
        int iAq = defpackage.a.aq(i4);
        if (iAq == 0) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 169)).w("Using UNSPECIFIED for unknown TurnSide value: %d", i4);
            iAq = 3;
        }
        defpackage.jbi jbiVar = this.j;
        defpackage.abor aborVarN = xmj.a.n();
        aborVarN.t();
        xmj xmjVar = aborVarN.b;
        xmjVar.b |= 1;
        xmjVar.c = "";
        aborVarN.t();
        xmj xmjVar2 = aborVarN.b;
        xmjVar2.e = iX - 1;
        xmjVar2.b |= 4;
        if (str != null) {
            aborVarN.t();
            xmj xmjVar3 = aborVarN.b;
            xmjVar3.b = 1 | xmjVar3.b;
            xmjVar3.c = str;
        }
        aborVarN.t();
        xmj xmjVar4 = aborVarN.b;
        xmjVar4.b |= 32;
        xmjVar4.h = i2;
        aborVarN.t();
        xmj xmjVar5 = aborVarN.b;
        xmjVar5.b |= 16;
        xmjVar5.g = i3;
        aborVarN.t();
        xmj xmjVar6 = aborVarN.b;
        xmjVar6.d = iAq;
        xmjVar6.b |= 2;
        if (bArr != null) {
            defpackage.abnv abnvVarV = defpackage.abnv.v(bArr);
            aborVarN.t();
            xmj xmjVar7 = aborVarN.b;
            abnvVarV.getClass();
            xmjVar7.b |= 8;
            xmjVar7.f = abnvVarV;
        }
        jbiVar.k(32772, aborVarN.q());
    }

    @Override // defpackage.qyf
    public final void p(com.google.android.gms.car.navigation.VehicleEnergyForecast vehicleEnergyForecast) throws android.os.RemoteException {
        com.google.android.gms.car.CarInfo carInfoT = this.h.t();
        int i = carInfoT.e;
        if (i <= 5 && (i != 5 || carInfoT.f <= 0)) {
            ((defpackage.yqj) a.l().ai((char) 171)).u("Suppressing raw vehicle energy forecast if vehicle energy forecast is not supported.");
            return;
        }
        defpackage.abor aborVarN = xok.a.n();
        defpackage.abnv abnvVarF = ixq.a.a(vehicleEnergyForecast).f();
        aborVarN.t();
        xok xokVar = aborVarN.b;
        xokVar.b |= 1;
        xokVar.c = abnvVarF;
        this.j.k(32776, (xok) aborVarN.q());
    }

    @Override // defpackage.izd
    public final void q() {
        throw null;
    }

    @Override // defpackage.izd
    public final void r(defpackage.jbq jbqVar) {
        this.j = (defpackage.jbi) jbqVar;
    }

    @Override // defpackage.qyf
    public final boolean s() throws android.os.RemoteException {
        return this.c != null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, qyi] */
    @Override // defpackage.qyf
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean t(qyi qyiVar) {
        x();
        synchronized (this.b) {
            if (w(qyiVar) == null) {
                defpackage.iko ikoVar = new defpackage.iko(this, qyiVar, 0);
                try {
                    qyiVar.asBinder().linkToDeath(ikoVar, 0);
                    try {
                        ?? r3 = ikoVar.a;
                        com.google.android.gms.car.CarInstrumentClusterInfo carInstrumentClusterInfo = this.c;
                        r3.e(carInstrumentClusterInfo.a, carInstrumentClusterInfo.b, carInstrumentClusterInfo.d, carInstrumentClusterInfo.c, carInstrumentClusterInfo.e);
                        this.b.add(ikoVar);
                    } catch (android.os.RemoteException unused) {
                        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(163)).u("listener.onStart failed.");
                        return false;
                    }
                } catch (android.os.RemoteException unused2) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(164)).u("Adding listener failed.");
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, qyi] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean u(defpackage.iko ikoVar) {
        java.util.List<defpackage.iko> list = this.b;
        synchronized (list) {
            for (defpackage.iko ikoVar2 : list) {
                if (ikoVar2 == ikoVar) {
                    ikoVar2.a.asBinder().unlinkToDeath(ikoVar2, 0);
                    return list.remove(ikoVar2);
                }
            }
            return false;
        }
    }

    @Override // defpackage.qyf
    public final boolean v(qyi qyiVar) {
        defpackage.iko ikoVarW;
        synchronized (this.b) {
            ikoVarW = w(qyiVar);
        }
        if (ikoVarW == null) {
            return false;
        }
        return u(ikoVarW);
    }

    @Override // defpackage.izd
    public final void m(java.io.PrintWriter printWriter) {
    }
}
