package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ao extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<ao> CREATOR = new com.google.android.gms.auth.api.signin.e(7);

    /* renamed from: a, reason: collision with root package name */
    private final String f5326a;

    public ao(String str) {
        this.f5326a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ao) {
            return Objects.equals(this.f5326a, ((ao) obj).f5326a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5326a});
    }

    public final String toString() {
        return "PublicKeyCredentialHints{\n value=" + this.f5326a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f5326a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.u(parcel, 1, str);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
