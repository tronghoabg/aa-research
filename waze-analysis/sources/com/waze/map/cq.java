package com.waze.map;

import com.waze.map.b.Cdo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cq {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f28686a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.b.ec f28687b;

    /* renamed from: c, reason: collision with root package name */
    private final Cdo f28688c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f28689d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28690e;

    /* renamed from: f, reason: collision with root package name */
    private final CompletableDeferred f28691f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.google_assistant.an f28692g;

    public cq(com.waze.map.b.ec ecVar, com.waze.google_assistant.an anVar, Cdo cdo, boolean z, int i2) {
        h.g.b.x.f(ecVar, "viewport");
        h.g.b.x.f(anVar, "fit");
        this.f28687b = ecVar;
        this.f28692g = anVar;
        this.f28688c = cdo;
        this.f28689d = z;
        this.f28690e = i2;
        this.f28691f = kotlinx.coroutines.bo.j();
    }

    public static /* synthetic */ cq g(cq cqVar, com.waze.google_assistant.an anVar) {
        com.waze.map.b.ec ecVar = cqVar.f28687b;
        h.g.b.x.f(ecVar, "viewport");
        h.g.b.x.f(anVar, "fit");
        return new cq(ecVar, anVar, cqVar.f28688c, cqVar.f28689d, cqVar.f28690e);
    }

    public final Cdo a() {
        return this.f28688c;
    }

    public final com.waze.map.b.ec b() {
        return this.f28687b;
    }

    public final CompletableDeferred c() {
        return this.f28691f;
    }

    public final boolean d() {
        return this.f28689d;
    }

    public final com.waze.google_assistant.an e() {
        return this.f28692g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj;
        return h.g.b.x.n(this.f28687b, cqVar.f28687b) && h.g.b.x.n(this.f28692g, cqVar.f28692g) && this.f28688c == cqVar.f28688c && this.f28689d == cqVar.f28689d && this.f28690e == cqVar.f28690e;
    }

    public final com.waze.google_assistant.an f() {
        return this.f28692g;
    }

    public final int hashCode() {
        int iHashCode = (this.f28687b.hashCode() * 31) + this.f28692g.hashCode();
        Cdo cdo = this.f28688c;
        return (((((iHashCode * 31) + (cdo == null ? 0 : cdo.hashCode())) * 31) + a.a.a(this.f28689d)) * 31) + this.f28690e;
    }

    public final String toString() {
        return "MapBoundsRequestForPresenter(viewport=" + this.f28687b + ", fit=" + this.f28692g + ", northLockBehavior=" + this.f28688c + ", animated=" + this.f28689d + ", requestId=" + this.f28690e + ")";
    }

    public /* synthetic */ cq(com.waze.map.b.ec ecVar, com.waze.google_assistant.an anVar, Cdo cdo, boolean z) {
        this(ecVar, anVar, cdo, z, f28686a.getAndIncrement());
    }
}
