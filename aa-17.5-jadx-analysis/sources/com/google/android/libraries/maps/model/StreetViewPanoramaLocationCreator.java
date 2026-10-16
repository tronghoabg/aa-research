package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class StreetViewPanoramaLocationCreator implements Parcelable.Creator<StreetViewPanoramaLocation> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StreetViewPanoramaLocation createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String strX = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) spu.ai(parcel, i, StreetViewPanoramaLink.CREATOR);
            } else if (c == 3) {
                latLng = (LatLng) spu.T(parcel, i, LatLng.CREATOR);
            } else if (c != 4) {
                spu.ae(parcel, i);
            } else {
                strX = spu.X(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, strX);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StreetViewPanoramaLocation[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}
