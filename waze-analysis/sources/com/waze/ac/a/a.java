package com.waze.ac.a;

import com.waze.messages.c;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final c f13827a;

    public a(c cVar) {
        x.f(cVar, "data");
        this.f13827a = cVar;
    }

    public final c a() {
        return this.f13827a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && x.n(this.f13827a, ((a) obj).f13827a);
    }

    public final int hashCode() {
        return this.f13827a.hashCode();
    }

    public final String toString() {
        return "EncouragementRequest(data=" + this.f13827a + ")";
    }
}
