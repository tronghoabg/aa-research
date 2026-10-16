package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<v> CREATOR = new com.google.android.gms.a.b.b.b(19);

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray f5100a;

    public v(SparseArray sparseArray) {
        this.f5100a = sparseArray != null ? sparseArray.clone() : new SparseArray(0);
    }

    public final com.google.android.gms.k.f.c a(int i2) {
        SparseArray sparseArray = this.f5100a;
        return (com.google.android.gms.k.f.c) sparseArray.get(i2, (com.google.android.gms.k.f.c) sparseArray.get(0));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        SparseArray sparseArray = this.f5100a;
        int iD = bb.d(parcel);
        bb.z(parcel, sparseArray.clone());
        bb.e(parcel, iD);
    }
}
