package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.navigation.AdasRouteInfo;
import com.google.android.gms.car.navigation.ChargingStationDetails;
import com.google.android.gms.car.navigation.DataAuthorization;
import com.google.android.gms.car.navigation.DestinationDetails;
import com.google.android.gms.car.navigation.DestinationDistance;
import com.google.android.gms.car.navigation.Distance;
import com.google.android.gms.car.navigation.EnergyAtDistance;
import com.google.android.gms.car.navigation.Lane;
import com.google.android.gms.car.navigation.LaneDirection;
import com.google.android.gms.car.navigation.Maneuver;
import com.google.android.gms.car.navigation.NavigationCurrentPosition;
import com.google.android.gms.car.navigation.NavigationState;
import com.google.android.gms.car.navigation.NavigationStep;
import com.google.android.gms.car.navigation.StepDistance;
import com.google.android.gms.car.navigation.StopDetails;
import com.google.android.gms.car.navigation.VehicleEnergyForecast;
import com.google.android.gms.car.senderprotocol.AutoValue_Channel_FlattenedChannel;
import com.google.android.gms.car.senderprotocol.Channel;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class rrn implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rrn(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jQ = 0;
        int iN = 0;
        AdasRouteInfo.Path path = null;
        String strX = null;
        EnergyAtDistance energyAtDistance = null;
        Distance distance = null;
        int[] iArrAh = null;
        ArrayList arrayListAb = null;
        StepDistance stepDistance = null;
        ArrayList arrayListAb2 = null;
        Distance distance2 = null;
        String strX2 = null;
        String strX3 = null;
        switch (this.a) {
            case 0:
                int iP = spu.P(parcel);
                int iN2 = 0;
                int iN3 = 0;
                while (parcel.dataPosition() < iP) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iN = spu.N(parcel, i);
                    } else if (c == 2) {
                        iN2 = spu.N(parcel, i);
                    } else if (c != 3) {
                        spu.ae(parcel, i);
                    } else {
                        iN3 = spu.N(parcel, i);
                    }
                }
                spu.ac(parcel, iP);
                return new ChargingStationDetails(iN, iN2, iN3);
            case 1:
                int iP2 = spu.P(parcel);
                AdasRouteInfo.Trip trip = null;
                while (parcel.dataPosition() < iP2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        path = (AdasRouteInfo.Path) spu.T(parcel, i2, AdasRouteInfo.Path.CREATOR);
                    } else if (c2 != 2) {
                        spu.ae(parcel, i2);
                    } else {
                        trip = (AdasRouteInfo.Trip) spu.T(parcel, i2, AdasRouteInfo.Trip.CREATOR);
                    }
                }
                spu.ac(parcel, iP2);
                return new AdasRouteInfo(path, trip);
            case 2:
                int iP3 = spu.P(parcel);
                while (parcel.dataPosition() < iP3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        spu.ae(parcel, i3);
                    } else {
                        strX3 = spu.X(parcel, i3);
                    }
                }
                spu.ac(parcel, iP3);
                return new DataAuthorization(strX3);
            case 3:
                int iP4 = spu.P(parcel);
                ChargingStationDetails chargingStationDetails = null;
                while (parcel.dataPosition() < iP4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        strX2 = spu.X(parcel, i4);
                    } else if (c3 != 2) {
                        spu.ae(parcel, i4);
                    } else {
                        chargingStationDetails = (ChargingStationDetails) spu.T(parcel, i4, ChargingStationDetails.CREATOR);
                    }
                }
                spu.ac(parcel, iP4);
                return new DestinationDetails(strX2, chargingStationDetails);
            case 4:
                int iP5 = spu.P(parcel);
                String strX4 = null;
                while (parcel.dataPosition() < iP5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        distance2 = (Distance) spu.T(parcel, i5, Distance.CREATOR);
                    } else if (c4 == 2) {
                        strX4 = spu.X(parcel, i5);
                    } else if (c4 != 3) {
                        spu.ae(parcel, i5);
                    } else {
                        jQ = spu.Q(parcel, i5);
                    }
                }
                spu.ac(parcel, iP5);
                return new DestinationDistance(distance2, strX4, jQ);
            case 5:
                int iP6 = spu.P(parcel);
                long jQ2 = 0;
                int iN4 = 0;
                int iN5 = 0;
                String strX5 = null;
                while (parcel.dataPosition() < iP6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        iN4 = spu.N(parcel, i6);
                    } else if (c5 == 2) {
                        strX5 = spu.X(parcel, i6);
                    } else if (c5 == 3) {
                        iN5 = spu.N(parcel, i6);
                    } else if (c5 != 4) {
                        spu.ae(parcel, i6);
                    } else {
                        jQ2 = spu.Q(parcel, i6);
                    }
                }
                spu.ac(parcel, iP6);
                return new Distance(iN4, strX5, iN5, jQ2);
            case 6:
                int iP7 = spu.P(parcel);
                int iN6 = 0;
                int iN7 = 0;
                while (parcel.dataPosition() < iP7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        iN = spu.N(parcel, i7);
                    } else if (c6 == 2) {
                        iN6 = spu.N(parcel, i7);
                    } else if (c6 != 3) {
                        spu.ae(parcel, i7);
                    } else {
                        iN7 = spu.N(parcel, i7);
                    }
                }
                spu.ac(parcel, iP7);
                return new EnergyAtDistance(iN, iN6, iN7);
            case 7:
                int iP8 = spu.P(parcel);
                while (parcel.dataPosition() < iP8) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        spu.ae(parcel, i8);
                    } else {
                        arrayListAb2 = spu.ab(parcel, i8, LaneDirection.CREATOR);
                    }
                }
                spu.ac(parcel, iP8);
                return new Lane(arrayListAb2);
            case 8:
                int iP9 = spu.P(parcel);
                boolean zAf = false;
                while (parcel.dataPosition() < iP9) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        iN = spu.N(parcel, i9);
                    } else if (c7 != 2) {
                        spu.ae(parcel, i9);
                    } else {
                        zAf = spu.af(parcel, i9);
                    }
                }
                spu.ac(parcel, iP9);
                return new LaneDirection(iN, zAf);
            case 9:
                int iP10 = spu.P(parcel);
                int iN8 = 0;
                int iN9 = 0;
                while (parcel.dataPosition() < iP10) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 1) {
                        iN = spu.N(parcel, i10);
                    } else if (c8 == 2) {
                        iN8 = spu.N(parcel, i10);
                    } else if (c8 != 3) {
                        spu.ae(parcel, i10);
                    } else {
                        iN9 = spu.N(parcel, i10);
                    }
                }
                spu.ac(parcel, iP10);
                return new Maneuver(iN, iN8, iN9);
            case 10:
                int iP11 = spu.P(parcel);
                ArrayList arrayListAb3 = null;
                String strX6 = null;
                while (parcel.dataPosition() < iP11) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 1) {
                        stepDistance = (StepDistance) spu.T(parcel, i11, StepDistance.CREATOR);
                    } else if (c9 == 2) {
                        arrayListAb3 = spu.ab(parcel, i11, DestinationDistance.CREATOR);
                    } else if (c9 != 3) {
                        spu.ae(parcel, i11);
                    } else {
                        strX6 = spu.X(parcel, i11);
                    }
                }
                spu.ac(parcel, iP11);
                return new NavigationCurrentPosition(stepDistance, arrayListAb3, strX6);
            case 11:
                int iP12 = spu.P(parcel);
                ArrayList arrayListAa = null;
                ArrayList arrayListAb4 = null;
                while (parcel.dataPosition() < iP12) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        arrayListAb = spu.ab(parcel, i12, NavigationStep.CREATOR);
                    } else if (c10 == 2) {
                        arrayListAa = spu.aa(parcel, i12);
                    } else if (c10 != 3) {
                        spu.ae(parcel, i12);
                    } else {
                        arrayListAb4 = spu.ab(parcel, i12, DestinationDetails.CREATOR);
                    }
                }
                spu.ac(parcel, iP12);
                return new NavigationState(arrayListAb, arrayListAa, arrayListAb4);
            case 12:
                int iP13 = spu.P(parcel);
                Maneuver maneuver = null;
                String strX7 = null;
                ArrayList arrayListAb5 = null;
                ArrayList arrayListAa2 = null;
                byte[] bArrAg = null;
                while (parcel.dataPosition() < iP13) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        maneuver = (Maneuver) spu.T(parcel, i13, Maneuver.CREATOR);
                    } else if (c11 == 2) {
                        strX7 = spu.X(parcel, i13);
                    } else if (c11 == 3) {
                        arrayListAb5 = spu.ab(parcel, i13, Lane.CREATOR);
                    } else if (c11 == 4) {
                        arrayListAa2 = spu.aa(parcel, i13);
                    } else if (c11 != 5) {
                        spu.ae(parcel, i13);
                    } else {
                        bArrAg = spu.ag(parcel, i13);
                    }
                }
                spu.ac(parcel, iP13);
                return new NavigationStep(maneuver, strX7, arrayListAb5, arrayListAa2, bArrAg);
            case 13:
                int iP14 = spu.P(parcel);
                int[] iArrAh2 = null;
                int[] iArrAh3 = null;
                while (parcel.dataPosition() < iP14) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        iArrAh = spu.ah(parcel, i14);
                    } else if (c12 == 2) {
                        iArrAh2 = spu.ah(parcel, i14);
                    } else if (c12 != 3) {
                        spu.ae(parcel, i14);
                    } else {
                        iArrAh3 = spu.ah(parcel, i14);
                    }
                }
                spu.ac(parcel, iP14);
                return new AdasRouteInfo.Path(iArrAh, iArrAh2, iArrAh3);
            case 14:
                int iP15 = spu.P(parcel);
                while (parcel.dataPosition() < iP15) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        distance = (Distance) spu.T(parcel, i15, Distance.CREATOR);
                    } else if (c13 != 2) {
                        spu.ae(parcel, i15);
                    } else {
                        jQ = spu.Q(parcel, i15);
                    }
                }
                spu.ac(parcel, iP15);
                return new StepDistance(distance, jQ);
            case 15:
                int iP16 = spu.P(parcel);
                ChargingStationDetails chargingStationDetails2 = null;
                while (parcel.dataPosition() < iP16) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        energyAtDistance = (EnergyAtDistance) spu.T(parcel, i16, EnergyAtDistance.CREATOR);
                    } else if (c14 != 2) {
                        spu.ae(parcel, i16);
                    } else {
                        chargingStationDetails2 = (ChargingStationDetails) spu.T(parcel, i16, ChargingStationDetails.CREATOR);
                    }
                }
                spu.ac(parcel, iP16);
                return new StopDetails(energyAtDistance, chargingStationDetails2);
            case 16:
                int iP17 = spu.P(parcel);
                AdasRouteInfo.Path path2 = null;
                while (parcel.dataPosition() < iP17) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 1) {
                        strX = spu.X(parcel, i17);
                    } else if (c15 == 2) {
                        iN = spu.N(parcel, i17);
                    } else if (c15 != 3) {
                        spu.ae(parcel, i17);
                    } else {
                        path2 = (AdasRouteInfo.Path) spu.T(parcel, i17, AdasRouteInfo.Path.CREATOR);
                    }
                }
                spu.ac(parcel, iP17);
                return new AdasRouteInfo.Trip(strX, iN, path2);
            case 17:
                int iP18 = spu.P(parcel);
                int iN10 = 0;
                EnergyAtDistance energyAtDistance2 = null;
                EnergyAtDistance energyAtDistance3 = null;
                ChargingStationDetails chargingStationDetails3 = null;
                ArrayList arrayListAb6 = null;
                ArrayList arrayListAb7 = null;
                while (parcel.dataPosition() < iP18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            energyAtDistance2 = (EnergyAtDistance) spu.T(parcel, i18, EnergyAtDistance.CREATOR);
                            break;
                        case 2:
                            energyAtDistance3 = (EnergyAtDistance) spu.T(parcel, i18, EnergyAtDistance.CREATOR);
                            break;
                        case 3:
                            iN10 = spu.N(parcel, i18);
                            break;
                        case 4:
                            chargingStationDetails3 = (ChargingStationDetails) spu.T(parcel, i18, ChargingStationDetails.CREATOR);
                            break;
                        case 5:
                            arrayListAb6 = spu.ab(parcel, i18, StopDetails.CREATOR);
                            break;
                        case 6:
                            arrayListAb7 = spu.ab(parcel, i18, DataAuthorization.CREATOR);
                            break;
                        default:
                            spu.ae(parcel, i18);
                            break;
                    }
                }
                spu.ac(parcel, iP18);
                return new VehicleEnergyForecast(energyAtDistance2, energyAtDistance3, iN10, chargingStationDetails3, arrayListAb6, arrayListAb7);
            case 18:
                return new AutoValue_Channel_FlattenedChannel(parcel.readInt(), parcel.readInt(), parcel.readInt(), rvz.valueOf(parcel.readString()));
            case 19:
                return new ChannelMessage(parcel.readInt(), (ByteBuffer) ruw.b(ByteBuffer.class, parcel.readStrongBinder()), parcel.readInt(), parcel.readByte() == 1, parcel.readByte() == 1, parcel.readByte() == 1, parcel.readByte() == 1, parcel.readInt(), parcel.readInt());
            default:
                return new ActivityResult(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ChargingStationDetails[i];
            case 1:
                return new AdasRouteInfo[i];
            case 2:
                return new DataAuthorization[i];
            case 3:
                return new DestinationDetails[i];
            case 4:
                return new DestinationDistance[i];
            case 5:
                return new Distance[i];
            case 6:
                return new EnergyAtDistance[i];
            case 7:
                return new Lane[i];
            case 8:
                return new LaneDirection[i];
            case 9:
                return new Maneuver[i];
            case 10:
                return new NavigationCurrentPosition[i];
            case 11:
                return new NavigationState[i];
            case 12:
                return new NavigationStep[i];
            case 13:
                return new AdasRouteInfo.Path[i];
            case 14:
                return new StepDistance[i];
            case 15:
                return new StopDetails[i];
            case 16:
                return new AdasRouteInfo.Trip[i];
            case 17:
                return new VehicleEnergyForecast[i];
            case 18:
                return new Channel.FlattenedChannel[i];
            case 19:
                return new ChannelMessage[i];
            default:
                return new ActivityResult[i];
        }
    }
}
