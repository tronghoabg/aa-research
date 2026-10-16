package com.google.android.gms.auth.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<e> CREATOR = new b(1);

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4425a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4426b;

    e(byte[] bArr, String str) {
        this.f4425a = bArr;
        this.f4426b = str;
    }

    public final String a() {
        return this.f4426b;
    }

    public final byte[] b() {
        return this.f4425a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Arrays.equals(this.f4425a, ((e) obj).f4425a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f4425a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.l(parcel, 1, this.f4425a);
        bb.u(parcel, 2, this.f4426b);
        bb.e(parcel, iD);
    }
}
