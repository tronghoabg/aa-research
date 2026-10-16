package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ac extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<ac> CREATOR = new com.google.android.gms.auth.api.identity.n(18);

    /* renamed from: a, reason: collision with root package name */
    private final long f5278a;

    public ac(long j2) {
        this.f5278a = Long.valueOf(j2).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ac) && this.f5278a == ((ac) obj).f5278a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5278a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        long j2 = this.f5278a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.h(parcel, 1, j2);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
