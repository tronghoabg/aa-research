package com.waze.am;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f14309a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14310b;

    public b(a aVar, boolean z) {
        x.f(aVar, TypedValues.CycleType.S_WAVE_PHASE);
        this.f14309a = aVar;
        this.f14310b = z;
    }

    public static /* synthetic */ b c(b bVar, a aVar, int i2) {
        if ((i2 & 1) != 0) {
            aVar = bVar.f14309a;
        }
        boolean z = (i2 & 2) != 0 ? bVar.f14310b : false;
        x.f(aVar, TypedValues.CycleType.S_WAVE_PHASE);
        return new b(aVar, z);
    }

    public final a a() {
        return this.f14309a;
    }

    public final boolean b() {
        return this.f14310b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14309a == bVar.f14309a && this.f14310b == bVar.f14310b;
    }

    public final int hashCode() {
        return (this.f14309a.hashCode() * 31) + a.a.a(this.f14310b);
    }

    public final String toString() {
        return "InitState(phase=" + this.f14309a + ", offlineMode=" + this.f14310b + ")";
    }
}
