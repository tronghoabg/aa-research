package com.waze.asks;

import android.os.Parcel;
import android.os.Parcelable;
import com.waze.AlerterController$Alerter$Type;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class as implements Parcelable, av {
    public static final Parcelable.Creator<as> CREATOR = new com.google.android.gms.auth.a.b(17);

    /* renamed from: a, reason: collision with root package name */
    private final String f15521a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15522b;

    /* renamed from: c, reason: collision with root package name */
    private final aw f15523c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15524d;

    /* renamed from: e, reason: collision with root package name */
    private final e f15525e;

    /* renamed from: f, reason: collision with root package name */
    private final List f15526f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15527g;

    /* renamed from: h, reason: collision with root package name */
    private final AlerterController$Alerter$Type f15528h;

    /* renamed from: i, reason: collision with root package name */
    private final String f15529i;

    public as(String str, String str2, aw awVar, boolean z, e eVar, List list, int i2, AlerterController$Alerter$Type alerterController$Alerter$Type, String str3) {
        h.g.b.x.f(str, "questionKey");
        h.g.b.x.f(str2, "entityId");
        h.g.b.x.f(awVar, "source");
        h.g.b.x.f(eVar, "titleType");
        h.g.b.x.f(list, "answers");
        h.g.b.x.f(alerterController$Alerter$Type, "statsAlerterType");
        h.g.b.x.f(str3, "statsUgcContextId");
        this.f15521a = str;
        this.f15522b = str2;
        this.f15523c = awVar;
        this.f15524d = z;
        this.f15525e = eVar;
        this.f15526f = list;
        this.f15527g = i2;
        this.f15528h = alerterController$Alerter$Type;
        this.f15529i = str3;
    }

    public final int a() {
        return this.f15527g;
    }

    public final AlerterController$Alerter$Type b() {
        return this.f15528h;
    }

    public final e c() {
        return this.f15525e;
    }

    @Override // com.waze.asks.av
    public final aw d() {
        return this.f15523c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.waze.asks.av
    public final String e() {
        return this.f15522b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        return h.g.b.x.n(this.f15521a, asVar.f15521a) && h.g.b.x.n(this.f15522b, asVar.f15522b) && this.f15523c == asVar.f15523c && this.f15524d == asVar.f15524d && this.f15525e == asVar.f15525e && h.g.b.x.n(this.f15526f, asVar.f15526f) && this.f15527g == asVar.f15527g && this.f15528h == asVar.f15528h && h.g.b.x.n(this.f15529i, asVar.f15529i);
    }

    @Override // com.waze.asks.av
    public final String f() {
        return this.f15521a;
    }

    public final String g() {
        return this.f15529i;
    }

    public final List h() {
        return this.f15526f;
    }

    public final int hashCode() {
        return (((((((((((((((this.f15521a.hashCode() * 31) + this.f15522b.hashCode()) * 31) + this.f15523c.hashCode()) * 31) + a.a.a(this.f15524d)) * 31) + this.f15525e.hashCode()) * 31) + this.f15526f.hashCode()) * 31) + this.f15527g) * 31) + this.f15528h.hashCode()) * 31) + this.f15529i.hashCode();
    }

    public final boolean i() {
        return this.f15524d;
    }

    public final String toString() {
        return "EnrichAlertQuestion(questionKey=" + this.f15521a + ", entityId=" + this.f15522b + ", source=" + this.f15523c + ", isMock=" + this.f15524d + ", titleType=" + this.f15525e + ", answers=" + this.f15526f + ", statsAlertId=" + this.f15527g + ", statsAlerterType=" + this.f15528h + ", statsUgcContextId=" + this.f15529i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeString(this.f15521a);
        parcel.writeString(this.f15522b);
        parcel.writeString(this.f15523c.name());
        parcel.writeInt(this.f15524d ? 1 : 0);
        parcel.writeString(this.f15525e.name());
        List list = this.f15526f;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i2);
        }
        parcel.writeInt(this.f15527g);
        parcel.writeString(this.f15528h.name());
        parcel.writeString(this.f15529i);
    }
}
