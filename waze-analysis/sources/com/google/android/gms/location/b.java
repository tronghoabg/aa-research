package com.google.android.gms.location;

import android.os.WorkSource;
import com.google.android.gms.common.api.internal.av;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f5676a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5677b;

    /* renamed from: c, reason: collision with root package name */
    private long f5678c = -1;

    public b(long j2) {
        this.f5676a = 102;
        av.d(j2 >= 0, "intervalMillis must be greater than or equal to 0");
        this.f5677b = j2;
        this.f5676a = 100;
    }

    public final LocationRequest a() {
        int i2 = this.f5676a;
        long j2 = this.f5678c;
        long j3 = this.f5677b;
        return new LocationRequest(i2, j3, Math.min(j2, j3), Math.max(0L, j3), Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, -1L, 0, 0, false, new WorkSource(null), null);
    }

    public final void b(long j2) {
        boolean z = true;
        if (j2 != -1 && j2 < 0) {
            z = false;
        }
        av.d(z, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
        this.f5678c = j2;
    }
}
