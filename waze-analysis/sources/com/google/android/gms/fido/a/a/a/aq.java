package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aq extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<aq> CREATOR = new com.google.android.gms.auth.api.signin.e(9);

    /* renamed from: a, reason: collision with root package name */
    private final String f5329a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5330b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5331c;

    public aq(String str, String str2, String str3) {
        com.google.android.gms.common.api.internal.av.m(str);
        this.f5329a = str;
        com.google.android.gms.common.api.internal.av.m(str2);
        this.f5330b = str2;
        this.f5331c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return Objects.equals(this.f5329a, aqVar.f5329a) && Objects.equals(this.f5330b, aqVar.f5330b) && Objects.equals(this.f5331c, aqVar.f5331c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5329a, this.f5330b, this.f5331c});
    }

    public final String toString() {
        return "PublicKeyCredentialRpEntity{\n id='" + this.f5329a + "', \n name='" + this.f5330b + "', \n icon='" + this.f5331c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f5329a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.u(parcel, 2, str);
        com.google.android.gms.common.internal.bb.u(parcel, 3, this.f5330b);
        com.google.android.gms.common.internal.bb.u(parcel, 4, this.f5331c);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
