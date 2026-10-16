package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f18345a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(null);
        h.g.b.x.f(str, "reason");
        this.f18345a = str;
    }

    public final String a() {
        return this.f18345a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.g.b.x.n(this.f18345a, ((c) obj).f18345a);
    }

    public final int hashCode() {
        return this.f18345a.hashCode();
    }

    public final String toString() {
        return "NotMeet(reason=" + this.f18345a + ")";
    }
}
