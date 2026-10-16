package com.waze.asks;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends d {
    public static final Parcelable.Creator<c> CREATOR = new com.google.android.gms.auth.a.b(16);

    /* renamed from: a, reason: collision with root package name */
    private final String f15583a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15584b;

    public c(String str, int i2) {
        h.g.b.x.f(str, "answerKey");
        this.f15583a = str;
        this.f15584b = i2;
    }

    @Override // com.waze.asks.d
    public final int a() {
        return this.f15584b;
    }

    @Override // com.waze.asks.d
    public final String c() {
        return this.f15583a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.g.b.x.n(this.f15583a, cVar.f15583a) && this.f15584b == cVar.f15584b;
    }

    public final int hashCode() {
        return (this.f15583a.hashCode() * 31) + this.f15584b;
    }

    public final String toString() {
        return "NotThereVariantAnswer(answerKey=" + this.f15583a + ", pointsAward=" + this.f15584b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeString(this.f15583a);
        parcel.writeInt(this.f15584b);
    }
}
