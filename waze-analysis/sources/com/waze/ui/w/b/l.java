package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends com.waze.ui.w.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final bg f43702a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(bg bgVar) {
        super(null);
        h.g.b.x.f(bgVar, "reason");
        this.f43702a = bgVar;
    }

    public final bg d() {
        return this.f43702a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f43702a == ((l) obj).f43702a;
    }

    public final int hashCode() {
        return this.f43702a.hashCode();
    }

    public final String toString() {
        return "FlowCancelled(reason=" + this.f43702a + ")";
    }
}
