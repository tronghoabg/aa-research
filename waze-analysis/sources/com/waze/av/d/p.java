package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p implements Parcelable, Comparable<p> {
    public static final Parcelable.Creator<p> CREATOR = new w(15);

    /* renamed from: a, reason: collision with root package name */
    private final int f16106a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16107b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16108c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16109d;

    public p(int i2, int i3, int i4, int i5) {
        this.f16106a = i2;
        this.f16107b = i3;
        this.f16108c = i4;
        this.f16109d = i5;
    }

    public final int a() {
        return this.f16106a;
    }

    public final int b() {
        return this.f16107b;
    }

    public final int c() {
        return this.f16108c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(p pVar) {
        p pVar2 = pVar;
        x.f(pVar2, "other");
        int iA = x.a(this.f16106a, pVar2.f16106a);
        if (iA != 0) {
            return iA;
        }
        int iA2 = x.a(this.f16107b, pVar2.f16107b);
        if (iA2 != 0) {
            return iA2;
        }
        int iA3 = x.a(this.f16108c, pVar2.f16108c);
        if (iA3 != 0) {
            return iA3;
        }
        int iA4 = x.a(this.f16109d, pVar2.f16109d);
        if (iA4 == 0) {
            return 0;
        }
        return iA4;
    }

    public final int d() {
        return this.f16109d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        int i2 = this.f16106a;
        int i3 = this.f16108c;
        if (i2 <= i3) {
            return i2 == i3 && this.f16107b > this.f16109d;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f16106a == pVar.f16106a && this.f16107b == pVar.f16107b && this.f16108c == pVar.f16108c && this.f16109d == pVar.f16109d;
    }

    public final int hashCode() {
        return (((((this.f16106a * 31) + this.f16107b) * 31) + this.f16108c) * 31) + this.f16109d;
    }

    public final String toString() {
        return "VenueOpeningHours(fromHr=" + this.f16106a + ", fromMn=" + this.f16107b + ", toHr=" + this.f16108c + ", toMn=" + this.f16109d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeInt(this.f16106a);
        parcel.writeInt(this.f16107b);
        parcel.writeInt(this.f16108c);
        parcel.writeInt(this.f16109d);
    }
}
