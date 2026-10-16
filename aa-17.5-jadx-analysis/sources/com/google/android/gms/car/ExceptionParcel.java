package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.qte;

/* loaded from: classes2.dex */
public class ExceptionParcel implements Parcelable {
    public static final Parcelable.Creator<ExceptionParcel> CREATOR = new qte(3);
    public final Throwable a;

    public ExceptionParcel(Throwable th) {
        this.a = th;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
    }
}
