package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    private final String f10519a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f10520b;

    /* synthetic */ d(Parcel parcel) {
        this.f10519a = parcel.readString();
        this.f10520b = new AtomicLong(parcel.readLong());
    }

    final long a() {
        return this.f10520b.get();
    }

    final String b() {
        return this.f10519a;
    }

    public final void c(long j2) {
        this.f10520b.addAndGet(j2);
    }

    final void d(long j2) {
        this.f10520b.set(j2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f10519a);
        parcel.writeLong(this.f10520b.get());
    }

    public d(String str) {
        this.f10519a = str;
        this.f10520b = new AtomicLong(0L);
    }
}
