package com.waze.copilot.a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public static final j f22838a = new j();
    public static final Parcelable.Creator<j> CREATOR = new com.google.android.gms.auth.a.b(20);

    private j() {
        super(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeInt(1);
    }
}
