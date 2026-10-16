package com.waze.br.b;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.br.a.i f17318a;

    /* renamed from: b, reason: collision with root package name */
    private final CompletableDeferred f17319b;

    public a(com.waze.br.a.i iVar, CompletableDeferred completableDeferred) {
        h.g.b.x.f(iVar, "action");
        h.g.b.x.f(completableDeferred, "completion");
        this.f17318a = iVar;
        this.f17319b = completableDeferred;
    }

    public final com.waze.br.a.i a() {
        return this.f17318a;
    }

    public final CompletableDeferred b() {
        return this.f17319b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f17318a, aVar.f17318a) && h.g.b.x.n(this.f17319b, aVar.f17319b);
    }

    public final int hashCode() {
        return (this.f17318a.hashCode() * 31) + this.f17319b.hashCode();
    }

    public final String toString() {
        return "PendingAction(action=" + this.f17318a + ", completion=" + this.f17319b + ")";
    }
}
