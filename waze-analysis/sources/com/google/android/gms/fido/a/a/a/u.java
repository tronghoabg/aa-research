package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<u> CREATOR = new e(9, null);

    /* renamed from: a, reason: collision with root package name */
    private final long f5436a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.v.v f5437b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.v.v f5438c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.v.v f5439d;

    u(long j2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        com.google.android.gms.common.api.internal.av.m(bArr);
        com.google.v.v vVarQ = com.google.v.v.q(bArr);
        com.google.android.gms.common.api.internal.av.m(bArr2);
        com.google.v.v vVarQ2 = com.google.v.v.q(bArr2);
        com.google.android.gms.common.api.internal.av.m(bArr3);
        com.google.v.v vVarQ3 = com.google.v.v.q(bArr3);
        this.f5436a = j2;
        com.google.android.gms.common.api.internal.av.m(vVarQ);
        this.f5437b = vVarQ;
        com.google.android.gms.common.api.internal.av.m(vVarQ2);
        this.f5438c = vVarQ2;
        com.google.android.gms.common.api.internal.av.m(vVarQ3);
        this.f5439d = vVarQ3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f5436a == uVar.f5436a && Objects.equals(this.f5437b, uVar.f5437b) && Objects.equals(this.f5438c, uVar.f5438c) && Objects.equals(this.f5439d, uVar.f5439d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5436a), this.f5437b, this.f5438c, this.f5439d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        long j2 = this.f5436a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.h(parcel, 1, j2);
        com.google.android.gms.common.internal.bb.l(parcel, 2, this.f5437b.x());
        com.google.android.gms.common.internal.bb.l(parcel, 3, this.f5438c.x());
        com.google.android.gms.common.internal.bb.l(parcel, 4, this.f5439d.x());
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
