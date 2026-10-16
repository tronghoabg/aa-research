package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eo extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final al f41438a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(al alVar) {
        super(null);
        h.g.b.x.f(alVar, "dialogType");
        this.f41438a = alVar;
    }

    public final al a() {
        return this.f41438a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eo) && h.g.b.x.n(this.f41438a, ((eo) obj).f41438a);
    }

    public final int hashCode() {
        return this.f41438a.hashCode();
    }

    public final String toString() {
        return "RouteErrorDialogClosed(dialogType=" + this.f41438a + ")";
    }
}
