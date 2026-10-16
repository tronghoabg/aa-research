package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class at extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<at> CREATOR = new com.google.android.gms.auth.api.signin.e(10);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.v.v f5335a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5336b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5337c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5338d;

    public at(byte[] bArr, String str, String str2, String str3) {
        com.google.android.gms.common.api.internal.av.m(bArr);
        com.google.v.v vVarQ = com.google.v.v.q(bArr);
        com.google.android.gms.common.api.internal.av.m(vVarQ);
        this.f5335a = vVarQ;
        com.google.android.gms.common.api.internal.av.m(str);
        this.f5336b = str;
        this.f5337c = str2;
        com.google.android.gms.common.api.internal.av.m(str3);
        this.f5338d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        return Objects.equals(this.f5335a, atVar.f5335a) && Objects.equals(this.f5336b, atVar.f5336b) && Objects.equals(this.f5337c, atVar.f5337c) && Objects.equals(this.f5338d, atVar.f5338d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5335a, this.f5336b, this.f5337c, this.f5338d});
    }

    public final String toString() {
        return "PublicKeyCredentialUserEntity{\n id=" + a.a.O(this.f5335a.x()) + ", \n name='" + this.f5336b + "', \n icon='" + this.f5337c + "', \n displayName='" + this.f5338d + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        com.google.v.v vVar = this.f5335a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.l(parcel, 2, vVar.x());
        com.google.android.gms.common.internal.bb.u(parcel, 3, this.f5336b);
        com.google.android.gms.common.internal.bb.u(parcel, 4, this.f5337c);
        com.google.android.gms.common.internal.bb.u(parcel, 5, this.f5338d);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
