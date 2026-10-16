package com.waze.reports_v2.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.n;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new n(6);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33983a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33984b;

    public a(boolean z, boolean z2) {
        this.f33983a = z;
        this.f33984b = z2;
    }

    public final boolean a() {
        return this.f33984b;
    }

    public final boolean b() {
        return this.f33983a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f33983a == aVar.f33983a && this.f33984b == aVar.f33984b;
    }

    public final int hashCode() {
        return (a.a.a(this.f33983a) * 31) + a.a.a(this.f33984b);
    }

    public final String toString() {
        return "DialogShowing(userDeclinedPermission=" + this.f33983a + ", disclaimerNeeded=" + this.f33984b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeInt(this.f33983a ? 1 : 0);
        parcel.writeInt(this.f33984b ? 1 : 0);
    }
}
