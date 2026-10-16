package com.waze.aq;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m extends com.waze.main_screen.p.a.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final k f15472a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar) {
        super(null, null);
        x.f(kVar, "failureReason");
        this.f15472a = kVar;
    }

    public final k a() {
        return this.f15472a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && x.n(this.f15472a, ((m) obj).f15472a);
    }

    public final int hashCode() {
        return this.f15472a.hashCode();
    }

    public final String toString() {
        return "Failure(failureReason=" + this.f15472a + ")";
    }
}
