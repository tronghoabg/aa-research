package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ez extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.uid.r f41450a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez(com.waze.uid.r rVar) {
        super(null);
        h.g.b.x.f(rVar, "buttonType");
        this.f41450a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ez) && h.g.b.x.n(this.f41450a, ((ez) obj).f41450a);
    }

    public final int hashCode() {
        return this.f41450a.hashCode();
    }

    public final String toString() {
        return "SecondaryButtonClicked(buttonType=" + this.f41450a + ")";
    }
}
