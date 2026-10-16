package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cc extends cf {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.w.b.bg f34321a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(com.waze.ui.w.b.bg bgVar) {
        super(null);
        h.g.b.x.f(bgVar, "cancelReason");
        this.f34321a = bgVar;
    }

    public final com.waze.ui.w.b.bg a() {
        return this.f34321a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc) && this.f34321a == ((cc) obj).f34321a;
    }

    public final int hashCode() {
        return this.f34321a.hashCode();
    }

    public final String toString() {
        return "Cancel(cancelReason=" + this.f34321a + ")";
    }
}
