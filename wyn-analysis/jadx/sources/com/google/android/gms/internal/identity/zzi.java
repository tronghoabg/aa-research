package com.google.android.gms.internal.identity;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1718g;
import java.util.List;
import x7.C4495g;

/* loaded from: classes.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        C4495g c4495g = zzh.zzb;
        List listC = zzh.zza;
        String strY = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                c4495g = (C4495g) v0.x(parcel, i5, C4495g.CREATOR);
            } else if (c10 == 2) {
                listC = v0.C(parcel, i5, C1718g.CREATOR);
            } else if (c10 != 3) {
                v0.m0(i5, parcel);
            } else {
                strY = v0.y(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzh(c4495g, listC, strY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzh[i5];
    }
}
