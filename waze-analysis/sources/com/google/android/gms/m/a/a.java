package com.google.android.gms.m.a;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.aa;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.a.a implements aa {
    public static final Parcelable.Creator<a> CREATOR = new g(1);

    /* renamed from: a, reason: collision with root package name */
    final int f5693a;

    /* renamed from: b, reason: collision with root package name */
    private int f5694b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f5695c;

    a(int i2, int i3, Intent intent) {
        this.f5693a = i2;
        this.f5694b = i3;
        this.f5695c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f5693a;
        int iD = bb.d(parcel);
        bb.g(parcel, 1, i3);
        bb.g(parcel, 2, this.f5694b);
        bb.t(parcel, 3, this.f5695c, i2);
        bb.e(parcel, iD);
    }

    public a() {
        this(2, 0, null);
    }
}
