package com.waze.navigate;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f31155a;

    c(int i2) {
        this.f31155a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i2 = this.f31155a;
        return i2 != 0 ? i2 != 1 ? new NearbyStation(parcel, null) : new AddressItem(parcel) : new d(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        int i3 = this.f31155a;
        return i3 != 0 ? i3 != 1 ? new NearbyStation[i2] : new AddressItem[i2] : new d[i2];
    }
}
