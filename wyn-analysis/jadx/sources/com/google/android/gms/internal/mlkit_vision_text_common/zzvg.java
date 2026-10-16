package com.google.android.gms.internal.mlkit_vision_text_common;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzvg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = null;
        ArrayList arrayListC = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                strY = v0.y(i5, parcel);
            } else if (c10 != 2) {
                v0.m0(i5, parcel);
            } else {
                arrayListC = v0.C(parcel, i5, zzuz.CREATOR);
            }
        }
        v0.D(iO0, parcel);
        return new zzvf(strY, arrayListC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzvf[i5];
    }
}
