package com.google.android.gms.common.api;

import U8.v0;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class A implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26419a;

    public /* synthetic */ A(int i5) {
        this.f26419a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f26419a) {
            case 0:
                int iO0 = v0.o0(parcel);
                String strY = null;
                int iF0 = 0;
                while (parcel.dataPosition() < iO0) {
                    int i5 = parcel.readInt();
                    char c10 = (char) i5;
                    if (c10 == 1) {
                        iF0 = v0.f0(i5, parcel);
                    } else if (c10 != 2) {
                        v0.m0(i5, parcel);
                    } else {
                        strY = v0.y(i5, parcel);
                    }
                }
                v0.D(iO0, parcel);
                return new Scope(iF0, strY);
            default:
                int iO02 = v0.o0(parcel);
                String strY2 = null;
                d7.b bVar = null;
                int iF02 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iO02) {
                    int i10 = parcel.readInt();
                    char c11 = (char) i10;
                    if (c11 == 1) {
                        iF02 = v0.f0(i10, parcel);
                    } else if (c11 == 2) {
                        strY2 = v0.y(i10, parcel);
                    } else if (c11 == 3) {
                        pendingIntent = (PendingIntent) v0.x(parcel, i10, PendingIntent.CREATOR);
                    } else if (c11 != 4) {
                        v0.m0(i10, parcel);
                    } else {
                        bVar = (d7.b) v0.x(parcel, i10, d7.b.CREATOR);
                    }
                }
                v0.D(iO02, parcel);
                return new Status(iF02, strY2, pendingIntent, bVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f26419a) {
            case 0:
                return new Scope[i5];
            default:
                return new Status[i5];
        }
    }
}
