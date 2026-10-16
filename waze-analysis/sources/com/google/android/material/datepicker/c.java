package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.ObjectsCompat;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new i(1);

    /* renamed from: a, reason: collision with root package name */
    private final aj f6441a;

    /* renamed from: b, reason: collision with root package name */
    private final aj f6442b;

    /* renamed from: c, reason: collision with root package name */
    private final b f6443c;

    /* renamed from: d, reason: collision with root package name */
    private aj f6444d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6445e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6446f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6447g;

    /* synthetic */ c(aj ajVar, aj ajVar2, b bVar, aj ajVar3, int i2) {
        Objects.requireNonNull(ajVar, "start cannot be null");
        Objects.requireNonNull(ajVar2, "end cannot be null");
        Objects.requireNonNull(bVar, "validator cannot be null");
        this.f6441a = ajVar;
        this.f6442b = ajVar2;
        this.f6444d = ajVar3;
        this.f6445e = i2;
        this.f6443c = bVar;
        if (ajVar3 != null && ajVar.compareTo(ajVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (ajVar3 != null && ajVar3.compareTo(ajVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i2 < 0 || i2 > ax.k().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f6447g = ajVar.d(ajVar2) + 1;
        this.f6446f = (ajVar2.f6399b - ajVar.f6399b) + 1;
    }

    final int b() {
        return this.f6445e;
    }

    final int c() {
        return this.f6447g;
    }

    final int d() {
        return this.f6446f;
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
        return this.f6441a.equals(cVar.f6441a) && this.f6442b.equals(cVar.f6442b) && ObjectsCompat.equals(this.f6444d, cVar.f6444d) && this.f6445e == cVar.f6445e && this.f6443c.equals(cVar.f6443c);
    }

    public final b f() {
        return this.f6443c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6441a, this.f6442b, this.f6444d, Integer.valueOf(this.f6445e), this.f6443c});
    }

    final aj j(aj ajVar) {
        aj ajVar2 = this.f6441a;
        if (ajVar.compareTo(ajVar2) < 0) {
            return ajVar2;
        }
        aj ajVar3 = this.f6442b;
        return ajVar.compareTo(ajVar3) > 0 ? ajVar3 : ajVar;
    }

    final aj k() {
        return this.f6442b;
    }

    final aj l() {
        return this.f6444d;
    }

    final aj m() {
        return this.f6441a;
    }

    final void n(aj ajVar) {
        this.f6444d = ajVar;
    }

    final boolean o(long j2) {
        if (this.f6441a.e(1) > j2) {
            return false;
        }
        aj ajVar = this.f6442b;
        return j2 <= ajVar.e(ajVar.f6401d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f6441a, 0);
        parcel.writeParcelable(this.f6442b, 0);
        parcel.writeParcelable(this.f6444d, 0);
        parcel.writeParcelable(this.f6443c, 0);
        parcel.writeInt(this.f6445e);
    }
}
