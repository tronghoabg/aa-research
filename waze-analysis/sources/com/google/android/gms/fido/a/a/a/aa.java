package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aa extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<aa> CREATOR = new com.google.android.gms.auth.api.identity.n(16);

    /* renamed from: a, reason: collision with root package name */
    private final String f5276a;

    public aa(String str) {
        com.google.android.gms.common.api.internal.av.m(str);
        this.f5276a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aa) {
            return this.f5276a.equals(((aa) obj).f5276a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5276a});
    }

    public final String toString() {
        return "FidoAppIdExtension{appid='" + this.f5276a + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f5276a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.u(parcel, 2, str);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
