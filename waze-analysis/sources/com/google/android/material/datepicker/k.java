package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k implements b {
    public static final Parcelable.Creator<k> CREATOR = new i(2);

    /* renamed from: a, reason: collision with root package name */
    private final long f6476a;

    private k(long j2) {
        this.f6476a = j2;
    }

    public static k b() {
        return new k(Long.MIN_VALUE);
    }

    @Override // com.google.android.material.datepicker.b
    public final boolean a(long j2) {
        return j2 >= this.f6476a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f6476a == ((k) obj).f6476a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6476a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f6476a);
    }

    /* synthetic */ k(long j2, byte[] bArr) {
        this(j2);
    }
}
