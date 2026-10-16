package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class PatternItemCreator implements Parcelable.Creator<PatternItem> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PatternItem createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        Float fU = null;
        int iN = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                iN = spu.N(parcel, i);
            } else if (c != 3) {
                spu.ae(parcel, i);
            } else {
                fU = spu.U(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new PatternItem(iN, fU);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PatternItem[] newArray(int i) {
        return new PatternItem[i];
    }
}
