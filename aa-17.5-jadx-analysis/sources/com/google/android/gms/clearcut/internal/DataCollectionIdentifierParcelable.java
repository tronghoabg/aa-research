package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sht;
import defpackage.spu;

/* loaded from: classes2.dex */
public final class DataCollectionIdentifierParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataCollectionIdentifierParcelable> CREATOR = new sht(2);
    public final int a;
    public final int b;
    public final int c;

    public DataCollectionIdentifierParcelable(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, i2);
        spu.r(parcel, 2, this.b);
        spu.r(parcel, 3, this.c);
        spu.m(parcel, iL);
    }
}
