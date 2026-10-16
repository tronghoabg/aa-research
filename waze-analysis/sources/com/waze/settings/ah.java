package com.waze.settings;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah implements Parcelable {
    public static final Parcelable.Creator<ah> CREATOR = new gv(1);

    /* renamed from: a, reason: collision with root package name */
    public String f36767a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f36768b;

    /* renamed from: c, reason: collision with root package name */
    String f36769c;

    /* renamed from: d, reason: collision with root package name */
    String f36770d;

    protected ah(Parcel parcel) {
        this.f36767a = parcel.readString();
        this.f36768b = parcel.readInt() == 0;
        this.f36769c = parcel.readString();
        this.f36770d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f36767a);
        parcel.writeInt(!this.f36768b ? 1 : 0);
        parcel.writeString(this.f36769c);
        parcel.writeString(this.f36770d);
    }

    public ah() {
    }
}
