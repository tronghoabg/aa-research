package com.google.firebase.perf.e;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    private long f10413a;

    /* renamed from: b, reason: collision with root package name */
    private long f10414b;

    public m() {
        this(h(), g());
    }

    public static m e(long j2) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j2);
        return new m(h() + (micros - g()), micros);
    }

    private static long g() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    private static long h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public final long a() {
        return this.f10413a + b();
    }

    public final long b() {
        return c(new m());
    }

    public final long c(m mVar) {
        return mVar.f10414b - this.f10414b;
    }

    public final long d() {
        return this.f10413a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void f() {
        this.f10413a = h();
        this.f10414b = g();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f10413a);
        parcel.writeLong(this.f10414b);
    }

    m(long j2, long j3) {
        this.f10413a = j2;
        this.f10414b = j3;
    }
}
