package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.srf;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class DeviceWideZwiebackToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceWideZwiebackToken> CREATOR = new srf(9);
    public final byte[] a;

    public DeviceWideZwiebackToken(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceWideZwiebackToken) {
            return Arrays.equals(this.a, ((DeviceWideZwiebackToken) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iL = spu.l(parcel, 20293);
        spu.v(parcel, 1, bArr);
        spu.m(parcel, iL);
    }
}
