package com.google.firebase.perf.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum k {
    TERABYTES(1099511627776L),
    GIGABYTES(1073741824),
    MEGABYTES(1048576),
    KILOBYTES(1024),
    BYTES(1);


    /* renamed from: f, reason: collision with root package name */
    final long f10412f;

    k(long j2) {
        this.f10412f = j2;
    }

    public final long a(long j2) {
        return (j2 * this.f10412f) / KILOBYTES.f10412f;
    }
}
