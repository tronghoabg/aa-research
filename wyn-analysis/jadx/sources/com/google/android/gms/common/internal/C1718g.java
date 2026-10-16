package com.google.android.gms.common.internal;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import f7.AbstractC2614a;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.google.android.gms.common.internal.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1718g extends AbstractC2614a {
    public static final Parcelable.Creator<C1718g> CREATOR = new C1559a(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f26640a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26641b;

    public C1718g(int i5, String str) {
        this.f26640a = i5;
        this.f26641b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1718g)) {
            return false;
        }
        C1718g c1718g = (C1718g) obj;
        return c1718g.f26640a == this.f26640a && AbstractC1732v.m(c1718g.f26641b, this.f26641b);
    }

    public final int hashCode() {
        return this.f26640a;
    }

    public final String toString() {
        return this.f26640a + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + this.f26641b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f26640a);
        AbstractC1304a.a0(parcel, 2, this.f26641b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
