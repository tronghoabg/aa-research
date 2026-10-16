package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<ad> CREATOR = new com.google.android.gms.auth.api.identity.n(19);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5279a;

    public ad(boolean z) {
        this.f5279a = Boolean.valueOf(z).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ad) && this.f5279a == ((ad) obj).f5279a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5279a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        boolean z = this.f5279a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.f(parcel, 1, z);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
