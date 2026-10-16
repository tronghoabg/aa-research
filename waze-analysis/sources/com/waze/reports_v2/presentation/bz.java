package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bz extends cg {

    /* renamed from: a, reason: collision with root package name */
    private final ch f34929a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz(ch chVar) {
        super(null);
        h.g.b.x.f(chVar, "error");
        this.f34929a = chVar;
    }

    public final ch a() {
        return this.f34929a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz) && this.f34929a == ((bz) obj).f34929a;
    }

    public final int hashCode() {
        return this.f34929a.hashCode();
    }

    public final String toString() {
        return "CloseFlowWithError(error=" + this.f34929a + ")";
    }
}
