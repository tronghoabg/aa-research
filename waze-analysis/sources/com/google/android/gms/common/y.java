package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class y extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<y> CREATOR = new w(3);

    /* renamed from: a, reason: collision with root package name */
    private final String f5173a;

    /* renamed from: b, reason: collision with root package name */
    private final IBinder f5174b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5175c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5176d;

    /* renamed from: e, reason: collision with root package name */
    private q f5177e;

    y(String str, q qVar, boolean z, boolean z2) {
        this.f5173a = str;
        this.f5177e = qVar;
        this.f5174b = qVar == null ? null : qVar;
        this.f5175c = z;
        this.f5176d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f5173a;
        int iD = bb.d(parcel);
        bb.u(parcel, 1, str);
        bb.q(parcel, 2, this.f5174b);
        bb.f(parcel, 3, this.f5175c);
        bb.f(parcel, 4, this.f5176d);
        bb.e(parcel, iD);
    }

    y(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f5173a = str;
        this.f5174b = iBinder;
        this.f5175c = z;
        this.f5176d = z2;
    }
}
