package com.google.android.gms.l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g implements Parcelable.Creator {
    public static boolean a(int i2) {
        return i2 == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = bb.F(parcel);
        boolean zT = false;
        int iD = 0;
        int iD2 = 0;
        int iD3 = 0;
        String strN = null;
        String strN2 = null;
        byte[] bArrU = null;
        double dA = 0.0d;
        long jG = 0;
        while (parcel.dataPosition() < iF) {
            int i2 = parcel.readInt();
            switch (bb.C(i2)) {
                case 2:
                    strN = bb.N(parcel, i2);
                    break;
                case 3:
                    jG = bb.G(parcel, i2);
                    break;
                case 4:
                    zT = bb.T(parcel, i2);
                    break;
                case 5:
                    dA = bb.A(parcel, i2);
                    break;
                case 6:
                    strN2 = bb.N(parcel, i2);
                    break;
                case 7:
                    bArrU = bb.U(parcel, i2);
                    break;
                case 8:
                    iD = bb.D(parcel, i2);
                    break;
                case 9:
                    iD2 = bb.D(parcel, i2);
                    break;
                case 10:
                    iD3 = bb.D(parcel, i2);
                    break;
                default:
                    bb.S(parcel, i2);
                    break;
            }
        }
        bb.R(parcel, iF);
        return new f(strN, jG, zT, dA, strN2, bArrU, iD, iD2, iD3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new f[i2];
    }
}
