package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c extends com.waze.ae.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f29934a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(null);
        h.g.b.x.f(str, "streetName");
        this.f29934a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.g.b.x.n(this.f29934a, ((c) obj).f29934a);
    }

    public final int hashCode() {
        return this.f29934a.hashCode();
    }

    public final String i() {
        return this.f29934a;
    }

    public final String toString() {
        return "Street(streetName=" + this.f29934a + ")";
    }
}
