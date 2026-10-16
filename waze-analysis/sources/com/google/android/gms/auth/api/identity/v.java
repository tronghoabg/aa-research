package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class v extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<v> CREATOR = new com.google.android.gms.a.b.b.b(5);

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f4558a;

    public v(PendingIntent pendingIntent) {
        av.m(pendingIntent);
        this.f4558a = pendingIntent;
    }

    public final PendingIntent a() {
        return this.f4558a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return Objects.equals(this.f4558a, ((v) obj).f4558a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4558a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.t(parcel, 1, this.f4558a, i2);
        bb.e(parcel, iD);
    }
}
