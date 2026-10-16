package defpackage;

import android.bluetooth.BluetoothDevice;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.AudioPolicyMixData;
import com.google.android.gms.car.CreateAudioPolicyRequest;
import com.google.android.gms.car.CreateAudioRecordRequest;
import com.google.android.gms.car.DropShadowParams;
import com.google.android.gms.car.ExceptionParcel;
import com.google.android.gms.car.FrameDebugInfo;
import com.google.android.gms.car.GestureDirection;
import com.google.android.gms.car.KeyEventCompleteData;
import com.google.android.gms.car.KillOptions;
import com.google.android.gms.car.MediaOptions;
import com.google.android.gms.car.RadioConfiguration;
import com.google.android.gms.car.RadioMetadata;
import com.google.android.gms.car.RadioProgramInfo;
import com.google.android.gms.car.RadioProgramSelector;
import com.google.android.gms.car.TouchEventCompleteData;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.bluetooth.data.AutoValue_CarBluetoothData;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackMetadata;
import com.google.android.gms.car.display.CarRegionId;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class qte implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public qte(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jQ = 0;
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        boolean zAf = false;
        boolean zAf2 = false;
        boolean zAf3 = false;
        boolean zAf4 = false;
        int iN5 = 0;
        AudioPolicyMixData[] audioPolicyMixDataArr = null;
        Rect rect = null;
        RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier = null;
        RadioProgramSelector radioProgramSelector = null;
        ArrayList arrayListAb = null;
        ArrayList arrayListY = null;
        String strX = null;
        Rect rect2 = null;
        switch (this.a) {
            case 0:
                int iP = spu.P(parcel);
                boolean zAf5 = false;
                int iN6 = 0;
                int iN7 = 0;
                int iN8 = 0;
                int iN9 = 0;
                int iN10 = 0;
                while (parcel.dataPosition() < iP) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            zAf5 = spu.af(parcel, i);
                            break;
                        case 2:
                            iN6 = spu.N(parcel, i);
                            break;
                        case 3:
                            iN7 = spu.N(parcel, i);
                            break;
                        case 4:
                            iN8 = spu.N(parcel, i);
                            break;
                        case 5:
                            iN9 = spu.N(parcel, i);
                            break;
                        case 6:
                            iN10 = spu.N(parcel, i);
                            break;
                        default:
                            spu.ae(parcel, i);
                            break;
                    }
                }
                spu.ac(parcel, iP);
                return new CreateAudioRecordRequest(zAf5, iN6, iN7, iN8, iN9, iN10);
            case 1:
                int iP2 = spu.P(parcel);
                while (parcel.dataPosition() < iP2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        spu.ae(parcel, i2);
                    } else {
                        audioPolicyMixDataArr = (AudioPolicyMixData[]) spu.ai(parcel, i2, AudioPolicyMixData.CREATOR);
                    }
                }
                spu.ac(parcel, iP2);
                return new CreateAudioPolicyRequest(audioPolicyMixDataArr);
            case 2:
                int iP3 = spu.P(parcel);
                int iN11 = 0;
                int iN12 = 0;
                int iN13 = 0;
                while (parcel.dataPosition() < iP3) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        iN = spu.N(parcel, i3);
                    } else if (c == 2) {
                        iN11 = spu.N(parcel, i3);
                    } else if (c == 3) {
                        iN12 = spu.N(parcel, i3);
                    } else if (c != 4) {
                        spu.ae(parcel, i3);
                    } else {
                        iN13 = spu.N(parcel, i3);
                    }
                }
                spu.ac(parcel, iP3);
                return new DropShadowParams(iN, iN11, iN12, iN13);
            case 3:
                try {
                    return new ExceptionParcel((Throwable) parcel.readSerializable());
                } catch (RuntimeException e) {
                    return new ExceptionParcel(e);
                }
            case 4:
                int iP4 = spu.P(parcel);
                long jQ2 = 0;
                long jQ3 = 0;
                long jQ4 = 0;
                long jQ5 = 0;
                long jQ6 = 0;
                while (parcel.dataPosition() < iP4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        jQ2 = spu.Q(parcel, i4);
                    } else if (c2 == 2) {
                        jQ3 = spu.Q(parcel, i4);
                    } else if (c2 == 3) {
                        jQ4 = spu.Q(parcel, i4);
                    } else if (c2 == 4) {
                        jQ5 = spu.Q(parcel, i4);
                    } else if (c2 != 5) {
                        spu.ae(parcel, i4);
                    } else {
                        jQ6 = spu.Q(parcel, i4);
                    }
                }
                spu.ac(parcel, iP4);
                return new FrameDebugInfo(jQ2, jQ3, jQ4, jQ5, jQ6);
            case 5:
                int iP5 = spu.P(parcel);
                while (parcel.dataPosition() < iP5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        spu.ae(parcel, i5);
                    } else {
                        iN5 = spu.N(parcel, i5);
                    }
                }
                spu.ac(parcel, iP5);
                return new GestureDirection(iN5);
            case 6:
                int iP6 = spu.P(parcel);
                while (parcel.dataPosition() < iP6) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        zAf4 = spu.af(parcel, i6);
                    } else if (c3 != 2) {
                        spu.ae(parcel, i6);
                    } else {
                        rect2 = (Rect) spu.T(parcel, i6, Rect.CREATOR);
                    }
                }
                spu.ac(parcel, iP6);
                return new KeyEventCompleteData(zAf4, rect2);
            case 7:
                int iP7 = spu.P(parcel);
                boolean zAf6 = false;
                String strX2 = null;
                while (parcel.dataPosition() < iP7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        strX = spu.X(parcel, i7);
                    } else if (c4 == 2) {
                        zAf3 = spu.af(parcel, i7);
                    } else if (c4 == 3) {
                        zAf6 = spu.af(parcel, i7);
                    } else if (c4 != 4) {
                        spu.ae(parcel, i7);
                    } else {
                        strX2 = spu.X(parcel, i7);
                    }
                }
                spu.ac(parcel, iP7);
                return new KillOptions(strX, zAf3, zAf6, strX2);
            case 8:
                int iP8 = spu.P(parcel);
                while (parcel.dataPosition() < iP8) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        spu.ae(parcel, i8);
                    } else {
                        zAf2 = spu.af(parcel, i8);
                    }
                }
                spu.ac(parcel, iP8);
                return new MediaOptions(zAf2);
            case 9:
                int iP9 = spu.P(parcel);
                boolean zAf7 = false;
                String strX3 = null;
                while (parcel.dataPosition() < iP9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        arrayListY = spu.Y(parcel, i9);
                    } else if (c5 == 2) {
                        zAf = spu.af(parcel, i9);
                    } else if (c5 == 3) {
                        strX3 = spu.X(parcel, i9);
                    } else if (c5 != 4) {
                        spu.ae(parcel, i9);
                    } else {
                        zAf7 = spu.af(parcel, i9);
                    }
                }
                spu.ac(parcel, iP9);
                return new RadioConfiguration.RadioBandGroup(arrayListY, zAf, strX3, zAf7);
            case 10:
                int iP10 = spu.P(parcel);
                while (parcel.dataPosition() < iP10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        spu.ae(parcel, i10);
                    } else {
                        arrayListAb = spu.ab(parcel, i10, RadioConfiguration.RadioBandGroup.CREATOR);
                    }
                }
                spu.ac(parcel, iP10);
                return new RadioConfiguration(arrayListAb);
            case 11:
                int iP11 = spu.P(parcel);
                int iN14 = 0;
                boolean zAf8 = false;
                boolean zAf9 = false;
                boolean zAf10 = false;
                String strX4 = null;
                String strX5 = null;
                String strX6 = null;
                RadioMetadata.RadioProgramType radioProgramType = null;
                Uri uri = null;
                RadioMetadata.RadioSongMetadata radioSongMetadata = null;
                String strX7 = null;
                String strX8 = null;
                Bitmap bitmap = null;
                String strX9 = null;
                while (parcel.dataPosition() < iP11) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            strX4 = spu.X(parcel, i11);
                            break;
                        case 2:
                            strX5 = spu.X(parcel, i11);
                            break;
                        case 3:
                            strX6 = spu.X(parcel, i11);
                            break;
                        case 4:
                            radioProgramType = (RadioMetadata.RadioProgramType) spu.T(parcel, i11, RadioMetadata.RadioProgramType.CREATOR);
                            break;
                        case 5:
                            uri = (Uri) spu.T(parcel, i11, Uri.CREATOR);
                            break;
                        case 6:
                            radioSongMetadata = (RadioMetadata.RadioSongMetadata) spu.T(parcel, i11, RadioMetadata.RadioSongMetadata.CREATOR);
                            break;
                        case 7:
                            strX7 = spu.X(parcel, i11);
                            break;
                        case '\b':
                            strX8 = spu.X(parcel, i11);
                            break;
                        case '\t':
                            bitmap = (Bitmap) spu.T(parcel, i11, Bitmap.CREATOR);
                            break;
                        case '\n':
                            iN14 = spu.N(parcel, i11);
                            break;
                        case 11:
                            zAf8 = spu.af(parcel, i11);
                            break;
                        case '\f':
                            zAf9 = spu.af(parcel, i11);
                            break;
                        case '\r':
                            strX9 = spu.X(parcel, i11);
                            break;
                        case 14:
                            zAf10 = spu.af(parcel, i11);
                            break;
                        default:
                            spu.ae(parcel, i11);
                            break;
                    }
                }
                spu.ac(parcel, iP11);
                return new RadioMetadata(strX4, strX5, strX6, radioProgramType, uri, radioSongMetadata, strX7, strX8, bitmap, iN14, zAf8, zAf9, strX9, zAf10);
            case 12:
                int iP12 = spu.P(parcel);
                while (parcel.dataPosition() < iP12) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        iN4 = spu.N(parcel, i12);
                    } else if (c6 != 2) {
                        spu.ae(parcel, i12);
                    } else {
                        jQ = spu.Q(parcel, i12);
                    }
                }
                spu.ac(parcel, iP12);
                return new RadioProgramSelector.RadioProgramIdentifier(iN4, jQ);
            case 13:
                int iP13 = spu.P(parcel);
                RadioMetadata radioMetadata = null;
                while (parcel.dataPosition() < iP13) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        radioProgramSelector = (RadioProgramSelector) spu.T(parcel, i13, RadioProgramSelector.CREATOR);
                    } else if (c7 != 2) {
                        spu.ae(parcel, i13);
                    } else {
                        radioMetadata = (RadioMetadata) spu.T(parcel, i13, RadioMetadata.CREATOR);
                    }
                }
                spu.ac(parcel, iP13);
                return new RadioProgramInfo(radioProgramSelector, radioMetadata);
            case 14:
                int iP14 = spu.P(parcel);
                ArrayList arrayListAb2 = null;
                while (parcel.dataPosition() < iP14) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 1) {
                        radioProgramIdentifier = (RadioProgramSelector.RadioProgramIdentifier) spu.T(parcel, i14, RadioProgramSelector.RadioProgramIdentifier.CREATOR);
                    } else if (c8 != 2) {
                        spu.ae(parcel, i14);
                    } else {
                        arrayListAb2 = spu.ab(parcel, i14, RadioProgramSelector.RadioProgramIdentifier.CREATOR);
                    }
                }
                spu.ac(parcel, iP14);
                return new RadioProgramSelector(radioProgramIdentifier, arrayListAb2);
            case 15:
                int iP15 = spu.P(parcel);
                int iN15 = 0;
                while (parcel.dataPosition() < iP15) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 1) {
                        iN3 = spu.N(parcel, i15);
                    } else if (c9 != 2) {
                        spu.ae(parcel, i15);
                    } else {
                        iN15 = spu.N(parcel, i15);
                    }
                }
                spu.ac(parcel, iP15);
                return new RadioMetadata.RadioProgramType(iN3, iN15);
            case 16:
                int iP16 = spu.P(parcel);
                long jQ7 = 0;
                String strX10 = null;
                String strX11 = null;
                String strX12 = null;
                String strX13 = null;
                Uri uri2 = null;
                Bitmap bitmap2 = null;
                while (parcel.dataPosition() < iP16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strX10 = spu.X(parcel, i16);
                            break;
                        case 2:
                            strX11 = spu.X(parcel, i16);
                            break;
                        case 3:
                            strX12 = spu.X(parcel, i16);
                            break;
                        case 4:
                            strX13 = spu.X(parcel, i16);
                            break;
                        case 5:
                            uri2 = (Uri) spu.T(parcel, i16, Uri.CREATOR);
                            break;
                        case 6:
                            jQ7 = spu.Q(parcel, i16);
                            break;
                        case 7:
                            bitmap2 = (Bitmap) spu.T(parcel, i16, Bitmap.CREATOR);
                            break;
                        default:
                            spu.ae(parcel, i16);
                            break;
                    }
                }
                spu.ac(parcel, iP16);
                return new RadioMetadata.RadioSongMetadata(strX10, strX11, strX12, strX13, uri2, jQ7, bitmap2);
            case 17:
                int iP17 = spu.P(parcel);
                int iN16 = 0;
                while (parcel.dataPosition() < iP17) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 1) {
                        iN2 = spu.N(parcel, i17);
                    } else if (c10 == 2) {
                        rect = (Rect) spu.T(parcel, i17, Rect.CREATOR);
                    } else if (c10 != 3) {
                        spu.ae(parcel, i17);
                    } else {
                        iN16 = spu.N(parcel, i17);
                    }
                }
                spu.ac(parcel, iP17);
                return new TouchEventCompleteData(iN2, rect, iN16);
            case 18:
                int iP18 = spu.P(parcel);
                boolean zAf11 = false;
                boolean zAf12 = false;
                ArrayList arrayListAb3 = null;
                ArrayList arrayListY2 = null;
                ArrayList arrayListAb4 = null;
                ArrayList arrayListAb5 = null;
                while (parcel.dataPosition() < iP18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            arrayListAb3 = spu.ab(parcel, i18, CarRegionId.CREATOR);
                            break;
                        case 2:
                            arrayListY2 = spu.Y(parcel, i18);
                            break;
                        case 3:
                            arrayListAb4 = spu.ab(parcel, i18, CarRegionId.CREATOR);
                            break;
                        case 4:
                            arrayListAb5 = spu.ab(parcel, i18, ProjectionWindowAnimationParams.CREATOR);
                            break;
                        case 5:
                            zAf11 = spu.af(parcel, i18);
                            break;
                        case 6:
                            zAf12 = spu.af(parcel, i18);
                            break;
                        default:
                            spu.ae(parcel, i18);
                            break;
                    }
                }
                spu.ac(parcel, iP18);
                return new ProjectionWindowAnimationChoreography(arrayListAb3, arrayListY2, arrayListAb4, arrayListAb5, zAf11, zAf12);
            case 19:
                return new AutoValue_CarBluetoothData((BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader()), parcel.readByte() != 0);
            default:
                int iP19 = spu.P(parcel);
                int iN17 = 0;
                String strX14 = null;
                String strX15 = null;
                String strX16 = null;
                byte[] bArrAg = null;
                while (parcel.dataPosition() < iP19) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        strX14 = spu.X(parcel, i19);
                    } else if (c11 == 2) {
                        strX15 = spu.X(parcel, i19);
                    } else if (c11 == 3) {
                        strX16 = spu.X(parcel, i19);
                    } else if (c11 == 4) {
                        bArrAg = spu.ag(parcel, i19);
                    } else if (c11 != 5) {
                        spu.ae(parcel, i19);
                    } else {
                        iN17 = spu.N(parcel, i19);
                    }
                }
                spu.ac(parcel, iP19);
                return new CarLocalMediaPlaybackMetadata(strX14, strX15, strX16, bArrAg, iN17);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new CreateAudioRecordRequest[i];
            case 1:
                return new CreateAudioPolicyRequest[i];
            case 2:
                return new DropShadowParams[i];
            case 3:
                return new ExceptionParcel[i];
            case 4:
                return new FrameDebugInfo[i];
            case 5:
                return new GestureDirection[i];
            case 6:
                return new KeyEventCompleteData[i];
            case 7:
                return new KillOptions[i];
            case 8:
                return new MediaOptions[i];
            case 9:
                return new RadioConfiguration.RadioBandGroup[i];
            case 10:
                return new RadioConfiguration[i];
            case 11:
                return new RadioMetadata[i];
            case 12:
                return new RadioProgramSelector.RadioProgramIdentifier[i];
            case 13:
                return new RadioProgramInfo[i];
            case 14:
                return new RadioProgramSelector[i];
            case 15:
                return new RadioMetadata.RadioProgramType[i];
            case 16:
                return new RadioMetadata.RadioSongMetadata[i];
            case 17:
                return new TouchEventCompleteData[i];
            case 18:
                return new ProjectionWindowAnimationChoreography[i];
            case 19:
                return new CarBluetoothData[i];
            default:
                return new CarLocalMediaPlaybackMetadata[i];
        }
    }
}
