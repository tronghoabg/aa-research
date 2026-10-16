package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class PolylineOptionsCreator implements Parcelable.Creator<PolylineOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PolylineOptions createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        ArrayList arrayListAb = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayListAb2 = null;
        ArrayList arrayListAb3 = null;
        int iN = 0;
        boolean zAf = false;
        boolean zAf2 = false;
        boolean zAf3 = false;
        int iN2 = 0;
        float fM = 0.0f;
        float fM2 = 0.0f;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    arrayListAb = spu.ab(parcel, i, LatLng.CREATOR);
                    break;
                case 3:
                    fM = spu.M(parcel, i);
                    break;
                case 4:
                    iN = spu.N(parcel, i);
                    break;
                case 5:
                    fM2 = spu.M(parcel, i);
                    break;
                case 6:
                    zAf = spu.af(parcel, i);
                    break;
                case 7:
                    zAf2 = spu.af(parcel, i);
                    break;
                case '\b':
                    zAf3 = spu.af(parcel, i);
                    break;
                case '\t':
                    cap = (Cap) spu.T(parcel, i, Cap.CREATOR);
                    break;
                case '\n':
                    cap2 = (Cap) spu.T(parcel, i, Cap.CREATOR);
                    break;
                case 11:
                    iN2 = spu.N(parcel, i);
                    break;
                case '\f':
                    arrayListAb2 = spu.ab(parcel, i, PatternItem.CREATOR);
                    break;
                case '\r':
                    arrayListAb3 = spu.ab(parcel, i, StyleSpan.CREATOR);
                    break;
                default:
                    spu.ae(parcel, i);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new PolylineOptions(arrayListAb, fM, iN, fM2, zAf, zAf2, zAf3, cap, cap2, iN2, arrayListAb2, arrayListAb3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PolylineOptions[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
