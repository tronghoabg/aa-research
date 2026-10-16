package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<r> CREATOR = new com.google.android.gms.auth.api.signin.internal.j(9);

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f5544a;

    public r(PendingIntent pendingIntent) {
        h.g.b.x.f(pendingIntent, "pendingIntent");
        this.f5544a = pendingIntent;
    }

    public final PendingIntent a() {
        return this.f5544a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        int iD = bb.d(parcel);
        bb.t(parcel, 1, this.f5544a, i2);
        bb.e(parcel, iD);
    }
}
