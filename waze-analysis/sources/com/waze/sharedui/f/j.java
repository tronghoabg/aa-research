package com.waze.sharedui.f;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.b f38911a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.waze.sharedui.b bVar) {
        super(null);
        x.f(bVar, "error");
        this.f38911a = bVar;
    }

    public final com.waze.sharedui.b a() {
        return this.f38911a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && x.n(this.f38911a, ((j) obj).f38911a);
    }

    public final int hashCode() {
        return this.f38911a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f38911a + ")";
    }
}
