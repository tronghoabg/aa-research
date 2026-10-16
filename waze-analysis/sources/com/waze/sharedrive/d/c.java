package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.q f38239a;

    public c(com.waze.sharedrive.q qVar) {
        h.g.b.x.f(qVar, "error");
        this.f38239a = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.g.b.x.n(this.f38239a, ((c) obj).f38239a);
    }

    public final int hashCode() {
        return this.f38239a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f38239a + ")";
    }
}
