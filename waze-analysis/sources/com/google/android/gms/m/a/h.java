package com.google.android.gms.m.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.common.internal.be;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<h> CREATOR = new g(2);

    /* renamed from: a, reason: collision with root package name */
    final int f5705a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.d f5706b;

    /* renamed from: c, reason: collision with root package name */
    private final be f5707c;

    h(int i2, com.google.android.gms.common.d dVar, be beVar) {
        this.f5705a = i2;
        this.f5706b = dVar;
        this.f5707c = beVar;
    }

    public final com.google.android.gms.common.d a() {
        return this.f5706b;
    }

    public final be b() {
        return this.f5707c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, this.f5705a);
        bb.t(parcel, 2, this.f5706b, i2);
        bb.t(parcel, 3, this.f5707c, i2);
        bb.e(parcel, iD);
    }
}
