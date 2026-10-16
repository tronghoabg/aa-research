package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z extends com.waze.ui.d.s {

    /* renamed from: a, reason: collision with root package name */
    private final bj f43716a;

    public z(bj bjVar) {
        super(null);
        this.f43716a = bjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.f43716a == ((z) obj).f43716a;
    }

    public final int hashCode() {
        bj bjVar = this.f43716a;
        if (bjVar == null) {
            return 0;
        }
        return bjVar.hashCode();
    }

    public final bj l() {
        return this.f43716a;
    }

    public final String toString() {
        return "ReportedSuccessfully(type=" + this.f43716a + ")";
    }
}
