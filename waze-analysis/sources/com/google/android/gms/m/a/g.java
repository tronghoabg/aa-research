package com.google.android.gms.m.a;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.common.internal.bd;
import com.google.android.gms.common.internal.be;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f5704a;

    public g(int i2) {
        this.f5704a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i2 = this.f5704a;
        int iD = 0;
        bd bdVar = null;
        com.google.android.gms.common.d dVar = null;
        if (i2 == 0) {
            int iF = bb.F(parcel);
            while (parcel.dataPosition() < iF) {
                int i3 = parcel.readInt();
                int iC = bb.C(i3);
                if (iC == 1) {
                    iD = bb.D(parcel, i3);
                } else if (iC != 2) {
                    bb.S(parcel, i3);
                } else {
                    bdVar = (bd) bb.J(parcel, i3, bd.CREATOR);
                }
            }
            bb.R(parcel, iF);
            return new f(iD, bdVar);
        }
        if (i2 != 1) {
            int iF2 = bb.F(parcel);
            be beVar = null;
            while (parcel.dataPosition() < iF2) {
                int i4 = parcel.readInt();
                int iC2 = bb.C(i4);
                if (iC2 == 1) {
                    iD = bb.D(parcel, i4);
                } else if (iC2 == 2) {
                    dVar = (com.google.android.gms.common.d) bb.J(parcel, i4, com.google.android.gms.common.d.CREATOR);
                } else if (iC2 != 3) {
                    bb.S(parcel, i4);
                } else {
                    beVar = (be) bb.J(parcel, i4, be.CREATOR);
                }
            }
            bb.R(parcel, iF2);
            return new h(iD, dVar, beVar);
        }
        int iF3 = bb.F(parcel);
        Intent intent = null;
        int iD2 = 0;
        while (parcel.dataPosition() < iF3) {
            int i5 = parcel.readInt();
            int iC3 = bb.C(i5);
            if (iC3 == 1) {
                iD = bb.D(parcel, i5);
            } else if (iC3 == 2) {
                iD2 = bb.D(parcel, i5);
            } else if (iC3 != 3) {
                bb.S(parcel, i5);
            } else {
                intent = (Intent) bb.J(parcel, i5, Intent.CREATOR);
            }
        }
        bb.R(parcel, iF3);
        return new a(iD, iD2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        int i3 = this.f5704a;
        return i3 != 0 ? i3 != 1 ? new h[i2] : new a[i2] : new f[i2];
    }
}
