package com.waze.asks;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends d {
    public static final Parcelable.Creator<b> CREATOR = new com.google.android.gms.auth.a.b(15);

    /* renamed from: a, reason: collision with root package name */
    private final String f15554a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.b.at f15555b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15556c;

    public b(String str, com.waze.reports_v2.b.at atVar, int i2) {
        h.g.b.x.f(str, "answerKey");
        h.g.b.x.f(atVar, "subtype");
        this.f15554a = str;
        this.f15555b = atVar;
        this.f15556c = i2;
    }

    @Override // com.waze.asks.d
    public final int a() {
        return this.f15556c;
    }

    public final com.waze.reports_v2.b.at b() {
        return this.f15555b;
    }

    @Override // com.waze.asks.d
    public final String c() {
        return this.f15554a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.g.b.x.n(this.f15554a, bVar.f15554a) && this.f15555b == bVar.f15555b && this.f15556c == bVar.f15556c;
    }

    public final int hashCode() {
        return (((this.f15554a.hashCode() * 31) + this.f15555b.hashCode()) * 31) + this.f15556c;
    }

    public final String toString() {
        return "HazardVariantAnswer(answerKey=" + this.f15554a + ", subtype=" + this.f15555b + ", pointsAward=" + this.f15556c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeString(this.f15554a);
        parcel.writeParcelable(this.f15555b, i2);
        parcel.writeInt(this.f15556c);
    }
}
