package com.google.android.gms.internal.mlkit_vision_text_common;

import U8.v0;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzvk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        float fC0 = 0.0f;
        float fC02 = 0.0f;
        String strY = null;
        Rect rect = null;
        ArrayList arrayListC = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                strY = v0.y(i5, parcel);
            } else if (c10 == 2) {
                rect = (Rect) v0.x(parcel, i5, Rect.CREATOR);
            } else if (c10 == 3) {
                arrayListC = v0.C(parcel, i5, Point.CREATOR);
            } else if (c10 == 4) {
                fC0 = v0.c0(i5, parcel);
            } else if (c10 != 5) {
                v0.m0(i5, parcel);
            } else {
                fC02 = v0.c0(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzvj(strY, rect, arrayListC, fC0, fC02);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzvj[i5];
    }
}
