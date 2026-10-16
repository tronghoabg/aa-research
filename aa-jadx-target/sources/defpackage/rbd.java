package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rbd implements android.os.Parcelable.Creator {
    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) throws spq {
        int iT = defpackage.sqs.T(parcel);
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams = null;
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams2 = null;
        android.graphics.Rect rect = null;
        android.os.Bundle bundleV = null;
        com.google.android.gms.car.display.CarRegionId carRegionId = null;
        java.util.ArrayList arrayListAf = null;
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = null;
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams3 = null;
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams4 = null;
        java.lang.String strAb = null;
        com.google.android.gms.car.BlackHoleParams blackHoleParams = null;
        android.graphics.Rect rect2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        boolean zAj = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (parcel.dataPosition() < iT) {
            int i17 = parcel.readInt();
            char c = (char) i17;
            if (c != 1000) {
                switch (c) {
                    case 1:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i2 = parcel.readInt();
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i3 = parcel.readInt();
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i4 = parcel.readInt();
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i5 = parcel.readInt();
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i6 = parcel.readInt();
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i7 = parcel.readInt();
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i8 = parcel.readInt();
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i9 = parcel.readInt();
                        break;
                    case '\t':
                        projectionWindowAnimationParams = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) defpackage.sqs.X(parcel, i17, com.google.android.gms.car.animation.ProjectionWindowAnimationParams.CREATOR);
                        break;
                    case '\n':
                        projectionWindowAnimationParams2 = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) defpackage.sqs.X(parcel, i17, com.google.android.gms.car.animation.ProjectionWindowAnimationParams.CREATOR);
                        break;
                    case 11:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i10 = parcel.readInt();
                        break;
                    case '\f':
                        zAj = defpackage.sqs.aj(parcel, i17);
                        break;
                    case '\r':
                        defpackage.sqs.ah(parcel, i17, 4);
                        i11 = parcel.readInt();
                        break;
                    case 14:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i12 = parcel.readInt();
                        break;
                    case 15:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i13 = parcel.readInt();
                        break;
                    case 16:
                        rect = (android.graphics.Rect) defpackage.sqs.X(parcel, i17, android.graphics.Rect.CREATOR);
                        break;
                    case 17:
                        bundleV = defpackage.sqs.V(parcel, i17);
                        break;
                    case 18:
                        carRegionId = (com.google.android.gms.car.display.CarRegionId) defpackage.sqs.X(parcel, i17, com.google.android.gms.car.display.CarRegionId.CREATOR);
                        break;
                    case 19:
                        arrayListAf = defpackage.sqs.af(parcel, i17, com.google.android.gms.car.display.CarRegionId.CREATOR);
                        break;
                    case 20:
                        projectionWindowDecorationParams = (com.google.android.gms.car.ProjectionWindowDecorationParams) defpackage.sqs.X(parcel, i17, com.google.android.gms.car.ProjectionWindowDecorationParams.CREATOR);
                        break;
                    case 21:
                        projectionWindowAnimationParams3 = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) defpackage.sqs.X(parcel, i17, com.google.android.gms.car.animation.ProjectionWindowAnimationParams.CREATOR);
                        break;
                    case 22:
                        projectionWindowAnimationParams4 = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) defpackage.sqs.X(parcel, i17, com.google.android.gms.car.animation.ProjectionWindowAnimationParams.CREATOR);
                        break;
                    case 23:
                        strAb = defpackage.sqs.ab(parcel, i17);
                        break;
                    case 24:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i14 = parcel.readInt();
                        break;
                    case 25:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i15 = parcel.readInt();
                        break;
                    case 26:
                        defpackage.sqs.ah(parcel, i17, 4);
                        i16 = parcel.readInt();
                        break;
                    case 27:
                        blackHoleParams = (com.google.android.gms.car.BlackHoleParams) defpackage.sqs.X(parcel, i17, com.google.android.gms.car.BlackHoleParams.CREATOR);
                        break;
                    case 28:
                        defpackage.sqs.ah(parcel, i17, 4);
                        f = parcel.readFloat();
                        break;
                    case 29:
                        rect2 = (android.graphics.Rect) defpackage.sqs.X(parcel, i17, android.graphics.Rect.CREATOR);
                        break;
                    default:
                        defpackage.sqs.ai(parcel, i17);
                        break;
                }
            } else {
                defpackage.sqs.ah(parcel, i17, 4);
                i = parcel.readInt();
            }
        }
        defpackage.sqs.ag(parcel, iT);
        return new com.google.android.gms.car.CarWindowLayoutParams(i, i2, i3, i4, i5, i6, i7, i8, i9, projectionWindowAnimationParams, projectionWindowAnimationParams2, i10, zAj, i11, i12, i13, rect, bundleV, carRegionId, arrayListAf, projectionWindowDecorationParams, projectionWindowAnimationParams3, projectionWindowAnimationParams4, strAb, i14, i15, i16, blackHoleParams, f, rect2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.car.CarWindowLayoutParams[i];
    }
}
