package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class CircleOptionsCreator implements Parcelable.Creator<CircleOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public CircleOptions createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        LatLng latLng = null;
        ArrayList arrayListAb = null;
        int iN = 0;
        int iN2 = 0;
        boolean zAf = false;
        boolean zAf2 = false;
        float fM = 0.0f;
        float fM2 = 0.0f;
        double dL = 0.0d;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    latLng = (LatLng) spu.T(parcel, i, LatLng.CREATOR);
                    break;
                case 3:
                    dL = spu.L(parcel, i);
                    break;
                case 4:
                    fM = spu.M(parcel, i);
                    break;
                case 5:
                    iN = spu.N(parcel, i);
                    break;
                case 6:
                    iN2 = spu.N(parcel, i);
                    break;
                case 7:
                    fM2 = spu.M(parcel, i);
                    break;
                case '\b':
                    zAf = spu.af(parcel, i);
                    break;
                case '\t':
                    zAf2 = spu.af(parcel, i);
                    break;
                case '\n':
                    arrayListAb = spu.ab(parcel, i, PatternItem.CREATOR);
                    break;
                default:
                    spu.ae(parcel, i);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new CircleOptions(latLng, dL, fM, iN, iN2, fM2, zAf, zAf2, arrayListAb);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }
}
