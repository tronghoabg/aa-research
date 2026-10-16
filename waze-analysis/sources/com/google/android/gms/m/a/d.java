package com.google.android.gms.m.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.aa;
import com.google.android.gms.common.internal.bb;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends com.google.android.gms.common.internal.a.a implements aa {
    public static final Parcelable.Creator<d> CREATOR = new com.google.android.gms.auth.a.b(10);

    /* renamed from: a, reason: collision with root package name */
    private final List f5696a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5697b;

    public d(List list, String str) {
        this.f5696a = list;
        this.f5697b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        List list = this.f5696a;
        int iD = bb.d(parcel);
        bb.w(parcel, 1, list);
        bb.u(parcel, 2, this.f5697b);
        bb.e(parcel, iD);
    }
}
