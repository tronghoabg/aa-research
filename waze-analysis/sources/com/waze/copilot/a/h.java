package com.waze.copilot.a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends k {
    public static final Parcelable.Creator<h> CREATOR = new com.google.android.gms.auth.a.b(18);

    /* renamed from: a, reason: collision with root package name */
    private final String f22836a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super(null);
        h.g.b.x.f(str, "campaignId");
        this.f22836a = str;
    }

    public final String a() {
        return this.f22836a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && h.g.b.x.n(this.f22836a, ((h) obj).f22836a);
    }

    public final int hashCode() {
        return this.f22836a.hashCode();
    }

    public final String toString() {
        return "CampaignScreen(campaignId=" + this.f22836a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeString(this.f22836a);
    }
}
