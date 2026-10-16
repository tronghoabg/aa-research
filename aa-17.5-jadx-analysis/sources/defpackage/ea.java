package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Surface;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.gms.car.ActivityLaunchInfo;
import com.google.android.gms.car.AnalyticsSessionInfo;
import com.google.android.gms.car.AudioFocusInfo;
import com.google.android.gms.car.CarActivityLayoutParams;
import com.google.android.gms.car.CarAudioConfiguration;
import com.google.android.gms.car.CarInstrumentClusterInfo;
import com.google.android.gms.car.CarSensorEvent;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.CarWindowSpec;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.DropShadowParams;
import com.google.android.gms.car.FlingStepRange;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.ProjectionWindowDragParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ea implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ea(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intent intent = null;
        Rect rect = null;
        String strX = null;
        int iN = 0;
        boolean zAf = false;
        int i = 0;
        int iN2 = 0;
        switch (this.a) {
            case 0:
                return new PlaybackStateCompat(parcel);
            case 1:
                return new MediaMetadataCompat(parcel);
            case 2:
                return new DefaultLazyKey(parcel.readInt());
            case 3:
                return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
            case 4:
                return new ParcelableSnapshotMutableIntState(parcel.readInt());
            case 5:
                return new ParcelableSnapshotMutableLongState(parcel.readLong());
            case 6:
                return new GhIcon(parcel);
            case 7:
                int iP = spu.P(parcel);
                CarRegionId carRegionId = null;
                while (parcel.dataPosition() < iP) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        intent = (Intent) spu.T(parcel, i2, Intent.CREATOR);
                    } else if (c != 2) {
                        spu.ae(parcel, i2);
                    } else {
                        carRegionId = (CarRegionId) spu.T(parcel, i2, CarRegionId.CREATOR);
                    }
                }
                spu.ac(parcel, iP);
                return new ActivityLaunchInfo(intent, carRegionId);
            case 8:
                return new AnalyticsSessionInfo(parcel);
            case 9:
                int iP2 = spu.P(parcel);
                AudioAttributes audioAttributes = null;
                String strX2 = null;
                String strX3 = null;
                int iN3 = 0;
                int iN4 = 0;
                int iN5 = 0;
                int iN6 = 0;
                while (parcel.dataPosition() < iP2) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            audioAttributes = (AudioAttributes) spu.T(parcel, i3, AudioAttributes.CREATOR);
                            break;
                        case 2:
                            iN3 = spu.N(parcel, i3);
                            break;
                        case 3:
                            strX2 = spu.X(parcel, i3);
                            break;
                        case 4:
                            strX3 = spu.X(parcel, i3);
                            break;
                        case 5:
                            iN4 = spu.N(parcel, i3);
                            break;
                        case 6:
                            iN5 = spu.N(parcel, i3);
                            break;
                        case 7:
                            iN6 = spu.N(parcel, i3);
                            break;
                        default:
                            spu.ae(parcel, i3);
                            break;
                    }
                }
                spu.ac(parcel, iP2);
                return new AudioFocusInfo(audioAttributes, iN3, strX2, strX3, iN4, iN5, iN6);
            case 10:
                int iP3 = spu.P(parcel);
                Rect rect2 = null;
                ArrayList arrayListAb = null;
                ProjectionWindowDecorationParams projectionWindowDecorationParams = null;
                ProjectionWindowAnimationParams projectionWindowAnimationParams = null;
                ProjectionWindowAnimationParams projectionWindowAnimationParams2 = null;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < iP3) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            spu.ad(parcel, i11, 4);
                            i4 = parcel.readInt();
                            break;
                        case 2:
                            spu.ad(parcel, i11, 4);
                            i5 = parcel.readInt();
                            break;
                        case 3:
                            spu.ad(parcel, i11, 4);
                            i6 = parcel.readInt();
                            break;
                        case 4:
                            spu.ad(parcel, i11, 4);
                            i7 = parcel.readInt();
                            break;
                        case 5:
                            spu.ad(parcel, i11, 4);
                            i8 = parcel.readInt();
                            break;
                        case 6:
                            rect2 = (Rect) spu.T(parcel, i11, Rect.CREATOR);
                            break;
                        case 7:
                            arrayListAb = spu.ab(parcel, i11, CarRegionId.CREATOR);
                            break;
                        case '\b':
                            projectionWindowDecorationParams = (ProjectionWindowDecorationParams) spu.T(parcel, i11, ProjectionWindowDecorationParams.CREATOR);
                            break;
                        case '\t':
                            projectionWindowAnimationParams = (ProjectionWindowAnimationParams) spu.T(parcel, i11, ProjectionWindowAnimationParams.CREATOR);
                            break;
                        case '\n':
                            projectionWindowAnimationParams2 = (ProjectionWindowAnimationParams) spu.T(parcel, i11, ProjectionWindowAnimationParams.CREATOR);
                            break;
                        case 11:
                            spu.ad(parcel, i11, 4);
                            i9 = parcel.readInt();
                            break;
                        case '\f':
                            spu.ad(parcel, i11, 4);
                            i10 = parcel.readInt();
                            break;
                        default:
                            spu.ae(parcel, i11);
                            break;
                    }
                }
                spu.ac(parcel, iP3);
                return new CarActivityLayoutParams(i4, i5, i6, i7, i8, rect2, arrayListAb, projectionWindowDecorationParams, projectionWindowAnimationParams, projectionWindowAnimationParams2, i9, i10);
            case 11:
                int iP4 = spu.P(parcel);
                int iN7 = 0;
                int iN8 = 0;
                while (parcel.dataPosition() < iP4) {
                    int i12 = parcel.readInt();
                    char c2 = (char) i12;
                    if (c2 == 1) {
                        iN = spu.N(parcel, i12);
                    } else if (c2 == 2) {
                        iN7 = spu.N(parcel, i12);
                    } else if (c2 != 3) {
                        spu.ae(parcel, i12);
                    } else {
                        iN8 = spu.N(parcel, i12);
                    }
                }
                spu.ac(parcel, iP4);
                return new CarAudioConfiguration(iN, iN7, iN8);
            case 12:
                int iP5 = spu.P(parcel);
                int iN9 = 0;
                int iN10 = 0;
                int iN11 = 0;
                int iN12 = 0;
                int iN13 = 0;
                while (parcel.dataPosition() < iP5) {
                    int i13 = parcel.readInt();
                    char c3 = (char) i13;
                    if (c3 == 1) {
                        iN9 = spu.N(parcel, i13);
                    } else if (c3 == 2) {
                        iN10 = spu.N(parcel, i13);
                    } else if (c3 == 3) {
                        iN11 = spu.N(parcel, i13);
                    } else if (c3 == 4) {
                        iN12 = spu.N(parcel, i13);
                    } else if (c3 != 5) {
                        spu.ae(parcel, i13);
                    } else {
                        iN13 = spu.N(parcel, i13);
                    }
                }
                spu.ac(parcel, iP5);
                return new CarInstrumentClusterInfo(iN9, iN10, iN11, iN12, iN13);
            case 13:
                int iP6 = spu.P(parcel);
                float[] fArr = null;
                byte[] bArrAg = null;
                int i14 = 0;
                int i15 = 0;
                long j = 0;
                while (parcel.dataPosition() < iP6) {
                    int i16 = parcel.readInt();
                    char c4 = (char) i16;
                    if (c4 == 1) {
                        spu.ad(parcel, i16, 4);
                        i15 = parcel.readInt();
                    } else if (c4 == 2) {
                        spu.ad(parcel, i16, 8);
                        j = parcel.readLong();
                    } else if (c4 == 3) {
                        int iO = spu.O(parcel, i16);
                        int iDataPosition = parcel.dataPosition();
                        if (iO == 0) {
                            fArr = null;
                        } else {
                            float[] fArrCreateFloatArray = parcel.createFloatArray();
                            parcel.setDataPosition(iDataPosition + iO);
                            fArr = fArrCreateFloatArray;
                        }
                    } else if (c4 == 4) {
                        bArrAg = spu.ag(parcel, i16);
                    } else if (c4 != 1000) {
                        spu.ae(parcel, i16);
                    } else {
                        spu.ad(parcel, i16, 4);
                        i14 = parcel.readInt();
                    }
                }
                spu.ac(parcel, iP6);
                return new CarSensorEvent(i14, i15, j, fArr, bArrAg);
            case 14:
                int iP7 = spu.P(parcel);
                int[] iArrAh = null;
                boolean zAf2 = false;
                boolean zAf3 = false;
                boolean zAf4 = false;
                boolean zAf5 = false;
                boolean zAf6 = false;
                int i17 = 0;
                boolean zAf7 = false;
                int i18 = 0;
                int i19 = 0;
                while (parcel.dataPosition() < iP7) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            zAf2 = spu.af(parcel, i20);
                            break;
                        case 2:
                            zAf3 = spu.af(parcel, i20);
                            break;
                        case 3:
                            zAf4 = spu.af(parcel, i20);
                            break;
                        case 4:
                            zAf5 = spu.af(parcel, i20);
                            break;
                        case 5:
                            iArrAh = spu.ah(parcel, i20);
                            break;
                        case 6:
                            zAf6 = spu.af(parcel, i20);
                            break;
                        case 7:
                            spu.ad(parcel, i20, 4);
                            i17 = parcel.readInt();
                            break;
                        case '\b':
                            zAf7 = spu.af(parcel, i20);
                            break;
                        case '\t':
                            spu.ad(parcel, i20, 4);
                            i18 = parcel.readInt();
                            break;
                        case '\n':
                            spu.ad(parcel, i20, 4);
                            i19 = parcel.readInt();
                            break;
                        default:
                            spu.ae(parcel, i20);
                            break;
                    }
                }
                spu.ac(parcel, iP7);
                return new CarUiInfo(zAf2, zAf3, zAf4, zAf5, iArrAh, zAf6, i17, zAf7, i18, i19);
            case 15:
                int iP8 = spu.P(parcel);
                while (parcel.dataPosition() < iP8) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        spu.ae(parcel, i21);
                    } else {
                        iN2 = spu.N(parcel, i21);
                    }
                }
                spu.ac(parcel, iP8);
                return new CarWindowManagerLayoutParams(iN2);
            case 16:
                int iP9 = spu.P(parcel);
                CarWindowLayoutParams carWindowLayoutParams = null;
                int i22 = 0;
                String strX4 = null;
                while (parcel.dataPosition() < iP9) {
                    int i23 = parcel.readInt();
                    char c5 = (char) i23;
                    if (c5 == 1) {
                        strX = spu.X(parcel, i23);
                    } else if (c5 == 2) {
                        strX4 = spu.X(parcel, i23);
                    } else if (c5 == 3) {
                        carWindowLayoutParams = (CarWindowLayoutParams) spu.T(parcel, i23, CarWindowLayoutParams.CREATOR);
                    } else if (c5 != 4) {
                        spu.ae(parcel, i23);
                    } else {
                        spu.ad(parcel, i23, 4);
                        i22 = parcel.readInt();
                    }
                }
                spu.ac(parcel, iP9);
                return new CarWindowSpec(strX, strX4, carWindowLayoutParams, i22);
            case 17:
                int iP10 = spu.P(parcel);
                int i24 = -1;
                Surface surface = null;
                Rect rect3 = null;
                Bundle bundleR = null;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (parcel.dataPosition() < iP10) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            spu.ad(parcel, i29, 4);
                            i25 = parcel.readInt();
                            break;
                        case 2:
                            spu.ad(parcel, i29, 4);
                            i26 = parcel.readInt();
                            break;
                        case 3:
                            spu.ad(parcel, i29, 4);
                            i27 = parcel.readInt();
                            break;
                        case 4:
                            surface = (Surface) spu.T(parcel, i29, Surface.CREATOR);
                            break;
                        case 5:
                            rect3 = (Rect) spu.T(parcel, i29, Rect.CREATOR);
                            break;
                        case 6:
                            spu.ad(parcel, i29, 4);
                            i28 = parcel.readInt();
                            break;
                        case 7:
                            spu.ad(parcel, i29, 4);
                            i24 = parcel.readInt();
                            break;
                        case '\b':
                            bundleR = spu.R(parcel, i29);
                            break;
                        default:
                            spu.ae(parcel, i29);
                            break;
                    }
                }
                spu.ac(parcel, iP10);
                return new DrawingSpec(i25, i26, i27, surface, rect3, i28, i24, bundleR);
            case 18:
                int iP11 = spu.P(parcel);
                int i30 = 0;
                while (parcel.dataPosition() < iP11) {
                    int i31 = parcel.readInt();
                    char c6 = (char) i31;
                    if (c6 == 1) {
                        spu.ad(parcel, i31, 4);
                        i = parcel.readInt();
                    } else if (c6 != 2) {
                        spu.ae(parcel, i31);
                    } else {
                        spu.ad(parcel, i31, 4);
                        i30 = parcel.readInt();
                    }
                }
                spu.ac(parcel, iP11);
                return new FlingStepRange(i, i30);
            case 19:
                int iP12 = spu.P(parcel);
                boolean zAf8 = false;
                int i32 = 0;
                while (parcel.dataPosition() < iP12) {
                    int i33 = parcel.readInt();
                    char c7 = (char) i33;
                    if (c7 == 1) {
                        zAf = spu.af(parcel, i33);
                    } else if (c7 == 2) {
                        zAf8 = spu.af(parcel, i33);
                    } else if (c7 == 3) {
                        spu.ad(parcel, i33, 4);
                        i32 = parcel.readInt();
                    } else if (c7 != 4) {
                        spu.ae(parcel, i33);
                    } else {
                        rect = (Rect) spu.T(parcel, i33, Rect.CREATOR);
                    }
                }
                spu.ac(parcel, iP12);
                return new InputFocusChangedEvent(zAf, zAf8, i32, rect);
            default:
                int iP13 = spu.P(parcel);
                DropShadowParams dropShadowParams = null;
                ProjectionWindowDragParams projectionWindowDragParams = null;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                int i40 = 0;
                boolean zAf9 = false;
                boolean zAf10 = false;
                int i41 = 0;
                while (parcel.dataPosition() < iP13) {
                    int i42 = parcel.readInt();
                    switch ((char) i42) {
                        case 1:
                            spu.ad(parcel, i42, 4);
                            i34 = parcel.readInt();
                            break;
                        case 2:
                            spu.ad(parcel, i42, 4);
                            i35 = parcel.readInt();
                            break;
                        case 3:
                            spu.ad(parcel, i42, 4);
                            i36 = parcel.readInt();
                            break;
                        case 4:
                            spu.ad(parcel, i42, 4);
                            i37 = parcel.readInt();
                            break;
                        case 5:
                            spu.ad(parcel, i42, 4);
                            i38 = parcel.readInt();
                            break;
                        case 6:
                            spu.ad(parcel, i42, 4);
                            i39 = parcel.readInt();
                            break;
                        case 7:
                            spu.ad(parcel, i42, 4);
                            i40 = parcel.readInt();
                            break;
                        case '\b':
                            zAf9 = spu.af(parcel, i42);
                            break;
                        case '\t':
                            zAf10 = spu.af(parcel, i42);
                            break;
                        case '\n':
                            spu.ad(parcel, i42, 4);
                            i41 = parcel.readInt();
                            break;
                        case 11:
                            dropShadowParams = (DropShadowParams) spu.T(parcel, i42, DropShadowParams.CREATOR);
                            break;
                        case '\f':
                            projectionWindowDragParams = (ProjectionWindowDragParams) spu.T(parcel, i42, ProjectionWindowDragParams.CREATOR);
                            break;
                        default:
                            spu.ae(parcel, i42);
                            break;
                    }
                }
                spu.ac(parcel, iP13);
                return new ProjectionWindowDecorationParams(i34, i35, i36, i37, i38, i39, i40, zAf9, zAf10, i41, dropShadowParams, projectionWindowDragParams);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new PlaybackStateCompat[i];
            case 1:
                return new MediaMetadataCompat[i];
            case 2:
                return new DefaultLazyKey[i];
            case 3:
                return new ParcelableSnapshotMutableFloatState[i];
            case 4:
                return new ParcelableSnapshotMutableIntState[i];
            case 5:
                return new ParcelableSnapshotMutableLongState[i];
            case 6:
                return new GhIcon[i];
            case 7:
                return new ActivityLaunchInfo[i];
            case 8:
                return new AnalyticsSessionInfo[i];
            case 9:
                return new AudioFocusInfo[i];
            case 10:
                return new CarActivityLayoutParams[i];
            case 11:
                return new CarAudioConfiguration[i];
            case 12:
                return new CarInstrumentClusterInfo[i];
            case 13:
                return new CarSensorEvent[i];
            case 14:
                return new CarUiInfo[i];
            case 15:
                return new CarWindowManagerLayoutParams[i];
            case 16:
                return new CarWindowSpec[i];
            case 17:
                return new DrawingSpec[i];
            case 18:
                return new FlingStepRange[i];
            case 19:
                return new InputFocusChangedEvent[i];
            default:
                return new ProjectionWindowDecorationParams[i];
        }
    }
}
