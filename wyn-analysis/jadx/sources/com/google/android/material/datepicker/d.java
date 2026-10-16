package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new C1559a(15);

    /* renamed from: a, reason: collision with root package name */
    public final long f26901a;

    public d(long j8) {
        this.f26901a = j8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f26901a == ((d) obj).f26901a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f26901a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f26901a);
    }
}
