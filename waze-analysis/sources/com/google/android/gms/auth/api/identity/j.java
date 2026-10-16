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
public final class j extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<j> CREATOR = new n(5);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4521a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f4522b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4523c;

    j(boolean z, byte[] bArr, String str) {
        if (z) {
            av.m(bArr);
            av.m(str);
        }
        this.f4521a = z;
        this.f4522b = bArr;
        this.f4523c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f4521a == jVar.f4521a && Arrays.equals(this.f4522b, jVar.f4522b) && Objects.equals(this.f4523c, jVar.f4523c);
    }

    public final int hashCode() {
        return (Objects.hash(Boolean.valueOf(this.f4521a), this.f4523c) * 31) + Arrays.hashCode(this.f4522b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        boolean z = this.f4521a;
        int iD = bb.d(parcel);
        bb.f(parcel, 1, z);
        bb.l(parcel, 2, this.f4522b);
        bb.u(parcel, 3, this.f4523c);
        bb.e(parcel, iD);
    }
}
