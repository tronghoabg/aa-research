package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<v> CREATOR = new w(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f5160a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5161b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5162c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f5163d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5164e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5165f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f5166g;

    v(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        this.f5160a = str;
        this.f5161b = z;
        this.f5162c = z2;
        this.f5163d = (Context) com.google.android.gms.g.b.c(com.google.android.gms.g.b.a(iBinder));
        this.f5164e = z3;
        this.f5165f = z4;
        this.f5166g = z5;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [android.os.IBinder, com.google.android.gms.g.c] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f5160a;
        int iD = bb.d(parcel);
        bb.u(parcel, 1, str);
        bb.f(parcel, 2, this.f5161b);
        bb.f(parcel, 3, this.f5162c);
        bb.q(parcel, 4, com.google.android.gms.g.b.b(this.f5163d));
        bb.f(parcel, 5, this.f5164e);
        bb.f(parcel, 6, this.f5165f);
        bb.f(parcel, 8, this.f5166g);
        bb.e(parcel, iD);
    }
}
