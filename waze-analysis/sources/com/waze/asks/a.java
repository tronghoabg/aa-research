package com.waze.asks;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends d {
    public static final Parcelable.Creator<a> CREATOR = new com.google.android.gms.auth.a.b(14);

    /* renamed from: a, reason: collision with root package name */
    private final String f15483a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.b.at f15484b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15485c;

    public a(String str, com.waze.reports_v2.b.at atVar, int i2) {
        h.g.b.x.f(str, "answerKey");
        h.g.b.x.f(atVar, "subtype");
        this.f15483a = str;
        this.f15484b = atVar;
        this.f15485c = i2;
    }

    @Override // com.waze.asks.d
    public final int a() {
        return this.f15485c;
    }

    public final com.waze.reports_v2.b.at b() {
        return this.f15484b;
    }

    @Override // com.waze.asks.d
    public final String c() {
        return this.f15483a;
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
        return h.g.b.x.n(this.f15483a, aVar.f15483a) && this.f15484b == aVar.f15484b && this.f15485c == aVar.f15485c;
    }

    public final int hashCode() {
        return (((this.f15483a.hashCode() * 31) + this.f15484b.hashCode()) * 31) + this.f15485c;
    }

    public final String toString() {
        return "BlockedLaneVariantAnswer(answerKey=" + this.f15483a + ", subtype=" + this.f15484b + ", pointsAward=" + this.f15485c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeString(this.f15483a);
        parcel.writeParcelable(this.f15484b, i2);
        parcel.writeInt(this.f15485c);
    }
}
