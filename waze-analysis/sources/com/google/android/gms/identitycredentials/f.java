package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<f> CREATOR = new com.google.android.gms.auth.api.signin.e(17);

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f5520a;

    /* renamed from: b, reason: collision with root package name */
    private final h f5521b;

    public f(PendingIntent pendingIntent, h hVar) {
        this.f5520a = pendingIntent;
        this.f5521b = hVar;
        if (pendingIntent == null && hVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    public final PendingIntent a() {
        return this.f5520a;
    }

    public final h b() {
        return this.f5521b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        int iD = bb.d(parcel);
        bb.t(parcel, 1, this.f5520a, i2);
        bb.t(parcel, 2, this.f5521b, i2);
        bb.e(parcel, iD);
    }
}
