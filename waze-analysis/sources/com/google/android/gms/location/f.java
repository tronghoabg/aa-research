package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = bb.F(parcel);
        boolean zT = false;
        ArrayList arrayListP = null;
        boolean zT2 = false;
        while (parcel.dataPosition() < iF) {
            int i2 = parcel.readInt();
            int iC = bb.C(i2);
            if (iC == 1) {
                arrayListP = bb.P(parcel, i2, LocationRequest.CREATOR);
            } else if (iC == 2) {
                zT = bb.T(parcel, i2);
            } else if (iC != 3) {
                bb.S(parcel, i2);
            } else {
                zT2 = bb.T(parcel, i2);
            }
        }
        bb.R(parcel, iF);
        return new e(arrayListP, zT, zT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new e[i2];
    }
}
