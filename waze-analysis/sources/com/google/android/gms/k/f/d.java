package com.google.android.gms.k.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = bb.F(parcel);
        int iD = -1;
        while (parcel.dataPosition() < iF) {
            int i2 = parcel.readInt();
            if (bb.C(i2) != 1) {
                bb.S(parcel, i2);
            } else {
                iD = bb.D(parcel, i2);
            }
        }
        bb.R(parcel, iF);
        return new c(iD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new c[i2];
    }
}
