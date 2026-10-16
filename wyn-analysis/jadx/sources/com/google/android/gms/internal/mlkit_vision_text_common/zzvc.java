package com.google.android.gms.internal.mlkit_vision_text_common;

import U8.v0;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzvc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = null;
        Rect rect = null;
        ArrayList arrayListC = null;
        String strY2 = null;
        ArrayList arrayListC2 = null;
        float fC0 = 0.0f;
        float fC02 = 0.0f;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    strY = v0.y(i5, parcel);
                    break;
                case 2:
                    rect = (Rect) v0.x(parcel, i5, Rect.CREATOR);
                    break;
                case 3:
                    arrayListC = v0.C(parcel, i5, Point.CREATOR);
                    break;
                case 4:
                    strY2 = v0.y(i5, parcel);
                    break;
                case 5:
                    fC0 = v0.c0(i5, parcel);
                    break;
                case 6:
                    fC02 = v0.c0(i5, parcel);
                    break;
                case 7:
                    arrayListC2 = v0.C(parcel, i5, zzvj.CREATOR);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzvb(strY, rect, arrayListC, strY2, fC0, fC02, arrayListC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzvb[i5];
    }
}
