package com.waze.a.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.i f13592a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.waze.shared_infra.q.i iVar) {
        super(null);
        x.f(iVar, "birthdate");
        this.f13592a = iVar;
    }

    public final com.waze.shared_infra.q.i a() {
        return this.f13592a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && x.n(this.f13592a, ((h) obj).f13592a);
    }

    public final int hashCode() {
        return this.f13592a.hashCode();
    }

    public final String toString() {
        return "Ok(birthdate=" + this.f13592a + ")";
    }
}
