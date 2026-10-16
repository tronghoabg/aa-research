package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eh extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final String f41431a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(String str) {
        super(null);
        h.g.b.x.f(str, "tag");
        this.f41431a = str;
    }

    public final String a() {
        return this.f41431a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh) && h.g.b.x.n(this.f41431a, ((eh) obj).f41431a);
    }

    public final int hashCode() {
        return this.f41431a.hashCode();
    }

    public final String toString() {
        return "MapPinMarkerClicked(tag=" + this.f41431a + ")";
    }
}
