package com.waze.sharedui.utils;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends m {
    public static final Parcelable.Creator<l> CREATOR = new com.google.android.gms.common.api.n(13);

    /* renamed from: b, reason: collision with root package name */
    private final Uri f39109b;

    public l(Uri uri) {
        x.f(uri, "uri");
        this.f39109b = uri;
    }

    public final Uri a() {
        return this.f39109b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && x.n(this.f39109b, ((l) obj).f39109b);
    }

    public final int hashCode() {
        return this.f39109b.hashCode();
    }

    public final String toString() {
        return "PickAction(uri=" + this.f39109b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeParcelable(this.f39109b, i2);
    }
}
