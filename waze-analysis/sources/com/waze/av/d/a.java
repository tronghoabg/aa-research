package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new w(6);

    /* renamed from: a, reason: collision with root package name */
    private final d f16042a;

    /* renamed from: b, reason: collision with root package name */
    private final List f16043b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16044c;

    public a(d dVar, List list, String str) {
        x.f(dVar, "bookingOfferType");
        x.f(list, "rates");
        this.f16042a = dVar;
        this.f16043b = list;
        this.f16044c = str;
    }

    public final String a() {
        return this.f16044c;
    }

    public final List b() {
        return this.f16043b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16042a == aVar.f16042a && x.n(this.f16043b, aVar.f16043b) && x.n(this.f16044c, aVar.f16044c);
    }

    public final int hashCode() {
        int iHashCode = (this.f16042a.hashCode() * 31) + this.f16043b.hashCode();
        String str = this.f16044c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BookingOfferData(bookingOfferType=" + this.f16042a + ", rates=" + this.f16043b + ", reservationUri=" + this.f16044c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        this.f16042a.writeToParcel(parcel, i2);
        List list = this.f16043b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((c) it.next()).writeToParcel(parcel, i2);
        }
        parcel.writeString(this.f16044c);
    }
}
