package com.waze.sharedrive.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.q f38084a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.waze.sharedrive.q qVar) {
        super(null);
        h.g.b.x.f(qVar, "error");
        this.f38084a = qVar;
    }

    public final com.waze.sharedrive.q a() {
        return this.f38084a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.g.b.x.n(this.f38084a, ((c) obj).f38084a);
    }

    public final int hashCode() {
        return this.f38084a.hashCode();
    }

    public final String toString() {
        return "UpdateError(error=" + this.f38084a + ")";
    }
}
