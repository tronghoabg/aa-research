package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<t> CREATOR = new aa(1);

    /* renamed from: a, reason: collision with root package name */
    Bundle f5089a;

    /* renamed from: b, reason: collision with root package name */
    com.google.android.gms.common.f[] f5090b;

    /* renamed from: c, reason: collision with root package name */
    int f5091c;

    /* renamed from: d, reason: collision with root package name */
    u f5092d;

    /* renamed from: e, reason: collision with root package name */
    v f5093e;

    t(Bundle bundle, com.google.android.gms.common.f[] fVarArr, int i2, u uVar, v vVar) {
        this.f5089a = bundle;
        this.f5090b = fVarArr;
        this.f5091c = i2;
        this.f5092d = uVar;
        this.f5093e = vVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.k(parcel, 1, this.f5089a);
        bb.x(parcel, 2, this.f5090b, i2);
        bb.g(parcel, 3, this.f5091c);
        bb.t(parcel, 4, this.f5092d, i2);
        bb.t(parcel, 5, this.f5093e, i2);
        bb.e(parcel, iD);
    }

    public t() {
    }
}
