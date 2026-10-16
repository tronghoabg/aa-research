package com.waze.copilot.a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends k {
    public static final Parcelable.Creator<i> CREATOR = new com.google.android.gms.auth.a.b(19);

    /* renamed from: a, reason: collision with root package name */
    private final String f22837a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super(null);
        h.g.b.x.f(str, "campaignId");
        this.f22837a = str;
    }

    public final String a() {
        return this.f22837a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && h.g.b.x.n(this.f22837a, ((i) obj).f22837a);
    }

    public final int hashCode() {
        return this.f22837a.hashCode();
    }

    public final String toString() {
        return "CarCampaignScreen(campaignId=" + this.f22837a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeString(this.f22837a);
    }
}
