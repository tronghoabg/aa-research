package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qoj;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class GoogleAccount extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleAccount> CREATOR = new qoj(7);
    public final String a;
    public final String b;
    public final String c;

    public GoogleAccount(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleAccount)) {
            return false;
        }
        GoogleAccount googleAccount = (GoogleAccount) obj;
        return Objects.equals(this.a, googleAccount.a) && Objects.equals(this.c, googleAccount.c) && Objects.equals(this.b, googleAccount.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c, this.b);
    }

    public final String toString() {
        return "Account=" + this.c + ",obfuscated gaiaId=" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 1, str);
        spu.F(parcel, 2, this.b);
        spu.F(parcel, 3, this.c);
        spu.m(parcel, iL);
    }
}
