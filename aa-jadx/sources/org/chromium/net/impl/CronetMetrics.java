package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
@internal.org.jni_zero.JNINamespace("cronet")
public final class CronetMetrics extends org.chromium.net.RequestFinishedInfo.Metrics {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final boolean n;
    private final java.lang.Long o;
    private final java.lang.Long p;
    private final java.lang.Long q;
    private final java.lang.Long r;

    public CronetMetrics(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = z;
        this.q = java.lang.Long.valueOf(j14);
        this.r = java.lang.Long.valueOf(j15);
        if (j == -1 || j12 == -1) {
            this.o = null;
        } else {
            this.o = java.lang.Long.valueOf(j12 - j);
        }
        if (j == -1 || j13 == -1) {
            this.p = null;
        } else {
            this.p = java.lang.Long.valueOf(j13 - j);
        }
    }

    private static java.util.Date a(long j) {
        if (j == -1) {
            return null;
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MICROSECONDS;
        return new java.util.Date(j / 1000);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getConnectEnd() {
        return a(this.e);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getConnectStart() {
        return a(this.d);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getDnsEnd() {
        return a(this.c);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getDnsStart() {
        return a(this.b);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getPushEnd() {
        return a(this.k);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getPushStart() {
        return a(this.j);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.lang.Long getReceivedByteCount() {
        return this.r;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getRequestEnd() {
        return a(this.m);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getRequestStart() {
        return a(this.a);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getResponseStart() {
        return a(this.l);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getSendingEnd() {
        return a(this.i);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getSendingStart() {
        return a(this.h);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.lang.Long getSentByteCount() {
        return this.q;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final boolean getSocketReused() {
        return this.n;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getSslEnd() {
        return a(this.g);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.util.Date getSslStart() {
        return a(this.f);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.lang.Long getTotalTimeMs() {
        java.lang.Long l = this.p;
        if (l == null) {
            return null;
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MICROSECONDS;
        return java.lang.Long.valueOf(l.longValue() / 1000);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final java.lang.Long getTtfbMs() {
        java.lang.Long l = this.o;
        if (l == null) {
            return null;
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MICROSECONDS;
        return java.lang.Long.valueOf(l.longValue() / 1000);
    }
}
