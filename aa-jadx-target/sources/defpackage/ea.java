package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ea implements android.os.Parcelable.Creator {
    private final /* synthetic */ int a;

    public ea(int i) {
        this.a = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) throws spq {
        android.content.Intent intent = null;
        android.graphics.Rect rect = null;
        java.lang.String strAb = null;
        int iR = 0;
        boolean zAj = false;
        int i = 0;
        int iR2 = 0;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new android.support.v4.media.session.PlaybackStateCompat(parcel);
            case 1:
                return new android.support.v4.media.MediaMetadataCompat(parcel);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new androidx.compose.foundation.lazy.layout.DefaultLazyKey(parcel.readInt());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(parcel.readFloat());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new androidx.compose.runtime.ParcelableSnapshotMutableIntState(parcel.readInt());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new androidx.compose.runtime.ParcelableSnapshotMutableLongState(parcel.readLong());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.google.android.apps.auto.components.graphics.icon.GhIcon(parcel);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int iT = defpackage.sqs.T(parcel);
                com.google.android.gms.car.display.CarRegionId carRegionId = null;
                while (parcel.dataPosition() < iT) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        intent = (android.content.Intent) defpackage.sqs.X(parcel, i2, android.content.Intent.CREATOR);
                    } else if (c != 2) {
                        defpackage.sqs.ai(parcel, i2);
                    } else {
                        carRegionId = (com.google.android.gms.car.display.CarRegionId) defpackage.sqs.X(parcel, i2, com.google.android.gms.car.display.CarRegionId.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT);
                return new com.google.android.gms.car.ActivityLaunchInfo(intent, carRegionId);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.gms.car.AnalyticsSessionInfo(parcel);
            case 9:
                int iT2 = defpackage.sqs.T(parcel);
                android.media.AudioAttributes audioAttributes = null;
                java.lang.String strAb2 = null;
                java.lang.String strAb3 = null;
                int iR3 = 0;
                int iR4 = 0;
                int iR5 = 0;
                int iR6 = 0;
                while (parcel.dataPosition() < iT2) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            audioAttributes = (android.media.AudioAttributes) defpackage.sqs.X(parcel, i3, android.media.AudioAttributes.CREATOR);
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            iR3 = defpackage.sqs.R(parcel, i3);
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            strAb2 = defpackage.sqs.ab(parcel, i3);
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            strAb3 = defpackage.sqs.ab(parcel, i3);
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            iR4 = defpackage.sqs.R(parcel, i3);
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            iR5 = defpackage.sqs.R(parcel, i3);
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            iR6 = defpackage.sqs.R(parcel, i3);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i3);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT2);
                return new com.google.android.gms.car.AudioFocusInfo(audioAttributes, iR3, strAb2, strAb3, iR4, iR5, iR6);
            case 10:
                int iT3 = defpackage.sqs.T(parcel);
                android.graphics.Rect rect2 = null;
                java.util.ArrayList arrayListAf = null;
                com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = null;
                com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams = null;
                com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams2 = null;
                android.graphics.Rect rect3 = null;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < iT3) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            defpackage.sqs.ah(parcel, i11, 4);
                            i4 = parcel.readInt();
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            defpackage.sqs.ah(parcel, i11, 4);
                            i5 = parcel.readInt();
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            defpackage.sqs.ah(parcel, i11, 4);
                            i6 = parcel.readInt();
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            defpackage.sqs.ah(parcel, i11, 4);
                            i7 = parcel.readInt();
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            defpackage.sqs.ah(parcel, i11, 4);
                            i8 = parcel.readInt();
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            rect2 = (android.graphics.Rect) defpackage.sqs.X(parcel, i11, android.graphics.Rect.CREATOR);
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            arrayListAf = defpackage.sqs.af(parcel, i11, com.google.android.gms.car.display.CarRegionId.CREATOR);
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            projectionWindowDecorationParams = (com.google.android.gms.car.ProjectionWindowDecorationParams) defpackage.sqs.X(parcel, i11, com.google.android.gms.car.ProjectionWindowDecorationParams.CREATOR);
                            break;
                        case '\t':
                            projectionWindowAnimationParams = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) defpackage.sqs.X(parcel, i11, com.google.android.gms.car.animation.ProjectionWindowAnimationParams.CREATOR);
                            break;
                        case '\n':
                            projectionWindowAnimationParams2 = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) defpackage.sqs.X(parcel, i11, com.google.android.gms.car.animation.ProjectionWindowAnimationParams.CREATOR);
                            break;
                        case 11:
                            defpackage.sqs.ah(parcel, i11, 4);
                            i9 = parcel.readInt();
                            break;
                        case '\f':
                            defpackage.sqs.ah(parcel, i11, 4);
                            i10 = parcel.readInt();
                            break;
                        case '\r':
                            rect3 = (android.graphics.Rect) defpackage.sqs.X(parcel, i11, android.graphics.Rect.CREATOR);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i11);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT3);
                return new com.google.android.gms.car.CarActivityLayoutParams(i4, i5, i6, i7, i8, rect2, arrayListAf, projectionWindowDecorationParams, projectionWindowAnimationParams, projectionWindowAnimationParams2, i9, i10, rect3);
            case 11:
                int iT4 = defpackage.sqs.T(parcel);
                int iR7 = 0;
                int iR8 = 0;
                while (parcel.dataPosition() < iT4) {
                    int i12 = parcel.readInt();
                    char c2 = (char) i12;
                    if (c2 == 1) {
                        iR = defpackage.sqs.R(parcel, i12);
                    } else if (c2 == 2) {
                        iR7 = defpackage.sqs.R(parcel, i12);
                    } else if (c2 != 3) {
                        defpackage.sqs.ai(parcel, i12);
                    } else {
                        iR8 = defpackage.sqs.R(parcel, i12);
                    }
                }
                defpackage.sqs.ag(parcel, iT4);
                return new com.google.android.gms.car.CarAudioConfiguration(iR, iR7, iR8);
            case 12:
                int iT5 = defpackage.sqs.T(parcel);
                int iR9 = 0;
                int iR10 = 0;
                int iR11 = 0;
                int iR12 = 0;
                int iR13 = 0;
                while (parcel.dataPosition() < iT5) {
                    int i13 = parcel.readInt();
                    char c3 = (char) i13;
                    if (c3 == 1) {
                        iR9 = defpackage.sqs.R(parcel, i13);
                    } else if (c3 == 2) {
                        iR10 = defpackage.sqs.R(parcel, i13);
                    } else if (c3 == 3) {
                        iR11 = defpackage.sqs.R(parcel, i13);
                    } else if (c3 == 4) {
                        iR12 = defpackage.sqs.R(parcel, i13);
                    } else if (c3 != 5) {
                        defpackage.sqs.ai(parcel, i13);
                    } else {
                        iR13 = defpackage.sqs.R(parcel, i13);
                    }
                }
                defpackage.sqs.ag(parcel, iT5);
                return new com.google.android.gms.car.CarInstrumentClusterInfo(iR9, iR10, iR11, iR12, iR13);
            case 13:
                int iT6 = defpackage.sqs.T(parcel);
                float[] fArr = null;
                byte[] bArrAk = null;
                int i14 = 0;
                int i15 = 0;
                long j = 0;
                while (parcel.dataPosition() < iT6) {
                    int i16 = parcel.readInt();
                    char c4 = (char) i16;
                    if (c4 == 1) {
                        defpackage.sqs.ah(parcel, i16, 4);
                        i15 = parcel.readInt();
                    } else if (c4 == 2) {
                        defpackage.sqs.ah(parcel, i16, 8);
                        j = parcel.readLong();
                    } else if (c4 == 3) {
                        int iS = defpackage.sqs.S(parcel, i16);
                        int iDataPosition = parcel.dataPosition();
                        if (iS == 0) {
                            fArr = null;
                        } else {
                            float[] fArrCreateFloatArray = parcel.createFloatArray();
                            parcel.setDataPosition(iDataPosition + iS);
                            fArr = fArrCreateFloatArray;
                        }
                    } else if (c4 == 4) {
                        bArrAk = defpackage.sqs.ak(parcel, i16);
                    } else if (c4 != 1000) {
                        defpackage.sqs.ai(parcel, i16);
                    } else {
                        defpackage.sqs.ah(parcel, i16, 4);
                        i14 = parcel.readInt();
                    }
                }
                defpackage.sqs.ag(parcel, iT6);
                return new com.google.android.gms.car.CarSensorEvent(i14, i15, j, fArr, bArrAk);
            case 14:
                int iT7 = defpackage.sqs.T(parcel);
                int[] iArrAl = null;
                boolean zAj2 = false;
                boolean zAj3 = false;
                boolean zAj4 = false;
                boolean zAj5 = false;
                boolean zAj6 = false;
                int i17 = 0;
                boolean zAj7 = false;
                int i18 = 0;
                int i19 = 0;
                while (parcel.dataPosition() < iT7) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            zAj2 = defpackage.sqs.aj(parcel, i20);
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            zAj3 = defpackage.sqs.aj(parcel, i20);
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            zAj4 = defpackage.sqs.aj(parcel, i20);
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            zAj5 = defpackage.sqs.aj(parcel, i20);
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            iArrAl = defpackage.sqs.al(parcel, i20);
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            zAj6 = defpackage.sqs.aj(parcel, i20);
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            defpackage.sqs.ah(parcel, i20, 4);
                            i17 = parcel.readInt();
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            zAj7 = defpackage.sqs.aj(parcel, i20);
                            break;
                        case '\t':
                            defpackage.sqs.ah(parcel, i20, 4);
                            i18 = parcel.readInt();
                            break;
                        case '\n':
                            defpackage.sqs.ah(parcel, i20, 4);
                            i19 = parcel.readInt();
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i20);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT7);
                return new com.google.android.gms.car.CarUiInfo(zAj2, zAj3, zAj4, zAj5, iArrAl, zAj6, i17, zAj7, i18, i19);
            case 15:
                int iT8 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT8) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        defpackage.sqs.ai(parcel, i21);
                    } else {
                        iR2 = defpackage.sqs.R(parcel, i21);
                    }
                }
                defpackage.sqs.ag(parcel, iT8);
                return new com.google.android.gms.car.CarWindowManagerLayoutParams(iR2);
            case 16:
                int iT9 = defpackage.sqs.T(parcel);
                com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams = null;
                int i22 = 0;
                java.lang.String strAb4 = null;
                while (parcel.dataPosition() < iT9) {
                    int i23 = parcel.readInt();
                    char c5 = (char) i23;
                    if (c5 == 1) {
                        strAb = defpackage.sqs.ab(parcel, i23);
                    } else if (c5 == 2) {
                        strAb4 = defpackage.sqs.ab(parcel, i23);
                    } else if (c5 == 3) {
                        carWindowLayoutParams = (com.google.android.gms.car.CarWindowLayoutParams) defpackage.sqs.X(parcel, i23, com.google.android.gms.car.CarWindowLayoutParams.CREATOR);
                    } else if (c5 != 4) {
                        defpackage.sqs.ai(parcel, i23);
                    } else {
                        defpackage.sqs.ah(parcel, i23, 4);
                        i22 = parcel.readInt();
                    }
                }
                defpackage.sqs.ag(parcel, iT9);
                return new com.google.android.gms.car.CarWindowSpec(strAb, strAb4, carWindowLayoutParams, i22);
            case 17:
                int iT10 = defpackage.sqs.T(parcel);
                int i24 = -1;
                android.view.Surface surface = null;
                android.graphics.Rect rect4 = null;
                android.os.Bundle bundleV = null;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (parcel.dataPosition() < iT10) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            defpackage.sqs.ah(parcel, i29, 4);
                            i25 = parcel.readInt();
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            defpackage.sqs.ah(parcel, i29, 4);
                            i26 = parcel.readInt();
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            defpackage.sqs.ah(parcel, i29, 4);
                            i27 = parcel.readInt();
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            surface = (android.view.Surface) defpackage.sqs.X(parcel, i29, android.view.Surface.CREATOR);
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            rect4 = (android.graphics.Rect) defpackage.sqs.X(parcel, i29, android.graphics.Rect.CREATOR);
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            defpackage.sqs.ah(parcel, i29, 4);
                            i28 = parcel.readInt();
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            defpackage.sqs.ah(parcel, i29, 4);
                            i24 = parcel.readInt();
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            bundleV = defpackage.sqs.V(parcel, i29);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i29);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT10);
                return new com.google.android.gms.car.DrawingSpec(i25, i26, i27, surface, rect4, i28, i24, bundleV);
            case 18:
                int iT11 = defpackage.sqs.T(parcel);
                int i30 = 0;
                while (parcel.dataPosition() < iT11) {
                    int i31 = parcel.readInt();
                    char c6 = (char) i31;
                    if (c6 == 1) {
                        defpackage.sqs.ah(parcel, i31, 4);
                        i = parcel.readInt();
                    } else if (c6 != 2) {
                        defpackage.sqs.ai(parcel, i31);
                    } else {
                        defpackage.sqs.ah(parcel, i31, 4);
                        i30 = parcel.readInt();
                    }
                }
                defpackage.sqs.ag(parcel, iT11);
                return new com.google.android.gms.car.FlingStepRange(i, i30);
            case 19:
                int iT12 = defpackage.sqs.T(parcel);
                boolean zAj8 = false;
                int i32 = 0;
                while (parcel.dataPosition() < iT12) {
                    int i33 = parcel.readInt();
                    char c7 = (char) i33;
                    if (c7 == 1) {
                        zAj = defpackage.sqs.aj(parcel, i33);
                    } else if (c7 == 2) {
                        zAj8 = defpackage.sqs.aj(parcel, i33);
                    } else if (c7 == 3) {
                        defpackage.sqs.ah(parcel, i33, 4);
                        i32 = parcel.readInt();
                    } else if (c7 != 4) {
                        defpackage.sqs.ai(parcel, i33);
                    } else {
                        rect = (android.graphics.Rect) defpackage.sqs.X(parcel, i33, android.graphics.Rect.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT12);
                return new com.google.android.gms.car.InputFocusChangedEvent(zAj, zAj8, i32, rect);
            default:
                int iT13 = defpackage.sqs.T(parcel);
                com.google.android.gms.car.DropShadowParams dropShadowParams = null;
                com.google.android.gms.car.ProjectionWindowDragParams projectionWindowDragParams = null;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                int i40 = 0;
                boolean zAj9 = false;
                boolean zAj10 = false;
                int i41 = 0;
                while (parcel.dataPosition() < iT13) {
                    int i42 = parcel.readInt();
                    switch ((char) i42) {
                        case 1:
                            defpackage.sqs.ah(parcel, i42, 4);
                            i34 = parcel.readInt();
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            defpackage.sqs.ah(parcel, i42, 4);
                            i35 = parcel.readInt();
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            defpackage.sqs.ah(parcel, i42, 4);
                            i36 = parcel.readInt();
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            defpackage.sqs.ah(parcel, i42, 4);
                            i37 = parcel.readInt();
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            defpackage.sqs.ah(parcel, i42, 4);
                            i38 = parcel.readInt();
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            defpackage.sqs.ah(parcel, i42, 4);
                            i39 = parcel.readInt();
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            defpackage.sqs.ah(parcel, i42, 4);
                            i40 = parcel.readInt();
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            zAj9 = defpackage.sqs.aj(parcel, i42);
                            break;
                        case '\t':
                            zAj10 = defpackage.sqs.aj(parcel, i42);
                            break;
                        case '\n':
                            defpackage.sqs.ah(parcel, i42, 4);
                            i41 = parcel.readInt();
                            break;
                        case 11:
                            dropShadowParams = (com.google.android.gms.car.DropShadowParams) defpackage.sqs.X(parcel, i42, com.google.android.gms.car.DropShadowParams.CREATOR);
                            break;
                        case '\f':
                            projectionWindowDragParams = (com.google.android.gms.car.ProjectionWindowDragParams) defpackage.sqs.X(parcel, i42, com.google.android.gms.car.ProjectionWindowDragParams.CREATOR);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i42);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT13);
                return new com.google.android.gms.car.ProjectionWindowDecorationParams(i34, i35, i36, i37, i38, i39, i40, zAj9, zAj10, i41, dropShadowParams, projectionWindowDragParams);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new android.support.v4.media.session.PlaybackStateCompat[i];
            case 1:
                return new android.support.v4.media.MediaMetadataCompat[i];
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new androidx.compose.foundation.lazy.layout.DefaultLazyKey[i];
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new androidx.compose.runtime.ParcelableSnapshotMutableFloatState[i];
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new androidx.compose.runtime.ParcelableSnapshotMutableIntState[i];
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new androidx.compose.runtime.ParcelableSnapshotMutableLongState[i];
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.google.android.apps.auto.components.graphics.icon.GhIcon[i];
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new com.google.android.gms.car.ActivityLaunchInfo[i];
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.gms.car.AnalyticsSessionInfo[i];
            case 9:
                return new com.google.android.gms.car.AudioFocusInfo[i];
            case 10:
                return new com.google.android.gms.car.CarActivityLayoutParams[i];
            case 11:
                return new com.google.android.gms.car.CarAudioConfiguration[i];
            case 12:
                return new com.google.android.gms.car.CarInstrumentClusterInfo[i];
            case 13:
                return new com.google.android.gms.car.CarSensorEvent[i];
            case 14:
                return new com.google.android.gms.car.CarUiInfo[i];
            case 15:
                return new com.google.android.gms.car.CarWindowManagerLayoutParams[i];
            case 16:
                return new com.google.android.gms.car.CarWindowSpec[i];
            case 17:
                return new com.google.android.gms.car.DrawingSpec[i];
            case 18:
                return new com.google.android.gms.car.FlingStepRange[i];
            case 19:
                return new com.google.android.gms.car.InputFocusChangedEvent[i];
            default:
                return new com.google.android.gms.car.ProjectionWindowDecorationParams[i];
        }
    }
}
