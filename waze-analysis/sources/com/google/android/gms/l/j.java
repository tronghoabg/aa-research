package com.google.android.gms.l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends com.google.android.gms.common.internal.a.a implements Comparable<j> {
    public static final Parcelable.Creator<j> CREATOR = new com.google.android.gms.auth.a.b(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f5627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5628b;

    public j(int i2, int i3) {
        this.f5627a = i2;
        this.f5628b = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        int i2 = this.f5627a;
        int i3 = jVar.f5627a;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = this.f5628b;
        int i5 = jVar.f5628b;
        if (i4 < i5) {
            return -1;
        }
        return i4 > i5 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j) && compareTo((j) obj) == 0;
    }

    public final int hashCode() {
        return (this.f5627a * 31) + this.f5628b;
    }

    public final String toString() {
        return "GenericDimension(" + this.f5627a + ", " + this.f5628b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f5627a;
        int iD = bb.d(parcel);
        bb.g(parcel, 1, i3);
        bb.g(parcel, 2, this.f5628b);
        bb.e(parcel, iD);
    }
}
