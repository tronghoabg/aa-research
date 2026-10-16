package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import java.util.Arrays;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class l extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<l> CREATOR = new n(6);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4525a;

    l(boolean z) {
        this.f4525a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && this.f4525a == ((l) obj).f4525a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4525a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        boolean z = this.f4525a;
        int iD = bb.d(parcel);
        bb.f(parcel, 1, z);
        bb.e(parcel, iD);
    }
}
