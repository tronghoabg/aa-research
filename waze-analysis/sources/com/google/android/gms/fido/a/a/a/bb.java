package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bb extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<bb> CREATOR = new com.google.android.gms.auth.api.signin.e(11);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5362a;

    public bb(boolean z) {
        this.f5362a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bb) && this.f5362a == ((bb) obj).f5362a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5362a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        boolean z = this.f5362a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.f(parcel, 1, z);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
