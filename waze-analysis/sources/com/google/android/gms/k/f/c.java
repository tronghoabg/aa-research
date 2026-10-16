package com.google.android.gms.k.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<c> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    private final int f5579a;

    private c() {
        this.f5579a = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Objects.equals(Integer.valueOf(this.f5579a), Integer.valueOf(((c) obj).f5579a));
        }
        return false;
    }

    public int getMaxInflight() {
        return this.f5579a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5579a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, getMaxInflight());
        bb.e(parcel, iD);
    }

    c(int i2) {
        this.f5579a = i2;
    }
}
