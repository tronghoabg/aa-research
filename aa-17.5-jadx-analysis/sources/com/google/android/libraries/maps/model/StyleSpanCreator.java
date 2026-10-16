package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class StyleSpanCreator implements Parcelable.Creator<StyleSpan> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StyleSpan createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        double dL = 0.0d;
        StrokeStyle strokeStyle = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strokeStyle = (StrokeStyle) spu.T(parcel, i, StrokeStyle.CREATOR);
            } else if (c != 3) {
                spu.ae(parcel, i);
            } else {
                dL = spu.L(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new StyleSpan(strokeStyle, dL);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StyleSpan[] newArray(int i) {
        return new StyleSpan[i];
    }
}
