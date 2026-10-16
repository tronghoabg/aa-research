package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class am implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = com.google.android.gms.common.internal.bb.F(parcel);
        aq aqVar = null;
        at atVar = null;
        byte[] bArrU = null;
        ArrayList arrayListP = null;
        Double dL = null;
        ArrayList arrayListP2 = null;
        r rVar = null;
        Integer numM = null;
        ba baVar = null;
        String strN = null;
        i iVar = null;
        String strN2 = null;
        ResultReceiver resultReceiver = null;
        ArrayList arrayListO = null;
        ArrayList arrayListP3 = null;
        while (parcel.dataPosition() < iF) {
            int i2 = parcel.readInt();
            switch (com.google.android.gms.common.internal.bb.C(i2)) {
                case 2:
                    aqVar = (aq) com.google.android.gms.common.internal.bb.J(parcel, i2, aq.CREATOR);
                    break;
                case 3:
                    atVar = (at) com.google.android.gms.common.internal.bb.J(parcel, i2, at.CREATOR);
                    break;
                case 4:
                    bArrU = com.google.android.gms.common.internal.bb.U(parcel, i2);
                    break;
                case 5:
                    arrayListP = com.google.android.gms.common.internal.bb.P(parcel, i2, ap.CREATOR);
                    break;
                case 6:
                    dL = com.google.android.gms.common.internal.bb.L(parcel, i2);
                    break;
                case 7:
                    arrayListP2 = com.google.android.gms.common.internal.bb.P(parcel, i2, an.CREATOR);
                    break;
                case 8:
                    rVar = (r) com.google.android.gms.common.internal.bb.J(parcel, i2, r.CREATOR);
                    break;
                case 9:
                    numM = com.google.android.gms.common.internal.bb.M(parcel, i2);
                    break;
                case 10:
                    baVar = (ba) com.google.android.gms.common.internal.bb.J(parcel, i2, ba.CREATOR);
                    break;
                case 11:
                    strN = com.google.android.gms.common.internal.bb.N(parcel, i2);
                    break;
                case 12:
                    iVar = (i) com.google.android.gms.common.internal.bb.J(parcel, i2, i.CREATOR);
                    break;
                case 13:
                    strN2 = com.google.android.gms.common.internal.bb.N(parcel, i2);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) com.google.android.gms.common.internal.bb.J(parcel, i2, ResultReceiver.CREATOR);
                    break;
                case 15:
                    arrayListO = com.google.android.gms.common.internal.bb.O(parcel, i2);
                    break;
                case 16:
                    arrayListP3 = com.google.android.gms.common.internal.bb.P(parcel, i2, ao.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.bb.S(parcel, i2);
                    break;
            }
        }
        com.google.android.gms.common.internal.bb.R(parcel, iF);
        return new al(aqVar, atVar, bArrU, arrayListP, dL, arrayListP2, rVar, numM, baVar, strN, iVar, strN2, resultReceiver, arrayListO, arrayListP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new al[i2];
    }
}
