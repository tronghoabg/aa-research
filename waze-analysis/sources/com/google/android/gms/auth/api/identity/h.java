package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class h extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<h> CREATOR = new n(4);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4516a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4517b;

    h(boolean z, String str) {
        if (z) {
            av.m(str);
        }
        this.f4516a = z;
        this.f4517b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4516a == hVar.f4516a && Objects.equals(this.f4517b, hVar.f4517b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4516a), this.f4517b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        boolean z = this.f4516a;
        int iD = bb.d(parcel);
        bb.f(parcel, 1, z);
        bb.u(parcel, 2, this.f4517b);
        bb.e(parcel, iD);
    }
}
