package com.google.android.gms.common.api;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class Scope extends AbstractC2614a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new A(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f26422a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26423b;

    public Scope(int i5, String str) {
        AbstractC1732v.g(str, "scopeUri must not be null or empty");
        this.f26422a = i5;
        this.f26423b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f26423b.equals(((Scope) obj).f26423b);
    }

    public final int hashCode() {
        return this.f26423b.hashCode();
    }

    public final String toString() {
        return this.f26423b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f26422a);
        AbstractC1304a.a0(parcel, 2, this.f26423b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
