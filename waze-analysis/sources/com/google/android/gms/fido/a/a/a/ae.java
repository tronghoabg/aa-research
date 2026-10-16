package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<ae> CREATOR = new com.google.android.gms.auth.api.identity.n(20);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5280a;

    public ae(boolean z) {
        this.f5280a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ae) && this.f5280a == ((ae) obj).f5280a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5280a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        boolean z = this.f5280a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.f(parcel, 1, z);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
