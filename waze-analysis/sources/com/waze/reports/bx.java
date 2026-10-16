package com.waze.reports;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.waze.jni.protos.VenueImage;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bx implements Parcelable {
    public static final Parcelable.Creator<bx> CREATOR = new bw(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f33738a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33739b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33740c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33741d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33742e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33743f;

    /* renamed from: g, reason: collision with root package name */
    public int f33744g;

    /* renamed from: h, reason: collision with root package name */
    public int f33745h;

    /* renamed from: i, reason: collision with root package name */
    public Bitmap f33746i;

    public bx(VenueImage venueImage) {
        this.f33742e = false;
        this.f33743f = false;
        this.f33738a = venueImage.getUrl();
        this.f33739b = venueImage.getThumbnailUrl();
        this.f33740c = venueImage.hasReporter() ? venueImage.getReporter().getName() : null;
        this.f33741d = venueImage.hasReporter() ? venueImage.getReporter().getMood() : null;
        this.f33742e = venueImage.getByMe();
        this.f33743f = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f33738a);
        parcel.writeString(this.f33739b);
        parcel.writeString(this.f33740c);
        parcel.writeString(this.f33741d);
        parcel.writeInt(this.f33742e ? 1 : 0);
        parcel.writeInt(this.f33743f ? 1 : 0);
    }

    public bx(Parcel parcel) {
        this.f33742e = false;
        this.f33743f = false;
        this.f33738a = parcel.readString();
        this.f33739b = parcel.readString();
        this.f33740c = parcel.readString();
        this.f33741d = parcel.readString();
        this.f33742e = parcel.readInt() != 0;
        this.f33743f = parcel.readInt() != 0;
    }

    public bx(String str, String str2, String str3, String str4, boolean z) {
        this.f33742e = false;
        this.f33738a = str;
        this.f33739b = str2;
        this.f33740c = str3;
        this.f33741d = str4;
        this.f33743f = z;
    }
}
