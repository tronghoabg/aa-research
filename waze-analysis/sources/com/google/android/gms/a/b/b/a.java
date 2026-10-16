package com.google.android.gms.a.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<a> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f4395a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4396b;

    public a(String str, int i2) {
        this.f4395a = str;
        this.f4396b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f4395a, aVar.f4395a) && this.f4396b == aVar.f4396b;
    }

    public final int hashCode() {
        String str = this.f4395a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f4396b;
    }

    public final String toString() {
        return "ExceptionParcel(message=" + this.f4395a + ", errorCode=" + this.f4396b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        String str = this.f4395a;
        int iD = bb.d(parcel);
        bb.u(parcel, 1, str);
        bb.g(parcel, 2, this.f4396b);
        bb.e(parcel, iD);
    }
}
