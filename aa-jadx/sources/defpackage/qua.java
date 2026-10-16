package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qua implements android.os.Parcelable.Creator {
    private final /* synthetic */ int a;

    public qua(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        long jU = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        boolean zAj = false;
        boolean zAj2 = false;
        boolean zAj3 = false;
        boolean zAj4 = false;
        int iR5 = 0;
        com.google.android.gms.car.AudioPolicyMixData[] audioPolicyMixDataArr = null;
        android.graphics.Rect rect = null;
        com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier = null;
        com.google.android.gms.car.RadioProgramSelector radioProgramSelector = null;
        java.util.ArrayList arrayListAf = null;
        java.util.ArrayList arrayListAc = null;
        java.lang.String strAb = null;
        android.graphics.Rect rect2 = null;
        switch (this.a) {
            case 0:
                int iT = defpackage.sqs.T(parcel);
                boolean zAj5 = false;
                int iR6 = 0;
                int iR7 = 0;
                int iR8 = 0;
                int iR9 = 0;
                int iR10 = 0;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            zAj5 = defpackage.sqs.aj(parcel, i);
                            break;
                        case 2:
                            iR6 = defpackage.sqs.R(parcel, i);
                            break;
                        case 3:
                            iR7 = defpackage.sqs.R(parcel, i);
                            break;
                        case 4:
                            iR8 = defpackage.sqs.R(parcel, i);
                            break;
                        case 5:
                            iR9 = defpackage.sqs.R(parcel, i);
                            break;
                        case 6:
                            iR10 = defpackage.sqs.R(parcel, i);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT);
                return new com.google.android.gms.car.CreateAudioRecordRequest(zAj5, iR6, iR7, iR8, iR9, iR10);
            case 1:
                int iT2 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        defpackage.sqs.ai(parcel, i2);
                    } else {
                        audioPolicyMixDataArr = (com.google.android.gms.car.AudioPolicyMixData[]) defpackage.sqs.am(parcel, i2, com.google.android.gms.car.AudioPolicyMixData.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT2);
                return new com.google.android.gms.car.CreateAudioPolicyRequest(audioPolicyMixDataArr);
            case 2:
                int iT3 = defpackage.sqs.T(parcel);
                int iR11 = 0;
                int iR12 = 0;
                int iR13 = 0;
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        iR = defpackage.sqs.R(parcel, i3);
                    } else if (c == 2) {
                        iR11 = defpackage.sqs.R(parcel, i3);
                    } else if (c == 3) {
                        iR12 = defpackage.sqs.R(parcel, i3);
                    } else if (c != 4) {
                        defpackage.sqs.ai(parcel, i3);
                    } else {
                        iR13 = defpackage.sqs.R(parcel, i3);
                    }
                }
                defpackage.sqs.ag(parcel, iT3);
                return new com.google.android.gms.car.DropShadowParams(iR, iR11, iR12, iR13);
            case 3:
                try {
                    return new com.google.android.gms.car.ExceptionParcel((java.lang.Throwable) parcel.readSerializable());
                } catch (java.lang.RuntimeException e) {
                    return new com.google.android.gms.car.ExceptionParcel(e);
                }
            case 4:
                int iT4 = defpackage.sqs.T(parcel);
                long jU2 = 0;
                long jU3 = 0;
                long jU4 = 0;
                long jU5 = 0;
                long jU6 = 0;
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        jU2 = defpackage.sqs.U(parcel, i4);
                    } else if (c2 == 2) {
                        jU3 = defpackage.sqs.U(parcel, i4);
                    } else if (c2 == 3) {
                        jU4 = defpackage.sqs.U(parcel, i4);
                    } else if (c2 == 4) {
                        jU5 = defpackage.sqs.U(parcel, i4);
                    } else if (c2 != 5) {
                        defpackage.sqs.ai(parcel, i4);
                    } else {
                        jU6 = defpackage.sqs.U(parcel, i4);
                    }
                }
                defpackage.sqs.ag(parcel, iT4);
                return new com.google.android.gms.car.FrameDebugInfo(jU2, jU3, jU4, jU5, jU6);
            case 5:
                int iT5 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        defpackage.sqs.ai(parcel, i5);
                    } else {
                        iR5 = defpackage.sqs.R(parcel, i5);
                    }
                }
                defpackage.sqs.ag(parcel, iT5);
                return new com.google.android.gms.car.GestureDirection(iR5);
            case 6:
                int iT6 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        zAj4 = defpackage.sqs.aj(parcel, i6);
                    } else if (c3 != 2) {
                        defpackage.sqs.ai(parcel, i6);
                    } else {
                        rect2 = (android.graphics.Rect) defpackage.sqs.X(parcel, i6, android.graphics.Rect.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT6);
                return new com.google.android.gms.car.KeyEventCompleteData(zAj4, rect2);
            case 7:
                int iT7 = defpackage.sqs.T(parcel);
                boolean zAj6 = false;
                java.lang.String strAb2 = null;
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        strAb = defpackage.sqs.ab(parcel, i7);
                    } else if (c4 == 2) {
                        zAj3 = defpackage.sqs.aj(parcel, i7);
                    } else if (c4 == 3) {
                        zAj6 = defpackage.sqs.aj(parcel, i7);
                    } else if (c4 != 4) {
                        defpackage.sqs.ai(parcel, i7);
                    } else {
                        strAb2 = defpackage.sqs.ab(parcel, i7);
                    }
                }
                defpackage.sqs.ag(parcel, iT7);
                return new com.google.android.gms.car.KillOptions(strAb, zAj3, zAj6, strAb2);
            case 8:
                int iT8 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        defpackage.sqs.ai(parcel, i8);
                    } else {
                        zAj2 = defpackage.sqs.aj(parcel, i8);
                    }
                }
                defpackage.sqs.ag(parcel, iT8);
                return new com.google.android.gms.car.MediaOptions(zAj2);
            case 9:
                int iT9 = defpackage.sqs.T(parcel);
                boolean zAj7 = false;
                java.lang.String strAb3 = null;
                while (parcel.dataPosition() < iT9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        arrayListAc = defpackage.sqs.ac(parcel, i9);
                    } else if (c5 == 2) {
                        zAj = defpackage.sqs.aj(parcel, i9);
                    } else if (c5 == 3) {
                        strAb3 = defpackage.sqs.ab(parcel, i9);
                    } else if (c5 != 4) {
                        defpackage.sqs.ai(parcel, i9);
                    } else {
                        zAj7 = defpackage.sqs.aj(parcel, i9);
                    }
                }
                defpackage.sqs.ag(parcel, iT9);
                return new com.google.android.gms.car.RadioConfiguration.RadioBandGroup(arrayListAc, zAj, strAb3, zAj7);
            case 10:
                int iT10 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        defpackage.sqs.ai(parcel, i10);
                    } else {
                        arrayListAf = defpackage.sqs.af(parcel, i10, com.google.android.gms.car.RadioConfiguration.RadioBandGroup.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT10);
                return new com.google.android.gms.car.RadioConfiguration(arrayListAf);
            case 11:
                int iT11 = defpackage.sqs.T(parcel);
                int iR14 = 0;
                boolean zAj8 = false;
                boolean zAj9 = false;
                boolean zAj10 = false;
                java.lang.String strAb4 = null;
                java.lang.String strAb5 = null;
                java.lang.String strAb6 = null;
                com.google.android.gms.car.RadioMetadata.RadioProgramType radioProgramType = null;
                android.net.Uri uri = null;
                com.google.android.gms.car.RadioMetadata.RadioSongMetadata radioSongMetadata = null;
                java.lang.String strAb7 = null;
                java.lang.String strAb8 = null;
                android.graphics.Bitmap bitmap = null;
                java.lang.String strAb9 = null;
                while (parcel.dataPosition() < iT11) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            strAb4 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case 2:
                            strAb5 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case 3:
                            strAb6 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case 4:
                            radioProgramType = (com.google.android.gms.car.RadioMetadata.RadioProgramType) defpackage.sqs.X(parcel, i11, com.google.android.gms.car.RadioMetadata.RadioProgramType.CREATOR);
                            break;
                        case 5:
                            uri = (android.net.Uri) defpackage.sqs.X(parcel, i11, android.net.Uri.CREATOR);
                            break;
                        case 6:
                            radioSongMetadata = (com.google.android.gms.car.RadioMetadata.RadioSongMetadata) defpackage.sqs.X(parcel, i11, com.google.android.gms.car.RadioMetadata.RadioSongMetadata.CREATOR);
                            break;
                        case 7:
                            strAb7 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case '\b':
                            strAb8 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case '\t':
                            bitmap = (android.graphics.Bitmap) defpackage.sqs.X(parcel, i11, android.graphics.Bitmap.CREATOR);
                            break;
                        case '\n':
                            iR14 = defpackage.sqs.R(parcel, i11);
                            break;
                        case 11:
                            zAj8 = defpackage.sqs.aj(parcel, i11);
                            break;
                        case '\f':
                            zAj9 = defpackage.sqs.aj(parcel, i11);
                            break;
                        case '\r':
                            strAb9 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case 14:
                            zAj10 = defpackage.sqs.aj(parcel, i11);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i11);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT11);
                return new com.google.android.gms.car.RadioMetadata(strAb4, strAb5, strAb6, radioProgramType, uri, radioSongMetadata, strAb7, strAb8, bitmap, iR14, zAj8, zAj9, strAb9, zAj10);
            case 12:
                int iT12 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT12) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        iR4 = defpackage.sqs.R(parcel, i12);
                    } else if (c6 != 2) {
                        defpackage.sqs.ai(parcel, i12);
                    } else {
                        jU = defpackage.sqs.U(parcel, i12);
                    }
                }
                defpackage.sqs.ag(parcel, iT12);
                return new com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier(iR4, jU);
            case 13:
                int iT13 = defpackage.sqs.T(parcel);
                com.google.android.gms.car.RadioMetadata radioMetadata = null;
                while (parcel.dataPosition() < iT13) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        radioProgramSelector = (com.google.android.gms.car.RadioProgramSelector) defpackage.sqs.X(parcel, i13, com.google.android.gms.car.RadioProgramSelector.CREATOR);
                    } else if (c7 != 2) {
                        defpackage.sqs.ai(parcel, i13);
                    } else {
                        radioMetadata = (com.google.android.gms.car.RadioMetadata) defpackage.sqs.X(parcel, i13, com.google.android.gms.car.RadioMetadata.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT13);
                return new com.google.android.gms.car.RadioProgramInfo(radioProgramSelector, radioMetadata);
            case 14:
                int iT14 = defpackage.sqs.T(parcel);
                java.util.ArrayList arrayListAf2 = null;
                while (parcel.dataPosition() < iT14) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 1) {
                        radioProgramIdentifier = (com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier) defpackage.sqs.X(parcel, i14, com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier.CREATOR);
                    } else if (c8 != 2) {
                        defpackage.sqs.ai(parcel, i14);
                    } else {
                        arrayListAf2 = defpackage.sqs.af(parcel, i14, com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT14);
                return new com.google.android.gms.car.RadioProgramSelector(radioProgramIdentifier, arrayListAf2);
            case 15:
                int iT15 = defpackage.sqs.T(parcel);
                int iR15 = 0;
                while (parcel.dataPosition() < iT15) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 1) {
                        iR3 = defpackage.sqs.R(parcel, i15);
                    } else if (c9 != 2) {
                        defpackage.sqs.ai(parcel, i15);
                    } else {
                        iR15 = defpackage.sqs.R(parcel, i15);
                    }
                }
                defpackage.sqs.ag(parcel, iT15);
                return new com.google.android.gms.car.RadioMetadata.RadioProgramType(iR3, iR15);
            case 16:
                int iT16 = defpackage.sqs.T(parcel);
                long jU7 = 0;
                java.lang.String strAb10 = null;
                java.lang.String strAb11 = null;
                java.lang.String strAb12 = null;
                java.lang.String strAb13 = null;
                android.net.Uri uri2 = null;
                android.graphics.Bitmap bitmap2 = null;
                while (parcel.dataPosition() < iT16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strAb10 = defpackage.sqs.ab(parcel, i16);
                            break;
                        case 2:
                            strAb11 = defpackage.sqs.ab(parcel, i16);
                            break;
                        case 3:
                            strAb12 = defpackage.sqs.ab(parcel, i16);
                            break;
                        case 4:
                            strAb13 = defpackage.sqs.ab(parcel, i16);
                            break;
                        case 5:
                            uri2 = (android.net.Uri) defpackage.sqs.X(parcel, i16, android.net.Uri.CREATOR);
                            break;
                        case 6:
                            jU7 = defpackage.sqs.U(parcel, i16);
                            break;
                        case 7:
                            bitmap2 = (android.graphics.Bitmap) defpackage.sqs.X(parcel, i16, android.graphics.Bitmap.CREATOR);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i16);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT16);
                return new com.google.android.gms.car.RadioMetadata.RadioSongMetadata(strAb10, strAb11, strAb12, strAb13, uri2, jU7, bitmap2);
            case 17:
                int iT17 = defpackage.sqs.T(parcel);
                int iR16 = 0;
                while (parcel.dataPosition() < iT17) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 1) {
                        iR2 = defpackage.sqs.R(parcel, i17);
                    } else if (c10 == 2) {
                        rect = (android.graphics.Rect) defpackage.sqs.X(parcel, i17, android.graphics.Rect.CREATOR);
                    } else if (c10 != 3) {
                        defpackage.sqs.ai(parcel, i17);
                    } else {
                        iR16 = defpackage.sqs.R(parcel, i17);
                    }
                }
                defpackage.sqs.ag(parcel, iT17);
                return new com.google.android.gms.car.TouchEventCompleteData(iR2, rect, iR16);
            case 18:
                int iT18 = defpackage.sqs.T(parcel);
                boolean zAj11 = false;
                boolean zAj12 = false;
                java.util.ArrayList arrayListAf3 = null;
                java.util.ArrayList arrayListAc2 = null;
                java.util.ArrayList arrayListAf4 = null;
                java.util.ArrayList arrayListAf5 = null;
                while (parcel.dataPosition() < iT18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            arrayListAf3 = defpackage.sqs.af(parcel, i18, com.google.android.gms.car.display.CarRegionId.CREATOR);
                            break;
                        case 2:
                            arrayListAc2 = defpackage.sqs.ac(parcel, i18);
                            break;
                        case 3:
                            arrayListAf4 = defpackage.sqs.af(parcel, i18, com.google.android.gms.car.display.CarRegionId.CREATOR);
                            break;
                        case 4:
                            arrayListAf5 = defpackage.sqs.af(parcel, i18, com.google.android.gms.car.animation.ProjectionWindowAnimationParams.CREATOR);
                            break;
                        case 5:
                            zAj11 = defpackage.sqs.aj(parcel, i18);
                            break;
                        case 6:
                            zAj12 = defpackage.sqs.aj(parcel, i18);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i18);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT18);
                return new com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography(arrayListAf3, arrayListAc2, arrayListAf4, arrayListAf5, zAj11, zAj12);
            case 19:
                return new com.google.android.gms.car.bluetooth.data.AutoValue_CarBluetoothData((android.bluetooth.BluetoothDevice) parcel.readParcelable(android.bluetooth.BluetoothDevice.class.getClassLoader()), parcel.readByte() != 0);
            default:
                int iT19 = defpackage.sqs.T(parcel);
                int iR17 = 0;
                java.lang.String strAb14 = null;
                java.lang.String strAb15 = null;
                java.lang.String strAb16 = null;
                byte[] bArrAk = null;
                while (parcel.dataPosition() < iT19) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        strAb14 = defpackage.sqs.ab(parcel, i19);
                    } else if (c11 == 2) {
                        strAb15 = defpackage.sqs.ab(parcel, i19);
                    } else if (c11 == 3) {
                        strAb16 = defpackage.sqs.ab(parcel, i19);
                    } else if (c11 == 4) {
                        bArrAk = defpackage.sqs.ak(parcel, i19);
                    } else if (c11 != 5) {
                        defpackage.sqs.ai(parcel, i19);
                    } else {
                        iR17 = defpackage.sqs.R(parcel, i19);
                    }
                }
                defpackage.sqs.ag(parcel, iT19);
                return new com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackMetadata(strAb14, strAb15, strAb16, bArrAk, iR17);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new com.google.android.gms.car.CreateAudioRecordRequest[i];
            case 1:
                return new com.google.android.gms.car.CreateAudioPolicyRequest[i];
            case 2:
                return new com.google.android.gms.car.DropShadowParams[i];
            case 3:
                return new com.google.android.gms.car.ExceptionParcel[i];
            case 4:
                return new com.google.android.gms.car.FrameDebugInfo[i];
            case 5:
                return new com.google.android.gms.car.GestureDirection[i];
            case 6:
                return new com.google.android.gms.car.KeyEventCompleteData[i];
            case 7:
                return new com.google.android.gms.car.KillOptions[i];
            case 8:
                return new com.google.android.gms.car.MediaOptions[i];
            case 9:
                return new com.google.android.gms.car.RadioConfiguration.RadioBandGroup[i];
            case 10:
                return new com.google.android.gms.car.RadioConfiguration[i];
            case 11:
                return new com.google.android.gms.car.RadioMetadata[i];
            case 12:
                return new com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier[i];
            case 13:
                return new com.google.android.gms.car.RadioProgramInfo[i];
            case 14:
                return new com.google.android.gms.car.RadioProgramSelector[i];
            case 15:
                return new com.google.android.gms.car.RadioMetadata.RadioProgramType[i];
            case 16:
                return new com.google.android.gms.car.RadioMetadata.RadioSongMetadata[i];
            case 17:
                return new com.google.android.gms.car.TouchEventCompleteData[i];
            case 18:
                return new com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography[i];
            case 19:
                return new com.google.android.gms.car.bluetooth.data.CarBluetoothData[i];
            default:
                return new com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackMetadata[i];
        }
    }
}
