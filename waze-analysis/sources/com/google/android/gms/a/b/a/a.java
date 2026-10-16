package com.google.android.gms.a.b.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<a> CREATOR = new com.google.android.gms.a.b.b.b(1);

    /* renamed from: a, reason: collision with root package name */
    private final String f4394a;

    public a(String str) {
        x.f(str, "packageName");
        this.f4394a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && x.n(this.f4394a, ((a) obj).f4394a);
    }

    public final int hashCode() {
        return this.f4394a.hashCode();
    }

    public final String toString() {
        return "DecagonRequestParcel(packageName=" + this.f4394a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        String str = this.f4394a;
        int iD = bb.d(parcel);
        bb.u(parcel, 1, str);
        bb.e(parcel, iD);
    }
}
