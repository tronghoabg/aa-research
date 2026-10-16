package com.waze.map;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ck {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.ch f28679a;

    /* renamed from: b, reason: collision with root package name */
    private final CompletableDeferred f28680b;

    public ck(com.waze.map.b.ch chVar) {
        h.g.b.x.f(chVar, "configuration");
        this.f28679a = chVar;
        this.f28680b = kotlinx.coroutines.bo.j();
    }

    public final com.waze.map.b.ch a() {
        return this.f28679a;
    }

    public final CompletableDeferred b() {
        return this.f28680b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck) && h.g.b.x.n(this.f28679a, ((ck) obj).f28679a);
    }

    public final int hashCode() {
        return this.f28679a.hashCode();
    }

    public final String toString() {
        return "ConfigurationRequestForPresenter(configuration=" + this.f28679a + ")";
    }
}
