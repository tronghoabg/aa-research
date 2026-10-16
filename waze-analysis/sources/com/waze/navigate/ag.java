package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private final String f30987a;

    public ag(String str) {
        h.g.b.x.f(str, "str");
        this.f30987a = str;
    }

    public final String a() {
        return this.f30987a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag) && h.g.b.x.n(this.f30987a, ((ag) obj).f30987a);
    }

    public final int hashCode() {
        return this.f30987a.hashCode();
    }

    public final String toString() {
        return "ArrivalTimeState(str=" + this.f30987a + ")";
    }
}
