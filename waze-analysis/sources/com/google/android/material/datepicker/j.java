package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j implements b {
    public static final Parcelable.Creator<j> CREATOR = new i(0);

    /* renamed from: a, reason: collision with root package name */
    private final long f6475a;

    private j(long j2) {
        this.f6475a = j2;
    }

    public static j b(long j2) {
        return new j(j2);
    }

    @Override // com.google.android.material.datepicker.b
    public final boolean a(long j2) {
        return j2 <= this.f6475a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f6475a == ((j) obj).f6475a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6475a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f6475a);
    }

    /* synthetic */ j(long j2, byte[] bArr) {
        this(j2);
    }
}
