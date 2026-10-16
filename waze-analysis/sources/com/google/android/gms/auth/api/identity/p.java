package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<p> CREATOR = new com.google.android.gms.a.b.b.b(4);

    /* renamed from: a, reason: collision with root package name */
    private final String f4536a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4537b;

    public p(String str, boolean z) {
        this.f4536a = str;
        this.f4537b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f4536a.equals(pVar.f4536a) && this.f4537b == pVar.f4537b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4536a, Boolean.valueOf(this.f4537b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f4536a;
        int iD = bb.d(parcel);
        bb.u(parcel, 1, str);
        bb.f(parcel, 2, this.f4537b);
        bb.e(parcel, iD);
    }
}
