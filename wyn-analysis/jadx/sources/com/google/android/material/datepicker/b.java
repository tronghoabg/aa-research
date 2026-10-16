package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new C1559a(14);

    /* renamed from: a, reason: collision with root package name */
    public final n f26892a;

    /* renamed from: b, reason: collision with root package name */
    public final n f26893b;

    /* renamed from: c, reason: collision with root package name */
    public final d f26894c;

    /* renamed from: d, reason: collision with root package name */
    public final n f26895d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26896e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26897f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26898g;

    public b(n nVar, n nVar2, d dVar, n nVar3, int i5) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f26892a = nVar;
        this.f26893b = nVar2;
        this.f26895d = nVar3;
        this.f26896e = i5;
        this.f26894c = dVar;
        if (nVar3 != null && nVar.f26949a.compareTo(nVar3.f26949a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (nVar3 != null && nVar3.f26949a.compareTo(nVar2.f26949a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i5 < 0 || i5 > v.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f26898g = nVar.g(nVar2) + 1;
        this.f26897f = (nVar2.f26951c - nVar.f26951c) + 1;
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
        return this.f26892a.equals(bVar.f26892a) && this.f26893b.equals(bVar.f26893b) && Objects.equals(this.f26895d, bVar.f26895d) && this.f26896e == bVar.f26896e && this.f26894c.equals(bVar.f26894c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26892a, this.f26893b, this.f26895d, Integer.valueOf(this.f26896e), this.f26894c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable(this.f26892a, 0);
        parcel.writeParcelable(this.f26893b, 0);
        parcel.writeParcelable(this.f26895d, 0);
        parcel.writeParcelable(this.f26894c, 0);
        parcel.writeInt(this.f26896e);
    }
}
