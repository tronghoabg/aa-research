package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarInfo;

/* loaded from: classes.dex */
public final class qrw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        int i = 0;
        int i2 = 0;
        boolean zAf = false;
        int i3 = 0;
        boolean zAf2 = false;
        boolean zAf3 = false;
        boolean zAf4 = false;
        int i4 = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        String strX6 = null;
        String strX7 = null;
        String strX8 = null;
        String strX9 = null;
        String strX10 = null;
        while (parcel.dataPosition() < iP) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    strX = spu.X(parcel, i5);
                    break;
                case 2:
                    strX2 = spu.X(parcel, i5);
                    break;
                case 3:
                    strX3 = spu.X(parcel, i5);
                    break;
                case 4:
                    strX4 = spu.X(parcel, i5);
                    break;
                case 5:
                    spu.ad(parcel, i5, 4);
                    i = parcel.readInt();
                    break;
                case 6:
                    spu.ad(parcel, i5, 4);
                    i2 = parcel.readInt();
                    break;
                case 7:
                    zAf = spu.af(parcel, i5);
                    break;
                case '\b':
                    spu.ad(parcel, i5, 4);
                    i3 = parcel.readInt();
                    break;
                case '\t':
                    strX5 = spu.X(parcel, i5);
                    break;
                case '\n':
                    strX6 = spu.X(parcel, i5);
                    break;
                case 11:
                    strX7 = spu.X(parcel, i5);
                    break;
                case '\f':
                    strX8 = spu.X(parcel, i5);
                    break;
                case '\r':
                    zAf2 = spu.af(parcel, i5);
                    break;
                case 14:
                    zAf3 = spu.af(parcel, i5);
                    break;
                case 15:
                    zAf4 = spu.af(parcel, i5);
                    break;
                case 16:
                    strX9 = spu.X(parcel, i5);
                    break;
                case 17:
                    strX10 = spu.X(parcel, i5);
                    break;
                case 18:
                    spu.ad(parcel, i5, 4);
                    i4 = parcel.readInt();
                    break;
                default:
                    spu.ae(parcel, i5);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new CarInfo(strX, strX2, strX3, strX4, i, i2, zAf, i3, strX5, strX6, strX7, strX8, zAf2, zAf3, zAf4, strX9, strX10, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CarInfo[i];
    }
}
