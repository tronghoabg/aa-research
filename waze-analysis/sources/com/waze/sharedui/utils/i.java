package com.waze.sharedui.utils;

import android.os.Parcel;
import android.os.Parcelable;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends m {
    public static final Parcelable.Creator<i> CREATOR = new com.google.android.gms.common.api.n(11);

    /* renamed from: b, reason: collision with root package name */
    private final long f39105b;

    /* renamed from: c, reason: collision with root package name */
    private final long f39106c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39107d;

    public i(long j2, long j3, boolean z) {
        this.f39105b = j2;
        this.f39106c = j3;
        this.f39107d = z;
    }

    public final long a() {
        return this.f39105b;
    }

    public final long b() {
        return this.f39106c;
    }

    public final boolean c() {
        return this.f39107d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f39105b == iVar.f39105b && this.f39106c == iVar.f39106c && this.f39107d == iVar.f39107d;
    }

    public final int hashCode() {
        return (((a.a.b(this.f39105b) * 31) + a.a.b(this.f39106c)) * 31) + a.a.a(this.f39107d);
    }

    public final String toString() {
        return "CalendarApprovedActivityAction(callback=" + this.f39105b + ", context=" + this.f39106c + ", granted=" + this.f39107d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeLong(this.f39105b);
        parcel.writeLong(this.f39106c);
        parcel.writeInt(this.f39107d ? 1 : 0);
    }
}
