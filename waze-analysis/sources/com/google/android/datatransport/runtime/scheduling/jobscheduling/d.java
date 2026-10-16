package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Collections;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final long f4314a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4315b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f4316c;

    /* synthetic */ d(long j2, long j3, Set set) {
        this.f4314a = j2;
        this.f4315b = j3;
        this.f4316c = set;
    }

    public static c a() {
        c cVar = new c();
        cVar.c(Collections.EMPTY_SET);
        return cVar;
    }

    final long b() {
        return this.f4314a;
    }

    final long c() {
        return this.f4315b;
    }

    final Set d() {
        return this.f4316c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f4314a == dVar.f4314a && this.f4315b == dVar.f4315b && this.f4316c.equals(dVar.f4316c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (int) this.f4314a;
        Set set = this.f4316c;
        return set.hashCode() ^ ((((i2 ^ 1000003) * 1000003) ^ ((int) this.f4315b)) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f4314a + ", maxAllowedDelay=" + this.f4315b + ", flags=" + String.valueOf(this.f4316c) + "}";
    }

    public d() {
        throw null;
    }
}
