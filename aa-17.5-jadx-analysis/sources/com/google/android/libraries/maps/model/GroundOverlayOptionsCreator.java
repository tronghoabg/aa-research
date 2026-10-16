package com.google.android.libraries.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class GroundOverlayOptionsCreator implements Parcelable.Creator<GroundOverlayOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public GroundOverlayOptions createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        boolean zAf = false;
        boolean zAf2 = false;
        float fM = 0.0f;
        float fM2 = 0.0f;
        float fM3 = 0.0f;
        float fM4 = 0.0f;
        float fM5 = 0.0f;
        float fM6 = 0.0f;
        float fM7 = 0.0f;
        IBinder iBinderS = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    iBinderS = spu.S(parcel, i);
                    break;
                case 3:
                    latLng = (LatLng) spu.T(parcel, i, LatLng.CREATOR);
                    break;
                case 4:
                    fM = spu.M(parcel, i);
                    break;
                case 5:
                    fM2 = spu.M(parcel, i);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) spu.T(parcel, i, LatLngBounds.CREATOR);
                    break;
                case 7:
                    fM3 = spu.M(parcel, i);
                    break;
                case '\b':
                    fM4 = spu.M(parcel, i);
                    break;
                case '\t':
                    zAf = spu.af(parcel, i);
                    break;
                case '\n':
                    fM5 = spu.M(parcel, i);
                    break;
                case 11:
                    fM6 = spu.M(parcel, i);
                    break;
                case '\f':
                    fM7 = spu.M(parcel, i);
                    break;
                case '\r':
                    zAf2 = spu.af(parcel, i);
                    break;
                default:
                    spu.ae(parcel, i);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new GroundOverlayOptions(iBinderS, latLng, fM, fM2, latLngBounds, fM3, fM4, zAf, fM5, fM6, fM7, zAf2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
