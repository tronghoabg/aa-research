package com.waze.t.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.calendar.b f40635a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.waze.calendar.b bVar) {
        super(null);
        x.f(bVar, "userPrompt");
        this.f40635a = bVar;
    }

    public final com.waze.calendar.b a() {
        return this.f40635a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x.n(this.f40635a, ((d) obj).f40635a);
    }

    public final int hashCode() {
        return this.f40635a.hashCode();
    }

    public final String toString() {
        return "Prompt(userPrompt=" + this.f40635a + ")";
    }
}
