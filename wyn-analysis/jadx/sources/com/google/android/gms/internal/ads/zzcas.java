package com.google.android.gms.internal.ads;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzcas implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        ArrayList arrayListA = null;
        boolean Z10 = false;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 2) {
                Z10 = v0.Z(i5, parcel);
            } else if (c10 != 3) {
                v0.m0(i5, parcel);
            } else {
                arrayListA = v0.A(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzcar(Z10, arrayListA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzcar[i5];
    }
}
