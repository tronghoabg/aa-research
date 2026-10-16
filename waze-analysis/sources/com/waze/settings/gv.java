package com.waze.settings;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class gv implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f37347a;

    gv(int i2) {
        this.f37347a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.f37347a != 0 ? new ah(parcel) : new gw(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return this.f37347a != 0 ? new ah[i2] : new gw[i2];
    }
}
