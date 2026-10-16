package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new w(14);

    /* renamed from: a, reason: collision with root package name */
    private final String f16102a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16103b;

    /* renamed from: c, reason: collision with root package name */
    private final u f16104c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16105d;

    public o(String str, String str2, u uVar, boolean z) {
        x.f(str, "url");
        this.f16102a = str;
        this.f16103b = str2;
        this.f16104c = uVar;
        this.f16105d = z;
    }

    public final u a() {
        return this.f16104c;
    }

    public final String b() {
        return this.f16103b;
    }

    public final String c() {
        return this.f16102a;
    }

    public final boolean d() {
        return this.f16105d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return x.n(this.f16102a, oVar.f16102a) && x.n(this.f16103b, oVar.f16103b) && x.n(this.f16104c, oVar.f16104c) && this.f16105d == oVar.f16105d;
    }

    public final int hashCode() {
        int iHashCode = this.f16102a.hashCode() * 31;
        String str = this.f16103b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u uVar = this.f16104c;
        return ((iHashCode2 + (uVar != null ? uVar.hashCode() : 0)) * 31) + a.a.a(this.f16105d);
    }

    public final String toString() {
        return "VenueImage(url=" + this.f16102a + ", thumbnailUrl=" + this.f16103b + ", reporter=" + this.f16104c + ", byMe=" + this.f16105d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeString(this.f16102a);
        parcel.writeString(this.f16103b);
        u uVar = this.f16104c;
        if (uVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uVar.writeToParcel(parcel, i2);
        }
        parcel.writeInt(this.f16105d ? 1 : 0);
    }
}
