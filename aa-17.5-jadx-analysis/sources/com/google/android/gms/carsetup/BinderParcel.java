package com.google.android.gms.carsetup;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rcd;

/* loaded from: classes.dex */
public class BinderParcel implements Parcelable {
    public static final Parcelable.Creator<BinderParcel> CREATOR = new rcd(11);
    public final IBinder a;

    public BinderParcel(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
    }
}
