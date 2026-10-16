package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class FeatureStyleCreator implements Parcelable.Creator<FeatureStyle> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public FeatureStyle createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        Integer numV = null;
        Integer numV2 = null;
        Float fU = null;
        Float fU2 = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                numV = spu.V(parcel, i);
            } else if (c == 2) {
                numV2 = spu.V(parcel, i);
            } else if (c == 3) {
                fU = spu.U(parcel, i);
            } else if (c != 4) {
                spu.ae(parcel, i);
            } else {
                fU2 = spu.U(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new FeatureStyle(numV, numV2, fU, fU2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public FeatureStyle[] newArray(int i) {
        return new FeatureStyle[i];
    }
}
