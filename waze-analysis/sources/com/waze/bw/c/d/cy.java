package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cy extends cz {

    /* renamed from: a, reason: collision with root package name */
    private final String f18078a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18079b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(String str, String str2) {
        super(null);
        h.g.b.x.f(str, "departureTimeText");
        h.g.b.x.f(str2, "arrivalTimeText");
        this.f18078a = str;
        this.f18079b = str2;
    }

    public final String a() {
        return this.f18079b;
    }

    public final String b() {
        return this.f18078a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy)) {
            return false;
        }
        cy cyVar = (cy) obj;
        return h.g.b.x.n(this.f18078a, cyVar.f18078a) && h.g.b.x.n(this.f18079b, cyVar.f18079b);
    }

    public final int hashCode() {
        return (this.f18078a.hashCode() * 31) + this.f18079b.hashCode();
    }

    public final String toString() {
        return "Upcoming(departureTimeText=" + this.f18078a + ", arrivalTimeText=" + this.f18079b + ")";
    }
}
