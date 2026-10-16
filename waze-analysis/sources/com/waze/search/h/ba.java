package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba extends bc {

    /* renamed from: a, reason: collision with root package name */
    private final ab f35814a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(ab abVar) {
        super(null);
        h.g.b.x.f(abVar, "action");
        this.f35814a = abVar;
    }

    public final ab a() {
        return this.f35814a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba) && h.g.b.x.n(this.f35814a, ((ba) obj).f35814a);
    }

    public final int hashCode() {
        return this.f35814a.hashCode();
    }

    public final String toString() {
        return "DestinationCellAction(action=" + this.f35814a + ")";
    }
}
