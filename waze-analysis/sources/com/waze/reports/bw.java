package com.waze.reports;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bw implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f33737a;

    bw(int i2) {
        this.f33737a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i2 = this.f33737a;
        return i2 != 0 ? i2 != 1 ? new ed(parcel) : new br(parcel) : new bx(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        int i3 = this.f33737a;
        return i3 != 0 ? i3 != 1 ? new ed[i2] : new br[i2] : new bx[i2];
    }
}
