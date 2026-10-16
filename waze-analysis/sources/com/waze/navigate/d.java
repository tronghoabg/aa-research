package com.waze.navigate;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public String f31221a;

    /* renamed from: b, reason: collision with root package name */
    public String f31222b;

    /* renamed from: c, reason: collision with root package name */
    public int f31223c;

    /* renamed from: d, reason: collision with root package name */
    public String f31224d;

    protected d(Parcel parcel) {
        this.f31221a = parcel.readString();
        this.f31222b = parcel.readString();
        this.f31223c = parcel.readInt();
        this.f31224d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f31221a);
        parcel.writeString(this.f31222b);
        parcel.writeInt(this.f31223c);
        parcel.writeString(this.f31224d);
    }

    public d() {
    }
}
