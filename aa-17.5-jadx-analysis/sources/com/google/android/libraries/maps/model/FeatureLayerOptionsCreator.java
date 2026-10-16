package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class FeatureLayerOptionsCreator implements Parcelable.Creator<FeatureLayerOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public FeatureLayerOptions createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        String strX = null;
        String strX2 = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strX = spu.X(parcel, i);
            } else if (c != 2) {
                spu.ae(parcel, i);
            } else {
                strX2 = spu.X(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new FeatureLayerOptions(strX, strX2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public FeatureLayerOptions[] newArray(int i) {
        return new FeatureLayerOptions[i];
    }
}
