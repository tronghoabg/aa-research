package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends com.waze.ui.d.s {

    /* renamed from: a, reason: collision with root package name */
    private final bg f43710a;

    public t(bg bgVar) {
        super(null);
        this.f43710a = bgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f43710a == ((t) obj).f43710a;
    }

    public final int hashCode() {
        bg bgVar = this.f43710a;
        if (bgVar == null) {
            return 0;
        }
        return bgVar.hashCode();
    }

    public final bg l() {
        return this.f43710a;
    }

    public final String toString() {
        return "Cancelled(reason=" + this.f43710a + ")";
    }
}
