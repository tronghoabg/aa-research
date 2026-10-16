package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rsh implements android.os.Parcelable.Creator {
    private final /* synthetic */ int a;

    public rsh(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        long jU = 0;
        int iR = 0;
        com.google.android.gms.car.navigation.AdasRouteInfo.Path path = null;
        java.lang.String strAb = null;
        com.google.android.gms.car.navigation.EnergyAtDistance energyAtDistance = null;
        com.google.android.gms.car.navigation.Distance distance = null;
        int[] iArrAl = null;
        java.util.ArrayList arrayListAf = null;
        com.google.android.gms.car.navigation.StepDistance stepDistance = null;
        java.util.ArrayList arrayListAf2 = null;
        com.google.android.gms.car.navigation.Distance distance2 = null;
        java.lang.String strAb2 = null;
        java.lang.String strAb3 = null;
        switch (this.a) {
            case 0:
                int iT = defpackage.sqs.T(parcel);
                int iR2 = 0;
                int iR3 = 0;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iR = defpackage.sqs.R(parcel, i);
                    } else if (c == 2) {
                        iR2 = defpackage.sqs.R(parcel, i);
                    } else if (c != 3) {
                        defpackage.sqs.ai(parcel, i);
                    } else {
                        iR3 = defpackage.sqs.R(parcel, i);
                    }
                }
                defpackage.sqs.ag(parcel, iT);
                return new com.google.android.gms.car.navigation.ChargingStationDetails(iR, iR2, iR3);
            case 1:
                int iT2 = defpackage.sqs.T(parcel);
                com.google.android.gms.car.navigation.AdasRouteInfo.Trip trip = null;
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        path = (com.google.android.gms.car.navigation.AdasRouteInfo.Path) defpackage.sqs.X(parcel, i2, com.google.android.gms.car.navigation.AdasRouteInfo.Path.CREATOR);
                    } else if (c2 != 2) {
                        defpackage.sqs.ai(parcel, i2);
                    } else {
                        trip = (com.google.android.gms.car.navigation.AdasRouteInfo.Trip) defpackage.sqs.X(parcel, i2, com.google.android.gms.car.navigation.AdasRouteInfo.Trip.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT2);
                return new com.google.android.gms.car.navigation.AdasRouteInfo(path, trip);
            case 2:
                int iT3 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        defpackage.sqs.ai(parcel, i3);
                    } else {
                        strAb3 = defpackage.sqs.ab(parcel, i3);
                    }
                }
                defpackage.sqs.ag(parcel, iT3);
                return new com.google.android.gms.car.navigation.DataAuthorization(strAb3);
            case 3:
                int iT4 = defpackage.sqs.T(parcel);
                com.google.android.gms.car.navigation.ChargingStationDetails chargingStationDetails = null;
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        strAb2 = defpackage.sqs.ab(parcel, i4);
                    } else if (c3 != 2) {
                        defpackage.sqs.ai(parcel, i4);
                    } else {
                        chargingStationDetails = (com.google.android.gms.car.navigation.ChargingStationDetails) defpackage.sqs.X(parcel, i4, com.google.android.gms.car.navigation.ChargingStationDetails.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT4);
                return new com.google.android.gms.car.navigation.DestinationDetails(strAb2, chargingStationDetails);
            case 4:
                int iT5 = defpackage.sqs.T(parcel);
                java.lang.String strAb4 = null;
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        distance2 = (com.google.android.gms.car.navigation.Distance) defpackage.sqs.X(parcel, i5, com.google.android.gms.car.navigation.Distance.CREATOR);
                    } else if (c4 == 2) {
                        strAb4 = defpackage.sqs.ab(parcel, i5);
                    } else if (c4 != 3) {
                        defpackage.sqs.ai(parcel, i5);
                    } else {
                        jU = defpackage.sqs.U(parcel, i5);
                    }
                }
                defpackage.sqs.ag(parcel, iT5);
                return new com.google.android.gms.car.navigation.DestinationDistance(distance2, strAb4, jU);
            case 5:
                int iT6 = defpackage.sqs.T(parcel);
                long jU2 = 0;
                int iR4 = 0;
                int iR5 = 0;
                java.lang.String strAb5 = null;
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        iR4 = defpackage.sqs.R(parcel, i6);
                    } else if (c5 == 2) {
                        strAb5 = defpackage.sqs.ab(parcel, i6);
                    } else if (c5 == 3) {
                        iR5 = defpackage.sqs.R(parcel, i6);
                    } else if (c5 != 4) {
                        defpackage.sqs.ai(parcel, i6);
                    } else {
                        jU2 = defpackage.sqs.U(parcel, i6);
                    }
                }
                defpackage.sqs.ag(parcel, iT6);
                return new com.google.android.gms.car.navigation.Distance(iR4, strAb5, iR5, jU2);
            case 6:
                int iT7 = defpackage.sqs.T(parcel);
                int iR6 = 0;
                int iR7 = 0;
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        iR = defpackage.sqs.R(parcel, i7);
                    } else if (c6 == 2) {
                        iR6 = defpackage.sqs.R(parcel, i7);
                    } else if (c6 != 3) {
                        defpackage.sqs.ai(parcel, i7);
                    } else {
                        iR7 = defpackage.sqs.R(parcel, i7);
                    }
                }
                defpackage.sqs.ag(parcel, iT7);
                return new com.google.android.gms.car.navigation.EnergyAtDistance(iR, iR6, iR7);
            case 7:
                int iT8 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        defpackage.sqs.ai(parcel, i8);
                    } else {
                        arrayListAf2 = defpackage.sqs.af(parcel, i8, com.google.android.gms.car.navigation.LaneDirection.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT8);
                return new com.google.android.gms.car.navigation.Lane(arrayListAf2);
            case 8:
                int iT9 = defpackage.sqs.T(parcel);
                boolean zAj = false;
                while (parcel.dataPosition() < iT9) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        iR = defpackage.sqs.R(parcel, i9);
                    } else if (c7 != 2) {
                        defpackage.sqs.ai(parcel, i9);
                    } else {
                        zAj = defpackage.sqs.aj(parcel, i9);
                    }
                }
                defpackage.sqs.ag(parcel, iT9);
                return new com.google.android.gms.car.navigation.LaneDirection(iR, zAj);
            case 9:
                int iT10 = defpackage.sqs.T(parcel);
                int iR8 = 0;
                int iR9 = 0;
                while (parcel.dataPosition() < iT10) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 1) {
                        iR = defpackage.sqs.R(parcel, i10);
                    } else if (c8 == 2) {
                        iR8 = defpackage.sqs.R(parcel, i10);
                    } else if (c8 != 3) {
                        defpackage.sqs.ai(parcel, i10);
                    } else {
                        iR9 = defpackage.sqs.R(parcel, i10);
                    }
                }
                defpackage.sqs.ag(parcel, iT10);
                return new com.google.android.gms.car.navigation.Maneuver(iR, iR8, iR9);
            case 10:
                int iT11 = defpackage.sqs.T(parcel);
                java.util.ArrayList arrayListAf3 = null;
                java.lang.String strAb6 = null;
                while (parcel.dataPosition() < iT11) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 1) {
                        stepDistance = (com.google.android.gms.car.navigation.StepDistance) defpackage.sqs.X(parcel, i11, com.google.android.gms.car.navigation.StepDistance.CREATOR);
                    } else if (c9 == 2) {
                        arrayListAf3 = defpackage.sqs.af(parcel, i11, com.google.android.gms.car.navigation.DestinationDistance.CREATOR);
                    } else if (c9 != 3) {
                        defpackage.sqs.ai(parcel, i11);
                    } else {
                        strAb6 = defpackage.sqs.ab(parcel, i11);
                    }
                }
                defpackage.sqs.ag(parcel, iT11);
                return new com.google.android.gms.car.navigation.NavigationCurrentPosition(stepDistance, arrayListAf3, strAb6);
            case 11:
                int iT12 = defpackage.sqs.T(parcel);
                java.util.ArrayList arrayListAe = null;
                java.util.ArrayList arrayListAf4 = null;
                while (parcel.dataPosition() < iT12) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        arrayListAf = defpackage.sqs.af(parcel, i12, com.google.android.gms.car.navigation.NavigationStep.CREATOR);
                    } else if (c10 == 2) {
                        arrayListAe = defpackage.sqs.ae(parcel, i12);
                    } else if (c10 != 3) {
                        defpackage.sqs.ai(parcel, i12);
                    } else {
                        arrayListAf4 = defpackage.sqs.af(parcel, i12, com.google.android.gms.car.navigation.DestinationDetails.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT12);
                return new com.google.android.gms.car.navigation.NavigationState(arrayListAf, arrayListAe, arrayListAf4);
            case 12:
                int iT13 = defpackage.sqs.T(parcel);
                com.google.android.gms.car.navigation.Maneuver maneuver = null;
                java.lang.String strAb7 = null;
                java.util.ArrayList arrayListAf5 = null;
                java.util.ArrayList arrayListAe2 = null;
                byte[] bArrAk = null;
                while (parcel.dataPosition() < iT13) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        maneuver = (com.google.android.gms.car.navigation.Maneuver) defpackage.sqs.X(parcel, i13, com.google.android.gms.car.navigation.Maneuver.CREATOR);
                    } else if (c11 == 2) {
                        strAb7 = defpackage.sqs.ab(parcel, i13);
                    } else if (c11 == 3) {
                        arrayListAf5 = defpackage.sqs.af(parcel, i13, com.google.android.gms.car.navigation.Lane.CREATOR);
                    } else if (c11 == 4) {
                        arrayListAe2 = defpackage.sqs.ae(parcel, i13);
                    } else if (c11 != 5) {
                        defpackage.sqs.ai(parcel, i13);
                    } else {
                        bArrAk = defpackage.sqs.ak(parcel, i13);
                    }
                }
                defpackage.sqs.ag(parcel, iT13);
                return new com.google.android.gms.car.navigation.NavigationStep(maneuver, strAb7, arrayListAf5, arrayListAe2, bArrAk);
            case 13:
                int iT14 = defpackage.sqs.T(parcel);
                int[] iArrAl2 = null;
                int[] iArrAl3 = null;
                while (parcel.dataPosition() < iT14) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        iArrAl = defpackage.sqs.al(parcel, i14);
                    } else if (c12 == 2) {
                        iArrAl2 = defpackage.sqs.al(parcel, i14);
                    } else if (c12 != 3) {
                        defpackage.sqs.ai(parcel, i14);
                    } else {
                        iArrAl3 = defpackage.sqs.al(parcel, i14);
                    }
                }
                defpackage.sqs.ag(parcel, iT14);
                return new com.google.android.gms.car.navigation.AdasRouteInfo.Path(iArrAl, iArrAl2, iArrAl3);
            case 14:
                int iT15 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT15) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        distance = (com.google.android.gms.car.navigation.Distance) defpackage.sqs.X(parcel, i15, com.google.android.gms.car.navigation.Distance.CREATOR);
                    } else if (c13 != 2) {
                        defpackage.sqs.ai(parcel, i15);
                    } else {
                        jU = defpackage.sqs.U(parcel, i15);
                    }
                }
                defpackage.sqs.ag(parcel, iT15);
                return new com.google.android.gms.car.navigation.StepDistance(distance, jU);
            case 15:
                int iT16 = defpackage.sqs.T(parcel);
                com.google.android.gms.car.navigation.ChargingStationDetails chargingStationDetails2 = null;
                while (parcel.dataPosition() < iT16) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        energyAtDistance = (com.google.android.gms.car.navigation.EnergyAtDistance) defpackage.sqs.X(parcel, i16, com.google.android.gms.car.navigation.EnergyAtDistance.CREATOR);
                    } else if (c14 != 2) {
                        defpackage.sqs.ai(parcel, i16);
                    } else {
                        chargingStationDetails2 = (com.google.android.gms.car.navigation.ChargingStationDetails) defpackage.sqs.X(parcel, i16, com.google.android.gms.car.navigation.ChargingStationDetails.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT16);
                return new com.google.android.gms.car.navigation.StopDetails(energyAtDistance, chargingStationDetails2);
            case 16:
                int iT17 = defpackage.sqs.T(parcel);
                com.google.android.gms.car.navigation.AdasRouteInfo.Path path2 = null;
                while (parcel.dataPosition() < iT17) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 1) {
                        strAb = defpackage.sqs.ab(parcel, i17);
                    } else if (c15 == 2) {
                        iR = defpackage.sqs.R(parcel, i17);
                    } else if (c15 != 3) {
                        defpackage.sqs.ai(parcel, i17);
                    } else {
                        path2 = (com.google.android.gms.car.navigation.AdasRouteInfo.Path) defpackage.sqs.X(parcel, i17, com.google.android.gms.car.navigation.AdasRouteInfo.Path.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT17);
                return new com.google.android.gms.car.navigation.AdasRouteInfo.Trip(strAb, iR, path2);
            case 17:
                int iT18 = defpackage.sqs.T(parcel);
                int iR10 = 0;
                com.google.android.gms.car.navigation.EnergyAtDistance energyAtDistance2 = null;
                com.google.android.gms.car.navigation.EnergyAtDistance energyAtDistance3 = null;
                com.google.android.gms.car.navigation.ChargingStationDetails chargingStationDetails3 = null;
                java.util.ArrayList arrayListAf6 = null;
                java.util.ArrayList arrayListAf7 = null;
                while (parcel.dataPosition() < iT18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            energyAtDistance2 = (com.google.android.gms.car.navigation.EnergyAtDistance) defpackage.sqs.X(parcel, i18, com.google.android.gms.car.navigation.EnergyAtDistance.CREATOR);
                            break;
                        case 2:
                            energyAtDistance3 = (com.google.android.gms.car.navigation.EnergyAtDistance) defpackage.sqs.X(parcel, i18, com.google.android.gms.car.navigation.EnergyAtDistance.CREATOR);
                            break;
                        case 3:
                            iR10 = defpackage.sqs.R(parcel, i18);
                            break;
                        case 4:
                            chargingStationDetails3 = (com.google.android.gms.car.navigation.ChargingStationDetails) defpackage.sqs.X(parcel, i18, com.google.android.gms.car.navigation.ChargingStationDetails.CREATOR);
                            break;
                        case 5:
                            arrayListAf6 = defpackage.sqs.af(parcel, i18, com.google.android.gms.car.navigation.StopDetails.CREATOR);
                            break;
                        case 6:
                            arrayListAf7 = defpackage.sqs.af(parcel, i18, com.google.android.gms.car.navigation.DataAuthorization.CREATOR);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i18);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT18);
                return new com.google.android.gms.car.navigation.VehicleEnergyForecast(energyAtDistance2, energyAtDistance3, iR10, chargingStationDetails3, arrayListAf6, arrayListAf7);
            case 18:
                return new com.google.android.gms.car.senderprotocol.AutoValue_Channel_FlattenedChannel(parcel.readInt(), parcel.readInt(), parcel.readInt(), defpackage.rws.valueOf(parcel.readString()));
            case 19:
                return new com.google.android.gms.car.senderprotocol.ChannelMessage(parcel.readInt(), (java.nio.ByteBuffer) defpackage.rvp.b(java.nio.ByteBuffer.class, parcel.readStrongBinder()), parcel.readInt(), parcel.readByte() == 1, parcel.readByte() == 1, parcel.readByte() == 1, parcel.readByte() == 1, parcel.readInt(), parcel.readInt());
            default:
                return new com.google.android.gms.carsetup.fsm.impl.ActivityResult(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new com.google.android.gms.car.navigation.ChargingStationDetails[i];
            case 1:
                return new com.google.android.gms.car.navigation.AdasRouteInfo[i];
            case 2:
                return new com.google.android.gms.car.navigation.DataAuthorization[i];
            case 3:
                return new com.google.android.gms.car.navigation.DestinationDetails[i];
            case 4:
                return new com.google.android.gms.car.navigation.DestinationDistance[i];
            case 5:
                return new com.google.android.gms.car.navigation.Distance[i];
            case 6:
                return new com.google.android.gms.car.navigation.EnergyAtDistance[i];
            case 7:
                return new com.google.android.gms.car.navigation.Lane[i];
            case 8:
                return new com.google.android.gms.car.navigation.LaneDirection[i];
            case 9:
                return new com.google.android.gms.car.navigation.Maneuver[i];
            case 10:
                return new com.google.android.gms.car.navigation.NavigationCurrentPosition[i];
            case 11:
                return new com.google.android.gms.car.navigation.NavigationState[i];
            case 12:
                return new com.google.android.gms.car.navigation.NavigationStep[i];
            case 13:
                return new com.google.android.gms.car.navigation.AdasRouteInfo.Path[i];
            case 14:
                return new com.google.android.gms.car.navigation.StepDistance[i];
            case 15:
                return new com.google.android.gms.car.navigation.StopDetails[i];
            case 16:
                return new com.google.android.gms.car.navigation.AdasRouteInfo.Trip[i];
            case 17:
                return new com.google.android.gms.car.navigation.VehicleEnergyForecast[i];
            case 18:
                return new com.google.android.gms.car.senderprotocol.Channel.FlattenedChannel[i];
            case 19:
                return new com.google.android.gms.car.senderprotocol.ChannelMessage[i];
            default:
                return new com.google.android.gms.carsetup.fsm.impl.ActivityResult[i];
        }
    }
}
