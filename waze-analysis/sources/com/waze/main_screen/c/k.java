package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.j.a.h f26256a;

    public k(com.waze.main_screen.j.a.h hVar) {
        h.g.b.x.f(hVar, "googleAssistantButtonStateHolder");
        this.f26256a = hVar;
    }

    public final com.waze.main_screen.j.a.h b() {
        return this.f26256a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && h.g.b.x.n(this.f26256a, ((k) obj).f26256a);
    }

    public final int hashCode() {
        return this.f26256a.hashCode();
    }

    public final String toString() {
        return "Assistant(googleAssistantButtonStateHolder=" + this.f26256a + ")";
    }
}
