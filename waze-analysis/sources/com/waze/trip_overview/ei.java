package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ei extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final String f41432a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(String str) {
        super(null);
        h.g.b.x.f(str, "tag");
        this.f41432a = str;
    }

    public final String a() {
        return this.f41432a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei) && h.g.b.x.n(this.f41432a, ((ei) obj).f41432a);
    }

    public final int hashCode() {
        return this.f41432a.hashCode();
    }

    public final String toString() {
        return "MapPolylineClicked(tag=" + this.f41432a + ")";
    }
}
