package com.google.android.apps.auto.components.calendar.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eeh;
import defpackage.yfq;

/* loaded from: classes2.dex */
public final class AutoValue_CalendarEvent extends C$AutoValue_CalendarEvent {
    public static final Parcelable.Creator<AutoValue_CalendarEvent> CREATOR = new eeh(20);

    public AutoValue_CalendarEvent(long j, long j2, String str, long j3, long j4, boolean z, String str2, int i, yfq yfqVar, boolean z2) {
        super(j, j2, str, j3, j4, z, str2, i, yfqVar, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeList(this.i);
        parcel.writeInt(this.j ? 1 : 0);
    }
}
