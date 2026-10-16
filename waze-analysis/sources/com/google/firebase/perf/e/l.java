package com.google.firebase.perf.e;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new m(parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new m[i2];
    }
}
