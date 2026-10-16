package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.car.CarActivityLayoutParams;
import com.google.android.gms.car.FlingStepRange;
import com.google.android.gms.car.ProjectionWindowDragParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.diagnostics.ConnectionState;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayBlendedUiConfig;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarDisplayUiFeatures;
import com.google.android.gms.car.display.CarRegionGroup;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig;
import com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig;
import com.google.android.gms.carsetup.BinderParcel;
import com.google.android.gms.carsetup.setup.SetupBinder;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rcd implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rcd(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iN = 0;
        ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = null;
        String strX = null;
        ArrayList arrayListAb = null;
        CarDisplayId carDisplayId = null;
        ArrayList arrayListAb2 = null;
        CarDisplayId carDisplayId2 = null;
        CarDisplayId carDisplayId3 = null;
        switch (this.a) {
            case 0:
                int iP = spu.P(parcel);
                boolean zAf = false;
                int i = 0;
                while (parcel.dataPosition() < iP) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        spu.ad(parcel, i2, 4);
                        iN = parcel.readInt();
                    } else if (c == 2) {
                        zAf = spu.af(parcel, i2);
                    } else if (c == 3) {
                        projectionWindowAnimationChoreography = (ProjectionWindowAnimationChoreography) spu.T(parcel, i2, ProjectionWindowAnimationChoreography.CREATOR);
                    } else if (c != 4) {
                        spu.ae(parcel, i2);
                    } else {
                        spu.ad(parcel, i2, 4);
                        i = parcel.readInt();
                    }
                }
                spu.ac(parcel, iP);
                return new ProjectionWindowAnimationParams(iN, zAf, projectionWindowAnimationChoreography, i);
            case 1:
                int iP2 = spu.P(parcel);
                int i3 = 0;
                ArrayList arrayListY = null;
                IBinder iBinderS = null;
                ArrayList arrayListAb3 = null;
                ArrayList arrayListY2 = null;
                while (parcel.dataPosition() < iP2) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        spu.ad(parcel, i4, 4);
                        i3 = parcel.readInt();
                    } else if (c2 == 2) {
                        arrayListY = spu.Y(parcel, i4);
                    } else if (c2 == 3) {
                        iBinderS = spu.S(parcel, i4);
                    } else if (c2 == 4) {
                        arrayListAb3 = spu.ab(parcel, i4, FlingStepRange.CREATOR);
                    } else if (c2 != 5) {
                        spu.ae(parcel, i4);
                    } else {
                        arrayListY2 = spu.Y(parcel, i4);
                    }
                }
                spu.ac(parcel, iP2);
                return new ProjectionWindowDragParams(i3, arrayListY, iBinderS, arrayListAb3, arrayListY2);
            case 2:
                int iP3 = spu.P(parcel);
                long jQ = 0;
                long jQ2 = 0;
                int iN2 = 0;
                CriticalError criticalError = null;
                while (parcel.dataPosition() < iP3) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        jQ = spu.Q(parcel, i5);
                    } else if (c3 == 2) {
                        iN2 = spu.N(parcel, i5);
                    } else if (c3 == 3) {
                        criticalError = (CriticalError) spu.T(parcel, i5, CriticalError.CREATOR);
                    } else if (c3 != 4) {
                        spu.ae(parcel, i5);
                    } else {
                        jQ2 = spu.Q(parcel, i5);
                    }
                }
                spu.ac(parcel, iP3);
                return new ConnectionState(jQ, iN2, criticalError, jQ2);
            case 3:
                int iP4 = spu.P(parcel);
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                CarDisplayId carDisplayId4 = null;
                Point point = null;
                Rect rect = null;
                Rect rect2 = null;
                ArrayList arrayListAb4 = null;
                String strX2 = null;
                CarDisplayBlendedUiConfig carDisplayBlendedUiConfig = null;
                while (parcel.dataPosition() < iP4) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            carDisplayId4 = (CarDisplayId) spu.T(parcel, i9, CarDisplayId.CREATOR);
                            break;
                        case 2:
                            spu.ad(parcel, i9, 4);
                            i6 = parcel.readInt();
                            break;
                        case 3:
                            spu.ad(parcel, i9, 4);
                            i7 = parcel.readInt();
                            break;
                        case 4:
                            point = (Point) spu.T(parcel, i9, Point.CREATOR);
                            break;
                        case 5:
                            rect = (Rect) spu.T(parcel, i9, Rect.CREATOR);
                            break;
                        case 6:
                            spu.ad(parcel, i9, 4);
                            i8 = parcel.readInt();
                            break;
                        case 7:
                            strX2 = spu.X(parcel, i9);
                            break;
                        case '\b':
                            rect2 = (Rect) spu.T(parcel, i9, Rect.CREATOR);
                            break;
                        case '\t':
                            arrayListAb4 = spu.ab(parcel, i9, Rect.CREATOR);
                            break;
                        case '\n':
                            carDisplayBlendedUiConfig = (CarDisplayBlendedUiConfig) spu.T(parcel, i9, CarDisplayBlendedUiConfig.CREATOR);
                            break;
                        default:
                            spu.ae(parcel, i9);
                            break;
                    }
                }
                spu.ac(parcel, iP4);
                return new CarDisplay(carDisplayId4, i6, i7, point, rect, rect2, arrayListAb4, i8, strX2, carDisplayBlendedUiConfig);
            case 4:
                int iP5 = spu.P(parcel);
                while (parcel.dataPosition() < iP5) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        spu.ae(parcel, i10);
                    } else {
                        spu.ad(parcel, i10, 4);
                        iN = parcel.readInt();
                    }
                }
                spu.ac(parcel, iP5);
                return new CarDisplayId(iN);
            case 5:
                int iP6 = spu.P(parcel);
                int iN3 = 0;
                while (parcel.dataPosition() < iP6) {
                    int i11 = parcel.readInt();
                    char c4 = (char) i11;
                    if (c4 == 1) {
                        iN = spu.N(parcel, i11);
                    } else if (c4 != 2) {
                        spu.ae(parcel, i11);
                    } else {
                        iN3 = spu.N(parcel, i11);
                    }
                }
                spu.ac(parcel, iP6);
                return new CarDisplayUiFeatures(iN, iN3);
            case 6:
                int iP7 = spu.P(parcel);
                CarRegionId carRegionId = null;
                while (parcel.dataPosition() < iP7) {
                    int i12 = parcel.readInt();
                    char c5 = (char) i12;
                    if (c5 == 1) {
                        spu.ad(parcel, i12, 4);
                        iN = parcel.readInt();
                    } else if (c5 == 2) {
                        carDisplayId3 = (CarDisplayId) spu.T(parcel, i12, CarDisplayId.CREATOR);
                    } else if (c5 != 3) {
                        spu.ae(parcel, i12);
                    } else {
                        carRegionId = (CarRegionId) spu.T(parcel, i12, CarRegionId.CREATOR);
                    }
                }
                spu.ac(parcel, iP7);
                return new CarRegionGroup(iN, carDisplayId3, carRegionId);
            case 7:
                int iP8 = spu.P(parcel);
                while (parcel.dataPosition() < iP8) {
                    int i13 = parcel.readInt();
                    char c6 = (char) i13;
                    if (c6 == 1) {
                        spu.ad(parcel, i13, 4);
                        iN = parcel.readInt();
                    } else if (c6 != 2) {
                        spu.ae(parcel, i13);
                    } else {
                        carDisplayId2 = (CarDisplayId) spu.T(parcel, i13, CarDisplayId.CREATOR);
                    }
                }
                spu.ac(parcel, iP8);
                return new CarRegionId(iN, carDisplayId2);
            case 8:
                int iP9 = spu.P(parcel);
                while (parcel.dataPosition() < iP9) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        spu.ae(parcel, i14);
                    } else {
                        arrayListAb2 = spu.ab(parcel, i14, CarDisplayLayoutConfig.CREATOR);
                    }
                }
                spu.ac(parcel, iP9);
                return new CarActivityLayoutConfig(arrayListAb2);
            case 9:
                int iP10 = spu.P(parcel);
                Intent intent = null;
                Intent intent2 = null;
                CarRegionId carRegionId2 = null;
                CarActivityLayoutParams carActivityLayoutParams = null;
                CarRegionGroup carRegionGroup = null;
                ArrayList arrayListAb5 = null;
                while (parcel.dataPosition() < iP10) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            intent = (Intent) spu.T(parcel, i15, Intent.CREATOR);
                            break;
                        case 2:
                            intent2 = (Intent) spu.T(parcel, i15, Intent.CREATOR);
                            break;
                        case 3:
                            carRegionId2 = (CarRegionId) spu.T(parcel, i15, CarRegionId.CREATOR);
                            break;
                        case 4:
                            carActivityLayoutParams = (CarActivityLayoutParams) spu.T(parcel, i15, CarActivityLayoutParams.CREATOR);
                            break;
                        case 5:
                            carRegionGroup = (CarRegionGroup) spu.T(parcel, i15, CarRegionGroup.CREATOR);
                            break;
                        case 6:
                            arrayListAb5 = spu.ab(parcel, i15, ComponentName.CREATOR);
                            break;
                        default:
                            spu.ae(parcel, i15);
                            break;
                    }
                }
                spu.ac(parcel, iP10);
                return new CarActivityRegionLayoutConfig(intent, intent2, carRegionId2, carActivityLayoutParams, carRegionGroup, arrayListAb5);
            case 10:
                int iP11 = spu.P(parcel);
                ArrayList arrayListAb6 = null;
                String strX3 = null;
                ArrayList arrayListAb7 = null;
                while (parcel.dataPosition() < iP11) {
                    int i16 = parcel.readInt();
                    char c7 = (char) i16;
                    if (c7 == 1) {
                        carDisplayId = (CarDisplayId) spu.T(parcel, i16, CarDisplayId.CREATOR);
                    } else if (c7 == 2) {
                        arrayListAb6 = spu.ab(parcel, i16, CarActivityRegionLayoutConfig.CREATOR);
                    } else if (c7 == 3) {
                        strX3 = spu.X(parcel, i16);
                    } else if (c7 != 4) {
                        spu.ae(parcel, i16);
                    } else {
                        arrayListAb7 = spu.ab(parcel, i16, CarRegionId.CREATOR);
                    }
                }
                spu.ac(parcel, iP11);
                return new CarDisplayLayoutConfig(carDisplayId, arrayListAb6, strX3, arrayListAb7);
            case 11:
                return new BinderParcel(parcel.readStrongBinder());
            case 12:
                IBinder strongBinder = parcel.readStrongBinder();
                return strongBinder instanceof SetupBinder ? (SetupBinder) strongBinder : new SetupBinder();
            case 13:
                UsbConnectionHelper.TrackedParcelFileDescriptor.h.getClass();
                UsbConnectionHelper.TrackedParcelFileDescriptor trackedParcelFileDescriptor = new UsbConnectionHelper.TrackedParcelFileDescriptor((ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0);
                ols.M(UsbConnectionHelper.TrackedParcelFileDescriptor.h, yxi.USB_FD_CREATED_FROM_PARCEL);
                UsbConnectionHelper.TrackedParcelFileDescriptor.a.add(trackedParcelFileDescriptor);
                return trackedParcelFileDescriptor;
            case 14:
                int iP12 = spu.P(parcel);
                while (parcel.dataPosition() < iP12) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        spu.ae(parcel, i17);
                    } else {
                        arrayListAb = spu.ab(parcel, i17, LogErrorParcelable.CREATOR);
                    }
                }
                spu.ac(parcel, iP12);
                return new BatchedLogErrorParcelable(arrayListAb);
            case 15:
                int iP13 = spu.P(parcel);
                int iN4 = 0;
                while (parcel.dataPosition() < iP13) {
                    int i18 = parcel.readInt();
                    char c8 = (char) i18;
                    if (c8 == 1) {
                        strX = spu.X(parcel, i18);
                    } else if (c8 == 2) {
                        iN = spu.N(parcel, i18);
                    } else if (c8 != 3) {
                        spu.ae(parcel, i18);
                    } else {
                        iN4 = spu.N(parcel, i18);
                    }
                }
                spu.ac(parcel, iP13);
                return new LogErrorParcelable(strX, iN, iN4);
            case 16:
                int iP14 = spu.P(parcel);
                boolean zAf2 = true;
                int iN5 = 0;
                int iN6 = 0;
                boolean zAf3 = false;
                int iN7 = 0;
                boolean zAf4 = false;
                int iN8 = 0;
                String strX4 = null;
                String strX5 = null;
                String strX6 = null;
                Integer numV = null;
                while (parcel.dataPosition() < iP14) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            strX4 = spu.X(parcel, i19);
                            break;
                        case 3:
                            iN5 = spu.N(parcel, i19);
                            break;
                        case 4:
                            iN6 = spu.N(parcel, i19);
                            break;
                        case 5:
                            strX5 = spu.X(parcel, i19);
                            break;
                        case 6:
                        default:
                            spu.ae(parcel, i19);
                            break;
                        case 7:
                            zAf2 = spu.af(parcel, i19);
                            break;
                        case '\b':
                            strX6 = spu.X(parcel, i19);
                            break;
                        case '\t':
                            zAf3 = spu.af(parcel, i19);
                            break;
                        case '\n':
                            iN7 = spu.N(parcel, i19);
                            break;
                        case 11:
                            numV = spu.V(parcel, i19);
                            break;
                        case '\f':
                            zAf4 = spu.af(parcel, i19);
                            break;
                        case '\r':
                            iN8 = spu.N(parcel, i19);
                            break;
                    }
                }
                spu.ac(parcel, iP14);
                return new PlayLoggerContext(strX4, iN5, iN6, strX5, zAf2, strX6, zAf3, iN7, numV, zAf4, iN8);
            case 17:
                int iP15 = spu.P(parcel);
                int iN9 = 0;
                int iN10 = 0;
                PendingIntent pendingIntent = null;
                String strX7 = null;
                Integer numV2 = null;
                while (parcel.dataPosition() < iP15) {
                    int i20 = parcel.readInt();
                    char c9 = (char) i20;
                    if (c9 == 1) {
                        iN9 = spu.N(parcel, i20);
                    } else if (c9 == 2) {
                        iN10 = spu.N(parcel, i20);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) spu.T(parcel, i20, PendingIntent.CREATOR);
                    } else if (c9 == 4) {
                        strX7 = spu.X(parcel, i20);
                    } else if (c9 != 5) {
                        spu.ae(parcel, i20);
                    } else {
                        numV2 = spu.V(parcel, i20);
                    }
                }
                spu.ac(parcel, iP15);
                return new ConnectionResult(iN9, iN10, pendingIntent, strX7, numV2);
            case 18:
                int iP16 = spu.P(parcel);
                long j = -1;
                int i21 = 0;
                boolean zAf5 = false;
                String strX8 = null;
                while (parcel.dataPosition() < iP16) {
                    int i22 = parcel.readInt();
                    char c10 = (char) i22;
                    if (c10 == 1) {
                        strX8 = spu.X(parcel, i22);
                    } else if (c10 == 2) {
                        spu.ad(parcel, i22, 4);
                        i21 = parcel.readInt();
                    } else if (c10 == 3) {
                        spu.ad(parcel, i22, 8);
                        j = parcel.readLong();
                    } else if (c10 != 4) {
                        spu.ae(parcel, i22);
                    } else {
                        zAf5 = spu.af(parcel, i22);
                    }
                }
                spu.ac(parcel, iP16);
                return new Feature(strX8, i21, j, zAf5);
            case 19:
                int iP17 = spu.P(parcel);
                boolean zAf6 = false;
                boolean zAf7 = false;
                boolean zAf8 = false;
                boolean zAf9 = false;
                boolean zAf10 = false;
                String strX9 = null;
                IBinder iBinderS2 = null;
                while (parcel.dataPosition() < iP17) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            strX9 = spu.X(parcel, i23);
                            break;
                        case 2:
                            zAf6 = spu.af(parcel, i23);
                            break;
                        case 3:
                            zAf7 = spu.af(parcel, i23);
                            break;
                        case 4:
                            iBinderS2 = spu.S(parcel, i23);
                            break;
                        case 5:
                            zAf8 = spu.af(parcel, i23);
                            break;
                        case 6:
                            zAf9 = spu.af(parcel, i23);
                            break;
                        case 7:
                        default:
                            spu.ae(parcel, i23);
                            break;
                        case '\b':
                            zAf10 = spu.af(parcel, i23);
                            break;
                    }
                }
                spu.ac(parcel, iP17);
                return new GoogleCertificatesLookupQuery(strX9, zAf6, zAf7, iBinderS2, zAf8, zAf9, zAf10);
            default:
                int iP18 = spu.P(parcel);
                long j2 = -1;
                boolean zAf11 = false;
                int i24 = 0;
                int i25 = 0;
                String strX10 = null;
                while (parcel.dataPosition() < iP18) {
                    int i26 = parcel.readInt();
                    char c11 = (char) i26;
                    if (c11 == 1) {
                        zAf11 = spu.af(parcel, i26);
                    } else if (c11 == 2) {
                        strX10 = spu.X(parcel, i26);
                    } else if (c11 == 3) {
                        spu.ad(parcel, i26, 4);
                        i24 = parcel.readInt();
                    } else if (c11 == 4) {
                        spu.ad(parcel, i26, 4);
                        i25 = parcel.readInt();
                    } else if (c11 != 5) {
                        spu.ae(parcel, i26);
                    } else {
                        spu.ad(parcel, i26, 8);
                        j2 = parcel.readLong();
                    }
                }
                spu.ac(parcel, iP18);
                return new GoogleCertificatesLookupResponse(zAf11, strX10, i24, i25, j2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ProjectionWindowAnimationParams[i];
            case 1:
                return new ProjectionWindowDragParams[i];
            case 2:
                return new ConnectionState[i];
            case 3:
                return new CarDisplay[i];
            case 4:
                return new CarDisplayId[i];
            case 5:
                return new CarDisplayUiFeatures[i];
            case 6:
                return new CarRegionGroup[i];
            case 7:
                return new CarRegionId[i];
            case 8:
                return new CarActivityLayoutConfig[i];
            case 9:
                return new CarActivityRegionLayoutConfig[i];
            case 10:
                return new CarDisplayLayoutConfig[i];
            case 11:
                return new BinderParcel[i];
            case 12:
                return new SetupBinder[i];
            case 13:
                return new UsbConnectionHelper.TrackedParcelFileDescriptor[i];
            case 14:
                return new BatchedLogErrorParcelable[i];
            case 15:
                return new LogErrorParcelable[i];
            case 16:
                return new PlayLoggerContext[i];
            case 17:
                return new ConnectionResult[i];
            case 18:
                return new Feature[i];
            case 19:
                return new GoogleCertificatesLookupQuery[i];
            default:
                return new GoogleCertificatesLookupResponse[i];
        }
    }
}
