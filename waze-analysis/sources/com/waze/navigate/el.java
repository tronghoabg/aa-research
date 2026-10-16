package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class el implements em {

    /* renamed from: a, reason: collision with root package name */
    private final ek f31325a;

    public el(ek ekVar) {
        h.g.b.x.f(ekVar, "reason");
        this.f31325a = ekVar;
    }

    public final ek a() {
        return this.f31325a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el) && this.f31325a == ((el) obj).f31325a;
    }

    public final int hashCode() {
        return this.f31325a.hashCode();
    }

    public final String toString() {
        return "NotNavigating(reason=" + this.f31325a + ")";
    }
}
