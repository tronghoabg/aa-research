package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Scope extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new n(2);

    /* renamed from: a, reason: collision with root package name */
    final int f4684a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4685b;

    Scope(int i2, String str) {
        av.l(str, "scopeUri must not be null or empty");
        this.f4684a = i2;
        this.f4685b = str;
    }

    public final String a() {
        return this.f4685b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f4685b.equals(((Scope) obj).f4685b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4685b.hashCode();
    }

    public final String toString() {
        return this.f4685b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, this.f4684a);
        bb.u(parcel, 2, this.f4685b);
        bb.e(parcel, iD);
    }

    public Scope(String str) {
        this(1, str);
    }
}
