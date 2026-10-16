package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<s> CREATOR = new com.google.android.gms.auth.api.signin.internal.j(10);

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f5545a;

    public s(PendingIntent pendingIntent) {
        h.g.b.x.f(pendingIntent, "pendingIntent");
        this.f5545a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        PendingIntent pendingIntent = this.f5545a;
        int iD = bb.d(parcel);
        bb.t(parcel, 1, pendingIntent, i2);
        bb.e(parcel, iD);
    }
}
