package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new w(16);

    /* renamed from: a, reason: collision with root package name */
    private final Map f16110a;

    public q(Map map) {
        x.f(map, "daysToHours");
        this.f16110a = map;
    }

    public final Map a() {
        return this.f16110a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && x.n(this.f16110a, ((q) obj).f16110a);
    }

    public final int hashCode() {
        return this.f16110a.hashCode();
    }

    public final String toString() {
        return "VenueOpeningTimes(daysToHours=" + this.f16110a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        Map map = this.f16110a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            ((e) entry.getKey()).writeToParcel(parcel, i2);
            List list = (List) entry.getValue();
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((p) it.next()).writeToParcel(parcel, i2);
            }
        }
    }
}
