package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rcy implements android.os.Parcelable.Creator {
    private final /* synthetic */ int a;

    public rcy(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iR = 0;
        com.google.android.gms.car.display.CarDisplayId carDisplayId = null;
        java.lang.String strAb = null;
        java.util.ArrayList arrayListAf = null;
        java.util.ArrayList arrayListAf2 = null;
        com.google.android.gms.car.display.CarDisplayId carDisplayId2 = null;
        java.util.ArrayList arrayListAf3 = null;
        com.google.android.gms.car.display.CarDisplayId carDisplayId3 = null;
        switch (this.a) {
            case 0:
                int iT = defpackage.sqs.T(parcel);
                boolean zAj = false;
                com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = null;
                int i = 0;
                while (parcel.dataPosition() < iT) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        defpackage.sqs.ah(parcel, i2, 4);
                        iR = parcel.readInt();
                    } else if (c == 2) {
                        zAj = defpackage.sqs.aj(parcel, i2);
                    } else if (c == 3) {
                        projectionWindowAnimationChoreography = (com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) defpackage.sqs.X(parcel, i2, com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography.CREATOR);
                    } else if (c != 4) {
                        defpackage.sqs.ai(parcel, i2);
                    } else {
                        defpackage.sqs.ah(parcel, i2, 4);
                        i = parcel.readInt();
                    }
                }
                defpackage.sqs.ag(parcel, iT);
                return new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(iR, zAj, projectionWindowAnimationChoreography, i);
            case 1:
                int iT2 = defpackage.sqs.T(parcel);
                int i3 = 0;
                java.util.ArrayList arrayListAc = null;
                android.os.IBinder iBinderW = null;
                java.util.ArrayList arrayListAf4 = null;
                java.util.ArrayList arrayListAc2 = null;
                while (parcel.dataPosition() < iT2) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        defpackage.sqs.ah(parcel, i4, 4);
                        i3 = parcel.readInt();
                    } else if (c2 == 2) {
                        arrayListAc = defpackage.sqs.ac(parcel, i4);
                    } else if (c2 == 3) {
                        iBinderW = defpackage.sqs.W(parcel, i4);
                    } else if (c2 == 4) {
                        arrayListAf4 = defpackage.sqs.af(parcel, i4, com.google.android.gms.car.FlingStepRange.CREATOR);
                    } else if (c2 != 5) {
                        defpackage.sqs.ai(parcel, i4);
                    } else {
                        arrayListAc2 = defpackage.sqs.ac(parcel, i4);
                    }
                }
                defpackage.sqs.ag(parcel, iT2);
                return new com.google.android.gms.car.ProjectionWindowDragParams(i3, arrayListAc, iBinderW, arrayListAf4, arrayListAc2);
            case 2:
                int iT3 = defpackage.sqs.T(parcel);
                int iR2 = 0;
                com.google.android.gms.car.diagnostics.CriticalError criticalError = null;
                long jU = 0;
                long jU2 = 0;
                while (parcel.dataPosition() < iT3) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        jU = defpackage.sqs.U(parcel, i5);
                    } else if (c3 == 2) {
                        iR2 = defpackage.sqs.R(parcel, i5);
                    } else if (c3 == 3) {
                        criticalError = (com.google.android.gms.car.diagnostics.CriticalError) defpackage.sqs.X(parcel, i5, com.google.android.gms.car.diagnostics.CriticalError.CREATOR);
                    } else if (c3 != 4) {
                        defpackage.sqs.ai(parcel, i5);
                    } else {
                        jU2 = defpackage.sqs.U(parcel, i5);
                    }
                }
                defpackage.sqs.ag(parcel, iT3);
                return new com.google.android.gms.car.diagnostics.ConnectionState(jU, iR2, criticalError, jU2);
            case 3:
                int iT4 = defpackage.sqs.T(parcel);
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                com.google.android.gms.car.display.CarDisplayId carDisplayId4 = null;
                android.graphics.Point point = null;
                android.graphics.Rect rect = null;
                android.graphics.Rect rect2 = null;
                java.util.ArrayList arrayListAf5 = null;
                java.lang.String strAb2 = null;
                com.google.android.gms.car.display.CarDisplayBlendedUiConfig carDisplayBlendedUiConfig = null;
                while (parcel.dataPosition() < iT4) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            carDisplayId4 = (com.google.android.gms.car.display.CarDisplayId) defpackage.sqs.X(parcel, i9, com.google.android.gms.car.display.CarDisplayId.CREATOR);
                            break;
                        case 2:
                            defpackage.sqs.ah(parcel, i9, 4);
                            i6 = parcel.readInt();
                            break;
                        case 3:
                            defpackage.sqs.ah(parcel, i9, 4);
                            i7 = parcel.readInt();
                            break;
                        case 4:
                            point = (android.graphics.Point) defpackage.sqs.X(parcel, i9, android.graphics.Point.CREATOR);
                            break;
                        case 5:
                            rect = (android.graphics.Rect) defpackage.sqs.X(parcel, i9, android.graphics.Rect.CREATOR);
                            break;
                        case 6:
                            defpackage.sqs.ah(parcel, i9, 4);
                            i8 = parcel.readInt();
                            break;
                        case 7:
                            strAb2 = defpackage.sqs.ab(parcel, i9);
                            break;
                        case '\b':
                            rect2 = (android.graphics.Rect) defpackage.sqs.X(parcel, i9, android.graphics.Rect.CREATOR);
                            break;
                        case '\t':
                            arrayListAf5 = defpackage.sqs.af(parcel, i9, android.graphics.Rect.CREATOR);
                            break;
                        case '\n':
                            carDisplayBlendedUiConfig = (com.google.android.gms.car.display.CarDisplayBlendedUiConfig) defpackage.sqs.X(parcel, i9, com.google.android.gms.car.display.CarDisplayBlendedUiConfig.CREATOR);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i9);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT4);
                return new com.google.android.gms.car.display.CarDisplay(carDisplayId4, i6, i7, point, rect, rect2, arrayListAf5, i8, strAb2, carDisplayBlendedUiConfig);
            case 4:
                int iT5 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT5) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        defpackage.sqs.ai(parcel, i10);
                    } else {
                        defpackage.sqs.ah(parcel, i10, 4);
                        iR = parcel.readInt();
                    }
                }
                defpackage.sqs.ag(parcel, iT5);
                return new com.google.android.gms.car.display.CarDisplayId(iR);
            case 5:
                int iT6 = defpackage.sqs.T(parcel);
                int iR3 = 0;
                while (parcel.dataPosition() < iT6) {
                    int i11 = parcel.readInt();
                    char c4 = (char) i11;
                    if (c4 == 1) {
                        iR = defpackage.sqs.R(parcel, i11);
                    } else if (c4 != 2) {
                        defpackage.sqs.ai(parcel, i11);
                    } else {
                        iR3 = defpackage.sqs.R(parcel, i11);
                    }
                }
                defpackage.sqs.ag(parcel, iT6);
                return new com.google.android.gms.car.display.CarDisplayUiFeatures(iR, iR3);
            case 6:
                int iT7 = defpackage.sqs.T(parcel);
                com.google.android.gms.car.display.CarRegionId carRegionId = null;
                while (parcel.dataPosition() < iT7) {
                    int i12 = parcel.readInt();
                    char c5 = (char) i12;
                    if (c5 == 1) {
                        defpackage.sqs.ah(parcel, i12, 4);
                        iR = parcel.readInt();
                    } else if (c5 == 2) {
                        carDisplayId = (com.google.android.gms.car.display.CarDisplayId) defpackage.sqs.X(parcel, i12, com.google.android.gms.car.display.CarDisplayId.CREATOR);
                    } else if (c5 != 3) {
                        defpackage.sqs.ai(parcel, i12);
                    } else {
                        carRegionId = (com.google.android.gms.car.display.CarRegionId) defpackage.sqs.X(parcel, i12, com.google.android.gms.car.display.CarRegionId.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT7);
                return new com.google.android.gms.car.display.CarRegionGroup(iR, carDisplayId, carRegionId);
            case 7:
                int iT8 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT8) {
                    int i13 = parcel.readInt();
                    char c6 = (char) i13;
                    if (c6 == 1) {
                        defpackage.sqs.ah(parcel, i13, 4);
                        iR = parcel.readInt();
                    } else if (c6 != 2) {
                        defpackage.sqs.ai(parcel, i13);
                    } else {
                        carDisplayId3 = (com.google.android.gms.car.display.CarDisplayId) defpackage.sqs.X(parcel, i13, com.google.android.gms.car.display.CarDisplayId.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT8);
                return new com.google.android.gms.car.display.CarRegionId(iR, carDisplayId3);
            case 8:
                int iT9 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT9) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        defpackage.sqs.ai(parcel, i14);
                    } else {
                        arrayListAf3 = defpackage.sqs.af(parcel, i14, com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT9);
                return new com.google.android.gms.car.lifecycle.CarActivityLayoutConfig(arrayListAf3);
            case 9:
                int iT10 = defpackage.sqs.T(parcel);
                android.content.Intent intent = null;
                android.content.Intent intent2 = null;
                com.google.android.gms.car.display.CarRegionId carRegionId2 = null;
                com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams = null;
                com.google.android.gms.car.display.CarRegionGroup carRegionGroup = null;
                java.util.ArrayList arrayListAf6 = null;
                while (parcel.dataPosition() < iT10) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            intent = (android.content.Intent) defpackage.sqs.X(parcel, i15, android.content.Intent.CREATOR);
                            break;
                        case 2:
                            intent2 = (android.content.Intent) defpackage.sqs.X(parcel, i15, android.content.Intent.CREATOR);
                            break;
                        case 3:
                            carRegionId2 = (com.google.android.gms.car.display.CarRegionId) defpackage.sqs.X(parcel, i15, com.google.android.gms.car.display.CarRegionId.CREATOR);
                            break;
                        case 4:
                            carActivityLayoutParams = (com.google.android.gms.car.CarActivityLayoutParams) defpackage.sqs.X(parcel, i15, com.google.android.gms.car.CarActivityLayoutParams.CREATOR);
                            break;
                        case 5:
                            carRegionGroup = (com.google.android.gms.car.display.CarRegionGroup) defpackage.sqs.X(parcel, i15, com.google.android.gms.car.display.CarRegionGroup.CREATOR);
                            break;
                        case 6:
                            arrayListAf6 = defpackage.sqs.af(parcel, i15, android.content.ComponentName.CREATOR);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i15);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT10);
                return new com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig(intent, intent2, carRegionId2, carActivityLayoutParams, carRegionGroup, arrayListAf6);
            case 10:
                int iT11 = defpackage.sqs.T(parcel);
                java.util.ArrayList arrayListAf7 = null;
                java.lang.String strAb3 = null;
                java.util.ArrayList arrayListAf8 = null;
                while (parcel.dataPosition() < iT11) {
                    int i16 = parcel.readInt();
                    char c7 = (char) i16;
                    if (c7 == 1) {
                        carDisplayId2 = (com.google.android.gms.car.display.CarDisplayId) defpackage.sqs.X(parcel, i16, com.google.android.gms.car.display.CarDisplayId.CREATOR);
                    } else if (c7 == 2) {
                        arrayListAf7 = defpackage.sqs.af(parcel, i16, com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig.CREATOR);
                    } else if (c7 == 3) {
                        strAb3 = defpackage.sqs.ab(parcel, i16);
                    } else if (c7 != 4) {
                        defpackage.sqs.ai(parcel, i16);
                    } else {
                        arrayListAf8 = defpackage.sqs.af(parcel, i16, com.google.android.gms.car.display.CarRegionId.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT11);
                return new com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig(carDisplayId2, arrayListAf7, strAb3, arrayListAf8);
            case 11:
                return new com.google.android.gms.carsetup.BinderParcel(parcel.readStrongBinder());
            case 12:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                return strongBinder instanceof com.google.android.gms.carsetup.setup.SetupBinder ? (com.google.android.gms.carsetup.setup.SetupBinder) strongBinder : new com.google.android.gms.carsetup.setup.SetupBinder();
            case 13:
                com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.h.getClass();
                com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor trackedParcelFileDescriptor = new com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor((android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0);
                defpackage.omv.i(com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.h, defpackage.yyn.USB_FD_CREATED_FROM_PARCEL);
                com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.a.add(trackedParcelFileDescriptor);
                return trackedParcelFileDescriptor;
            case 14:
                int iT12 = defpackage.sqs.T(parcel);
                com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable = null;
                while (parcel.dataPosition() < iT12) {
                    int i17 = parcel.readInt();
                    char c8 = (char) i17;
                    if (c8 == 1) {
                        arrayListAf2 = defpackage.sqs.af(parcel, i17, com.google.android.gms.clearcut.LogEventParcelable.CREATOR);
                    } else if (c8 != 2) {
                        defpackage.sqs.ai(parcel, i17);
                    } else {
                        batchedLogErrorParcelable = (com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable) defpackage.sqs.X(parcel, i17, com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT12);
                return new com.google.android.gms.clearcut.BatchedLogEventParcelable(arrayListAf2, batchedLogErrorParcelable);
            case 15:
                int iT13 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT13) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        defpackage.sqs.ai(parcel, i18);
                    } else {
                        arrayListAf = defpackage.sqs.af(parcel, i18, com.google.android.gms.clearcut.internal.LogErrorParcelable.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT13);
                return new com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable(arrayListAf);
            case 16:
                int iT14 = defpackage.sqs.T(parcel);
                int iR4 = 0;
                while (parcel.dataPosition() < iT14) {
                    int i19 = parcel.readInt();
                    char c9 = (char) i19;
                    if (c9 == 1) {
                        strAb = defpackage.sqs.ab(parcel, i19);
                    } else if (c9 == 2) {
                        iR = defpackage.sqs.R(parcel, i19);
                    } else if (c9 != 3) {
                        defpackage.sqs.ai(parcel, i19);
                    } else {
                        iR4 = defpackage.sqs.R(parcel, i19);
                    }
                }
                defpackage.sqs.ag(parcel, iT14);
                return new com.google.android.gms.clearcut.internal.LogErrorParcelable(strAb, iR, iR4);
            case 17:
                int iT15 = defpackage.sqs.T(parcel);
                boolean zAj2 = true;
                int iR5 = 0;
                int iR6 = 0;
                boolean zAj3 = false;
                int iR7 = 0;
                boolean zAj4 = false;
                int iR8 = 0;
                java.lang.String strAb4 = null;
                java.lang.String strAb5 = null;
                java.lang.String strAb6 = null;
                java.lang.Integer numZ = null;
                while (parcel.dataPosition() < iT15) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 2:
                            strAb4 = defpackage.sqs.ab(parcel, i20);
                            break;
                        case 3:
                            iR5 = defpackage.sqs.R(parcel, i20);
                            break;
                        case 4:
                            iR6 = defpackage.sqs.R(parcel, i20);
                            break;
                        case 5:
                            strAb5 = defpackage.sqs.ab(parcel, i20);
                            break;
                        case 6:
                        default:
                            defpackage.sqs.ai(parcel, i20);
                            break;
                        case 7:
                            zAj2 = defpackage.sqs.aj(parcel, i20);
                            break;
                        case '\b':
                            strAb6 = defpackage.sqs.ab(parcel, i20);
                            break;
                        case '\t':
                            zAj3 = defpackage.sqs.aj(parcel, i20);
                            break;
                        case '\n':
                            iR7 = defpackage.sqs.R(parcel, i20);
                            break;
                        case 11:
                            numZ = defpackage.sqs.Z(parcel, i20);
                            break;
                        case '\f':
                            zAj4 = defpackage.sqs.aj(parcel, i20);
                            break;
                        case '\r':
                            iR8 = defpackage.sqs.R(parcel, i20);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT15);
                return new com.google.android.gms.clearcut.internal.PlayLoggerContext(strAb4, iR5, iR6, strAb5, zAj2, strAb6, zAj3, iR7, numZ, zAj4, iR8);
            case 18:
                int iT16 = defpackage.sqs.T(parcel);
                int iR9 = 0;
                int iR10 = 0;
                android.app.PendingIntent pendingIntent = null;
                java.lang.String strAb7 = null;
                java.lang.Integer numZ2 = null;
                while (parcel.dataPosition() < iT16) {
                    int i21 = parcel.readInt();
                    char c10 = (char) i21;
                    if (c10 == 1) {
                        iR9 = defpackage.sqs.R(parcel, i21);
                    } else if (c10 == 2) {
                        iR10 = defpackage.sqs.R(parcel, i21);
                    } else if (c10 == 3) {
                        pendingIntent = (android.app.PendingIntent) defpackage.sqs.X(parcel, i21, android.app.PendingIntent.CREATOR);
                    } else if (c10 == 4) {
                        strAb7 = defpackage.sqs.ab(parcel, i21);
                    } else if (c10 != 5) {
                        defpackage.sqs.ai(parcel, i21);
                    } else {
                        numZ2 = defpackage.sqs.Z(parcel, i21);
                    }
                }
                defpackage.sqs.ag(parcel, iT16);
                return new com.google.android.gms.common.ConnectionResult(iR9, iR10, pendingIntent, strAb7, numZ2);
            case 19:
                int iT17 = defpackage.sqs.T(parcel);
                int i22 = 0;
                boolean zAj5 = false;
                java.lang.String strAb8 = null;
                long j = -1;
                while (parcel.dataPosition() < iT17) {
                    int i23 = parcel.readInt();
                    char c11 = (char) i23;
                    if (c11 == 1) {
                        strAb8 = defpackage.sqs.ab(parcel, i23);
                    } else if (c11 == 2) {
                        defpackage.sqs.ah(parcel, i23, 4);
                        i22 = parcel.readInt();
                    } else if (c11 == 3) {
                        defpackage.sqs.ah(parcel, i23, 8);
                        j = parcel.readLong();
                    } else if (c11 != 4) {
                        defpackage.sqs.ai(parcel, i23);
                    } else {
                        zAj5 = defpackage.sqs.aj(parcel, i23);
                    }
                }
                defpackage.sqs.ag(parcel, iT17);
                return new com.google.android.gms.common.Feature(strAb8, i22, j, zAj5);
            default:
                int iT18 = defpackage.sqs.T(parcel);
                boolean zAj6 = false;
                boolean zAj7 = false;
                boolean zAj8 = false;
                boolean zAj9 = false;
                boolean zAj10 = false;
                java.lang.String strAb9 = null;
                android.os.IBinder iBinderW2 = null;
                while (parcel.dataPosition() < iT18) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            strAb9 = defpackage.sqs.ab(parcel, i24);
                            break;
                        case 2:
                            zAj6 = defpackage.sqs.aj(parcel, i24);
                            break;
                        case 3:
                            zAj7 = defpackage.sqs.aj(parcel, i24);
                            break;
                        case 4:
                            iBinderW2 = defpackage.sqs.W(parcel, i24);
                            break;
                        case 5:
                            zAj8 = defpackage.sqs.aj(parcel, i24);
                            break;
                        case 6:
                            zAj9 = defpackage.sqs.aj(parcel, i24);
                            break;
                        case 7:
                        default:
                            defpackage.sqs.ai(parcel, i24);
                            break;
                        case '\b':
                            zAj10 = defpackage.sqs.aj(parcel, i24);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT18);
                return new com.google.android.gms.common.GoogleCertificatesLookupQuery(strAb9, zAj6, zAj7, iBinderW2, zAj8, zAj9, zAj10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new com.google.android.gms.car.animation.ProjectionWindowAnimationParams[i];
            case 1:
                return new com.google.android.gms.car.ProjectionWindowDragParams[i];
            case 2:
                return new com.google.android.gms.car.diagnostics.ConnectionState[i];
            case 3:
                return new com.google.android.gms.car.display.CarDisplay[i];
            case 4:
                return new com.google.android.gms.car.display.CarDisplayId[i];
            case 5:
                return new com.google.android.gms.car.display.CarDisplayUiFeatures[i];
            case 6:
                return new com.google.android.gms.car.display.CarRegionGroup[i];
            case 7:
                return new com.google.android.gms.car.display.CarRegionId[i];
            case 8:
                return new com.google.android.gms.car.lifecycle.CarActivityLayoutConfig[i];
            case 9:
                return new com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig[i];
            case 10:
                return new com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig[i];
            case 11:
                return new com.google.android.gms.carsetup.BinderParcel[i];
            case 12:
                return new com.google.android.gms.carsetup.setup.SetupBinder[i];
            case 13:
                return new com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor[i];
            case 14:
                return new com.google.android.gms.clearcut.BatchedLogEventParcelable[i];
            case 15:
                return new com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable[i];
            case 16:
                return new com.google.android.gms.clearcut.internal.LogErrorParcelable[i];
            case 17:
                return new com.google.android.gms.clearcut.internal.PlayLoggerContext[i];
            case 18:
                return new com.google.android.gms.common.ConnectionResult[i];
            case 19:
                return new com.google.android.gms.common.Feature[i];
            default:
                return new com.google.android.gms.common.GoogleCertificatesLookupQuery[i];
        }
    }
}
