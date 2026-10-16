package com.waze.ui.f;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab extends ak {

    /* renamed from: a, reason: collision with root package name */
    private final r f42274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(r rVar) {
        super(null);
        h.g.b.x.f(rVar, "error");
        this.f42274a = rVar;
    }

    public final r a() {
        return this.f42274a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab) && h.g.b.x.n(this.f42274a, ((ab) obj).f42274a);
    }

    public final int hashCode() {
        return this.f42274a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f42274a + ")";
    }
}
