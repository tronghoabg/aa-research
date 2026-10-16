package com.google.android.apps.auto.components.calendar.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.khy;

/* loaded from: classes2.dex */
public final class AutoValue_CalendarReminder extends C$AutoValue_CalendarReminder {
    public static final Parcelable.Creator<AutoValue_CalendarReminder> CREATOR = new khy(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
        parcel.writeList(this.i);
        parcel.writeInt(this.j ? 1 : 0);
    }
}
