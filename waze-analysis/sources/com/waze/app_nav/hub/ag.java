package com.waze.app_nav.hub;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15247a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicLong f15248b = new AtomicLong(0);

    /* renamed from: c, reason: collision with root package name */
    private final long f15249c;

    public ag(long j2) {
        this.f15249c = j2;
    }

    public final long a() {
        return this.f15249c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag) && this.f15249c == ((ag) obj).f15249c;
    }

    public final int hashCode() {
        return a.a.b(this.f15249c);
    }

    public final String toString() {
        return "Id(" + this.f15249c + ")";
    }
}
