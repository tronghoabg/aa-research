package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sbe implements android.os.Parcelable.Creator {
    public static void a(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        int iP2 = defpackage.sqs.p(parcel, 1);
        carInfoInternal.a.writeToParcel(parcel, i);
        defpackage.sqs.q(parcel, iP2);
        java.lang.String str = carInfoInternal.b;
        if (str != null) {
            int iP3 = defpackage.sqs.p(parcel, 2);
            parcel.writeString(str);
            defpackage.sqs.q(parcel, iP3);
        }
        boolean z = carInfoInternal.c;
        parcel.writeInt(262147);
        parcel.writeInt(z ? 1 : 0);
        long j = carInfoInternal.d;
        parcel.writeInt(524292);
        parcel.writeLong(j);
        long j2 = carInfoInternal.e;
        parcel.writeInt(524293);
        parcel.writeLong(j2);
        java.lang.String str2 = carInfoInternal.f;
        if (str2 != null) {
            int iP4 = defpackage.sqs.p(parcel, 6);
            parcel.writeString(str2);
            defpackage.sqs.q(parcel, iP4);
        }
        java.lang.String str3 = carInfoInternal.g;
        if (str3 != null) {
            int iP5 = defpackage.sqs.p(parcel, 7);
            parcel.writeString(str3);
            defpackage.sqs.q(parcel, iP5);
        }
        java.lang.String str4 = carInfoInternal.h;
        if (str4 != null) {
            int iP6 = defpackage.sqs.p(parcel, 8);
            parcel.writeString(str4);
            defpackage.sqs.q(parcel, iP6);
        }
        java.lang.String str5 = carInfoInternal.i;
        if (str5 != null) {
            int iP7 = defpackage.sqs.p(parcel, 9);
            parcel.writeString(str5);
            defpackage.sqs.q(parcel, iP7);
        }
        int i2 = carInfoInternal.j;
        parcel.writeInt(262154);
        parcel.writeInt(i2);
        java.lang.String str6 = carInfoInternal.k;
        if (str6 != null) {
            int iP8 = defpackage.sqs.p(parcel, 11);
            parcel.writeString(str6);
            defpackage.sqs.q(parcel, iP8);
        }
        int i3 = carInfoInternal.l;
        parcel.writeInt(262156);
        parcel.writeInt(i3);
        int i4 = carInfoInternal.m;
        parcel.writeInt(262157);
        parcel.writeInt(i4);
        int i5 = carInfoInternal.n;
        parcel.writeInt(262158);
        parcel.writeInt(i5);
        boolean z2 = carInfoInternal.o;
        parcel.writeInt(262159);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = carInfoInternal.p;
        parcel.writeInt(262160);
        parcel.writeInt(z3 ? 1 : 0);
        long j3 = carInfoInternal.q;
        parcel.writeInt(524305);
        parcel.writeLong(j3);
        boolean z4 = carInfoInternal.r;
        parcel.writeInt(262162);
        parcel.writeInt(z4 ? 1 : 0);
        java.lang.String str7 = carInfoInternal.s;
        if (str7 != null) {
            int iP9 = defpackage.sqs.p(parcel, 19);
            parcel.writeString(str7);
            defpackage.sqs.q(parcel, iP9);
        }
        int i6 = carInfoInternal.t;
        parcel.writeInt(262164);
        parcel.writeInt(i6);
        java.lang.String str8 = carInfoInternal.u;
        if (str8 != null) {
            int iP10 = defpackage.sqs.p(parcel, 21);
            parcel.writeString(str8);
            defpackage.sqs.q(parcel, iP10);
        }
        defpackage.sqs.q(parcel, iP);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) throws spq {
        int iT = defpackage.sqs.T(parcel);
        com.google.android.gms.car.CarInfo carInfo = null;
        java.lang.String strAb = null;
        java.lang.String strAb2 = null;
        java.lang.String strAb3 = null;
        java.lang.String strAb4 = null;
        java.lang.String strAb5 = null;
        java.lang.String strAb6 = null;
        java.lang.String strAb7 = null;
        java.lang.String strAb8 = null;
        boolean zAj = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean zAj2 = false;
        boolean zAj3 = false;
        boolean zAj4 = false;
        int i5 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < iT) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    carInfo = (com.google.android.gms.car.CarInfo) defpackage.sqs.X(parcel, i6, com.google.android.gms.car.CarInfo.CREATOR);
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    strAb = defpackage.sqs.ab(parcel, i6);
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    zAj = defpackage.sqs.aj(parcel, i6);
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    defpackage.sqs.ah(parcel, i6, 8);
                    j = parcel.readLong();
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    defpackage.sqs.ah(parcel, i6, 8);
                    j2 = parcel.readLong();
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    strAb2 = defpackage.sqs.ab(parcel, i6);
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    strAb3 = defpackage.sqs.ab(parcel, i6);
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    strAb4 = defpackage.sqs.ab(parcel, i6);
                    break;
                case '\t':
                    strAb5 = defpackage.sqs.ab(parcel, i6);
                    break;
                case '\n':
                    defpackage.sqs.ah(parcel, i6, 4);
                    i = parcel.readInt();
                    break;
                case 11:
                    strAb6 = defpackage.sqs.ab(parcel, i6);
                    break;
                case '\f':
                    defpackage.sqs.ah(parcel, i6, 4);
                    i2 = parcel.readInt();
                    break;
                case '\r':
                    defpackage.sqs.ah(parcel, i6, 4);
                    i3 = parcel.readInt();
                    break;
                case 14:
                    defpackage.sqs.ah(parcel, i6, 4);
                    i4 = parcel.readInt();
                    break;
                case 15:
                    zAj2 = defpackage.sqs.aj(parcel, i6);
                    break;
                case 16:
                    zAj3 = defpackage.sqs.aj(parcel, i6);
                    break;
                case 17:
                    defpackage.sqs.ah(parcel, i6, 8);
                    j3 = parcel.readLong();
                    break;
                case 18:
                    zAj4 = defpackage.sqs.aj(parcel, i6);
                    break;
                case 19:
                    strAb7 = defpackage.sqs.ab(parcel, i6);
                    break;
                case 20:
                    defpackage.sqs.ah(parcel, i6, 4);
                    i5 = parcel.readInt();
                    break;
                case 21:
                    strAb8 = defpackage.sqs.ab(parcel, i6);
                    break;
                default:
                    defpackage.sqs.ai(parcel, i6);
                    break;
            }
        }
        defpackage.sqs.ag(parcel, iT);
        return new com.google.android.gms.carsetup.CarInfoInternal(carInfo, strAb, zAj, j, j2, strAb2, strAb3, strAb4, strAb5, i, strAb6, i2, i3, i4, zAj2, zAj3, j3, zAj4, strAb7, i5, strAb8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.carsetup.CarInfoInternal[i];
    }
}
