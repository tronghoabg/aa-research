package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ba extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<ba> CREATOR = new e(17, null);

    /* renamed from: a, reason: collision with root package name */
    private final ay f5360a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5361b;

    static {
        new ba(ay.SUPPORTED.toString(), null);
        new ba(ay.NOT_SUPPORTED.toString(), null);
    }

    ba(String str, String str2) {
        com.google.android.gms.common.api.internal.av.m(str);
        try {
            this.f5360a = ay.a(str);
            this.f5361b = str2;
        } catch (az e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return Objects.equals(this.f5360a, baVar.f5360a) && Objects.equals(this.f5361b, baVar.f5361b);
    }

    public final int hashCode() {
        return Objects.hash(this.f5360a, this.f5361b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        ay ayVar = this.f5360a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.u(parcel, 2, ayVar.toString());
        com.google.android.gms.common.internal.bb.u(parcel, 3, this.f5361b);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
