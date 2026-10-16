package com.waze.sharedui.utils;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends m {
    public static final Parcelable.Creator<j> CREATOR = new com.google.android.gms.common.api.n(12);

    /* renamed from: b, reason: collision with root package name */
    private final Uri f39108b;

    public j(Uri uri) {
        x.f(uri, "output");
        this.f39108b = uri;
    }

    public final Uri a() {
        return this.f39108b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && x.n(this.f39108b, ((j) obj).f39108b);
    }

    public final int hashCode() {
        return this.f39108b.hashCode();
    }

    public final String toString() {
        return "ImageCaptureAction(output=" + this.f39108b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeParcelable(this.f39108b, i2);
    }
}
