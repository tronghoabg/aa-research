package com.google.android.datatransport.runtime.scheduling.a;

import com.google.android.datatransport.runtime.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final long f4247a;

    /* renamed from: b, reason: collision with root package name */
    private final x f4248b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.n f4249c;

    d(long j2, x xVar, com.google.android.datatransport.runtime.n nVar) {
        this.f4247a = j2;
        this.f4248b = xVar;
        this.f4249c = nVar;
    }

    public final long a() {
        return this.f4247a;
    }

    public final com.google.android.datatransport.runtime.n b() {
        return this.f4249c;
    }

    public final x c() {
        return this.f4248b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f4247a == dVar.f4247a && this.f4248b.equals(dVar.f4248b) && this.f4249c.equals(dVar.f4249c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f4247a;
        int iHashCode = ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f4248b.hashCode();
        return this.f4249c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        com.google.android.datatransport.runtime.n nVar = this.f4249c;
        return "PersistedEvent{id=" + this.f4247a + ", transportContext=" + this.f4248b.toString() + ", event=" + nVar.toString() + "}";
    }

    public d() {
        throw null;
    }
}
