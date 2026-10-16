package com.google.android.libraries.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import com.google.android.libraries.maps.model.StreetViewSource;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class StreetViewPanoramaOptionsCreator implements Parcelable.Creator<StreetViewPanoramaOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String strX = null;
        LatLng latLng = null;
        Integer numV = null;
        StreetViewSource streetViewSource = null;
        byte bK = 0;
        byte bK2 = 0;
        byte bK3 = 0;
        byte bK4 = 0;
        byte bK5 = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) spu.T(parcel, i, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    strX = spu.X(parcel, i);
                    break;
                case 4:
                    latLng = (LatLng) spu.T(parcel, i, LatLng.CREATOR);
                    break;
                case 5:
                    numV = spu.V(parcel, i);
                    break;
                case 6:
                    bK = spu.K(parcel, i);
                    break;
                case 7:
                    bK2 = spu.K(parcel, i);
                    break;
                case '\b':
                    bK3 = spu.K(parcel, i);
                    break;
                case '\t':
                    bK4 = spu.K(parcel, i);
                    break;
                case '\n':
                    bK5 = spu.K(parcel, i);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) spu.T(parcel, i, StreetViewSource.CREATOR);
                    break;
                default:
                    spu.ae(parcel, i);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, strX, latLng, numV, bK, bK2, bK3, bK4, bK5, streetViewSource);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StreetViewPanoramaOptions[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
