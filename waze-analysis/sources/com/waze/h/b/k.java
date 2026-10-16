package com.waze.h.b;

import com.waze.a.af;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k extends af {

    /* renamed from: a, reason: collision with root package name */
    private final j f24328a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar) {
        super(null);
        x.f(jVar, "reason");
        this.f24328a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f24328a == ((k) obj).f24328a;
    }

    public final int hashCode() {
        return this.f24328a.hashCode();
    }

    public final j p() {
        return this.f24328a;
    }

    public final String toString() {
        return "Cancel(reason=" + this.f24328a + ")";
    }
}
