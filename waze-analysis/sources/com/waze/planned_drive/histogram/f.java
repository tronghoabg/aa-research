package com.waze.planned_drive.histogram;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.n;
import com.waze.shared_infra.q.g;
import h.g.b.x;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new n(5);

    /* renamed from: a, reason: collision with root package name */
    private final List f33340a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33341b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33342c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33343d;

    public f(List list, long j2, long j3) {
        x.f(list, "graphValues");
        this.f33340a = list;
        this.f33341b = j2;
        this.f33342c = j3;
        Calendar calendarC = g.a().c();
        calendarC.setTimeInMillis(j2);
        this.f33343d = calendarC.get(11);
    }

    public final int a() {
        return this.f33343d;
    }

    public final long b() {
        return this.f33342c;
    }

    public final long c() {
        return this.f33341b;
    }

    public final List d() {
        return this.f33340a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f33340a, fVar.f33340a) && this.f33341b == fVar.f33341b && this.f33342c == fVar.f33342c;
    }

    public final int hashCode() {
        return (((this.f33340a.hashCode() * 31) + a.a.b(this.f33341b)) * 31) + a.a.b(this.f33342c);
    }

    public final String toString() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return "Model(eta:" + (this.f33342c / 60000) + ", depart:" + this.f33341b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        List list = this.f33340a;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeFloat(((Number) it.next()).floatValue());
        }
        parcel.writeLong(this.f33341b);
        parcel.writeLong(this.f33342c);
    }
}
