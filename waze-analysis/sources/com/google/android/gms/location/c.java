package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = bb.F(parcel);
        WorkSource workSource = new WorkSource();
        com.google.android.gms.k.b.a aVar = null;
        boolean zT = false;
        int iD = 0;
        int iD2 = 0;
        boolean zT2 = false;
        long jG = -1;
        float fB = 0.0f;
        int iD3 = Integer.MAX_VALUE;
        long jG2 = Long.MAX_VALUE;
        long jG3 = Long.MAX_VALUE;
        long jG4 = 0;
        long jG5 = 600000;
        long jG6 = 3600000;
        int iD4 = 102;
        while (parcel.dataPosition() < iF) {
            int i2 = parcel.readInt();
            switch (bb.C(i2)) {
                case 1:
                    iD4 = bb.D(parcel, i2);
                    break;
                case 2:
                    jG6 = bb.G(parcel, i2);
                    break;
                case 3:
                    jG5 = bb.G(parcel, i2);
                    break;
                case 4:
                case 14:
                default:
                    bb.S(parcel, i2);
                    break;
                case 5:
                    jG2 = bb.G(parcel, i2);
                    break;
                case 6:
                    iD3 = bb.D(parcel, i2);
                    break;
                case 7:
                    fB = bb.B(parcel, i2);
                    break;
                case 8:
                    jG4 = bb.G(parcel, i2);
                    break;
                case 9:
                    zT = bb.T(parcel, i2);
                    break;
                case 10:
                    jG3 = bb.G(parcel, i2);
                    break;
                case 11:
                    jG = bb.G(parcel, i2);
                    break;
                case 12:
                    iD = bb.D(parcel, i2);
                    break;
                case 13:
                    iD2 = bb.D(parcel, i2);
                    break;
                case 15:
                    zT2 = bb.T(parcel, i2);
                    break;
                case 16:
                    workSource = (WorkSource) bb.J(parcel, i2, WorkSource.CREATOR);
                    break;
                case 17:
                    aVar = (com.google.android.gms.k.b.a) bb.J(parcel, i2, com.google.android.gms.k.b.a.CREATOR);
                    break;
            }
        }
        bb.R(parcel, iF);
        return new LocationRequest(iD4, jG6, jG5, jG4, jG2, jG3, iD3, fB, zT, jG, iD, iD2, zT2, workSource, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new LocationRequest[i2];
    }
}
