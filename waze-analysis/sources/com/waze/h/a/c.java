package com.waze.h.a;

import com.waze.app_nav.hub.b.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends m {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f24309a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Throwable th) {
        super(null);
        x.f(th, "error");
        this.f24309a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f24309a, ((c) obj).f24309a);
    }

    public final int hashCode() {
        return this.f24309a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f24309a + ")";
    }
}
