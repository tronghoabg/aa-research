package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;

/* loaded from: classes.dex */
public final class sai implements Parcelable.Creator {
    public static void a(CarInfoInternal carInfoInternal, Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        int iL2 = spu.l(parcel, 1);
        carInfoInternal.a.writeToParcel(parcel, i);
        spu.m(parcel, iL2);
        String str = carInfoInternal.b;
        if (str != null) {
            int iL3 = spu.l(parcel, 2);
            parcel.writeString(str);
            spu.m(parcel, iL3);
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
        String str2 = carInfoInternal.f;
        if (str2 != null) {
            int iL4 = spu.l(parcel, 6);
            parcel.writeString(str2);
            spu.m(parcel, iL4);
        }
        String str3 = carInfoInternal.g;
        if (str3 != null) {
            int iL5 = spu.l(parcel, 7);
            parcel.writeString(str3);
            spu.m(parcel, iL5);
        }
        String str4 = carInfoInternal.h;
        if (str4 != null) {
            int iL6 = spu.l(parcel, 8);
            parcel.writeString(str4);
            spu.m(parcel, iL6);
        }
        String str5 = carInfoInternal.i;
        if (str5 != null) {
            int iL7 = spu.l(parcel, 9);
            parcel.writeString(str5);
            spu.m(parcel, iL7);
        }
        int i2 = carInfoInternal.j;
        parcel.writeInt(262154);
        parcel.writeInt(i2);
        String str6 = carInfoInternal.k;
        if (str6 != null) {
            int iL8 = spu.l(parcel, 11);
            parcel.writeString(str6);
            spu.m(parcel, iL8);
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
        String str7 = carInfoInternal.s;
        if (str7 != null) {
            int iL9 = spu.l(parcel, 19);
            parcel.writeString(str7);
            spu.m(parcel, iL9);
        }
        int i6 = carInfoInternal.t;
        parcel.writeInt(262164);
        parcel.writeInt(i6);
        String str8 = carInfoInternal.u;
        if (str8 != null) {
            int iL10 = spu.l(parcel, 21);
            parcel.writeString(str8);
            spu.m(parcel, iL10);
        }
        spu.m(parcel, iL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        CarInfo carInfo = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        String strX6 = null;
        String strX7 = null;
        String strX8 = null;
        boolean zAf = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean zAf2 = false;
        boolean zAf3 = false;
        boolean zAf4 = false;
        int i5 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < iP) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    carInfo = (CarInfo) spu.T(parcel, i6, CarInfo.CREATOR);
                    break;
                case 2:
                    strX = spu.X(parcel, i6);
                    break;
                case 3:
                    zAf = spu.af(parcel, i6);
                    break;
                case 4:
                    spu.ad(parcel, i6, 8);
                    j = parcel.readLong();
                    break;
                case 5:
                    spu.ad(parcel, i6, 8);
                    j2 = parcel.readLong();
                    break;
                case 6:
                    strX2 = spu.X(parcel, i6);
                    break;
                case 7:
                    strX3 = spu.X(parcel, i6);
                    break;
                case '\b':
                    strX4 = spu.X(parcel, i6);
                    break;
                case '\t':
                    strX5 = spu.X(parcel, i6);
                    break;
                case '\n':
                    spu.ad(parcel, i6, 4);
                    i = parcel.readInt();
                    break;
                case 11:
                    strX6 = spu.X(parcel, i6);
                    break;
                case '\f':
                    spu.ad(parcel, i6, 4);
                    i2 = parcel.readInt();
                    break;
                case '\r':
                    spu.ad(parcel, i6, 4);
                    i3 = parcel.readInt();
                    break;
                case 14:
                    spu.ad(parcel, i6, 4);
                    i4 = parcel.readInt();
                    break;
                case 15:
                    zAf2 = spu.af(parcel, i6);
                    break;
                case 16:
                    zAf3 = spu.af(parcel, i6);
                    break;
                case 17:
                    spu.ad(parcel, i6, 8);
                    j3 = parcel.readLong();
                    break;
                case 18:
                    zAf4 = spu.af(parcel, i6);
                    break;
                case 19:
                    strX7 = spu.X(parcel, i6);
                    break;
                case 20:
                    spu.ad(parcel, i6, 4);
                    i5 = parcel.readInt();
                    break;
                case 21:
                    strX8 = spu.X(parcel, i6);
                    break;
                default:
                    spu.ae(parcel, i6);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new CarInfoInternal(carInfo, strX, zAf, j, j2, strX2, strX3, strX4, strX5, i, strX6, i2, i3, i4, zAf2, zAf3, j3, zAf4, strX7, i5, strX8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CarInfoInternal[i];
    }
}
