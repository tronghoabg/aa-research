package com.waze.coroutines;

import h.g.b.x;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f23172a;

    /* renamed from: b, reason: collision with root package name */
    private final ab f23173b;

    /* renamed from: c, reason: collision with root package name */
    private final long f23174c;

    /* renamed from: d, reason: collision with root package name */
    private final long f23175d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23176e;

    public /* synthetic */ c(Thread thread, ab abVar, long j2, long j3, int i2) {
        x.f(thread, "thread");
        x.f(abVar, "threadCoroutineDispatcher");
        this.f23172a = thread;
        this.f23173b = abVar;
        this.f23174c = j2;
        this.f23175d = j3;
        this.f23176e = i2;
    }

    public final int a() {
        return this.f23176e;
    }

    public final long b() {
        return this.f23174c;
    }

    public final long c() {
        return this.f23175d;
    }

    public final Thread d() {
        return this.f23172a;
    }

    public final ab e() {
        return this.f23173b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f23172a, cVar.f23172a) && x.n(this.f23173b, cVar.f23173b) && h.o.a.A(this.f23174c, cVar.f23174c) && h.o.a.A(this.f23175d, cVar.f23175d) && this.f23176e == cVar.f23176e;
    }

    public final int hashCode() {
        int iHashCode = (this.f23172a.hashCode() * 31) + this.f23173b.hashCode();
        h.o.c cVar = h.o.a.f48264a;
        return (((((iHashCode * 31) + a.a.b(this.f23174c)) * 31) + a.a.b(this.f23175d)) * 31) + this.f23176e;
    }

    public final String toString() {
        long j2 = this.f23175d;
        return "Parameters(thread=" + this.f23172a + ", threadCoroutineDispatcher=" + this.f23173b + ", detectionCycleDuration=" + h.o.a.y(this.f23174c) + ", initialDelay=" + h.o.a.y(j2) + ", blockedCyclesBeforeExit=" + this.f23176e + ")";
    }
}
