package com.waze.t.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.calendar.b f40637a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.waze.calendar.b bVar) {
        super(null);
        x.f(bVar, "userPrompt");
        this.f40637a = bVar;
    }

    public final com.waze.calendar.b a() {
        return this.f40637a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && x.n(this.f40637a, ((g) obj).f40637a);
    }

    public final int hashCode() {
        return this.f40637a.hashCode();
    }

    public final String toString() {
        return "UserInitiated(userPrompt=" + this.f40637a + ")";
    }
}
