package com.waze.shared_infra.coordinators;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends com.waze.settings.tree.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final h f37805a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar) {
        super(null);
        x.f(hVar, "reason");
        this.f37805a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f37805a == ((e) obj).f37805a;
    }

    public final h f() {
        return this.f37805a;
    }

    public final int hashCode() {
        return this.f37805a.hashCode();
    }

    public final String toString() {
        return "System(reason=" + this.f37805a + ")";
    }
}
