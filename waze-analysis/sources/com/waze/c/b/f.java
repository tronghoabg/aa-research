package com.waze.c.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    private final e f18242a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar) {
        super(null);
        x.f(eVar, "reason");
        this.f18242a = eVar;
    }

    public final e a() {
        return this.f18242a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f18242a == ((f) obj).f18242a;
    }

    public final int hashCode() {
        return this.f18242a.hashCode();
    }

    public final String toString() {
        return "FailedLoading(reason=" + this.f18242a + ")";
    }
}
