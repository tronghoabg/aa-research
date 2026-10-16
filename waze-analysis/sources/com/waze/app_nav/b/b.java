package com.waze.app_nav.b;

import android.os.Bundle;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f15192a;

    /* renamed from: b, reason: collision with root package name */
    private final a f15193b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f15194c;

    public b(long j2, a aVar, Bundle bundle) {
        x.f(aVar, "action");
        this.f15192a = j2;
        this.f15193b = aVar;
        this.f15194c = bundle;
    }

    public final long a() {
        return this.f15192a;
    }

    public final Bundle b() {
        return this.f15194c;
    }

    public final a c() {
        return this.f15193b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15192a == bVar.f15192a && this.f15193b == bVar.f15193b && x.n(this.f15194c, bVar.f15194c);
    }

    public final int hashCode() {
        int iB = (a.a.b(this.f15192a) * 31) + this.f15193b.hashCode();
        Bundle bundle = this.f15194c;
        return (iB * 31) + (bundle == null ? 0 : bundle.hashCode());
    }

    public final String toString() {
        return "WazeFeatureNavigationRequest(destinationId=" + this.f15192a + ", action=" + this.f15193b + ", result=" + this.f15194c + ")";
    }
}
