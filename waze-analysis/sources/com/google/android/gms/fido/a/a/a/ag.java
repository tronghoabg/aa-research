package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<ag> CREATOR = new e(11, null);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.v.v f5282a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.v.v f5283b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.v.v f5284c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5285d;

    ag(com.google.v.v vVar, com.google.v.v vVar2, com.google.v.v vVar3, int i2) {
        this.f5282a = vVar;
        this.f5283b = vVar2;
        this.f5284c = vVar3;
        this.f5285d = i2;
    }

    public final byte[] a() {
        com.google.v.v vVar = this.f5282a;
        if (vVar == null) {
            return null;
        }
        return vVar.x();
    }

    public final byte[] b() {
        com.google.v.v vVar = this.f5284c;
        if (vVar == null) {
            return null;
        }
        return vVar.x();
    }

    public final byte[] c() {
        com.google.v.v vVar = this.f5283b;
        if (vVar == null) {
            return null;
        }
        return vVar.x();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return Objects.equals(this.f5282a, agVar.f5282a) && Objects.equals(this.f5283b, agVar.f5283b) && Objects.equals(this.f5284c, agVar.f5284c) && this.f5285d == agVar.f5285d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5282a, this.f5283b, this.f5284c, Integer.valueOf(this.f5285d)});
    }

    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + a.a.O(a()) + ", saltEnc=" + a.a.O(c()) + ", saltAuth=" + a.a.O(b()) + ", getPinUvAuthProtocol=" + this.f5285d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.l(parcel, 1, a());
        com.google.android.gms.common.internal.bb.l(parcel, 2, c());
        com.google.android.gms.common.internal.bb.l(parcel, 3, b());
        com.google.android.gms.common.internal.bb.g(parcel, 4, this.f5285d);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
