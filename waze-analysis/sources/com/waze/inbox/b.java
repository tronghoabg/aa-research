package com.waze.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new com.google.android.gms.common.w(4);

    /* renamed from: a, reason: collision with root package name */
    private final Map f24637a;

    public b(Map map) {
        h.g.b.x.f(map, "arguments");
        this.f24637a = map;
    }

    public final Map a() {
        return this.f24637a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && h.g.b.x.n(this.f24637a, ((b) obj).f24637a);
    }

    public final int hashCode() {
        return this.f24637a.hashCode();
    }

    public final String toString() {
        return "OpenChat(arguments=" + this.f24637a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        Map map = this.f24637a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
