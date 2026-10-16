package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ft {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31378a;

    public ft(boolean z) {
        this.f31378a = z;
    }

    public final boolean a() {
        return this.f31378a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ft) && this.f31378a == ((ft) obj).f31378a;
    }

    public final int hashCode() {
        return a.a.a(this.f31378a);
    }

    public final String toString() {
        return "EtaEVData(isEVETASearchEnabled=" + this.f31378a + ")";
    }
}
