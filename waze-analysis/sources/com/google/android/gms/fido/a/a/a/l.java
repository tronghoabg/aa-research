package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<l> CREATOR = new com.google.android.gms.auth.api.identity.n(12);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.v.v f5412a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.v.v f5413b;

    public l(com.google.v.v vVar, com.google.v.v vVar2) {
        this.f5412a = vVar;
        this.f5413b = vVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.f5412a, lVar.f5412a) && Objects.equals(this.f5413b, lVar.f5413b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5412a, this.f5413b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        com.google.v.v vVar = this.f5412a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.l(parcel, 1, vVar == null ? null : vVar.x());
        com.google.v.v vVar2 = this.f5413b;
        com.google.android.gms.common.internal.bb.l(parcel, 2, vVar2 != null ? vVar2.x() : null);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
