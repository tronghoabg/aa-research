package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<w> CREATOR = new com.google.android.gms.auth.api.identity.n(15);

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false});
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.f(parcel, 1, false);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
