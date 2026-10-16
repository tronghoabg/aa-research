package com.waze;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new com.google.android.gms.auth.a.b(12);

    /* renamed from: a, reason: collision with root package name */
    private final String f25000a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25001b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25002c;

    public k(String str, String str2, String str3) {
        h.g.b.x.f(str, "providerId");
        h.g.b.x.f(str2, "uniqueId");
        h.g.b.x.f(str3, "uuid");
        this.f25000a = str;
        this.f25001b = str2;
        this.f25002c = str3;
    }

    public final String a() {
        return this.f25000a;
    }

    public final String b() {
        return this.f25001b;
    }

    public final String c() {
        return this.f25002c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.g.b.x.n(this.f25000a, kVar.f25000a) && h.g.b.x.n(this.f25001b, kVar.f25001b) && h.g.b.x.n(this.f25002c, kVar.f25002c);
    }

    public final int hashCode() {
        return (((this.f25000a.hashCode() * 31) + this.f25001b.hashCode()) * 31) + this.f25002c.hashCode();
    }

    public final String toString() {
        return "AlerterId(providerId=" + this.f25000a + ", uniqueId=" + this.f25001b + ", uuid=" + this.f25002c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeString(this.f25000a);
        parcel.writeString(this.f25001b);
        parcel.writeString(this.f25002c);
    }
}
