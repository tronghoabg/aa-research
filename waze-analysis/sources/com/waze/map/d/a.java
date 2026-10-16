package com.waze.map.d;

import android.content.res.Configuration;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Configuration f28725a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.gas.a f28726b;

    public a(Configuration configuration, com.waze.gas.a aVar) {
        x.f(configuration, "configuration");
        x.f(aVar, "renderable");
        this.f28725a = configuration;
        this.f28726b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f28725a, aVar.f28725a) && x.n(this.f28726b, aVar.f28726b);
    }

    public final int hashCode() {
        return (this.f28725a.hashCode() * 31) + this.f28726b.hashCode();
    }

    public final String toString() {
        return "CacheKey(configuration=" + this.f28725a + ", renderable=" + this.f28726b + ")";
    }
}
