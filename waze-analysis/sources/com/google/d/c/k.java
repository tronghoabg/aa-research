package com.google.d.c;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final long f7380a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7381b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7382c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7383d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7384e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7385f;

    public k() {
        com.google.d.b.an.l(true);
        com.google.d.b.an.l(true);
        com.google.d.b.an.l(true);
        com.google.d.b.an.l(true);
        com.google.d.b.an.l(true);
        com.google.d.b.an.l(true);
        this.f7380a = 0L;
        this.f7381b = 0L;
        this.f7382c = 0L;
        this.f7383d = 0L;
        this.f7384e = 0L;
        this.f7385f = 0L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        long j2 = kVar.f7380a;
        long j3 = kVar.f7381b;
        long j4 = kVar.f7382c;
        long j5 = kVar.f7383d;
        long j6 = kVar.f7384e;
        long j7 = kVar.f7385f;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(0L, 0L, 0L, 0L, 0L, 0L);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.c("hitCount", 0L);
        zVarH.c("missCount", 0L);
        zVarH.c("loadSuccessCount", 0L);
        zVarH.c("loadExceptionCount", 0L);
        zVarH.c("totalLoadTime", 0L);
        zVarH.c("evictionCount", 0L);
        return zVarH.toString();
    }
}
