package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sht;
import defpackage.spu;

/* loaded from: classes2.dex */
public class ConnectionThrottlingConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionThrottlingConfig> CREATOR = new sht(16);
    public final SparseArray a;

    public ConnectionThrottlingConfig(SparseArray sparseArray) {
        this.a = sparseArray != null ? sparseArray.clone() : new SparseArray(0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SparseArray sparseArray = this.a;
        int iL = spu.l(parcel, 20293);
        SparseArray sparseArrayClone = sparseArray.clone();
        if (sparseArrayClone != null) {
            int iL2 = spu.l(parcel, 1);
            int size = sparseArrayClone.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArrayClone.keyAt(i2));
                Parcelable parcelable = (Parcelable) sparseArrayClone.valueAt(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    spu.t(parcel, parcelable, 0);
                }
            }
            spu.m(parcel, iL2);
        }
        spu.m(parcel, iL);
    }
}
