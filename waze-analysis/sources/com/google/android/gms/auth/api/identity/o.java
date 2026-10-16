package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class o extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<o> CREATOR = new com.google.android.gms.a.b.b.b(3);

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f4535a;

    public o(PendingIntent pendingIntent) {
        av.m(pendingIntent);
        this.f4535a = pendingIntent;
    }

    public final PendingIntent a() {
        return this.f4535a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.t(parcel, 1, this.f4535a, i2);
        bb.e(parcel, iD);
    }
}
