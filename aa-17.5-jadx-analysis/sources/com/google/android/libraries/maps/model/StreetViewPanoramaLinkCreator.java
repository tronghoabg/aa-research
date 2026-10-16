package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class StreetViewPanoramaLinkCreator implements Parcelable.Creator<StreetViewPanoramaLink> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StreetViewPanoramaLink createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        float fM = BitmapDescriptorFactory.HUE_RED;
        String strX = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strX = spu.X(parcel, i);
            } else if (c != 3) {
                spu.ae(parcel, i);
            } else {
                fM = spu.M(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new StreetViewPanoramaLink(strX, fM);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StreetViewPanoramaLink[] newArray(int i) {
        return new StreetViewPanoramaLink[i];
    }
}
