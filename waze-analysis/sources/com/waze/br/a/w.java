package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w implements x {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.calendar.b f17312a;

    public w(com.waze.calendar.b bVar) {
        h.g.b.x.f(bVar, "userPrompt");
        this.f17312a = bVar;
    }

    public final com.waze.calendar.b a() {
        return this.f17312a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && h.g.b.x.n(this.f17312a, ((w) obj).f17312a);
    }

    public final int hashCode() {
        return this.f17312a.hashCode();
    }

    public final String toString() {
        return "Prompt(userPrompt=" + this.f17312a + ")";
    }
}
