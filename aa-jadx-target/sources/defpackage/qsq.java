package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qsq implements android.os.Parcelable.Creator {
    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) throws spq {
        int iT = defpackage.sqs.T(parcel);
        int i = 0;
        int i2 = 0;
        boolean zAj = false;
        int i3 = 0;
        boolean zAj2 = false;
        boolean zAj3 = false;
        boolean zAj4 = false;
        int i4 = 0;
        java.lang.String strAb = null;
        java.lang.String strAb2 = null;
        java.lang.String strAb3 = null;
        java.lang.String strAb4 = null;
        java.lang.String strAb5 = null;
        java.lang.String strAb6 = null;
        java.lang.String strAb7 = null;
        java.lang.String strAb8 = null;
        java.lang.String strAb9 = null;
        java.lang.String strAb10 = null;
        while (parcel.dataPosition() < iT) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    strAb = defpackage.sqs.ab(parcel, i5);
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    strAb2 = defpackage.sqs.ab(parcel, i5);
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    strAb3 = defpackage.sqs.ab(parcel, i5);
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    strAb4 = defpackage.sqs.ab(parcel, i5);
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    defpackage.sqs.ah(parcel, i5, 4);
                    i = parcel.readInt();
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    defpackage.sqs.ah(parcel, i5, 4);
                    i2 = parcel.readInt();
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    zAj = defpackage.sqs.aj(parcel, i5);
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    defpackage.sqs.ah(parcel, i5, 4);
                    i3 = parcel.readInt();
                    break;
                case '\t':
                    strAb5 = defpackage.sqs.ab(parcel, i5);
                    break;
                case '\n':
                    strAb6 = defpackage.sqs.ab(parcel, i5);
                    break;
                case 11:
                    strAb7 = defpackage.sqs.ab(parcel, i5);
                    break;
                case '\f':
                    strAb8 = defpackage.sqs.ab(parcel, i5);
                    break;
                case '\r':
                    zAj2 = defpackage.sqs.aj(parcel, i5);
                    break;
                case 14:
                    zAj3 = defpackage.sqs.aj(parcel, i5);
                    break;
                case 15:
                    zAj4 = defpackage.sqs.aj(parcel, i5);
                    break;
                case 16:
                    strAb9 = defpackage.sqs.ab(parcel, i5);
                    break;
                case 17:
                    strAb10 = defpackage.sqs.ab(parcel, i5);
                    break;
                case 18:
                    defpackage.sqs.ah(parcel, i5, 4);
                    i4 = parcel.readInt();
                    break;
                default:
                    defpackage.sqs.ai(parcel, i5);
                    break;
            }
        }
        defpackage.sqs.ag(parcel, iT);
        return new com.google.android.gms.car.CarInfo(strAb, strAb2, strAb3, strAb4, i, i2, zAj, i3, strAb5, strAb6, strAb7, strAb8, zAj2, zAj3, zAj4, strAb9, strAb10, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.car.CarInfo[i];
    }
}
