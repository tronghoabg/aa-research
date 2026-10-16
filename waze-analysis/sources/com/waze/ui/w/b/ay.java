package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ay extends com.waze.ui.j.h {

    /* renamed from: a, reason: collision with root package name */
    private final ac f43624a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(ac acVar) {
        super(null);
        h.g.b.x.f(acVar, "state");
        this.f43624a = acVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay) && h.g.b.x.n(this.f43624a, ((ay) obj).f43624a);
    }

    public final int hashCode() {
        return this.f43624a.hashCode();
    }

    public final ac k() {
        return this.f43624a;
    }

    public final String toString() {
        return "OnBoarding(state=" + this.f43624a + ")";
    }
}
